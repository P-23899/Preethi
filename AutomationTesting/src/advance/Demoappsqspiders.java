package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoappsqspiders
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver",".//softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).click();
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Preethi");
Thread.sleep(4000);
driver.findElement(By.xpath("//a[@href='/ui/button']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@id='btn']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//section[contains(.,'Link')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//section[contains(.,'Dropdown')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9876543210");
Thread.sleep(4000);
driver.findElement(By.xpath("//a[@href='/ui/radio']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='attended']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//section[contains(.,'Check Box')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='domain2']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//section[contains(.,'Toggle')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//span[@class='relative bg-orange-600 rounded-full w-9 h-4 transition duration-300 ease-in-out']")).click();
Thread.sleep(4000);
driver.quit();
}
}
