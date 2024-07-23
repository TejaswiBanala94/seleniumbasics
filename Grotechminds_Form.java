package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechminds_Form {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[2]/div/div/div/div/form/input)[1]"));
		fname.sendKeys("Tejaswi");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[2]/div/div/div/div/form/input)[2]"));
		lname.sendKeys("Banala");
		Thread.sleep(2000);
		WebElement Email_id = driver.findElement(By.xpath("((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[2]/div/div/div/div/form/input)[3]"));
		Email_id.sendKeys("tejaswi55@gmail.com");
		Thread.sleep(2000);
		WebElement phone_no = driver.findElement(By.xpath("((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[2]/div/div/div/div/form/input)[4]"));
		phone_no.sendKeys("9473542654");
		Thread.sleep(2000);
//		WebElement Aadhar_no = driver.findElement(By.xpath("((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[2]/div/div/div/div/form/input)[5]"));
//		Aadhar_no.sendKeys("223344556677");
//		Thread.sleep(2000);
//		WebElement pan_no = driver.findElement(By.xpath("((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[2]/div/div/div/div/form/input)[6]"));
//		pan_no.sendKeys("abcad1234a");
//		Thread.sleep(2000);
//		WebElement A1 = driver.findElement(By.xpath("((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[2]/div/div/div/div/form/input)[7]"));
//		A1.click();
//		Thread.sleep(2000);

	}

}
