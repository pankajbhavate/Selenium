package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
      FileInputStream ff  = new FileInputStream("C:\\Users\\DELL\\Documents\\pankaj.xlsx");
     String m =   WorkbookFactory.create(ff).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	  System.out.println(m); 
	  
	}
}    // C:\\Users\\DELL\\Documents\\pankaj.xlsx
