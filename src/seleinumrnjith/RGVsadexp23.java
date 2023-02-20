package seleinumrnjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RGVsadexp23 
{
	WebDriver driver;
	
	void launchaut() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	void senddata() throws InterruptedException
	{
		driver.findElement(By.xpath("//input [@ id=\"twotabsearchtextbox\"]")).sendKeys("collegebags");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);

	}
	public static void main(String[] args) throws InterruptedException
	{
		RGVsadexp23 r=new RGVsadexp23();
		r.launchaut();
		r.senddata();
		
	}

}
