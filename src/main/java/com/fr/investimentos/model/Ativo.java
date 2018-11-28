package com.fr.investimentos.model;

import com.fr.investimentos.enterprise.Constants;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Optional;

import static com.fr.investimentos.model.Score.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ativos")
public class Ativo {

    @Id
    private String id;

    @NotNull(message = "A sigla deve ser informada")
    @Field("sigla")
    private String sigla;

    @Field("analiseAtivo")
    private AnaliseAtivo analiseAtivo;

    @Field("indicadores")
    private Indicador indicador;

    @Field("demonstrativoResultados")
    private Collection<DemonstrativoResultado> demonstrativoResultados;

    @Field("setor")
    private Setor setor;

    public Double getDescontoAtivo() {
        if (indicador == null || analiseAtivo == null || indicador.getPrecoAtual() > analiseAtivo.getPrecoTeto()) {
            return Constants.ZERO;
        }
        return (indicador.getPrecoAtual() * Constants.HUNDRED) / analiseAtivo.getPrecoTeto();
    }

    //TODO Revisar isso
    public Double getScore() {

        Double score = Optional.ofNullable(indicador)
                .map(item -> YELD.calculo(item.getDividendYeld()) + PRECO_LUCRO.calculo(indicador.getScorePrecoLucro()))
                .orElse(Constants.ZERO);

        score += Optional.ofNullable(setor)
                .map(item -> SETOR.calculo(item.getScore()))
                .orElse(Constants.ZERO);

        score += demonstrativoResultados.stream()
                .filter(periodo -> PeriodoResultado.ULTIMOS_3_MESES.equals(periodo.getPeriodoResultado()))
                .map(DemonstrativoResultado::getLucroLiquido)
                .findFirst()
                .orElse(Constants.ZERO);

        score += DESCONTO.calculo(getDescontoAtivo());

        return score;
    }

}
