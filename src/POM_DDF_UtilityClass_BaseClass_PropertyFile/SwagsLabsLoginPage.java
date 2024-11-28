package POM_DDF_UtilityClass_BaseClass_PropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagsLabsLoginPage 
{
      @FindBy(xpath="//input[@id='user-name']") private  WebElement un;
         @FindBy(xpath="//input[@id='password']")  private WebElement pwd;
          @FindBy(xpath="//input[@id='login-button']")  private  WebElement loginbt;
          
          public   SwagsLabsLoginPage (WebDriver driver)
          {
        	  PageFactory.initElements(driver,this);
          }
          
          public void inpSwagsLabsLoginPageUsername(String Username)
          {
        	  un.sendKeys(Username);
          }
          public void inpSwagsLabsLoginPage (String Password)
          {
        	  pwd.sendKeys(Password);
          }
          public void clickSwagsLabsLoginPageLoginbtn()
          {
        	  loginbt.click();
          }
          
} 
