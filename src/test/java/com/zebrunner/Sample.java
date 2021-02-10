package com.zebrunner;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample {

    @Test
    public void test() {
        Map<String, String> envVars = System.getenv();
        envVars.forEach((key, value) -> System.out.println(key + ": " + value));
        assertEquals(true, true);
    }

}
