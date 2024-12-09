package keywordkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textfield {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/selenium.html");
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.id("a1"));
	ele.sendKeys("Selenium");
	WebElement ele1=driver.findElement(By.id("a2"));
	ele1.sendKeys("Selenium");
	WebElement ele2=driver.findElement(By.id("a3"));
	ele2.sendKeys("Selenium");
	WebElement ele3=driver.findElement(By.id("a4"));
	ele3.sendKeys("Selenium");
	WebElement ele4=driver.findElement(By.id("a5"));
	ele4.sendKeys("Selenium");
	Thread.sleep(2000);
	ele4.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	ele3.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	ele2.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	ele1.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	driver.quit();
	}
}
