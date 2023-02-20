package seleinumrnjith;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RGVsadexp20 {
	
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chrome.zip" );
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void Fill_information() throws InterruptedException
	{
		driver.findElement(By.name("UserFirstName")).sendKeys("king");
		Thread.sleep(2000);
		driver.findElement( By.name("UserLastName")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("bossisback@3055gmail.com");
		Thread.sleep(3000);
		
	}
	public void Job_Title_Drope_Down() throws InterruptedException
	{
		WebElement we=driver.findElement(By.name("UserTitle"));
		Select slcobj=new Select(we);
		slcobj.selectByVisibleText("Marketing / PR Manager");
		Thread.sleep(2000);
		slcobj.selectByIndex(2);
		driver.findElement(By.name("CompanyName")).sendKeys("wells");
		Thread.sleep(2000);
		
	}
	public void Employees_drop_down() throws InterruptedException
	{
		WebElement we2=driver.findElement(By.name("CompanyEmployees"));
		Select slcobj1=new Select(we2);		
		slcobj1.selectByIndex(3);
		Thread.sleep(2000);
		slcobj1.selectByValue("950");
		Thread.sleep(2000);
		driver.findElement(By.name("UserPhone")).sendKeys("9959772429");
		Thread.sleep(2000);
		
		
	}
	public void Cuntry_Region() throws InterruptedException
	{
		WebElement we3=driver.findElement(By.name("CompanyCountry"));
		Select slcobj2=new Select(we3);		
		Thread.sleep(2000);
		slcobj2.selectByVisibleText("India");
		Thread.sleep(2000);
		driver.findElement(By.className("   cxt-has-fixed-nav")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		RGVsadexp20 obj=new RGVsadexp20();
		obj.LaunchAUT();
		obj.Fill_information();	
		obj.Job_Title_Drope_Down();
		obj.Employees_drop_down();
		obj.Cuntry_Region();

	}

}
