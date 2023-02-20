package seleinumrnjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("http://www.ebay.in/");
	driver.get("https://demo.opencart.com/");
	WebElement ele= driver.findElement(By.linkText("Desktops"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.linkText("Mac (1)")).click();
	}

}
