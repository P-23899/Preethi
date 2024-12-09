package handlingPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndConfrimation
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("abs");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();//
		Thread.sleep(3000);
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(3000);
		driver.quit();
}
}
