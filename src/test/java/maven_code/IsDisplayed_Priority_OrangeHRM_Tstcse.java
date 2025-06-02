package maven_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsDisplayed_Priority_OrangeHRM_Tstcse 
{
	  WebDriver driver;
	
	@Test (priority=1)
	public static void OrangeHrmLaunch()
	{
		IsDisplayed_Priority_OrangeHRM_Tstcse GB= new IsDisplayed_Priority_OrangeHRM_Tstcse();
		
		  GB.driver= new ChromeDriver();
		  
		  GB.driver.manage().window().maximize();
		  GB.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		          
		         System.out.println("AppLaunched"); 
	}
	
	@Test (priority=2)
	public static void logocheck() throws InterruptedException
	{
		IsDisplayed_Priority_OrangeHRM_Tstcse GB= new IsDisplayed_Priority_OrangeHRM_Tstcse();
		
		         Thread.sleep(2000);
		WebElement logo= GB.driver.findElement(By.xpath("//img[@alt='company-branding']"));
		       boolean b1= logo.isDisplayed();
		            System.out.println("Logo is Displayed-> " + b1);
		
	}
	
	@Test (priority=3)
	public static void login() throws InterruptedException
	{
		IsDisplayed_Priority_OrangeHRM_Tstcse GB= new IsDisplayed_Priority_OrangeHRM_Tstcse();
		
		         Thread.sleep(2000);
		WebElement un= GB.driver.findElement(By.name("username"));
		         un.sendKeys("Admin");
		         
		         
		         Thread.sleep(2000);
         WebElement pwd= GB.driver.findElement(By.name("password"));
		 		  pwd.sendKeys("admin123");
		 		  
		 		
		 		 Thread.sleep(5000);
		 WebElement  button= GB.driver.findElement(By.xpath("//button[@type='submit']"));
				   button.click();
				   
				      System.out.println("LoginDone");
				   
	}
	
	@Test (priority=4)
	public static String closeApp() throws InterruptedException
	{
		IsDisplayed_Priority_OrangeHRM_Tstcse GB= new IsDisplayed_Priority_OrangeHRM_Tstcse();
		
		                Thread.sleep(5000);
		                
		                GB.driver.close();
                        System.out.println("AppClosed");
					return "closed";
	
	}
	
	
	
	
}
