package seleinumrnjith;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RGVsadexp25 {
	 WebDriver driver;
	 Actions actobj;
	 public void LaunchAUT() throws InterruptedException
	 {
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32.\\chromedriver.zip");
		 driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 actobj=new Actions(driver);
		 actobj.sendKeys(Keys.ESCAPE).build().perform();		 
	 }
     public void Sendata() throws InterruptedException
     
     {
     WebElement search=driver.findElement(By.name("q"));
     actobj= new Actions(driver);
        //type 2 process
     actobj.sendKeys(search,"money books").perform();
     Thread.sleep(2000);
     actobj.sendKeys(Keys.ENTER).perform();
     Thread.sleep(2000);
    		 
     }
     public void get_pageSRC()
     {
    	 String data=driver.getPageSource();
    	 if(data.contains("java with selenium"))   
    	 {
    		 System.out.println(" is there");
    	 }
    	 else
    	 {
    		 System.out.println("is  not there");
    	 }
     }
     
        
	public static void main(String[] args) throws InterruptedException {
		 RGVsadexp25 obj= new  RGVsadexp25();
		 obj.LaunchAUT();
		 obj.Sendata();
		obj.get_pageSRC();
	}

}
