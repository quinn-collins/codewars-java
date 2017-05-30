package net.qcollins;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class StringCalulatorTest {
	StringCalculator calc;
	String numbers;
	@Before
	public void setup() {
		calc = new StringCalculator();
	}
	
	@Test
	public void one_and_one_make_two() {
		numbers = "1,1";
		Assert.assertEquals(2, calc.add(numbers));
	}
	
	@Test
	public void one_and_one_plus_space_make_two() {
		numbers = "1, 1";
		Assert.assertEquals(2, calc.add(numbers));
	}
}
