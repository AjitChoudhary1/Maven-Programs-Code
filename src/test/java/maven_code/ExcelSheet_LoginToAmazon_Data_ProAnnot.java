package maven_code;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelSheet_LoginToAmazon_Data_ProAnnot
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
	public Object [][] ExcelDataLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		 Object [][] data= new Object[8] [2];

		   FileInputStream f1= new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs\\Excel Sheet\\Login Details.xlsx");

		        Workbook w1=  WorkbookFactory.create(f1);

		        Sheet sheet = w1.getSheet("Login");



		        String un1 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(2).getCell(0).getNumericCellValue());
			    String pwd1 = sheet.getRow(2).getCell(1).getStringCellValue();

		         data[2][0]=un1;
		         data[2][1]=pwd1;                                    // 1st Valid UN Mobile, Valid PWD


                              Thread.sleep(3000);

		       String un2 = sheet.getRow(3).getCell(0).getStringCellValue();
	           String pwd2 = sheet.getRow(3).getCell(1).getStringCellValue();

		        data[3][0]=un2;
		        data[3][1]=pwd2;                                     // 2nd Valid UN Email, Valid PWD


		                            Thread.sleep(3000);

		       String un3 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(4).getCell(0).getNumericCellValue());
			   String pwd3 = sheet.getRow(4).getCell(1).getStringCellValue();

		        data[4][0]=un3;
		        data[4][1]=pwd3;                                        // 3rd Valid UN, Wrong PWD


		                            Thread.sleep(3000);

		       String un4 = sheet.getRow(5).getCell(0).getStringCellValue();
			   String pwd4 = sheet.getRow(5).getCell(1).getStringCellValue();

		        data[5][0]=un4;
		        data[5][1]=pwd4;                                     // 4th Wrong UN, Valid PWD


		                             Thread.sleep(3000);

		       String un5 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(6).getCell(0).getNumericCellValue());
		       String pwd5 = sheet.getRow(6).getCell(1).getStringCellValue();

		        data[6][0]=un5;
		        data[6][1]=pwd5;                                        // 5th Wrong UN, Wrong PWD


		                             Thread.sleep(3000);

		       String un6 = sheet.getRow(7).getCell(0).getStringCellValue();
			   String pwd6 = sheet.getRow(7).getCell(1).getStringCellValue();

		        data[7][0]=un6;
		        data[7][1]=pwd6;                                              // 6th Blank UN, Blank PWD


			return data;




	}

}
