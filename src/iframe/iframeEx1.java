package iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class iframeEx1 
 {
    public static void main(String[]args) throws InterruptedException
    {
    	  WebDriver driver  =new ChromeDriver();
    	     driver.get("https://www.letskodeit.com/practice");
    	  WebElement ifrmepath=driver.findElement(By.xpath("//iframe[@scrolling='yes']"));
    	       driver.switchTo().frame(ifrmepath);
    	        WebElement elem= driver.findElement(By.xpath("//select[@name='categories']"));
    	        Thread.sleep(3000);
    	        Select sc= new Select(elem);
    	          sc.selectByVisibleText("Software Development");
    	          Thread.sleep(3000);
    	          driver.switchTo().defaultContent();
    	          Thread.sleep(3000);
    	          driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
    }
}
