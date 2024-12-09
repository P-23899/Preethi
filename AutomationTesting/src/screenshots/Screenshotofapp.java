package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotofapp 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=movies");
		Thread.sleep(4000);
		TakesScreenshot ts= (TakesScreenshot) driver; //step1//dependacny of application 
		File src= ts.getScreenshotAs(OutputType.FILE); //step2
		File dst=new File("C:\\Users\\Admin\\Videos\\screenshot\\tc.jpeg"); //step3
		FileHandler.copy(src,dst); //step4
		driver.quit();
		}	
}
