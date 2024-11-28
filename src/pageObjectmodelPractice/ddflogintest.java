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
public class ddflogintest extends BaseClass
{
{
	   Sheet sh;
	   WebDriver driver;
	   
	   Ex_1SwagLabsLoginPage login;
		Ex2_SwagsLabHomePage  homepage;
		Ex_3LogoutSwagsLabOpenMenuPage menupage;
	
	@BeforeClass
         public void OpenBrowser() throws EncryptedDocumentException, IOException
         {
        	FileInputStream file=  new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
        	    sh=WorkbookFactory.create(file).getSheet("ddf");
//        	     driver=   new ChromeDriver();
//        	       driver.get("https://www.saucedemo.com/");
//        	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        	     //  login= new Ex_1SwagLabsLoginPage (driver);
        	    initializeBrowser();
        	 }
	@BeforeMethod     //its execute multipel time before execute the test method
	public void openLoginApp() throws InterruptedException
	{
		 login= new Ex_1SwagLabsLoginPage (driver);
		 login. inpEx_1SwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		 Thread.sleep(3000);
		 login.inpEx_1SwagLabsLoginPagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(3000);
		 login.clickEx_1SwagLabsLoginPageLoginBtn();
		 Thread.sleep(3000);
	}
	@Test
	public void VerifyTheLogo() throws InterruptedException
	{
		  homepage= new Ex2_SwagsLabHomePage(driver);
		  String actResult= homepage.verifyEx2_SwagsLabHomePageLogo();
		  String expResult =sh.getRow(0).getCell(2).getStringCellValue();
		  Assert.assertEquals(actResult, expResult );
		  Thread.sleep(3000);
		  homepage.buttonEx2_SwagsLabHomePageOpenMenu();
		  Thread.sleep(3000);
	}
	@AfterMethod // its execute multiple time after completion of all the test method
	public void LogoutBtn() throws InterruptedException
	{
		 menupage= new Ex_3LogoutSwagsLabOpenMenuPage (driver);
		 Thread.sleep(3000);
	}
	@AfterClass //its execute only once after completing of the test method
	public void closeBrowser() throws InterruptedException
	{
		 Thread.sleep(3000);
		driver.close();
	}
}
