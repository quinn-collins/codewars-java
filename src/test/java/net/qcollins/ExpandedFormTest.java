package net.qcollins;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class ExpandedFormTest {
    @Test
    public void testSomething() {
    	assertEquals("900", ExpandedForm.expandedForm(900));
    	assertEquals("300000 + 70000 + 20 + 2", ExpandedForm.expandedForm(370022));
        assertEquals("70000 + 300 + 4", ExpandedForm.expandedForm(70304)); 
        assertEquals("10 + 2", ExpandedForm.expandedForm(12)); 
        assertEquals("40 + 2", ExpandedForm.expandedForm(42));
     }
}