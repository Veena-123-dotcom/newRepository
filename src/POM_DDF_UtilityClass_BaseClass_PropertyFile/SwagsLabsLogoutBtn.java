package POM_DDF_UtilityClass_BaseClass_PropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagsLabsLogoutBtn
{
	       @FindBy(xpath="//a[@id='logout_sidebar_link'])" )private  WebElement logout;
	       
	  public SwagsLabsLogoutBtn(WebDriver driver)
	  {
		      PageFactory.initElements(driver,this);
	  }
     public void clickSwagsLabsLogoutBtnlogout()
     {
    	 logout.click();
     }
}
