package testngprograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BS_BM_Test_AM_AS_184 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before Suite");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("After Suite");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After method");
	}
	@Test
	public void testcase1()
	{
		System.out.println("Testcase1");
	}
	

}
