package com.zebrunner;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample {

    @Test
    public void test() {
        Map<String, String> envVars = System.getenv();
        envVars.entrySet()
               .stream()
               .sorted()
               .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        assertEquals(true, true);
    }

}
