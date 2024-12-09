package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityFacebook
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
     	driver.get("https://www.facebook.com/");
     	
     	//Title
       /* String t = driver.getTitle();
        System.out.println(t);
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
        driver.findElement(By.id("email")).sendKeys("pree11@gmail.com"); */
     	
      //URl 
     /*	System.out.println(driver.getCurrentUrl());
     	WebDriverWait wait=new WebDriverWait(driver, 20);
     	wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
     	 driver.findElement(By.id("email")).sendKeys("pree11@gmail.com"); */
     	
     	//visibility of element
        WebDriverWait wait=new WebDriverWait(driver, 20);
        WebElement e = driver.findElement(By.id("email"));
        wait.until(ExpectedConditions.visibilityOf(e));
        e.sendKeys("pree11@gmail.com");
        
        driver.quit();
	}
}
