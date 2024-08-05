package autosuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Amazon_Autosuggetions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		Thread.sleep(4000);
		List<WebElement> autosuggetion =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		Thread.sleep(2000);
		
		for(int i=0;i<autosuggetion.size();i++)
		{
		WebElement e1= autosuggetion.get(i);
		System.out.println(e1.getText());
		}

	}

}
