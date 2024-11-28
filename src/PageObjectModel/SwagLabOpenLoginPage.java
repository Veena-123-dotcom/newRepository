package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagLabOpenLoginPage
{
      @FindBy(xpath="//input[@id='user-name']") private WebElement UN;
        @FindBy(xpath="//input[@id='password']") private WebElement PWD;
        @FindBy(xpath="//input[@id='login-button']")private WebElement loginbtn;
        
        //initialization
      public  SwagLabOpenLoginPage(WebDriver driver)
      {
    	  PageFactory.initElements(driver,this);
      }
      //perform the action on method
      public void inpSwagLabOpenLoginPageUsername(String Username) 
      {
    	  UN.sendKeys("standard_user");
      }
      public void inpSwagLabOpenLoginPagePassword(String Password)
      {
    	  PWD.sendKeys("secret_sauce");
      }
      public void loginSwagLabOpenLoginPageLoginBtn()
      
      {
    	  loginbtn.click();
      }
      
}
