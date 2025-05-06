package comapnyAdminTest;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import companyManagement.Locator5;
import companyManagement.Method5;
import companyProjectDirector.CriticalMethod4;
import companyProjectDirector.Locator4;
import companyProjectDirector.Method4;
import companyProjectHead.Method3;
import login.BasePage;



public class ManagementTestCases extends BasePage{

	
//	public static Web  = null;		//Web instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	
	
	public static XSSFSheet ReadExcel() throws IOException
	{
		
		fis = new FileInputStream("E:\\VenderAuditProject\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(5);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyManagement.html",true);
		test = extent.startTest("Logging In - Management Non_Critical");
		
		test.log(LogStatus.PASS, "Test Passed ");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		initialization("company",5);
	
		/*
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);	

	
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		 = login.Login.UserLogin(uname,password,"company");		//Method of Login class to login user.
		*/
	}
	
	
	@Test(priority = 1) 
	void LocationPopupColumnist1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Location Popup verification");
		
		CriticalMethod4.LocationPopupColumnist(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 2) 
	void ProjectsCountGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Project Audit ");
		
		Method5.ProjectsCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 3) 
	void ContractorsCountGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Contractors Audit  ");
		
		Method5.ContractorsCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 4) 
	void GraphCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Complied Graph' Count Verification");
		
		Method5.GraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 5) 
	void CompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied Status - High Risk - Multiple Filter Verification");
		
		Method4.CompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
///	@Test(priority = 6) 
	void CompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied Status - Medium Risk - Multiple Filter Verification");
		
		Method4.CompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 7) 
	void CompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied Status - Low Risk - Multiple Filter Verification");
		
		Method5.CompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	
	@Test(priority = 8) 
	void RedInRedGraphCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Not Complied Graph' Count Verification");
		
		Method5.RedInRedGraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 9) 
	void NotCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied Status - High Risk - Multiple Filter Verification");
		
		Method4.NotCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 10) 
	void NotCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied Status - Medium Risk - Multiple Filter Verification");
		
		Method4.NotCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 11) 
	void NotCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied Status - Low Risk - Multiple Filter Verification");
		
		Method4.NotCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority = 12) 
	void GreyInRedCountMtch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Not Applicable Graph' Count Verification");
		
		Method5.GreyInRedCountMtch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
///	@Test(priority = 13) 
	void NotApplicableGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable Status - High Risk - Multiple Filter Verification");
		
		Method4.NotApplicableGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 14) 
	void NotApplicableGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable Status - Medium Risk - Multiple Filter Verification");
		
		Method4.NotApplicableGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
///	@Test(priority = 15) 
	void NotApplicableGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable Status - Low Risk - Multiple Filter Verification");
		
		Method4.NotApplicableGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority = 16) 
	void AuditCompletionStatusRed1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Audit Completion Status' Count Verification");
		
		Method5.AuditCompletionStatusRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 17) 
	void ACSOverdueMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion Status - Overdue Status - Multiple Filter Verification");
		
		Method4.ACSOverdueMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 18) 
	void ACSPendingReviewMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion Status - Pending Review Status - Multiple Filter Verification");
		
		Method4.ACSPendingReviewMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 19)          
	void ACSClosedMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion Status - Closed Status - Multiple Filter Verification");
		
		Method4.ACSClosedMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	@Test(priority = 20) 
	void CTWCompliedgreen1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Compliance Status Summary - 'Canteen' - 'Complied Status' Count Verification");
		
		Method5.CTWCompliedgreen(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 21) 
	void CTWCompliedgreen11() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Compliance Status Summary - 'Canteen' - Complied Status - Multiple Filter Verification");
		
		Method4.CTWCompliedgreen1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 22) 
	void CTWNotCompliedRed1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Compliance Status Summary - 'Canteen' - 'Not Complied Status' Count Verification");
		
		Method5.CTWNotCompliedRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
