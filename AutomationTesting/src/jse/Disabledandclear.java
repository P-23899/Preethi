package jse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disabledandclear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/disabled.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('a1').value=''");
		Thread.sleep(2000);
		driver.quit();
	}
}
