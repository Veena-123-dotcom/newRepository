package POM_DDF_utilityClass_BaseClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClasses  extends BaseClass 
{
	 loginHomepage login;
	 SwagLabsHomePage home;
	 SwagsLabsopenManuPage menuPage;
	  @BeforeClass
	            public void openBrowser()
	            {
	              browseropen();
	            }
	  @BeforeMethod
	  public void loginPage() throws EncryptedDocumentException, IOException
	  {
		   login= new   loginHomepage(driver);
		   login.inploginHomepageUsername(UtilityClass.getDataExcel(0,0));
		   login.inploginHomepagePassword(UtilityClass.getDataExcel(0,1));
		   login.clickloginHomepageloginbtn();
	  }
	  @Test
	  public void verifyLogo() throws EncryptedDocumentException, IOException, InterruptedException
	  {
		      home=new SwagLabsHomePage(driver); 
	   String actResult=	 home.verifySwagLabsHomePageLogo();
	        String ExpResult=UtilityClass.getDataExcel(0, 2);
	        Assert.assertEquals( actResult, ExpResult);
	        Thread.sleep(3000);
	        home.clickSwagLabsHomePageBtn();
	  }
	  @AfterMethod
	  public void logoutPage()
	  { 
		  menuPage=new SwagsLabsopenManuPage (driver);
		  menuPage.openSwagsLabsopenManuPageMenuPage();
	  }

}
