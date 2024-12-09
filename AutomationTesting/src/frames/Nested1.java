package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nested1 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");	
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/Mainframe.html");
	Thread.sleep(3000);
	WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
	usn.sendKeys("Preethi");
	Thread.sleep(5000);
	//driver.switchTo().frame("f1");//by id
	//driver.switchTo().frame(0);//by index
	WebElement f1 = driver.findElement(By.xpath("//iframe[@id='f1']"));
	driver.switchTo().frame(f1);//address
	WebElement pwd = driver.findElement(By.xpath("//input[@type='text']"));
	pwd.sendKeys("Preethi@23");
	Thread.sleep(5000);
	driver.quit();
	}
}
