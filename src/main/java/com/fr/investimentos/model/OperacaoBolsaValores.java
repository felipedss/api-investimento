package com.fr.investimentos.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Document(collection = "operacoesBolsaValores")
public class OperacaoBolsaValores extends Operacao {

    @NotNull(message = "A quantidade deve ser informada")
    @Field("quantidade")
    private Long quantidade;

    @NotNull(message = "O valor unitário deve ser informado")
    @Field("valorUnitario")
    private BigDecimal valorUnitario;

    @NotNull(message = "A taxa de corretagem deve ser informada")
    @Field("taxaCorretagem")
    private BigDecimal taxaCorretagem;


}
