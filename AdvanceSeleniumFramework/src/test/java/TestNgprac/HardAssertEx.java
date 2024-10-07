package TestNgprac;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
@Test

	public void m1()
	{
		String expData="Qspiders";
		String actData="Qspiders";
		Assert.assertEquals(actData, expData);
		System.out.println("gud evg");
	}
@Test
 public void m2()
 {
	 System.out.println("Hello");
 }
}
