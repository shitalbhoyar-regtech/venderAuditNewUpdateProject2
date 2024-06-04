package companyAuditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyContractor.Locator1;
import login.BasePage;

public class CriticalMethod2 extends BasePage{
	
	
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	
	
	
//	@param sourceElement
	
	
	
	
	
	
	public static void moveToElement1(WebElement element) throws InterruptedException
	{
		WebElement graphElement = getDriver().findElement(By.xpath("//iframe[@id='showdetails']"));
		Actions actions = new Actions(getDriver());  
		actions.moveToElement(graphElement).build().perform();
		Thread.sleep(2000);
		
		actions.sendKeys(graphElement,org.openqa.selenium.Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
	
		
	}
	
	
	
	
	
	
	public static void scrollToElement(WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	
	
	public static void scrollToBottom()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
	
	
	
	
	public static void UpcomingdashboardAndGridCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
	
	//WebWait wait = new WebWait( 1000);
	Thread.sleep(26000);
	
	int open = Integer.parseInt(Locator2.UpcomingCountDashboard().getText());	//Reading Dashboard count.
    Locator2.UpcomingCountDashboard().click();					                //Clicking on Dashboard count

    Thread.sleep(20000);
   
    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
    
    
	Thread.sleep(2000);
   			
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
    js.executeScript("window.scrollBy(0,1000)");
    Thread.sleep(2000);
   

	String item = Locator2.UpcomingCountGrid().getText();
	String[] bits = item.split(" ");								//Splitting the String
	String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
	int count1 = Integer.parseInt(compliancesCount);

	
	
	if(open == count1)
				
	{
					
	//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
					
	test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
				
	}
				
	else
				
	{
					
	//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
					
	test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
				
	}
	
	Thread.sleep(2000);
	
    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
    
    jss.executeScript("window.scrollBy(0,1000)");
    Thread.sleep(2000);
	
	
//	Method2.UpcomingExportButton( test, workbook);
	
	Thread.sleep(2000);
    
	Method2.UpcomingExcelcountAndGridMatch(test,workbook);
	Thread.sleep(2000);
	
	Method2.UpcomingClearButton( test, workbook);
	
	Thread.sleep(2000);
	
	
	
	
	
	
}
	
	
	
	
	
	public static void UpcomingExportButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(20000);
		Locator2.UpcomingCountDashboard().click();
		Thread.sleep(20000);
		
		if(Locator2.UpcomingExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.UpcomingExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.UpcomingExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File Does Not Downloaded Successfully");
		}		

		
	}
	
	
	
	
	public static void UpcomingClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(20000);
		Locator2.UpcomingCountDashboard().click();
		Thread.sleep(20000);
		*/
		Locator2.ClearButtonStateUpcoming().click();
		Thread.sleep(9000);
		Locator2.ClearButtonStateDDUpcoming().click();
		Thread.sleep(9000);
		
		
		
		if(Locator2.UpcomingClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.UpcomingClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
	}
	
	
	
	
	
	public static void UpcomingEditButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(9000);
		Locator2.UpcomingCountDashboard().click();
		Thread.sleep(9000);
		
//		Locator2.EditButtonPendingReview().click();
//		Thread.sleep(9000);
		
		
		// Locator2.ViewButtonPR().click();
	    
		
		
