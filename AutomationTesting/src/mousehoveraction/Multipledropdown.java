package mousehoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	Thread.sleep(3000);
	WebElement y = driver.findElement(By.id("select-multiple-native"));
	Select s1= new Select(y);
	s1.selectByValue("Running Shoes");
	Thread.sleep(3000);
	s1.selectByVisibleText("Winter Coat");
	Thread.sleep(3000);
	driver.quit();
	}
}
