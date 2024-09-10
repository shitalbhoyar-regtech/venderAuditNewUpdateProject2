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

import companyAdmin.CriticalMethod;
import companyContractor.Locator1;
import companyContractor.Method1;
import login.BasePage;

public class ContractorTestCasesCritical extends BasePage {
	
	
	
	
	
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
		
	//	fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\TestData1.xlsx");
		
		fis = new FileInputStream("E:\\VenderAuditProject\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(1);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
	//	extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\Reports\\VCACompanyAdmin.html",true);
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyContractorCritical.html",true);
		
		test = extent.startTest("Loging In - Contractor(Critical)");
		
		test.log(LogStatus.PASS, "Test Passed");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		initialization("company",1);
		
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
	
	
	

//	@Test(priority = 1) 
	void DashboardCountGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Upcoming Audit");
		
		Method1.DashboardCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 2)                                                                    
	void UpcomingPerforedAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Audit Submited For Auditor Review");
		
		Method1.UpcomingPerforedAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	
//	@Test(priority = 3) 
	void UpcomingView1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit -Edit- View Document Button Verification   ");
		
		Method1.UpcomingView(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
//	@Test(priority = 3)                                                                    
	void UpcomingDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Download Button Verification");
		
		Method1.UpcomingDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
////	@Test(priority = 4)                                                                    
	void UpcomingDownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - View Compliance Button Verification");
		
		Method1.UpcomingDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
//	@Test(priority = 5)                                                                    
	void CommentButtonUpcoming1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Chat Button Verification");
		
		Method1.CommentButtonUpcoming(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
/*
	
	@Test(priority = 6)                                                                    
	void UpcomingAuditLog1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Audit Log Button Verification");
		
		Method1.UpcomingAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 7)                                                                    
	void Upcomingtransactionandstatuslog1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Audit Log - transaction and status log tab Verification");
		
		Method1.Upcomingtransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	


//////	@Test(priority = 8) ------------Not To Run                                                                   
	void UpdateUpcoming1() throws InterruptedException, IOException
	{
		test = extent.startTest("Upcoming Audit - Edit - Audit Submited For Auditor Review");
		
		Method1.UpdateUpcoming(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =9) 
	void overduecountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Overdue Audit");
		
		Method1.overduecountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	                                  
//////	@Test(priority =10 )         ------------------not to run                                               
	void UpdateOverdue11() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Edit - Audit Submited For Auditor Review");
		
		Method1.UpdateOverdue1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =10 )                                                        
	void UpdateOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Overdue Audit - Edit - Audit Submited For Auditor Review");
		
		Method1.UpdateOverdue11(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	*/
	
//	@Test(priority =11)                                                        
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




	
////	@Test(priority =13 )                                                      
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

	
	
	
	
	@Test(priority =17 ) 
	void RejectedAndGridCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Rejected Audit");
		
		Method1.RejectedAndGridCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =18)                                                        
	void RejectedDownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Rejected Audit - Edit - View Document Button Verification");
		
		Method1.RejectedDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =19 ) 
	void ViewRejected1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - View Compliance Button Verification");
		
		Method1.ViewRejected(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =20 ) 
	void ComentRejected1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - Chat Button Verification");
		
		Method1.ComentRejected(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =21) 
	void RejectedAuditLog1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - Audit Log Button Verification");
		