		if(Locator2.UpcomingEditButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.UpcomingEditButton().click();
			test.log(LogStatus.PASS, " Edit Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Edit Button Is Clickable "  );
			
		}
		Thread.sleep(4000);
		
		
	//	CriticalMethod2.AddHeadCountUpcomingAudit(test,workbook);
	//	Thread.sleep(2000);
		
		
		
	}
	
	
	public static void UpcomingViewDownloadButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(15000);
		Locator2.UpcomingCountDashboard().click();
		Thread.sleep(7000);
		
		Locator2.UpcomingEditButton().click();
		Thread.sleep(9000);
		
		
		// Locator2.ViewButtonPR().click();
	    
		
		
		if(Locator2.ViewDocument().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ViewDocument().click();
			test.log(LogStatus.PASS, " View Document Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Document Button Does Not Working Properly "  );
			
		}
		Thread.sleep(9000);
		
		getDriver().switchTo().frame(Locator2.OuterFrame());
		Thread.sleep(3000);
	
		getDriver().switchTo().frame(Locator2.InnerFrame());
		Thread.sleep(7000);
		
	    Locator2.Downloadbutton().click();
	    Thread.sleep(4000);
	}
	
	
	
	public static void OverdueEditButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.OverdueDasboardCount().click();
		Thread.sleep(20000);
	/*	
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(9000);
		
		*/
		// Locator2.ViewButtonPR().click();
	    
		
		
		if(Locator2.UpcomingEditButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.UpcomingEditButton().click();
			test.log(LogStatus.PASS, " Edit Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Edit Button Is Clickable "  );
			
		}
		Thread.sleep(4000);
		
	//	CriticalMethod2.AddHeadCountOverdueAudit(test,workbook);
	//	Thread.sleep(9000);
		
	}
	
	
	
	
	public static void RejectedEditButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.RejectedDasboardCount().click();
		Thread.sleep(20000);
	/*	
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(9000);
		
		*/
		// Locator2.ViewButtonPR().click();
	    
		
		
		if(Locator2.UpcomingEditButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.UpcomingEditButton().click();
			test.log(LogStatus.PASS, " Edit Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Edit Button Is Clickable "  );
			
		}
		Thread.sleep(7000);
	//	CriticalMethod2.RejectedHeadCount(test,workbook);
	//	Thread.sleep(5000);
		
	}
	
	
	
	
	
	public static void PendingReviewEditButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
	/*	
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(9000);
		
		*/
		// Locator2.ViewButtonPR().click();
	    
		
		
		if(Locator2.UpcomingEditButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.UpcomingEditButton().click();
			test.log(LogStatus.PASS, " Edit Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Edit Button Is Clickable "  );
			
		}
		
	}
	
	
	
	
	
	
	public static void ClosedReviewEditButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.ClosedDashboardCountMatch().click();
		Thread.sleep(20000);
	/*	
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(9000);
		
		*/
		// Locator2.ViewButtonPR().click();
	    
		
		
		if(Locator2.UpcomingEditButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.UpcomingEditButton().click();
			test.log(LogStatus.PASS, " Edit Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Edit Button Is Clickable "  );
			
		}
		Thread.sleep(2000);
	//	CriticalMethod2.ClosedReviewAddHeadCount(test,workbook);
	//	Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	public static void OverdueDashboardAndGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
	//	//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator2.OverdueDasboardCount().getText());	//Reading Dashboard count.
	    Locator2.OverdueDasboardCount().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	    
		Thread.sleep(2000);
	   			
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
	   

		String item = Locator2.OverdueCountGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		Thread.sleep(2000);
		
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		
	 //   Method2.ExportButtonOverdue( test, workbook);
	 //   Thread.sleep(2000);
	    
		Method2.overdueExcelcountAndGridMatch(test,workbook);
		 Thread.sleep(2000);
	    
	    Method2.OverdueClearButton( test, workbook);
	    Thread.sleep(2000);
	    
		
	    
	    
	    
	    
		
		
	}
	
	
	public static void ExportButtonOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		
		Thread.sleep(20000);
		Locator2.OverdueDasboardCount().click();
		Thread.sleep(20000);
		
		
		
		if(Locator2.OverdueExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.OverdueExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.OverdueExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File Does Not Downloaded Successfully");
		}		

		
	}
	
	
	
	public static void OverdueClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(20000);
		Locator2.UpcomingCountDashboard().click();
		Thread.sleep(20000);
		*/
		Locator2.ClearButtonStateOverdue().click();
		Thread.sleep(9000);
		Locator2.ClearButtonStateDDOverdue().click();
		Thread.sleep(9000);
		
		
		
		if(Locator2.OverdueClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.OverdueClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void RejectedDashBoardAndGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
	//	//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator2.RejectedDasboardCount().getText());	//Reading Dashboard count.
	    Locator2.RejectedDasboardCount().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
//		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	    
		Thread.sleep(2000);
	   			
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
	   

		String item = Locator2.RejectedCountGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
		Thread.sleep(2000);
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
	    
	    Method2.RejectedExcelcountAndGridMatch(test,workbook);
	    Thread.sleep(2000);
	  //  Method2.RejecteExportButton( test, workbook);
	 //   Thread.sleep(2000);
	    
	    Method2.RejectedClearButton( test, workbook);
	    Thread.sleep(2000);
	    
	    
	    
	    
		
		
	
	}
	
	
	public static void RejecteExportButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(20000);
		Locator2.RejectedDasboardCount().click();
		Thread.sleep(20000);
		
		
		
		if(Locator2.RejectedExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.RejectedExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.RejectedExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File Does Not Downloaded Successfully");
		}		

	}
	
	
	public static void RejectedClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(20000);
		Locator2.RejectedDasboardCount().click();
		Thread.sleep(20000);
		*/
		Locator2.ClearButtonStateRejected().click();
		Thread.sleep(9000);
		Locator2.ClearButtonStateDDRejected().click();
		Thread.sleep(9000);
		
		
		
		if(Locator2.RejectedClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.RejectedClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void PendingReviewDashboardAndGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator2.PendingReviewCountDashboard().getText());	//Reading Dashboard count.
	    Locator2.PendingReviewCountDashboard().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	    
		Thread.sleep(2000);
	   			
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
	   

		String item = Locator2.PendingReviewCountGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		Thread.sleep(2000);
		
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		
	//	Method2.ExportButtonPendingReview( test, workbook);
	//	Thread.sleep(2000);
		
		Method2.PendingReviewExcelcountAndGridMatch(test,workbook);
		Thread.sleep(2000);
		
		Method2.ClearButtonPendingReview( test, workbook);
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}
	
	public static void ExportButtonPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		
		
		if(Locator2.PendingReviewExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PendingReviewExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.PendingReviewExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File Does Not Downloaded Successfully");
		}		

		
	}
	
	
	
	public static void ClearButtonPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		*/
		Locator2.ClearButtonStatePendingReview().click();
		Thread.sleep(9000);
		Locator2.ClearButtonStateDDRewiew().click();
		Thread.sleep(9000);
		
		
		
		if(Locator2.PendingReviewClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PendingReviewClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
	}
	
	
	public static void PendingReviewUpdate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(900));
		Locator2.PendingReviewCountDashboard().click();
		WebDriverWait wait1 = new WebDriverWait( getDriver(),(900));
		
		Locator2.EditButtonnPendingReview().click();
		Thread.sleep(9000);
		
		
		
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		/*
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,450)");
	    Thread.sleep(4000);
	    
		*/
		
		if(Locator2.PendingReviewview().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator2.PendingReviewview().click();
			test.log(LogStatus.PASS, " View Document Button Working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Document Button Does not Working properly "  );
			
		}
		Thread.sleep(4000);
		
		getDriver().switchTo().frame(Locator2.OuterFrame());
		Thread.sleep(4000);
		
		getDriver().switchTo().frame(Locator2.InnerFrame());
		Thread.sleep(4000);
		
	//    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='k-content-frame']")));
		
	 //   WebDriverWait wait1 = new WebDriverWait( getDriver(),(60));
	 //   wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='fc12']")));
	    Thread.sleep(4000);
	    
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.Download().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Document Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Document Does Not Downloaded Successfully");
		}		

	   Thread.sleep(2000);
	//	Locator2.Download().click();
	//	Thread.sleep(9000);
	//	CriticalMethod2.ViewEditPR(test,workbook);
	//	Thread.sleep(4000);
			
		
	}
	
	
	
	public static void PendingReviewDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(9000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(9000);
		
		Locator2.EditButtonnPendingReview().click();
		Thread.sleep(9000);
		
		
		
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		/*
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,450)");
	    Thread.sleep(4000);
	    
		*/
		    
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.Downloadpr().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Document Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Document Does Not Downloaded Successfully");
		}		

	   Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void ViewEditPR( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(9000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(9000);
		
		Locator2.UpcomingEditButton().click();
		Thread.sleep(9000);
		
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		/*
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,450)");
	    Thread.sleep(4000);
	    
		
		*/
		if(Locator2.ViewButtonofEditPR().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ViewButtonofEditPR().click();
			test.log(LogStatus.PASS, " View Compliance Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Compliance Button does not Working Properly "  );
			
		}
		Thread.sleep(2000);
		
	}
	
	
	
	
	public static void SwitchToNewlyOpenedWindow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		String parentwindow = getDriver().getWindowHandle();
		Set<String> allwindow = getDriver().getWindowHandles();
		
		for(String window : allwindow)
		{
			
			if(!window.equalsIgnoreCase(parentwindow))
			{
				
				getDriver().switchTo().window(window);
				
			}
			
			
		}
		
		
	}
	
	
	public static void CommentButtonPR( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		Locator2.UpcomingEditButton().click();
		Thread.sleep(9000);
		
		Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		/*
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,460)");
	    Thread.sleep(4000);
		*/
		 Locator2.CommentButtonPR().click();
		 Thread.sleep(20000);
		 
		    sheet = workbook.getSheetAt(2); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator2.CommentTypePR().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(6000);
			
			/*
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator2.PRCommentFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(4000);
		 
			Locator2.CommentButton().click();
			Thread.sleep(4000);
			
			*/
	    
		
		
		if(Locator2.CommentButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.CommentButton().click();
			test.log(LogStatus.PASS, " Comment added Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Comment added Successfully "  );
			
		}
		Thread.sleep(7000);
	//	CriticalMethod2.PendingForReviewHeadCount(test,workbook);
	//	Thread.sleep(4000);
		
		
	}	
	
	
	public static void UpdateInEditButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		Locator2.EditButtonnPendingReview().click();
		Thread.sleep(9000);
		
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(9000);
		
        
		Locator2.EditInEditButton().click();
		Thread.sleep(4000);
		
	    /*
		
		Locator2.ComplianceStatus().click();
		Thread.sleep(2000);
		
		Locator2.ComplianceStatusDD().click();
		Thread.sleep(3000);
		
		Locator2.ReviewerStatus().click();
		Thread.sleep(2000);
		Locator2.ReviewerStatusDD().click();
		Thread.sleep(3000);
		
		Locator2.SaveReviewerStatus().click();
		Thread.sleep(5000);
		
		*/
	    
	    Locator2.SelectStatus().click();
		Thread.sleep(5000);
		
		Locator2.SelectStatusDD().click();
		Thread.sleep(5000);	
		
	//	Locator1.CheckBox().click();
	//	Thread.sleep(5000);
		
		WebElement element = Locator2.CheckBox();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
	      jse.executeScript("arguments[0].click();", element);
	      boolean b = element.isSelected();
	      if (b) {
	         System.out.println("Checkbox is not checked");
	      }else {
	         System.out.println("Checkbox is checked");
	      }
		
	      Thread.sleep(5000);
	      JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	        
	        js1.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(4000);
	        
		
		Locator2.Save1().click();
		Thread.sleep(5000);
		
		 Alert ac=getDriver().switchTo().alert();
			
			String t=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t );
			
			Thread.sleep(4000);
			ac.accept();
			
			Thread.sleep(5000);
		
		
		/*
        Alert ace=getDriver().switchTo().alert();
		
		String te=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, te );
		
		Thread.sleep(4000);
		ace.accept();
		
		*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ClosedDashboardAndGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator2.ClosedDashboardCountMatch().getText());	//Reading Dashboard count.
	    Locator2.ClosedDashboardCountMatch().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	    
		Thread.sleep(2000);
	   			
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
	   

		String item = Locator2.ClosedGridCountMatch().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		Thread.sleep(2000);
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
	//	Method2.ExportButtonClosed( test, workbook);
	//	Thread.sleep(2000);
		
		Method2.ClosedExcelcountAndGridMatch(test,workbook);
		Thread.sleep(2000);
		
		Method2.ClearButtonClosed( test, workbook);
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	public static void ExportButtonClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		/*
		Thread.sleep(20000);
		Locator2.ClosedDashboardCountMatch().click();
		Thread.sleep(20000);
		
		
		
		if(Locator2.ClosedExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ClosedExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.ClosedExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File Does Not Downloaded Successfully");
		}		

	}
	
	public static void ClearButtonClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		*/
		Locator2.ClearButtonStateClosed().click();
		Thread.sleep(9000);
		Locator2.ClearButtonStateDDClosed().click();
		Thread.sleep(9000);
		
		
		
		if(Locator2.ClosedClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ClosedClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ViewDocument( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator2.Document().click();
		Thread.sleep(20000);
		
		
		
		
		if(Locator2.DocumentViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.DocumentViewButton().click();
			test.log(LogStatus.PASS, " View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		
	}
	
	
	
	
	public static void DownloadCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.Document().click();
		Thread.sleep(20000);
		
		
		Locator2.CheckBoxDocument().click();
		Thread.sleep(2000);
		
		/*
		if(Locator2.DownloadDocument().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.DownloadDocument().click();
			test.log(LogStatus.PASS, " File download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File download Successfully "  );
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.DownloadDocument().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File Does Not Downloaded Successfully");
		}		
	   Thread.sleep(2000);
		
		
	}
	
	
	public static void MultipleComplianceDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator2.Document().click();
		Thread.sleep(20000);
		
		
		Locator2.CheckBoxDocument().click();
		Thread.sleep(2000);
		
		Locator2.CheckBox2Document().click();
		Thread.sleep(2000);
		
		Locator2.CheckBox3Document().click();
		Thread.sleep(2000);
		/*
		if(Locator2.DownloadDocument().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.DownloadDocument().click();
			test.log(LogStatus.PASS, "  File download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File download Successfully "  );
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.DownloadDocument().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File Does Not Downloaded Successfully");
		}		
	   Thread.sleep(2000);

		
		
		
	}
	
	
	
	public static void DocumentClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.Document().click();
		Thread.sleep(20000);
		
		Locator2.SelectLocationDocument().click();
		Thread.sleep(2000);
		
	//	Locator2.SelectLocationDropDocument().click();
	//	Thread.sleep(2000);
		
		Locator2.SelectLocationDropDownDocument().click();
		Thread.sleep(2000);
		
		
		
		if(Locator2.ClearDocument().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ClearDocument().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void ExportReportR( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		Thread.sleep(20000);
		Locator2.Report().click();
		Thread.sleep(20000);
		
		
		
		/*
		if(Locator2.ExportReportR().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ExportReportR().click();
			test.log(LogStatus.PASS, " File download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File download Successfully "  );
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.ExportReportR().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File Does Not Downloaded Successfully");
		}		
	   Thread.sleep(2000);


		
	}
	
	
	
	public static void ClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator2.Report().click();
		Thread.sleep(20000);
		
		Locator2.StatusR().click();
		Thread.sleep(2000);
		
		Locator2.StatusDDR().click();
		Thread.sleep(2000);
		
		Locator2.StateR().click();
		Thread.sleep(2000);
		
		
		Locator2.StateDDR().click();
		Thread.sleep(2000);
		
		
		
		if(Locator2.ClearButtonReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ClearButtonReport().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		   
		
	}
	
	
	
	
	public static void ActnColmFileDownld( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.Report().click();
		Thread.sleep(20000);
		/*
		Locator2.ProjectReport1().click();
		Thread.sleep(2000);
		Locator2.ProjectReport1DD().click();
		Thread.sleep(2000);
		/*
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Compliance Report Downloaded - " + t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(3000);
		
		
		if(Locator2.ActionClmFileDonld().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ActionClmFileDonld().click();
			test.log(LogStatus.PASS, " Compliance Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Compliance Report Download Successfully "  );
			
		}
		
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.ActionClmFileDonld().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File Does Not Downloaded Successfully");
		}		
	   Thread.sleep(2000);

		
		
		
	}
	
	
	
	
	public static void MoreReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator2.Report().click();
		Thread.sleep(20000);
		
		Locator2.MoreReport().click();
		Thread.sleep(4000);
		
		/*
		if(Locator2.CloseAuditReportR().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator2.CloseAuditReportR().click();
			test.log(LogStatus.PASS, "Closed Audit Report Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Closed Audit Report Download Successfully"  );
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.CloseAuditReportR().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Closed Audit Report Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Closed Audit Report Does Not Downloaded Successfully");
		}		
	   Thread.sleep(5000);
		
		Locator2.MonthReport().click();	
		Thread.sleep(2000);
		
		Locator2.MonthReportDD().click();	
		Thread.sleep(9000);
		
		File dir = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator2.MouthCloseReportR().click();
		
	 	Thread.sleep(9000);
		File dir5 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew5 = dir5.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents.length < allFilesNew5.length) {
			test.log(LogStatus.PASS,  "Month Wise Closed Audit Report Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Month Wise Closed Audit Report Does Not Download Successfully");
		}
	   Thread.sleep(3000);
	   
			/*
			if(Locator2.RemarkReportR().isEnabled())
			{
				
				Thread.sleep(2000);
				Locator2.RemarkReportR().click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Compliance Remark Report File Download Successfully" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Compliance Remark Report File Download Successfully"  );
				
			}
			*/
	   
		File dira = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContentsa = dira.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.RemarkReportR().click();
		
	 	Thread.sleep(18000);
		File dirb = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNewb = dirb.listFiles();						//Counting number of files in directory after download
		
	   
       Thread.sleep(9000);
	   if (dirContentsa.length < allFilesNewb.length) {
			test.log(LogStatus.PASS,  "Compliance Remark Report Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Compliance Remark Report Does Not Downloaded Successfully");
		}		
	   Thread.sleep(5000);

			
		

	//	Locator2.AuditReport().click();
		/*
		if(Locator2.AuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator2.AuditReport().click();
			test.log(LogStatus.PASS, "Audit Report File Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Audit Report File Download Successfully"  );
			
		}
		Thread.sleep(2000);
		*/
	   
		File dirc = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContentsc = dirc.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.AuditReport().click();
		
	 	Thread.sleep(18000);
		File dird = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNewd = dird.listFiles();						//Counting number of files in directory after download
		
	   
      Thread.sleep(9000);
	   if (dirContentsc.length < allFilesNewd.length) {
			test.log(LogStatus.PASS,  "Audit Report Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Audit Report Does Not Downloaded Successfully");
		}		
	   Thread.sleep(5000);



		
		
		
	}
	
	
	
	
	public static void ViewReportOfCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.Report().click();
		Thread.sleep(20000);
		
		Locator2.ReportDrop().click();
		Thread.sleep(2000);
		
		if(Locator2.ReportViewCoplc().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator2.ReportViewCoplc().click();
			test.log(LogStatus.PASS, " View Button working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " View Button working properly"  );
			
		}
		
		
		
		
		
		
	}
	
	
	
	public static void GraphCountMatch( ExtentTest test, XSSFWorkbook workbook, WebElement element,WebElement graphElement) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator2.RedGraph().getText());	//Reading Dashboard count.
	    Locator2.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		////wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator2.RedGraphGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ClearButtonRedGraphGrid().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator2.ViewRedButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ViewRedButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method2.YellowGraphDashboardGridCount( test, workbook);
		Thread.sleep(4000);
		
		
		Method2.GreenInGreenGraph( test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void RedGraphClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
	//	int open = Integer.parseInt(Locator2.RedGraph().getText());	//Reading Dashboard count.
	    Locator2.RedGraph().click();
	    
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	  //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
	//	Thread.sleep(500);	
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ClearButtonRedGraphGrid().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		
		
	}
	
	
	public static void YellowGraphDashboardGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
	/*	
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		*/
		
		int open = Integer.parseInt(Locator2.YellowGraph().getText());	//Reading Dashboard count.
	    Locator2.YellowGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.YellowGraphGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Medium Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Medium Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		Thread.sleep(2000);
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator2.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.YellowGraphViewButton().click();
				test.log(LogStatus.PASS, "  View Button working properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  View Button does not working properly "  );
				
			}
			
			
			Thread.sleep(4000);
		
		
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator2.ClosePage().click();
			
			Thread.sleep(2000);
		
		
	}
	
	
	
	
	
	
	
	public static void GreenInGreenGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator2.GreenGraphinGreen().getText());	//Reading Dashboard count.
	    Locator2.GreenGraphinGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.GreenGraphinGreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void YellowGraphClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator2.RedGraph().getText());	//Reading Dashboard count.
	    Locator2.YellowGraph().click();
	    
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	  //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
	//	Thread.sleep(500);	
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		
		
	}
	
	
	
	public static void GreenGraphClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
	//	int open = Integer.parseInt(Locator2.RedGraph().getText());	//Reading Dashboard count.
	    Locator2.YellowGraph().click();
	    */
	    Thread.sleep(2000);
	    
	    Locator2.ClosePage().click();
	    
	    Thread.sleep(2000);
	 /*   
	//    getDriver().switchTo().frame(Locator2.Frame());
	//    Thread.sleep(5000);
	    
	    
	    
	  //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
	//	Thread.sleep(500);	
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		*/
	}
	
	
	
	
	
	
	/////////////////////////////////
	
	
	
	
	
	public static void RedInGreenGraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		/*
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
		
		*/
		int open = Integer.parseInt(Locator2.RedGraph2Green().getText());	//Reading Dashboard count.
	    Locator2.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.RedGraph2GreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.RedGraph2GreenClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.RedGraph2GreenClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	public static void RedInGreenGraphClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	//	int open = Integer.parseInt(Locator2.RedGraph().getText());	//Reading Dashboard count.
	    Locator2.YellowGraph().click();
	    
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	  //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
	//	Thread.sleep(500);	
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.RedGraph2GreenClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.RedGraph2GreenClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void RedInYellowCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		/*
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
		
		*/
		
		int open = Integer.parseInt(Locator2.RedGraphInYellow().getText());	//Reading Dashboard count.
	    Locator2.RedGraphInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.RedGraphInYellowGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		Thread.sleep(2000);
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.RedGraphInYellowClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.RedGraphInYellowClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		

	}
	
	
	
	
	
	public static void RedInYellowClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	//	int open = Integer.parseInt(Locator2.RedGraph().getText());	//Reading Dashboard count.
	    Locator2.YellowGraph().click();
	    
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	  //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
	//	Thread.sleep(500);	
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.RedGraphInYellowClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.RedGraphInYellowClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
	}
	
	
	public static void RedInRedGraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator2.RedGraphInRed().getText());	//Reading Dashboard count.
	    Locator2.RedGraphInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.RedGraphInRedGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.RedGraphInRedGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.RedGraphInRedGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
        Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		Method2.RedInYellowCountMatch( test, workbook);
		
		Thread.sleep(4000);
		
		Method2.RedInGreenGraphCountMatch( test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
	}
	
	
	
	
	public static void RedInRedClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	//	int open = Integer.parseInt(Locator2.RedGraph().getText());	//Reading Dashboard count.
	    Locator2.YellowGraph().click();
	    
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	  //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
	//	Thread.sleep(500);	
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.RedGraphInRedGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.RedGraphInRedGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
	}
	
	
	
	
	
	
	////////////////////////////////////////////////
	
	
	
	
	
	
	public static void GreyGraphCountMatchGreen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		/*
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator2.GreyInGreenGraph().getText());	//Reading Dashboard count.
	    Locator2.GreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.GreyInGreenGraphGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.GreyInGreenClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInGreenClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.ViewGreyInGreen().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator2.ViewGreyInGreen().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
	    

	    
	    
	}
	
	
	
	public static void GreyGraphYellowCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		/*
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator2.GreyInGreenGraph().getText());	//Reading Dashboard count.
	    Locator2.GreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.GreyInGreenGraphGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.GreyInYellowClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInYellowClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInYellowViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInYellowViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		

		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	
	
	public static void GreyInRedCountMtch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator2.GreyInRed().getText());	//Reading Dashboard count.
	    Locator2.GreyInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.GreyInRedGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.GreyInRedGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		Method2.GreyGraphYellowCountMatch( test, workbook);
		
		Thread.sleep(2000);
		
		
		Method2.GreyGraphCountMatchGreen( test, workbook);
		
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	/////////////////////////////// Audit Completion Status
	
	
	
	
	public static void AuditCompletionStatusRed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		
		
		int open = Integer.parseInt(Locator2.ACSREDGraph().getText());	//Reading Dashboard count.
	    Locator2.ACSREDGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.ACSREDGraphGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Overdue -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Overdue - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.ACSREDGraphGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ACSREDGraphGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		if(Locator2.ACSREDGraphGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ACSREDGraphGridExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method2.AuditCompletionStatusBlueGraph( test, workbook);
		
		Thread.sleep(4000);
		
		Method2.AuditCompletionStatusGreenGraph( test, workbook);
			
		Thread.sleep(2000);
		
	}
	
	
	
	
	public static void AuditCompletionStatusBlueGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		/*
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(5000);
		
		*/
		
		int open = Integer.parseInt(Locator2.ACSBlueGraph().getText());	//Reading Dashboard count.
	    Locator2.ACSBlueGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.ACSBlueGraphGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Pending Review - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Pending Review - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.ACSBlueGraphGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ACSBlueGraphGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		if(Locator2.ACSBlueGraphGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ACSBlueGraphGridExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
			
		
		
	}
	
	
	
	
	public static void AuditCompletionStatusGreenGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		/*
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator2.ACSGreenGraph().getText());	//Reading Dashboard count.
	    Locator2.ACSGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.ACSGreenGraphGreed().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "  Closed -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Closed - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.ACSGreenGraphGreedClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ACSGreenGraphGreedClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		if(Locator2.ACSGreenGraphGreedExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ACSGreenGraphGreedExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	
	
	public static void CompliedHighRisk( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
	//	//WebWait wait = new WebWait( 30);
		/*
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
	    */
		
		Locator2.PWSCompliedJKHills().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator2.PWSCompliedGraphHigh().getText());	//Reading Dashboard count.
	    Locator2.PWSCompliedGraphHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.PWSCompliedGraphHighGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		Thread.sleep(2000);
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.PWSCompliedGraphHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSCompliedGraphHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(4000);
		
		if(Locator2.PWSCompliedGraphHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSCompliedGraphHighGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method2.PWSCompliedMediumRisk( test, workbook);
		
		Thread.sleep(3000);
		
		Method2.PWSCompliedLowRisk( test, workbook);
		
		
		Thread.sleep(2000);
		
		
	}
	
	
	public static void PWSCompliedMediumRisk( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		/*
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
		
		Locator2.PWSCompliedGraph().click();
		Thread.sleep(5000);
		
		*/
		
		int open = Integer.parseInt(Locator2.PWSCompliedGraphMedium().getText());	//Reading Dashboard count.
	    Locator2.PWSCompliedGraphMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(23000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	//    //wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.PWSCompliedGraphMediumGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
		// clear button
		Thread.sleep(2000);
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.PWSCompliedGraphMediumGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSCompliedGraphMediumGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSCompliedGraphMediumGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSCompliedGraphMediumGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " View Button working properly "  );
			
		}
		
		
		
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);

		
		
	}
	
	
	
	
	public static void PWSCompliedLowRisk( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		/*
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    
	    
	    Thread.sleep(2000);
		
		Locator2.PWSCompliedGraph().click();
		Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator2.PWSCompliedGraphLow().getText());	//Reading Dashboard count.
	    Locator2.PWSCompliedGraphLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.PWSCompliedGraphLowGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.PWSCompliedGraphLowGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSCompliedGraphLowGridClearButton().click();
			test.log(LogStatus.PASS, "Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSCompliedGraphLowGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSCompliedGraphLowGridViewButton().click();
			test.log(LogStatus.PASS, ""
					+ "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	public static void PWSNotCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 30);
		/*
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
	    */
		
		Locator2.PWSCompliedJKHills().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator2.PWSNotCompliedGraphHighRisk().getText());	//Reading Dashboard count.
	    Locator2.PWSNotCompliedGraphHighRisk().click();					                //Clicking on Dashboard count

	    Thread.sleep(25000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	    //wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    Thread.sleep(5000);
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.PWSNotCompliedGraphHighRiskGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.PWSNotCompliedGraphHighRiskGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotCompliedGraphHighRiskGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSNotCompliedGraphHighRiskGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotCompliedGraphHighRiskGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
	
	   
	    Method2.NotCompliedMediumRisk( test, workbook);
	    Thread.sleep(2000);
	    
	    
	    Method2.PWSNotCompliedLowRisk( test, workbook);
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
		
	}
	
	
	
	
	public static void NotCompliedMediumRisk( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(4000);
		
		Locator2.PWSNotCompliedGraph().click();
		Thread.sleep(7000);
		*/
		int open = Integer.parseInt(Locator2.PWSNotCompliedGraphMediumRisk().getText());	//Reading Dashboard count.
	    Locator2.PWSNotCompliedGraphMediumRisk().click();					                //Clicking on Dashboard count

	    Thread.sleep(25000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
	    
	 //   //wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	   // Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.PWSNotCompliedGraphMediumRiskGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.PWSNotCompliedGraphMediumRiskGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotCompliedGraphMediumRiskGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSNotCompliedGraphMediumRiskGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotCompliedGraphMediumRiskGridViewButton().click();
			test.log(LogStatus.PASS, " View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		Thread.sleep(9000);
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
	}
	
	
	public static void PWSNotCompliedLowRisk( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		/*
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
	    
		
		Locator2.PWSNotCompliedGraph().click();
		Thread.sleep(2000);
		
		*/
		int open = Integer.parseInt(Locator2.PWSNotCompliedGraphLowRisk().getText());	//Reading Dashboard count.
	    Locator2.PWSNotCompliedGraphLowRisk().click();					                //Clicking on Dashboard count

	    Thread.sleep(25000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
	    
	 //   //wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.PWSNotCompliedGraphLowRiskGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.PWSNotCompliedGraphLowRiskGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotCompliedGraphLowRiskGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSNotCompliedGraphMediumRiskGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotCompliedGraphMediumRiskGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		Thread.sleep(9000);
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
	}
	
	
	
	public static void CLosedStatusReopen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(9000);
		
			
		int open = Integer.parseInt(Locator2.ClosedDashboardCountMatch().getText());	//Reading Dashboard count.
        Locator2.ClosedDashboardCountMatch().click();				                //Clicking on Dashboard count

	  //  Thread.sleep(9000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
		Thread.sleep(9000);
		
		Locator2.EditClosedButton().click();
		
		Thread.sleep(5000);
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
        
		Locator2.ClosedReopenButton().click();
		Thread.sleep(5000);
		
        Alert ace=getDriver().switchTo().alert();
		
		String te=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, te );
		
		Thread.sleep(4000);
		ace.accept();
	        
	        Locator1.Dashboard1().click();	
	        Thread.sleep(7000);
	         
	        int count1 = Integer.parseInt(Locator2.ClosedDashboardCountMatch().getText());	//Reading Dashboard count.
	        

/*
	String item = Locator1.RejectedGridCount().getText();
	String[] bits = item.split(" ");								//Splitting the String
	String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
	int count1 = Integer.parseInt(compliancesCount);
*/
	
	
	if(open != count1)
				
	{
					
	//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
					
	test.log(LogStatus.PASS, "Before Reopen Compliance Count = "+open+" | After Reopen Compliance Count = "+count1);
				
	}
				
	else
				
	{
					
	//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
					
	test.log(LogStatus.FAIL, "Before Reopen Compliance Count = "+open+" | Before Reopen Compliance Count = "+count1);
				
	}


		
	}
	
	
	
	
	
	
	public static void NotApplicableHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		/*
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
		*/
		Locator2.PWSCompliedJKHills().click();
		Thread.sleep(2000);
		
		
		int open = Integer.parseInt(Locator2.PWSNotApplicableGraphHigh().getText());	//Reading Dashboard count.
	    Locator2.PWSNotApplicableGraphHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(15000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.PWSNotApplicableGraphHighGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "High Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.PWSNotApplicableGraphHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotApplicableGraphHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		Method2.PWSNotApplicableGraphmedium( test, workbook);
		Thread.sleep(2000);
		
		Method2.PWSNotApplicableGraphLow( test, workbook);
		Thread.sleep(2000);
		
	}
	
	
	
	public static void PWSNotApplicableGraphmedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		/*
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
		
		Locator2.PWSNotApplicableGraph().click();
		Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator2.PWSNotApplicableGraphmedium().getText());	//Reading Dashboard count.
	    Locator2.PWSNotApplicableGraphmedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(15000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.PWSNotApplicableGraphHighGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.PWSNotApplicableGraphHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotApplicableGraphHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	public static void PWSNotApplicableGraphLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait( 1000);
		Thread.sleep(26000);
		/*
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
		
		Locator2.PWSNotApplicableGraph().click();
		Thread.sleep(2000);
		*/
		int open = Integer.parseInt(Locator2.PWSNotApplicableGraphLow().getText());	//Reading Dashboard count.
	    Locator2.PWSNotApplicableGraphLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(15000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator2.PWSNotApplicableGraphHighGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Low Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.PWSNotApplicableGraphHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotApplicableGraphHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button does not working properly "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	

	
	public static void AddHeadCountUpcomingAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
//		Thread.sleep(20000);
//		Locator2.UpcomingCountDashboard().click();
		Thread.sleep(20000);
		
	//	Locator2.EditButtonPendingReview().click();
	//	Thread.sleep(9000);
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(6000);
		
		Locator1.HeadCountselectmonthOverdue().click();
		Thread.sleep(3000);
		
		Locator1.HeadCountselectmonthDD().click();
		Thread.sleep(3000);
		
		    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(13);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			
			row0 = sheet.getRow(14);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
		
			Locator1.HeadCountsave().click();
			
			Thread.sleep(5000);
			 Alert ac4=getDriver().switchTo().alert();
				
				String t=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Head Count " + t );
				
				Thread.sleep(2000);
				ac4.accept();
				
				Thread.sleep(2000);
		
		
				Locator1.HeadCountDelete().click();
				
				
				Thread.sleep(5000);
				 Alert ac5=getDriver().switchTo().alert();
					
					String t5=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, t5 );
					
					Thread.sleep(2000);
					ac5.accept();
					
					Thread.sleep(3000);
			
			
	               Alert ac31=getDriver().switchTo().alert();
					
					String t41=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, t41 );
					
					Thread.sleep(2000);
					ac31.accept();
					
					Thread.sleep(3000);
			
					/////////////////////////
					Locator1.HeadCountclose().click();
					Thread.sleep(3000);
					
					
					
							
				
		
	}
	
	
	
	
	public static void AddHeadCountOverdueAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(7000);
