package getwindowhandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OnePageToAnotherPage 
{
public static void main(String[] args) throws AWTException, InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    WebElement le = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
    Actions a=new Actions(driver);
    a.contextClick(le).perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_T);
    Thread.sleep(2000);
    
    Set<String> d = driver.getWindowHandles();
    for(String id:d)
    {
    	driver.switchTo().window(id); 
    	int count=d.size();
    	System.out.println(id);
    	System.out.println(count);
    }
    
    driver.quit(); 
}
}
