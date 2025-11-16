package commonintegration;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIntegration {

	public static String[][] readData(String excelFileName) throws IOException {
		//Set up the path
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		//worksheet
		XSSFSheet ws = wb.getSheetAt(0);//indexstarts from 0
		
		//to find the row count
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		//to find the columncount
		int columnCount = ws.getRow(1).getLastCellNum();
		System.out.println(columnCount);
		//create 2D array
		String[][] data=new String[rowCount][columnCount];
		
		
		//all datas
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(stringCellValue2 );
				data[i-1][j]=stringCellValue2;
			}
		}
		wb.close();
		return data;
	}

}
