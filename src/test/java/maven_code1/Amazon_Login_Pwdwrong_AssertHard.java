package maven_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Login_Pwdwrong_AssertHard
{
	  @Test
	  public void AmazonSigninPage() throws InterruptedException
	  {
		  EdgeDriver driver= new EdgeDriver();
		     driver.manage().window().maximize();

		        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

			       WebElement usrname= driver.findElement(By.name("email"));
			           usrname.sendKeys("8269201125");

			       WebElement prscontnu=    driver.findElement(By.id("continue"));
			           prscontnu.click();

			       WebElement password=    driver.findElement(By.id("ap_password"));
			            password.sendKeys("Aj@803");

			       WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
			            prsSignin.click();

		        //Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		                       // By title this

		        WebElement errmsg= driver.findElement(By.xpath("(//div[@class='a-alert-content'])[1]"));

		          Assert.assertEquals(errmsg.getText(), "Your password is incorrect");       //1 option


		          String msgname= errmsg.getText();
			            System.out.println(msgname);

			         Assert.assertEquals(msgname, "Your password is incorrect");                  //2 option



		  Thread.sleep(3000);
		        // driver.close();
	  }

}
