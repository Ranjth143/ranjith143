package seleinumrnjith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RGVSAD_EXP19 {

	static WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32.zip");
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    
	}
	public void Navigete() throws InterruptedException
	{
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}
		
	public static void main(String[] args) throws InterruptedException {
		RGVSAD_EXP19 obj= new RGVSAD_EXP19 ();
		obj.LaunchAUT();
		obj.Navigete();
	}

}
