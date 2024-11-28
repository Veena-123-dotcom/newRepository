package POM_DDF_BaseClass_Utility_Class_example;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class baseClass 
{
	              WebDriver driver;
	              public void openBrowser() throws EncryptedDocumentException, IOException
	              {
	                     driver.manage().window().maximize();
	            	      driver=new ChromeDriver();
	            	      driver.get("https://www.saucedemo.com/");
	            	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	              }

}
