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
public class testngddfclassrun 
 {
	 WebDriver driver;//here we decclaera globaaly we can use any class
	 Sheet sh;//declare where we can use any class i.e
	 Ex_1SwagLabsLoginPage login;
		Ex2_SwagsLabHomePage home;
		Ex_3LogoutSwagsLabOpenMenuPage logout;
	@BeforeClass  //beforeexecution of test method its run only once
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
		     sh=WorkbookFactory.create(file).getSheet("ddf");
		     driver = new ChromeDriver();
		      driver.get("https://www.saucedemo.com/");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod//its execute multiple time before test method
    public void loginToApp() throws InterruptedException
    {
		login= new  Ex_1SwagLabsLoginPage (driver);
	 Thread.sleep(3000);
	  login.inpEx_1SwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
	 Thread.sleep(3000);
	 login.inpEx_1SwagLabsLoginPagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	 Thread.sleep(3000);
	 login.clickEx_1SwagLabsLoginPageLoginBtn();
    }
	@Test
	public void verifiyLogoClickMenuBtn() throws InterruptedException
	{
	 home= new Ex2_SwagsLabHomePage(driver);
	  String actText= home.verifyEx2_SwagsLabHomePageLogo();
	  String expText= sh.getRow(0).getCell(2).getStringCellValue();
	  Assert.assertEquals(actText,expText);
	  Thread.sleep(3000);
	  home.buttonEx2_SwagsLabHomePageOpenMenu();
	  Thread.sleep(3000);
	}
	@AfterMethod//its execute the multiple time after the test method
	public void logout() throws InterruptedException
	{
		 logout= new Ex_3LogoutSwagsLabOpenMenuPage (driver);
		 Thread.sleep(3000);
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		 Thread.sleep(3000);
		driver.close();
	}
}
