package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classlistbox {

	public static void main(String[] args) {
	       WebDriver driver=  new ChromeDriver();
	         driver.get("https://www.letskodeit.com/practice");
	       WebElement  listbox= driver.findElement(By.xpath("//select[@id='carselect']"));
	                    Select sc= new Select( listbox);
	                     // sc.selectByVisibleText("Benz");
	                  //  sc.selectByValue("honda");
	                       sc.selectByIndex(0);
	          WebElement multilistbox= driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
	             Select sce = new Select(multilistbox);
	                 sce.selectByVisibleText("Apple");
	                 sce.selectByValue("orange");
	                 sce.selectByIndex(2);
	            System.out.println( sce.getFirstSelectedOption().getText());
	              List<WebElement>  selectedOptions=   sce.getAllSelectedOptions();
	               System.out.println(selectedOptions.size());
	                  for(int i=0;i<=selectedOptions.size()-1;i++)
	                  {
	                	System.out.println( selectedOptions.get(i).getText());
	                  }
	               boolean  multileElement= sce.isMultiple();
	                if(  multileElement)
	                {
	                	System.out.println("pass");
	                }
	                else
	                {
	                	System.out.println("fail");
	                }
	                sce.deselectAll();
	                   
	                 

	}

}
