package com.fr.investimentos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class AnaliseAtivo {

    @NotNull(message = "O preço teto deve ser informado")
    @Field("precoTeto")
    private Double precoTeto;

}
