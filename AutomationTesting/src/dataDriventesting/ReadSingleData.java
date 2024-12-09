package dataDriventesting;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadSingleData 
{
public static void main(String[] args) throws Exception
{
FileInputStream fis= new FileInputStream("./Testdata/FacebookCredentials.xlsx");//Location
XSSFWorkbook workbook=new XSSFWorkbook(fis); //openworkbook/access
XSSFSheet sheet = workbook.getSheet("Sheet1");//Sheet
XSSFRow row = sheet.getRow(5);//row index
XSSFCell cel = row.getCell(0);//cell(column) index
String val = cel.getStringCellValue();//Fetch
System.out.println(val);//Print value

XSSFCell ce = row.getCell(1);
String val1 = ce.getStringCellValue();

workbook.close();//close access
fis.close();//close location

System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login.php/");
WebElement le = driver.findElement(By.id("email"));
le.sendKeys(val);
WebElement e = driver.findElement(By.xpath("//input[@type='password']"));
e.sendKeys(val1);
Thread.sleep(3000);
WebElement h = driver.findElement(By.id("loginbutton"));
h.click();
Thread.sleep(3000);
driver.quit();
}
}
