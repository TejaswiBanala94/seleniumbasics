package seleniumbasicpages;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ddt_Facebook_Login {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\banal\\eclipse-workspace\\SeleniumBasics\\DDT\\tejaswi.xlsx");
		//step 1
		Workbook w1=	WorkbookFactory.create(f1);
	String un=	w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
	String pwd=	w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement Email_id =driver.findElement(By.xpath("//input[@id='email']"));
	Email_id.sendKeys(un);
	WebElement password =driver.findElement(By.xpath("//input[@name='pass']"));
	password.sendKeys(pwd);
	WebElement login =driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	}

}
