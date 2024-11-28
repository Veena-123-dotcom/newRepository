package popus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup 
{
	public static void main(String[]args) throws InterruptedException
	{
	 WebDriver driver=  new ChromeDriver();
	     driver.get("https://www.letskodeit.com/practice");
	     driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("friday");
	      Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
                 Alert    popup=    driver.switchTo().alert();
                 Thread.sleep(3000);
                 System.out.println( popup.getText());
                        popup.accept() ;
                driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
                Alert    popup1=    driver.switchTo().alert();
                        System.out.println(popup1.getText());
                            popup1.dismiss();
}
}