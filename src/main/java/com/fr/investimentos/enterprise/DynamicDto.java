package com.fr.investimentos.enterprise;

import java.util.Map;

public class DynamicDto {

    private Map<String, Object> dto;

    public static DynamicDto of() {
        return new DynamicDto();
    }

    public DynamicDto with(String key, Object value) {
        dto.put(key, value);
        return this;
    }

}
