package synchronization;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pageloading 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?scenario=1");
		WebElement le = driver.findElement(By.xpath("//a[.='Open In New Tab']"));
		le.click();
		Set<String> l = driver.getWindowHandles();
		for (String e : l) 
		{
		driver.switchTo().window(e);	
		}
		driver.findElement(By.id("email")).sendKeys("pree@11");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
		
}
}
