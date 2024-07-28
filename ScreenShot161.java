package seleniumbasicpages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot161 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		for(int i=0;i<5;i++)
		{
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\banal\\OneDrive\\Desktop\\screenshots\\teju.png");
		File destination = new File("C:\\Users\\banal\\OneDrive\\Desktop\\screenshots\\teju"+Math.random()+".png");
		Thread.sleep(2000);
		FileHandler.copy(source, destination);
		}

	}

}
