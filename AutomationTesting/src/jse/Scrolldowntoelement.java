package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolldowntoelement 
{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
    WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
    Point p = ele.getLocation();
    int y = p.getY();
    JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,"+y+")");
	ele.sendKeys(Keys.ENTER);
    //driver.quit();
}
}
