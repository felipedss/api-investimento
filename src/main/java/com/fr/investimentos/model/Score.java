package com.fr.investimentos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Score {

    PRECO_LUCRO(10.0),
    LUCRO_LIQUIDO(9.0),
    YELD(8d),
    SETOR(9d);

    private Double score;

    public Double getCalculo(Double value) {
        if (value == null) {
            return 0d;
        }
        return value * getScore();
    }

}
