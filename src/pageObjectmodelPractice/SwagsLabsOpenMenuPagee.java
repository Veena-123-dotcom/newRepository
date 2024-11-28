package pageObjectmodelPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class  SwagsLabsOpenMenuPagee
{
   @FindBy(xpath="//a[text()='Logout']") private  WebElement  logout;
     public  SwagsLabsOpenMenuPagee (WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
     public void clickSwagsLabsOpenMenuPageeLogoutBtn()
     {
    	 logout.click();
     }
      
}
