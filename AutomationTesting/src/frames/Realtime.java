package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Realtime {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	Thread.sleep(3000);
	WebElement f1= driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
	driver.switchTo().frame(f1);
	Thread.sleep(5000);
	WebElement b = driver.findElement(By.xpath("//input[@type='email']"));
	b.sendKeys("preethi@23");
	Thread.sleep(5000);
	WebElement c = driver.findElement(By.xpath("//input[@type='password']"));
	c.sendKeys("pree@04");
	Thread.sleep(5000);
	WebElement d = driver.findElement(By.xpath("//input[@id='confirm-password']"));
	d.sendKeys("pree@04");
	Thread.sleep(5000);
	driver.switchTo().parentFrame();
	Thread.sleep(5000);
	WebElement f2= driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
	driver.switchTo().frame(f2);
	Thread.sleep(5000);
	WebElement e = driver.findElement(By.xpath("//input[@name='username']"));
	e.sendKeys("preethi@23");
	Thread.sleep(5000);
	WebElement f = driver.findElement(By.xpath("//input[@id='password']"));
	f.sendKeys("pree@23");
	Thread.sleep(5000);
	driver.quit();
}
}
