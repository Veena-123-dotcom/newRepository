package ExcelPrograme;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_excelProgramee
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
      FileInputStream file= new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
            Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3");
              int size=sh.getLastRowNum();
              for(int i=0;i<=size;i++)
              {
            int cellSize= sh.getRow(0).getLastCellNum();
              for(int j=0;j<=cellSize-1;j++)
              {
            	  Cell ch=  sh.getRow(i).getCell(j);
            	  CellType type= ch.getCellType();
            	  if(type==CellType.STRING)
            	  {
            		System.out.print(ch.getStringCellValue()+" ");
            	  }
            	  else if(type==CellType.NUMERIC)
            	  {
            	System.out.print(ch.getNumericCellValue()+" ");
            	  }
            	  else if(type==CellType.BOOLEAN)
            	  {
            		System.out.print(ch.getBooleanCellValue()+" ");
            	  }
            	  
              }
              System.out.println();
              }

	
	}
}