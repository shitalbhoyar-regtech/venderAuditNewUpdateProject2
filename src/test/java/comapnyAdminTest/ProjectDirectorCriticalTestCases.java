package comapnyAdminTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyContractor.Method1;
import companyProjectDirector.CriticalMethod4;
import companyProjectDirector.Locator4;
import companyProjectDirector.Method4;
import login.BasePage;

public class ProjectDirectorCriticalTestCases extends BasePage{
	
	
	
	
//	public static Web  = null;		//Web instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	
	/*
	public static XSSFSheet ReadExcel() throws IOException
	{
		
		fis = new FileInputStream("E:\\\\VenderAuditProject\\\\TestData\\\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(4);					//Retrieving second sheet of Workbook
		return sheet;
	}
	*/
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyProjectDirectorCritical.html",true);
		test = extent.startTest("Project Director Login (Critical)");
		
		test.log(LogStatus.PASS, "Test Passed");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		initialization("company",4);
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
		test = extent.startTest("Dashboard Tab - Project Audit dashboard and Grid Count Verification ");
		
		CriticalMethod4.ProjectsCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 3) 
	void ContractorsCountGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Contractors Audit dashboard and Grid Count Verification ");
		
		CriticalMethod4.ContractorsCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 4) 
	void LocationPopupCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Compliance Box verification");
		
		CriticalMethod4.LocationPopupCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 5) 
	void GraphCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Complied Graph' Count Verification");
		
		CriticalMethod4.GraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 6) 
	void RedInRedGraphCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Not Complied Graph' Count Verification");
		
		CriticalMethod4.RedInRedGraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 7) 
	void GreyInRedCountMtch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Not Applicable Graph' Count Verification");
		
		CriticalMethod4.GreyInRedCountMtch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	@Test(priority = 8) 
	void AuditCompletionStatusRed1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Audit Completion Status' Count Verification");
		
		CriticalMethod4.AuditCompletionStatusRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	@Test(priority = 9) 
	void CTWCompliedgreen1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Compliance Status Summary - 'Complied Status' Count Verification");
		
		CriticalMethod4.CTWCompliedgreen(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	

	
	
	
	@Test(priority = 10) 
	void CTWNotCompliedRed1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Compliance Status Summary - 'Not Complied Status' Count Verification");
		
		CriticalMethod4.CTWNotCompliedRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	
	@Test(priority = 11) 
	void CTWNotApplicableGrey1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Compliance Status Summary - 'Not Applicable Status' Count Verification");
		
		CriticalMethod4.CTWNotApplicableGrey(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 12) 
	void CTWAuditStatusSummeryOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Stake Holder Wise - Audit Status Summary - Count Verification' Count Verification");
		
		CriticalMethod4.CTWAuditStatusSummeryOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 13) 
	void PWCSSABCConstructionCompliedHigh1() throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		String t = Locator4.PWCSSABCConstructionComplied().getText();
		Thread.sleep(2000);
		
		test = extent.startTest("Bar Graph - Facility Wise - Compliance Status Summary - Complied Status -  " + t + " Count Verification");
		
		CriticalMethod4.PWCSSABCConstructionCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 14) 
	void PWCSSABCconstructionNotCompliedHigh1() throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		String t = Locator4.PWCSSABCConstructionComplied().getText();
		Thread.sleep(2000);

		test = extent.startTest("Bar Graph - Facility Wise - Compliance Status Summary - Not Complied Status -  " + t + " Count Verification");
		
		CriticalMethod4.PWCSSABCconstructionNotCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 15) 
	void PWCSSABCconstructionNotApplicableHigh1() throws InterruptedException, IOException
	{
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		String t = Locator4.PWCSSABCConstructionComplied().getText();
		Thread.sleep(2000);

		test = extent.startTest("Bar Graph - Facility Wise - Compliance Status Summary - Not Applicable Status - " + t + " Count Verification");
		
		CriticalMethod4.PWCSSABCconstructionNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 16) 
	void PWAuditStatusSummeryABCConstructionOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Facility Wise - Audit Status Summary - 'Geet Heritage ' Count Verification");
		
		CriticalMethod4.PWAuditStatusSummeryABCConstructionOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 17) 
	void PWCSSubcontractorCompliedHigh1() throws InterruptedException, IOException
	{
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
		
		String t = Locator4.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Bar Chart - Facility Wise - Compliance Summary (Sub Contractor) - " + t + " Complied Status Verification");
		
		Method4.PWCSSubcontractorCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
//	@Test(priority = 18) 
	void PWCSSubcontractorNotCompliedHigh1() throws InterruptedException, IOException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
		
		String t = Locator4.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Bar Chart - Facility Wise - Compliance Summary (Sub Contractor) - " + t + " Not Complied Status Verification");
				
		Method4.PWCSSubcontractorNotCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
//	@Test(priority = 19) 
	void PWCSSubcontractorNotApplicableMedium1() throws InterruptedException, IOException
	{
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
		
		String t = Locator4.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Bar Chart - Facility Wise - Compliance Summary (Sub Contractor) - " + t + " Not Applicable Status Verification");
		
		Method4.PWCSSubcontractorNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 20) 
	void MyWorkspaceLicense1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - License tab seen below the dashboard Verification ");
		
		Method4.MyWorkspaceLicense(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 21) 
	void MyWorkspaceLicenseSearch1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - License tab Verification ");
		
		Method4.MyWorkspaceLicenseSearch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 22) 
	void DocumentViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - View Button Verification");
		
		CriticalMethod4.DocumentViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 23) 
	void DownoloadCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Action Columnn - Download Button Verification");
		
		CriticalMethod4.DownoloadCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 24) 
	void multipleDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Multiple File Download Verification");
		
		CriticalMethod4.multipleDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 25) 
	void DocumentClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Clear Button Verification");
		
		CriticalMethod4.DocumentClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 26) 
	void ExtendReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Export Button Verification");
		
		CriticalMethod4.ExtendReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 27) 
	void AuditMonthComplianceReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Action Column - File Download Verification");
		
		CriticalMethod4.AuditMonthComplianceReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 28) 
	void ReportClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Clear Button Verification");
		
		CriticalMethod4.ReportClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 29) 
	void MoreReportDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - More Report Button Verification");
		
		CriticalMethod4.MoreReportDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 30) 
	void ViewButtonReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - View Button Verification");
		
		CriticalMethod4.ViewButtonReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 31) 
	void DownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Download And View Button Is Clickable");
		
		CriticalMethod4.DownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(7000);
  		//driver.close();
  		closeBrowser();
  	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
