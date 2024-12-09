package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script01 
{
public static void main(String[] args) throws InterruptedException
{
String key="webdriver.chrome.driver";
String value="./softwares/chromedriver.exe";
System.setProperty(key, value);
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.zara.com/");
Thread.sleep(2000);
driver.findElement(By.tagName("text")).click();	
}
}
