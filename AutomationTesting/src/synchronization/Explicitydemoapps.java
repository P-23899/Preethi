package synchronization;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitydemoapps 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
 	driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
 	
    // driver.findElement(By.xpath("//button[.='Start']")).click();
 	
 	WebElement e = driver.findElement(By.xpath("//button[.='Start']"));
 	WebDriverWait wait=new WebDriverWait(driver, 50);
 	wait.until(ExpectedConditions.visibilityOf(e));
 	e.click();
 	
 	driver.findElement(By.xpath("//button[.='Reset']")).click();

  	
 	//with Element....
 	driver.findElement(By.xpath("//a[.='With Element']")).click();
 	WebDriverWait wai=new WebDriverWait(driver, 50);
 
    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("2");
 	WebElement i = driver.findElement(By.xpath("//button[.='Start']"));
 	WebDriverWait wa1=new WebDriverWait(driver, 20);
 	wa1.until(ExpectedConditions.visibilityOf(i));
 	i.click();
 	
 	
 	WebElement j = driver.findElement(By.xpath("//p[.='Do you like Automation']"));
 	String p = "./photo/";
 	Date d=new Date();
	String d1 = d.toString();
	String d2 = d1.replaceAll(":","-");
	File src=j.getScreenshotAs(OutputType.FILE);
	File dst=new File(p+d2+".jpeg");
	FileHandler.copy(src, dst);
 		
}
}