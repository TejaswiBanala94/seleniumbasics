package assertionintestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_Assertion_DataProviderAnnotation
{
	WebDriver driver;
	@Test(dataProvider = "data1")
	public void testcase1(String username,String password) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("email"));
		e1.sendKeys(username);
		WebElement e2 = driver.findElement(By.id("pass"));
		e2.sendKeys(password);
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		Thread.sleep(2000);
		//Assert.assertEquals(driver.getTitle(), "(20+) Facebook", "Sorry the testcase is failed");
		//with title,logout isEnabled
		//Assert.assertEquals(driver.getTitle(), "Log into Facebook", "Sorry the testcase is failed");
		//with title
		
		WebElement forgotpass = driver.findElement(By.xpath("//span[.='Forgot Password?']"));
		Assert.assertEquals(forgotpass.isDisplayed(), true, "sorry testcase is failed");
	
//		WebElement finduraccountandLogin = driver.findElement(By.linkText("Find your account and log in."));
//		Assert.assertEquals(finduraccountandLogin.isDisplayed(), true, "sorry testcase is failed");
//		
		
	}
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		Object data[][]= new Object[1][2];
//		//1st set of data 
//		data[0][0]="banalatejaswi555@gmail.com"; //right data
//		data[0][1]="btechfriends";                  //right data
//		
		//2nd set of data
		data[0][0]="banalatejaswi555@gmail.com"; //wrong data
		data[0][1]="tejaswi";           //wrong data
		
		
//		//3rd set of data
//		data[2][0]="banalatejaswi555@gmail.com"; //right data
//		data[2][1]="tejaswi";           //wrong data
//		//4th set of data
//		data[3][0]="banalateja@gmail.com"; //right data
//		data[3][1]="btechfrinds";           //wrong data
//		//5th set of data
//		data[4][0]="";          //blank data
//		data[4][1]="";           //blank data
//		
		return data;	
	}


}
