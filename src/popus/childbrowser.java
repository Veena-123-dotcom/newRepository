package popus;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser
{
    public static void main(String[]args) throws InterruptedException
    {
    	    WebDriver driver  =new ChromeDriver();
    	      driver.get("https://skpatro.github.io/demo/links/");
    	       Thread.sleep(3000);
    	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	      driver.findElement(By.xpath("//input[@name='NewTab']")).click();
    	         Set<String> allids=    driver.getWindowHandles();
    	          ArrayList<String>  alist=new ArrayList<String>( allids);
    	             driver.switchTo().window( alist.get(1));
    	        driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
    	        Thread.sleep(3000);
    	        driver.switchTo().window(alist.get(0));
    	          Thread.sleep(3000);
    	        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
    	        Thread.sleep(3000);
    	         Set<String>   allbrowserids=  driver.getWindowHandles();
    	         ArrayList<String> list=  new ArrayList<String>(allbrowserids);
    	         Thread.sleep(3000);
    	                 driver.switchTo().window( list.get(2));
    	                  driver.manage().window().maximize();
    	                driver.get("https://www.mobikwik.com/") ;
    	       driver.findElement(By.xpath("//span[contains(@class,'csrPtr cright')]")).click();
    	       driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("7057618357");
    	        driver.close();
    	       
    }
}