//		Locator2.OverdueDasboardCount().click();
//		Thread.sleep(20000);
		
//		Locator2.EditButtonPendingReview().click();
//		Thread.sleep(9000);
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(6000);
		
		Locator1.HeadCountselectmonthOverdue().click();
		Thread.sleep(3000);
		
		Locator1.HeadCountselectmonthDD().click();
		Thread.sleep(3000);
		
		    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(13);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			
			row0 = sheet.getRow(14);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
		
			Locator1.HeadCountsave().click();
			
			Thread.sleep(5000);
			 Alert ac4=getDriver().switchTo().alert();
				
				String t=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t );
				
				Thread.sleep(2000);
				ac4.accept();
				
				Thread.sleep(2000);
		
		
				Locator1.HeadCountDelete().click();
				
				
				Thread.sleep(5000);
				 Alert ac5=getDriver().switchTo().alert();
					
					String t5=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, t5 );
					
					Thread.sleep(2000);
					ac5.accept();
					
					Thread.sleep(3000);
			
			
	               Alert ac31=getDriver().switchTo().alert();
					
					String t41=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, t41 );
					
					Thread.sleep(2000);
					ac31.accept();
					
					Thread.sleep(3000);
			
					/////////////////////////
					Locator1.HeadCountclose().click();
					Thread.sleep(3000);
					
					
					
							
				
		
	}
	
	
	
	public static void RejectedHeadCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
