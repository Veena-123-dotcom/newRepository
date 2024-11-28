package frameworkproject;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import dev.failsafe.internal.util.Durations;
public class mainMethod {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	  FileInputStream file=new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
	     Sheet sh= WorkbookFactory.create(file).getSheet("ddf");
	     
		   WebDriver driver= new ChromeDriver();
		     driver.get("https://www.saucedemo.com/");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     SwagsLabsLoginPage loginPage= new SwagsLabsLoginPage(driver);
		      String UNValue= sh.getRow(1).getCell(0).getStringCellValue();
		      loginPage.inpuSwagsLabsLoginPageUsername(UNValue);
		       String pwdValue= sh.getRow(1).getCell(1).getStringCellValue();
		        loginPage. inpuSwagsLabsLoginPagePassword(pwdValue);
		        Thread.sleep(3000);
		        loginPage.clickSwagsLabsLoginPageLoginBtn();
		         String errormag=sh.getRow(1).getCell(2).getStringCellValue();
		         loginPage.errorMsgSwagsLabsLoginPageErrorMsg(errormag);
		         
		     
	}

}
