package dataproviderannotation;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation 
{
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{17},{25},{75}};
		
	}
	@DataProvider(name="data2")
	public Object[][] method2()
	{
		return new Object[][] {{"Ram"},{"Sita"},{"Lakshman"},{"Shiva"}};
		
	}
	@Test(dataProvider="data2")
	public void tastcase1(String name)
	{
		Reporter.log("Data is "+name);
	}
	

}
