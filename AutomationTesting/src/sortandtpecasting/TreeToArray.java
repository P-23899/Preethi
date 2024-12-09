package sortandtpecasting;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeToArray
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement le = driver.findElement(By.id("month"));
		Select s = new Select(le);
		List<WebElement> opt = s .getOptions();	
		TreeSet<String> t=new TreeSet<String>(); 
		for(WebElement we:opt)
		{
			String o=we.getText();
			t.add(o);
		}
	    ArrayList<String> l=new ArrayList<String>(t);
		for(String k:l)
		{	

			System.out.println(k);
		}
	driver.quit();
	}
}
