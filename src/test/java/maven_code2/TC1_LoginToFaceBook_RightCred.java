package maven_code2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import maven_code1.Facebook_LoginPage;

public class TC1_LoginToFaceBook_RightCred<WebDriverOptions> 
{
	 @Test
	 public void FBLogin_RightCred()
	 {
		 ChromeOptions options= new ChromeOptions();
		      options.addArguments("--disable-notifications");
		 
		  WebDriver driver= new ChromeDriver(options);
		    driver.manage().window().maximize();
		        
		       driver.get("https://www.facebook.com/");
		    
		    Facebook_LoginPage loginpage= new Facebook_LoginPage(driver);
		       loginpage.un();
		       loginpage.pwd();
		       loginpage.login();
		       
		       
		 
		 
		 
	 }

}
