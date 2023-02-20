package seleinumrnjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RGVsadexp26 {
	
	WebDriver driver;
	Actions actobj;
	public void LanchAUT() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32.\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Drga_Drop() throws InterruptedException
	{
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement des=driver.findElement(By.id("droppable"));
		actobj=new Actions(driver);
		actobj.dragAndDrop(src, des).build().perform();
		Thread.sleep(2000);
		
	}
	public void Count_Frame()
	{
		int count=driver.findElements(By.tagName("ifrme")).size();
		System.out.println(count);
	}

	
	public static void main(String[] args) throws InterruptedException {
		RGVsadexp26 BOSS= new RGVsadexp26();
		BOSS.LanchAUT();
		BOSS.Drga_Drop();
		BOSS.Count_Frame();
				

	}

}
