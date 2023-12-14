package com.example.promotionbackend.event.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JsonMapper {

    private static ObjectMapper objectMapper = new ObjectMapper();


    private JsonMapper() {}

    public static void convertMaptoString(Map map) throws JsonProcessingException {
        String parseMap = objectMapper.writeValueAsString(map);

    }
}
