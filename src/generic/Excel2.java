package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	static String path="C:\\Banking\\Flipkart\\excel\\data.xlsx";
	static Workbook wb;
	static Sheet sh;
	
	public static Object[][] getcellvalue(String sheet) 
	
	{
		try {
		FileInputStream fis=new FileInputStream(path);
		 wb=WorkbookFactory.create(fis);
		 
		 sh=wb.getSheet(sheet);
		}
		
		catch(Exception e)
		{
		}
		Object[][] v=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		int r=sh.getLastRowNum();
		
		for(int i=0;i<=r;i++)
		{
		Row r1=sh.getRow(i+1);
		int c=r1.getLastCellNum();
	for(int j=0;j<=c;j++)
	{
		Cell  cellvalue=r1.getCell(j);
		
	v[i][j]=cellvalue.getStringCellValue();
	System.out.println(v);
	}
		
		}
		
	return v;
}

	

	}


