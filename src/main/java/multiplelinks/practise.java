package multiplelinks;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
           
		  FileInputStream ff = new FileInputStream("C:\\Users\\DELL\\Documents\\Data.xlsx");
		         XSSFWorkbook  file  =  new XSSFWorkbook(ff);
		      XSSFSheet  sheet  =     file.getSheet("Sheet1");
		        int  row  =  sheet.getLastRowNum();
		        int col   = sheet.getRow(1).getLastCellNum();
		        for(int r=0;r<=row;r++) {
		        XSSFRow  rr =	   sheet.getRow(r);
		          if(rr==null) {
		        	  System.out.println("empty");
		        	  continue;
		          }
		          for(int c=0;c<=col;c++) {
		        	 XSSFCell cc =   rr.getCell(c);
		        	 if(cc==null) {
		        		 System.out.println("emty");
		        		 continue;
		        	 }
		          
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
					System.out.println("kk");
					break;
				}
		          System.out.print("||");
		          
		          
		          
		          
		        }
		          System.out.println();
		          System.out.println();
		  
		  
		  
		    
	 
		        }}}
	  
	  
	
	