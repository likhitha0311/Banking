package generic;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
	public class Excel extends Base_Test2
	{
	public static String getcellvalue(String path , String sheet) 
		// TODO Auto-generated method stub
		{
			String v="";
			try {
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			 
			Sheet sh=wb.getSheet(sheet);
		
			int r=sh.getLastRowNum();
			
			for(int i=1;i<=r;i++)
			{
			
			Row r1=sh.getRow(i);
			
		int c=r1.getLastCellNum();
		for(int j=0;j<c;j++)
		{
			Cell  cellvalue=r1.getCell(j);
		v=cellvalue.getStringCellValue();
		System.out.println(v);
		}
			}
			}
		catch (Exception e) 
		{
			
		}

			
		return v;
	}

	
		
	}
		


