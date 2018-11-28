package com.fr.investimentos.model;

import com.fr.investimentos.enterprise.Constants;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
@Getter
public enum Score implements CalculoScore {

    PRECO_LUCRO(10.0),
    LUCRO_LIQUIDO(9.0),
    YELD(7d),
    SETOR(9d),
    DESCONTO(8d);

    private Double score;

    @Override
    public Double calculo(Double value) {
        return Optional.ofNullable(value)
                .map(item -> item * score)
                .orElse(Constants.ZERO);
    }
}
