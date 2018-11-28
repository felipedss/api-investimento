package com.fr.investimentos.model;

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

}
