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

import companyAuditor.CriticalMethod2;
import companyAuditor.Locator2;
import companyAuditor.Method2;
import companyContractor.Locator1;
import companyContractor.Method1;
import login.BasePage;



public class AuditorCriticalTestCases extends BasePage{
	
	
	
	
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
	
	
	
	public static XSSFSheet ReadExcel() throws IOException
	{
		
	//	fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\TestData1.xlsx");
		
		fis = new FileInputStream("E:\\VenderAuditProject\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(2);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
	//	extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\Reports\\VCACompanyAdmin.html",true);
	//	extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\Reports\\VCACompanyContractor.html",true);
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyAuditorCritical.html",true);
		
		
		test = extent.startTest("Logging In - Auditor(Critical)");
		
		test.log(LogStatus.PASS, "Test Passed ");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		initialization("company",2);
		
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		/*
		login.Login.BrowserSetup(URL);	
*/
	
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		/*
		 = login.Login.UserLogin(uname,password,"company");		//Method of Login class to login user.
		*/
	}
	
	
	
	
	@Test(priority = 1) 
	void UpcomingdashboardAndGridCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Upcoming Audit");
		
		CriticalMethod2.UpcomingdashboardAndGridCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 2) 
	void UpcomingEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Upcoming Audit - Edit Button Verification");
		
