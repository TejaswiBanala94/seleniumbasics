package testngprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations_183
{
	@Test
	public void testcase()
	{
		System.out.println("Testcase 1");
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("After suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void at()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("After class");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("After method");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}
	

}
