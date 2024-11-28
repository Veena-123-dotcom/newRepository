package pageObjectmodelPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Ex2_SwagsLabHomePage
{
	  @FindBy(xpath="//div[text()='Swag Labs']")    private WebElement logo;
	   @FindBy(xpath="//button[@id='react-burger-menu-btn']") private   WebElement openMenu;
	   
	  public   Ex2_SwagsLabHomePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
   public  String  verifyEx2_SwagsLabHomePageLogo()
   {
	        String actLogo=logo.getText();
	        return actLogo;
   }
   public void buttonEx2_SwagsLabHomePageOpenMenu()
   {
	   openMenu.click();
   }
}
