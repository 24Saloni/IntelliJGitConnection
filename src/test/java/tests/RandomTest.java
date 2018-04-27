package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Listeners.AssertionLibrary;

public class RandomTest {

	AssertionLibrary al;
	 @DataProvider(name = "browser-provider")
	  public Object[][] provide() throws Exception {
	      return new Object[][] {
	          {"TABLETS"},
	          {"MICE"},
	         };
	  }
	 
	 @BeforeTest
	 public void setUp() {
		// al = new AssertionLibrary("Invalid Login Scenario with wrong username and password."); 
	 }
	
   @Test (priority = 0, description="Invalid Login Scenario with wrong username and password.", dataProvider = "browser-provider")
   public void invalidLoginTest_InvalidUserNameInvalidPassword (String category) throws InterruptedException {
       //ExtentReports Description
	   AssertionLibrary.assertEquals("ABC","ABC","String Matches PASS");
	   AssertionLibrary.assertEquals("ABC","ABC1","String Matches");
	   
      
       
   }
  
   @AfterMethod
   public void handleException()
   {
   	System.out.println(" i am in after method ");
   	
   }
	
}
