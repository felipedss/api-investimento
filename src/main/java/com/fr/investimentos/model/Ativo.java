package com.fr.investimentos.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.util.Collection;

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

    @Field("score")
    private Double score;

    @Field("setor")
    private Setor setor;

}
