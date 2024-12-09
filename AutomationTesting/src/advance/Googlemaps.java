package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlemaps 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/maps/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
Thread.sleep(8000);
driver.findElement(By.xpath("//input[@placeholder=\"Choose destination, or click on the map...\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder=\"Choose destination, or click on the map...\"]")).sendKeys("chittoor");
Thread.sleep(8000);
driver.findElement(By.xpath("(//button[@jsaction='directions.search;focus:pane.focusTooltip;blur:pane.blurTooltip'])[2]")).click();
Thread.sleep(8000);
driver.findElement(By.xpath("//h1[@id='section-directions-trip-title-0']")).click();
Thread.sleep(8000);
driver.quit();
}
}
