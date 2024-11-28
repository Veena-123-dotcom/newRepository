package frameworkproject;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainMethoHomePage {
   public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	     FileInputStream file = new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
	        Sheet sh=    WorkbookFactory.create(file).getSheet("ddf");
	            WebDriver driver=new ChromeDriver();
	              driver.get("https://www.saucedemo.com/");
	              driver.manage().window().maximize();
	              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	              //SwagsLabsLoginPage loginpage= new  SwagsLabsLoginPage(driver);
	                 String unValue=  sh.getRow(0).getCell(0).getStringCellValue();
	                 SwagsLabsLoginPage loginpage= new  SwagsLabsLoginPage(driver);
	                   System.out.println(unValue);
	                   loginpage.inpuSwagsLabsLoginPageUsername(unValue);
	                     String pwdValue=sh.getRow(0).getCell(1).getStringCellValue();
	                     loginpage.inpuSwagsLabsLoginPagePassword(pwdValue);
	                     loginpage.clickSwagsLabsLoginPageLoginBtn();    
	                     Thread.sleep(2000);
	                     
	              swagsLabsHomePage   homepage= new swagsLabsHomePage (driver);
	               String vrifyLogo=  sh.getRow(0).getCell(2).getStringCellValue();
	                      homepage.verifyswagsLabsHomePageLogo(vrifyLogo);
	                      homepage.clickswagsLabsHomePageMenuPage();
	                      Thread.sleep(2000);
	                      homepage.clickswagsLabsHomePageAddCartBtn();
	                      Thread.sleep(2000);
	                      homepage.clickswagsLabsHomePageAddToCartLink();
	                      
	                      AddTocartPage carpage= new AddTocartPage(driver);
	                      Thread.sleep(2000);
	                      carpage.clickAddTocartPageCheckoutbtn();
	                      
	             CheckOutInformationpage  inforpage=  new  CheckOutInformationpage(driver);
	                  String firstname= sh.getRow(4).getCell(0).getStringCellValue();
	                  Thread.sleep(2000);
	                  inforpage.inpuCheckOutInformationPageFirstName(firstname);
	                  String lastname=   sh.getRow(4).getCell(1).getStringCellValue();
	                  Thread.sleep(2000);
	                  inforpage.inputCheckOutInformationPageLastName(lastname);
	                  Thread.sleep(2000);
	                  String   postalcode=    sh.getRow(4).getCell(2).getStringCellValue();
	                  inforpage.inputCheckOutInformationPagePostcode(postalcode);
	                  Thread.sleep(2000);
	                  inforpage.clickContinuebtn();
	                  
	              

	}

}
