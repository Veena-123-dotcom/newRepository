package pom_DDf_utilityClass_baseClassPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class swagsLabsMenuPage
{
	       @FindBy(xpath="//a[@id='logout_sidebar_link']")  private WebElement logout;
	       
	        public  swagsLabsMenuPage(WebDriver driver)
	       {
	    	   PageFactory.initElements(driver ,this);
	       }
	        
	        public void clickswagsLabsMenuPagelogout()
	        {
	        	logout.click();
	        }

}
