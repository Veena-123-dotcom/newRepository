package frameworkproject;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class mainmethid_TestClass {
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		  FileInputStream file=new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
		     Sheet sh=  WorkbookFactory.create(file).getSheet("ddf");
              WebDriver driver= new ChromeDriver();
               driver.get("https://www.saucedemo.com/");
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
               SwagsLabsLoginPage loginPage= new SwagsLabsLoginPage(driver);
                  String value=  sh.getRow(2).getCell(0).getStringCellValue();
                  loginPage.inpuSwagsLabsLoginPageUsername(value);
                   String pswdvalue=  sh.getRow(2).getCell(1).getStringCellValue();
                   loginPage.inpuSwagsLabsLoginPagePassword(pswdvalue);
                   loginPage.clickSwagsLabsLoginPageLoginBtn();
                 String errortext=sh.getRow(2).getCell(2).getStringCellValue();
                 loginPage.errortextSwagsLabsLoginPageErrortext(errortext);
                 
    }
}