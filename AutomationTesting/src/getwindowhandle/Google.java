package getwindowhandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Google
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		
        Actions act=new Actions(driver);
        act.contextClick(e).perform();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        Thread.sleep(2000);
        
        Set<String> w = driver.getWindowHandles();
        
        ArrayList<String> a= new ArrayList<String>(w);
        String v = a.get(1);
        driver.switchTo().window(v);
        Thread.sleep(2000);
        
    	System.out.println(w.size());
    	for (String wh : w) 
    	{
    	System.out.println(wh);	
    	}
        
        driver.quit();
        
}
}