package maven_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Launch_QuitBrowsr_TestCase2 extends LaunchQuitBrowsr_LogintoAmazon 
{
	  @Test
	  public void LoginoAmazon() throws InterruptedException 
	  {
		  
		  WebElement e1=     driver.findElement(By.xpath("//div[@class='nav-div'][2]"));
		  
          Actions a1= new Actions(driver);
             a1.moveToElement(e1).perform();

                   Thread.sleep(2000);

          WebElement e2=    driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
                  e2.click(); 




         WebElement usrname= driver.findElement(By.name("email"));
                  usrname.sendKeys("ajit@gmail.com");

           WebElement prscontnu=    driver.findElement(By.id("continue"));
                 prscontnu.click();
 
          WebElement password=    driver.findElement(By.id("ap_password"));
                 password.sendKeys("8031aj");

                  WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
                          prsSignin.click();
		  
		  
		  
		  
	  }

}
