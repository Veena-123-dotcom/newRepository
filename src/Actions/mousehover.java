package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover
{
	public static void main(String []args) throws InterruptedException
	{
           WebDriver driver=new ChromeDriver();
              driver.get("https://www.amazon.in/");
            WebElement elem=   driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
            Actions as= new Actions(driver);
              as.moveToElement( elem).perform();//non static method
          //     driver.findElement(By.xpath("//a[@class='nav-link nav-item'])[3]")).click();
               Thread.sleep(3000);
               WebElement elemt=driver.findElement(By.xpath("//a[@id='nav-orders']"));
               as.click(elemt).perform();
               Thread.sleep(3000);
               driver.navigate().back();
             WebElement ele=      driver.findElement(By.xpath("//a[text()='Mobiles']"));
              as.doubleClick(ele).perform();
              driver.switchTo().newWindow(WindowType.TAB);
              driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
              WebElement elemts=   driver.findElement(By.xpath("//select[@id='day']"));
                Actions ac= new Actions(driver);
                   ac.moveToElement(elemts).perform();
                   ac.click(elemts).perform();
                   ac.sendKeys(Keys.HOME).perform();
                   for(int i=0;i<=5;i++)
                   {
		     ac.sendKeys(Keys.ARROW_DOWN).perform();
		      Thread.sleep(3000);
		     as.sendKeys(Keys.ENTER).perform();
		     Thread.sleep(3000);
	}
	}
}
