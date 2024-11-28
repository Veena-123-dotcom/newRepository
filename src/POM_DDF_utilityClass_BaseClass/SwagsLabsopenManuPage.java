package POM_DDF_utilityClass_BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagsLabsopenManuPage 
{
	    @FindBy(xpath=" //a[@id='logout_sidebar_link']") private WebElement logout;
	    
	   public  SwagsLabsopenManuPage (WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	   
	   public void openSwagsLabsopenManuPageMenuPage()
	   {
		   logout.click();
	   }

}
