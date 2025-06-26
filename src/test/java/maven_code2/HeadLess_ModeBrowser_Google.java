package maven_code2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class HeadLess_ModeBrowser_Google
{

	@Test
	public void HeadlessBrowser()
	{
		EdgeOptions options= new EdgeOptions();

		   options.addArguments("--headless");          //enables headless mode

		   WebDriver driver= new EdgeDriver(options);

		       driver.get("https://www.google.com");

		           System.out.println("Title-> " + driver.getTitle());

		             driver.quit();


	}


}
