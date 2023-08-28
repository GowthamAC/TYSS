package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class adddata {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	int lastrow=2;
	int lastcell=2;
	for (int i = 0; i < lastrow; i++) {
		for (int j = 0; j < lastcell; j++) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Add data");
			String data = sc.nextLine();
			sheet.createRow(i).createCell(j).setCellValue(data);
		}
		
	}
	FileOutputStream fos=new FileOutputStream("./src/test/resources/data.xlsx");
	wb.write(fos);
	wb.close();
}
}
