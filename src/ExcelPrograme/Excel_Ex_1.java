package ExcelPrograme;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Ex_1 {
	  public static void main(String[]args) throws EncryptedDocumentException, IOException
	  {
		   FileInputStream file= new  FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
		        Sheet sh= WorkbookFactory.create(file).getSheet("Sheet2");
		                 
	  }
}
