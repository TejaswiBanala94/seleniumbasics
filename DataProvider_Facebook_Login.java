package dataproviderannotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Facebook_Login
{
	@Test(dataProvider = "data1")
	public void testcase1(String username,String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("email"));
		e1.sendKeys(username);
		WebElement e2 = driver.findElement(By.id("pass"));
		e2.sendKeys(password);
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		Thread.sleep(2000);
	}
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		Object data[][]= new Object[2][2];
		//1st set of data 
		data[0][0]="banalatejaswi555@gmail.com"; //right data
		data[0][1]="btechfriends";                  //right data
		//2nd set of data
		data[1][0]="tejaswi@gmail.com"; //wrong data
		data[1][1]="tejaswi";           //wrong data
		return data;	
	}

}
