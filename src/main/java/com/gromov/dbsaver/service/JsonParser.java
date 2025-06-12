package com.gromov.dbsaver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JsonParser {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public <T> List<T> parseJson(String message) {
        try {
            return objectMapper.readValue(message, new TypeReference<List<T>>() {});
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
