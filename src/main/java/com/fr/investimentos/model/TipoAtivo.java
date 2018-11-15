package com.fr.investimentos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoAtivo {

    ACOES("Ações"),
    FIIS("Fundos Imobiliários"),
    TESOURO_DIRETO("Tesouro direto");

    private String descricao;
}
