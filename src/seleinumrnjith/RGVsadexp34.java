package seleinumrnjith;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RGVsadexp34 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void launchAuT() throws InterruptedException
	{
		System.setProperty("webDriver.chrome.drver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
			}
	public void scroll_to_Top_to_bottom() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollTo(document.body.scrollHeght,0)");
		
	}
	 	public static void main(String[] args) throws InterruptedException {
	 		RGVsadexp34 ojb=new RGVsadexp34 ();
	 		ojb.launchAuT();
	 		ojb.scroll_to_Top_to_bottom();
	 		

	}

}