///	@Test(priority = 23) 
	void CTWNotCompliedRed11() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Compliance Status Summary - Not Complied Status - Multiple Filter Verification");
		
		Method5.CTWNotCompliedRed1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	
	@Test(priority = 24) 
	void CTWNotApplicableGrey1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Compliance Status Summary - 'Canteen' - 'Not Applicable Status' Count Verification");
		
		Method5.CTWNotApplicableGrey(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
///	@Test(priority = 25) 
	void CTWNotApplicableGrey11() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Compliance Status Summary - Not Applicable Status - Multiple Filter Verification");
		
		Method5.CTWNotApplicableGrey1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 26) 
	void ContractorwiseclosedAuditGraph1() throws InterruptedException, IOException
	{
       Thread.sleep(20000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(3000);
	    
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1300)");
	    Thread.sleep(2000);
	    String t = Locator5.ContractorTxt().getText();
	    
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[5]"))); 
		Thread.sleep(2000);
		test = extent.startTest("Bar Graph - ‘Contractor Wise’ Bar Graph for Closed Audits - "+" "+t+" "+" - Count Verification");
		
		Method5.ContractorwiseclosedAuditGraph(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 27) 
	void CLOSEDGraphFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - ‘Contractor Wise - Compliance Status Summary for Closed Audits - Multiple filter Verification");
		
		Method5.CLOSEDGraphFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 28) 
	void CTWAuditStatusSummeryOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Audit Status Summary - 'Canteen' - Count Verification");
		
		Method5.CTWAuditStatusSummeryOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 29) 
	void CTWAuditStatusSummeryOverdue11() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Audit Status Summary - Overdue Status - Multiple Filter Verification");
		
		Method5.CTWAuditStatusSummeryOverdue1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
///	@Test(priority = 30) 
	void CTWAuditStatusSummeryPendingReview11() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Audit Completion Status - Pending Review Status - Multiple Filter Verification");
		
		Method5.CTWAuditStatusSummeryPendingReview1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
///	@Test(priority = 31) 
	void CTWAuditStatusSummeryClosed1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Bar Graph - Audit Completion Status - Completed Status - Multiple Filter Verification");
		
		Method5.CTWAuditStatusSummeryClosed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority = 32) 
	void PWCSSABCConstructionCompliedHigh1() throws InterruptedException, IOException
	{
		Thread.sleep(20000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(3000);
	    
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2500)");
	    Thread.sleep(2000);
	    
		
	    try {
            // Create an instance of Robot class
            Robot robot = new Robot();

            // Define how many times you want to zoom out
            int zoomOutSteps = 3;

            // Perform the zoom out action multiple times
            for (int i = 0; i < zoomOutSteps; i++) {
                // Press Ctrl key
                robot.keyPress(KeyEvent.VK_CONTROL);
                // Press '-' key
                robot.keyPress(KeyEvent.VK_MINUS);
                // Release '-' key
                robot.keyRelease(KeyEvent.VK_CONTROL);

                // Optional: Wait a bit between zoom steps to observe the effect
                Thread.sleep(500);
            }

        } catch (Exception e) {
            
        }
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[4]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='CHN-CTS-MEPZ-TBM']"))); 
		Thread.sleep(2000);
	
		String p = Locator5.PWCSSABCConstructionComplied().getText();
		Thread.sleep(2000);
		test = extent.startTest("Bar Graph - Facility Wise - Compliance Status Summary - "+" "+p+" "+" - Complied Status -  Count Verification");
		
		Method5.PWCSSABCConstructionCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 33) 
	void PWCSCompliedGraphMultipleFilterHigh11() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary -Complied Status - High Risk  - Multiple Filter Verification");
		
		Method5.PWCSCompliedGraphMultipleFilterHigh1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 34) 
	void PWCSSCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary -Complied Status - Medium Risk - Multiple Filter Verification");
		
		Method5.PWCSSCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
///	@Test(priority = 35) 
	void PWCSSCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary -Complied Status - Low Risk - Multiple Filter Verification");
		
		Method5.PWCSSCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority = 36) 
	void PWCSSABCconstructionNotCompliedHigh1() throws InterruptedException, IOException
	{
		Thread.sleep(20000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(3000);
	    
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2500)");
	    Thread.sleep(2000);
	    
	    try {
            // Create an instance of Robot class
            Robot robot = new Robot();

            // Define how many times you want to zoom out
            int zoomOutSteps = 3;

            // Perform the zoom out action multiple times
            for (int i = 0; i < zoomOutSteps; i++) {
                // Press Ctrl key
                robot.keyPress(KeyEvent.VK_CONTROL);
                // Press '-' key
                robot.keyPress(KeyEvent.VK_MINUS);
                // Release '-' key
                robot.keyRelease(KeyEvent.VK_CONTROL);

                // Optional: Wait a bit between zoom steps to observe the effect
                Thread.sleep(500);
            }

        } catch (Exception e) {
            
        }
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[4]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='CHN-CTS-MEPZ-TBM']"))); 
		Thread.sleep(2000);
	    
		String p = Locator5.PWCSSABCConstructionComplied().getText();
		Thread.sleep(4000);
		test = extent.startTest("Bar Graph - Facility Wise - Compliance Status Summary - "+" "+p+" "+" - Not Complied Status -  Count Verification");
		
		Method5.PWCSSABCconstructionNotCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 37) 
	void PWCSSNotCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Complied Status - High Risk - Multiple Filter Verification");
		
		Method5.PWCSSNotCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
