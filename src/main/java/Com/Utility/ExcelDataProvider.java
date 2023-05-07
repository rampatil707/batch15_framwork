package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider extends BaseClass{
	XSSFWorkbook wb;
	
	public void ExcelDataProvide() throws Exception {
		
		String path=config.getExcelDataPath();
		FileInputStream file=new FileInputStream(path);
		wb=new XSSFWorkbook(file);
	}

	 public String getStringdata_Excel(String SheetName,int Row,int Cell) {
		 return wb.getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();

	 }

}
