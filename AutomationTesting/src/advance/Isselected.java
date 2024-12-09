package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isselected 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
Thread.sleep(4000);
WebElement ele= driver.findElement(By.id("domain1"));
boolean b = ele.isSelected();
if(b)
{
	System.out.println("element selected");
}
else
{
	System.out.println("element not selected");
}
}
}
