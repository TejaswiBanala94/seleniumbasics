package dataproviderannotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Of_Google_with_10_Testcases
{
	@Test(dataProvider="data1")
	public void testcase1(String input) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(input+Keys.ENTER);
		Thread.sleep(2000);
		Reporter.log("Data is "+input);
	}
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{"India"},{"Modi"},{"Grotechminds"},{"Ananth Ambani"},{"Microsoft company"},{"Worldcup 2024"},{"Java interview quistions"},{"Israel war"},{"Germany currency"},{"Current time in Nigeria"}};
		
	}

}
