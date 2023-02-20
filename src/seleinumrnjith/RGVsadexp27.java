package seleinumrnjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RGVsadexp27 {
	WebDriver driver;
	Actions deiver;
	
	public void LanuchAUT() throws InterruptedException
	{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32.\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
       public void Right_Click()
      { 
	Actions actobj = new Actions(driver);
	WebElement we=driver.findElement(By.xpath("//*[@id=\'nav-xshop\']/a[3]"));
    	   
}
	public static void main(String[] args) {
		

	}

}
