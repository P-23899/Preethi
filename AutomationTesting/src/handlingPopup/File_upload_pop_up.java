package handlingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_pop_up 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //section[text()='File Uploads']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("fileInput"));
		ele.sendKeys("\"C:\\Users\\Admin\\Desktop\\Preethi G S.docx\"");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Upload File']")).sendKeys("\"C:\\Users\\Admin\\Desktop\\Preethi G S.docx\"");  
		
		
		
		}
}
