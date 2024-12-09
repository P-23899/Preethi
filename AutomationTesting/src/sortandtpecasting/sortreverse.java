package sortandtpecasting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sortreverse 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
	WebElement lel = driver.findElement(By.id("month"));
	ArrayList<String> l=new ArrayList<String>();
	Select s = new Select(lel);
	List<WebElement> opt = s .getOptions();
	for( WebElement we:opt)
	{
		String text = we.getText();
		l.add(text);
	}
	Collections.sort(l,Collections.reverseOrder());
	for(String l1:l)
	{
		
		System.out.println(l1);
	}
	driver.quit();
	}
}
