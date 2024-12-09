package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	
	 WebElement i = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
	 i.click();
	 
	 WebElement t = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
	 String title = t.getText();
	 System.out.println(title);
	 Thread.sleep(2000);
	 WebElement h = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/following-sibling::div[2]"));
	 String tit = h.getText();
	 System.out.println(tit);
     driver.findElement(By.xpath("//button[.='ADD TO CART']")).click();
     Thread.sleep(2000);
     
     driver.findElement(By.id("shopping_cart_container")).click();
     Thread.sleep(2000);
                                                   
     WebElement t1 = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	 String title1 = t1.getText();
	 System.out.println(title1);
	 Thread.sleep(2000);
	 WebElement h1 = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
	 String tit1 = h1.getText();
	 System.out.println(tit1);
	 
	 if(tit==tit1 && title==title1)
	 {
		 System.out.println("same");
		 
	 }
	 else
	 {
		 System.out.println("not same");
	 }

	 driver.findElement(By.xpath("//button[.='Open Menu']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("logout_sidebar_link")).click();
	 Thread.sleep(2000);
	  
     driver.quit();
}
}
