package POM_DDF_utilityClass_BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{
	    @FindBy(xpath="//div[text()='Swag Labs']")  private WebElement logo;
	     @FindBy(xpath="//button[@id='react-burger-menu-btn']")private  WebElement meuOpen;
	     
	    public   SwagLabsHomePage (WebDriver driver)
	    {
	    	PageFactory.initElements( driver,this);
	    }
	    
	    public   String  verifySwagLabsHomePageLogo()
	    {
	    	String logoText=logo.getText();
	    	   return logoText;
	    	    
	    }
	    public void clickSwagLabsHomePageBtn()
	    {
	    	meuOpen.click();
	    }
	     

}
