package maven_code;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelSheet_ForLoop_LoginToAmazon_Data_ProAnnot
{
	@Test (dataProvider="ExcelDataLogin")
	public static void LoginToAmazon(String username, String password)
	{
		 WebDriver driver= new EdgeDriver();
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
	public Object [][] ExcelDataLogin() throws EncryptedDocumentException, IOException
	{
		 Object [][] data= new Object[8] [2];

		   FileInputStream f1= new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs\\Excel Sheet\\Login Details.xlsx");

		        Workbook w1=  WorkbookFactory.create(f1);

		        Sheet sheet = w1.getSheet("Login");
		        sheet.getSheetName();
				return data;


		        // I have to write here for loop do it later




	}

}
