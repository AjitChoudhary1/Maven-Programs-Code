package maven_code2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLess_ModeBrowser_GTM 
{
	
	@Test
	public void HeadlessBrowser()
	{
		ChromeOptions options= new ChromeOptions();
		
		   options.addArguments("--headless");          //enables headless mode
		
		   ChromeDriver driver= new ChromeDriver(options);
		   
		       driver.get("https://www.grotechminds.com");
		       
		           System.out.println("Title-> " + driver.getTitle());
		           
		             driver.quit();
		
		
	}

}
