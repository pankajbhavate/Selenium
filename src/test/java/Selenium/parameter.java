package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class parameter {                // ‪‪C:\Users\DELL\Documents\email.xlsx

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		FileInputStream ff = new FileInputStream("C:\\Users\\DELL\\Documents\\email.xlsx");
		 XSSFWorkbook f =  new XSSFWorkbook(ff);
		  XSSFSheet sheet =     f.getSheet("Sheet1"); 
		   int row =  sheet.getLastRowNum();
		   int col =  sheet.getRow(0).getLastCellNum();
		   for(int r=1;r<=row;r++) {
			 XSSFRow rr =     sheet.getRow(r);
			 if(rr==null) {
				 System.out.print("");
				 continue;}
			 for(int c=0;c<col;c++) {
			XSSFCell cc= 	rr.getCell(c);
				 if(cc==null) {
					 System.out.print("");
					 continue;}
				 switch (cc.getCellType()) {
				case STRING:
					System.out.print(cc.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cc.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cc.getBooleanCellValue());
				 break;
				 default:
					 System.out.print("kk");
				 }
					 System.out.print("||");}
				 System.out.println();
				 System.out.println();
			 
			 
			 
					
					
				
					 
					 
					 
				 }
			 }
			 
			 
			 
			 
			 
	}
	


