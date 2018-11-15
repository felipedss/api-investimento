package com.fr.investimentos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoOperacao {

    COMPRA("Compra"),
    VENDA("Venda"),
    DESDOBRAMENTO("Desdobramento"),
    DIVIDENDOS("Dividendos"),
    JUROS_SOBRE_CAPITAL("Juros sobre capital"),
    BONUS("Bônus");

    private String descricao;

}
