package seleinumrnjith;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RGVsadexp023 {
	
	WebDriver driver;
	public void LauchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}
	public void multiple() throws InterruptedException
	{
		driver.switchTo().frame("<frame[@i'frameResul']");
		WebElement drop=driver.findElement(By.id("cars"));
		Select slcobj=new Select(drop);
		if(slcobj.isMultiple()) 
		{
			slcobj.selectByVisibleText("Audi");
			Thread.sleep(2000);
			slcobj.deselectByVisibleText("Volvo");
			Thread.sleep(2000);
			List<WebElement>alloptions=slcobj.getAllSelectedOptions();
			for(int i=0;i<alloptions.size();i++)
			{
				String data=alloptions.get(i).getText();
				System.out.println("The selected option is:"+data);
				
			}
			Thread.sleep(2000);
			slcobj.deselectByVisibleText("Audi");
			Thread.sleep(2000);
			slcobj.deselectAll();
		}
		else 
		{
			System.out.println("This not is multiselector");
			
		}
		driver.switchTo().defaultContent();
		Thread.sleep(2000);		
	}	
	public static void main(String[] args) throws InterruptedException {
		 RGVsadexp023 obj= new  RGVsadexp023();
		 obj.LauchAUT();
		 obj.multiple();

	}

}
