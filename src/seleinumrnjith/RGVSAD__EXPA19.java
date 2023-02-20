package seleinumrnjith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RGVSAD__EXPA19 {

	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\user\\Downloads\\chromedriver_win32.zip\"");
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
	}
	public void Navigate() throws InterruptedException
	{
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		 RGVSAD__EXPA19 reddy=new  RGVSAD__EXPA19();
		 reddy.LaunchAUT();
		 reddy.Navigate();

	}

}
