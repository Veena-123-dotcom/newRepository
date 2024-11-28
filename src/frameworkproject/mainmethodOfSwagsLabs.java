package frameworkproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainmethodOfSwagsLabs {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
    	 FileInputStream file=new  FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
	       Sheet sh=  WorkbookFactory.create(file).getSheet("ddf");
    	   WebDriver driver=new ChromeDriver();
    	     driver.get("https://www.saucedemo.com/");
    	     driver.manage().window().maximize();
    	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	     SwagsLabsLoginPage  loginPage= new SwagsLabsLoginPage(driver);
    	      String value= sh.getRow(3).getCell(0).getStringCellValue();
    	       loginPage.inpuSwagsLabsLoginPageUsername(value);
    	        String ValuePwsd= sh.getRow(3).getCell(1).getStringCellValue();
   	        loginPage.inpuSwagsLabsLoginPagePassword(ValuePwsd);
 	                loginPage.clickSwagsLabsLoginPageLoginBtn();
    	        String verifytext= sh.getRow(3).getCell(2).getStringCellValue();
  	        loginPage.verifyErrortextSwagsLabsLoginPageErrorWitunPwd(verifytext);
        	         
	 	

	}

}
