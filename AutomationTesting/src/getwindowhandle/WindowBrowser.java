package getwindowhandle;


import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowBrowser 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		
	    driver.findElement(By.id("browserLink1")).click();
	    Thread.sleep(2000);
	    
	    String d = driver.getWindowHandle();
	    Set<String> w = driver.getWindowHandles();
	    for (String s : w) 
	    {
		driver.switchTo().window(s);	
		}

	   Thread.sleep(2000);
	   WebElement s = driver.findElement(By.id("email"));
	   s.sendKeys("Pree@23");  
	   Thread.sleep(2000);
	   driver.close();
	   
	   driver.switchTo().window(d);
	   
	   driver.findElement(By.xpath("//a[.='New Tab']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//button[.='Open window in new Tab']")).click();
	   Thread.sleep(2000);
	    
	    Set<String> w1 = driver.getWindowHandles();
	    w1.remove(d);
	    for (String s1 : w1) 
	    {
		driver.switchTo().window(s1);	
		}
		Thread.sleep(2000);
		 
	    WebElement s2 = driver.findElement(By.id("email"));
		s2.sendKeys("Pree@23");  
		Thread.sleep(2000);
		driver.close();
		   
	    driver.switchTo().window(d);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[.='Multiple Windows']")).click();
		Thread.sleep(2000);  
		
		driver.findElement(By.xpath("//button[.='Click to open multiple popup windows']")).click();
		Thread.sleep(2000);
		
		Set<String> w2 = driver.getWindowHandles();
		w2.remove(d);
		System.out.println(w2.size());
	    for (String s3 : w2) 
	    {
		driver.switchTo().window(s3);
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		}
		Thread.sleep(2000);	 
		
		driver.switchTo().window(d);
		
		driver.findElement(By.xpath("//a[.='Multiple Tabs']")).click();
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//button[.='Click to open multiple tabs']")).click();
		Thread.sleep(2000); 
		
		Set<String> w3 = driver.getWindowHandles();
		w3.remove(d);
	    for (String s5 : w3) 
	    {
		driver.switchTo().window(s5);
		Thread.sleep(2000);
		driver.close();
		}
		Thread.sleep(4000);
		
		driver.quit();
		 	
}
}


