package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonlink 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	List<WebElement> li = driver.findElements(By.xpath("//a"));
	for(WebElement el:li)
	{
		System.out.println(el.getAttribute("href"));
	}
	driver.quit();
}
}


