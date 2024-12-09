package dataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData 
{
public static void main(String[] args) throws IOException  
{
FileInputStream f=new FileInputStream("./Testdata/FacebookCredentials.xlsx");
XSSFWorkbook w = new XSSFWorkbook(f);
XSSFSheet s = w.getSheet("Sheet1");
int r=s.getLastRowNum();
for(int i=0; i<=r; i++)
{
	XSSFRow row = s.getRow(i);
	XSSFCell cel1 = row.getCell(0);
	String c1 = cel1.getStringCellValue();
	
	XSSFCell cel2 = row.getCell(1);
	String c2 = cel2.getStringCellValue();
	System.out.println(c1+" "+c2);	
}
w.close();
f.close();
}
}
