package mousehoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.id("box5"));
		WebElement dst = driver.findElement(By.id("box105"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		Thread.sleep(3000);
		driver.quit();
		}
}
