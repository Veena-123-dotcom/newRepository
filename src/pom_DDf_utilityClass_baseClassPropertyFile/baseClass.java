package pom_DDf_utilityClass_baseClassPropertyFile;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class baseClass 
{
	WebDriver driver;
	 public void launchBrowser() throws IOException
	 {
		      driver=new ChromeDriver();
		      driver.get(UtilityClass.getPropetyFile("url"));
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }

}