		Method1.RejectedAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority =22 ) 
	void Rejectedtransactionandstatuslog1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - Audit Log - transaction Log and status log tab Button Verification");
		
		Method1.Rejectedtransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority =23 ) 
	void RejectedSubmitForAuditorButton1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Rejected Audit - Edit - Submit For Auditor Button Verification");
		
		Method1.RejectedSubmitForAuditorButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	

	
	@Test(priority =24 ) 
	void PendingForReviewCountMatch1() throws InterruptedException, IOException           
	{
		test = extent.startTest(" Dashboard Tab - Pending Review Audit ");
		
		Method1.PendingForReviewCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =25 ) 
	void PendingReviewDownloadAndViewButton1() throws InterruptedException, IOException           
	{
		test = extent.startTest(" Pending Review Audit - Edit - View Document button Verification ");
		
		Method1.PendingReviewDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =26 ) 
	void ViewPendingReview1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Pending Review Audit - Edit - View Compliance Button Verification ");
		
		Method1.ViewPendingReview(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =27 ) 
	void ComentPendingRewiew1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Pending Review Audit - Edit - Chat Button Verification");
		
		Method1.ComentPendingRewiew(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =28 ) 
	void PendingReviewAuditLog1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Pending Review Audit - Edit - Audit Log Button Verification");
		
		Method1.PendingReviewAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority =29 ) 
	void PendingRewiewtransactionandstatuslog1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Pending Review Audit - Edit - Audit Log - transaction Log and status log tab Button Verification");
		
		Method1.PendingRewiewtransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	
	    @Test(priority =30 ) 
		void CountmatchClose1() throws InterruptedException, IOException           
		{
			test = extent.startTest(" Dashboard Tab - Closed Audit ");
			
			Method1.CountmatchClose(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	
	
	@Test(priority =31) 
	void ClosedDownloadAndViewButton1() throws InterruptedException, IOException           
	{
		test = extent.startTest(" Closed Audit - Edit - View Document Button Verification ");
		
		Method1.ClosedDownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =32) 
	void DownloadClosed1() throws InterruptedException, IOException           
	{
		test = extent.startTest(" Closed Audit - Edit - Download Button Verification ");
		
		Method1.DownloadClosed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority =33 ) 
	void ViewClose1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - View Compliance Button Verification ");
		
		Method1.ViewClose(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =34) 
	void ComentClose1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - Chat Button Verification");
		
		Method1.ComentClose(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority =35) 
	void ClosedAuditLog1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - Audit Log Button Verification");
		
		Method1.ClosedAuditLog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority =36) 
	void Closedtransactionandstatuslog1() throws InterruptedException, IOException           
	{
		test = extent.startTest("Closed Audit - Edit - Audit Log -transaction Log and status log tab Button Verification");
		
		Method1.Closedtransactionandstatuslog(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	@Test(priority =37) 
	void GraphCountMatch1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - Completion Status- 'Complied Graph' Count Verification ");
		
		Method1.GraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =38 ) 
	void RedInRedGraphCountMatch1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - Completion Status- 'Not Complied Graph' Count Verification ");
		
		Method1.RedInRedGraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =39 ) 
	void GreyInRedCountMtch1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - Completion Status- 'Not Applicable Graph' Count Verification ");
		
		Method1.GreyInRedCountMtch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority =40) 
	void AuditCompletionStatusRed1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - 'Audit Completion Status' Count Verification ");
		
		Method1.AuditCompletionStatusRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	
//	@Test(priority =41) 
	void AuditCompletionStatusOverdue1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - 'Audit Completion Status' - Overdue Edit Button Verification ");
		
		Method1.AuditCompletionStatusOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
