package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nested2 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/Usn.html");
	Thread.sleep(3000);
	WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
	usn.sendKeys("preethi");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	WebElement pwd = driver.findElement(By.xpath("//input[@type='text']"));
	pwd.sendKeys("Pree@23");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
	mob.sendKeys("9112345");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("pre23@.com");
	Thread.sleep(3000);
	driver.switchTo().parentFrame();
	WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
	b.clear();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	WebElement c = driver.findElement(By.xpath("//input[@type='text']"));
	c.clear();
	Thread.sleep(3000);
	driver.quit();
	}
}
