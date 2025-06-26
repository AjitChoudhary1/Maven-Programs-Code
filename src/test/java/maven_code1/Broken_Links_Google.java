package maven_code1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Broken_Links_Google
{
	  @Test
	  public void GoogleBrokenLinks() throws IOException
	  {
		  	WebDriver driver = new EdgeDriver();
		  	   driver.manage().window().maximize();

		  	      driver.get("https://www.google.com/");

		  	  List<WebElement> links= driver.findElements(By.tagName("a"));
		  	    int count = links.size();
		  	          System.out.println(count);

		  	      for(int i=0; i<count; i++)
		  	      {
		  	    	   WebElement e1 = links.get(i);

		  	    	      String url = e1.getDomAttribute("href");
		  	    	      String text = e1.getText();

		  	    	          System.out.println(url);
		  	    	           System.out.println(text);

		  	    	        verifythelink(url);

		  	      }

	  }


	     public static void verifythelink(String links) throws IOException
	     {
	    	 try
	    	 {
	    	 @SuppressWarnings("deprecation")
			 URL u1 = new URL(links);

	    	 HttpURLConnection c1 = (HttpURLConnection)  u1.openConnection();
	    	 if(c1.getResponseCode()==200)
	    	 {
	    		 System.out.println("Link Is Valid-> " + " " + c1.getResponseCode() + " " + c1.getResponseMessage());

	    	 }
	    	 else
	    	 {
	    		 System.out.println("Link Is Not Valid-> " + " " + c1.getResponseCode() + " " + links + " " + c1.getResponseMessage());

	    	 }

	    	 }

	    	 catch(MalformedURLException E1)
	    	 {
	    		 System.out.println(" Exception Handled ");
	    	 }

	    	 catch(NullPointerException E1)
	    	 {
	    		 System.out.println(" Exception Handled ");
	    	 }


	     }


}
