package com.fr.investimentos.model;

import com.fr.investimentos.enterprise.Constants;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Indicador {

    @Field("precoAtual")
    private Double precoAtual;

    @Field("dividendYeld")
    private Double dividendYeld;

    @Field("precoLucro")
    private Double precoLucro;

    @Field("payout")
    private Double payout;

    public Double getScorePrecoLucro() {
        return Constants.HUNDRED - precoLucro;
    }


}
