package com.zebrunner;

import com.zebrunner.agent.core.annotation.Maintainer;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.agent.core.registrar.Label;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Maintainer("admin")
public class DemoTest {

    private static final Logger log = LoggerFactory.getLogger(DemoTest.class);

    @Test
    @DisplayName("First")
    public void firstTest() {
        System.out.println("TEEEEEEEST");
        for (int i = 0; i < 10; i++) {
            log.info("Here goes my log record captured at {}", System.currentTimeMillis());
        }
//        waitHooks();
        assertTrue(Boolean.TRUE);
    }

    @Test
    @TestLabel(name = "framework", value = "junit5")
    @Maintainer("anonymous")
    public void secondTest() {
        log.warn("I feel warned at this point.");
        Label.attach("attached-via", "test-body");
//        waitHooks();
        assertTrue(Boolean.TRUE);
    }

    private void waitHooks() {
        try {
            Thread.sleep(2000); // workaround for shutdown hooks issue
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
