package TestNgprac;

import org.testng.annotations.Test;



public class SampleTest {
	@Test(priority=1,invocationCount = 2)
	public void createContact()
	{
		System.out.println("contact created");
	}
	@Test(enabled= false)
	public void modifyContact()
	{
		System.out.println("contact modified");
	}
	@Test(dependsOnMethods = "createContact")
	public void deleteContact()
	{
		System.out.println("contact deleted");
	}

}
