package getwindowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.flipkart.com/");

Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
Thread.sleep(3000);

driver.findElement(By.xpath("//button[@type='submit']")).click();

driver.findElement(By.xpath("(//div[@class='Otbq5D'])[1]")).click();
Thread.sleep(3000);

 Set<String> s = driver.getWindowHandles();
for (String sh :s) 
{
	driver.switchTo().window(sh);
}

driver.findElement(By.xpath("//button[@type='button']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9999888800");
driver.findElement(By.xpath("//span[.='CONTINUE']")).click();
Thread.sleep(3000);

driver.quit();

}
}