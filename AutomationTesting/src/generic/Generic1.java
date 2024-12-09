package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic1 {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		String photo="./photo/";
		Date d=new Date();
				String d1 = d.toString();
				String d2 = d1.replaceAll(":","-");
				TakesScreenshot ts=(TakesScreenshot) driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				File dst=new File(photo+d2+".jpeg");
				FileHandler.copy(src, dst);
				driver.quit();
}
}
