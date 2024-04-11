package companyAuditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyAdmin.Locator;
import companyContractor.Locator1;
import companyProjectHead.Locator3;
import login.BasePage;

public class Method2 extends BasePage{
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	
	
	

	
	
	
	
	
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void UpcomingdashboardAndGridCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
//	//WebWait wait = new WebWait(, 1000);
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
    
    jss.executeScript("window.scrollBy(0,-1000)");
    Thread.sleep(2000);
	
	
	Method2.UpcomingExportButton(test, workbook);
	
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
		*/
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
	}
	
	
	
	
	
	public static void UpcomingEditButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.UpcomingCountDashboard().click();
		Thread.sleep(20000);
		
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(9000);
		
		
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
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void OverdueDashboardAndGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator2.OverdueDasboardCount().getText());	//Reading Dashboard count.
	    Locator2.OverdueDasboardCount().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	    
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
		
		
	    Method2.ExportButtonOverdue(test, workbook);
	    Thread.sleep(2000);
	    
	    Method2.OverdueClearButton(test, workbook);
	    Thread.sleep(2000);
	    
		
	    
	    
	    
	    
		
		
	}
	
	
	public static void ExportButtonOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		
		Thread.sleep(20000);
		Locator2.OverdueDasboardCount().click();
		Thread.sleep(20000);
		
		
		*/
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void RejectedDashBoardAndGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator2.RejectedDasboardCount().getText());	//Reading Dashboard count.
	    Locator2.RejectedDasboardCount().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	    
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
	    
	    
	    Method2.RejecteExportButton(test, workbook);
	    Thread.sleep(2000);
	    
	    Method2.RejectedClearButton(test, workbook);
	    Thread.sleep(2000);
	    
	    
	    
	    
		
		
	
	}
	
	
	public static void RejecteExportButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(20000);
		Locator2.RejectedDasboardCount().click();
		Thread.sleep(20000);
		
		*/
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void PendingReviewDashboardAndGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		//WebWait wait = new WebWait(, 1000);
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
		
		
		Method2.ExportButtonPendingReview( test, workbook);
		
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
		
		*/
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
	}
	
	
	public static void PendingReviewUpdate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(9000);
		
		
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		/*
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,450)");
	    Thread.sleep(4000);
	    
		*/
		
		if(Locator2.ViewButtonPR().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator2.ViewButtonPR().click();
			test.log(LogStatus.PASS, " Eye Icon Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Eye Icon Is Clickable "  );
			
		}
			
		
	}
	
	public static void ViewEditPR( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		Locator2.EditButtonPendingReview().click();
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
			test.log(LogStatus.PASS, " View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
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
	
	
	
	public static void SwitchToNewlyOpenedWindowClose( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		String parentwindow = getDriver().getWindowHandle();
		Set<String> allwindow = getDriver().getWindowHandles();
		
		for(String window : allwindow)
		{
			
			if(!window.equalsIgnoreCase(window))
			{
			
				
				getDriver().switchTo().window(parentwindow);
			}
			
			
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void CommentButtonPR( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(9000);
		
		Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,460)");
	    Thread.sleep(4000);
		
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
		
		
		
		
	}	
	
	
	public static void UpdateInEditButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		Locator2.EditButtonnPendingReview().click();
		Thread.sleep(9000);
		
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1500)");
	    Thread.sleep(4000);
		
		
		Locator2.EditInEditButton().click();
		Thread.sleep(20000);
		
        JavascriptExecutor jsss = (JavascriptExecutor) getDriver();
	    
	    jsss.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(6000);
		
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
		
		
		
		
        Alert ace=getDriver().switchTo().alert();
		
		String te=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, te );
		
		Thread.sleep(4000);
		ace.accept();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ClosedDashboardAndGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
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
		
		Method2.ExportButtonClosed( test, workbook);
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
		*/
		
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
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
			test.log(LogStatus.PASS, " View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		
	}
	
	
	
	
	public static void DownloadCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.Document().click();
		Thread.sleep(20000);
		
		
		Locator2.CheckBoxDocument().click();
		Thread.sleep(2000);
		
		
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
		
		
		
		
	}
	
	
	
	public static void DocumentClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.Document().click();
		Thread.sleep(20000);
		
		Locator2.SelectLocationDocument().click();
		Thread.sleep(9000);
		
		Locator2.SelectLocationDropDocument().click();
		Thread.sleep(2000);
		
		Locator2.SelectLocationDropDownDocument().click();
		Thread.sleep(2000);
		
		
		
		if(Locator2.ClearDocument().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ClearDocument().click();
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void ExportReportR( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		Thread.sleep(20000);
		Locator2.Report().click();
		Thread.sleep(20000);
		
		
		
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
		   
		
	}
	
	
	
	
	public static void ActnColmFileDownld( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.Report().click();
		Thread.sleep(20000);
		
		
	//	Locator2.ActionClmFileDonld().click();
		/*
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver()..switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Compliance Report Downloaded - " + t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(3000);
		
		*/
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
		
		
		
	}
	
	
	
	
	public static void MoreReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator2.Report().click();
		Thread.sleep(20000);
		
		Locator2.MoreReport().click();
		Thread.sleep(4000);
		
		
		if(Locator2.CloseAuditReportR().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator2.CloseAuditReportR().click();
			test.log(LogStatus.PASS, "Closed Audit Report - File Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Closed Audit Report - File Download Successfully"  );
			
		}
		
		
		
       Thread.sleep(2000);
		
		
		Locator2.MonthReport().click();
		
		Thread.sleep(2000);
		
		Locator2.MonthReportDD().click();
		
		Thread.sleep(2000);
			
			if(Locator2.RemarkReportR().isEnabled())
			{
				
				Thread.sleep(2000);
				Locator2.RemarkReportR().click();
				test.log(LogStatus.PASS, "Compliance Remark Report  - File Download Successfully" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Compliance Remark Report - File Download Successfully"  );
				
			}
			
			
		
		

		Locator2.AuditReport().click();
		
		if(Locator2.RemarkReportR().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator2.RemarkReportR().click();
			test.log(LogStatus.PASS, "Audit Report  - File Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Audit Report - File Download Successfully"  );
			
		}
		
		

		
		
		
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
			test.log(LogStatus.PASS, " View Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " View Button Is Clickable"  );
			
		}
		
		
		
		
		
		
	}
	
	
	
	public static void GraphCountMatch( ExtentTest test, XSSFWorkbook workbook, WebElement element,WebElement graphElement) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator2.ViewRedButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ViewRedButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
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
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
		
		
		
	}
	
	
	public static void YellowGraphDashboardGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
	/*	
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, "  Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear Button Is Clickable "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator2.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.YellowGraphViewButton().click();
				test.log(LogStatus.PASS, "  View Button Is Clickable " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
				
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
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void YellowGraphClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
		
		
		
	}
	
	
	
	public static void GreenGraphClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		*/
	}
	
	
	
	
	
	
	/////////////////////////////////
	
	
	
	
	
	public static void RedInGreenGraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		/*
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
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
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void RedInYellowCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		/*
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
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
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
	}
	
	
	public static void RedInRedGraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear Button Is Clickable "  );
			
		}
		
		
		
		
		
        Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
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
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
	}
	
	
	
	
	
	
	////////////////////////////////////////////////
	
	
	
	
	
	
	public static void GreyGraphCountMatchGreen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		/*
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.ViewGreyInGreen().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator2.ViewGreyInGreen().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
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
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator2.GreyInYellow().getText());	//Reading Dashboard count.
	    Locator2.GreyInYellow().click();					                //Clicking on Dashboard count

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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInYellowViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInYellowViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		

		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	
	
	public static void GreyInRedCountMtch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		Method2.GreyGraphYellowCountMatch(test, workbook);
		
		Thread.sleep(2000);
		
		
		Method2.GreyGraphCountMatchGreen(test, workbook);
		
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	/////////////////////////////// Audit Completion Status
	
	
	
	
	public static void AuditCompletionStatusRed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
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
		
		Method2.AuditCompletionStatusBlueGraph(test, workbook);
		
		Thread.sleep(4000);
		
		Method2.AuditCompletionStatusGreenGraph( test, workbook);
			
		Thread.sleep(2000);
		
	}
	
	
	
	
	public static void AuditCompletionStatusBlueGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
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
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
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
	
	
	
	
	
	
	
	//project Wise Summery Bar Graph
	
	
	
	
	public static void CompliedHighRisk( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
		
		Locator2.PWSCompliedGraph().click();
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSCompliedGraphHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSCompliedGraphHighGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method2.PWSCompliedMediumRisk(test, workbook);
		
		Thread.sleep(3000);
		
		Method2.PWSCompliedLowRisk( test, workbook);
		
		
		Thread.sleep(2000);
		
		
	}
	
	
	public static void PWSCompliedMediumRisk( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
	    
	    //wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(4000);
		
		if(Locator2.PWSCompliedGraphMediumGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSCompliedGraphMediumGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " View Button Is Clickable "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);

		
		
	}
	
	
	
	
	public static void PWSCompliedLowRisk( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, "Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSCompliedGraphLowGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSCompliedGraphLowGridViewButton().click();
			test.log(LogStatus.PASS, ""
					+ "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	public static void PWSNotCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
		
		Locator2.PWSNotCompliedGraph().click();
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSNotCompliedGraphHighRiskGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotCompliedGraphHighRiskGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
	
	   
	    Method2.NotCompliedMediumRisk(test, workbook);
	    Thread.sleep(2000);
	    
	    
	    Method2.PWSNotCompliedLowRisk(test, workbook);
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
		
	}
	
	
	
	
	public static void NotCompliedMediumRisk( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSNotCompliedGraphMediumRiskGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotCompliedGraphMediumRiskGridViewButton().click();
			test.log(LogStatus.PASS, " View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
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
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.PWSNotCompliedGraphMediumRiskGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.PWSNotCompliedGraphMediumRiskGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
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
		
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
			
	    Locator2.ClosedDashboardCountMatch().click();					                //Clicking on Dashboard count

	  //  Thread.sleep(9000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
		Thread.sleep(9000);
		
		Locator2.EditClosedButton().click();
		
		Thread.sleep(5000);
		
        Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		Locator2.ClosedReopenButton().click();
		Thread.sleep(5000);
		
        Alert ace=getDriver().switchTo().alert();
		
		String te=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, te );
		
		Thread.sleep(4000);
		ace.accept();
		
		
		
	}
	
	
	
	
	
	
	public static void NotApplicableHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
		
		Locator2.PWSNotApplicableGraph().click();
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		Method2.PWSNotApplicableGraphmedium(test, workbook);
		Thread.sleep(2000);
		
		Method2.PWSNotApplicableGraphLow( test, workbook);
		Thread.sleep(2000);
		
	}
	
	
	
	public static void PWSNotApplicableGraphmedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	public static void PWSNotApplicableGraphLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	////////////// Projec Fake
	
	
	
	
	
	
	
	
	
	
	
	
	//GR Infra Project
	
	
	
	
	public static void PwsNotApplicableLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
		
		
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
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = 4 | Displayed records from grid = 4 ");
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Low Risk - Dashboard Graph Count = 4 | Displayed records from grid = 4 ");
					
		}
		
		
		// clear button
		
        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
	    
	    jss1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
		Locator2.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator2.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator2.GreyInGreenClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInGreenClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.ViewGreyInGreen().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator2.ViewGreyInGreen().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
	    

	    
	    
	}
	
	
	
	public static void GreyGraphYellowCountMatchA( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		/*
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInYellowViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInYellowViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		

		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	
	
	public static void GreyInRedCountMtchA( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		Method2.GreyGraphYellowCountMatch(test, workbook);
		
		Thread.sleep(2000);
		
		
		Method2.GreyGraphCountMatchGreen(test, workbook);
		
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	/////////////////////NegativeScenarios
	
	
	
	
	
	public static void PendingReviewWithoutSelectCheckListStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		
		Locator2.UpcomingEditButton().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(6000);
		
		//WebWait wait = new WebWait(, 60000);
		
	//	 Locator1.CheckBoxUpcomingAudit().click();
		// Thread.sleep(2000);
		 
		 WebElement element = Locator2.CheckBoxPRAudit();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element);
		      boolean b = element.isSelected();
		      if (b) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(20000);
		      
		      JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			    
			    js1.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
		      
		      Locator2.SavePRAudit().click();   
		      Thread.sleep(9000);
		      
		      Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t3 );
				
				Thread.sleep(6000);
				ac2.accept();
			
				Thread.sleep(2000);
		
	
	
	}
	
	
	
	public static void PendingReviewWithoutSelectCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(20000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(9000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,600)");
	    Thread.sleep(5000);
		
		
		Locator2.PRChecklistStatus().click();
		Thread.sleep(5000);
		
		Locator2.PRAuditCheckListStatusBox().click();
		Thread.sleep(5000);
		
		Locator2.PRAuditCheckListStatusDD().click();
		Thread.sleep(5000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
	    
	    js2.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
		
		      Locator2.SavePRAudit().click();   
		      Thread.sleep(5000);
		      
		      Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t3 );
				
				Thread.sleep(6000);
				ac2.accept();
			
				Thread.sleep(2000);
		
	
	
	}
	
	
	
	public static void AddHeadCountOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator2.OverdueDasboardCount().click();
		Thread.sleep(10000);
		
		
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
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t4 );
				
				Thread.sleep(2000);
				ac3.accept();
				
				Thread.sleep(2000);
		
		
	
		
	}
	
	
	
	
	
	public static void AddHeadCountOverduevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator2.OverdueDasboardCount().click();
		Thread.sleep(10000);
		
		
		Locator2.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(6000);
		
		
		/*
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
			*/
		
		//	Locator1.HeadCountsave().click();
			
			if(Locator1.HeadCountsave().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.HeadCountsave().click();
				test.log(LogStatus.PASS, "  Please Select Mandatory Data " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Please Select Mandatory Data "  );
				
			}
			Thread.sleep(2000);
		
		
	
		
	}
	
	
	
	
	public static void deleteHeadCountOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(10000);
		Locator2.OverdueDasboardCount().click();
		Thread.sleep(10000);
		
		
		Locator2.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		
		Locator1.HeadCountDelete().click();
		
		
			Thread.sleep(5000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.FAIL, t4 );
				
				Thread.sleep(2000);
				ac3.accept();
				
				Thread.sleep(3000);
		
		
               Alert ac31=getDriver().switchTo().alert();
				
				String t41=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t41 );
				
				Thread.sleep(2000);
				ac31.accept();
				
				Thread.sleep(2000);
		
	}
	
	
	
	public static void AddHeadCountvalidationOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator2.OverdueDasboardCount().click();
		Thread.sleep(10000);
		
		
		Locator2.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		
		/*
		
		Locator1.HeadCountselectmonth().click();
		Thread.sleep(3000);
		
		Locator1.HeadCountselectmonthDD().click();
		
		Thread.sleep(3000);
		
		*/
		
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
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.FAIL,"Without select month add head count = " + t4 );
				
				Thread.sleep(2000);
				ac3.accept();
				
				Thread.sleep(2000);
				
				Locator1.HeadCountclose().click();
				Thread.sleep(3000);
				
	
				Locator1.HeadCountButton().click();
				Thread.sleep(3000);
				
				
				
				Locator1.HeadCountselectmonthOverdue().click();
				Thread.sleep(9000);
				
				
				
				WebElement element = Locator1.HeadCountselectmonthDD();	      
				//JavascriptExecutor to click element
			      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			      jse.executeScript("arguments[0].click();", element);
			      boolean b = element.isSelected();
			      if (b) {
			         System.out.println("Checkbox is not checked");
			      }else {
			         System.out.println("Checkbox is checked");
			      }
				
			      Thread.sleep(20000);
				
			      Locator1.HeadCountmaleCount().clear();
			      Thread.sleep(2000);
					/*
					
					row0 = sheet.getRow(13);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
					Thread.sleep(3000);
					
					*/
					
					row0 = sheet.getRow(14);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
					Thread.sleep(2000);
					
				
					if(Locator1.HeadCountsave().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator1.HeadCountsave().click();
						test.log(LogStatus.PASS, "  without select male Head Count add head count = Please Select male Head Count  " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  without select male Head Count add head count = Please Select male Head Count  "  );
						
					}
					Thread.sleep(2000);
						
						
						
						Locator1.HeadCountclose().click();
						Thread.sleep(3000);
						
						Locator1.HeadCountButton().click();
						Thread.sleep(3000);
						
						Locator1.selectmonthheadCountValidation().click();
						Thread.sleep(9000);
						
						
						
						WebElement element1 = Locator1.HeadCountselectmonthDD();	      
						//JavascriptExecutor to click element
					      JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
					      jse.executeScript("arguments[0].click();", element1);
					      boolean b1 = element1.isSelected();
					      if (b1) {
					         System.out.println("Checkbox is not checked");
					      }else {
					         System.out.println("Checkbox is checked");
					      }
						
					      Thread.sleep(20000);
						
		
							
							row0 = sheet.getRow(13);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(3000);
							
							
							
							Locator1.HeadCountFemaleCount().clear();
							Thread.sleep(3000);
							
							/*
							row0 = sheet.getRow(14);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(2000);
							*/
						
							if(Locator1.HeadCountsave().isEnabled())
							{
								
								Thread.sleep(2000);
							    Locator1.HeadCountsave().click();
								test.log(LogStatus.PASS, "  without select Female Head Count add head count = Please Enter Female Head Count  " );
								
							}
							
							else
							{
								test.log(LogStatus.FAIL, "  without select Female Head Count add head count = Please Enter Female Head Count  "  );
								
							}
							Thread.sleep(2000);
								
								Locator1.HeadCountclose().click();
								Thread.sleep(3000);
								
					
				
		
	}
	
	
	
	
	
	
	
	public static void AddHeadCountPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(10000);
		
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
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
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t4 );
				
				Thread.sleep(2000);
				ac3.accept();
				
				Thread.sleep(2000);
		
		
	
		
	}
	
	
	
	public static void AddHeadCountPendingReviewvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(10000);
		
		
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(6000);
		
		
		/*
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
			*/
		
		//	Locator1.HeadCountsave().click();
			
			if(Locator1.HeadCountsave().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.HeadCountsave().click();
				test.log(LogStatus.PASS, "  Please Select Mandatory Data " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Please Select Mandatory Data "  );
				
			}
			Thread.sleep(2000);
		
		
	
		
	}
	
	
	
	
	
	public static void deleteHeadCountPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(10000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(10000);
		
		
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		
		Locator1.HeadCountDelete().click();
		
		
			Thread.sleep(5000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.FAIL, t4 );
				
				Thread.sleep(2000);
				ac3.accept();
				
				Thread.sleep(3000);
		
		
               Alert ac31=getDriver().switchTo().alert();
				
				String t41=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t41 );
				
				Thread.sleep(2000);
				ac31.accept();
				
				Thread.sleep(2000);
		
	}
	
	
	
	public static void AddHeadCountvalidation1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator2.PendingReviewCountDashboard().click();
		Thread.sleep(10000);
		
		
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		
		/*
		
		Locator1.HeadCountselectmonth().click();
		Thread.sleep(3000);
		
		Locator1.HeadCountselectmonthDD().click();
		
		Thread.sleep(3000);
		
		*/
		
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
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.FAIL,"Without select month add head count = " + t4 );
				
				Thread.sleep(2000);
				ac3.accept();
				
				Thread.sleep(2000);
				
				Locator1.HeadCountclose().click();
				Thread.sleep(3000);
				
	
				Locator1.HeadCountButton().click();
				Thread.sleep(3000);
				
				
				
				Locator1.HeadCountselectmonthOverdue().click();
				Thread.sleep(9000);
				
				
				
				WebElement element = Locator1.HeadCountselectmonthDD();	      
				//JavascriptExecutor to click element
			      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			      jse.executeScript("arguments[0].click();", element);
			      boolean b = element.isSelected();
			      if (b) {
			         System.out.println("Checkbox is not checked");
			      }else {
			         System.out.println("Checkbox is checked");
			      }
				
			      Thread.sleep(20000);
				
			      Locator1.HeadCountmaleCount().clear();
			      Thread.sleep(2000);
					/*
					
					row0 = sheet.getRow(13);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
					Thread.sleep(3000);
					
					*/
					
					row0 = sheet.getRow(14);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
					Thread.sleep(2000);
					
				
					if(Locator1.HeadCountsave().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator1.HeadCountsave().click();
						test.log(LogStatus.PASS, "  without select male Head Count add head count = Please Select male Head Count  " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  without select male Head Count add head count = Please Select male Head Count  "  );
						
					}
					Thread.sleep(2000);
						
						
						
						Locator1.HeadCountclose().click();
						Thread.sleep(3000);
						
						Locator1.HeadCountButton().click();
						Thread.sleep(3000);
						
						Locator1.selectmonthheadCountValidation().click();
						Thread.sleep(9000);
						
						
						
						WebElement element1 = Locator1.HeadCountselectmonthDD();	      
						//JavascriptExecutor to click element
					      JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
					      jse.executeScript("arguments[0].click();", element1);
					      boolean b1 = element1.isSelected();
					      if (b1) {
					         System.out.println("Checkbox is not checked");
					      }else {
					         System.out.println("Checkbox is checked");
					      }
						
					      Thread.sleep(20000);
						
		
							
							row0 = sheet.getRow(13);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(3000);
							
							
							
							Locator1.HeadCountFemaleCount().clear();
							Thread.sleep(3000);
							
							/*
							row0 = sheet.getRow(14);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(2000);
							*/
						
							if(Locator1.HeadCountsave().isEnabled())
							{
								
								Thread.sleep(2000);
							    Locator1.HeadCountsave().click();
								test.log(LogStatus.PASS, "  without select Female Head Count add head count = Please Enter Female Head Count  " );
								
							}
							
							else
							{
								test.log(LogStatus.FAIL, "  without select Female Head Count add head count = Please Enter Female Head Count  "  );
								
							}
							Thread.sleep(2000);
								
								Locator1.HeadCountclose().click();
								Thread.sleep(3000);
								
					
				
		
	}
	
	
	/////////////////////MultipleFilter
	
	
	
	
	
	
	
	public static void UpcomingMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.Upcoming().click();
		Thread.sleep(16000);
		
		
		/*
		Locator1.EntityLocation().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
      String locationtext =Locator1.EntityLocationExpand1().getText();
       Thread.sleep(500);
       Locator1.EntityLocationExpand1().click();
       Thread.sleep(500);
       Locator1.EntityLocation().click();
       Thread.sleep(3000);
       */
       
      
       
  //     Locator1.Status().click();
  //     Thread.sleep(2000);
       
       Locator2.Project().click();
       Thread.sleep(2000);
       String ProjectText =Locator2.ProjectDD().getText();
       Thread.sleep(2000);
       Locator2.ProjectDD().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator2.ContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator2.ContractorTypeDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator2.FrequencyDD().getText();
       Thread.sleep(2000);
       Locator2.FrequencyDD().click();
       Thread.sleep(2000);
       Locator2.Frequency().click();
       Thread.sleep(2000);
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.Status1R().getText();
       Thread.sleep(2000);
       Locator2.Status1R().click();
       Thread.sleep(2000);
       Locator2.Status2R().click();
       Thread.sleep(6000);
       Locator2.Status().click();
       Thread.sleep(4000);
       
       
       Locator2.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator2.Period2().getText();
       Thread.sleep(2000);
      Locator2.Period2().click();
      Thread.sleep(2000);
    //  Locator2.Period().click();
     // Thread.sleep(3000);
      
       
       
        List<String> li=new ArrayList<String>();
        
        
        li.add(ProjectText);
        li.add(ContractorTypeText);
        li.add(FrequencyText);
        li.add(Statustext);
        li.add(periodtext);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		
		filter.add("Project");
		filter.add("ContractorType");
		filter.add("Frequency");
		filter.add("Status");
		filter.add("Period");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[8]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(contractorcol);
				}
			else if(i==2)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==3)
			{
				raw.addAll(statuscol);
			}
				
			else if(i==4)
			{
				raw.addAll(periodcol);
			}
				
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		//Locator1.ClearButtonGreen().click();
		/*
		
		if(Locator1.ClearButtonGreen().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonGreen().click();
			test.log(LogStatus.PASS, "  The applied filter get cleared after clicking on the clear button " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
			
		}
		Thread.sleep(2000);
		
		*/
		
	}

	
	
	
	
	public static void OverdueMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.Overdue().click();
		Thread.sleep(16000);
		
		
		/*
		Locator1.EntityLocation().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
      String locationtext =Locator1.EntityLocationExpand1().getText();
       Thread.sleep(500);
       Locator1.EntityLocationExpand1().click();
       Thread.sleep(500);
       Locator1.EntityLocation().click();
       Thread.sleep(3000);
       */
       
      
       
  //     Locator1.Status().click();
  //     Thread.sleep(2000);
		
		
		   
		
		
       
       Locator2.Project().click();
       Thread.sleep(2000);
       String ProjectText =Locator2.ProjectDD().getText();
       Thread.sleep(2000);
       Locator2.ProjectDD().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator2.ContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator2.ContractorTypeDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator2.FrequencyDD().getText();
       Thread.sleep(2000);
       Locator2.FrequencyDD().click();
       Thread.sleep(2000);
       Locator2.Frequency().click();
       Thread.sleep(2000);
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.Status1Overdue().getText();
       Thread.sleep(2000);
       Locator2.Status1Overdue().click();
       Thread.sleep(2000);
       Locator2.Status2Overdue().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(4000);
       
       
       Locator2.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator2.PeriodDD().getText();
       Thread.sleep(2000);
      Locator2.PeriodDD().click();
      Thread.sleep(2000);
      Locator2.Period().click();
      Thread.sleep(3000);
    
       
        List<String> li=new ArrayList<String>();
        
        li.add(ProjectText);
        li.add(ContractorTypeText);
        li.add(FrequencyText);
        li.add(Statustext);
        li.add(periodtext);
      
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		filter.add("Project");
		filter.add("ContractorType");
		filter.add("Frequency");
		filter.add("Status");
		filter.add("Period");

		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[8]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();
			
			

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(contractorcol);
				}
			else if(i==2)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==3)
			{
				raw.addAll(statuscol);
			}
				
			else if(i==4)
			{
				raw.addAll(periodcol);
			}
			
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		//Locator1.ClearButtonGreen().click();
		/*
		if(Locator1.ClearButtonGreen().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonGreen().click();
			test.log(LogStatus.PASS, "  The applied filter get cleared after clicking on the clear button " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
			
		}
		Thread.sleep(2000);
		
		*/
		
	}
	
	
	//Rejected
	
	
	public static void RejectedMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.Rejected().click();
		Thread.sleep(16000);
		
		
		/*
		Locator1.EntityLocation().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
      String locationtext =Locator1.EntityLocationExpand1().getText();
       Thread.sleep(500);
       Locator1.EntityLocationExpand1().click();
       Thread.sleep(500);
       Locator1.EntityLocation().click();
       Thread.sleep(3000);
       */
       
      
       
  //     Locator1.Status().click();
  //     Thread.sleep(2000);
       
		Locator2.Project().click();
	       Thread.sleep(2000);
	       String ProjectText =Locator2.ProjectDD().getText();
	       Thread.sleep(2000);
	       Locator2.ProjectDD().click();
	       Thread.sleep(2000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
	       
       
       
       
       Locator1.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator1.ContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator1.ContractorTypeDD().click();
       Thread.sleep(2000);
       Locator1.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator1.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator1.FrequencyDD().getText();
       Thread.sleep(2000);
       Locator1.FrequencyDD().click();
       Thread.sleep(2000);
       Locator1.Frequency().click();
       Thread.sleep(2000);
       
       Locator1.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator1.Status1Rejected().getText();
       Thread.sleep(2000);
       Locator1.Status1Rejected().click();
       Thread.sleep(2000);
       Locator1.Status2Rejected().click();
       Thread.sleep(2000);
       Locator1.Status().click();
       Thread.sleep(3000);
       
       
       
       Locator2.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator2.Period3().getText();
       Thread.sleep(2000);
      Locator2.Period3().click();
      Thread.sleep(2000);
      Locator2.Period().click();
      Thread.sleep(3000);
     
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(ContractorTypeText);
        li.add(FrequencyText);
        li.add(Statustext);
        li.add(periodtext);
        
         
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("ContractorType");
		filter.add("Frequency");
		filter.add("Status");
		 filter.add("Period");

		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[9]"));
  		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[8]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(contractorcol);
				}
			else if(i==2)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==3)
			{
				raw.addAll(statuscol);
			}
				
			else if(i==4)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		//Locator1.ClearButtonGreen().click();
		/*
		if(Locator1.ClearButtonGreen().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonGreen().click();
			test.log(LogStatus.PASS, "  The applied filter get cleared after clicking on the clear button " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
			
		}
		Thread.sleep(2000);
		
		*/
		
	}
	

	
	
	public static void PendingReviewMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.PendingRewiew().click();
		Thread.sleep(16000);
		
		
		/*
		Locator1.EntityLocation().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
      String locationtext =Locator1.EntityLocationExpand1().getText();
       Thread.sleep(500);
       Locator1.EntityLocationExpand1().click();
       Thread.sleep(500);
       Locator1.EntityLocation().click();
       Thread.sleep(3000);
       */
       
      
       
  //     Locator1.Status().click();
  //     Thread.sleep(2000);
       
       Locator2.Project().click();
       Thread.sleep(2000);
       String ProjectText =Locator2.ProjectDD().getText();
       Thread.sleep(2000);
       Locator2.ProjectDD().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator2.ContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator2.ContractorTypeDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator2.FrequencyDD().getText();
       Thread.sleep(2000);
       Locator2.FrequencyDD().click();
       Thread.sleep(2000);
       Locator2.Frequency().click();
       Thread.sleep(2000);
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.Status1PendingReview().getText();
       Thread.sleep(2000);
       Locator2.Status1PendingReview().click();
       Thread.sleep(2000);
       Locator2.Status2PendingReview().click();
       Thread.sleep(2000);
       
       Locator2.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator2.PeriodDD().getText();
       Thread.sleep(2000);
      Locator2.PeriodDD().click();
      Thread.sleep(2000);
      Locator2.Period().click();
      Thread.sleep(3000);
     
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(ContractorTypeText);
        li.add(FrequencyText);
        li.add(Statustext);
        li.add(periodtext);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("ContractorType");
		filter.add("Frequency");
		filter.add("Status");	
        filter.add("Period");
        
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[9]"));
  		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[8]"));

  		
  		
  		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(contractorcol);
				}
			else if(i==2)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==3)
			{
				raw.addAll(statuscol);
			}
				
			else if(i==4)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		//Locator1.ClearButtonGreen().click();
		/*
		if(Locator1.ClearButtonGreen().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonGreen().click();
			test.log(LogStatus.PASS, "  The applied filter get cleared after clicking on the clear button " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
			
		}
		Thread.sleep(2000);
		
		*/
		
	}
	
	
	public static void ClosedMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.CountMatchClose().click();
		Thread.sleep(16000);
		
		
		/*
		Locator1.EntityLocation().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
      String locationtext =Locator1.EntityLocationExpand1().getText();
       Thread.sleep(500);
       Locator1.EntityLocationExpand1().click();
       Thread.sleep(500);
       Locator1.EntityLocation().click();
       Thread.sleep(3000);
       */
       
      
       
  //     Locator1.Status().click();
  //     Thread.sleep(2000);
       
		Locator2.Project().click();
	       Thread.sleep(2000);
	       String ProjectText =Locator2.ProjectDD().getText();
	       Thread.sleep(2000);
	       Locator2.ProjectDD().click();
	       Thread.sleep(2000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
	       
       
       
       
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator2.ContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator2.ContractorTypeDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator1.FrequencyDD().getText();
       Thread.sleep(2000);
       Locator2.FrequencyDD().click();
       Thread.sleep(2000);
       Locator2.Frequency().click();
       Thread.sleep(2000);
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator1.Status1Closed().getText();
       Thread.sleep(2000);
       Locator2.Status1Closed().click();
       Thread.sleep(2000);
       Locator1.Status2Closed().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(4000);
       
       
       
       Locator2.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator2.PeriodNA().getText();
       Thread.sleep(2000);
      Locator2.PeriodNA().click();
      Thread.sleep(2000);
    //  Locator2.Period().click();
    //  Thread.sleep(3000);
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(ContractorTypeText);
        li.add(FrequencyText);
        li.add(Statustext);
	    li.add(periodtext);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("ContractorType");
		filter.add("Frequency");
		filter.add("Status");
	    filter.add("Period");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[9]"));
	    List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[8]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(contractorcol);
				}
			else if(i==2)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==3)
			{
				raw.addAll(statuscol);
			}
			else if(i==4)
			{
				raw.addAll(periodcol);
			}
			       
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		//Locator1.ClearButtonGreen().click();
		/*
		if(Locator1.ClearButtonGreen().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonGreen().click();
			test.log(LogStatus.PASS, "  The applied filter get cleared after clicking on the clear button " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
			
		}
		Thread.sleep(2000);
		
		*/
		
	}

	
	
	
	public static void CompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
	   
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.ClosedProject().getText();
       Thread.sleep(2000);
       Locator2.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedHigh().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterCompliedHighDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodFilterCompliedMediumDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedMediumDD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		
		
		
		
		
	}
	
	
	
	//Medium
	
	
	public static void CompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
		
	    Locator2.YellowGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
	    
	   
		

	
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.ClosedProject().getText();
       Thread.sleep(2000);
       Locator2.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedMedium().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterCompliedMediumDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedMediumDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodFilterCompliedMediumDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedMediumDD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		
		
		
		
		
		
		
		
	}
	

	
	
	public static void CompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
		
	    Locator2.GreenGraphinGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
	    
	   
		

	//	String item = Locator1.RedGraphGrid().getText();
		
		   
		
	    /*
		Locator1.EntityLocation().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
		Locator1.EntityLocationExpand().click();
		Thread.sleep(500);
      String locationtext =Locator1.EntityLocationExpand1().getText();
       Thread.sleep(500);
       Locator1.EntityLocationExpand1().click();
       Thread.sleep(500);
       Locator1.EntityLocation().click();
       Thread.sleep(3000);
       */
       
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.ClosedProject().getText();
       Thread.sleep(2000);
       Locator2.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       /*
       WebWait wait1 = new WebWait(, 60000);
       Thread.sleep(2000);
		
		WebElement element = Locator2.ProjectFilterCompliedHigh();	      
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
		
    //   Locator1.ProjectFilterCompliedHigh().click();
     //  Thread.sleep(2000);
      * 
      * 
      */
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedLow().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterCompliedLowDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedLowDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodFilterCompliedMediumDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedMediumDD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		
		
		
		
		
		
		
		
	}
	

	
	
	public static void NotCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.ClosedProject().getText();
       Thread.sleep(2000);
       Locator2.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       /*
       WebWait wait1 = new WebWait(, 60000);
       Thread.sleep(2000);
		
		WebElement element = Locator2.ProjectFilterCompliedHigh();	      
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
		
    //   Locator1.ProjectFilterCompliedHigh().click();
     //  Thread.sleep(2000);
      * 
      * 
      */
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterNotCompliedLow().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterNotCompliedLowDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterNotCompliedLowDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodFilterCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHighDD().click();
       Thread.sleep(2000);
      
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		/*
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
	
	   
	    Method2.CompliedGraphMultipleFilterMedium(, test, workbook);
	    Thread.sleep(2000);
		
		*/
		
		
		
		
		
	}
	
	
	
	
	public static void NotCompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraphInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.ClosedProject().getText();
       Thread.sleep(2000);
       Locator2.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       /*
       WebWait wait1 = new WebWait(, 60000);
       Thread.sleep(2000);
		
		WebElement element = Locator2.ProjectFilterCompliedHigh();	      
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
		
    //   Locator1.ProjectFilterCompliedHigh().click();
     //  Thread.sleep(2000);
      * 
      * 
      */
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedMedium().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterCompliedMediumDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedMediumDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodMediumNC().getText();
       Thread.sleep(2000);
       Locator2.PeriodMediumNC().click();
       Thread.sleep(2000);
    //   Locator2.PeriodFilterCompliedHigh().click();
    //   Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		/*
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
	
	   
	    Method2.CompliedGraphMultipleFilterMedium(, test, workbook);
	    Thread.sleep(2000);
		
		*/
		
		
		
		
		
	}

	
	
	public static void NotCompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.ClosedProject().getText();
       Thread.sleep(2000);
       Locator2.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       /*
       WebWait wait1 = new WebWait(, 60000);
       Thread.sleep(2000);
		
		WebElement element = Locator2.ProjectFilterCompliedHigh();	      
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
		
    //   Locator1.ProjectFilterCompliedHigh().click();
     //  Thread.sleep(2000);
      * 
      * 
      */
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterNotCompliedLow().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterNotCompliedLowDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterNotCompliedLowDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodFilterCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		
		
		
		
	}

	
	////////Not Applicable
	
	
	public static void NotApplicableGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
	    Locator2.GreyInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.ClosedProject().getText();
       Thread.sleep(2000);
       Locator2.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusNADD().getText();
       Thread.sleep(2000);
       Locator2.StatusNADD().click();
       Thread.sleep(2000);
       Locator2.StatusNADD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskNADD().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskNADD1().getText();
       Thread.sleep(2000);
       Locator2.RiskNADD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodNADD().getText();
       Thread.sleep(2000);
       Locator2.PeriodNADD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		
		
		
		
	}

	
	
	public static void NotApplicableGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(3000);
		
	    Locator2.GreyInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.ClosedProject().getText();
       Thread.sleep(2000);
       Locator2.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusNADD().getText();
       Thread.sleep(2000);
       Locator2.StatusNADD().click();
       Thread.sleep(2000);
       Locator2.StatusNADD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskNADDMedium().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskNADDMedium1().getText();
       Thread.sleep(2000);
       Locator2.RiskNADDMedium1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodNADD().getText();
       Thread.sleep(2000);
       Locator2.PeriodNADD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		
		
		
		
	}

	
	
	
	
	public static void NotApplicableGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
	    Locator2.GreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.ClosedProject().getText();
       Thread.sleep(2000);
       Locator2.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusNADD().getText();
       Thread.sleep(2000);
       Locator2.StatusNADD().click();
       Thread.sleep(2000);
       Locator2.StatusNADD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskNADDLow().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskNADDLow1().getText();
       Thread.sleep(2000);
       Locator2.RiskNADDLow1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodNADD().getText();
       Thread.sleep(2000);
       Locator2.PeriodNADD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		
		
		
		
	}

	
	
	
	public static void ACSOverdueMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		Locator1.ACSREDGraph().click();
		Thread.sleep(3000);
		
		getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
      
		
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext1().getText();
	       Thread.sleep(6000);
	       Locator1.ProjectFilterCompliedHigh().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
	       Thread.sleep(2000);
       
       
       
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator2.ContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator2.ContractorTypeDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator1.FrequencyDD().getText();
       Thread.sleep(2000);
       Locator2.FrequencyDD().click();
       Thread.sleep(2000);
       Locator2.Frequency().click();
       Thread.sleep(2000);
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusOverdue().getText();
       Thread.sleep(2000);
       Locator2.StatusOverdue().click();
       Thread.sleep(2000);
       Locator2.StatusOverdue1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(2000);
       
       
       Locator2.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator1.period2().getText();
       Thread.sleep(2000);
      Locator1.period2().click();
      Thread.sleep(2000);
      
      
      
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        
        li.add(ContractorTypeText);
        li.add(FrequencyText);
        li.add(Statustext);
	    li.add(periodtext);
	    li.add(ProjectText);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		
		filter.add("ContractorType");
		filter.add("Frequency");
		filter.add("Status");
	    filter.add("Period");
	    filter.add("Project");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
	    List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(contractorcol);
				}
			else if(i==2)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==3)
			{
				raw.addAll(statuscol);
			}
			else if(i==4)
			{
				raw.addAll(periodcol);
			}
			       
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		//Locator1.ClearButtonGreen().click();
		/*
		if(Locator1.ClearButtonGreen().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonGreen().click();
			test.log(LogStatus.PASS, "  The applied filter get cleared after clicking on the clear button " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
			
		}
		Thread.sleep(2000);
		
		*/
		
	}

	
	
	
	public static void ACSPendingReviewMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		Locator2.ACSBlueGraph().click();
		Thread.sleep(16000);
		
		
		getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
		
	   
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext1().getText();
	       Thread.sleep(6000);
	       Locator1.ProjectFilterCompliedHigh().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
	       Thread.sleep(2000);
       
       
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator2.ContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator2.ContractorTypeDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator1.FrequencyDD().getText();
       Thread.sleep(2000);
       Locator2.FrequencyDD().click();
       Thread.sleep(2000);
       Locator2.Frequency().click();
       Thread.sleep(2000);
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusPendingReview().getText();
       Thread.sleep(2000);
       Locator2.StatusPendingReview().click();
       Thread.sleep(2000);
       Locator2.StatusPendingReview1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(2000);
       
       
       
       Locator2.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator1.period().getText();
       Thread.sleep(2000);
      Locator1.period().click();
      Thread.sleep(2000);
      
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(ContractorTypeText);
        li.add(FrequencyText);
        li.add(Statustext);
	    li.add(periodtext);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("ContractorType");
		filter.add("Frequency");
		filter.add("Status");
	    filter.add("Period");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[9]"));
	    List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[8]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(contractorcol);
				}
			else if(i==2)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==3)
			{
				raw.addAll(statuscol);
			}
			else if(i==4)
			{
				raw.addAll(periodcol);
			}
			       
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		//Locator1.ClearButtonGreen().click();
		/*
		if(Locator1.ClearButtonGreen().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonGreen().click();
			test.log(LogStatus.PASS, "  The applied filter get cleared after clicking on the clear button " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
			
		}
		Thread.sleep(2000);
		
		*/
		
	}


	
	///Bar Graph
	
	
	
	public static void ABCConstruction( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	//WebWait wait = new WebWait(, 1000);
	Thread.sleep(26000);
	
	Thread.sleep(2000);
	
    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
    
    jss.executeScript("window.scrollBy(0,900)");
    Thread.sleep(2000);
    
    Locator2.PWSCompliedGraph().getText();
    Thread.sleep(2000);
	}
	
	
	
	
	
	public static void PWCSCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    
	    
	    Thread.sleep(2000);
		
		Locator2.PWSCompliedGraph().click();
		Thread.sleep(2000);
		
	    Locator2.PWSCompliedGraphHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
	    
	  
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator2.Project3().getText();
       Thread.sleep(3000);
       Locator2.Project2().click();
       Thread.sleep(3000);
       Locator2.Project().click();
       Thread.sleep(2000);
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedHigh().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterCompliedHighDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodFilterCompliedMediumDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedMediumDD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.PASS, filter.get(i)+" dropdown working properly. : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		
		
		
		
	}
	
	
	
	
	public static void PWCSSCompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
		
		Locator2.PWSCompliedGraph().click();
		Thread.sleep(5000);
		
	    Locator2.PWSCompliedGraphMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
	    
	   
	       Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.Project3().getText();
	       Thread.sleep(3000);
	       Locator2.Project2().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
       
       
       
      
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedMedium().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterCompliedMediumDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedMediumDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodFilterCompliedMediumDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedMediumDD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		
	
		
	}
	

	public static void PWCSSCompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    
	    
	    Thread.sleep(2000);
		
		Locator2.PWSCompliedGraph().click();
		Thread.sleep(2000);
		
	    Locator2.PWSCompliedGraphLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
	    
	   
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.Project3().getText();
	       Thread.sleep(3000);
	       Locator2.Project2().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
       
      
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedLow().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterCompliedLowDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedLowDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodFilterCompliedMediumDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedMediumDD().click();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		
	
		
	}

	
	
	//PWS Not Complied
	
	
	public static void PWCSSNotCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
		
		Locator2.PWSNotCompliedGraph().click();
		Thread.sleep(2000);
		
	    Locator2.PWSNotCompliedGraphHighRisk().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.Project3().getText();
	       Thread.sleep(3000);
	       Locator2.Project2().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedHigh().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterCompliedHighDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodNCPWCSSDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodNCPWCSSDD().click();
       Thread.sleep(2000);
      
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		
		
		
	}
	
	
	
	
	public static void PWCSSNotCompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(4000);
		
		Locator2.PWSNotCompliedGraph().click();
		Thread.sleep(7000);
		
	    Locator2.PWSNotCompliedGraphMediumRisk().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.Project3().getText();
	       Thread.sleep(3000);
	       Locator2.Project2().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedMedium().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterCompliedMediumDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterCompliedMediumDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodNCPWCSSDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodNCPWCSSDD().click();
       Thread.sleep(2000);
     
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		
		
		
		
	}

	
	
	public static void PWCSSNotCompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
	    
		
		Locator2.PWSNotCompliedGraph().click();
		Thread.sleep(2000);
		
		
	    Locator2.PWSNotCompliedGraphLowRisk().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.Project3().getText();
	       Thread.sleep(3000);
	       Locator2.Project2().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
       
       
       
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD().click();
       Thread.sleep(2000);
       Locator2.StatusFilterNotCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator2.Status().click();
       Thread.sleep(5000);
       
       
       Locator2.Risk().click();
       Thread.sleep(2000);
       Locator2.RiskFilterNotCompliedLow().click();
       Thread.sleep(2000);
       String RiskText =Locator2.RiskFilterNotCompliedLowDD1().getText();
       Thread.sleep(2000);
       Locator2.RiskFilterNotCompliedLowDD1().click();
       Thread.sleep(2000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.PeriodNCPWCSSDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodNCPWCSSDD().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		
		
		
		
	}


	///////
	
	
	public static void PWCSNotApplicableHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
	    
	    */
		
		Locator2.PWSNotApplicableGraph().click();
		Thread.sleep(2000);
		
	    Locator2.PWSNotApplicableGraphHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);  
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       	
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.Project3().getText();
	       Thread.sleep(3000);
	       Locator2.Project2().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
    
    
	       Locator2.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator2.StatusNADD().getText();
	       Thread.sleep(2000);
	       Locator2.StatusNADD().click();
	       Thread.sleep(2000);
	       Locator2.StatusNADD1().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(5000);
    
    
    Locator2.Risk().click();
    Thread.sleep(2000);
    Locator2.RiskFilterCompliedHigh().click();
    Thread.sleep(2000);
    String RiskText =Locator2.RiskFilterCompliedHighDD1().getText();
    Thread.sleep(2000);
    Locator2.RiskFilterCompliedHighDD1().click();
    Thread.sleep(2000);
    Locator2.Risk().click();
    Thread.sleep(2000);
    
    
    
    
    
    Locator2.PeriodFilterCompliedHigh().click();
    Thread.sleep(2000);
    String PeriodText =Locator2.PeriodNA().getText();
    Thread.sleep(2000);
    Locator2.PeriodNA().click();
    Thread.sleep(2000);
   
    
    
    
    
     List<String> li=new ArrayList<String>();
     
   //  li.add(locationtext);
     li.add(ProjectText);
     li.add(Statustext);
     li.add(RiskText);
     li.add(PeriodText);
    
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {

			 test.log(LogStatus.PASS, "High Rsk - " + filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(5000);
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(3000);
		

		
		Method2.PWCSNotApplicableGraphmedium( test, workbook);
		Thread.sleep(3000);
		
		Method2.PWCSSNotApplicableGraphLow( test, workbook);
		Thread.sleep(3000);
		
	    
	    
	}
	
	
	
	public static void PWCSNotApplicableGraphmedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(2000);
		
		/*
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
		
		Locator2.PWSNotApplicableGraph().click();
		Thread.sleep(2000);
		
		*/
		
	    Locator2.PWSNotApplicableGraphmedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
      
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.Project3().getText();
	       Thread.sleep(3000);
	       Locator2.Project2().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
    
    
    
	       Locator2.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator2.StatusNADD().getText();
	       Thread.sleep(2000);
	       Locator2.StatusNADD().click();
	       Thread.sleep(2000);
	       Locator2.StatusNADD1().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(5000);
    
    
    Locator2.Risk().click();
    Thread.sleep(2000);
    Locator2.RiskFilterCompliedMedium().click();
    Thread.sleep(2000);
    String RiskText =Locator2.RiskFilterCompliedMediumDD1().getText();
    Thread.sleep(2000);
    Locator2.RiskFilterCompliedMediumDD1().click();
    Thread.sleep(2000);
    Locator2.Risk().click();
    Thread.sleep(2000);
    
    
    
    Locator2.PeriodFilterCompliedHigh().click();
    Thread.sleep(2000);
    String PeriodText =Locator2.PeriodNA().getText();
    Thread.sleep(2000);
    Locator2.PeriodNA().click();
    Thread.sleep(2000);
  
    
    
     List<String> li=new ArrayList<String>();
     
   //  li.add(locationtext);
     li.add(ProjectText);
     li.add(Statustext);
     li.add(RiskText);
     li.add(PeriodText);
    
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS, "Medium Risk - " + filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		

		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(3000);
		
	    
	    
	}
	
	
	public static void PWCSSNotApplicableGraphLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(2000);
		
		/*
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(2000);
		
		Locator2.PWSNotApplicableGraph().click();
		Thread.sleep(2000);
		
		*/
		
	    Locator2.PWSNotApplicableGraphLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000); 
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.Project3().getText();
	       Thread.sleep(3000);
	       Locator2.Project2().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
    
           Locator2.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator2.StatusNADD().getText();
	       Thread.sleep(2000);
	       Locator2.StatusNADD().click();
	       Thread.sleep(2000);
	       Locator2.StatusNADD1().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(5000);
    
    
    Locator2.Risk().click();
    Thread.sleep(2000);
    Locator2.RiskFilterNotCompliedLow().click();
    Thread.sleep(2000);
    String RiskText =Locator2.RiskFilterNotCompliedLowDD1().getText();
    Thread.sleep(2000);
    Locator2.RiskFilterNotCompliedLowDD1().click();
    Thread.sleep(2000);
    Locator2.Risk().click();
    Thread.sleep(2000);
    
    
    
    
    
    Locator2.PeriodFilterCompliedHigh().click();
    Thread.sleep(2000);
    String PeriodText =Locator2.PeriodNA().getText();
    Thread.sleep(2000);
    Locator2.PeriodNA().click();
    Thread.sleep(2000);
    
    
    
    
     List<String> li=new ArrayList<String>();
     
   //  li.add(locationtext);
     li.add(ProjectText);
     li.add(Statustext);
     li.add(RiskText);
     li.add(PeriodText);
    
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(projectcol);
				}
			else if(i==1)
				{
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(riskcol);
			}
				
			else if(i==3)
			{
				raw.addAll(periodcol);
			}
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS, "Low Risk - " +  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(3000);
		
		
		
	}
	

	
	public static void DocumentTabMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(10000);
		Locator2.Document().click();
		Thread.sleep(3000);
	    
		/*
	       Locator2.SelectLocationDocument().click();
	       Thread.sleep(3000);
	       Locator2.SelectLocationDropDocument().click();
			Thread.sleep(2000);
	       String locationText =Locator2.SelectLocationDropDownDocument().getText();
	       Thread.sleep(3000);
	       Locator2.SelectLocationDropDownDocument().click();
	       Thread.sleep(3000);
	       Locator2.SelectLocationDocument().click();
	       Thread.sleep(2000);
    */
    
	       Locator2.DocumentTabSelectContractor().click();
	       Thread.sleep(2000);
	       String contractortext =Locator2.DocumentTabSelectContractorDD().getText();
	       Thread.sleep(2000);
	       Locator2.DocumentTabSelectContractorDD().click();
	       Thread.sleep(2000);
	       Locator2.DocumentTabSelectContractor().click();
	       Thread.sleep(5000);
    
    
    Locator2.DocumentTabSelectProject().click();
    Thread.sleep(2000);
    String projectText =Locator2.DocumentTabSelectProjectDD().getText();
    Thread.sleep(2000);
    Locator2.DocumentTabSelectProjectDD().click();
    Thread.sleep(2000);
    Locator2.DocumentTabSelectProject().click();
    Thread.sleep(2000);
    
    
    
    
     List<String> li=new ArrayList<String>();
     
  //   li.add(locationText);
     li.add(contractortext);
     li.add(projectText);
    
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Contractor");
		filter.add("Project");
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[2]"));
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(contractorcol);
				}
			else if(i==1)
				{
					raw.addAll(projectcol);
				}
			
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-1000)");	
		Thread.sleep(3000);
		
		
		
		if(Locator2.ClearDocument().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.ClearDocument().click();
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Is Clickable "  );
			
		}
		
	
		
	}
	

	
	
	public static void ReportMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(10000);
		Locator2.Report().click();
		Thread.sleep(6000);
		
		Locator2.LocationReport().click();
		Thread.sleep(2000);
		Locator2.LocationProjectMasterExpand().click();
		Thread.sleep(2000);
		Locator2.VCALegalEntityExpandAA().click();
		Thread.sleep(3000);
		String locationtext =Locator2.VCALegalEntityAADDGetText().getText();
	    Thread.sleep(2000);
	   Locator2.VCALegalEntityAADD().click();
       Thread.sleep(2000);
       Locator2.LocationReport().click();
	   Thread.sleep(2000);
       
       
       Locator2.ProjectReport().click();
       Thread.sleep(2000);
       String Projecttext =Locator2.ProjectReportDD().getText();
       Thread.sleep(4000);
       Locator2.ProjectReportDD().click();
       Thread.sleep(2000);
       Locator2.ProjectReport().click();
       Thread.sleep(2000);
       
       
       Locator2.ReportTabContractor().click();
       Thread.sleep(2000);
       String contractortext =Locator2.ReportTabContractorDD().getText();
       Thread.sleep(2000);
       Locator2.ReportTabContractorDD().click();
       Thread.sleep(2000);
       Locator2.ReportTabContractor().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.ReportTabContractorType().click();
       Thread.sleep(2000);
       String contractorTypetext =Locator2.ReportTabContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator2.ReportTabContractorTypeDD().click();
       Thread.sleep(2000);
       Locator2.ReportTabContractorType().click();
       Thread.sleep(2000);
       
       Locator2.ReportTabFequency().click();
       Thread.sleep(2000);
       String frequencytext =Locator2.ReportTabFequencyDD().getText();
       Thread.sleep(2000);
       Locator2.ReportTabFequencyDD().click();
       Thread.sleep(2000);
       Locator2.ReportTabFequency().click();
       Thread.sleep(2000);
       
       
       Locator2.ReportTabPeriod().click();
       Thread.sleep(2000);
       String periodtext =Locator2.ReportTabPeriodDD().getText();
       Thread.sleep(2000);
       Locator2.ReportTabPeriodDD().click();
       Thread.sleep(2000);
       Locator2.ReportTabPeriod().click();
       Thread.sleep(2000);
       
       
       Locator2.ReportTabStatus().click();
       Thread.sleep(2000);
       String statustext =Locator2.ReportTabStatusDD().getText();
       Thread.sleep(2000);
       Locator2.ReportTabStatusDD().click();
       Thread.sleep(2000);
       Locator2.ReportTabStatus().click();
       Thread.sleep(2000);
       
       
       
       
       
        List<String> li=new ArrayList<String>();
        
        li.add(locationtext);
        li.add(Projecttext);
        li.add(contractortext);
        li.add(contractorTypetext);
        li.add(frequencytext);
        li.add(periodtext);
        li.add(statustext);
        
        
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("Project");
		filter.add("Contractor");
		filter.add("Contractor Type");
		filter.add("Frequency");
		filter.add("Period");
		filter.add("Status");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> locationcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[10]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[2]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> contractorTypecol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[8]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[9]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(locationcol);
				}
			else if(i==1)
				{
					raw.addAll(projectcol);
				}
			
			else if(i==2)
			{
				raw.addAll(contractorcol);
			}
		
			else if(i==3)
			{
				raw.addAll(contractorTypecol);
			}
				
			else if(i==4)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==5)
			{
				raw.addAll(periodcol);
			}
				
			else if(i==6)
			{
				raw.addAll(statuscol);
			}
				
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-1000)");	
		Thread.sleep(3000);
		
		if(Locator.ClearButtonReport().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearButtonReport().click();
			test.log(LogStatus.PASS, "The applied filter get cleared after clicking on the clear button" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " The applied filter Not get cleared after clicking on the clear button"  );
			
		}
			
		
	}
	
	
	
	public static void overdueExcelcountAndGridMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
    //    Locator1.Overdue().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(2000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

        /*
		String item = Locator1.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

*/
        
        
        Thread.sleep(7000);
        Locator.readTotalItems1().click();
		String item = Locator.readTotalItems1().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
	
		if(compliancesCount.equalsIgnoreCase("to"))
		{
			Thread.sleep(5000);
		   item = Locator.readTotalItems1().getText();
			bits = item.split(" ");
        
		}
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(5000);
 		
	//	Thread.sleep(2000);
 	//	Locator.ExportButtonCT().click();
		Thread.sleep(5000);
		
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
		
		
		Thread.sleep(2000);

		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Compliances Report .xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	//int rowCount = sheet.getLastRowNum();
	
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-1;
		}
		
	}
	
	
	System.out.println("Row Count in column  " + columnNumber + ": " + actualRow);
	
	workbook.close();
	fis.close();
	
	if(count1 == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+count1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+count1+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\Audit Compliances Report .xlsx";
	
	File file = new File(fis1);
	  
	 if(file.exists()) {
		 
		 if(file.delete())
		 {
		 
		 System.out.println("File deleted Successfully.");
	     }
		 
	 }
	 else {
		 
		 System.out.println("File does not exist Successfully.");
	 }
	 
	
	}
	
	
	
	
	public static void UpcomingExcelcountAndGridMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	//    Locator2.UpcomingCountDashboard().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	   
		Thread.sleep(20000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

        /*
		String item = Locator1.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

*/
        
        
        Thread.sleep(7000);
        Locator.readTotalItems1().click();
		String item = Locator.readTotalItems1().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
	
		if(compliancesCount.equalsIgnoreCase("to"))
		{
			Thread.sleep(5000);
		   item = Locator.readTotalItems1().getText();
			bits = item.split(" ");
        
		}
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
	//	Thread.sleep(2000);
 	//	Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
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
		
		
		Thread.sleep(4000);
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Compliances Report .xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	//int rowCount = sheet.getLastRowNum();
	
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-1;
		}
		
	}
	
	
	System.out.println("Row Count in column  " + columnNumber + ": " + actualRow);
	
	workbook.close();
	fis.close();
	
	if(count1 == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+count1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+count1+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\Audit Compliances Report .xlsx";
	
	File file = new File(fis1);
	  
	 if(file.exists()) {
		 
		 if(file.delete())
		 {
		 
		 System.out.println("File deleted Successfully.");
	     }
		 
	 }
	 else {
		 
		 System.out.println("File does not exist Successfully.");
	 }
	 
	
	}
	
	
	
	public static void RejectedExcelcountAndGridMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	//    Locator2.RejectedDasboardCount().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	   			
		Thread.sleep(20000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

        /*
		String item = Locator1.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

*/
        
        
        Thread.sleep(7000);
        Locator.readTotalItems1().click();
		String item = Locator.readTotalItems1().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
	
		if(compliancesCount.equalsIgnoreCase("to"))
		{
			Thread.sleep(5000);
		   item = Locator.readTotalItems1().getText();
			bits = item.split(" ");
        
		}
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(5000);
 		
	//	Thread.sleep(2000);
 	//	Locator.ExportButtonCT().click();
		Thread.sleep(5000);
		
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
		
		
		Thread.sleep(2000);

		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Compliances Report .xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	//int rowCount = sheet.getLastRowNum();
	
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-1;
		}
		
	}
	
	
	System.out.println("Row Count in column  " + columnNumber + ": " + actualRow);
	
	workbook.close();
	fis.close();
	
	if(count1 == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+count1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+count1+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\Audit Compliances Report .xlsx";
	
	File file = new File(fis1);
	  
	 if(file.exists()) {
		 
		 if(file.delete())
		 {
		 
		 System.out.println("File deleted Successfully.");
	     }
		 
	 }
	 else {
		 
		 System.out.println("File does not exist Successfully.");
	 }
	 
	
	}
	
	
	
	
	public static void PendingReviewExcelcountAndGridMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	 //   Locator2.PendingReviewCountDashboard().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	   			
		Thread.sleep(20000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

        /*
		String item = Locator1.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

*/
        
        
        Thread.sleep(7000);
        Locator.readTotalItems1().click();
		String item = Locator.readTotalItems1().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
	
		if(compliancesCount.equalsIgnoreCase("to"))
		{
			Thread.sleep(5000);
		   item = Locator.readTotalItems1().getText();
			bits = item.split(" ");
        
		}
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
	//	Thread.sleep(2000);
 	//	Locator.ExportButtonCT().click();
		Thread.sleep(5000);
		
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
		Thread.sleep(2000);
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Compliances Report .xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	//int rowCount = sheet.getLastRowNum();
	
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-1;
		}
		
	}
	
	
	System.out.println("Row Count in column  " + columnNumber + ": " + actualRow);
	
	workbook.close();
	fis.close();
	
	if(count1 == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+count1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+count1+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\Audit Compliances Report .xlsx";
	
	File file = new File(fis1);
	  
	 if(file.exists()) {
		 
		 if(file.delete())
		 {
		 
		 System.out.println("File deleted Successfully.");
	     }
		 
	 }
	 else {
		 
		 System.out.println("File does not exist Successfully.");
	 }
	 Thread.sleep(2000);
	
	}
	
	
	
	
	public static void ClosedExcelcountAndGridMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	//    Locator2.ClosedDashboardCountMatch().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
	    
	    		
		Thread.sleep(20000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

        /*
		String item = Locator1.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

*/
        
        
        Thread.sleep(7000);
        Locator.readTotalItems1().click();
		String item = Locator.readTotalItems1().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
	
		if(compliancesCount.equalsIgnoreCase("to"))
		{
			Thread.sleep(5000);
		   item = Locator.readTotalItems1().getText();
			bits = item.split(" ");
        
		}
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
	//	Thread.sleep(2000);
 	//	Locator.ExportButtonCT().click();
		Thread.sleep(5000);
		
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
		Thread.sleep(2000);
		
	FileInputStream fis = new FileInputStream("C:\\\\Users\\\\shitalb\\\\Downloads\\\\Audit Compliances Report .xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	//int rowCount = sheet.getLastRowNum();
	
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-1;
		}
		
	}
	
	
	System.out.println("Row Count in column  " + columnNumber + ": " + actualRow);
	
	workbook.close();
	fis.close();
	
	if(count1 == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+count1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+count1+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\Audit Compliances Report .xlsx";
	
	File file = new File(fis1);
	  
	 if(file.exists()) {
		 
		 if(file.delete())
		 {
		 
		 System.out.println("File deleted Successfully.");
	     }
		 
	 }
	 else {
		 
		 System.out.println("File does not exist Successfully.");
	 }
	 Thread.sleep(2000);
	
	}
	
	
	
	
	public static void AddHeadCountUpcomingAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator2.UpcomingCountDashboard().click();
		Thread.sleep(20000);
		
		Locator2.EditButtonPendingReview().click();
		Thread.sleep(9000);
		
        Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(6000);
		
		Locator1.HeadCountsave().click();
		
		Thread.sleep(5000);
		 Alert ac3=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Without Enter Data Add Head Count - " + t4 );
			
			Thread.sleep(2000);
			ac3.accept();
			
			Thread.sleep(2000);
	
		
		
		
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
					 Alert ac6=getDriver().switchTo().alert();
						
						String t6=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS,"Without select month add head count = " + t6 );
						
						Thread.sleep(2000);
						ac6.accept();
						
						Thread.sleep(2000);
						
						Locator1.HeadCountclose().click();
						Thread.sleep(3000);
						
			
						Locator1.HeadCountButton().click();
						Thread.sleep(3000);
						
						
						
						Locator1.HeadCountselectmonthOverdue().click();
						Thread.sleep(9000);
						
						
						
						WebElement element = Locator1.HeadCountselectmonthDD();	      
						//JavascriptExecutor to click element
					      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
					      jse.executeScript("arguments[0].click();", element);
					      boolean b = element.isSelected();
					      if (b) {
					         System.out.println("Checkbox is not checked");
					      }else {
					         System.out.println("Checkbox is checked");
					      }
						
					      Thread.sleep(20000);
						
					      Locator1.HeadCountmaleCount().clear();
					      Thread.sleep(2000);
							/*
							
							row0 = sheet.getRow(13);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(3000);
							
							*/
							
							row0 = sheet.getRow(14);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(2000);
							
						
							if(Locator1.HeadCountsave().isEnabled())
							{
								
								Thread.sleep(2000);
							    Locator1.HeadCountsave().click();
								test.log(LogStatus.PASS, "  without select male Head Count add head count = Please Select male Head Count  " );
								
							}
							
							else
							{
								test.log(LogStatus.FAIL, "  without select male Head Count add head count = Please Select male Head Count  "  );
								
							}
							Thread.sleep(2000);
								
								
								
								Locator1.HeadCountclose().click();
								Thread.sleep(3000);
								
								Locator1.HeadCountButton().click();
								Thread.sleep(3000);
								
								Locator1.selectmonthheadCountValidation().click();
								Thread.sleep(9000);
								
								
								
								WebElement element1 = Locator1.HeadCountselectmonthDD();	      
								//JavascriptExecutor to click element
							      JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
							      jse.executeScript("arguments[0].click();", element1);
							      boolean b1 = element1.isSelected();
							      if (b1) {
							         System.out.println("Checkbox is not checked");
							      }else {
							         System.out.println("Checkbox is checked");
							      }
								
							      Thread.sleep(20000);
								
				
									
									row0 = sheet.getRow(13);
									c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
									Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
									Thread.sleep(3000);
									
									
									
									Locator1.HeadCountFemaleCount().clear();
									Thread.sleep(3000);
									
									/*
									row0 = sheet.getRow(14);
									c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
									Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
									Thread.sleep(2000);
									*/
								
									if(Locator1.HeadCountsave().isEnabled())
									{
										
										Thread.sleep(2000);
									    Locator1.HeadCountsave().click();
										test.log(LogStatus.PASS, "  without select Female Head Count add head count = Please Enter Female Head Count  " );
										
									}
									
									else
									{
										test.log(LogStatus.FAIL, "  without select Female Head Count add head count = Please Enter Female Head Count  "  );
										
									}
									Thread.sleep(2000);
										
										Locator1.HeadCountclose().click();
										Thread.sleep(3000);
										
							
				
		
	}
	
	
	
	public static void RejectedHeadCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.RejectedDasboardCount().click();
		Thread.sleep(20000);
		
		Thread.sleep(2000);
		Locator2.UpcomingEditButton().click();
		Thread.sleep(2000);
		
		 Method2.SwitchToNewlyOpenedWindow( test, workbook);
			
			Thread.sleep(5000);
			
			
			Locator1.HeadCountButton().click();
			Thread.sleep(6000);
			
			Locator1.HeadCountsave().click();
			
			Thread.sleep(5000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Without Enter Data Add Head Count - " + t4 );
				
				Thread.sleep(2000);
				ac3.accept();
				
				Thread.sleep(2000);
		
			
			
			
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
						 Alert ac6=getDriver().switchTo().alert();
							
							String t6=getDriver().switchTo().alert().getText();
							
							test.log(LogStatus.PASS,"Without select month add head count = " + t6 );
							
							Thread.sleep(2000);
							ac6.accept();
							
							Thread.sleep(2000);
							
							Locator1.HeadCountclose().click();
							Thread.sleep(3000);
							
				
							Locator1.HeadCountButton().click();
							Thread.sleep(3000);
							
							
							
							Locator1.HeadCountselectmonthOverdue().click();
							Thread.sleep(9000);
							
							
							
							WebElement element = Locator1.HeadCountselectmonthDD();	      
							//JavascriptExecutor to click element
						      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
						      jse.executeScript("arguments[0].click();", element);
						      boolean b = element.isSelected();
						      if (b) {
						         System.out.println("Checkbox is not checked");
						      }else {
						         System.out.println("Checkbox is checked");
						      }
							
						      Thread.sleep(20000);
							
						      Locator1.HeadCountmaleCount().clear();
						      Thread.sleep(2000);
								/*
								
								row0 = sheet.getRow(13);
								c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
								Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
								Thread.sleep(3000);
								
								*/
								
								row0 = sheet.getRow(14);
								c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
								Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
								Thread.sleep(2000);
								
							
								if(Locator1.HeadCountsave().isEnabled())
								{
									
									Thread.sleep(2000);
								    Locator1.HeadCountsave().click();
									test.log(LogStatus.PASS, "  without select male Head Count add head count = Please Select male Head Count  " );
									
								}
								
								else
								{
									test.log(LogStatus.FAIL, "  without select male Head Count add head count = Please Select male Head Count  "  );
									
								}
								Thread.sleep(2000);
									
									
									
									Locator1.HeadCountclose().click();
									Thread.sleep(3000);
									
									Locator1.HeadCountButton().click();
									Thread.sleep(3000);
									
									Locator1.selectmonthheadCountValidation().click();
									Thread.sleep(9000);
									
									
									
									WebElement element1 = Locator1.HeadCountselectmonthDD();	      
									//JavascriptExecutor to click element
								      JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
								      jse.executeScript("arguments[0].click();", element1);
								      boolean b1 = element1.isSelected();
								      if (b1) {
								         System.out.println("Checkbox is not checked");
								      }else {
								         System.out.println("Checkbox is checked");
								      }
									
								      Thread.sleep(20000);
									
					
										
										row0 = sheet.getRow(13);
										c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
										Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
										Thread.sleep(3000);
										
										
										
										Locator1.HeadCountFemaleCount().clear();
										Thread.sleep(3000);
										
										/*
										row0 = sheet.getRow(14);
										c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
										Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
										Thread.sleep(2000);
										*/
									
										if(Locator1.HeadCountsave().isEnabled())
										{
											
											Thread.sleep(2000);
										    Locator1.HeadCountsave().click();
											test.log(LogStatus.PASS, "  without select Female Head Count add head count = Please Enter Female Head Count  " );
											
										}
										
										else
										{
											test.log(LogStatus.FAIL, "  without select Female Head Count add head count = Please Enter Female Head Count  "  );
											
										}
										Thread.sleep(2000);
											
											Locator1.HeadCountclose().click();
											Thread.sleep(3000);
											
								
					
			
		
		
	}
	
	
	
	
	
	
	public static void ClosedReviewAddHeadCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator2.ClosedDashboardCountMatch().click();
		Thread.sleep(20000);
	
		Thread.sleep(2000);
		Locator2.UpcomingEditButton().click();
		
		Method2.SwitchToNewlyOpenedWindow( test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(6000);
		
		Locator1.HeadCountsave().click();
		
		Thread.sleep(5000);
		 Alert ac3=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Without Enter Data Add Head Count - " + t4 );
			
			Thread.sleep(2000);
			ac3.accept();
			
			Thread.sleep(2000);
	
		
		
		
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
					 Alert ac6=getDriver().switchTo().alert();
						
						String t6=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS,"Without select month add head count = " + t6 );
						
						Thread.sleep(2000);
						ac6.accept();
						
						Thread.sleep(2000);
						
						Locator1.HeadCountclose().click();
						Thread.sleep(3000);
						
			
						Locator1.HeadCountButton().click();
						Thread.sleep(3000);
						
						
						
						Locator1.HeadCountselectmonthOverdue().click();
						Thread.sleep(9000);
						
						
						
						WebElement element = Locator1.HeadCountselectmonthDD();	      
						//JavascriptExecutor to click element
					      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
					      jse.executeScript("arguments[0].click();", element);
					      boolean b = element.isSelected();
					      if (b) {
					         System.out.println("Checkbox is not checked");
					      }else {
					         System.out.println("Checkbox is checked");
					      }
						
					      Thread.sleep(20000);
						
					      Locator1.HeadCountmaleCount().clear();
					      Thread.sleep(2000);
							/*
							
							row0 = sheet.getRow(13);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(3000);
							
							*/
							
							row0 = sheet.getRow(14);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(2000);
							
						
							if(Locator1.HeadCountsave().isEnabled())
							{
								
								Thread.sleep(2000);
							    Locator1.HeadCountsave().click();
								test.log(LogStatus.PASS, "  without select male Head Count add head count = Please Select male Head Count  " );
								
							}
							
							else
							{
								test.log(LogStatus.FAIL, "  without select male Head Count add head count = Please Select male Head Count  "  );
								
							}
							Thread.sleep(2000);
								
								
								
								Locator1.HeadCountclose().click();
								Thread.sleep(3000);
								
								Locator1.HeadCountButton().click();
								Thread.sleep(3000);
								
								Locator1.selectmonthheadCountValidation().click();
								Thread.sleep(9000);
								
								
								
								WebElement element1 = Locator1.HeadCountselectmonthDD();	      
								//JavascriptExecutor to click element
							      JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
							      jse.executeScript("arguments[0].click();", element1);
							      boolean b1 = element1.isSelected();
							      if (b1) {
							         System.out.println("Checkbox is not checked");
							      }else {
							         System.out.println("Checkbox is checked");
							      }
								
							      Thread.sleep(20000);
								
				
									
									row0 = sheet.getRow(13);
									c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
									Locator1.HeadCountmaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
									Thread.sleep(3000);
									
									
									
									Locator1.HeadCountFemaleCount().clear();
									Thread.sleep(3000);
									
									/*
									row0 = sheet.getRow(14);
									c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
									Locator1.HeadCountFemaleCount().sendKeys(c1.getStringCellValue()); // Writing Task title
									Thread.sleep(2000);
									*/
								
									if(Locator1.HeadCountsave().isEnabled())
									{
										
										Thread.sleep(2000);
									    Locator1.HeadCountsave().click();
										test.log(LogStatus.PASS, "  without select Female Head Count add head count = Please Enter Female Head Count  " );
										
									}
									
									else
									{
										test.log(LogStatus.FAIL, "  without select Female Head Count add head count = Please Enter Female Head Count  "  );
										
									}
									Thread.sleep(2000);
										
										Locator1.HeadCountclose().click();
										Thread.sleep(3000);
										
							
				
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
