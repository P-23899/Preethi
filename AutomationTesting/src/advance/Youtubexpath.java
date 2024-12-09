package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtubexpath
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
 //driver.get("https://www.youtube.com/");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("devara");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//button[@title='Search']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//video[@class='video-stream html5-main-video']")).click();
driver.get("https://www.youtube.com/results?search_query=devara");
Thread.sleep(8000);
driver.findElement(By.xpath("//a[@title='Chuttamalle | Devara Second Single | NTR | Janhvi Kapoor | Anirudh Ravichander | Shilpa Rao | 27 Sep']")).click();
Thread.sleep(8000);

driver.quit();
}
}
