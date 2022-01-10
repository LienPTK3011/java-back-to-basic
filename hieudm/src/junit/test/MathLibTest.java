package junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathLibTest {

	static MathLib fixture;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before all class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After all class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before run test");
		fixture = new MathLib();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After run test");
		fixture = null;
	}

	@Test
	public void testAdd() {
		System.out.println("test add method");
		assertEquals(11, fixture.add(5, 6));
		assertEquals(20, fixture.add(5, 15));
	}

	@Test
	public void testSub() {
		System.out.println("test sub method");
		assertEquals(-5, fixture.sub(1, 6));
		assertEquals(9, fixture.sub(15, 6));
	}
	
}
