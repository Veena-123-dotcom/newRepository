package pageObjectmodelPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class swagsLabsHomePage
{
       @FindBy(xpath="//div[@class='app_logo']")  private  WebElement logo;
        @FindBy(xpath="//button[@id='react-burger-menu-btn']") private   WebElement menuOpen ;
        
      public  swagsLabsHomePage(WebDriver driver)
      {
    	  PageFactory.initElements( driver,this);
      }
      public String verifySwagLabHomePageLogo()
    {
    String actLogoText = logo.getText();
        return actLogoText;
    }
      public void clickSwagsLabsHomePageOpenMenu()
      {
    	  menuOpen.click();
      }
}

