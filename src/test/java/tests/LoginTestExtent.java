package tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTestExtent extends BaseTest  {

  ExtentTest loggerLoc = logger.get(); 
	
  
  @DataProvider(name = "browser-provider")
  public Object[][] provide() throws Exception {
      return new Object[][] {
          {"TABLETS"},
          {"MICE"},
         };
  }
  
	@BeforeTest
	public void setup(){
		// code for initializing the extentReport class
		
		
	}
	
    @Test (priority = 0, description="Invalid Login Scenario with ABCD.", dataProvider = "browser-provider")
    public void invalidLoginTest_InvalidUserNameInvalidPassword (String category) throws InterruptedException {
        //ExtentReports Description
    	loggerLoc = getExtent().get().startTest("TEST 1");
         Assert.assertTrue(true);
         loggerLoc.log(LogStatus.PASS, "Passed first case 2 assertion");
         Assert.assertEquals("ABC","ABC");
         loggerLoc.log(LogStatus.PASS, "Passed Second case 2 assertion");
         System.out.println("browser type  " +category);
          
    }
    @Test (priority = 0, description="Invalid Login Scenario with ABCD.")
    public void test2 () throws InterruptedException {
        //ExtentReports Description
    	loggerLoc = getExtent().get().startTest("TEST 2");
         Assert.assertTrue(true);
         loggerLoc.log(LogStatus.PASS, "Passed first case 2 3assertion");
         Assert.assertEquals("ABC","ABC");
         loggerLoc.log(LogStatus.PASS, "Passed Second case 2 3 assertion");
         System.out.println("browser type i am in test 2 " );
          
    }
    @AfterMethod
    	public void getResult(ITestResult result){
    	System.out.println(" i am in after method ");
    		 if(result.getStatus() == ITestResult.FAILURE){
    		 /*logger.log(LogStatus.FAIL, "Test Step Failed is "+result.getName());*/
    			 loggerLoc.log(LogStatus.FAIL, "Test Step Failed is "+result.getThrowable());
    		 }
    		extent.get().endTest(loggerLoc);
    	
    	 
    	}
    	
    }


 



