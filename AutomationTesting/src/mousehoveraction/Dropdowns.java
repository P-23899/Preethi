package mousehoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	Thread.sleep(3000);
	WebElement le = driver.findElement(By.id("select3"));
	Select s= new Select(le);
	Thread.sleep(3000);
	s.selectByIndex(5);
	driver.quit();
	}
}
