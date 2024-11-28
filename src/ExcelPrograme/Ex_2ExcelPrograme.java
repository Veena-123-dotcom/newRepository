package ExcelPrograme;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Ex_2ExcelPrograme 
  {
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
            FileInputStream file= new FileInputStream("D:\\selenium jar\\seleniumexceldata.xlsx");
             Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3");
              int size= sh.getLastRowNum();
              for(int i=0;i<=size;i++)
              {
            	int cellSize=  sh.getRow(0).getLastCellNum();
            	for(int j=0;j<=cellSize-1;j++)
            	{
            	Cell cll=  sh.getRow(i).getCell(j);
            	  CellType type=   cll.getCellType();
            	  if(type==CellType.STRING)
            	  {
            		String Value1=  cll.getStringCellValue();
            		System.out.print(Value1+" ");
            	  }
            	  else if(type==CellType.NUMERIC)
            	  {
            		double Value2=cll.getNumericCellValue();
            		System.out.print(Value2+" ");
            	  }
            	  else if(type==CellType.BOOLEAN)
            	  {
            	    Boolean value3=cll.getBooleanCellValue();
            	    System.out.print(value3+" ");
            	  }
            	}
               System.out.println();
  }
	

}
  }
