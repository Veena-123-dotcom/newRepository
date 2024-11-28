package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagLogHomePage 
{
	    @FindBy(xpath="//div[text()='Swag Labs']")private  WebElement logo;
	    @FindBy(xpath="//div[@class='header_label']")private WebElement openmenu;
	    
	   public  SwagLogHomePage (WebDriver  driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	   public void verifySwagLogHomePageLogo(String expLogoText)
	   {
		       String actLogText="Swag Labs";
		       if(actLogText.equals(expLogoText))
		       {
		    	   System.out.println("pass the logo");
		       }
		       else
		       {
		    	   System.out.println("logo not pass");
		       }
	   }
	   public void clickSwagLogHomePageOpenMenu()
	   {
		   openmenu.click();
	   }
}
