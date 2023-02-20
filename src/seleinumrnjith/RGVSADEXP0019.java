package seleinumrnjith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RGVSADEXP0019 {
	
	  WebDriver driver; 
	  public void LaunchAUT() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32.exp");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  		  
	  }
      public void Navigate() throws InterruptedException
      {
    	  driver.navigate().to("https://www.amazon.in/");
    	  Thread.sleep(2000);
    	  driver.navigate().back();
     	  Thread.sleep(2000);
     	  driver.navigate().forward();
     	  Thread.sleep(2000);
    	  driver.navigate().refresh();
    	  
    	  
      }	
	public static void main(String[] args) throws InterruptedException {
		RGVSADEXP0019 obj=new RGVSADEXP0019();
		obj.LaunchAUT();
		obj.Navigate();
		
	}

}
