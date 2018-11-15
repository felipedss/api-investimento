package com.fr.investimentos.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
public abstract class Operacao {

    @Id
    private String id;

    @NotNull(message = "O ativo deve ser informado")
    @Field("ativo")
    private String ativo;

    @NotNull(message = "O tipo de operação deve ser informado")
    @Field("tipoOperacao")
    private TipoOperacao tipoOperacao;

    @NotNull(message = "O tipo do ativo deve ser informado")
    @Field("tipoAtivo")
    private TipoAtivo tipoAtivo;

    @NotNull(message = "A data da operação deve ser informada")
    @Field("data")
    private LocalDate data;

    @Field("instituicaoFinanceira")
    private String instituicaoFinanceira;

    @Field("observacao")
    private String observacao;

}
