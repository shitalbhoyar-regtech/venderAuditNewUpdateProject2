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

import companyAdmin.Method;
import companyAuditor.Method2;
import companyContractor.Locator1;
import companyContractor.Method1;
import companyProjectHead.Method3;
import login.BasePage;

public class ContractorTestCases1 extends BasePage{

	
	
	
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
		
	//	fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\TestData1.xlsx");
		
		fis = new FileInputStream("E:\\VenderAuditProject\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(1);					//Retrieving second sheet of Workbook
		return sheet;
	}
	*/
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
	//	extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\Reports\\VCACompanyAdmin.html",true);
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyContractor.html",true);
		
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Contractor Login");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		initialization("company",1);
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
	

//	@Test(priority = 1) 
	void DashboardCountGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Upcoming Audit");
		
		Method1.DashboardCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	
//	@Test(priority = 2) 
	void UpcomingView1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit -Edit- View Document Button Verification   ");
		
		Method1.UpcomingView(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
//	@Test(priority = 3)                                                                    
	void CommentButtonUpcoming1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Chat Button Verification");
		
		Method1.CommentButtonUpcoming(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 4)                                                                    
	void UpcomingDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Download Button Verification");
		
		Method1.UpcomingDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 5)                                                                    
	void UpcomingAuditLog1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Audit Log Button Verification");
		
		Method1.UpcomingAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 6)                                                                    
	void Upcomingtransactionandstatuslog1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Audit Log - transaction and status log tab Verification");
		
		Method1.Upcomingtransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
//	@Test(priority = 7)                                                                    
	void UpcomingDownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - View Compliance Button Verification");
		
		Method1.UpcomingDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	


