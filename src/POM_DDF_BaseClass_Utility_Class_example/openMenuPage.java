package POM_DDF_BaseClass_Utility_Class_example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class openMenuPage 
{
       @FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement logoutbt;
       
       public    openMenuPage (WebDriver driver)
       {
    	   PageFactory.initElements(driver,this);
       }
       
       public void clickopenMenuPageLogout()
       {
    	   logoutbt.click();
       }


}
