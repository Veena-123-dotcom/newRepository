package POM_DDF_BaseClass_Utility_Class_example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class login_page_1
{
       @FindBy(xpath="//input[@id='user-name']")private WebElement un;
        @FindBy(xpath="//input[@id='password']")    private WebElement pwd;
        @FindBy(xpath="//input[@id='login-button']")private WebElement loginbtn;
        //to initialize the construction
   public login_page_1(WebDriver driver) 
        {
        	  PageFactory.initElements( driver,this);
        }
   
   //to perform action
      public void inplogin_page_1Un(String Username)
      {
    	  un.sendKeys(Username);
      }
      public void inplogin_page_1Pwd(String password)
      {
    	  pwd.sendKeys(password);
      }
      
      public void clicklogin_page_1Btn()
      {
    	  loginbtn.click();
      }
}
