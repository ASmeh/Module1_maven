package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        User user = new User("Oleksii","Samoliuk");
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("JSON:" + objectMapper.writeValueAsString(user));
    }
}