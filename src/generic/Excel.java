package generic;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	public class Excel extends Base_Test2
	{
	public static String getcellvalue(String path , String sheet, int row, int cell) 
		// TODO Auto-generated method stub
		{
			String v="";
			try {
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			 
			Cell c=wb.getSheet(sheet).getRow(row).getCell(cell);
			//c.getStringCellValue();
			v=c.getStringCellValue();
		}
			
		catch (Exception e) 
		{
			
		}

			
		return v;
	}

	
		
	}