//	@Test(priority = 38) 
	void PWCSSNotCompliedGraphMultipleFilterMedium11() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Complied Status - Medium Risk  - Multiple Filter Verification");
		
		Method5.PWCSSNotCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
//	@Test(priority = 39) 
	void PWCSSNotCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Complied Status - Low Risk - Multiple Filter Verification");
		
		Method5.PWCSSNotCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	
	@Test(priority = 40) 
	void PWCSSABCconstructionNotApplicableHigh1() throws InterruptedException, IOException
	{
		Thread.sleep(20000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(3000);
	    
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2500)");
	    Thread.sleep(2000);
	    
	    try {
            // Create an instance of Robot class
            Robot robot = new Robot();

            // Define how many times you want to zoom out
            int zoomOutSteps = 3;

            // Perform the zoom out action multiple times
            for (int i = 0; i < zoomOutSteps; i++) {
                // Press Ctrl key
                robot.keyPress(KeyEvent.VK_CONTROL);
                // Press '-' key
                robot.keyPress(KeyEvent.VK_MINUS);
                // Release '-' key
                robot.keyRelease(KeyEvent.VK_CONTROL);

                // Optional: Wait a bit between zoom steps to observe the effect
                Thread.sleep(500);
            }

        } catch (Exception e) {
            
        }
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[4]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='CHN-CTS-MEPZ-TBM']"))); 
		Thread.sleep(2000);
		
		String p = Locator5.PWCSSABCConstructionComplied().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Bar Graph - Facility Wise - Compliance Status Summary - "+" "+p+""+" - Not Applicable Status - Count Verification");
		
		Method5.PWCSSABCconstructionNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
///	@Test(priority = 41) 
	void PWCSNotApplicableHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Applicable Status - High Risk - Multiple Filter Verification");
		
		Method5.PWCSNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 42) 
	void PWCSNotApplicableGraphmedium11() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Applicable Status - Medium Risk - Multiple Filter Verification");
		
		Method5.PWCSNotApplicableGraphmedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 43) 
	void PWCSSNotApplicableGraphLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Applicable Status - Low Risk - Multiple Filter Verification");
		
		Method5.PWCSSNotApplicableGraphLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	@Test(priority = 44) 
	void PWAuditStatusSummeryABCConstructionOverdue1() throws InterruptedException, IOException
	{
		Thread.sleep(26000);
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(18000);
	    String t=Locator5.FacilityTxt().getText();	
	    System.out.println(t);
		
		test = extent.startTest("Bar Graph - Facility Wise - Audit Status Summary - "+" "+ t+" "+" - Count Verification");
		
		Method5.PWAuditStatusSummeryABCConstructionOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 45) 
	void PWAuditStatusSummeryABCConstructionOverdue11() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Facility Wise - Audit Status Summary - Multiple Filter Verification");
		
		Method5.PWAuditStatusSummeryABCConstructionOverdue1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 46) 
	void PWCSSubcontractorCompliedHigh1() throws InterruptedException, IOException
	{
		//WebWait wait = new WebWait(1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3500)");
	    Thread.sleep(2000);
		
		String t = Locator5.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - " + t + " Complied Status Verification");
		
		Method5.PWCSSubcontractorCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 47) 
	void SubContrctorCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - Complied Status - High Risk - Multiple Filter Verification");
		
		Method5.SubContrctorCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 48) 
	void SubContrctorCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) -Complied Status - Medium Risk - Multiple Filter Verification");
		
		Method5.SubContrctorCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 49) 
	void PWCSubContractorCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) -Complied Status - Low Risk - Multiple Filter Verification");
		
		Method5.PWCSubContractorCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	@Test(priority = 50) 
	void PWCSSubcontractorNotCompliedHigh1() throws InterruptedException, IOException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3500)");
	    Thread.sleep(2000);
		
		String t = Locator5.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - " + t + " Not Complied Status Verification");
				
		Method5.PWCSSubcontractorNotCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 51) 
	void PWSubContractorNotCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - Not Complied Status - High Risk - Multiple Filter Verification");
		
		Method5.PWSubContractorNotCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
