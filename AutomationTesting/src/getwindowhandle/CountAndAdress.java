package getwindowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAndAdress 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");	
	driver.findElement(By.name("NewWindow")).click();
	Set<String> allwh = driver.getWindowHandles();
	Thread.sleep(2000);
	System.out.println(allwh.size());
	for (String wh : allwh) 
	{
	System.out.println(wh);	
	}
	Thread.sleep(2000);
	driver.quit();
}
}
