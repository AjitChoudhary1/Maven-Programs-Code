package maven_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annot_AmazonSearch 
{
	   @Test (dataProvider="data")
	   public static void SearchOnAmazon(String input)
	   {
		    // WebDriver driver= new ChromeDriver();
		         WebDriver driver= new EdgeDriver();
		          driver.manage().window().maximize();
		          driver.navigate().refresh();
		          
		              driver.get("https://www.amazon.in/");
		              driver.navigate().refresh();
		              
		       WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		                 search.sendKeys(input,Keys.ENTER);
		                 //search.sendKeys(Keys.ENTER);
	   }
	   
	   
	      @DataProvider()
	      public Object [] [] data()
	      {
			Object [] [] o1= new Object[10] [1];
			o1[0][0]="Iphone 16 pro max";
			o1[1][0]="Iphone";
			o1[2][0]="Dell";
			o1[3][0]="Hp";
			o1[4][0]="Acer";
			o1[5][0]="Mac os";
			o1[6][0]="Macbook pro";
			o1[7][0]="Oneplus";
			o1[8][0]="Nike";
			o1[9][0]="Puma";
			
			
			return o1;
	    	  
	      }
	   
	   
	   

}
