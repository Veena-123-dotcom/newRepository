package pom_DDf_utilityClass_baseClassPropertyFile;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class loginmainTest extends baseClass 
{
	SwagLabsLoginPage login;
	SwagsLabsHomePage homepage;
	swagsLabsMenuPage menuPage;
	
	      @BeforeClass
            public void openBrowser() throws IOException
            {
        	 launchBrowser();
             }
	       @BeforeMethod
	          public void loginApp() throws IOException
	         {
		         login=new SwagLabsLoginPage(driver);
		         login.inpSwagLabsLoginPageUsername(UtilityClass.getPropetyFile("un"));
		         login.inpSwagLabsLoginPagePassword(UtilityClass.getPropetyFile("pwd"));
		         login.clickSwagLabsLoginPageloginBtn();
	         }
	       @Test
	       public void verifyLogo() throws EncryptedDocumentException, IOException, InterruptedException
	       {
	    	    homepage=new  SwagsLabsHomePage(driver);
	          String expValue=homepage.verifySwagsLabsHomePagelogoverify();
	            String ActText =UtilityClass.getExcelData(0, 2);
	            Assert.assertEquals(expValue,ActText );
	            Thread.sleep(3000);
	            homepage.clickSwagsLabsHomePageopenmenu();
	       }
	       @AfterMethod
	       public void logout() throws InterruptedException
	       {
	    	   menuPage=new swagsLabsMenuPage(driver);
	    	   menuPage.clickswagsLabsMenuPagelogout();
	    	   Thread.sleep(3000);
	       }
	       @AfterClass
	      public void closeBrowser() throws InterruptedException
	      {
	    	   Thread.sleep(3000);
	    	  driver.close();
	      }
}
