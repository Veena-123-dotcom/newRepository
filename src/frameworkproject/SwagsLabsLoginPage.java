package frameworkproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagsLabsLoginPage {
	// declration
	 @FindBy(xpath="//input[@id='user-name']") private  WebElement Un;
	  @FindBy(xpath="//input[@id='password']")private  WebElement pwd;
	    @FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
	     @FindBy(xpath="//div[@class='error-message-container error']") private WebElement errormsg;
	       @FindBy(xpath="//div[@class='error-message-container error']")private   WebElement errortext;
	         @FindBy(xpath="//div[@class='error-message-container error']")  private WebElement errorwitunpwd;
	    // initialization
    public 	SwagsLabsLoginPage(WebDriver driver)    
	    {
	        PageFactory.initElements(driver,this);	
	    }
    public void inpuSwagsLabsLoginPageUsername(String username)
    {
    	Un.sendKeys(username);
    }
    public void inpuSwagsLabsLoginPagePassword(String password)
    {
    	pwd.sendKeys(password);
    }
	public void clickSwagsLabsLoginPageLoginBtn()
	{
		loginBtn.click();
	}
	public void errorMsgSwagsLabsLoginPageErrorMsg(String expErrormsg)
	{
		 String actText=errormsg.getText();
		 if(actText.contains(expErrormsg))
		 {
			 System.out.println("pass acttext");
		 }
		 else
		 {
			 System.out.println("failtext");
		 }
	}
	public void errortextSwagsLabsLoginPageErrortext(String expText)
	{
		      String actText=errortext.getText();
		      if(actText.contains(expText))
		      {
		    	  System.out.println("pass");
		      }
		      else
		      {
		    	  System.out.println("faile");
		      }
	}
	public void verifyErrortextSwagsLabsLoginPageErrorWitunPwd(String exptext)
	{
		    String acttext=errorwitunpwd.getText();
		           if(acttext.equals(exptext))
		           {
		        	   System.out.println("pass");
		           }
		           else
		           {
		        	   System.out.println("fail");
		           }
	}

}