///	@Test(priority = 52) 
	void PWCSSNotCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - Not Complied Status - Medium Risk  - Multiple Filter Verification");
		
		Method5.PWSubContractorNotCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 53) 
	void PWCSubContractorNotCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - Not Complied Status - Low Risk - Multiple Filter Verification");
		
		Method5.PWCSubContractorNotCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 54) 
	void PWCSSubcontractorNotApplicableMedium1() throws InterruptedException, IOException
	{
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3500)");
	    Thread.sleep(2000);
		
		String t = Locator5.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - " + t + " Not Applicable Status Verification");
		
		Method5.PWCSSubcontractorNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
///	@Test(priority = 55) 
	void PWCSubContractorNotApplicableGraphHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - Not Applicable Status - High Risk - Multiple Filter Verification");
		
		Method5.PWCSubContractorNotApplicableGraphHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
///	@Test(priority = 56) 
	void PWCSNotApplicableGraphmedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - Not Applicable Status - Medium Risk - Multiple Filter Verification");
		
		Method5.PWCSubContractorNotApplicableGraphmedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
///	@Test(priority = 57) 
	void PWCSubContractorNotApplicableGraphLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Summary (Sub Contractor) - Not Applicable Status - Low Risk - Multiple Filter Verification");
		
		Method5.PWCSubContractorNotApplicableGraphLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 58) 
	void performDownloadAndVerify1() throws InterruptedException, IOException
	{
		test = extent.startTest("License - License view download Verification ");
		
		Method5.performDownloadAndVerify(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 59) 
	void DocumentViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - View Button Verification");
		
		Method5.DocumentViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	@Test(priority = 60) 
	void DownoloadCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Action Columnn - Download Button Verification");
		
		Method5.DownoloadCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 61) 
	void multipleDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Multiple File Download Verification");
		
		Method5.multipleDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 62) 
	void DocumentClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Clear Button Verification");
		
		Method5.DocumentClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 63) 
	void DocumentTabMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Multiple Filter Verification");
		
		Method4.DocumentTabMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 64) 
	void ExtendReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Export Button Verification");
		
		Method5.ExtendReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 65) 
	void AuditMonthComplianceReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Action Column - File Download Verification");
		
		Method5.AuditMonthComplianceReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 66) 
	void ReportClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Clear Button Verification");
		
		Method5.ReportClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 67) 
	void MoreReportDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - More Report Button Verification");
		
		Method5.MoreReportDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 68) 
	void ViewButtonReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - View Button Verification");
		
		Method5.ViewButtonReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 69) 
	void ReportMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Multiple Filter Verification");
		
		Method4.ReportMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	//////////////Multiple Filter Verification
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

		
	
	
	/*
	
	
	@Test(priority = 50) 
	void GridCountExcelCountMatchOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion Status - Overdue Status - Grid and Excel Count Match Verification");
		
		Method5.GridCountExcelCountMatchOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 51) 
	void ACSPendingReviewpendingReviewcountmatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion Status - Pending Review Status - Grid and Excel Count Match Verification");
		
		Method5.ACSPendingReviewSWSCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 52) 
	void CTWAuditStatusSummeryOverdueCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Contractor Type Wise - Audit Status Summary - Overdue Status - Grid and Excel Count match Verification");
		
		Method5.CTWAuditStatusSummeryOverdueCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 53) 
	void CTWAuditStatusSummeryPendingReviewCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Contractor Type Wise - Audit Status Summary - Pending Review Status - Grid and Excel Count match Verification");
		
		Method5.CTWAuditStatusSummeryPendingReviewCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 54) 
	void PWAuditStatusSummeryABCConstructionOverdue1CountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise - Audit Status Summary - Grid and Excel Count match Verification");
		
		Method5.PWAuditStatusSummeryABCConstructionOverdue1CountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	*/
	
	


	
	
	
	
	
	
	
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(7000);
  	//	driver.close();
  		closeBrowser();
  	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
