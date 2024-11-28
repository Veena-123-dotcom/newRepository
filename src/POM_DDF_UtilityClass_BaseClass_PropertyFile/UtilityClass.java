package POM_DDF_UtilityClass_BaseClass_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{ 
                public   static String getExcelData(int rowIndex ,int ColIndex) throws EncryptedDocumentException, IOException 
                {
                 FileInputStream file = new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
                        Sheet sh =   WorkbookFactory.create(file).getSheet("ddf");
                     String Value=sh.getRow(rowIndex).getCell(ColIndex).getStringCellValue();
                       return Value;
                  }
                public static void captuareScree(WebDriver driver,int TCID) throws IOException
                {
                	  File Srcfolder= (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                	  File destFolder =new   File ("C:\\Users\\Dell\\eclipse-workspace\\Selenium_Project\\screenshot"+TCID+".jpg");
                	    FileHandler.copy(Srcfolder, destFolder);
                }
                public static String getPropertyData(String key) throws IOException
                {
   FileInputStream file=   new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Selenium_Project\\propertdii.properties");
                  Properties pro=new Properties();
                    pro.load(file);
                String value= pro.getProperty(key);
                 return value;
            }
}
