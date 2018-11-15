package com.fr.investimentos.enterprise;

import lombok.Builder;
import lombok.Getter;

import java.util.Collection;

@Getter
@Builder
public class ApiError {

    private String message;

    private Collection<String> messages;

}
