package PageObjectModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabsLogintestMenu
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException
	{
	   FileInputStream file=new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
	              Sheet sh=    WorkbookFactory.create(file).getSheet("ddf");
	                    WebDriver driver= new ChromeDriver();
	                      driver.get("https://www.saucedemo.com/");
	              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	              
	              SwagLabOpenLoginPage login= new SwagLabOpenLoginPage(driver);
	         login.inpSwagLabOpenLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
	          login.inpSwagLabOpenLoginPagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	          login.loginSwagLabOpenLoginPageLoginBtn();
	          Thread.sleep(3000);
	          
	          SwagLogHomePage homepage= new SwagLogHomePage(driver);
	          homepage.verifySwagLogHomePageLogo(sh.getRow(0).getCell(2).getStringCellValue());
	          homepage.clickSwagLogHomePageOpenMenu();
	          Thread.sleep(3000);
	          
	        
	}

}
