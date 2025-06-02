package maven_code1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_Method_ScreenShot_TestNG implements ITestListener
{
	public static EdgeDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		    Reporter.log("Test Case Is pass");
		    
		    TakesScreenshot t1= driver;
		  File source= t1.getScreenshotAs(OutputType.FILE);
		  File destination= new File("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs\\ScreenShots-Lisnrs\\Pass SShot\\ListenersSShotTestCasePass.png");
		  try 
		  {
			FileHandler.copy(source, destination);
		  } 
		  catch (IOException e) 
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		    
		    
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		    Reporter.log("Test Case Is Fail");
		    
		    TakesScreenshot t1= driver;
			  File source= t1.getScreenshotAs(OutputType.FILE);
			  File destination= new File("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs\\ScreenShots-Lisnrs\\Fail SShot\\ListenersSShotTestCaseFail.jpg");
			  try 
			  {
				FileHandler.copy(source, destination);
			  } 
			  catch (IOException e)
			  {
				// TODO Auto-generated catch block
				e.printStackTrace();
			  }
	}
        
	
	
	
	
}
