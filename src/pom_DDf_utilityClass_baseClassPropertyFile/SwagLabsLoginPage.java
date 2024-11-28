package pom_DDf_utilityClass_baseClassPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagLabsLoginPage
{
	
	 //decalre the element
              @FindBy(xpath="//input[@id='user-name']")private WebElement un;
                @FindBy(xpath="//input[@id='password']") private  WebElement pwd;
               @FindBy(xpath="//input[@id='login-button']")private  WebElement loginbtn;
            // initialize the 
               
           public SwagLabsLoginPage(WebDriver driver)   
               {
            	   PageFactory.initElements(driver,this);
               }
           //perform the action
           public void inpSwagLabsLoginPageUsername(String Username)
           {
        	   un.sendKeys(Username);
           }
           public void inpSwagLabsLoginPagePassword(String Password)
           {
        	   pwd.sendKeys(Password);
           }
           public void clickSwagLabsLoginPageloginBtn()
           {
        	   loginbtn.click();
           }
}
