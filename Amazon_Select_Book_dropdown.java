package seleniumbasicpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Select_Book_dropdown {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e1);
		s1.selectByValue("search-alias=stripbooks");
		
//		List <WebElement>	e4=		s1.getOptions();
//		
//		System.out.println(e4.size());
//		for(int i=0;i<e4.size();i++)
//		{
//			WebElement e5=			e4.get(i);
//				System.out.println(e5.getText());
//		}

	}

}
