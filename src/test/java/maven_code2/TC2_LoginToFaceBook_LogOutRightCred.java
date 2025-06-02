package maven_code2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import maven_code1.Facebook_LogOutPage;
import maven_code1.Facebook_LoginPage;

public class TC2_LoginToFaceBook_LogOutRightCred 
{
	 @Test
	 public void FBLogin_Logout_RightCred() throws InterruptedException
	 {
		 
		 ChromeOptions options= new ChromeOptions();
	      options.addArguments("--disable-notifications");
		 
		  WebDriver driver= new ChromeDriver(options);
		    driver.manage().window().maximize();
		        
		       driver.get("https://www.facebook.com/");
		       
		       System.out.println("Title is-> " + driver.getTitle());
		    
		    Facebook_LoginPage loginpage= new Facebook_LoginPage(driver);
		       loginpage.un();
		       loginpage.pwd();
		       loginpage.login();
		       
		       Thread.sleep(21000);
		  
		       
		       
		    Facebook_LogOutPage logoutpage= new Facebook_LogOutPage(driver);   
		        logoutpage.profile();
		        logoutpage.logout();
		       
		       
		       
		        System.out.println("Title is-> " + driver.getTitle());
		 
		 
	 }

}
