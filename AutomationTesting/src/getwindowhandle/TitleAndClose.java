package getwindowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndClose 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://skpatro.github.io/demo/links/");
driver.findElement(By.name("NewWindow")).click();
Set<String> allwh = driver.getWindowHandles();
System.out.println(allwh.size());
for (String wh : allwh) 
{
driver.switchTo().window(wh);
System.out.println(driver.getTitle());
driver.close();
}
driver.quit();
}
}
