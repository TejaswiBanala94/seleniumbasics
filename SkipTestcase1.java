package skiptestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipTestcase1 
{
	@Test
	public void login()
	{
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}

}
