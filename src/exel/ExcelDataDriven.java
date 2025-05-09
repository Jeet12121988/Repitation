package exel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ExcelDataDriven {
	
	@Test
	public void a() {
		
	}

	public static void main(String[] args) throws IOException {
		
		
		File file=new File("C:\\Users\\USER\\Documents\\uacc.xlsx");
		FileInputStream fis=new FileInputStream(file);

		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet sheet=wb.getSheetAt(0);
			System.out.println(sheet.getSheetName());;
				int count=wb.getNumberOfSheets();
				System.out.println(count);
				for(int i=0;i<count;i++) {
					
					if(wb.getSheetName(i).equalsIgnoreCase("jeet")) {
						
				        
						Iterator<Row> it=sheet.rowIterator();
						if(it.hasNext()) {
							
						Row rowName=it.next();
						Iterator<Cell> itc=rowName.cellIterator();
						int k=0;
						int column=0;
						while(itc.hasNext()) {
						Cell c1=itc.next();
						if(c1.getStringCellValue().equalsIgnoreCase("Password")) {
							column=k;
						}
						k++;
						}
					
						System.out.println("column number is-"+column);
						//HI this is to commit
						// How are you
						}
						
						
					}
					
						
					
					
					
				}
		}
		

	}

}
