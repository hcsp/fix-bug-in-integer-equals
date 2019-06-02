package com.github.hcsp.datatype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void numberEqualsTest() {
        assertEquals(true, Main.numberEquals("1234", "1234"));
        assertEquals(true, Main.numberEquals("1234", "+1234"));
        assertEquals(false, Main.numberEquals("1234", "-1234"));
    }
}
