package keywordkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/checkboxxpathgrp.html");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("a1"));
		ele.sendKeys(Keys.SPACE);
		WebElement ele1=driver.findElement(By.id("a2"));
		ele1.sendKeys(Keys.SPACE);
		WebElement ele2=driver.findElement(By.id("a3"));
		ele2.sendKeys(Keys.SPACE);
		WebElement ele3=driver.findElement(By.id("a4"));
		ele3.sendKeys(Keys.SPACE);
		WebElement ele4=driver.findElement(By.id("a5"));
		ele4.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		WebElement ele5=driver.findElement(By.id("a5"));
		ele5.sendKeys(Keys.SPACE);
		WebElement ele6=driver.findElement(By.id("a4"));
		ele6.sendKeys(Keys.SPACE);
		WebElement ele7=driver.findElement(By.id("a3"));
		ele7.sendKeys(Keys.SPACE);
		WebElement ele8=driver.findElement(By.id("a2"));
		ele8.sendKeys(Keys.SPACE);
		WebElement ele9=driver.findElement(By.id("a1"));
		ele9.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		driver.quit();
	}
}
