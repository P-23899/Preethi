package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookxpath 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='email']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Prethireddy@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Preethi@04");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.quit();
}
}

