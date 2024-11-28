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
public class testclasNg 
{
	 Sheet sh;
	 WebDriver driver;
	 
	 Ex_1SwagLabsLoginPage login;
		Ex2_SwagsLabHomePage homepage;
		Ex_3LogoutSwagsLabOpenMenuPage menupage;
	@BeforeClass
	   public void openBrowser() throws EncryptedDocumentException, IOException
	   {
		FileInputStream file=new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
		        sh=  WorkbookFactory.create(file).getSheet("ddf");
		         driver = new ChromeDriver();
		        driver.get("https://www.saucedemo.com/");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   }
	@BeforeMethod
	public void loginToApp() throws InterruptedException
	{
	 login= new Ex_1SwagLabsLoginPage (driver);
	 Thread.sleep(3000);
	 login.inpEx_1SwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
	 Thread.sleep(3000);
	 login.inpEx_1SwagLabsLoginPagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	 Thread.sleep(3000);
	 login.clickEx_1SwagLabsLoginPageLoginBtn();
	}
	@Test
	public void verfiyHomePage() throws InterruptedException
	{
	 homepage= new Ex2_SwagsLabHomePage(driver);
	  String actText= homepage.verifyEx2_SwagsLabHomePageLogo();
	  Thread.sleep(3000);
	  String expText=sh.getRow(0).getCell(2).getStringCellValue();
	  Thread.sleep(3000);
	  Assert.assertEquals(actText, expText);
	  Thread.sleep(3000);
	  homepage.buttonEx2_SwagsLabHomePageOpenMenu();
	}
	@AfterMethod
	public void logoutApplication() throws InterruptedException
	{
		Thread.sleep(3000);
	 menupage=new Ex_3LogoutSwagsLabOpenMenuPage(driver);
	 menupage.btnEx_3LogoutSwagsLabOpenMenuPage();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
