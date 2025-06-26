package maven_code2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class JSExcutr_Scrollup2_Down2_Amazon                                             // 1st way not use much
{
	@Test
	public void Search_WithOutSendKeys()
	{
		EdgeOptions options= new EdgeOptions();
		    options.addArguments("start-maximized");

		EdgeDriver driver= new EdgeDriver(options);
		     driver.get("https://www.amazon.in");
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		     WebElement scroll= driver.findElement(By.linkText("Amazon Science"));
		       Point p1= scroll.getLocation();
		         int x=  p1.getX();
		         int y=  p1.getY();
		             System.out.println("The x is-> " + x);
		             System.out.println("The y is-> " + y);


		      //JavascriptExecutor js=        driver;                                    //implicit explicit can both
		        JavascriptExecutor js=  driver;
		          js.executeScript("window.scrollBy(0,"+y+")");
		          js.executeScript("window.scrollBy(0,"+y+","+x+")");



	}


}
