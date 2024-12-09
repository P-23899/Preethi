package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facbookmonth {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
	WebElement lel = driver.findElement(By.id("month"));
	Select s1=new Select(lel);
	Thread.sleep(3000);
	List<WebElement> opt1 = s1.getOptions();
	System.out.println(opt1.size());
	Thread.sleep(3000);
	
	driver.quit();
	}
}
