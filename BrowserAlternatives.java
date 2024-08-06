package testngprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserAlternatives
{
	static WebDriver driver;

	public static void main(String[] args)
	{
		if(1==1)
		{
		driver = new ChromeDriver();
		}
		if(2==2)
		{
			driver = new EdgeDriver();
		}
	}

}
