package maven_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToAmazon_Multiple_Data_Annot
{
	@Test (dataProvider="DataArray2D")
	public static void LoginToAmazon(String username, String password)
	{
		 EdgeDriver driver= new EdgeDriver();
		   driver.manage().window().maximize();

		   driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	       WebElement usrname= driver.findElement(By.name("email"));
	           usrname.sendKeys(username);

	       WebElement prscontnu=    driver.findElement(By.id("continue"));
	           prscontnu.click();

	       WebElement pasword=    driver.findElement(By.id("ap_password"));
	            pasword.sendKeys(password);

	       WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
	            prsSignin.click();

	}


	@DataProvider
	public Object [][] DataArray2D()
	{
		 Object [][] data= new Object[6] [2];


		       data[0][0]="8269201125";
		       data[0][1]="Aj@803131";                                    // 1st Valid UN Mobile, Valid PWD

		       data[1][0]="ajitchoudhary0902@gmail.com";
		       data[1][1]="Aj@803131";                                     // 2nd Valid UN Email, Valid PWD

		       data[2][0]="8269201125";
		       data[2][1]="Aj@803";                                        // 3rd Valid UN, Wrong PWD

		       data[3][0]="82692011255";
		       data[3][1]="Aj@803131";                                     // 4th Wrong UN, Valid PWD

		       data[4][0]="82692011255";
		       data[4][1]="Aj@803";                                        // 5th Wrong UN, Wrong PWD

		       data[5][0]=" ";
		       data[5][1]=" ";                                              // 6th Blank UN, Blank PWD


			return data;




	}

}
