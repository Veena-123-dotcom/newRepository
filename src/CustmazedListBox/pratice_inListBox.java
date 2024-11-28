package CustmazedListBox;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class pratice_inListBox 
{
	public static void main(String[]args) throws InterruptedException
	{
                WebDriver driver=new ChromeDriver();
                  driver.get("https://demoqa.com/select-menu");
        WebElement custmizedListbox=   driver.findElement(By.xpath("//div[@id='withOptGroup']"));
                         Actions ac=new Actions(driver);
                      ac.moveToElement( custmizedListbox).perform();//non static
                      ac.click(custmizedListbox).perform();
                      for(int i=0;i<=4;i++)
                      {
                    	  ac.sendKeys(Keys.ARROW_DOWN).perform();
                    	//  ac.sendKeys(Keys.ENTER);
                    	   Thread.sleep(3000);
                      }
                      ac.sendKeys(Keys.ENTER).perform(); 
                      Thread.sleep(3000);
                      //jump to 1st option using home key
                     ///   ac.sendKeys(Keys.HOME).perform();
                        Thread.sleep(3000);
                        //navigation
            WebElement  elements=driver.findElement(By.xpath("//div[@id='selectOne']"));
                        Actions asc= new Actions(driver);
                          asc.moveToElement(elements).perform();
                          asc.click(elements).perform();
                          asc.sendKeys(Keys.HOME);
                        for(int i=1;i<=4;i++)
                        {
                        	asc.sendKeys(Keys.ARROW_DOWN).perform();
                        	 Thread.sleep(3000);
                        }
                       asc.sendKeys(Keys.ENTER).perform();
                  	 Thread.sleep(3000);
                 
}
}
