package com.github.hcsp.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void numberEqualsTest() {
        System.out.println("===================");
        Assertions.assertEquals(true, Main.numberEquals("1234", "1234"));
        Assertions.assertEquals(true, Main.numberEquals("1234", "+1234"));
        Assertions.assertEquals(false, Main.numberEquals("1234", "-1234"));
    }
}
