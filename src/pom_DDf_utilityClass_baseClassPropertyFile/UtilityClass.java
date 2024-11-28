package pom_DDf_utilityClass_baseClassPropertyFile;
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
                public static String getExcelData(int rowindex, int colindex) throws EncryptedDocumentException, IOException
                {
               FileInputStream file= 	  new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
                  Sheet sh=  WorkbookFactory.create(file).getSheet("ddf");
                        String value=   sh.getRow(rowindex).getCell(colindex).getStringCellValue();
                          return value;
                }
                public static void cpatureScreenshot(WebDriver driver,int ID) throws IOException
                {
                	File Src= (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                 File    desFile = new File("C:\\Users\\Dell\\eclipse-workspace\\frameworkAPI\\Scrrensot12"+ID+".jpg");
                      FileHandler.copy(Src, desFile);
                }
                
                public static String  getPropetyFile(String Key) throws IOException
                {
      FileInputStream file =new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\frameworkAPI\\PropertyFile.properties");
                      Properties fileinput = new Properties();
                      fileinput.load(file);
                   String Value=   fileinput.getProperty(Key);
                     return Value;
                }
}
