package seleniumbasicpages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_Program_Exceptions_Numeric_TO_String 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream f1=new FileInputStream("C:\\Users\\banal\\eclipse-workspace\\SeleniumBasics\\DDT\\tejaswi.xlsx");
	//step 1
	//FileInputStream f1=new FileInputStream("D:\\Users\\banal\\eclipse-workspace\\SeleniumBasics\\DDT\\tejaswi.xlsx");
	//FileNotFoundException
	//String un= w1.getSheet("login2").getRow(6).getCell(7).getStringCellValue());
	//If there is an empty string NullPointerException
	//String un= w1.getSheet("login2").getRow(6).getCell(7).getStringCellValue());
		//When you fetch numeric value IlleagalStateException
	Workbook w1=	WorkbookFactory.create(f1);
	String un=	NumberToTextConverter.toText(w1.getSheet("login2").getRow(0).getCell(0).getNumericCellValue());
	System.out.println(un);
}
}
