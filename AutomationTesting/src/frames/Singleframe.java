package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/frames2.html");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dataxmbcvjd");
	//driver.switchTo().frame(0); //index
	//driver.switchTo().frame("f1"); //id
	WebElement f2=driver.findElement(By.xpath("//iframe[@id='f1']")); //address
	driver.switchTo().frame(f2);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("data@113");
	
	driver.quit();
	}
}