//		Locator2.RejectedDasboardCount().click();
//		Thread.sleep(20000);
		
//		Thread.sleep(2000);
//		Locator2.UpcomingEditButton().click();
//		Thread.sleep(2000);
		
		 Method2.SwitchToNewlyOpenedWindow( test, workbook);
			
			Thread.sleep(5000);
			
			
			Locator1.HeadCountButton().click();
			Thread.sleep(6000);
			
			Locator1.HeadCountselectmonthOverdue().click();
			Thread.sleep(3000);
			
			Locator1.HeadCountselectmonthDD().click();
			Thread.sleep(3000);
			
			    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
				int row = 0;
				Thread.sleep(500);
				Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
				Cell c1 = null;
				
				
				row0 = sheet.getRow(13);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(3000);
				
				
				
				row0 = sheet.getRow(14);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(2000);
				
			
				Locator1.HeadCountsave().click();
				
				Thread.sleep(5000);
				 Alert ac4=getDriver().switchTo().alert();
					
					String t=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, t );
					
					Thread.sleep(2000);
					ac4.accept();
					
					Thread.sleep(2000);
			
			
					Locator1.HeadCountDelete().click();
					
					
					Thread.sleep(5000);
					 Alert ac5=getDriver().switchTo().alert();
						
						String t5=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS, t5 );
						
						Thread.sleep(2000);
						ac5.accept();
						
						Thread.sleep(3000);
				
				
		               Alert ac31=getDriver().switchTo().alert();
						
						String t41=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS, t41 );
						
						Thread.sleep(2000);
						ac31.accept();
						
						Thread.sleep(3000);
				
						/////////////////////////
						Locator1.HeadCountclose().click();
						Thread.sleep(3000);
											
								
					
			
		
		
	}
	
	
	
	public static void PendingForReviewHeadCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
     	Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		Thread.sleep(2000);
		Locator2.UpcomingEditButton().click();
		Thread.sleep(2000);
		
		 Method2.SwitchToNewlyOpenedWindow( test, workbook);
			
			Thread.sleep(5000);
			
			
			Locator1.HeadCountButton().click();
			Thread.sleep(6000);
			
			Locator1.HeadCountselectmonthOverdue().click();
			Thread.sleep(3000);
			
			Locator1.HeadCountselectmonthDD().click();
			Thread.sleep(3000);
			
			    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
				int row = 0;
				Thread.sleep(500);
				Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
				Cell c1 = null;
				
				
				row0 = sheet.getRow(13);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(3000);
				
				
				
				row0 = sheet.getRow(14);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(2000);
				
			
				Locator1.HeadCountsave().click();
				
				Thread.sleep(5000);
				 Alert ac4=getDriver().switchTo().alert();
					
					String t=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, t );
					
					Thread.sleep(2000);
					ac4.accept();
					
					Thread.sleep(2000);
			
			
					Locator1.HeadCountDelete().click();
					
					
					Thread.sleep(5000);
					 Alert ac5=getDriver().switchTo().alert();
						
						String t5=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS, t5 );
						
						Thread.sleep(2000);
						ac5.accept();
						
						Thread.sleep(3000);
				
				
		               Alert ac31=getDriver().switchTo().alert();
						
						String t41=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS, t41 );
						
						Thread.sleep(2000);
						ac31.accept();
						
						Thread.sleep(3000);
				
						/////////////////////////
						Locator1.HeadCountclose().click();
						Thread.sleep(3000);
											
								
					
			
		
		
	}
	
	
	
	
	
	
	public static void ClosedReviewAddHeadCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
	//	Locator2.ClosedDashboardCountMatch().click();
	//	Thread.sleep(20000);
	
