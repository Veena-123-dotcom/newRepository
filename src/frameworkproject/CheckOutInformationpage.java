package frameworkproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInformationpage
   {
	   // decalartion
         @FindBy(xpath="//input[@id='first-name']") private  WebElement fN;
         @FindBy(xpath="//input[@id='last-name']")   private  WebElement LN;
          @FindBy(xpath="//input[@id='postal-code']")  private   WebElement pc;
         @FindBy(xpath="//input[@id='continue']") private  WebElement continuebtn;
         
         
         //intialization
        public  CheckOutInformationpage(WebDriver driver)
         {
        	PageFactory.initElements(driver,this) ;
         }
        //to perfom the action we need to call methods
        public void inpuCheckOutInformationPageFirstName(String firstName)
        {
        	 fN.sendKeys(firstName);
        }
        public void inputCheckOutInformationPageLastName(String LastName )
        {
        	LN.sendKeys("Lanjewar");
        }
        public void inputCheckOutInformationPagePostcode(String postcode )
        {
        	   pc.sendKeys("441906");
        }
        public void clickContinuebtn()
        {
        	continuebtn.click();
        }
}
