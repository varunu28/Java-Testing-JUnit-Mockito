package com.varun;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class TestCalculator {

    Calculator c = new Calculator();

    // Below case would pass
    @Test
    public void testAdd() {

        assertEquals(5, c.add(2,3));
    }

    // Below case would Fail
    @Test
    public void testIncorrectAdd() {

        assertEquals(5,c.incorrectAdd(2,3));
    }
}