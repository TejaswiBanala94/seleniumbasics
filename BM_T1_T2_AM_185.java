package testngprograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BM_T1_T2_AM_185 
{
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}
	@Test
	public void testcase1()
	{
		System.out.println("Testcase1");
	}
	@AfterMethod
	public void as()
	{
		System.out.println("After method");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Testcase2");
	}

}
