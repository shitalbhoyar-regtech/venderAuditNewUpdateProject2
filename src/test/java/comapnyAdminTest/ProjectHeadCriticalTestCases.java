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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyContractor.Method1;
import companyManagement.Method5;
import companyProjectDirector.Method4;
import companyProjectHead.CriticalMethod3;
import companyProjectHead.Locator3;
import companyProjectHead.Method3;
import login.BasePage;

public class ProjectHeadCriticalTestCases extends BasePage {
	
	
	
	
	
	
	
	
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
		sheet = workbook.getSheetAt(3);					//Retrieving second sheet of Workbook
		return sheet;
	}
	*/
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyProjectHeadCritical.html",true);
		test = extent.startTest("Logging In - Project Head Login (Critical)");
		
		test.log(LogStatus.PASS, "Test Passed ");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		initialization("company",3);
		/*
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup3(URL);	

	
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		 = login.Login.UserLogin(uname,password,"company");		//Method of Login class to login user.
		*/
	}
	
	
	
	/*
	
	@Test(priority = 1) 
	void ProjectsCountGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Project Audit dashboard and Grid Count Verification ");
		
		CriticalMethod3.ProjectsCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 2) 
	void ContractorsCountGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Contractors Audit dashboard and Grid Count Verification ");
		
		Method3.ContractorsCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 3) 
	void GraphCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Complied Graph' Count Verification");
		
		Method3.GraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 4) 
	void RedInRedGraphCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Not Complied Graph' Count Verification");
		
		Method3.RedInRedGraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 5) 
	void GreyInRedCountMtch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Not Applicable Graph' Count Verification");
		
		Method3.GreyInRedCountMtch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	@Test(priority = 6) 
	void AuditCompletionStatusRed1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Audit Completion Status' Count Verification");
		
		Method3.AuditCompletionStatusRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 7) 
	void CTWCompliedgreen1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Contractor Type Wise - Compliance Status Summary - Food Technology - 'Complied Status' Count Verification");
		
		Method3.CTWCompliedgreen(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 8) 
	void CTWNotCompliedRed1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Contractor Type Wise - Compliance Status Summary - Food Technology - 'Not Complied Status' Count Verification");
		
		Method3.CTWNotCompliedRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 9) 
	void CTWNotApplicableGrey1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Contractor Type Wise - Compliance Status Summary - Food Technology - 'Not Applicable Status' Count Verification");
		
		Method3.CTWNotApplicableGrey(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 10) 
	void ContractorwiseclosedAuditGraph1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - ‘Contractor Wise’ Bar Graph for Closed Audits - Suraj Contractor - Count Verification");
		
		Method3.ContractorwiseclosedAuditGraph(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	*/
	
	@Test(priority = 11) 
	void CTWAuditStatusSummeryOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Contractor Type Wise - Audit Status Summary - Food Technology - Count Verification");
		
		Method3.CTWAuditStatusSummeryOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 11) 
	void PWCSSABCConstructionCompliedHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Project Wise - Compliance Status Summary - Complied Status - 'Project - Geet Heritage' Count Verification");
		
		Method3.PWCSSABCConstructionCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 12) 
	void PWCSSABCconstructionNotCompliedHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Project Wise - Compliance Status Summary - Not Complied Status - 'Project - Geet Heritage' Count Verification");
		
		Method3.PWCSSABCconstructionNotCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 13) 
	void PWCSSABCconstructionNotApplicableHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Project Wise - Compliance Status Summary - Not Applicable Status - 'Project - Geet Heritage' Count Verification");
		
		Method3.PWCSSABCconstructionNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	/*
	
	
	@Test(priority = 14) 
	void PWAuditStatusSummeryABCConstructionOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Graph - Project Wise - Audit Status Summary - ' Project - AK Heights ' Count Verification");
		
		Method3.PWAuditStatusSummeryABCConstructionOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 15) 
	void PWCSSubcontractorCompliedHigh1() throws InterruptedException, IOException
	{
		Thread.sleep(20000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3700)");
	    Thread.sleep(2000);
		
		String t = Locator3.RudraHeritage().getText();
		Thread.sleep(3000);
		
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - " + t + " Complied Status Verification");
		
		Method3.PWCSSubcontractorCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 16) 
	void PWCSSubcontractorNotCompliedMedium1() throws InterruptedException, IOException
	{
		
		
	//	WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor)getDriver() ;
	    
	    jss.executeScript("window.scrollBy(0,3700)");
	    Thread.sleep(2000);
		
		String t = Locator3.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - " + t + " Not Complied Status Verification");
				
		Method3.PWCSSubcontractorNotCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 17) 
	void PWCSSubcontractorNotApplicableMedium1() throws InterruptedException, IOException
	{
	//	WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3700)");
	    Thread.sleep(2000);
		
		String t = Locator3.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - " + t + " Not Applicable Status Verification");
		
		Method3.PWCSSubcontractorNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 20) 
	void MyWorkspaceLicense1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - License tab seen below the dashboard Verification ");
		
		Method3.MyWorkspaceLicense(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 20) 
	void AddLicenceCT1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Add License Verification ");
		
		Method1.AddLicenceCT(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 21) 
	void MyWorkspaceLicenseSearch1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - License tab Verification ");
		
		Method3.MyWorkspaceLicenseSearch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	@Test(priority = 22) 
	void DocumentViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - View Button Verification");
		
		Method3.DocumentViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 23) 
	void DownloadCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Download Button Verification");
		
		Method3.DownloadCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 24) 
	void MultipleDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Multiple File Download Verification");
		
		Method3.MultipleDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority = 25) 
	void DocumentClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Clear Button Verification");
		
		Method3.DocumentClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 26) 
	void ExtendReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Export Button Verification");
		
		Method3.ExtendReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 27) 
	void FileDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Action Column - File Download Verification");
		
		Method3.FileDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 28) 
	void ClearButtonReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Clear Button Verification");
		
		Method3.ClearButtonReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 29) 
	void MoreReportDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - More Report Button Verification");
		
		Method3.MoreReportDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 30) 
	void ViewButton() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Project Column Triangle - View Button Verification");
		
		Method3.ViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 31) 
	void DownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Download And View Button Verification");
		
		Method3.DownloadAndViewButton(test,workbook);
		
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
