package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Heightandwidth 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
	int h = ele.getSize().getHeight();
	System.out.println(h);
	 int w = ele.getSize().getWidth();
	 System.out.println(w);
     String fsize = ele.getCssValue("font-size");
    System.out.println(fsize);
    WebElement ele1=driver.findElement(By.xpath("//a[.='తెలుగు']"));
    System.out.println(ele1.getAttribute("title"));
    Point p = ele.getLocation();
    System.out.println(p);
    System.out.println(p.getX());
    System.out.println(p.getY());
    driver.quit();
}
}
