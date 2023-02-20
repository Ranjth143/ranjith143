package seleinumrnjith;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rgvsadbasicsexp33 {
	WebDriver driver;
	JavascriptExecutor jse;
	void launchaut() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	
	void click() throws InterruptedException
	{
		WebElement loginclick =driver.findElement(By.id("login"));
		jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", loginclick);
		Thread.sleep(2000);
	}
	void senddata() throws InterruptedException
	{
		WebElement uname=driver.findElement(By.id("username"));
		
	jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].value='meenakshiabothula@gmail.com';", uname);
     Thread.sleep(2000);
     WebElement passw=driver.findElement(By.id("password"));

		jse.executeScript("arguments[0].value='meenakshiabothula@gmail.com';",passw);
	     Thread.sleep(2000);
	}
	void highlight()
	{
	     WebElement passw=driver.findElement(By.id("password"));
          jse.executeScript("arguments[0].style='border: 5px   solidred';",passw);
	}
	

	public static void main(String[] args) throws InterruptedException {
		Rgvsadbasicsexp33 m=new Rgvsadbasicsexp33();
		m.launchaut();
		m.senddata();
         m.click();
	m.highlight();
	}

}
