package POM_DDF_BaseClass_Utility_Class_example;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class utilityClass 
     {
       public   static  String excelData(int rowIndex, int ColIndex) throws EncryptedDocumentException, IOException
       {
    	   FileInputStream file=new  FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
    	      Sheet sh=  WorkbookFactory.create(file).getSheet("ddf");
    	      String Value = sh.getRow(rowIndex).getCell(ColIndex).getStringCellValue();
    	             return Value;
       }
       
       public static void captureScreenshot(WebDriver driver ,int TCID) throws IOException
       {
    	  File SRC=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  File DestFoleder = new File("C:\\Users\\Dell\\eclipse-workspace\\Selenium_Project\\TestCaseID"+TCID+".jpg");
    	      FileHandler.copy(SRC, DestFoleder);
    	        
			
       }
   }
