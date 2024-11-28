package pageObjectmodelPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class swagsLabsLoginPage
{
            @FindBy(xpath="//input[@id='user-name']")   private WebElement Un; 
           @FindBy(xpath="//input[@id='password']")     private WebElement pwd;
            @FindBy(xpath="//input[@id='login-button']")   private WebElement login;
            
        public  swagsLabsLoginPage(WebDriver driver)
        {
        	PageFactory.initElements(driver,this);
        }
      
        public void inpSwagsLabsLoginPageUsername(String Username)
        {
        	Un.sendKeys(Username);
        }
        public void inpSwagsLabsLoginPagePassword(String Password)
        {
        	pwd.sendKeys(Password);
        	
        }
        public void clickSwagsLabsLoginPageBtn()
        {
        	login.click();
        }
        
            
}
