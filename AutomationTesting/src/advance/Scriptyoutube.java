package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Scriptyoutube 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
driver.get("https://www.youtube.com/");
driver.findElement(By.cssSelector("input[id='search']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='search']")).sendKeys("harrypotter movie clips");
Thread.sleep(2000);
driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("video[class='video-stream html5-main-video']")).click();	
Thread.sleep(2000);

}
}

