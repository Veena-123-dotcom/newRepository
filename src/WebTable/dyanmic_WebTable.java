package WebTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class dyanmic_WebTable
{
	 public static void main(String[]args)
	 {
	//dynamic table data
	    WebDriver driver = new ChromeDriver();
	      driver.get("https://www.letskodeit.com/practice");
	      String exptext="5";
	      String actText=" ";
	          boolean eleFound= true;
	       int size= driver.findElements(By.xpath("//table[@id='product']//tr")).size();
	         System.out.println(size);
	         for(int i=1;i<=size;i++)
	         {
	        	 int colSize=0;
	        	 if(i==1)
	        	 {
	        	 colSize=driver.findElements(By.xpath("//table[@id='product']//tr["+i+"]/th")).size();
	        	 }
	        	 else
	        	 {
	        	colSize=   driver.findElements(By.xpath("//table[@id='product']//tr["+i+"]/td")).size();
	        	
	         }
	        	 for(int j=1; j<=colSize ; j++)
	        	 {
	        //	  String actText=" ";
	        		 if(i==1)
	        		 {
	        		 actText=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
	        	   // System.out.print(Text+" ");
	        	 }
	        		 else
	        		 {
	        			 actText= driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
	        		 // System.out.print(text1+" ");
	        		 }
	        		 if(actText.equals(exptext))
	        		 {
	        			// System.out.println(actText+"actText is avialble in table");
	        			   eleFound=true;
	        			   break;
	        		 }
	         }
	        	 System.out.println();
}
	         if(eleFound)
	         {
	        	 System.out.println( exptext+": is avliable in table");
	         }
	         else
	         {
	        	 System.out.println(actText+"is avialble in table");
	         }
	         
	 }
}
