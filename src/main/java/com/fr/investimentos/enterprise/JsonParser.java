package com.fr.investimentos.enterprise;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;

public final class JsonParser {

    private JsonNode node;
    private final ObjectMapper mapper;

    private JsonParser(ObjectMapper mapper, JsonNode node) {
        this.mapper = mapper;
        this.node = node;
    }

    private JsonParser(ObjectMapper mapper, Object object) {
        this.mapper = mapper;
        this.node = convertValue(object, JsonNode.class);
    }

    public static JsonParser of(JsonNode node, ObjectMapper mapper) {
        return new JsonParser(mapper, node);
    }

    public static JsonParser of(ObjectMapper mapper,Object object) {
        return new JsonParser(mapper, object);
    }

    private <T> T convertValue(Object content, Class<T> valueType) {
        try {
            return mapper.convertValue(content, valueType);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao ler o valor do conteúdo");
        }
    }

    private JsonNode getNode(String fieldName) {
        return node.get(fieldName);
    }

    public JsonParser with(String fieldName) {
        node = getNode(fieldName);
        return this;
    }

    public Iterator<JsonNode> withList(String fieldName) {

        node = getNode(fieldName);

        return Optional.ofNullable(node)
                .map(JsonNode::elements)
                .orElse(Collections.emptyIterator());
    }

}
