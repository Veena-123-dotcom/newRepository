package POM_DDF_UtilityClass_BaseClass_PropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class  SwagLabsHomePage
{
	     @FindBy(xpath="//div[text()='Swag Labs']") private  WebElement homepageLogo;
	      @FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement   clickopenMenu;
	      
	      public  SwagLabsHomePage(WebDriver driver)
	      {
	    	  PageFactory.initElements(driver,this);
	      }
	      
	      public String verifySwagLabsHomePageLogoPage()
	      {
	    	   String logoText= homepageLogo.getText();
	    	        return logoText;
	      }
	      public void openSwagLabsHomePageclickopenMenu()
	      {
	    	  clickopenMenu.click();     
	      }

}
