package Utils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 

import java.io.FileInputStream;
import java.io.IOException;

public class Excel{

	public static Object[][] getCredentials(String filePath) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0); 
		DataFormatter formatter=new DataFormatter();
		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getLastCellNum();

		Object[][] data=new Object[row-1][col];
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				data[i-1][j]=formatter.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}

		workbook.close();
		fis.close();
		return data;
	}

}
