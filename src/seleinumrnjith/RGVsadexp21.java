package seleinumrnjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;

public class RGVsadexp21 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		Thread.sleep(2000);
		driver.manage().window().maximize();		
	}
	public void ClickOk() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	}
	public void ClickON_canel() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	}
	public void senData() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Bossisback143@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public void Get_text() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(3000);
		String data =driver.switchTo().alert().getText();
		System.out.println(data);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
	}
	public void CloseAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		RGVsadexp21 obj = new RGVsadexp21();
		obj.LaunchAUT();
		obj.ClickOk();
		obj. ClickON_canel();
		obj.senData();
		obj.Get_text();
		obj.CloseAUT();
		
	}

}
