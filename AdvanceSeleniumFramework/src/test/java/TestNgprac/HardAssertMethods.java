package TestNgprac;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertMethods {
      
	@Test
	public void m1()
    {
	    int a=10;
	    int b=20;
	    Assert.assertEquals(a,b);
    
    }
	@Test
	public void m2()
    {
	    int exp=10;
	    int act=10;
	    Assert.assertEquals(act,exp,"Not Equal");
	    System.out.println("Equal Values");
    
    }
	
	@Test
	public void m3()
    {
	    int exp=10;
	    int act=10;
	    Assert.assertNotEquals(act, exp,"it is equal");;
	    System.out.println("not equal Values");
    
    }
	@Test
	public void m4()
    {
	    String s="Hello";
	    Assert.assertTrue(s.contains("is"),"False");
	    System.out.println("True");
    
    }
	@Test
	public void m5()
    {
	    String s="Hello";
	    String ss="Hello";
	    Assert.assertTrue(s.equalsIgnoreCase(ss), "False");
	    System.out.println("Assert Pass");
    
    }
	@Test
	public void m6()
    {
		int exp=10;
	    int act=0;
	    Assert.assertSame(act, exp, "Not Same");
	    System.out.println("Same");
    
    }
	@Test
	public void m7()
    {
		String s=null;
	    Assert.assertNull(s,"Not Null");
	    System.out.println("It is Null");
    
    }
	@Test
	public void m8()
    {
		String s=null;
//	    Assert.assertNull(s,"Not Null");
//	    System.out.println("It is Null");
    
	    Assert.fail("I m failing");
    }
	
	
}
