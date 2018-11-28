package com.fr.investimentos.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Setor {

    BANCO("Bancos", 10),
    ELETRICA("Energia Elétrica", 10),
    SOFTWARE("Software", 8),
    SEGUROS("Software", 9),;

    private String descricao;
    private Integer score;

}
