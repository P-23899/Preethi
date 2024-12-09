package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findelements1 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");	
WebDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/checkboxxpathgrp.html");
Thread.sleep(3000);
List<WebElement> check = driver.findElements(By.xpath("//input"));
int count = check.size();
for(int i=0;i<count;i++)
{
	 WebElement we = check.get(i);
	  we.click();
}
Thread.sleep(3000);
int count1 = check.size();
for(int i=count1-1;i>=0;i--)
{
	 WebElement we = check.get(i);
	  we.click();
}
Thread.sleep(3000);
driver.navigate().to("file:///C:/Users/Admin/Desktop/html(adv%20selenium)/selenium.html");
Thread.sleep(3000);
List<WebElement> text = driver.findElements(By.xpath("//input"));
 int count2 = text.size();
 for(int i=0;i<count2;i++)
 {
	WebElement w = text.get(i);
	w.sendKeys("Preethi");
 }
 Thread.sleep(3000);

 int count3 = text.size();
 for(int i=count3;i<=0;i--)
 {                     
	WebElement w = text.get(i);
	w.clear();
 }
 Thread.sleep(3000);
driver.quit();
}
}








