package POM_DDF_utilityClass_BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	  WebDriver driver;
	public void browseropen()
	{
		//in that base class only we open the browser
		        driver =new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.saucedemo.com/");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
