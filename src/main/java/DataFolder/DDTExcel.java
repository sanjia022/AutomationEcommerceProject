package DataFolder;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDTExcel {
	
	public String  GetValueFromExcel(String sheetName, int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\r88st\\eclipse-workspaces-selenium\\EcommerceAutomation\\DataFolder\\data.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String value =w1.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	
		return value;
		
	}

public String  GetNumericValueFromExcel(String sheetName, int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\r88st\\eclipse-workspaces-selenium\\EcommerceAutomation\\DataFolder\\data.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String value =NumberToTextConverter.toText(w1.getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue());
	
		return value;
		
	}
}
