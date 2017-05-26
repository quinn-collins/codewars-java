package net.qcollins;

import org.junit.Test;
import org.junit.Assert;


public class FindTheMissingLetterTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals('e', FindTheMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
    
    }
    @Test
    public void upper_case() {
        Assert.assertEquals('P', FindTheMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));	
    }
}