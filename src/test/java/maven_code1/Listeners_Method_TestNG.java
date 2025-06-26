package maven_code1;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_Method_TestNG implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		    Reporter.log("Test Case Is pass");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		    Reporter.log("Test Case Is Fail");
	}





}
