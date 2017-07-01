package net.qcollins;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class FindUniqueTest {
    private double precision = 0.0000000000001;
    
    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindUnique.findUnique(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUnique.findUnique(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(0.0, FindUnique.findUnique(new double[]{0, 1, 1, 1, 1, 1}), precision);
    }
}