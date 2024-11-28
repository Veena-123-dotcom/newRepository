package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screensotFullPage {
   public static void main(String[] args) {
	   String str="today is sunday";
       String arr[] =str.split(" ");
         System.out.println(arr[1]);
          for(int i=0;i<=arr.length-1;i++)
        {
          System.out.println(arr[i]);
         }

	    
	}

}
