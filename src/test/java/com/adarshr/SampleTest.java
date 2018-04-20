package com.adarshr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    @DisplayName("this test should pass")
    public void thisTestShouldPass() {
        Assertions.assertEquals(1, 1);
    }
}
