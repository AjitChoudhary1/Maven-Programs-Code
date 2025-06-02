package maven_code;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Data provider Annotation by taking input from excel file using for loop 
public class Sat_DataProvider_Excel_ForLoop_AmazonLogin 
{
	@Test (dataProvider = "GetExcelData")
	public void testAmazonLogin(String username, String password)throws InterruptedException
	
	{
		WebDriver driver = new EdgeDriver();
		driver.get ("https://www.amazon.com/");
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
		  public Object[][] GetExcelData() throws Exception 
		  {
			  
			  //Define the file path where the Excel file is stored
		      String filePath = "C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs\\Excel Sheet\\Login Details.xlsx";  
		      
		      //Load the Excel file
		      FileInputStream f1 = new FileInputStream(filePath);
		      
		      // Create workbook from file input stream
		      Workbook w1 = WorkbookFactory.create(f1);
		      
		      //Access the specific sheet inside the workbook
		      Sheet sheet = w1.getSheet("Login");
		      

         //Get the total number of rows in the sheet (add 1 because row index starts from 0)
		   int rowCount = sheet.getLastRowNum()+2; //3 rows(0-indexed)
		   
		   //Get the total number of columns by checking the first row (assumes all rows have same columns)
		   int colCount = sheet.getRow(2).getLastCellNum(); //Example: 0,1 -> 2 columns
		   
		   
		   //Create a 2D object array to store the Excel sheet data
		   Object[][] data = new Object[rowCount][colCount];
		   
		   //Use nested for loop to read each cell and store it in the array
		   for (int i = 2; i < rowCount; i++) 
		   {
			   for (int j=2; j<colCount; j++)
			   {
				   //Read each cell value and convert it to String, then store in data array
				   data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			   }
			   
		   }
		return data;
		            
		 // w1.close();
		 
		  
	/* NOTE: This test uses intentionally invalid credentials.
	 * Because I cannot create a new Amazon test accounts using my real phone number, 
	 * the login process is expected to fail after the email step.
	 * This is done to avoid blocking or flagging my real Amazon account.
	 * I tested the element locators like email, password, and sign-in button using my real Amazon account once. 
	 * But for safety, I now use fake data in the test to avoid any risk of my account getting blocked.
	 */ 
		  	
	}
		  
		  
}