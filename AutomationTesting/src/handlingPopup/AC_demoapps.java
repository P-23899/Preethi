package handlingPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AC_demoapps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert2")).click(); //default alert
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Confirm']")).click(); //confirm alert
	Thread.sleep(3000);
	driver.findElement(By.id("buttonAlert5")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Prompt']")).click(); //prompt
	Thread.sleep(3000);
	driver.findElement(By.id("buttonAlert1")).click();
	Thread.sleep(2000);
    Alert ab = driver.switchTo().alert();
     ab.sendKeys("yes");
    System.out.println(ab.getText());
    Thread.sleep(2000);
	 ab.accept();
	 Thread.sleep(2000);
	 driver.quit();
}
}