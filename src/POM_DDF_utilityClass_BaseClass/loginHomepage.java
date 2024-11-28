package POM_DDF_utilityClass_BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginHomepage
{
	   @FindBy(xpath="//input[@id='user-name']")private   WebElement  un;
         @FindBy(xpath="//input[@id='password']")  private WebElement pwd;
        @FindBy(xpath="//input[@id='login-button']")  private WebElement logibtn;
        
       public  loginHomepage(WebDriver driver)
       {
    	     PageFactory.initElements(driver,this);
       }
       
       public void inploginHomepageUsername(String Username)
       {
    	           un.sendKeys(Username);
       }
       public void inploginHomepagePassword(String Password)
       {
    	      pwd.sendKeys(Password);
       }
       public void clickloginHomepageloginbtn()
       {
    	   logibtn.click();
       }
}
