package test.suite;

import org.junit.Assert;
import org.junit.Test;

public class test1 {
	
	@Test
	public void test() {
		final int expected = 10;
		
		final int actual = sum(5, 5);
		
		Assert.assertEquals(expected, actual);
	}
	
	public int sum(int a, int b) {
		return (a + b);
	}
	
}
