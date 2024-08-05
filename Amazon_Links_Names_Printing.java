package linksPrinting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Links_Names_Printing {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement e1= links.get(i);
			System.out.println(e1.getAttribute("href"));
			System.out.println(e1.getText());
		}
		

	}

}
