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
import companyAuditor.Locator2;
import companyAuditor.Method2;
import companyContractor.Locator1;
import companyContractor.Method1;
import login.BasePage;

public class AuditorTestCases extends BasePage{

	
//	public static Web  = null;		//Web instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	public static WebElement element = null;
	public static WebElement graphElement = null;
	
	
	/*
	public static XSSFSheet ReadExcel() throws IOException
	{
		
	//	fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\TestData1.xlsx");
		
		fis = new FileInputStream("E:\\VenderAuditProject\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(2);					//Retrieving second sheet of Workbook
		return sheet;
	}
	*/
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
	//	extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\Reports\\VCACompanyAdmin.html",true);
	//	extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\Reports\\VCACompanyContractor.html",true);
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyAuditor.html",true);
		
		
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Auditor Login.");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		initialization("company",2);
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
	void UpcomingdashboardAndGridCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Upcoming Audit");
		
		Method2.UpcomingdashboardAndGridCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 2) 
	void UpcomingEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Upcoming Audit - Edit Button Verification");
		
		Method2.UpcomingEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 3) 
	void OverdueDashboardAndGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Overdue Audit");
		
		Method2.OverdueDashboardAndGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 4) 
	void OverdueEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Overdue Audit - Edit Button Verification");
		
		Method2.OverdueEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	/*
	
	@Test(priority = 5) 
	void RejectedDashBoardAndGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Rejected Audit");
		
		Method2.RejectedDashBoardAndGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 6) 
	void RejectedEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Rejected Audit - Edit Button Verification");
		
		Method2.RejectedEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 7) 
	void PendingReviewDashboardAndGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Pending Review Audit");
		
		Method2.PendingReviewDashboardAndGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
	@Test(priority = 8) 
	void PendingReviewUpdate1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Update - Download And View Button Verification");
		
		Method2.PendingReviewUpdate(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	
	@Test(priority = 9) 
	void ViewEditPR1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Update - View Button Verification");
		
		Method2.ViewEditPR(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 10) 
	void CommentButtonPR1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Update - Comment Button Verification");
		
		Method2.CommentButtonPR(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 11) 
	void UpdateInEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Update - Change Reviewer Status Verification");
		
		Method2.UpdateInEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	@Test(priority = 12) 
	void ClosedDashboardAndGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Dashboard Tab - Closed Audit");
		
		Method2.ClosedDashboardAndGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	@Test(priority = 13) 
	void ClosedReviewEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Dashboard Tab - Closed Audit - Edit Button Verification");
		
		Method2.ClosedReviewEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	   @Test(priority = 14) 
		void CLosedStatusReopen1() throws InterruptedException, IOException
		{
			test = extent.startTest("Dashboard Tab - Closed Audit - Reopen Button Verification ");
			
			Method2.CLosedStatusReopen(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	   
	   
	   @Test(priority = 15) 
		void GraphCountMatchGreen1() throws InterruptedException, IOException
		{
			test = extent.startTest("Pie Chart - Status Wise Summery - 'Complied Graph' Count Verification ");
			
			Method2.GraphCountMatch(test,workbook, element,graphElement);

			extent.endTest(test);
			extent.flush();
		}
		

		
		
		
		@Test(priority = 16) 
		void RedInRedGraphCountMatch1() throws InterruptedException, IOException
		{
			test = extent.startTest("Pie Chart - Status Wise Summery - 'Not Complied Graph' Count Verification ");
			
			Method2.RedInRedGraphCountMatch(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 17) 
		void GreyInRedCountMtch1() throws InterruptedException, IOException
		{
			test = extent.startTest("Pie Chart - Status Wise Summery - 'Not Applicable Graph' Count Verification");
			
			Method2.GreyInRedCountMtch(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		
		///Audit Completion Status
		
		
		
		
		@Test(priority = 18) 
		void AuditCompletionStatusRed1() throws InterruptedException, IOException
		{
			test = extent.startTest("Pie Chart- Status Wise Summery - 'Audit Completion Status' Count Verification  ");
			
			Method2.AuditCompletionStatusRed(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		 
		
		
		///////////////////////////
		
		//Project Wise  compliance Summery
		
		
		
		@Test(priority = 19) 
		void PWSCompliedHighRisk1() throws InterruptedException, IOException
		{
			test = extent.startTest("Bar Chart- Project Wise Summery -'Complied' Count Verification  ");
			
			Method2.CompliedHighRisk(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		

		
		
		
		@Test(priority = 20) 
		void PWSNotCompliedHigh1() throws InterruptedException, IOException
		{
			test = extent.startTest("Bar Chart- Project Wise Summery -'Not Complied' Count Verification  ");
			
			Method2.PWSNotCompliedHigh(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 21) 
		void NotApplicableHigh1() throws InterruptedException, IOException
		{
			test = extent.startTest("Bar Chart- Project Wise Summery -'Not Applicable' Count Verification  ");
			
			Method2.NotApplicableHigh(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		


	
	@Test(priority = 22) 
	void ViewDocument1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - View Button Verification");
		
		Method2.ViewDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 23) 
	void DownloadCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Download Button Verification");
		
		Method2.DownloadCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 24) 
	void MultipleComplianceDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Multiple File Download Verification");
		
		Method2.MultipleComplianceDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 25) 
	void DocumentClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Clear Button Verification");
		
		Method2.DocumentClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
   @Test(priority = 26) 
	void ExportReportR1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Export Button Verification");
		
		Method2.ExportReportR(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 27) 
	void ClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Clear Button Verification");
		
		Method2.ClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 28) 
	void ActnColmFileDownld1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Action Column - File Download Verification");
		
		Method2.ActnColmFileDownld(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 29) 
	void MoreReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - More Report Button Verification");
		
		Method2.MoreReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 30) 
	void ViewReportOfCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Project - View Button Verification");
		
		Method2.ViewReportOfCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	/////////////////////////////////////////////s
	
	
	
	

	
		
	
	
	
	@Test(priority = 31) 
	void PWSNotCompliedLowRisk1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart- Project Wise Summery -'Not Complied' Count Verification  ");
		
		Method2.PWSNotCompliedLowRisk(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	/*
	
	@Test(priority = 47) 
	void NotApplicableHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart- Project Wise Complience Summery -'Not Applicable-Thapar Institute Project' Count Verification  ");
		
		Method2.NotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	////////////////////////////////////////Fake
	
	
	
	
	
	
//	@Test(priority = 48) 
	void PwsNotApplicableLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart -'Not Applicable-GR Infra Project' Count Verification  ");
		
		Method2.PwsNotApplicableLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	*/
	
	///////////////////////////Negative Scenarios
	
	
	
	
	
	
	@Test(priority = 32) 
	void PendingReviewWithoutSelectCheckListStatus1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Without Select CheckList Status Update Pending Review Verification  ");
		
		Method2.PendingReviewWithoutSelectCheckListStatus(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 33) 
	void PendingReviewWithoutSelectCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Without Select Compliance Update Pending Review Verification  ");
		
		Method2.PendingReviewWithoutSelectCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 34) 
	void AddHeadCountOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Add Head Count Verification  ");
		
		Method2.AddHeadCountOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 35) 
	void AddHeadCountOverduevalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Without Enter Data Add Head Count Verification  ");
		
		Method2.AddHeadCountOverduevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 36) 
	void deleteHeadCountOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Delete Head Count Verification  ");
		
		Method2.deleteHeadCountOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 37) 
	void AddHeadCountvalidationOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Without Enter data In every field add Head Count Verification  ");
		
		Method2.AddHeadCountvalidationOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority = 38) 
	void AddHeadCountPendingReview1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Add Head Count Verification  ");
		
		Method2.AddHeadCountPendingReview(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 39) 
	void AddHeadCountPendingReviewvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Without Enter data Add Head Count Verification  ");
		
		Method2.AddHeadCountPendingReviewvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 40) 
	void deleteHeadCountPendingReview1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Delete Head Count Verification  ");
		
		Method2.deleteHeadCountPendingReview(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 41) 
	void AddHeadCountvalidation11() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Without Enter data In Every Field Add Head Count Verification  ");
		
		Method2.AddHeadCountvalidation1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	/////////////////Multiple Filter
	
	
	
	@Test(priority = 42) 
	void UpcomingMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Multiple Filter Verification  ");
		
		Method2.UpcomingMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 43) 
	void RejectedMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Rejected Audit - Multiple Filter Verification  ");
		
		Method2.RejectedMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 44) 
	void ClosedMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Closed Audit - Multiple Filter Verification  ");
		
		Method2.ClosedMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 45) 
	void OverdueMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Multiple Filter Verification  ");
		
		Method2.OverdueMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 46) 
	void PendingReviewMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Multiple Filter Verification  ");
		
		Method2.PendingReviewMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority = 47) 
	void CompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied status - High Risk - Multiple Filter Verification  ");
		
		Method2.CompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 48) 
	void CompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied status - Medium Risk - Multiple Filter Verification  ");
		
		Method2.CompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 49) 
	void CompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied status - Low Risk - Multiple Filter Verification  ");
		
		Method2.CompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 50) 
	void NotCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied status - High Risk - Multiple Filter Verification  ");
		
		Method2.NotCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 51) 
	void NotCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied status - Medium Risk - Multiple Filter Verification  ");
		
		Method2.NotCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 52) 
	void NotCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied status - Low Risk - Multiple Filter Verification  ");
		
		Method2.NotCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 53) 
	void NotApplicableGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable status - High Risk - Multiple Filter Verification  ");
		
		Method2.NotApplicableGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 54) 
	void NotApplicableGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable status - Medium Risk - Multiple Filter Verification  ");
		
		Method2.NotApplicableGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 55) 
	void NotApplicableGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable status - Low Risk - Multiple Filter Verification  ");
		
		Method2.NotApplicableGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 56) 
	void ACSOverdueMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion status - Overdue Status - Multiple Filter Verification  ");
		
		Method2.ACSOverdueMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 57) 
	void ACSPendingReviewMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion status - Pending Review Status - Multiple Filter Verification  ");
		
		Method2.ACSPendingReviewMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 58) 
	void PWCSCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summary -  Complied status - High Risk - Multiple Filter Verification  ");
		
		Method2.PWCSCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 59) 
	void PWCSSCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summary - Complied status - Medium Risk - Multiple Filter Verification  ");
		
		Method2.PWCSSCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 60) 
	void PWCSSCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summary - Complied status - Low Risk - Multiple Filter Verification  ");
		
		Method2.PWCSSCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 61) 
	void PWCSSNotCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summary - Not Complied status - High Risk - Multiple Filter Verification  ");
		
		Method2.PWCSSNotCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 62) 
	void PWCSSNotCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summary -  Not Complied status - Medium Risk - Multiple Filter Verification  ");
		
		Method2.PWCSSNotCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 63) 
	void PWCSSNotCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summary - Not Complied status - Low Risk - Multiple Filter Verification  ");
		
		Method2.PWCSSNotCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	


	
	
	@Test(priority = 64)
	void PWCSNotApplicableHigh1() throws InterruptedException, IOException
	{
		
        Thread.sleep(19000);
        
        /*
        JavascriptExecutor js = (JavascriptExecutor) ;
	    
	    js.executeScript("document.body.style.zoom = '100%';");
	    Thread.sleep(5000);
		*/
		
		JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
	    
        
		String t = Locator2.PWSNotApplicableGraph().getText();	//Reading Dashboard count.
		Thread.sleep(5000);
		
		String t1 = Locator2.PWSNotApplicableGraphConstruction().getText();
		
		
		test = extent.startTest("Project Wise Compliance Summary - Not Applicable status - " + t + " " + t1 + " Project - Multiple Filter Verification  ");
		
		Method2.PWCSNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
//	@Test(priority = 82) 
	void PWCSNotApplicableGraphmedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summary - Not Applicable status - Medium Risk - Multiple Filter Verification  ");
		
		Method2.PWCSNotApplicableGraphmedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 83) 
	void PWCSSNotApplicableGraphLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Project Wise Compliance Summary - Not Applicable status - Low Risk - Multiple Filter Verification  ");
		
		Method2.PWCSSNotApplicableGraphLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 65) 
	void DocumentTabMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Multiple Filter Verification  ");
		
		Method2.DocumentTabMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 66) 
	void ReportMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Multiple Filter Verification  ");
		
		Method2.ReportMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 67) 
	void AddHeadCountUpcomingAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Head Count Verification");
		
		Method2.AddHeadCountUpcomingAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 68) 
	void RejectedHeadCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Rejected Audit - Head Count Verification");
		
		Method2.RejectedHeadCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 69) 
	void ClosedReviewAddHeadCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Closed Audit - Head Count Verification");
		
		Method2.ClosedReviewAddHeadCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 70) 
	void UpcomingExcelcountAndGridMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Excel and Grid Count match Verification ");
		
		Method2.UpcomingExcelcountAndGridMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 71) 
	void overdueExcelcountAndGridMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Excel and Grid Count match Verification");
		
		Method2.overdueExcelcountAndGridMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 72) 
	void RejectedExcelcountAndGridMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Rejected Audit - Excel and Grid Count match Verification");
		
		Method2.RejectedExcelcountAndGridMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 73) 
	void PendingReviewExcelcountAndGridMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Excel and Grid Count match Verification");
		
		Method2.PendingReviewExcelcountAndGridMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 74) 
	void ClosedExcelcountAndGridMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Closed Audit - Excel and Grid Count match Verification");
		
		Method2.ClosedExcelcountAndGridMatch(test,workbook);
		
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
