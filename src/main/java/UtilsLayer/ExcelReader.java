package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static XSSFWorkbook workbook;
	
	public ExcelReader(String path) {
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String getData(int sheetIndex, int rows, int cells) {
		try {
			return workbook.getSheetAt(sheetIndex).getRow(rows).getCell(cells).getStringCellValue();
		}catch(Exception e) {
			return workbook.getSheetAt(sheetIndex).getRow(rows).getCell(cells).getRawValue();
		}
	}
	
	public int getRowCount(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getLastRowNum() + 1; 
	}
	
	public int getColumnCount(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}


}
