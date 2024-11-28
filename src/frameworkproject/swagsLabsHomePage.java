package frameworkproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swagsLabsHomePage {
	 @FindBy(xpath="//div[@class='app_logo']")   private  WebElement verfiylogo;
	   @FindBy(xpath="//button[@id='react-burger-menu-btn']") private   WebElement menuopen;
	  @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private  WebElement addcartBtn;
	     @FindBy(xpath="//a[@class='shopping_cart_link']") private  WebElement addcartLink;
	   //inialization
	   public   swagsLabsHomePage(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	   //perform action on methods
	   public void verifyswagsLabsHomePageLogo(String ExpLogo)
	   {
		     String acttext=verfiylogo.getText();
		       if(acttext.equals(ExpLogo))
		       {
		    	   System.out.println("pass");
		       }
		       else
		       {
		    	   System.out.println("fail");
		       }
	   }
	   public void clickswagsLabsHomePageMenuPage()
	   {
		   menuopen.click();
	   }
	   public void clickswagsLabsHomePageAddCartBtn()
	   {
		   addcartBtn.click();
	   }
	   public void clickswagsLabsHomePageAddToCartLink()
	   {
		   addcartLink.click();
	   }
}
