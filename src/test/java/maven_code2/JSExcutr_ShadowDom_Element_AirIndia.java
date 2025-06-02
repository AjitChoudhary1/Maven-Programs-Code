package maven_code2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class JSExcutr_ShadowDom_Element_AirIndia                                             // 2nd way use much
{
	@Test
	public void ShadowDom_Elmnt_AirIndia()
	{
		ChromeOptions options= new ChromeOptions();
		    options.addArguments("start-maximized");
		    
		ChromeDriver driver= new ChromeDriver(options);
		     driver.get("https://www.airindia.com/");
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     
		   driver.findElement(By.xpath("(//button[.='Accept All'])[1]")).click();
		     
		     String s1="return document.querySelector(\'#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group\').shadowRoot.querySelector(\'div > div:nth-child(1) > label\')";         
		     
		     
		      //JavascriptExecutor js=        driver;                                    //implicit explicit can both
		        JavascriptExecutor js=  (JavascriptExecutor)      driver;
		           WebElement onewaybutton= (WebElement) js.executeScript(s1);
		                onewaybutton.click();
		
		
	}
	

}
