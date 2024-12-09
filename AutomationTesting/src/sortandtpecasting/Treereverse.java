package sortandtpecasting;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Treereverse 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement lel = driver.findElement(By.id("month"));
		TreeSet<String> l=new TreeSet<String>(Collections.reverseOrder());
		Select s = new Select(lel);
		List<WebElement> opt = s .getOptions();
		for( WebElement we:opt)
		{
			String text = we.getText();
			l.add(text);
		}
		for(String l1:l)
		{
			System.out.println(l1);
		}
		driver.quit();
	}
}
