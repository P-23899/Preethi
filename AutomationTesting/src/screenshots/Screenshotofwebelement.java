package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotofwebelement {

	public static void main(String[] args) throws InterruptedException, IOException  
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		WebElement le = driver.findElement(By.id("email"));
		File src= le.getScreenshotAs(OutputType.FILE); 
		File dst=new File("C:\\Users\\Admin\\Videos\\screenshot\\tc2.jpeg"); 
		FileHandler.copy(src,dst); 
		driver.quit();		
}
}
