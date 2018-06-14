package scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("./excel/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 
		Cell c=wb.getSheet("Sheet1").getRow(0).getCell(0);
		//c.getStringCellValue();
		String v = c.getStringCellValue();
		System.out.println(v);
	}

}
