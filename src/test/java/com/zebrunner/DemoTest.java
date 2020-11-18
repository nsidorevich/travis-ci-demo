package com.zebrunner;

import com.zebrunner.agent.core.annotation.Maintainer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Maintainer("admin")
public class DemoTest {

    @Test
    @DisplayName("First")
    public void firstTest() {
        assertTrue(Boolean.TRUE);
    }

    @Test
    @Maintainer("anonymous")
    public void secondTest() {
        assertTrue(Boolean.TRUE);
    }

    @Test
    @DisplayName("Third")
    public void thirdTest() {
        assertTrue(Boolean.FALSE);
    }

}