//	@Test(priority = 8)                                                                    
	void UpdateUpcoming1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Audit Submited For Auditor Review");
		
		Method1.UpdateUpcoming(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =9 ) 
	void UpcomingMultipleFilter1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Upcoming Audit - Multiple Filter Verification  ");
		
		Method1.UpcomingMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	/*
	
	@Test(priority =7 ) 
	void overduecountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Overdue Audit");
		
		Method1.overduecountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	                                  
	@Test(priority =8 )                                                        
	void UpdateOverdue11() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Edit - Audit Submited For Auditor Review");
		
		Method1.UpdateOverdue1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =9)                                                        
	void OverdueDownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Edit - Download And View Button Verification");
		
		Method1.OverdueDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	
	@Test(priority =10 )                                                      
	void ViewOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Edit - View Button Verification");
		
		Method1.ViewOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =11 ) 
	void ComentOverdue11() throws InterruptedException, IOException                  
	{
		test = extent.startTest("Overdue Audit - Edit - Comment Button Verification");
		
		Method1.ComentOverdue1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =12 ) 
	void OverdueMultipleFilter1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Overdue Audit - Multiple Filter Verification  ");
		
		Method1.OverdueMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	/*
	
	@Test(priority =13 ) 
	void RejectedAndGridCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Rejected Audit");
		
		Method1.RejectedAndGridCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =14)                                                        
	void RejectedDownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Rejected Audit - Edit - Download And View Button Verification");
		
		Method1.RejectedDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =15 ) 
	void ViewRejected1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - View Button Verification");
		
		Method1.ViewRejected(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority =16 ) 
	void ComentRejected1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - Comment Button Verification");
		
		Method1.ComentRejected(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =17) 
	void RejectedMultipleFilter1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Rejected Audit - Multiple Filter Verification  ");
		
		Method1.RejectedMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority =18 ) 
	void PendingForReviewCountMatch1() throws InterruptedException, IOException           
	{
		test = extent.startTest(" Dashboard Tab - Pending Review Audit ");
		
		Method1.PendingForReviewCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority =19 ) 
	void PendingReviewDownloadAndViewButton1() throws InterruptedException, IOException           
	{
		test = extent.startTest(" Pending Review Audit - Edit - Download And View Button Verification ");
		
		Method1.PendingReviewDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =20 ) 
	void ViewPendingReview1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Pending Review Audit - Edit - View Button Verification ");
		
		Method1.ViewPendingReview(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =21 ) 
	void ComentPendingRewiew1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Pending Review Audit - Edit - Comment Button Verification");
		
		Method1.ComentPendingRewiew(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =22 ) 
	void PendingReviewMultipleFilter1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pending Review Audit - Multiple Filter Verification  ");
		
		Method1.PendingReviewMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	


	    @Test(priority =23 ) 
		void CountmatchClose1() throws InterruptedException, IOException           
		{
			test = extent.startTest(" Dashboard Tab - Closed Audit ");
			
			Method1.CountmatchClose(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	
	
	@Test(priority =24) 
	void ClosedDownloadAndViewButton1() throws InterruptedException, IOException           
	{
		test = extent.startTest(" Closed Audit - Edit - Download And View Button Verification ");
		
		Method1.ClosedDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =25 ) 
	void ViewClose1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - View Button Verification ");
		
		Method1.ViewClose(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =26 ) 
	void ComentClose1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - Comment Button Verification");
		
		Method1.ComentClose(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority =27 ) 
	void ClosedMultipleFilter1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Closed Audit - Multiple Filter Verification  ");
		
		Method1.ClosedMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	@Test(priority =28) 
	void GraphCountMatch1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - Completion Status- 'Complied Graph' Count Verification ");
		
		Method1.GraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =29 ) 
	void CompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Status Wise Summery - Complied status - High Risk - Multiple Filter Verification  ");
		
		Method1.CompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 30) 
	void CompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied Status - Medium Risk - Multiple Filter Verification");
		
		Method1.CompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 31) 
	void CompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied Status - Low Risk - Multiple Filter Verification");
		
		Method1.CompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority =32 ) 
	void RedInRedGraphCountMatch1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - Completion Status- 'Not Complied Graph' Count Verification ");
		
		Method1.RedInRedGraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 33) 
	void NotCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied Status - High Risk - Multiple Filter Verification");
		
		Method1.NotCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 34) 
	void NotCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied Status - Medium Risk - Multiple Filter Verification");
		
		Method1.NotCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	@Test(priority = 35) 
	void NotCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied Status - Low Risk - Multiple Filter Verification");
		
		Method1.NotCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority =36 ) 
	void GreyInRedCountMtch1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - Completion Status- 'Not Applicable Graph' Count Verification ");
		
		Method1.GreyInRedCountMtch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 37) 
	void NotApplicableGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable Status - High Risk - Multiple Filter Verification");
		
		Method1.NotApplicableGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 38) 
	void NotApplicableGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable Status - Medium Risk - Multiple Filter Verification");
		
		Method1.NotApplicableGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 39) 
	void NotApplicableGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable Status - Low Risk - Multiple Filter Verification");
		
		Method1.NotApplicableGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	@Test(priority =40 ) 
	void AuditCompletionStatusRed1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - 'Audit Completion Status' Count Verification ");
		
		Method1.AuditCompletionStatusRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 41) 
	void ACSOverdueMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion status - Overdue Status - Multiple Filter Verification  ");
		
		Method1.ACSOverdueMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 42) 
	void ACSPendingReviewMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion status - Pending Review Status - Multiple Filter Verification  ");
		
		Method1.ACSPendingReviewMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	//////////////////
	
	@Test(priority = 43) 
	void ACSPClosedMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion status - Closed Status - Multiple Filter Verification  ");
		
		Method1.ACSPClosedMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority =44 ) 
	void AuditCompletionStatusOverdue1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - 'Audit Completion Status' - Overdue Edit Button Verification ");
		
		Method1.AuditCompletionStatusOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority =45 ) 
	void AuditCompletionStatusPendingReview1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - 'Audit Completion Status' - Pending Review - Edit Button Verification ");
		
		Method1.AuditCompletionStatusPendingReview(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority =46 ) 
	void AuditCompletionStatusClosed1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - 'Audit Completion Status' - Closed - Edit Button Verification ");
		
		Method1.AuditCompletionStatusClosed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	@Test(priority =47) 
	void PWSCompliedJKHills1() throws InterruptedException, IOException          
	{  
		Thread.sleep(19000);
		
		JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
		
		
	    String t = Locator1.PWSCompliedJKHills().getText();
		Thread.sleep(500);//Reading Dashboard count.
		
	//	String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

		test = extent.startTest("Bar Graph - Project Wise Compliance Summery - Complied - " + t + " " + " Project Count Verification ");
		
		Method1.PWSCompliedJKHills(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 48) 
	void PWSCompliedJKHillsMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summery - Complied status - Multiple Filter Verification  ");
		
		Method1.PWSCompliedJKHillsMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}	
	
	
	
	@Test(priority =49) 
	void PWSNotCompliedJKHills1() throws InterruptedException, IOException          
	{
		
       Thread.sleep(19000);
		
		JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
		
		
	    String t = Locator1.PWSCompliedJKHills().getText();
		Thread.sleep(500);//Reading Dashboard count.
		
	//	String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

		
		test = extent.startTest("Bar Graph - Project Wise Compliance Summery - Not Complied - " + t + " "  + " Project Count Verification ");
		
		Method1.PWSNotCompliedJKHills(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 50) 
	void PWSNotCompliedJKHillsHighMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summery - Not Complied status - Multiple Filter Verification  ");
		
		Method1.PWSNotCompliedJKHillsHighMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority =51) 
	void PWSNotApplicableJKHillHigh1() throws InterruptedException, IOException          
	{
		
        Thread.sleep(19000);
		
		JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
		
		
		String t = Locator1.PWSCompliedJKHills().getText();
		Thread.sleep(500);//Reading Dashboard count.
		
//		String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

		test = extent.startTest("Bar Graph - Project Wise Compliance Summery - Not Applicable - " + t + " " + " Project Count Verification ");
		
		Method1.PWSNotApplicableJKHillHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 52) 
	void PWSNotApplicableJKHillHighMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summery - Not Applicable status - Multiple Filter Verification  ");
		
		Method1.PWSNotApplicableJKHillHighMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	
	
	@Test(priority =53) 
	void ClearButtonDocument1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Document Tab - Clear Button Verification ");
		
		Method1.ClearButtonDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =54 ) 
	void ViewButtonDocuments1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Document Tab - View Button Verification ");
		
		Method1.ViewButtonDocuments(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =55 ) 
	void DownloadDocument1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Document Tab - Download Button Verification ");
		
		Method1.DownloadDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =56 ) 
	void DownloadMultipleDocument() throws InterruptedException, IOException          
	{
		test = extent.startTest("Document Tab - Multiple File Download Verification ");
		
		Method1.DownloadDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =57 ) 
	void ExportReportReport1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Report Tab - Export Button Verification ");
		
		Method1.ExportReportReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =58) 
	void MoreReportDownload1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Repor Tab - More Report Button Verification ");
		
		Method1.MoreReportDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =59 ) 
	void ClearButtonReport1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Report Tab - Clear Button Verification ");
		
		Method1.ClearButtonReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	
	
	//...........................Negative Test Cases Script
	
	
	/*
	
//	@Test(priority =21 ) 
	void AddHeadCount1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Upcoming Audit - Edit Button - Add Head Count Verification ");
		
		Method1.AddHeadCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
		
	
	
//	@Test(priority =22 ) 
	void AddHeadCountvalidation11() throws InterruptedException, IOException          
	{
		test = extent.startTest("Upcoming Audit - Edit Button - Add Head Count Without Enter Particular data Verification ");
		
		Method1.AddHeadCountvalidation1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
//	@Test(priority =23 ) 
	void UpdateUpcomingMultipleFile1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Upcoming Audit - Edit Button - Multiple File Upload Verification ");
		
		Method1.UpdateUpcomingMultipleFile(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	
	
//	@Test(priority =25 ) 
	void UpcomingWithoutSelectCheckListStatus() throws InterruptedException, IOException          
	{
		test = extent.startTest("Upcoming Audit - Edit Button - Without Select Checklist Status Update Upcoming Audit Verification  ");
		
		Method1.UpcomingWithoutSelectCheckListStatus(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
//	@Test(priority = 26 ) 
	void UpcomingWithoutSelectCompliance1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Upcoming Audit - Edit Button - Without Select Compliance - Update Upcoming Audit Verification  ");
		
		Method1.UpcomingWithoutSelectCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority =27 ) 
	void UpdateUpcomingAddPdfFile1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Upcoming Audit - Edit Button - Upload File Verification  ");
		
		Method1.UpdateUpcomingAddPdfFile(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
//	@Test(priority =30 ) 
	void OverdueWithoutSelectCheckListStatus1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Overdue Audit - Edit Button - Without Select Checklist Status - Update - Upcoming Audit Verification  ");
		
		Method1.OverdueWithoutSelectCheckListStatus(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
//	@Test(priority =31 ) 
	void OverdueWithoutSelectCompliance1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Overdue Audit - Edit Button - Without Select Compliance Update Upcoming Audit Verification  ");
		
		Method1.OverdueWithoutSelectCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
//	@Test(priority =37 ) 
	void UpdateOverdueAddPdfFile1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Overdue Audit - Edit Button - Upload File Verification  ");
		
		Method1.UpdateOverdueAddPdfFile(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
//	@Test(priority =40 ) 
	void AddHeadCountOverdue1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Overdue Audit - Edit Button - Add Head Count Verification ");
		
		Method1.AddHeadCountOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
//	@Test(priority =41 ) 
	void AddHeadCountOverduevalidation1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Overdue Audit - Edit Button - Without Enter Data Add Head Count Verification ");
		
		Method1.AddHeadCountOverduevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
//	@Test(priority =42 ) 
	void AddHeadCountOverdueRejected1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Rejected Audit - Edit Button - Add Head Count Verification ");
		
		Method1.AddHeadCountRejectedRejected(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority =43 ) 
	void AddHeadCountRejectedvalidation1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Rejected Audit - Edit Button - Without Enter Data Add Head Count Verification ");
		
		Method1.AddHeadCountRejectedvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
		
	
	
	
//	@Test(priority =45 ) 
	void AddHeadCountPendingReview1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pending Review Audit - Edit Button - Add Head Count Verification ");
		
		Method1.AddHeadCountPendingReview(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
//	@Test(priority =46 ) 
	void AddHeadCountPendingReviewvalidation1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pending Review Audit - Edit Button - Without Enter Data Add Head Count Verification ");
		
		Method1.AddHeadCountPendingReviewvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
//	@Test(priority =48 ) 
	void AddHeadCountClosed1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Closed Audit - Edit Button - Add Head Count Verification ");
		
		Method1.AddHeadCountClosed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
//	@Test(priority =49 ) 
	void AddHeadCountClosedvalidation1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Closed Audit - Edit Button - Without Enter Data Add Head Count Verification ");
		
		Method1.AddHeadCountClosedvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	

		
	
	
	
	
	
	
	
	
	
	
	@Test(priority = 70) 
	void ACSOverdueExcelAndGridCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion status - Overdue Status - Excel and Grid Count match Verification");
		
		Method1.ACSOverdueExcelAndGridCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 71) 
	void ACSPendingReviewExcelAndGridCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion status - Pending Review Status - Excel and Grid Count match Verification");
		
		Method1.ACSPendingReviewExcelAndGridCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	/*
	
	@Test(priority = 72) 
	void ReportTabGridAndExcelCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report tab - Grid and Excel sheet count match Verification ");
		
		Method.ReportTabGridAndExcelCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 72) 
	void DownoadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report tab - Download And View Button Verification ");
		
		Method1.DownoadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Test(priority = 58) 
	void SWSSubContractorCompliedHighMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summary (Sub-Contractor) - Complied status - Multiple Filter Verification  ");
		
		Method1.SWSSubContractorCompliedHighMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 59) 
	void SWSSubContractorNotCompliedHighMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summary (Sub-Contractor) - Not Complied status - Multiple Filter Verification  ");
		
		Method1.SWSSubContractorNotCompliedHighMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	////////////////
	
	@Test(priority = 60) 
	void SWSSubContractorApplicableMediumFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summary (Sub-Contractor) - Not Applicable status - Multiple Filter Verification  ");
		
		Method1.SWSSubContractorApplicableMediumFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 61) 
	void AuditCompletionStatusOverdueStatus1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summary (Sub-Contractor) - Audit Completion status - Multiple Filter Verification  ");
		
		Method1.AuditCompletionStatusOverdueStatus(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 62) 
	void PWSSUBContractorMediumFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise - Compliance Summary (Sub Contractor) - Complied status - Multiple Filter Verification  ");
		
		Method1.PWSSUBContractorMediumFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 63) 
	void PWSSUBContractorNotCompliedMediumMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise - Compliance Summary (Sub Contractor) - Not Complied status - Multiple Filter Verification  ");
		
		Method1.PWSSUBContractorNotCompliedMediumMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 64) 
	void PWSSUBContractorNotApplicableMediumMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise - Compliance Summary (Sub Contractor) - Not Applicable status - Multiple Filter Verification  ");
		
		Method1.PWSSUBContractorNotApplicableMediumMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	*/
	
	
	
	@AfterMethod
	void browserClosing() throws InterruptedException
	{
		Thread.sleep(5000);
	//	driver.quit();
		closeBrowser();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
