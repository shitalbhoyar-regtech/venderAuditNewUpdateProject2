package comapnyAdminTest;

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

import companyAuditor.Method2;
import companyProjectDirector.CriticalMethod4;
import companyProjectDirector.Method4;
import companyProjectHead.CriticalMethod3;
import companyProjectHead.Locator3;
import companyProjectHead.Method3;
import login.BasePage;

public class ProjectHeadTestCases extends BasePage{

	
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
		
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyProjectHead.html",true);
		test = extent.startTest("Logging in - Project Head - Non Critical.");
		
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
		
		CriticalMethod3.LocationPopupColumnist(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	

	
	@Test(priority = 2) 
	void ProjectsCountGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Project Audit dashboard and Grid Count Verification ");
		
		CriticalMethod3.ProjectsCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
    @Test(priority = 3) 
	void ContractorsCountGridCount1() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Tab - Contractors Audit dashboard and Grid Count Verification ");
		
		Method3.ContractorsCountGridCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
		
	
	
	@Test(priority = 4) 
	void GraphCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Complied Graph' Count Verification");
		
		Method3.GraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
		
		
	
	
	@Test(priority = 5) 
	void CompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied Status - High Risk - Multiple Filter Verification");
		
		Method3.CompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 6) 
	void CompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied Status - Medium Risk - Multiple Filter Verification");
		
