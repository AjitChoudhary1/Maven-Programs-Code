package maven_code;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testing_Some2 
{
	
	EdgeDriver driver= new EdgeDriver();
	
    @Test
	public static void Welcome() 
	{
		System.out.println("Ajit Choudhary");
		
		EdgeDriver driver= new EdgeDriver();
		    driver.manage().window().maximize();
	}
}
