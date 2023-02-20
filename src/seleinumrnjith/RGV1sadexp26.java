package seleinumrnjith;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RGV1sadexp26 {
	private static final CharSequence ENTER = null;
	WebDriver driver;
	Actions actobj;
	
	public void LanchAUT() throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32.\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		actobj=new Actions(driver);
		actobj.sendKeys(Keys.ESCAPE).build().perform();
	}
	public void senddata() throws InterruptedException
	{
		WebElement Search=driver.findElement(By.name("q"));
		actobj=new Actions(driver);
		//type 2 process
		
    actobj.sendKeys(Search ,"java with selenium").perform();
    Thread.sleep(2000);
    actobj.sendKeys(Keys.ESCAPE).perform();
    Thread.sleep(2000);
   actobj.sendKeys(Keys.ENTER).perform();
    
    
    
    
	}
	public void get_pageSRC()
	{
		String data=driver.getPageSource();
		if(data.contains("java with selenium"))
		{
			System.out.println("is threre");
		}
		else
		{
			System.out.println("is not there");
		}
	}	
	public static void main(String[] args) throws InterruptedException {
		RGV1sadexp26 obj= new RGV1sadexp26();
		obj.LanchAUT();
		obj.senddata();
		obj.get_pageSRC();
		

		
	}

}
