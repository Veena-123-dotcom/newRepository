package WebTable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTableParatice
{
             public static void main(String []args) throws InterruptedException   
             {
            	 WebDriver driver= new ChromeDriver();
            	   driver.get("https://www.letskodeit.com/practice");
            	List<WebElement> tableRow=   driver.findElements(By.xpath("//table[@id='product']//tr"));
            	   System.out.println(tableRow.size());
            	 int sizeheder=  driver.findElements(By.xpath("//table[@id='product']//tr//th")).size();
            	  System.out.println(sizeheder);
            	     int size=driver.findElements(By.xpath("//table[@id='product']//tr[2]//td")).size();
            	     System.out.println(size);
            	     Thread.sleep(3000);
            	   String text=  driver.findElement(By.xpath("//table[@id='product']//tr[2]//td[1]")).getText();
            	    System.out.println(text);
            	    
            	    for(int i=1;i<=4;i++)
            	    {
            	    	for(int j=1;j<=3;j++)
            	    	{
            	    		if(i==1)
            	    		{
            	    		String text1=	driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
            	    		  System.out.print(text1+" ");
            	    		
            	    		}
            	    		else
            	    		{
            	    	  String text2= driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
            	    	    System.out.print(text2+" ");
            	    		}
            	    	}
            	    	System.out.println();
            	    }
           
             }
}
