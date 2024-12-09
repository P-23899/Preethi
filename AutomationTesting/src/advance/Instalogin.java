package advance;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instalogin 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver  driver =new ChromeDriver();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[name='username']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("pass")).sendKeys("Preethi");
driver.quit();

}
}
