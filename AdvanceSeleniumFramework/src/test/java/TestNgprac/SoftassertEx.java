package TestNgprac;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftassertEx {

	@Test
	public void m1()
    {
	    int a=10;
	    int b=20;
	    SoftAssert soft = new SoftAssert();
	    soft.assertEquals(a,b,"Failed");
	    System.out.println("Assert is pass");
	    soft.assertAll();
    
    }
	
	
	
	
}
