package maven_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Is_copyFrom_IsDisplayed_Priority_OrangeHRM_Tstcse2 
{
	  WebDriver driver;
	
	@Test (priority=1)
	public void OrangeHrmLaunch()
	{
		
		  driver= new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		          
		         System.out.println("AppLaunched"); 
	}
	
	@Test (priority=2)
	public void logocheck() throws InterruptedException
	{
		
		         Thread.sleep(2000);
		WebElement logo= driver.findElement(By.xpath("//img[@alt='company-branding']"));
		       boolean b1= logo.isDisplayed();
		            System.out.println("Logo is Displayed-> " + b1);
		
	}
	
	@Test (priority=3)
	public void login() throws InterruptedException
	{
		
		         Thread.sleep(2000);
		WebElement un= driver.findElement(By.name("username"));
		         un.sendKeys("Admin");
		         
		         
		         Thread.sleep(2000);
         WebElement pwd= driver.findElement(By.name("password"));
		 		  pwd.sendKeys("admin123");
		 		  
		 		
		 		 Thread.sleep(5000);
		 WebElement  button= driver.findElement(By.xpath("//button[@type='submit']"));
				   button.click();
				   
				      System.out.println("LoginDone");
				   
	}
	
	@Test (priority=4)
	public void Logout() throws InterruptedException 
	{
		
	                  Thread.sleep(4000);
	           WebElement clickuser =  driver.findElement(By.className("oxd-userdropdown"));
	                     clickuser.click();
	                  
	                     Thread.sleep(2000);
	           WebElement  logout= driver.findElement(By.linkText("Logout"));
			             logout.click();
			   
			      System.out.println("LogoutDone");
	}
	
	
	@Test (priority=5)
	public void closeApp() throws InterruptedException
	{
		
		                Thread.sleep(5000);
		                
		                driver.close();
                        System.out.println("App Closed");
					
	
	}
	
	
	
	
}