//		Thread.sleep(2000);
	//	Locator2.UpcomingEditButton().click();
		
		Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(6000);
		
		
		Locator1.HeadCountselectmonthOverdue().click();
		Thread.sleep(4000);
		
		Locator1.HeadCountselectmonthDD().click();
		Thread.sleep(3000);
		
		    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(13);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			
			row0 = sheet.getRow(14);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
		
			Locator1.HeadCountsave().click();
			
			Thread.sleep(5000);
			 Alert ac4=getDriver().switchTo().alert();
				
				String t=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Head Count " + t );
				
				Thread.sleep(2000);
				ac4.accept();
				
				Thread.sleep(2000);
		
		
				Locator1.HeadCountDelete().click();
				
				
				Thread.sleep(5000);
				 Alert ac5=getDriver().switchTo().alert();
					
					String t5=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, t5 );
					
					Thread.sleep(2000);
					ac5.accept();
					
					Thread.sleep(3000);
			
			
	               Alert ac31=getDriver().switchTo().alert();
					
					String t41=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, t41 );
					
					Thread.sleep(2000);
					ac31.accept();
					
					Thread.sleep(3000);
			
					/////////////////////////
					
					
				
				    Thread.sleep(2000);
										
					Locator1.HeadCountclose().click();
					Thread.sleep(3000);
										
							
				
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