		CriticalMethod2.UpcomingEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 3) 
	void UpcomingViewDownloadButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Upcoming Audit - View Document Button Verification");
		
		CriticalMethod2.UpcomingViewDownloadButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 4)                                                                    
	void UpcomingDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Download Button Verification");
		
		Method1.UpcomingDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 5)                                                                    
	void UpcomingDownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - View Compliance Button Verification");
		
		Method1.UpcomingDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 6)                                                                    
	void CommentButtonUpcoming1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Chat Button Verification");
		
		Method1.CommentButtonUpcoming(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 7)                                                                    
	void UpcomingAuditLog1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Audit Log Button Verification");
		
		Method1.UpcomingAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 8)                                                                    
	void Upcomingtransactionandstatuslog1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Audit Log - transaction and status log tab Verification");
		
		Method1.Upcomingtransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	

	
	
	
	@Test(priority = 9) 
	void OverdueDashboardAndGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Overdue Audit");
		
		CriticalMethod2.OverdueDashboardAndGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 10) 
	void OverdueEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Overdue Audit - Edit Button Verification");
		
		CriticalMethod2.OverdueEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority =11)                                                        
	void OverdueDownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Edit - View Documents Verification");
		
		Method1.OverdueDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority =12)                                                        
	void DownloadDocumentOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Edit - Download Documents Verification");
		
		Method1.DownloadDocumentOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}




	
	@Test(priority =13 )                                                      
	void ViewOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Edit - View Compliance Button Verification");
		
		Method1.ViewOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =14 ) 
	void ComentOverdue11() throws InterruptedException, IOException                  
	{
		test = extent.startTest("Overdue Audit - Edit - Chat Button Verification");
		
		Method1.ComentOverdue1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority =15 ) 
	void OverdueAuditLog1() throws InterruptedException, IOException                  
	{
		test = extent.startTest("Overdue Audit - Edit - Audit Log Button Verification");
		
		Method1.OverdueAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =16 ) 
	void Overduetransactionandstatuslog1() throws InterruptedException, IOException                  
	{
		test = extent.startTest("Overdue Audit - Edit - Audit Log - transaction Log and status log tab Verification");
		
		Method1.Overduetransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}



	
	
	@Test(priority = 17) 
	void RejectedDashBoardAndGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Rejected Audit");
		
		CriticalMethod2.RejectedDashBoardAndGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 18) 
	void RejectedEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Rejected Audit - Edit Button Verification");
		
		CriticalMethod2.RejectedEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =19)                                                        
	void RejectedDownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Rejected Audit - Edit - View Document Button Verification");
		
		Method1.RejectedDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =20) 
	void ViewRejected1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - View Compliance Button Verification");
		
		Method1.ViewRejected(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =21) 
	void ComentRejected1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - Chat Button Verification");
		
		Method1.ComentRejected(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =22) 
	void RejectedAuditLog1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - Audit Log Button Verification");
		
		Method1.RejectedAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority =23) 
	void Rejectedtransactionandstatuslog1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - Audit Log - transaction Log and status log tab Button Verification");
		
		Method1.Rejectedtransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 24) 
	void PendingReviewDashboardAndGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Pending Review Audit");
		
		CriticalMethod2.PendingReviewDashboardAndGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 25) 
	void PendingReviewUpdate1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Edit - View Document Button Verification");
		
		CriticalMethod2.PendingReviewUpdate(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 26) 
	void PendingReviewDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Edit - Download Button Verification");
		
		CriticalMethod2.PendingReviewDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 27) 
	void ViewEditPR1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Edit - View Compliance Button Verification");
		
		CriticalMethod2.ViewEditPR(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 28) 
	void CommentButtonPR1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Edit - Chat Button Verification");
		
		CriticalMethod2.CommentButtonPR(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority =29 ) 
	void PendingReviewAuditLog1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Pending Review Audit - Edit - Audit Log Button Verification");
		
		Method1.PendingReviewAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority =30 ) 
	void PendingRewiewtransactionandstatuslog1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Pending Review Audit - Edit - Audit Log - transaction Log and status log tab Button Verification");
		
		Method1.PendingRewiewtransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 31) 
	void UpdateInEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Edit - Change Reviewer Status Verification");
		
		CriticalMethod2.UpdateInEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	@Test(priority = 32) 
	void ClosedDashboardAndGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Dashboard Tab - Closed Audit");
		
		CriticalMethod2.ClosedDashboardAndGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	@Test(priority = 33) 
	void ClosedReviewEditButton1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Dashboard Tab - Closed Audit - Edit Button Verification");
		
		CriticalMethod2.ClosedReviewEditButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =34) 
	void ClosedDownloadAndViewButton1() throws InterruptedException, IOException           
	{
		test = extent.startTest(" Closed Audit - Edit - View Document Button Verification ");
		
		Method1.ClosedDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =35) 
	void DownloadClosed1() throws InterruptedException, IOException           
	{
		test = extent.startTest(" Closed Audit - Edit - Download Button Verification ");
		
		Method1.DownloadClosed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority =36) 
	void ViewClose1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - View Compliance Button Verification ");
		
		Method1.ViewClose(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =37) 
	void ComentClose1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - Chat Button Verification");
		
		Method1.ComentClose(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority =38) 
	void ClosedAuditLog1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - Audit Log Button Verification");
		
		Method1.ClosedAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority =39) 
	void Closedtransactionandstatuslog1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - Audit Log -transaction Log and status log tab Button Verification");
		
		Method1.Closedtransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	

	
	
	
	   @Test(priority = 40) 
		void CLosedStatusReopen1() throws InterruptedException, IOException
		{
			test = extent.startTest("Dashboard Tab - Closed Audit - Reopen Button Verification ");
			
			CriticalMethod2.CLosedStatusReopen(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	   
	   
	   @Test(priority = 41) 
		void GraphCountMatchGreen1() throws InterruptedException, IOException
		{
			test = extent.startTest("Pie Chart - Status Wise Summery - 'Complied Graph' Count Verification ");
			
			CriticalMethod2.GraphCountMatch(test,workbook, element,graphElement);

			extent.endTest(test);
			extent.flush();
		}
		

		
		
		
		@Test(priority = 42) 
		void RedInRedGraphCountMatch1() throws InterruptedException, IOException
		{
			test = extent.startTest("Pie Chart - Status Wise Summery - 'Not Complied Graph' Count Verification ");
			
			CriticalMethod2.RedInRedGraphCountMatch(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 43) 
		void GreyInRedCountMtch1() throws InterruptedException, IOException
		{
			test = extent.startTest("Pie Chart - Status Wise Summery - 'Not Applicable Graph' Count Verification");
			
			CriticalMethod2.GreyInRedCountMtch(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
	
	
		
		
		///Audit Completion Status
		
		
		
		
		@Test(priority = 44) 
		void AuditCompletionStatusRed1() throws InterruptedException, IOException
		{
			test = extent.startTest("Pie Chart- Status Wise Summery - 'Audit Completion Status' Count Verification  ");
			
			CriticalMethod2.AuditCompletionStatusRed(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
		
		@Test(priority = 45) 
		void PWSCompliedHighRisk1() throws InterruptedException, IOException
		{
			Thread.sleep(19000);
				
			JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			jss.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(5000);
				
				
			String t = Locator2.PWSCompliedJKHills().getText();
			Thread.sleep(500);//Reading Dashboard count.
				
	//		String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

			test = extent.startTest("Bar Graph - Project Wise Compliance Summery - Complied - " + t + " " + " Project Count Verification ");
			
			CriticalMethod2.CompliedHighRisk(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		

		
		
		
		@Test(priority = 46) 
		void PWSNotCompliedHigh1() throws InterruptedException, IOException
		{
			Thread.sleep(19000);
				
			JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			jss.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(5000);
				
				
			String t = Locator2.PWSCompliedJKHills().getText();
			Thread.sleep(500);//Reading Dashboard count.
				
	//		String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

			test = extent.startTest("Bar Graph - Project Wise Compliance Summery - Not Complied - " + t + " " + " Project Count Verification ");
			
			CriticalMethod2.PWSNotCompliedHigh(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 47) 
		void NotApplicableHigh1() throws InterruptedException, IOException
		{
			Thread.sleep(19000);
				
			JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			jss.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(7000);
					
			String t = Locator2.PWSCompliedJKHills().getText();
			Thread.sleep(500);//Reading Dashboard count.
				
	//		String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

			test = extent.startTest("Bar Graph - Project Wise Compliance Summery - Not Applicable - " + t + " " + " Project Count Verification ");
			
			CriticalMethod2.NotApplicableHigh(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		




	
//	@Test(priority = 48) 
	void PendingForReviewHeadCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pending Review Audit - Head Count Verification");
		
		CriticalMethod2.PendingForReviewHeadCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	@Test(priority = 49) 
	void ViewDocument1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - View Button Verification");
		
		CriticalMethod2.ViewDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 50) 
	void DownloadCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Download Button Verification");
		
		CriticalMethod2.DownloadCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 51) 
	void MultipleComplianceDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Multiple File Download Verification");
		
		CriticalMethod2.MultipleComplianceDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 52) 
	void DocumentClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Clear Button Verification");
		
		CriticalMethod2.DocumentClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
   @Test(priority = 53) 
	void ExportReportR1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Export Button Verification");
		
		CriticalMethod2.ExportReportR(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 54) 
	void ClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Clear Button Verification");
		
		CriticalMethod2.ClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 55) 
	void ActnColmFileDownld1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Action Column - File Download Verification");
		
		CriticalMethod2.ActnColmFileDownld(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 56) 
	void MoreReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - More Report Button Verification");
		
		CriticalMethod2.MoreReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 57) 
	void ViewReportOfCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Project - View Button Verification");
		
		CriticalMethod2.ViewReportOfCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	

	

		
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(7000);
  	//	driver.close();
  		closeBrowser();
  	}
	
	
	
	
	

}
