package seleinumrnjith;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rgvsadbasicsexp30{

WebDriver driver;
JavascriptExecutor jse;
public void lanchaut()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.in//");
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
}
void explicitywait()
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\\span[text()='Account&Lists']"))); 
	we.clear();
}
	
	public static void main(String[] args) {
		Rgvsadbasicsexp30 r=new Rgvsadbasicsexp30();
		r.lanchaut();
		r.explicitywait();
		
	}

}
