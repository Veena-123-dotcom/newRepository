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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginfinaltesteExecution extends BaseClass
{
	Ex_1SwagLabsLoginPage login;
	Ex2_SwagsLabHomePage homepage;
	Ex_3LogoutSwagsLabOpenMenuPage menuPage;
	@BeforeClass
    public void openBrowser() throws EncryptedDocumentException, IOException
    {
//   	  FileInputStream file=new   FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
//   	             sh=    WorkbookFactory.create(file).getSheet("ddf");
//             driver= new ChromeDriver();
//   	        driver.get("https://www.saucedemo.com/");
//   	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	     initializeBrowser();
    }
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
	login= new Ex_1SwagLabsLoginPage (driver);
	login.inpEx_1SwagLabsLoginPageUsername(UtilityClass.getTD(0,0));
	Thread.sleep(1000);
	login.inpEx_1SwagLabsLoginPagePassword(UtilityClass.getTD(0, 1));
	Thread.sleep(1000);
	login.clickEx_1SwagLabsLoginPageLoginBtn();
	}
	@Test
	public void verifyTheLogo() throws InterruptedException, EncryptedDocumentException, IOException
	{
	 homepage= new Ex2_SwagsLabHomePage(driver);
	    String actResult= homepage. verifyEx2_SwagsLabHomePageLogo();
	    String ExpResult=UtilityClass.getTD(0,2);
	    Assert.assertEquals( actResult, ExpResult);
	    Thread.sleep(3000);
		 homepage.buttonEx2_SwagsLabHomePageOpenMenu();
		 Thread.sleep(3000);
	}
	@AfterMethod
	public void openMenu() throws InterruptedException
	{
            menuPage= new Ex_3LogoutSwagsLabOpenMenuPage (driver);
            menuPage.btnEx_3LogoutSwagsLabOpenMenuPage();
            Thread.sleep(3000);
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		  Thread.sleep(3000);
		driver.close();
	}

}
