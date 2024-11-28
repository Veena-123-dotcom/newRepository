package POM_DDF_utilityClass_BaseClass;

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

public class UtilityClass
{
	 
	   public  static String getDataExcel(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	   {
		    FileInputStream file= new  FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
		        Sheet sh=WorkbookFactory.create(file).getSheet("ddf");
		       String Value=  sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		         return Value;
	   }
	   
	   public static  void capturescrren(WebDriver driver ,int TCID) throws IOException
	   {
		   File src=  (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File des= new File("C:\\Users\\Dell\\eclipse-workspace\\frameworkAPI\\TestCaseID"+TCID+".jpg");
		    FileHandler.copy(src,des);
	   }

}
