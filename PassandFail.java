package assertionintestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PassandFail
{
	@Test
	public void testcase1()
	{
		Assert.assertEquals(false, false);
		Assert.assertEquals(false, true);
		Assert.assertEquals(true, false);
		Assert.assertEquals(false, true, "Sorry but please try again");
	}

}
