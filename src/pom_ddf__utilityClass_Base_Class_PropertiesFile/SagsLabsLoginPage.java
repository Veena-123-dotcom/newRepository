package pom_ddf__utilityClass_Base_Class_PropertiesFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SagsLabsLoginPage 
{
   @FindBy (xpath="//input[@name='user-name']")private WebElement un;
     @FindBy(xpath="//input[@name='password']")  private WebElement pwd;
     @FindBy(xpath="//input[@name='login-button']")    private WebElement loginBtn;
     
       public  SagsLabsLoginPage (WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
       
       public void inpSagsLabsLoginPageUsername(String Username)
       {
    	   un.sendKeys(Username);
       }
       public void inpSagsLabsLoginPagePassword(String Password)
       {
    	   pwd.sendKeys(Password);
       }
       public void clickSagsLabsLoginPageBtn()
       {
    	   loginBtn.click();
       }
}
