package ru.clevertec.sokalau;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {

    @Test
    public void isAllPositiveNumbersTrue() {
        assertTrue(Utils.isAllPositiveNumbers("19","1"));
    }

    @Test
    public void isAllPositiveNumbersFalse() {
        assertFalse(Utils.isAllPositiveNumbers("-19","0"));
    }

}


