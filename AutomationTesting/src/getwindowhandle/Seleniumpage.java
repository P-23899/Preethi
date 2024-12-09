package getwindowhandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumpage 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		 WebElement e = driver.findElement(By.xpath("//span[.='Downloads']"));
		 WebElement e1 = driver.findElement(By.xpath("//span[.='Documentation']"));
	     WebElement e2 = driver.findElement(By.xpath("//span[.='Projects']"));
	     WebElement e3 = driver.findElement(By.xpath("//span[.='Support']")); 
	     WebElement e4 = driver.findElement(By.xpath("//span[.='Blog']"));
	     
	     ArrayList<WebElement> l= new ArrayList<WebElement>();
	     l.add(e);
	     l.add(e1);
	     l.add(e2);
	     l.add(e3);
	     l.add(e4);
	     
	    
	     
	     Actions act=new Actions(driver);
	     
	     Robot r=new Robot();
	     
	     for (WebElement g : l)
	     {	
	     act.contextClick(g).perform();
	     r.keyPress(KeyEvent.VK_T);
	     r.keyRelease(KeyEvent.VK_T);
	     Thread.sleep(2000);	
	     System.out.println(driver.getTitle());
	     }
	     
	     
	     Set<String> w = driver.getWindowHandles();
	     ArrayList<String> a= new ArrayList<String>(w);//parameterised we will mention getwindowhandles refernce var
	     String v = a.get(5);
         driver.switchTo().window(v);
         driver.close();
          
	     Thread.sleep(5000);
	     driver.quit();
	     
}
}