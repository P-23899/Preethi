package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiframe
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/main.html");
		Thread.sleep(3000);
		WebElement usn = driver.findElement(By.xpath("//input[@text='type']"));
		usn.sendKeys("preethi");
		Thread.sleep(3000);
		driver.switchTo().frame("f1");
		WebElement mob = driver.findElement(By.xpath("//input[@text='type']"));
		mob.sendKeys("9836521");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame("f2");
		WebElement mail = driver.findElement(By.xpath("//input[@text='type']"));
		mail.sendKeys("Preethi@23");
		Thread.sleep(3000);
		driver.quit();
	}
}
