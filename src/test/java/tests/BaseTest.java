package tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    
    
	public ThreadLocal<ExtentReports> extent = new ThreadLocal<ExtentReports>();
    public ThreadLocal<ExtentTest> logger = new ThreadLocal<ExtentTest>();
    String workingDir = System.getProperty("user.dir");

    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());


   
    @BeforeClass
    public ThreadLocal<ExtentReports> getExtent() {
    	extent.set( new ExtentReports(workingDir+"\\ExtentReports\\"+timeStamp+"ExtentReportResults.html", false));
    	 System.out.println(" timeStamp "+timeStamp);
    	return extent;
       
        	
    }
    
    
    
    
    public WebDriver getDriver() {
        return driver;
    }
    
    /*public void setup () {
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();

        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver,15);

        //Maximize Window
        driver.manage().window().maximize();
    }*/

    @AfterClass
    public void teardown () {
      /*  driver.quit();*/
   	 extent.get().flush();
	    extent.get().close();
    }

}
