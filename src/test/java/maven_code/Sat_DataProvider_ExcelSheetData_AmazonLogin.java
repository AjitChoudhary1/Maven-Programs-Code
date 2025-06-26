package maven_code;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// DataProvider annotation by taking input from excel file
public class Sat_DataProvider_ExcelSheetData_AmazonLogin
{
	@Test (dataProvider = "getExcelData")
	public void testAmazonLogin(String username, String password)throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();

		// Hover over 'Account & Lists'
		Actions actions = new Actions(driver);
		WebElement signInHover = driver.findElement(By.id("nav-link-accountList"));
		actions.moveToElement(signInHover).perform();

		Thread.sleep(1000);

		// Click 'Sign in' button
		 WebElement signInButton = driver.findElement(By.className("nav-action-signin-button"));
		 signInButton.click();

		// Enter email
		 WebElement login_email= driver.findElement(By.name("email"));
		 login_email.sendKeys(username);

		// Click Continue
		 WebElement continuebutton = driver.findElement(By.id("continue"));
		 continuebutton.click();

		  Thread.sleep(2000); //wait for password page to load

		 // Enter password
		 WebElement login_password = driver.findElement(By.id("ap_password"));
		 login_password.sendKeys(password);

		// Click Sign in
		 WebElement signinsubmit = driver.findElement(By.id("signInSubmit"));
		 signinsubmit.click();

	}

		  @DataProvider
		  public Object[][] getExcelData() throws Exception
		  {

			  //Define the file path where the Excel file is stored
		      String filePath = "C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs\\Excel Sheet\\Login Details.xlsx";

		      //Load the Excel file
		      FileInputStream f1 = new FileInputStream(filePath);

		      // Create workbook from file input stream
		      Workbook w1 = WorkbookFactory.create(f1);

		      //Access the specific sheet inside the workbook
		      Sheet sheet = w1.getSheet("Login");


          //Declare a 2 D Object array with 6 rows and 2 columns (for 6 sets of login data)
		      Object[][] data = new Object[8][2];  //6 rows, 2 columns

		   // 1st row
		      String un1 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(2).getCell(0).getNumericCellValue());
		      String pwd1 = sheet.getRow(2).getCell(1).getStringCellValue();

		      data[2][0] = un1;
		      data[2][1] = pwd1;


		                   Thread.sleep(3000);
		  // 2nd row
		    String un2 = sheet.getRow(3).getCell(0).getStringCellValue();
	        String pwd2 = sheet.getRow(3).getCell(1).getStringCellValue();

	         data[3][0] = un2;
	         data[3][1] = pwd2;


	                        Thread.sleep(3000);
		 // 3rd row
		    String un3 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(4).getCell(0).getNumericCellValue());
		    String pwd3 = sheet.getRow(4).getCell(1).getStringCellValue();

		     data[4][0] = un3;
		     data[4][1] = pwd3;


		                    Thread.sleep(3000);
		  // 4th row
		      String un4 = sheet.getRow(5).getCell(0).getStringCellValue();
		      String pwd4 = sheet.getRow(5).getCell(1).getStringCellValue();

		      data[5][0] = un4;
		      data[5][1] = pwd4;


		                    Thread.sleep(3000);
		  // 5th row
		    String un5 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(6).getCell(0).getNumericCellValue());
	        String pwd5 = sheet.getRow(6).getCell(1).getStringCellValue();

	         data[6][0] = un5;
	         data[6][1] = pwd5;


	                       Thread.sleep(3000);
		 // 6th row
		    String un6 = sheet.getRow(7).getCell(0).getStringCellValue();
		    String pwd6 = sheet.getRow(7).getCell(1).getStringCellValue();

		     data[7][0] = un6;
		     data[7][1] = pwd6;

		  //Close the workbook
		  //w1.close();

		  //Return the populated array to the DataProvider
		  return data;

	/* NOTE: This test uses intentionally invalid credentials.
	 * Because I cannot create a new Amazon test accounts using my real phone number,
	 * the login process is expected to fail after the email step.
	 * This is done to avoid blocking or flagging my real Amazon account.
	 * I tested the element locators like email, password, and sign-in button using my real Amazon account once.
	 * But for safety, I now use fake data in the test to avoid any risk of my account getting blocked.
	 */

	}


}