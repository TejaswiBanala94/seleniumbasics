package seleniumbasicpages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Login_Amazon {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\banal\\eclipse-workspace\\SeleniumBasics\\DDT\\tejaswi.xlsx");
		Workbook w1= WorkbookFactory.create(f1);
		String eid = w1.getSheet("amazonlogin").getRow(0).getCell(0).getStringCellValue();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fs%3Fk%3Dmy%2Baccount%2Bwith%2Bamazon%2Bsign%2Bin%26hvadid%3D410037178540%26hvdev%3Dc%26hvlocphy%3D9024601%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D4876500774550289367%26hvtargid%3Dkwd-843559735172%26hydadcr%3D7442_11109904%26tag%3Dgooghydr-20%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//input[@name='email']"));
		e1.sendKeys(eid);
		WebElement button = driver.findElement(By.xpath("//input[@id='continue']"));
		button.click();
	}

}