		Method3.CompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 7) 
	void CompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Complied Status - Low Risk - Multiple Filter Verification");
		
		Method3.CompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 8) 
	void RedInRedGraphCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Not Complied Graph' Count Verification");
		
		Method3.RedInRedGraphCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 9) 
	void NotCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied Status - High Risk - Multiple Filter Verification");
		
		Method3.NotCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 10) 
	void NotCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied Status - Medium Risk - Multiple Filter Verification");
		
		Method3.NotCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 11) 
	void NotCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Complied Status - Low Risk - Multiple Filter Verification");
		
		Method3.NotCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	@Test(priority = 12) 
	void GreyInRedCountMtch1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Not Applicable Graph' Count Verification");
		
		Method3.GreyInRedCountMtch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 13) 
	void NotApplicableGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable Status - High Risk - Multiple Filter Verification");
		
		Method3.NotApplicableGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 14) 
	void NotApplicableGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable Status - Medium Risk - Multiple Filter Verification");
		
		Method3.NotApplicableGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	
    @Test(priority = 15) 
	void NotApplicableGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Not Applicable Status - Low Risk - Multiple Filter Verification");
		
		Method3.NotApplicableGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	@Test(priority = 16) 
	void AuditCompletionStatusRed1() throws InterruptedException, IOException
	{
		test = extent.startTest("Pie Chart - Status Wise Summary - 'Audit Completion Status' Count Verification");
		
		Method3.AuditCompletionStatusRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 17) 
	void ACSOverdueMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion Status - Overdue Status - Multiple Filter Verification");
		
		Method3.ACSOverdueMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 18) 
	void ACSPendingReviewMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion Status - Pending Review Status - Multiple Filter Verification");
		
		Method3.ACSPendingReviewMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 19)          
	void ACSClosedMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Status Wise Summery - Audit Completion Status - Closed Status - Multiple Filter Verification");
		
		Method3.ACSClosedMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
    @Test(priority = 20) 
	void CTWCompliedgreen1() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Compliance Status Summary - 'Complied Status' Count Verification");
		
		Method3.CTWCompliedgreen(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 21) 
	void CTWCompliedgreen11() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Compliance Status Summary - Complied Status - Multiple Filter Verification");
		
		Method3.CTWCompliedgreen1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 22) 
	void CTWNotCompliedRed1() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Compliance Status Summary - 'Not Complied Status' Count Verification");
		
		Method3.CTWNotCompliedRed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 23) 
	void CTWNotCompliedRed11() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Compliance Status Summary- Not Complied Status - Multiple Filter Verification");
		
		Method3.CTWNotCompliedRed1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}	


	@Test(priority = 24) 
	void CTWNotApplicableGrey1() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Compliance Status Summary - 'Not Applicable Status' Count Verification");
		
		Method3.CTWNotApplicableGrey(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 25) 
	void CTWNotApplicableGrey11() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Compliance Status Summary - Not Applicable Status - Multiple Filter Verification");
		
		Method3.CTWNotApplicableGrey1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 26) 
	void CTWAuditStatusSummeryOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Audit Status Summary - Canteen - Count Verification");
		
		Method3.CTWAuditStatusSummeryOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	 
	@Test(priority = 27) 
	void CTWAuditStatusSummeryOverdue11() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Audit Status Summary - Overdue Status - Multiple Filter Verification");
		
		Method3.CTWAuditStatusSummeryOverdue1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 28) 
	void CTWAuditStatusSummeryPendingReview11() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Audit Status Summary - Pending Review Status - Multiple Filter Verification");
		
		Method3.CTWAuditStatusSummeryPendingReview1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 29) 
	void CTWAuditStatusSummeryClosed1() throws InterruptedException, IOException
	{
		test = extent.startTest("Stake Holder Wise - Audit Status Summary - Completed Status - Multiple Filter Verification");
		
		Method3.CTWAuditStatusSummeryClosed(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 30) 
	void PWCSSABCConstructionCompliedHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Complied Status - 'Project - Geet Heritage' Count Verification");
		
		Method3.PWCSSABCConstructionCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 31) 
	void PWCSCompliedGraphMultipleFilterHigh11() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary -Complied - High Risk Status - Multiple Filter Verification");
		
		Method3.PWCSCompliedGraphMultipleFilterHigh1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 32) 
	void PWCSSCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary -Complied - Medium Risk Status - Multiple Filter Verification");
		
		Method3.PWCSSCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 33) 
	void PWCSSCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary -Complied - Low Risk Status - Multiple Filter Verification");
		
		Method3.PWCSSCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 34) 
	void PWCSSABCconstructionNotCompliedHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Complied Status - 'Project - Geet Heritage' Count Verification");
		
		Method3.PWCSSABCconstructionNotCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
		
	
	@Test(priority = 35) 
	void PWCSSNotCompliedGraphMultipleFilterHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Complied - High Risk Status - Multiple Filter Verification");
		
		Method3.PWCSSNotCompliedGraphMultipleFilterHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 36) 
	void PWCSSNotCompliedGraphMultipleFilterMedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Complied - Medium Risk Status - Multiple Filter Verification");
		
		Method3.PWCSSNotCompliedGraphMultipleFilterMedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 37) 
	void PWCSSNotCompliedGraphMultipleFilterLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Complied - Low Risk Status - Multiple Filter Verification");
		
		Method3.PWCSSNotCompliedGraphMultipleFilterLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 38) 
	void PWCSSABCconstructionNotApplicableHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Applicable Status - 'Project - Geet Heritage' Count Verification");
		
		Method3.PWCSSABCconstructionNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 39) 
	void PWCSNotApplicableHigh1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Applicable - High Risk Status - Multiple Filter Verification");
		
		Method3.PWCSNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 40) 
	void PWCSNotApplicableGraphmedium1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Applicable - Medium Risk Status - Multiple Filter Verification");
		
		Method3.PWCSNotApplicableGraphmedium(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 41) 
	void PWCSSNotApplicableGraphLow1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Compliance Status Summary - Not Applicable - Low Risk Status - Multiple Filter Verification");
		
		Method3.PWCSSNotApplicableGraphLow(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	@Test(priority = 42) 
	void PWAuditStatusSummeryABCConstructionOverdue1() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Audit Status Summary - ' Project - Geet Heritage ' Count Verification");
		
		Method3.PWAuditStatusSummeryABCConstructionOverdue(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
		

	
	@Test(priority = 43) 
	void PWAuditStatusSummeryABCConstructionOverdue11() throws InterruptedException, IOException
	{
		test = extent.startTest("Facility Wise - Audit Status Summary - Multiple Filter Verification");
		
		Method3.PWAuditStatusSummeryABCConstructionOverdue1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 44) 
	void PWCSSubcontractorCompliedHigh1() throws InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Geet Heritage']"))); 
		Thread.sleep(3000);
		
		String t = Locator3.RudraHeritage().getText();
		Thread.sleep(3000);
		
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - " + t + " Complied Status Verification");
		
		Method3.PWCSSubcontractorCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 45) 
	void PWCSSubContractorCompliedHighmultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - Complied Status - High Risk Multiple Filter Verification");
		
		Method3.PWCSSubContractorCompliedHighmultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority = 46) 
	void PWCSSubContractorCompliedMediummultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - Complied Status - Medium Risk Multiple Filter Verification");
		
		Method3.PWCSSubContractorCompliedMediummultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 47) 
	void PWCSSubContractorCompliedLowmultipleFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - Complied Status - Low Risk Multiple Filter Verification");
		
		Method3.PWCSSubContractorCompliedLowmultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority = 48) 
	void PWCSSubcontractorNotCompliedMedium1() throws InterruptedException, IOException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Geet Heritage']"))); 
		Thread.sleep(3000);
			
		String t = Locator3.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - " + t + " Not Complied Status Verification");
				
		Method3.PWCSSubcontractorNotCompliedHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 49) 
	void PWCSSubContractorNotCompliedHighmultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - Not Complied - High Risk Multiple Filter Verification");
		
		Method3.PWCSSubContractorNotCompliedHighmultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	@Test(priority = 50) 
	void PWCSSubContractorNotCompliedMediummultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - Not Complied - Medium Risk Multiple Filter Verification");
		
		Method3.PWCSSubContractorNotCompliedMediummultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 51) 
	void PWCSSubContractorNotCompliedLowmultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - Not Complied - Low Risk Multiple Filter Verification");
		
		Method3.PWCSSubContractorNotCompliedLowmultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	
	@Test(priority = 52) 
	void PWCSSubcontractorNotApplicableMedium1() throws InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Geet Heritage']"))); 
		Thread.sleep(3000);
		
		String t = Locator3.RudraHeritage().getText();
		Thread.sleep(6000);
		
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - " + t + " Not Applicable Status Verification");
		
		Method3.PWCSSubcontractorNotApplicableHigh(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 53) 
	void PWCSSubContractorNotApplicableHighmultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - Not Applicable - High Risk Multiple Filter Verification");
		
		Method3.PWCSSubContractorNotApplicableHighmultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	
	

	@Test(priority = 54) 
	void PWCSSubContractorNotApplicableMediummultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - Not Applicable - Medium Risk Multiple Filter Verification");
		
		Method3.PWCSSubContractorNotApplicableMediummultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 55) 
	void PWCSSubContractorNotApplicableLowmultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Bar Chart - Project Wise - Compliance Summary (Sub Contractor) - Not Applicable - Low Risk Multiple Filter Verification");
		
		Method3.PWCSSubContractorNotApplicableLowmultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	@Test(priority = 56) 
	void DocumentViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - View Button Verification");
		
		Method3.DocumentViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 57) 
	void DownloadCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Download Button Verification");
		
		Method3.DownloadCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 58) 
	void MultipleDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Multiple File Download Verification");
		
		Method3.MultipleDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority = 59) 
	void DocumentClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Clear Button Verification");
		
		Method3.DocumentClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 60) 
	void DocumentTabMultipleFilter11() throws InterruptedException, IOException
	{
		test = extent.startTest("Document Tab - Multiple Filter Verification");
		
		Method4.DocumentTabMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	@Test(priority = 61) 
	void ExtendReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Export Button Verification");
		
		Method3.ExtendReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 62) 
	void FileDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Action Column - File Download Verification");
		
		Method3.FileDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 63) 
	void ClearButtonReport1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Clear Button Verification");
		
		Method3.ClearButtonReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 64) 
	void MoreReportDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - More Report Button Verification");
		
		Method3.MoreReportDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 65) 
	void ViewButton() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Project Column Triangle - View Button Verification");
		
		Method3.ViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 66) 
	void DownloadAndViewButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Download And View Button Is Clickable");
		
		Method3.DownloadAndViewButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	


	@Test(priority = 67) 
	void WorkspaceTaskFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Multiple Filter Verification");
		
		Method4.WorkspaceTaskFilter(test,workbook);
		
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
