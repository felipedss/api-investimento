package com.fr.investimentos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Setor {

    BANCO("Bancos", 10.0),
    ELETRICA("Energia Elétrica", 10.0),
    SOFTWARE("Software", 8.0),
    SEGUROS("Software", 9.0),;

    private String descricao;
    private Double score;

}
