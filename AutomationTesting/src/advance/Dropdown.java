package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/dropdown.html");
	WebElement le = driver.findElement(By.id("nandanas"));
	Select s=new Select(le);
	Thread.sleep(3000);
	s.selectByIndex(2);
	Thread.sleep(3000);
	s.selectByValue("n");
	Thread.sleep(3000);
	s.selectByVisibleText("Chitra");
	s.deselectAll();
    Thread.sleep(3000);
	 driver.quit();		
}
}

