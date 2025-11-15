package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//Set up the path
		XSSFWorkbook wb=new XSSFWorkbook("./data/createLead.xlsx");
		//worksheet
		XSSFSheet ws = wb.getSheetAt(0);//indexstarts from 0
		//locate the row
		String stringCellValue = ws.getRow(2).getCell(0).getStringCellValue();
		System.out.println(stringCellValue);
		//header row
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		//to find the row count
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		//to find the columncount
		int columnCount = ws.getRow(1).getLastCellNum();
		System.out.println(columnCount);
		//entire row
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			System.out.println(row);
		}
		//all datas
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue2 );
			}
		}

	}

}
