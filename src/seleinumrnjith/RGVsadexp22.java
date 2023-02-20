package seleinumrnjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RGVsadexp22 {
	
	WebDriver driver;
	public void LanchAUT() throws InterruptedException
	{
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void senddata() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#email")).sendKeys("8987675456");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("wdjbv");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=login]")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		RGVsadexp22 obj=new RGVsadexp22();
		obj.LanchAUT();
		obj.senddata();

	}

}
