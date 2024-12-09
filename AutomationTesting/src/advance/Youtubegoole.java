package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Youtubegoole {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.cssSelector("input[id='search']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("harrypotter movie clips");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("video[class='video-stream html5-main-video']")).click();
	driver.findElement(By.cssSelector("div[id='primary-inner']")).click();
	}
	}

