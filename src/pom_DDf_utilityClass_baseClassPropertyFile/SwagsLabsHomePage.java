package pom_DDf_utilityClass_baseClassPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagsLabsHomePage
{
	//declartion
     @FindBy(xpath="//div[text()='Swag Labs']")  private WebElement logoverify;
       @FindBy(xpath="//button[@id='react-burger-menu-btn']")    private WebElement openmenu;
       
       //initalization
         public SwagsLabsHomePage(WebDriver driver)
         {
        	 PageFactory.initElements( driver,this);
         }
         //perform the action
         public String verifySwagsLabsHomePagelogoverify()
         {
        	     String logoText= logoverify.getText();
        	               return logoText;
         }
         
         public void clickSwagsLabsHomePageopenmenu()
         {
        	 openmenu.click();
         }
} 