//	@Test(priority =42) 
	void AuditCompletionStatusPendingReview1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - 'Audit Completion Status' - Pending Review - Edit Button Verification ");
		
		Method1.AuditCompletionStatusPendingReview(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

//	@Test(priority =43) 
	void AuditCompletionStatusClosed1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery - 'Audit Completion Status' - Closed - Edit Button Verification ");
		
		Method1.AuditCompletionStatusClosed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	@Test(priority =44) 
	void PWSCompliedJKHills1() throws InterruptedException, IOException          
	{  
		Thread.sleep(9000);
		
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
	
	
	
	
	
	
	
	
	@Test(priority =45) 
	void PWSNotCompliedJKHills1() throws InterruptedException, IOException          
	{
		
       Thread.sleep(9000);
		
		JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
		
		
	    String t = Locator1.PWSCompliedJKHills().getText();
		Thread.sleep(1000);//Reading Dashboard count.
		
	//	String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

		
		test = extent.startTest("Bar Graph - Project Wise Compliance Summery - Not Complied - " + t + " "  + " Project Count Verification ");
		
		Method1.PWSNotCompliedJKHills(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =46) 
	void PWSNotApplicableJKHillHigh1() throws InterruptedException, IOException          
	{
		
        Thread.sleep(9000);
		
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
	
	@Test(priority =47) 
	void CompliedSubcontractorHigh1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summary (Sub-Contractor) - 'Complied Status' Count Verification ");
		
		Method1.CompliedSubcontractorHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =48) 
	void NotCompliedSubcontractorHigh1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summary (Sub-Contractor) - 'Not Complied Status' Count Verification ");
		
		Method1.NotCompliedSubcontractorHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority =49) 
	void NotApplicableSubcontractorHigh1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summary (Sub-Contractor) - 'Not Applicable Status' Count Verification ");
		
		Method1.NotApplicableSubcontractorHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority =50) 
	void OverdueSubContractor1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Pie Chart - Status Wise Summery(Sub-Contractor) - 'Audit Completion Status' Count Verification ");
		
		Method1.OverdueSubContractor(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	

	@Test(priority =51) 
	void PWSSubContratorCompliedHigh1() throws InterruptedException, IOException          
	{  
		Thread.sleep(10000);
		
		JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(5000);
		
		
	    String t = Locator1.PWSEcobuildSolutionText().getText();
		Thread.sleep(500);//Reading Dashboard count.
		
	//	String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

		test = extent.startTest("Bar Graph - Project Wise Compliance Summery(Sub-Contractor) - Complied - " + t + " " + " Project Count Verification ");
		
		Method1.PWSSubContractorCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =52) 
	void PWSSubContratorNotCompliedHigh1() throws InterruptedException, IOException          
	{  
		Thread.sleep(9000);
		
		JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(5000);
		
		
	    String t = Locator1.PWSEcobuildSolutionText().getText();
		Thread.sleep(500);//Reading Dashboard count.
		
	//	String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

		test = extent.startTest("Bar Graph - Project Wise Compliance Summery(Sub-Contractor) - Not Complied - " + t + " " + " Project Count Verification ");
		
		Method1.PWSSubContractorNotCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority =53) 
	void PWSSubContractorNotApplicableHigh1() throws InterruptedException, IOException          
	{  
		Thread.sleep(9000);
		
		JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(5000);
		
		
	    String t = Locator1.PWSEcobuildSolutionText().getText();
		Thread.sleep(500);//Reading Dashboard count.
		
	//	String t1 = Locator1.PWSConstruction().getText();	//Reading Dashboard count.

		test = extent.startTest("Bar Graph - Project Wise Compliance Summery(Sub-Contractor) - Not Applicable - " + t + " " + " Project Count Verification ");
		
		Method1.PWSSubContractorNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 54) 
	void MyWorkspaceLicense1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Audit and License Tab Verification ");
		
		Method1.MyWorkspaceLicense(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 55) 
	void MyWorkspaceLicenseSearch1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - License tab Verification ");
		
		Method1.MyWorkspaceLicenseSearch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	

	
	@Test(priority = 56) 
	void MyWorkspaceRenewLicense() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Renew License Verification ");
		
		Method1.MyWorkspaceRenewLicense(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
    @Test(priority = 57) 
	void MyWorkspacePreviousDocumentView1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - License Tab - Previous Document Viewed Verification ");
		
		Method1.MyWorkspacePreviousDocumentView(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


//	@Test(priority = 58) 
	void MyWorkspaceResendForApproval1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Rejected License Resend for Approval Verification ");
		
		Method1.MyWorkspaceResendForApproval(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	@Test(priority =59) 
	void ClearButtonDocument1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Document Tab - Clear Button Verification ");
		
		Method1.ClearButtonDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =60) 
	void ViewButtonDocuments1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Document Tab - View Button Verification ");
		
		Method1.ViewButtonDocuments(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =61) 
	void DownloadDocument1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Document Tab - Download Button Verification ");
		
		Method1.DownloadDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =62) 
	void DownloadMultipleDocument() throws InterruptedException, IOException          
	{
		test = extent.startTest("Document Tab - Multiple File Download Verification ");
		
		Method1.DownloadMultipleDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =63) 
	void ExportReportReport1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Report Tab - Export Button Verification ");
		
		Method1.ExportReportReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =64) 
		void ActionColReportDownload1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Report Tab - Action Column - File Download Verification  ");
			
			CriticalMethod.ActionColReportDownload(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	@Test(priority =65) 
	void MoreReportDownload1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Report Tab - More Report Button Verification ");
		
		Method1.MoreReportDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority =66) 
	void ClearButtonReport1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Report Tab - Clear Button Verification ");
		
		Method1.ClearButtonReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(5000);
  	//	.quit();
  		closeBrowser();
  	}	


	
	
	
	
	
	

}
