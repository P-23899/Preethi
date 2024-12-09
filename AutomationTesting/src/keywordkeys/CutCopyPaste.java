package keywordkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CutCopyPaste
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/swap.html");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("a1"));
		ele.sendKeys(Keys.CONTROL+"a"+"x");
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.id("a3"));
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		WebElement ele3=driver.findElement(By.id("a2"));
		ele3.sendKeys(Keys.CONTROL+"a"+"x");
		Thread.sleep(3000);
		WebElement ele4=driver.findElement(By.id("a1"));
		ele4.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		WebElement ele5=driver.findElement(By.id("a3"));
		ele5.sendKeys(Keys.CONTROL+"a"+"x");
		Thread.sleep(3000);
		WebElement ele6=driver.findElement(By.id("a2"));
		ele6.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		driver.quit();
	}
}
