package seleinumrnjith;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 

public class RGVsadexp034 {
	WebDriver driver;
	 JavascriptExecutor jse;
	 public void LaunchAUT() throws InterruptedException
	 {
		 System.setProperty("webDriver.chrome.drver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(4000);
		 driver.manage().window().maximize();
		 
	 }
	 public void scroll_To_Top_To_Bottom() throws InterruptedException
	 {
		 jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(4000);
			jse.executeScript("window.scrollTo(document.body.scrollHeght,0)");
	 }		


	public static void main(String[] args) throws InterruptedException {
		RGVsadexp034 obj=new RGVsadexp034();
	    obj.LaunchAUT();
		obj.scroll_To_Top_To_Bottom();
	}

}
