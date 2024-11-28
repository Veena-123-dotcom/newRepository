package pageObjectmodelPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Ex_3LogoutSwagsLabOpenMenuPage 
{
	 @FindBy(xpath=" //a[@id='logout_sidebar_link']") private WebElement logout;
	 
	 public Ex_3LogoutSwagsLabOpenMenuPage (WebDriver driver)
	 {
		 PageFactory.initElements( driver,this);
	 }
	 public void btnEx_3LogoutSwagsLabOpenMenuPage()
	 {
		 logout.click();
	 }

}
