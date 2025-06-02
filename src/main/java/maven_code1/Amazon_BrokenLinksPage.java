package maven_code1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_BrokenLinksPage 
{
        WebDriver driver;
	
	//step-1 Locate component
	
	@FindBy(tagName="a")
	   List<WebElement> links;
	
	
	//step-2 Separate method for each component
	
		public void BrokenLinks(WebDriver driver) throws IOException
		{
	            int count = links.size();
                 System.out.println("Total Links-> " + count);
       
               for(int i=0; i<count; i++)
               {
 	               WebElement e1 = links.get(i);
 	   
 	              String url = e1.getDomAttribute("href");
 	                // String text = e1.getText();
 	                  
 	      
 	                    //System.out.println(url);
 	                      // System.out.println(text);
 	  
 	                verifythelink(url);
 	  
               }
     	      
          }


         public static void verifythelink(String links) throws IOException
         {
          try 
          {
                 URL u1 = new URL(links);

              HttpURLConnection c1 = (HttpURLConnection)  u1.openConnection();
                     if(c1.getResponseCode()==200)
                     {
                           System.out.println("Link Is Valid-> " + " " + c1.getResponseCode() + " " + c1.getResponseMessage());

                     }
                     else
                     {
                           System.out.println("Link Is Not Valid-> " + " " + c1.getResponseCode() + " "  + c1.getResponseMessage());

                     }

          }

          catch(MalformedURLException E1)
          {
                 // System.out.println(" Exception Handled ");
          }

          catch(NullPointerException E1)
          {
                //System.out.println(" Exception Handled ");
          }
 

       }
         
         
       //step-3 Initialize element by PageFactory class inside constructor
     	
     	public Amazon_BrokenLinksPage(WebDriver driver)
     	{
     		PageFactory.initElements(driver, this);
     		
     	}

}
