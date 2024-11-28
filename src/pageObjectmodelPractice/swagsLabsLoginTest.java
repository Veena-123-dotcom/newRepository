package pageObjectmodelPractice;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;
public class swagsLabsLoginTest 
{
	swagsLabsLoginPage  login;
	swagsLabsHomePage home;
	 SwagsLabsOpenMenuPagee  menupage;
	 WebDriver driver;
	 Sheet sh;
	 @BeforeClass
        public void openBrowser() throws EncryptedDocumentException, IOException
        {
       FileInputStream file = new  FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
              sh= WorkbookFactory.create(file).getSheet("ddf");
                   driver = new ChromeDriver();
                   driver.get("https://www.saucedemo.com/");
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                  login = new swagsLabsLoginPage(driver);
                     home= new swagsLabsHomePage(driver);
                menupage= new SwagsLabsOpenMenuPagee(driver);
        }
        @BeforeMethod
        public void loginToApp() throws InterruptedException
        {
        	  String valu1=sh.getRow(0).getCell(0).getStringCellValue();
        	  Thread.sleep(3000);
        	login.inpSwagsLabsLoginPageUsername(valu1);
            String value=	sh.getRow(0).getCell(1).getStringCellValue();
            Thread.sleep(3000);
        	login.inpSwagsLabsLoginPagePassword(value);
        	Thread.sleep(3000);
        	login.clickSwagsLabsLoginPageBtn();
        	Thread.sleep(3000);
        }
        @Test
        public void verifyLogo() throws InterruptedException
        {
        	//  String value=sh.getRow(0).getCell(2).getStringCellValue();
        	  String actResult=home.verifySwagLabHomePageLogo();
        	  String expresult = sh.getRow(0).getCell(2).getStringCellValue();
        	  Assert.assertEquals(actResult, expresult );
        	  Thread.sleep(3000);
        	 home.clickSwagsLabsHomePageOpenMenu();
        	}
        
        @AfterMethod
        public void logoutFormApp()
        {
        	 menupage.clickSwagsLabsOpenMenuPageeLogoutBtn();
        }
}
