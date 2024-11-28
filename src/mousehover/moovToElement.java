package mousehover;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class moovToElement 
{
	  public  static void main(String[]args)
	  {
		     WebDriver driver =   new ChromeDriver();
	         driver.get("https://www.amazon.in/");
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            WebElement elem=  driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	                 Actions as= new  Actions(driver);
	                    as.moveToElement(elem).perform();
	                    driver.findElement(By.xpath("//span[contains(text(),'Wish from')]")).click();
	              WebElement elemnts=driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"));
	                  Actions ase= new Actions(driver);
	                     ase.contextClick(elemnts).perform();
	                     ase.click(elemnts).perform();
	                     ase.doubleClick(elemnts).perform();
	  }
}
