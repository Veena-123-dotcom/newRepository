package pageObjectmodelPractice;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseClass
{
	    WebDriver driver;
     public void initializeBrowser() // this method we created to open the browser
     {
    	    driver = new ChromeDriver();
    	      driver.manage().window().maximize();
    	      driver.get("https://www.saucedemo.com/");
    	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }
}
