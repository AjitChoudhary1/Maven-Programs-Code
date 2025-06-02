package maven_code;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Browsers 
{
	public static void main(String[] args) 
	{
		 ChromeDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		        
		       driver.get("https://www.google.com/");
		
	}
	   
	         
}
