package POM_DDF_BaseClass_Utility_Class_example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class homePage
{
        @FindBy(xpath="//div[text()='Swag Labs']")    private WebElement homepagelogo;
       @FindBy(xpath="//button[@id='react-burger-menu-btn']")  private WebElement  menubtn;
       
     public  homePage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     //to perdrom the action
     public String  verifyhomePageLogo()
     {
    	       String logotext=homepagelogo.getText();
    	                   return logotext;
     }
     public void  clickhomePagemenubtn()
     {
    	 menubtn.click();
     }
	
       
}
