package dataDriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateWriteDataInSingleData 
{
public static void main(String[] args) throws IOException
{
XSSFWorkbook book = new XSSFWorkbook();
XSSFSheet sheet = book.createSheet("Automation Framework");
XSSFRow row = sheet.createRow(0);
XSSFCell cel = row.createCell(0);
cel.setCellValue("Automation class");
FileOutputStream f=new FileOutputStream("./Testdata/FacebookCredentials.xlsx");
book.write(f);
book.close();
f.close();
}
}
