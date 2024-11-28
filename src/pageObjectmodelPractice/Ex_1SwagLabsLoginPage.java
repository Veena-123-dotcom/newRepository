package pageObjectmodelPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Ex_1SwagLabsLoginPage 
{
   @FindBy(xpath="//input[@id='user-name']")  private   WebElement Un;
     @FindBy(xpath="//input[@id='password']")private WebElement pwd;  
    @FindBy(xpath="//input[@id='login-button']")private  WebElement loginbtn;
    
      public Ex_1SwagLabsLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
     public void inpEx_1SwagLabsLoginPageUsername(String Username)
     {
    	 Un.sendKeys(Username);
     }
     public void inpEx_1SwagLabsLoginPagePassword(String Password)
     {
    	 pwd.sendKeys(Password);
     }
     public void clickEx_1SwagLabsLoginPageLoginBtn()
     {
    	 loginbtn.click();
     }
              
}
