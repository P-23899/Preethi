package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(3000);
	WebElement le = driver.findElement(By.id("year"));
	Select s=new Select(le);
	Thread.sleep(3000);
	List<WebElement> opt = s.getOptions();
	System.out.println(opt.size());
	Thread.sleep(3000);
	for(WebElement we:opt)
	{
		
		System.out.println(we.getText());
	}
	
	
	 driver.quit();		

	
	
	}
}

