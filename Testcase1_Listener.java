package itestListeners;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(itestListeners.Program_One.class)
public class Testcase1_Listener extends Program_One
{
	@Test
	public void amazon_cart() throws EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe"+Keys.ENTER);
		
		WebElement shoe_15=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[15]"));
		shoe_15.click();
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> id =ids.iterator();
		String parentid = id.next();//parent id
		String childid = id.next();//1st child id
		
		driver.switchTo().window(childid); //it will move the control to child
		
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		
		WebElement proceedtobuy = driver.findElement(By.name("proceedToRetailCheckout"));
		proceedtobuy.click();
		
		FileInputStream f1= new FileInputStream("C:\\Users\\banal\\eclipse-workspace\\SeleniumBasics\\DDT\\tejaswi.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String un = w1.getSheet("loginamazon").getRow(0).getCell(0).getStringCellValue();
		String pswd = NumberToTextConverter.toText(w1.getSheet("loginamazon").getRow(0).getCell(1).getNumericCellValue());
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(un);
		WebElement button = driver.findElement(By.id("continue"));
		button.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(pswd);
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
	
		WebElement btn= driver.findElement(By.name("submissionURL"));
		btn.click();
		WebElement use_add= driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		use_add.click();
		
		WebElement ccbtn= driver.findElement(By.xpath("//input[@name='ppw-instrumentRowSelection']"));
		ccbtn.click();
		
		WebElement card_details= driver.findElement(By.linkText("Enter card details"));
		card_details.click();
		
	}

}
