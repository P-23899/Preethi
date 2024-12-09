package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dummy
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://demoapps.qspiders.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(3000);
	WebElement ele= driver.findElement(By.id("name"));
	boolean b = ele.isDisplayed();
	if(b)
	{
		System.out.println("is displayed");   
	}
	else
	{
		System.out.println("not displayed");
	}
	
	WebElement ele1=driver.findElement(By.xpath("//input[@name='name']"));
	 boolean b1 = ele1.isEnabled();
	 if(b1)
	 {
		 System.out.println("is enabled");
	 }
	 else
	 {
		 System.out.println("is not enabled");
	 }
	 boolean b3 = ele.isSelected();
	 if(b3)
	 {
		 System.out.println("element selected");
	 }
	 else
	 {
		 System.out.println("element not selected");
	 }
	 
	 WebElement ele2=driver.findElement(By.xpath("//p[text()='Actions']"));
	 Point p = ele2.getLocation();
	 System.out.println(p);
	 System.out.println(p.getX());
	 System.out.println(p.getY());	 
	 String fsize = ele2.getCssValue("font-size");
	 System.out.println(fsize);	 
	 int h = ele2.getSize().getHeight();
	 System.out.println(h); 
	 int w = ele2.getSize().getWidth();
	 System.out.println(w);	 	 
	 driver.navigate().to("https://www.instagram.com/");
	 Thread.sleep(3000);
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.navigate().forward();
	 Thread.sleep(3000);
	 driver.navigate().refresh();
	 Thread.sleep(3000);	 
	 Dimension d=new Dimension(300,450);
	 driver.manage().window().setSize(d);
	 Point p1= new Point(300,400);
	 driver.manage().window().setPosition(p1);	 
	 driver.quit();	 
}
}
