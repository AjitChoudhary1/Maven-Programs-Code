package maven_code2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class JSExcutr_Scrollup_Down_Amazon                                             // 1st way not use much
{
	@Test
	public void Search_WithOutSendKeys()
	{
		EdgeOptions options= new EdgeOptions();
		    options.addArguments("start-maximized");

		EdgeDriver driver= new EdgeDriver(options);
		     driver.get("https://www.amazon.in");
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		      //JavascriptExecutor js=        driver;                                    //implicit explicit can both
		        JavascriptExecutor js=  driver;
		          js.executeScript("window.scrollBy(0,700)");
		          js.executeScript("window.scrollBy(0,400)");



	}


}
