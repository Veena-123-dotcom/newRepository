package POM_DDF_UtilityClass_BaseClass_PropertyFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass 
{
	   WebDriver driver;
	       public void opnBrowser()
	       {
	    	         driver= new ChromeDriver();
	    	         driver.manage().window().maximize();
	    	         driver.get("https://www.saucedemo.com/");
	    	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       }

}
