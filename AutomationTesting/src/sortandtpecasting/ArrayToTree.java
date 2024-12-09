package sortandtpecasting;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrayToTree {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement le = driver.findElement(By.id("month"));
		Select s = new Select(le);
		List<WebElement> opt = s .getOptions();
		ArrayList<String> l=new ArrayList<String>();	
		
		for(WebElement we:opt)
		{
			String o=we.getText();
			l.add(o);
		}
	    TreeSet<String> t=new TreeSet<String>(l); 
		for(String k:t)
		{		
			System.out.println(k);
		}
		
	driver.quit();
	}

}
