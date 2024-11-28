package multilinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class paraticepage 
{
	public static void main(String[]args) throws InterruptedException
	{
		  WebDriver driver =  new ChromeDriver();
		     driver.get("https://www.flipkart.com/");
		     driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("cloth");
		     Thread.sleep(3000);
		       String exp="in Cloth Dryer Stands";
		    List<WebElement>element=  driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li//div[@class='YGcVZO _2VHNef']"));
//		                     for(WebElement elemt:element)
//		                     {
//		                    	 System.out.println(elemt.getText());
//		                     }
		                         for(WebElement elemt:element)
		                         {
		                  String actText=  elemt.getText();
		                         if(actText.equals(exp))
		                         {
		                        	    elemt.click();
		                        	    break;
		                        	    
		                         }
		                         }
 
	}

}
