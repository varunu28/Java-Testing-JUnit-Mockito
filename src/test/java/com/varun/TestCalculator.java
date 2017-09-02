package com.varun;

import static org.mockito.Mockito.*;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class TestCalculator {

    CalculatorService service = mock(CalculatorService.class);

    Calculator c = new Calculator(service);

    // Below case would pass
    @Test
    public void testPerform() {

        when(service.add(2,3)).thenReturn(5);
        assertEquals(10, c.perform(2,3));
        verify(service).add(2,3);                 // Verifies the call to mock service

    }
}