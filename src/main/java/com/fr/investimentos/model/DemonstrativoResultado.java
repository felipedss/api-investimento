package com.fr.investimentos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class DemonstrativoResultado {

    @NotNull
    @Field("periodoResultado")
    private PeriodoResultado periodoResultado;

    @Field("descricao")
    private String descricao;

    @Field("lucroLiquido")
    private Double lucroLiquido;

}
