package maven_code2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class JSExcutr_Search1_Amazon                                             // 1st way not use much
{
	@Test
	public void Search_WithOutSendKeys()
	{
		EdgeOptions options= new EdgeOptions();
		    options.addArguments("start-maximized");
		    
		EdgeDriver driver= new EdgeDriver(options);
		     driver.get("https://www.amazon.in");
		     
		     
		     WebElement search= driver.findElement(By.cssSelector("input[id^=twotab]"));
		     
		     driver.executeScript("arguments[0].value='Laptop'", search);
		         search.sendKeys(Keys.ENTER);
		
		
		
	}
	

}
