package getwindowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddOfParentBrowser 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	String pra = driver.getWindowHandle();
	System.out.println(pra);
	driver.quit();
}
}
