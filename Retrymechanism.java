package iretryanalizer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrymechanism implements IRetryAnalyzer
{
	int current_count=0;
	int retry_count=2;

	@Override
	public boolean retry(ITestResult result) 
	{
		int current_count=0;
		int retry_count=2;
		if(current_count<retry_count)
		{
			current_count++;
			return true; //it will retry
		}
		
		return false;  //dont retry
	}
	

}
