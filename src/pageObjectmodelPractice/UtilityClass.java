package pageObjectmodelPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	//this method use to test data from excel sheet
	// need to pass 2 inputs 1:rowindex 2:coloumn index
	public static String getTD(int rowIndex ,int ColIndex) throws EncryptedDocumentException, IOException //loading the sheet data,load the data,fetech data screenshot the data
	{
		  FileInputStream file=new   FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
           Sheet    sh=    WorkbookFactory.create(file).getSheet("ddf"); //its limited throwout the method only..
           // that y we declared as local method
             String Value=   sh.getRow(rowIndex).getCell(ColIndex).getStringCellValue();
              return Value;  /// this method is method with retrun type
	}

}
