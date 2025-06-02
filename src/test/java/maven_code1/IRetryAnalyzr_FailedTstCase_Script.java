package maven_code1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzr_FailedTstCase_Script implements IRetryAnalyzer
{
      
	   int retrycount=2;
	   int  initialcount=0;
	   
	@Override
	public boolean retry(ITestResult result) 
	{
		
		if(initialcount<retrycount)
		{
			
			initialcount++;
			return true;
			
		}
		
		
		// TODO Auto-generated method stub
		return false;
	} 
	
	
	

}
