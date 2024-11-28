package POM_DDF_BaseClass_Utility_Class_example;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class mainClass_TestClassData  extends baseClass 
{
	login_page_1 login;
	homePage   home;
	openMenuPage page;
     @BeforeClass   
	public void opBrowser() throws EncryptedDocumentException, IOException 
	{
    	 openBrowser();
	}
     @BeforeMethod
     public void loginPage() throws EncryptedDocumentException, IOException, InterruptedException
     {
    	  login = new login_page_1(driver);
    	  login.inplogin_page_1Un(utilityClass.excelData(0,0));
    	  Thread.sleep(3000);
    	  login.inplogin_page_1Pwd(utilityClass.excelData(0, 1));
    	  Thread.sleep(3000);
    	  login.clicklogin_page_1Btn();
     }
     @Test
     public void homePage() throws EncryptedDocumentException, IOException, InterruptedException
     {
    	      home= new homePage(driver);
    	     String actResult= home.verifyhomePageLogo();
    	      String ExpResult=utilityClass.excelData(0, 2);
    	      Assert.assertEquals(actResult,  ExpResult);
    	      Thread.sleep(3000);
    	      home.clickhomePagemenubtn();
    	      Thread.sleep(3000);
    	      
     }
     @AfterMethod
     public void manuPage(ITestResult result) throws InterruptedException
     {
    	    if(result.getStatus()==ITestResult.FAILURE)
    	    {
    	    	UtilityClass.capturesrc(driver,TCID);
    	    }
    	          page=new openMenuPage(driver);
    	          page.clickopenMenuPageLogout();
    	           Thread.sleep(3000);
     }
     
}
