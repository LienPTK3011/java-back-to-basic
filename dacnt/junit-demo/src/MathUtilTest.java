import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MathUtilTest {
	
	@Before
	public void before() {
		System.out.println("before test");
	}
	
	@Test
    public void testCong() {
        final int expected = 12;
 
        final int actual = MathUtil.cong(10, 2);

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testTru() {
    	final int expected = 8;
    	
    	final int actual = MathUtil.tru(10, 2);
    	
    	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNhan() {
    	final int expected = 20;
    	
    	final int actual = MathUtil.nhan(10, 2);
    	
    	Assert.assertEquals(expected, actual);
    }
    
    @Ignore
    @Test
    public void testChia() {
    	final int expected = 5;
    	
    	final int actual = MathUtil.nhan(10, 2);
    	
    	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNull() {
    	final Object object = null;
    	
    	Assert.assertNull(object);
    }
    
    @Test
    public void testNotNull() {
    	final Object object = null;
    	
    	Assert.assertNotNull(object);
    }
    
    @After
    public void after() {
    	System.out.println("after test");
    }
    
} 