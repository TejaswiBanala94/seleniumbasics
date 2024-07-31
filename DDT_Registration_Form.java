package seleniumbasicpages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDT_Registration_Form {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{

		FileInputStream f1=new FileInputStream("C:\\Users\\banal\\eclipse-workspace\\SeleniumBasics\\DDT\\tejaswi.xlsx");
		//step 1
		Workbook w1= WorkbookFactory.create(f1);
	    String fn= w1.getSheet("registrationform").getRow(0).getCell(0).getStringCellValue();
	    String ln= w1.getSheet("registrationform").getRow(0).getCell(1).getStringCellValue();
	    String eid= w1.getSheet("registrationform").getRow(1).getCell(0).getStringCellValue();
	    String phn= NumberToTextConverter.toText(w1.getSheet("registrationform").getRow(1).getCell(1).getNumericCellValue());
	    String an= NumberToTextConverter.toText(w1.getSheet("registrationform").getRow(2).getCell(0).getNumericCellValue());
	    String pn= w1.getSheet("registrationform").getRow(2).getCell(1).getStringCellValue();
	     
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys(fn);
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys(ln);
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys(eid);
		Thread.sleep(2000);
		WebElement phoneno = driver.findElement(By.xpath("//input[@id='phone']"));
		phoneno.sendKeys(phn);
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("gender"));
		Select s1 = new Select(gender);
		s1.selectByValue("female");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.id("state"));
		Select s2 = new Select(state);
		s2.selectByValue("telangana");
		Thread.sleep(2000);
		WebElement Aadhar_no = driver.findElement(By.xpath("//input[@id='aadhaar']"));
		Aadhar_no.sendKeys(an);
		Thread.sleep(2000);
		WebElement pan_no = driver.findElement(By.xpath("//input[@id='pan']"));
		pan_no.sendKeys(pn);
		Thread.sleep(2000);
		WebElement agree= driver.findElement(By.xpath("//input[@id='terms']"));
		agree.click();
		Thread.sleep(2000);
		WebElement register= driver.findElement(By.xpath("//button[@name='Submit']"));
		register.click();
		

	}

}
