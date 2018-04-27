package utils.Listeners;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import utils.ExtentReports.ExtentTestManager;

public class AssertionLibrary {

	// class that gives access to different Assertion methods:
	
	//method for assert.assertEquals assertion
	//takes three paramters, actual,expected and string message
	//returns void
	/*
	public AssertionLibrary(String description) {
		
		System.out.println(" IN ASSERTION CONSTRUCTOR ");
	}
	*/
	public static void assertEquals(String actual, String expected, String message) {
		Assert.assertEquals(actual, expected, message);
		// log into the  report the success of the assertion
		ExtentTestManager.getTest().log(LogStatus.PASS, message);
		
	}
	
	
	
	public static void assertTrue(boolean actual, boolean expected, String message) {
		Assert.assertEquals(actual, expected, message);
		// log into the  report the success of the assertion
		ExtentTestManager.getTest().log(LogStatus.PASS, message);
		
	}
	
}
