package com.fr.investimentos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PeriodoResultado {

    ULTIMOS_12_MESES("Últimos 12 meses"),
    ULTIMOS_3_MESES("Últimos 3 meses");

    private String descricao;

}
