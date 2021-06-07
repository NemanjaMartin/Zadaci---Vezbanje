package domaci;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Zadatak {

	public static void main(String[] args) {
		
		int sum = 0;
		File f = new File("domacikopija.xlsx");
		
		try {
			InputStream is = new FileInputStream(f);
			
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			/*Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			int zadnjiIndex = sheet.getLastRowNum();*/
		    
			
			for (int i = 0; i < sheet.getLastRowNum() + 1; i++)  {
				 
			
				
				sum += sheet.getRow(i).getCell(0).getNumericCellValue();    
			}
			System.out.println(sum); 
			
			wb.close();
		} catch(  IOException e) {
			System.out.println("Fajl nije pronadjen");
			e.printStackTrace();
		}
		
		

	}

}
