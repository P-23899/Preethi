package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import generic.Genericphoto;

public class Scrolldownupandss 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		    System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    driver.get("https://www.amazon.in/");
		    WebElement el = driver.findElement(By.xpath("//a[.='Instagram']"));
		    
		    Point p = el.getLocation();
		    int x=p.getX();
		    System.out.println(x);
		    int y = p.getY();
		    System.out.println(y);
		    
		    JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
			
			TakesScreenshot ts=(TakesScreenshot) driver;
   	    	File src=el.getScreenshotAs(OutputType.FILE);
			
    	    String photo="./photo/";
   	        Date d=new Date();		
	        String d1 = d.toString();
	      	String d3 = d1.replaceAll(":","-");
			File dst=new File(photo+d3+"el1.jpeg");
			FileHandler.copy(src, dst);
			Thread.sleep(2000);
			
			WebElement el2 = driver.findElement(By.xpath("//a[.=' Electronics ']"));
			
			Point p1 = el.getLocation();
		    int x1=p1.getX();
		    System.out.println(x1);
		    int y1 = p1.getY();
		    System.out.println(y1);
		    Thread.sleep(2000);
			
		    js.executeScript("window.scrollBy(-"+x1+",-"+y1+")");
			File src1= el2.getScreenshotAs(OutputType.FILE); 
			File dst1=new File(photo+d3+"el2.jpeg"); 
			FileHandler.copy(src1,dst1); 
			Thread.sleep(2000);
					
			js.executeScript("window.scrollBy("+x1+","+y1+")");
			Genericphoto.getPhoto(driver);
			Thread.sleep(2000);
				
			driver.quit();			
	}
}




