package tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest3 extends BaseTest {

	
	 ExtentTest loggerLoc = logger.get(); 
	
	@BeforeTest
	public void setup(){
		// code for initializing the extentReport class
		
		
	}
	
    @Test (priority = 0, description="Invalid Login Scenario with VBN.")
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {
        //ExtentReports Description
    	loggerLoc = getExtent().get().startTest("TEST2 START");
         Assert.assertTrue(true);
         loggerLoc.log(LogStatus.PASS, "Passed first case 3 assertion");
         Assert.assertEquals("123","123");
         loggerLoc.log(LogStatus.PASS, "Passed Second case 3 assertion");
     
          
    }
    
    @AfterMethod
    	public void getResult(ITestResult result){
    	System.out.println(" i am in after method ");
    		 if(result.getStatus() == ITestResult.FAILURE){
    		 //logger.log(LogStatus.FAIL, "Test Step Failed is "+result.getName());
    			 loggerLoc.log(LogStatus.FAIL, "Test Step Failed is "+result.getThrowable());
    		 }
    		extent.get().endTest(loggerLoc);
    		
    	   
    	}
    	
    }

	

