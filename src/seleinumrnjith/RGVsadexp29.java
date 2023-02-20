package seleinumrnjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RGVsadexp29 {
	WebDriver driver;
	Actions actobj;
	
	public void LanuchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();		
	}
	public void mouse_Actions() throws InterruptedException
	{
		WebElement src=driver.findElement(By.linkText("Laptops & Notebooks"));
		WebElement des=driver.findElement(By.xpath("//a[text()=' Mac (1)']"));
		actobj=new Actions(driver);
		Thread.sleep(3000);
		actobj.moveToElement(src).moveToElement(des).click().build().perform();
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws InterruptedException {
		RGVsadexp29 obj=new RGVsadexp29 ();
		obj.LanuchAUT();
		obj.mouse_Actions(); 
				

	}

}
