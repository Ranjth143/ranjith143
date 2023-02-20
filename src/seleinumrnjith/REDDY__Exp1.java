package seleinumrnjith;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class REDDY__Exp1 {
WebDriver driver;

	void LaunchAut()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	}
	
	void senddata()
	{
	driver.	findElement(By.id("Search for products, brands and more")).sendKeys("shoes");
	driver.findElement(By.id("fdprocessedid=\"abiw5q\"")).click();
	}

	

	public static void main(String[] args) {
		REDDY__Exp1 r=new REDDY__Exp1();
		r.LaunchAut();
		r.senddata();
		
	}

}
