import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowsserTesting
{
	 WebDriver driver=null;
	 @Parameters("browser")
	@Test
	public void loginApp(String browser) throws InterruptedException
	{
		          if(browser.equals("chrome"))
		          {
		        	     driver=new ChromeDriver();
		          }
		          else if(browser.equals("edge"))
		          {
		        	  driver= new EdgeDriver();
		          }
		          
		           driver.get("https://www.facebook.com/login.php/");
		             Thread.sleep(3000);
		               driver.close();
		          
	}

}
