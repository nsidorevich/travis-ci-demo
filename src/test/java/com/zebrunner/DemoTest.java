package com.zebrunner;

import com.zebrunner.agent.core.annotation.JiraReference;
import com.zebrunner.agent.core.annotation.Maintainer;
import com.zebrunner.agent.core.annotation.Priority;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.agent.core.registrar.Label;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Maintainer("admin")
public class DemoTest {

    @Test
    @Disabled
    @DisplayName("First")
    public void firstTest() {
        assertTrue(Boolean.TRUE);
    }

    @Test
    @TestLabel(name = "framework", value = "junit5")
    @Maintainer("anonymous")
    public void secondTest() {
        Label.attach("attached-via", "test-body");
        assertTrue(Boolean.TRUE);
    }

    @Test
    @DisplayName("Third")
    @Priority(Priority.P4)
    @JiraReference("ZEB-0001")
    public void thirdTest() {
        assertTrue(Boolean.FALSE);
    }

}
