package com.zebrunner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample {

    @Test
    public void test() {
        System.getenv().entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        assertEquals(true, true);
    }

}
