package getwindowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DedicatedTab {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		String P_id = driver.getWindowHandle();
		Set<String> allwd = driver.getWindowHandles();
		for (String wh : allwd)
		{
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		if(title.equals("Browser Windows"))
		{
			driver.close();
		}
		}
		
	}
}

