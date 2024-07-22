package companyContractor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import companyAdmin.Locator;
import companyAuditor.Locator2;
import companyAuditor.Method2;
import companyManagement.Locator5;
import companyProjectDirector.Locator4;
import companyProjectHead.Locator3;
import login.BasePage;



public class Method1 extends BasePage{

	
	
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;
	
	
	
	
	public static void UpdateUpcoming( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.Upcoming().click();
		Thread.sleep(20000);
		
		Locator1.UpcomingEditButton1().click();
		Thread.sleep(4000);
		
        Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(9000);
		
        
		
		sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		/*
		
		if(Locator1.UpcomingSelectFile().isEnabled())
		{
			
			Thread.sleep(2000);
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "  File Successfully Added " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File does not Successfully Added "  );
			
		}
		
		*/
		
		
       Alert ace=getDriver().switchTo().alert();
		
		String te=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "File " + te );
		
		Thread.sleep(4000);
		ace.accept();
	
		Thread.sleep(9000);
		
		 JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,200)");
	        Thread.sleep(5000);
	       
	        Locator1.EditinEditUpcoming().click();
			Thread.sleep(5000);
			
			Locator1.SelectStatus().click();
			Thread.sleep(5000);
			
			Locator1.SelectStatusDD().click();
			Thread.sleep(5000);	
			
			WebElement element = Locator1.CheckBoxUpcoming();	      
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
		        
			
			/*
		Locator1.UPEditInEdit().click();
		Thread.sleep(5000);
		
		Locator1.ComplianceStatus().click();
		Thread.sleep(3000);
		
		Locator1.ComplianceStatusDD().click();
		Thread.sleep(5000);
		
		*/
		
		
		 Locator1.Save1().click();
		 Thread.sleep(5000);
				
		
        Alert ac=getDriver().switchTo().alert();
		
		String t=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t );
		
		Thread.sleep(4000);
		ac.accept();
		
			
		
	}
	
	
	
	
	
	public static void DashboardCountGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
//		WebDriver wait = new WebDriver(1000);
		Thread.sleep(20000);
		
		int open = Integer.parseInt(Locator1.Upcoming().getText());	//Reading Dashboard count.
        Locator1.Upcoming().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

		String item = Locator1.GridCount().getText();
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
		
		
	
		Thread.sleep(4000);
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
	    
	    
	    if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
	    
	*/
	Method1.UpcomingAuditExcelCountGridCount1(test,workbook);	
		
	Thread.sleep(4000);
	
	    Locator1.ClearButtonStateRejected().click();
		Thread.sleep(3000);
		Locator1.ClearButtonStateDDRejected().click();
		Thread.sleep(3000);
		
		if(Locator1.UpcomingCleartButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingCleartButton().click();
			test.log(LogStatus.PASS, "  Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		Thread.sleep(2000);
		
	    
	}
	
	
	public static void UpcomingAuditExcelCountGridCount1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait( 1000);
		/*
		Thread.sleep(20000);
		
        Locator1.Upcoming().click();					                //Clicking on Dashboard count
        Thread.sleep(20000);
        
       
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       
/
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
 		
		Thread.sleep(4000);
 	//	Locator.ExportButtonCT().click();
	//	Thread.sleep(9000);
		/*
		if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
		*/
        File dir9 = new File("C:\\Users\\shitalb\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.UpcomingExport().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\shitalb\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " File Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, "  File Does Not Download Successfully "   );

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
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\Audit Compliances Report .xlsx";
	
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
	
	
	
	public static void OverdueAuditExcelCountGridCount1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(20000);
		
        Locator1.Upcoming().click();					                //Clicking on Dashboard count
        Thread.sleep(20000);
        
       
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       
/
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
 		
		Thread.sleep(2000);
 	//	Locator.ExportButtonCT().click();
	//	Thread.sleep(9000);
		/*
		if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
		*/
        File dir9 = new File("C:\\Users\\shitalb\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.UpcomingExport().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\shitalb\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " File Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, "  File Does Not Download Successfully "   );

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
	 
	 Thread.sleep(2000);
     
	    
	}
	
	
	
	public static void RejectedAuditExcelCountGridCount1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(20000);
		
        Locator1.Upcoming().click();					                //Clicking on Dashboard count
        Thread.sleep(20000);
        
       
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       
/
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
 		
		Thread.sleep(2000);
 	//	Locator.ExportButtonCT().click();
	//	Thread.sleep(9000);
		/*
		if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
		*/
	       File dir9 = new File("C:\\Users\\shitalb\\Downloads");
	 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
	 		
	 		Thread.sleep(3000);
	 		Locator1.UpcomingExport().click();
	 		
	 	 	Thread.sleep(9000);
	 		File dir0 = new File("C:\\Users\\shitalb\\Downloads");
	 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
	 	  
	        Thread.sleep(3000);
	 	   if (dirContents9.length < allFilesNew0.length) {
	 			test.log(LogStatus.PASS,  " File Download Successfully");
	 		}
	 	   else
	 	   {
	 		 	test.log(LogStatus.FAIL, "  File Does Not Download Successfully "   );

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
	 
	 Thread.sleep(2000);
     
	    
	}
	
	
	
	
	
	
	
	
	public static void UpcomingDownloadAndViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Upcoming().click();
		Thread.sleep(20000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(6000);
		
        
		
		// Locator1.UpcomingDownloadAndViewButton().click();
		// Thread.sleep(2000);
		 
		    if(Locator1.UpcomingDownloadAndViewButton().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator1.UpcomingDownloadAndViewButton().click();
			test.log(LogStatus.PASS, " Document Viewed Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Document Viewed Successfully "  );
			
		}
		
		    Thread.sleep(9000);
		  
		    /*
		 //   .switchTo().frame(Locator1.viewinframe());
		 //   Thread.sleep(2000);
		    
		    .switchTo().frame(Locator1.frame3());
		    Thread.sleep(3000);
		    
		    if(Locator1.UpcomingDownloadAndViewButton1().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.UpcomingDownloadAndViewButton1().click();
				test.log(LogStatus.PASS, " Document Download Successfully " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Document Download Successfully "  );
				
			}
			
		    
		    */
		    
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void CommentButtonUpcoming( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Upcoming().click();
		Thread.sleep(20000);
		
		
		Locator1.UpcomingEditButton1().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
        
		
		 Locator2.CommentButtonPR().click();
		 Thread.sleep(2000);
		 
		    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(12);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator2.CommentTypePR().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(6000);
			
			/*
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator2.File().sendKeys(c1.getStringCellValue()); // Writing Task title
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
	
	
	
	public static void UpcomingDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Upcoming().click();
		Thread.sleep(20000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		 
			File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(9000);
		     Locator2.Downloadupcoming().click();
			
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

	
	}
	
	
	
	public static void UpcomingAuditLog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.Upcoming().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton1().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
if(Locator1.transactionLog().isDisplayed()&&Locator1.statusLog().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Transaction log tab and status log tab should be seen in the Audit log popup");
		}else {
			
			test.log(LogStatus.FAIL, "Transaction log tab and status log tab should be not seen in the Audit log popup");
			
		}

		
		
	}
	
	
	
	
	public static void Upcomingtransactionandstatuslog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.Upcoming().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton1().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
	       Thread.sleep(6000);
			
	       if(Locator1.CreatedOn().isDisplayed()&&Locator1.Action().isDisplayed()&&Locator1.RemarkStatusLog().isDisplayed()&&Locator1.FileName().isDisplayed()&&Locator1.CreatedBy().isDisplayed()&&Locator1.Role().isDisplayed()) {
	       			
	       			test.log(LogStatus.PASS, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be seen on the page of Status log Page");
	       		}else {
	       			
	       			test.log(LogStatus.FAIL, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be not seen on on the page of Status log Page");
	       			
	       		}

	       Thread.sleep(1000);
		Locator1.transactionLog().click();
		Thread.sleep(6000);
		
if(Locator1.transactionLogRemark().isDisplayed()&&Locator1.transactionLogCreatedBy().isDisplayed()&&Locator1.transactionLogCreatedon().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Remark column, Created By Column and Created On Column should be seen on the page of transaction log Page");
		}else {
			
			test.log(LogStatus.FAIL, "Remark column, Created By Column and Created On Column should be not seen on the page of transaction log Page");
			
		}
Thread.sleep(4000);
    //    Locator1.statusLog().click();
 
        
	}
	
	
	public static void UpdateOverdue1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(20000);
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);
        
  //      Locator1.LastPaging().click();
	//	Thread.sleep(5000);
		
	//	Locator1.FirstLeftPaging().click();
	//	Thread.sleep(5000);
	       
	//	Locator1.FirstLeftPaging().click();
	//	Thread.sleep(5000);
	       
		Locator1.UpdateOverdue().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		 sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			Thread.sleep(2000);
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
	
			
			 Alert ac=getDriver().switchTo().alert();
				
				String t=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t );
				
				Thread.sleep(9000);
				ac.accept();
				
				Thread.sleep(5000);

		
			/*
		if(Locator1.UpcomingSelectFile().isEnabled())
		{
			
			Thread.sleep(2000);
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "  File Successfully Added " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File does not Successfully Added "  );
			
		}
		*/
		Thread.sleep(5000);
		
		Locator1.EditinEditOverdue().click();
		Thread.sleep(5000);
		
		Locator1.SelectStatus().click();
		Thread.sleep(5000);
		
		Locator1.SelectStatusDD().click();
		Thread.sleep(5000);	
		
	//	Locator1.CheckBox().click();
	//	Thread.sleep(5000);
		
		WebElement element = Locator1.CheckBox();	      
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
	        
	        Thread.sleep(6000);
		
		Locator1.Save1().click();
		Thread.sleep(5000);
		
		 Alert ac1=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t1 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(5000);
		
		/*
		 Locator2.CommentButtonPR().click();
		 Thread.sleep(2000);
		 
		    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(12);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator2.CommentTypePR().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(6000);
			
	    
		
		
		if(Locator2.CommentButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.CommentButton().click();
			test.log(LogStatus.PASS, " Record Saved Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Record Saved Successfully "  );
			
		}
		
		*/
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void UpcomingView( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Upcoming().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton1().click();
		Thread.sleep(2000);
		
  //       Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,200)");
        Thread.sleep(4000);
       
		
		if(Locator1.ViewButtonofEditPR().isEnabled())
		{
			
			Thread.sleep(3000);
		    Locator1.ViewButtonofEditPR().click();
			test.log(LogStatus.PASS, " View Documents Button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " View Documents Button Does not working properly "  );
			
		}
		
		
		
	
		
	}
	
	
	
	
	
	
	public static void OverdueDownloadAndViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(20000);
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);
        
   //     Locator1.LastPaging().click();
	//	Thread.sleep(5000);
		
	//	Locator1.FirstLeftPaging().click();
	//	Thread.sleep(5000);
	       
	//	Locator1.FirstLeftPaging().click();
	//	Thread.sleep(5000);
	       
		Locator1.UpdateOverdue().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(6000);
		
        
		
		// Locator1.UpcomingDownloadAndViewButton().click();
		// Thread.sleep(2000);
		 
		    if(Locator1.UpcomingDownloadAndViewButton().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator1.UpcomingDownloadAndViewButton().click();
			test.log(LogStatus.PASS, " Document Viewed Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Document Viewed Successfully "  );
			
		}
		
		    Thread.sleep(9000);
		  
		   
		    
		    
		    
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void UpdateOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(2000);
		
		Locator1.UpdateOverdue().click();
		Thread.sleep(9000);
		
		
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.overdueselectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		
		
		Thread.sleep(20000);
		 Alert ac3=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t4 );
			
			Thread.sleep(4000);
			ac3.accept();
			
			Thread.sleep(4000);
		
		
		
	}
	
	
	
	
	
	
	
	
		
		
		
		
		
	
	
	
	
	
	
	public static void overduecountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator1.Overdue().getText());	//Reading Dashboard count.
        Locator1.Overdue().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(2000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

		String item = Locator1.Overduegrid().getText();
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
		
        Thread.sleep(4000);
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
	    
	    
	    if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
		
		*/
        
        Method1.OverdueAuditExcelCountGridCount1(test,workbook);
	    
	    Thread.sleep(4000);
	    
	    Locator1.ClearButtonStateRejected().click();
		Thread.sleep(3000);
		Locator1.ClearButtonStateDDRejected().click();
		Thread.sleep(3000);
		Locator1.ClearButtonStateRejected().click();
		Thread.sleep(3000);
		
		if(Locator1.UpcomingCleartButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingCleartButton().click();
			test.log(LogStatus.PASS, "  Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
	    
		

		
	}
	
	
	public static void OverdueAuditLog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.Overdue().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
if(Locator1.transactionLog().isDisplayed()&&Locator1.statusLog().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Transaction log tab and status log tab should be seen in the Audit log popup");
		}else {
			
			test.log(LogStatus.FAIL, "Transaction log tab and status log tab should be not seen in the Audit log popup");
			
		}

		
		
	}
	
	
	public static void Overduetransactionandstatuslog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.Overdue().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
	       Thread.sleep(4000);
			
	       if(Locator1.CreatedOn().isDisplayed()&&Locator1.Action().isDisplayed()&&Locator1.RemarkStatusLog().isDisplayed()&&Locator1.FileName().isDisplayed()&&Locator1.CreatedBy().isDisplayed()&&Locator1.Role().isDisplayed()) {
	       			
	       			test.log(LogStatus.PASS, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be seen on the page of Status log Page");
	       		}else {
	       			
	       			test.log(LogStatus.FAIL, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be not seen on on the page of Status log Page");
	       			
	       		}

		
		Locator1.transactionLog().click();
		Thread.sleep(4000);
		
if(Locator1.transactionLogRemark().isDisplayed()&&Locator1.transactionLogCreatedBy().isDisplayed()&&Locator1.transactionLogCreatedon().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Remark column, Created By Column and Created On Column should be seen on the page of transaction log Page");
		}else {
			
			test.log(LogStatus.FAIL, "Remark column, Created By Column and Created On Column should be not seen on the page of transaction log Page");
			
		}

  //      Locator1.statusLog().click();
 
        
        
	}
	
	
	
	
	public static void DownloadDocumentOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(20000);
		
		 JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(4000);
	        
	 //       Locator1.LastPaging().click();
	//		Thread.sleep(5000);
			
	//		Locator1.FirstLeftPaging().click();
	//		Thread.sleep(5000);
		       
	//		Locator1.FirstLeftPaging().click();
		//	Thread.sleep(5000);	   
			
		//	Locator1.FirstLeftPaging().click();
		//	Thread.sleep(5000);	       

		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(3000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(9000);    
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator1.DownloadDocument().click();
		
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
		
		
		
	}
	
	
	
	public static void ViewOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(20000);
		
		 JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(4000);
	        
	 //       Locator1.LastPaging().click();
	//		Thread.sleep(5000);
			
	//		Locator1.FirstLeftPaging().click();
	//		Thread.sleep(5000);
		       
	//		Locator1.FirstLeftPaging().click();
		//	Thread.sleep(5000);	   
			
		//	Locator1.FirstLeftPaging().click();
		//	Thread.sleep(5000);	       

		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(3000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(9000);    
		
		
		if(Locator1.ViewButtonofOverdue().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ViewButtonofOverdue().click();
			test.log(LogStatus.PASS, " View Compliance Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Compliance Button Does Not Working Properly "  );
			
		}
		
		
		
		
	}
	
	
	public static void ComentOverdue1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(20000);
		
		 JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(4000);
	        
	//        Locator1.LastPaging().click();
	//		Thread.sleep(5000);
			
	//		Locator1.FirstLeftPaging().click();
	//		Thread.sleep(5000);
		       
	//		Locator1.FirstLeftPaging().click();
	//		Thread.sleep(5000);
		       
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(9000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		 Locator1.CommentButtonoverdue().click();
		 Thread.sleep(2000);
		 
		    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(12);
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
		
		Thread.sleep(2000);
		
//		Method2.SwitchToNewlyOpenedWindowClose(test, workbook);
	//	Thread.sleep(2000);
	
		
	}
	
	
	
	
	
	
	
	
	public static void RejectedAndGridCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator1.Rejected().getText());	//Reading Dashboard count.
        Locator1.Rejected().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(2000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

		String item = Locator1.RejectedGridCount().getText();
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
		
		
		
		
        Thread.sleep(4000);
        
        /*
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
	    
	    
	    if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
	    */
        
		Method1.RejectedAuditExcelCountGridCount1(test,workbook);

	    Thread.sleep(4000);
	    
	    Locator1.ClearButtonStateRejected().click();
		Thread.sleep(3000);
		Locator1.ClearButtonStateDDRejected().click();
		Thread.sleep(3000);
		
		if(Locator1.UpcomingCleartButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingCleartButton().click();
			test.log(LogStatus.PASS, "  Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
	    
		
	}
	
	
	
	
	
	public static void RejectedDownloadAndViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Rejected().click();
		Thread.sleep(20000);
		
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(9000);
		// Locator1.UpcomingDownloadAndViewButton().click();
		// Thread.sleep(2000);
		 
		    if(Locator1.UpcomingDownloadAndViewButton().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator1.UpcomingDownloadAndViewButton().click();
			test.log(LogStatus.PASS, " Document Viewed Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Document Viewed Successfully "  );
			
		}
		
		    Thread.sleep(9000);
		  
		   
		    
		    
		    
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ViewRejected( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Rejected().click();
		Thread.sleep(20000);
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(10000);
		
		
		if(Locator1.ViewRejected().isEnabled())
		{
			
			Thread.sleep(3000);
		    Locator1.ViewRejected().click();
			test.log(LogStatus.PASS, " View Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Does Not Working Properly "  );
			
		}
		
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	public static void ComentRejected( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Rejected().click();
		Thread.sleep(20000);
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(2000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
        
		
		 Locator1.CommentButtonoverdue().click();
		 Thread.sleep(2000);
		 
		    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(12);
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
		
		Thread.sleep(2000);
	
		
	}
	
	
	public static void RejectedAuditLog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.Rejected().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
if(Locator1.transactionLog().isDisplayed()&&Locator1.statusLog().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Transaction log tab and status log tab should be seen in the Audit log popup");
		}else {
			
			test.log(LogStatus.FAIL, "Transaction log tab and status log tab should be not seen in the Audit log popup");
			
		}

		
		
	}

	
	public static void Rejectedtransactionandstatuslog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.Rejected().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
	       Thread.sleep(4000);
			
	       if(Locator1.CreatedOn().isDisplayed()&&Locator1.Action().isDisplayed()&&Locator1.RemarkStatusLog().isDisplayed()&&Locator1.FileName().isDisplayed()&&Locator1.CreatedBy().isDisplayed()&&Locator1.Role().isDisplayed()) {
	       			
	       			test.log(LogStatus.PASS, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be seen on the page of Status log Page");
	       		}else {
	       			
	       			test.log(LogStatus.FAIL, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be not seen on on the page of Status log Page");
	       			
	       		}

		Locator1.transactionLog().click();
		Thread.sleep(4000);
		
if(Locator1.transactionLogRemark().isDisplayed()&&Locator1.transactionLogCreatedBy().isDisplayed()&&Locator1.transactionLogCreatedon().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Remark column, Created By Column and Created On Column should be seen on the page of transaction log Page");
		}else {
			
			test.log(LogStatus.FAIL, "Remark column, Created By Column and Created On Column should be not seen on the page of transaction log Page");
			
		}

   //     Locator1.statusLog().click();
 
        
        
	}
	
	
	public static void RejectedSubmitForAuditorButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		int open = Integer.parseInt(Locator1.Rejected().getText());	//Reading Dashboard count.
        Locator1.Rejected().click();					                //Clicking on Dashboard count

        Thread.sleep(7000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        
        Locator1.SubmitForAuditor().click();	
        Thread.sleep(2000);
        
		 Alert ac3=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t4 );
			
			Thread.sleep(4000);
			ac3.accept();
			
			Thread.sleep(4000);
			
			 Locator1.SubmitForAuditorClose().click();	
		        Thread.sleep(2000);
		        
		        Locator1.Dashboard1().click();	
		        Thread.sleep(7000);
		         
		        int count1 = Integer.parseInt(Locator1.Rejected().getText());	//Reading Dashboard count.
		        Locator1.Rejected().click();

/*
		String item = Locator1.RejectedGridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
*/
		
		
		if(open != count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Before Rejected Count = "+open+" | After Rejected Count = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Before Rejected Count = "+open+" | Before Rejected Count = "+count1);
					
		}
	
		
	//	Locator1.UpcomingEditButton().click();
	//	Thread.sleep(4000);
		
		

	}
	
	
	public static void UpdateRejected( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator1.Rejected().click();
		Thread.sleep(20000);
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(2000);
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.EditSelectFileRejected().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Thread.sleep(20000);
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
			Locator1.EditViewRejected().click();
			Thread.sleep(4000);
			
			Locator1.ComplianceStatusRejected().click();
			Thread.sleep(4000);
			
			Locator1.ComplianceStatusDDRejected().click();
			Thread.sleep(4000);
			
			Locator1.SaveEdit().click();
			
			Thread.sleep(20000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t4 );
				
				Thread.sleep(4000);
				ac3.accept();
				
				Thread.sleep(4000);
	}
	
	
	
	
	
	public static void PendingForReviewCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator1.PendingRewiew().getText());	//Reading Dashboard count.
        Locator1.PendingRewiew().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(2000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

		String item = Locator1.PendingRewiewGridCount().getText();
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
		
        Thread.sleep(4000);
		
        /*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
	    
	    
	    if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
		*/
        
		Method1.PendingReviewAuditExcelCountGridCount1(test,workbook);

	    Thread.sleep(4000);
	    
	    Locator1.ClearButtonStateRejected().click();
		Thread.sleep(3000);
		Locator1.ClearButtonStateDDRejected().click();
		Thread.sleep(3000);
		
		if(Locator1.UpcomingCleartButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingCleartButton().click();
			test.log(LogStatus.PASS, "  Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
	    
		

		
		
	}
	
	
	public static void PendingReviewAuditExcelCountGridCount1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(20000);
		
        Locator1.Upcoming().click();					                //Clicking on Dashboard count
        Thread.sleep(20000);
        
       
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       
/
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
 		
		Thread.sleep(2000);
 	//	Locator.ExportButtonCT().click();
	//	Thread.sleep(9000);
		
		if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
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
	
	
	
	
	
	
	
	public static void PendingReviewDownloadAndViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.PendingRewiew().click();
		Thread.sleep(20000);
		
		
		Locator1.PendingReviewEdit().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(6000);
		
        
		
		    if(Locator1.UpcomingDownloadAndViewButton().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator1.UpcomingDownloadAndViewButton().click();
			test.log(LogStatus.PASS, " Document Viewed Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Document Viewed Successfully "  );
			
		}
		
		    Thread.sleep(9000);
		  
		   
		    
		    
		    
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
		
	public static void ViewPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.PendingRewiew().click();
		Thread.sleep(20000);
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		if(Locator1.ViewButtonPendingForReview().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ViewButtonPendingForReview().click();
			test.log(LogStatus.PASS, " View Compliance Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Compliance Button Does Not Working Properly "  );
			
		}
		
		Thread.sleep(2000);
		
		
	}
	
	
	
	
	public static void ComentPendingRewiew( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(10000);
		Locator1.PendingRewiew().click();
		Thread.sleep(20000);
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(2000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
        
		
		 Locator1.CommentButtonoverdue().click();
		 Thread.sleep(2000);
		 
		    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(12);
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
		
		Thread.sleep(2000);
	
		
	}
		
		
	public static void PendingReviewAuditLog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.PendingRewiew().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
if(Locator1.transactionLog().isDisplayed()&&Locator1.statusLog().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Transaction log tab and status log tab should be seen in the Audit log popup");
		}else {
			
			test.log(LogStatus.FAIL, "Transaction log tab and status log tab should be not seen in the Audit log popup");
			
		}

		
		
	}

	
	public static void PendingRewiewtransactionandstatuslog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.PendingRewiew().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
	       Thread.sleep(4000);
			
	       if(Locator1.CreatedOn().isDisplayed()&&Locator1.Action().isDisplayed()&&Locator1.RemarkStatusLog().isDisplayed()&&Locator1.FileName().isDisplayed()&&Locator1.CreatedBy().isDisplayed()&&Locator1.Role().isDisplayed()) {
	       			
	       			test.log(LogStatus.PASS, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be seen on the page of Status log Page");
	       		}else {
	       			
	       			test.log(LogStatus.FAIL, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be not seen on on the page of Status log Page");
	       			
	       		}


		Locator1.transactionLog().click();
		Thread.sleep(4000);
		
if(Locator1.transactionLogRemark().isDisplayed()&&Locator1.transactionLogCreatedBy().isDisplayed()&&Locator1.transactionLogCreatedon().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Remark column, Created By Column and Created On Column should be seen on the page of transaction log Page");
		}else {
			
			test.log(LogStatus.FAIL, "Remark column, Created By Column and Created On Column should be not seen on the page of transaction log Page");
			
		}

	}
   //     Locator1.statusLog().click();
 	
	
	public static void updatePending( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.PendingRewiew().click();
		Thread.sleep(20000);
		
		Locator1.EditPendingReview().click();
		Thread.sleep(20000);
		
		
		if(Locator1.EditPendingReview().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.EditPendingReview().click();
			test.log(LogStatus.PASS, "  Edit Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Edit Button Is Clickable  "  );
			
		}
		
		
		
		
	}
	
	
	
	
	public static void CountmatchClose( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		int open = Integer.parseInt(Locator1.CountMatchClose().getText());	//Reading Dashboard count.
        Locator1.CountMatchClose().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(2000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

		String item = Locator1.GridCountClose().getText();
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
		
		
      Thread.sleep(4000);
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
	    
	    
	    if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
	    */
      
      Method1.ClosedAuditExcelCountGridCount1(test,workbook);
	  Thread.sleep(4000);
	    
	    Locator1.ClearButtonStateRejected().click();
		Thread.sleep(3000);
		Locator1.ClearButtonStateDDRejected().click();
		Thread.sleep(3000);
		
		if(Locator1.UpcomingCleartButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingCleartButton().click();
			test.log(LogStatus.PASS, "  Clear Button Working Properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
	    
		

		
	}
	

	
	
	public static void ClosedAuditExcelCountGridCount1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(20000);
		
        Locator1.Upcoming().click();					                //Clicking on Dashboard count
        Thread.sleep(20000);
        
       
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       
/
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
 		
		
 	//	Locator.ExportButtonCT().click();
	//	Thread.sleep(9000);
		/*
		if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
		*/
		Thread.sleep(2000);
		
        File dir9 = new File("C:\\Users\\shitalb\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.UpcomingExport().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\shitalb\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " File Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, "  File Does Not Download Successfully "   );

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
	 
	 Thread.sleep(2000);
     
	    
	}
	
	
	
	
	
	
	public static void ClosedDownloadAndViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.CountMatchClose().click();
		Thread.sleep(20000);
		
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(6000);
		
        
		
		// Locator1.UpcomingDownloadAndViewButton().click();
		// Thread.sleep(2000);
		 
		    if(Locator1.ClosedDownloadAndView().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator1.ClosedDownloadAndView().click();
			test.log(LogStatus.PASS, " Document Viewed Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Document Viewed Successfully "  );
			
		}
		
		    Thread.sleep(9000);
		  
		   
		    
		    
		    
		
	
	
	}
	
	
	
	public static void DownloadClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.CountMatchClose().click();
		Thread.sleep(20000);
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator2.Downloadupcoming().click();
		
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
	
	
	
	
	public static void ViewClose( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.CountMatchClose().click();
		Thread.sleep(20000);
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		if(Locator1.ClosedView().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClosedView().click();
			test.log(LogStatus.PASS, " View Button Working Properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Does Not Working Properly "  );
			
		}
		
		Thread.sleep(2000);
		
		
	}
	
	
	
	
	public static void ComentClose( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.CountMatchClose().click();
		Thread.sleep(20000);
		
		Locator1.EditButtonRejected().click();
		Thread.sleep(2000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
        
		
		 Locator1.CommentButtonoverdue().click();
		 Thread.sleep(2000);
		 
		    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(12);
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
		
		Thread.sleep(2000);
	
		
	}
		
		
		
	public static void ClosedAuditLog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.CountMatchClose().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
if(Locator1.transactionLog().isDisplayed()&&Locator1.statusLog().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Transaction log tab and status log tab should be seen in the Audit log popup");
		}else {
			
			test.log(LogStatus.FAIL, "Transaction log tab and status log tab should be not seen in the Audit log popup");
			
		}

		
		
	}

	
	public static void Closedtransactionandstatuslog( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUpcomingCount"))); 
		Thread.sleep(4000);
		
		Locator1.CountMatchClose().click();
		Thread.sleep(2000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Locator1.AuditLog().click();
		Thread.sleep(4000);
		
	       Thread.sleep(4000);
			
	       if(Locator1.CreatedOn().isDisplayed()&&Locator1.Action().isDisplayed()&&Locator1.RemarkStatusLog().isDisplayed()&&Locator1.FileName().isDisplayed()&&Locator1.CreatedBy().isDisplayed()&&Locator1.Role().isDisplayed()) {
	       			
	       			test.log(LogStatus.PASS, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be seen on the page of Status log Page");
	       		}else {
	       			
	       			test.log(LogStatus.FAIL, "Created on column, Action column, Remark Column, File Name Column, Created By Column and Role Column should be not seen on on the page of Status log Page");
	       			
	       		}

		
		Locator1.transactionLog().click();
		Thread.sleep(4000);
		
if(Locator1.transactionLogRemark().isDisplayed()&&Locator1.transactionLogCreatedBy().isDisplayed()&&Locator1.transactionLogCreatedon().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Remark column, Created By Column and Created On Column should be seen on the page of transaction log Page");
		}else {
			
			test.log(LogStatus.FAIL, "Remark column, Created By Column and Created On Column should be not seen on the page of transaction log Page");
			
		}

    //    Locator1.statusLog().click();
 
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ExportButtonCloses( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.CountMatchClose().click();
		Thread.sleep(6000);
		/*
		if(Locator1.ExportButtonClose().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.ExportButtonClose().click();
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
	     Locator1.ExportButtonClose().click();
		
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
	
	
	public static void ClearButtonClose( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.CountMatchClose().click();
		Thread.sleep(20000);
		
		Locator1.ClearButtonStateRejected().click();
		Thread.sleep(3000);
		Locator1.ClearButtonStateDDRejected().click();
		Thread.sleep(3000);
		
		
		if(Locator1.ClearButtonPending().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.ClearButtonPending().click();
			test.log(LogStatus.PASS, "  Clear Button Working Properly  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly  "  );
			
		}
		
	}
	
	public static void UpdateClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.CountMatchClose().click();
		Thread.sleep(20000);
		
		Locator1.EditClosed().click();
		Thread.sleep(4000);
		
		if(Locator1.EditClosed().isEnabled())
		{
			
			Thread.sleep(4000);
		 Locator1.EditClosed().click();
			test.log(LogStatus.PASS, "  Edit  Button Is Clickable  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Edit Button Is Clickable  "  );
			
		}
	
		
		
	}
	
	public static void ClearButtonDocument( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Document().click();
		Thread.sleep(20000);
		
		Locator1.SelectLocationDocument().click();
		Thread.sleep(2000);
	//	Locator1.SelectLocationDocumentDrop().click();
	//	Thread.sleep(2000);
		Locator1.SelectLocationDocumentDD().click();
		Thread.sleep(2000);
		
		if(Locator1.DocumentClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.DocumentClearButton().click();
			test.log(LogStatus.PASS, "  Clear Button Working Properly  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does not working properly  "  );
			
		}
		
		
		
		
		
	}
	
	
	public static void ViewPendingForReviewView( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Workspace().click();
		Thread.sleep(20000);
	
		
		Locator1.StatusWPendingR().click();
		Thread.sleep(20000);
		
		Locator1.StatusWPendingRDD().click();
		Thread.sleep(20000);
		
		Locator1.EditPendingReview().click();
		Thread.sleep(20000);
		
	//String t1 = Locator1.ViewPendingR().getText();
		//Thread.sleep(2000);
		
		if(Locator1.ViewPendingR().isEnabled())
		{
			
			Thread.sleep(6000);
		 Locator1.ViewPendingR().click();
			test.log(LogStatus.PASS, "  View Button Working Properly  ");
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Does not working properly  "  );
			
		}
		
		
			
		
		
		
	}
	
	
	
	public static void CommentPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.PendingRewiew().click();
		Thread.sleep(20000);
		
		
		
		if(Locator1.CommentPendingForReview().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.CommentPendingForReview().click();
			test.log(LogStatus.PASS, "  Comment  Button Is Clickable  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Comment Button Is Clickable  "  );
			
		}
		
	}
	
	
	
	public static void ViewButtonDocuments( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Document().click();
		Thread.sleep(20000);
		
		
		if(Locator1.ViewDocument().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.ViewDocument().click();
			test.log(LogStatus.PASS, "  View Button Working Properly  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Does not working properly "  );
			
		}
		
		
		
		
	}
	
	
	public static void DownloadDocument( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Document().click();
		Thread.sleep(20000);
		
		Locator1.DocumentCheckBox().click();
		
		Thread.sleep(6000);
		
       
		/*
		if(Locator1.DocumentDownload().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.DocumentDownload().click();
			test.log(LogStatus.PASS, "  File Download Sucessfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Sucessfully  "  );
			
		}
		*/
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator1.DocumentDownload1().click();
		
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
	
	public static void DownloadMultipleDocument( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Document().click();
		Thread.sleep(20000);
		
		Locator1.DocumentCheckBox().click();
		Thread.sleep(6000);
		
		Locator1.DocumentCheckBox2().click();
		Thread.sleep(6000);
		Locator1.DocumentCheckBox3().click();
		Thread.sleep(6000);
		/*
		if(Locator1.DocumentDownload().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.DocumentDownload().click();
			test.log(LogStatus.PASS, "  File Download Sucessfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Sucessfully  "  );
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator1.DocumentDownload().click();
		
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
	
	
	
	public static void ExportReportReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator1.ReportButton().click();
		Thread.sleep(20000);
		/*
		if(Locator1.ReportExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.ReportExportButton().click();
			test.log(LogStatus.PASS, "  File Download Sucessfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Sucessfully  "  );
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator1.ReportExportButton().click();
		
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
	
	
	public static void MoreReportDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.ReportButton().click();
		Thread.sleep(20000);
		
		Locator1.MoreReportReport().click();
		Thread.sleep(6000);
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator1.ClosedAuditReportMRR().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(10000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Closed Audit Report Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Closed Audit Report Download Successfully");
		}		

	Thread.sleep(2000);
	
		/*
		if(Locator1.ClosedAuditReportMRR().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.ClosedAuditReportMRR().click();
			test.log(LogStatus.PASS, " Closed Audit Report Download Sucessfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Closed Audit Report Download Sucessfully  "  );
			
		}
		*/
		
		Thread.sleep(7000);
		Locator.SelectMonth().click();
		Thread.sleep(2000);
		
		Locator.SelectMonthDD().click();
		Thread.sleep(2000);
		/*
		if(Locator.MouthCloseReportR().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.MouthCloseReportR().click();
			test.log(LogStatus.PASS, "Month Wise Closed Audit Report File Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Month Wise Closed Audit Report File Download Successfully"  );
			
		}
		*/
		
		File dir = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator.MouthCloseReportR().click();
		
	 	Thread.sleep(18000);
		File dir1 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(10000);
	   if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "Month Wise Closed Audit Report File Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Month Wise Closed Audit Report File Download Successfully");
		}		

	
		Thread.sleep(7000);
		
		/*
		Locator1.MonthReportMRR().click();
		Thread.sleep(000);
		
		Thread.sleep(20000);
		 Alert ac3=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Month Wise Close Audit Report" +  t4 );
			
			Thread.sleep(4000);
			ac3.accept();
			*/
			Thread.sleep(4000);
		
			File dira = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContentsa = dira.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(9000);
		     Locator1.ComplianceRemarkReport().click();
			
		 	Thread.sleep(18000);
			File dirb = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNewb = dirb.listFiles();						//Counting number of files in directory after download
			
		   
	        Thread.sleep(10000);
		   if (dirContentsa.length < allFilesNewb.length) {
				test.log(LogStatus.PASS,  "Compliance Remark Report File Download Successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "Compliance Remark Report File Download Successfully");
			}		


		/*
		if(Locator1.ComplianceRemarkReport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.ComplianceRemarkReport().click();
			test.log(LogStatus.PASS, " Compliance Remark Report File Download Sucessfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Compliance Remark Report File Download Sucessfully  "  );
			
		}
		*/
		Thread.sleep(9000);
		
		File dirc = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContentsc = dirc.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator1.AuditReport().click();
		
	 	Thread.sleep(18000);
		File dird = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNewd = dird.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(10000);
	   if (dirContentsc.length < allFilesNewd.length) {
			test.log(LogStatus.PASS,  "Audit Report Download Sucessfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Audit Report Download Sucessfully");
		}		

		/*
		if(Locator1.AuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.AuditReport().click();
			test.log(LogStatus.PASS, " Audit Report File Download Sucessfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Audit Report File Download Sucessfully  "  );
			
		}
		*/
		Thread.sleep(4000);

		/*
		Thread.sleep(20000);
		 Alert ac4=getDriver().switchTo().alert();
			
			String t5=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  " Audit Report" + t5 );
			
			Thread.sleep(4000);
			ac4.accept();
			
			Thread.sleep(4000);
		
		*/
		
		
	}
	
	
	public static void ClearButtonReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.ReportButton().click();
		Thread.sleep(20000);
		
		Locator1.StatusWPendingR().click();
		Thread.sleep(6000);
		
		Locator1.StateDDReport().click();
		Thread.sleep(6000);
		
		Locator1.StatusWPendingR().click();
		Thread.sleep(6000);
	
		
		if(Locator1.ClearButtonReport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.ClearButtonReport().click();
			test.log(LogStatus.PASS, "  Clear button working properly  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does not working properly  "  );
			
		}
		Thread.sleep(2000);
		
	}
	
	
	
	public static void GraphCountMatchGrid( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
			
        JavascriptExecutor jss = (JavascriptExecutor) getDriver();
        
        jss.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);
		
		Locator1.UpcomingGreenGraph().click();
		Thread.sleep(18000);
		
		
		int open = Integer.parseInt(Locator1.UpcomingYelloGraph().getText());	//Reading Dashboard count.
        Locator1.UpcomingYelloGraph().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(2000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       

		String item = Locator1.UpcomingYelloGraphGrid().getText();
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
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void GraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator1.GreenGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator1.RedGraph().getText());	//Reading Dashboard count.
	    Locator1.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator1.RedGraphGrid().getText();
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
		
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonRedGraphGrid().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does not working properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator1.ViewRedButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ViewRedButton().click();
			test.log(LogStatus.PASS, "  View Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Does not Working properly"  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method1.YellowGraphDashboardGridCount(test, workbook);
		Thread.sleep(4000);
		
		
		Method1.GreenInGreenGraph(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
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
		
		int open = Integer.parseInt(Locator1.YellowGraph().getText());	//Reading Dashboard count.
	    Locator1.YellowGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.YellowGraphGrid().getText();
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
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear Button Does not working properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator1.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.YellowGraphViewButton().click();
				test.log(LogStatus.PASS, "  Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);
		
		
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
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
		
		int open = Integer.parseInt(Locator1.GreenGraphinGreen().getText());	//Reading Dashboard count.
	    Locator1.GreenGraphinGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.GreenGraphinGreenGrid().getText();
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
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator1.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	//SWS Not Complied
	
	
	public static void RedInGreenGraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		int open = Integer.parseInt(Locator2.RedGraph2Green().getText());	//Reading Dashboard count.
	    Locator2.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
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
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
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
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
		Thread.sleep(2000);
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
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
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
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
		
		
		if(Locator2.RedGraphInYellowClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.RedGraphInYellowClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		

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
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
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
						
		test.log(LogStatus.PASS, "High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
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
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear Button Working Properly "  );
			
		}
		
		
		
		
		
        Thread.sleep(2000);
		
		if(Locator2.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		Method2.RedInYellowCountMatch(test, workbook);
		
		Thread.sleep(4000);
		
		Method2.RedInGreenGraphCountMatch(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
	}
	
	
	
	
	// SWS Not Applicable
	
	
	
	
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
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
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
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
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
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.ViewGreyInGreen().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator2.ViewGreyInGreen().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
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
		
		int open = Integer.parseInt(Locator2.GreyInGreenGraph().getText());	//Reading Dashboard count.
	    Locator2.GreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
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
						
		test.log(LogStatus.PASS, " Medium Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Medium Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
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
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInYellowViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInYellowViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
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
		Thread.sleep(9000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator2.GreyInRed().getText());	//Reading Dashboard count.
	    Locator2.GreyInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
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
						
		test.log(LogStatus.PASS, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
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
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator2.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator2.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
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
	
	
	
	
	//SWS Audit Complition Status
	
	
	
	public static void AuditCompletionStatusRed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(9000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator2.ACSREDGraph().getText());	//Reading Dashboard count.
	    Locator2.ACSREDGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
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
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
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
		
		Thread.sleep(2000);
		
		Method2.AuditCompletionStatusGreenGraph(test, workbook);
			
		Thread.sleep(2000);
		
	}
	
	
	
	
	public static void AuditCompletionStatusBlueGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(9000);
		
		/*
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(5000);
		
		*/
		
		int open = Integer.parseInt(Locator2.ACSBlueGraph().getText());	//Reading Dashboard count.
	    Locator2.ACSBlueGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
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
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
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
		Thread.sleep(9000);
		
		/*
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator1.ACSGreenGraph().getText());	//Reading Dashboard count.
	    Locator1.ACSGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
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
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.ACSGreenGraphGreedClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ACSGreenGraphGreedClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		if(Locator1.ACSGreenGraphGreedExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ACSGreenGraphGreedExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	
	// PWS J K Hills Project Complied Graph
	
	
	
	public static void PWSCompliedJKHills( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(2000);
			
			/*
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,750)");
		    Thread.sleep(5000);
			*/
		   
	//		Locator1.NotCompliedCircle().click();
	//		Thread.sleep(3000);
		    
	//	    Locator1.NotApplicableCircle().click();
	//	    Thread.sleep(3000);
			
		    
		   Locator1.PWSCompliedJKHills().click();
		   
		   Thread.sleep(3000);
			
			int open = Integer.parseInt(Locator1.PWSCompliedJKHillsHigh().getText());	//Reading Dashboard count.
		    Locator1.PWSCompliedJKHillsHigh().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator2.Frame());
		    Thread.sleep(5000);
		    
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(9000);
		    
		    
		 //   scrollToBottom();
		    
		    
		   

			String item = Locator1.PWSCompliedGraphHighGrid().getText();
			String[] bits = item.split(" ");								//Splitting the String
			String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
			int count1 = Integer.parseInt(compliancesCount);

			
			
			if(open == count1)
						
			{
							
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
							
			test.log(LogStatus.PASS, " High -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
						
			else
						
			{
							
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
							
			test.log(LogStatus.FAIL, " High - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
			
			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
			
			if(Locator1.PWSCompliedGraphHighGridViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.PWSCompliedGraphHighGridViewButton().click();
				test.log(LogStatus.PASS, " Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
			
			Method1.PWSCompliedJKHillsMedium(test, workbook);
			
			Thread.sleep(2000);
			
			Method1.PWSCompliedJKHillsLow(test, workbook);
				
			Thread.sleep(2000);
			
		
		
		
			
				
		
		
	}
	
	
	
	
	public static void PWSCompliedJKHillsMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			/*
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,750)");
		    Thread.sleep(5000);
			
			
		    
		   Locator1.PWSCompliedJKHills().click();
		   
		   Thread.sleep(3000);
		   
		   */
			
			int open = Integer.parseInt(Locator1.PWSCompliedJKHillsmedium().getText());	//Reading Dashboard count.
		    Locator1.PWSCompliedJKHillsmedium().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(9000);
		    
		    
		 //   scrollToBottom();
		    
		    
		   

			String item = Locator1.PWSCompliedGraphHighGrid().getText();
			String[] bits = item.split(" ");								//Splitting the String
			String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
			int count1 = Integer.parseInt(compliancesCount);

			
			
			if(open == count1)
						
			{
							
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
							
			test.log(LogStatus.PASS, " Medium -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
						
			else
						
			{
							
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
							
			test.log(LogStatus.FAIL, " Medium - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
			
			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
			
			if(Locator1.PWSCompliedGraphHighGridViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.PWSCompliedGraphHighGridViewButton().click();
				test.log(LogStatus.PASS, " Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
	}

	
	
	
	public static void PWSCompliedJKHillsLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			/*
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,750)");
		    Thread.sleep(5000);
			
			
		    
		   Locator1.PWSCompliedJKHills().click();
		   
		   Thread.sleep(3000);
		   
		   */
			
			int open = Integer.parseInt(Locator1.PWSCompliedJKHillsLow().getText());	//Reading Dashboard count.
		    Locator1.PWSCompliedJKHillsLow().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(9000);
		    
		    
		 //   scrollToBottom();
		    
		    
		   

			String item = Locator1.PWSCompliedGraphHighGrid().getText();
			String[] bits = item.split(" ");								//Splitting the String
			String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
			int count1 = Integer.parseInt(compliancesCount);

			
			
			if(open == count1)
						
			{
							
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
							
			test.log(LogStatus.PASS, " Low -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
						
			else
						
			{
							
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
							
			test.log(LogStatus.FAIL, " Low - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
			
			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
			
			if(Locator1.PWSCompliedGraphHighGridViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.PWSCompliedGraphHighGridViewButton().click();
				test.log(LogStatus.PASS, " Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
	}

	
	
	//Not Complied
	
	
	
	
	public static void PWSNotCompliedJKHills( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(2000);
			/*
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,750)");
		    Thread.sleep(5000);
		    */
			
	//	   Locator1.CompliedCircle().click();
		//   Thread.sleep(3000);
		    
		//	Locator1.NotCompliedCircle().click();
		//	Thread.sleep(3000);
		    
	//	    Locator1.NotApplicableCircle().click();
		//    Thread.sleep(3000);
			
		    
		   Locator1.PWSCompliedJKHills().click();
		   
		   Thread.sleep(3000);
			
			int open = Integer.parseInt(Locator1.PWSNotCompliedJKHillsHigh().getText());	//Reading Dashboard count.
		    Locator1.PWSNotCompliedJKHillsHigh().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator2.Frame());
		    Thread.sleep(5000);
		    
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(9000);
		    
		    
		 //   scrollToBottom();
		    
		    
		   

			String item = Locator1.PWSCompliedGraphHighGrid().getText();
			String[] bits = item.split(" ");								//Splitting the String
			String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
			int count1 = Integer.parseInt(compliancesCount);

			
			
			if(open == count1)
						
			{
							
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
							
			test.log(LogStatus.PASS, " High -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
						
			else
						
			{
							
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
							
			test.log(LogStatus.FAIL, " High - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
			
			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
			
			if(Locator1.PWSCompliedGraphHighGridViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.PWSCompliedGraphHighGridViewButton().click();
				test.log(LogStatus.PASS, " Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
			
			Method1.PWSNotCompliedJKHillsMedium(test, workbook);
			
			Thread.sleep(2000);
			
			Method1.PWSNotCompliedJKHillsLow(test, workbook);
				
		Thread.sleep(2000);
			
		
		
		
			
				
		
		
	}
	
	
	
	
	public static void PWSNotCompliedJKHillsMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			
			
			int open = Integer.parseInt(Locator1.PWSNotCompliedJKHillsMedium().getText());	//Reading Dashboard count.
		    Locator1.PWSNotCompliedJKHillsMedium().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(9000);
		    
		    
		 //   scrollToBottom();
		    
		    
		   

			String item = Locator1.PWSCompliedGraphHighGrid().getText();
			String[] bits = item.split(" ");								//Splitting the String
			String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
			int count1 = Integer.parseInt(compliancesCount);

			
			
			if(open == count1)
						
			{
							
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
							
			test.log(LogStatus.PASS, " Medium -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
						
			else
						
			{
							
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
							
			test.log(LogStatus.FAIL, " Medium - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
			
			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
			
			if(Locator1.PWSCompliedGraphHighGridViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.PWSCompliedGraphHighGridViewButton().click();
				test.log(LogStatus.PASS, " Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
	}

	
	
	
	public static void PWSNotCompliedJKHillsLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			
			int open = Integer.parseInt(Locator1.PWSNotCompliedJKHillsLow().getText());	//Reading Dashboard count.
		    Locator1.PWSNotCompliedJKHillsLow().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(9000);
		    
		    
		 //   scrollToBottom();
		    
		    
		   

			String item = Locator1.PWSCompliedGraphHighGrid().getText();
			String[] bits = item.split(" ");								//Splitting the String
			String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
			int count1 = Integer.parseInt(compliancesCount);

			
			
			if(open == count1)
						
			{
							
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
							
			test.log(LogStatus.PASS, " Low -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
						
			else
						
			{
							
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
							
			test.log(LogStatus.FAIL, " Low - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
			
			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
			
			if(Locator1.PWSCompliedGraphHighGridViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.PWSCompliedGraphHighGridViewButton().click();
				test.log(LogStatus.PASS, " Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
	}

	
	//Not Applicable
	
	
	
	
	
	public static void PWSNotApplicableJKHillHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(2000);
			/*
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,750)");
		    Thread.sleep(5000);
			*/
			
		//   Locator1.CompliedCircle().click();
		//   Thread.sleep(3000);
		    
		//	Locator1.NotCompliedCircle().click();
		//	Thread.sleep(3000);
		    
		 //   Locator1.NotApplicableCircle().click();
		 //   Thread.sleep(3000);
			
		    
		   Locator1.PWSCompliedJKHills().click();
		   
		   Thread.sleep(3000);
			
			int open = Integer.parseInt(Locator1.PWSNotApplicableJKHillHigh().getText());	//Reading Dashboard count.
		    Locator1.PWSNotApplicableJKHillHigh().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator2.Frame());
		    Thread.sleep(5000);
		    
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(9000);
		    
		    
		 //   scrollToBottom();
		    
		    
		   

			String item = Locator1.PWSCompliedGraphHighGrid().getText();
			String[] bits = item.split(" ");								//Splitting the String
			String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
			int count1 = Integer.parseInt(compliancesCount);

			
			
			if(open == count1)
						
			{
							
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
							
			test.log(LogStatus.PASS, " High -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
						
			else
						
			{
							
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
							
			test.log(LogStatus.FAIL, " High - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
			
			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
			
			if(Locator1.PWSCompliedGraphHighGridViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.PWSCompliedGraphHighGridViewButton().click();
				test.log(LogStatus.PASS, " Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
			
			Method1.PWSNotApplicableJKHillsMedium(test, workbook);
			
			Thread.sleep(2000);
			
			Method1.PWSNotApplicableJKHillsLow(test, workbook);
				
			Thread.sleep(2000);
			
		
		
		
			
				
		
		
	}
	
	
	
	public static void PWSNotApplicableJKHillsMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			/*
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,750)");
		    Thread.sleep(5000);
			
		   Locator1.CompliedCircle().click();
		   Thread.sleep(3000);
		    
			Locator1.NotCompliedCircle().click();
			Thread.sleep(3000);
		    
		 //   Locator1.NotApplicableCircle().click();
		 //   Thread.sleep(3000);
			
		    
		   Locator1.PWSNotCompliedJKHills().click();
		   
		   Thread.sleep(3000);
		   */
			
			int open = Integer.parseInt(Locator1.PWSNotApplicableJKHillsMedium().getText());	//Reading Dashboard count.
		    Locator1.PWSNotApplicableJKHillsMedium().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator2.Frame());
		    Thread.sleep(5000);
		    
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(9000);
		    
		    
		 //   scrollToBottom();
		    
		    
		   

			String item = Locator1.PWSCompliedGraphHighGrid().getText();
			String[] bits = item.split(" ");								//Splitting the String
			String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
			int count1 = Integer.parseInt(compliancesCount);

			
			
			if(open == count1)
						
			{
							
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
							
			test.log(LogStatus.PASS, " Medium -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
						
			else
						
			{
							
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
							
			test.log(LogStatus.FAIL, " Medium - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
			
			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
			
			if(Locator1.PWSCompliedGraphHighGridViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.PWSCompliedGraphHighGridViewButton().click();
				test.log(LogStatus.PASS, " Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
			
		
			
				
		
		
	}
	
	
	

	
	public static void PWSNotApplicableJKHillsLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			/*
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,750)");
		    Thread.sleep(5000);
			
		   Locator1.CompliedCircle().click();
		   Thread.sleep(3000);
		    
			Locator1.NotCompliedCircle().click();
			Thread.sleep(3000);
		    
		 //   Locator1.NotApplicableCircle().click();
		 //   Thread.sleep(3000);
			
		    
		   Locator1.PWSNotCompliedJKHills().click();
		   */
		   Thread.sleep(3000);
		   
			
			int open = Integer.parseInt(Locator1.PWSNotApplicableJKHillsLow().getText());	//Reading Dashboard count.
		    Locator1.PWSNotApplicableJKHillsLow().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator2.Frame());
		    Thread.sleep(5000);
		    
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(9000);
		    
		    
		 //   scrollToBottom();
		    
		    
		   

			String item = Locator1.PWSCompliedGraphHighGrid().getText();
			String[] bits = item.split(" ");								//Splitting the String
			String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
			int count1 = Integer.parseInt(compliancesCount);

			
			
			if(open == count1)
						
			{
							
			//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
							
			test.log(LogStatus.PASS, " Low -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
						
			else
						
			{
							
			//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
							
			test.log(LogStatus.FAIL, " Low - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
						
			}
			
			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
			
			if(Locator1.PWSCompliedGraphHighGridViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator2.PWSCompliedGraphHighGridViewButton().click();
				test.log(LogStatus.PASS, " Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
			
		
			
				
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// pie chart Complied Sub Contractor
	
	
	
	public static void SWSSubContractorCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			Thread.sleep(2000);
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,1270)");
		    Thread.sleep(4000);
			
			Locator1.SWSSubContractorGreenGraph().click();
			Thread.sleep(2000);
			
			int open = Integer.parseInt(Locator1.SWSSubContractorCompliedHigh().getText());	//Reading Dashboard count.
		    Locator1.SWSSubContractorCompliedHigh().click();					                //Clicking on Dashboard count

		    Thread.sleep(2000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			//Thread.sleep(500);	
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
				
			Thread.sleep(4000);
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,11000)");
		    Thread.sleep(18000);

			String item = Locator1.SWSSubContractorGreenInYelloGridGraph().getText();
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
			
			
			   Thread.sleep(5000);
		       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			    
			    js1.executeScript("window.scrollBy(0,-1000)");
			    Thread.sleep(2000);    
			
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.ClearButtonRedGraphGrid().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ClearButtonRedGraphGrid().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
	        Thread.sleep(2000);
			
			if(Locator1.ViewRedButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ViewRedButton().click();
				test.log(LogStatus.PASS, "  Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(4000);
			
			Method1.SWSSubContractorGraph(test, workbook);
			Thread.sleep(4000);
			
			Method1.SWSSubContractorGreenInGreenGraph(test, workbook);
			
			
			Thread.sleep(4000);
			
	}
			
			
			
	
	
	
	

	
	
	
	
	public static void SWSSubContractorGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			/*
			Thread.sleep(2000);
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,1270)");
		    Thread.sleep(4000);
			
			Locator1.SWSSubContractorGreenGraph().click();
			Thread.sleep(2000);
			*/
			int open = Integer.parseInt(Locator1.SWSSubContractorGreenInYelloGraph().getText());	//Reading Dashboard count.
		    Locator1.SWSSubContractorGreenInYelloGraph().click();					                //Clicking on Dashboard count

		    Thread.sleep(2000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			//Thread.sleep(500);	
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
				
			Thread.sleep(4000);
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,11000)");
		    Thread.sleep(18000);

			String item = Locator1.SWSSubContractorGreenInYelloGridGraph().getText();
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
			
			
			   Thread.sleep(5000);
		       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			    
			    js1.executeScript("window.scrollBy(0,-1000)");
			    Thread.sleep(2000);    
			
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.ClearButtonRedGraphGrid().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ClearButtonRedGraphGrid().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
	        Thread.sleep(2000);
			
			if(Locator1.ViewRedButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ViewRedButton().click();
				test.log(LogStatus.PASS, "  Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(4000);
			
	//		Method1.SWSSubContractorGreenInGreenGraph(test, workbook);
			
			
			Thread.sleep(4000);
			
	}
			
			
			
	
	
	
	
	
	public static void SWSSubContractorGreenInGreenGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator1.SWSSubContractorGreenIngreenGraph().getText());	//Reading Dashboard count.
	    Locator1.SWSSubContractorGreenIngreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.GreenGraphinGreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator1.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	//Not Complied
	
			
	public static void SWSSubContractorNotCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			Thread.sleep(2000);
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,1270)");
		    Thread.sleep(5000);
			
			Locator1.SWSSubContractorRedGraph().click();
			Thread.sleep(3000);
			
			int open = Integer.parseInt(Locator1.SWSSubContractorNotCompliedHigh().getText());	//Reading Dashboard count.
		    Locator1.SWSSubContractorNotCompliedHigh().click();					                //Clicking on Dashboard count

		    Thread.sleep(2000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			//Thread.sleep(500);	
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
				
			Thread.sleep(4000);
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,11000)");
		    Thread.sleep(9000);

			String item = Locator1.SWSSubContractorGreenInYelloGridGraph().getText();
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
			
			
			   Thread.sleep(5000);
		       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			    
			    js1.executeScript("window.scrollBy(0,-1000)");
			    Thread.sleep(2000);    
			
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.ClearButtonRedGraphGrid().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ClearButtonRedGraphGrid().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
	        Thread.sleep(2000);
			
			if(Locator1.ViewRedButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ViewRedButton().click();
				test.log(LogStatus.PASS, "  Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(4000);
			
			Method1.SWSSubContractorRedInYellowGraph(test, workbook);
			Thread.sleep(4000);
			
			Method1.SWSSubContractorRedInGreenGraph(test, workbook);
			
			
			Thread.sleep(4000);
			
	}
			
			
			

	
	
			
	public static void SWSSubContractorRedInYellowGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			/*
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			Thread.sleep(2000);
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,1270)");
		    Thread.sleep(5000);
			
			Locator1.SWSSubContractorRedGraph().click();
			Thread.sleep(3000);
			*/
			int open = Integer.parseInt(Locator1.SWSSubContractorRedInYellowGraph().getText());	//Reading Dashboard count.
		    Locator1.SWSSubContractorRedInYellowGraph().click();					                //Clicking on Dashboard count

		    Thread.sleep(2000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			//Thread.sleep(500);	
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
				
			Thread.sleep(4000);
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,11000)");
		    Thread.sleep(9000);

			String item = Locator1.SWSSubContractorGreenInYelloGridGraph().getText();
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
			
			
			   Thread.sleep(5000);
		       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			    
			    js1.executeScript("window.scrollBy(0,-1000)");
			    Thread.sleep(2000);    
			
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.ClearButtonRedGraphGrid().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ClearButtonRedGraphGrid().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
	        Thread.sleep(2000);
			
			if(Locator1.ViewRedButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ViewRedButton().click();
				test.log(LogStatus.PASS, "  Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(4000);
			
			
			
			
		//	Method1.SWSSubContractorRedInGreenGraph(test, workbook);
			
			
			Thread.sleep(4000);
			
	}
			
			
			
	
	
	
	
	
	public static void SWSSubContractorRedInGreenGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator1.SWSSubContractorRedIngreenGraph().getText());	//Reading Dashboard count.
	    Locator1.SWSSubContractorRedIngreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.GreenGraphinGreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator1.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
			
	
	
	
	
	
	public static void SWSSubContractorGreyinYellowGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			Thread.sleep(2000);
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,1270)");
		    Thread.sleep(4000);
			
			Locator1.SWSSubContractorGreyGraph().click();
			Thread.sleep(2000);
			
			int open = Integer.parseInt(Locator1.SWSSubContractorGreyInYellowGraph().getText());	//Reading Dashboard count.
		    Locator1.SWSSubContractorGreyInYellowGraph().click();					                //Clicking on Dashboard count

		    Thread.sleep(2000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			//Thread.sleep(500);	
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
				
			Thread.sleep(4000);
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    
		    js.executeScript("window.scrollBy(0,11000)");
		    Thread.sleep(9000);

			String item = Locator1.SWSSubContractorGreenInYelloGridGraph().getText();
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
			
			
			   Thread.sleep(5000);
		       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			    
			    js1.executeScript("window.scrollBy(0,-1000)");
			    Thread.sleep(2000);    
			
			
			Locator1.ClearContractorRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			Locator1.ClearContractorDDRedGraphGrid().click();
			Thread.sleep(2000);
			
			
			if(Locator1.ClearButtonRedGraphGrid().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ClearButtonRedGraphGrid().click();
				test.log(LogStatus.PASS, " Clear Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
				
			}
			
			
	        Thread.sleep(2000);
			
			if(Locator1.ViewRedButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ViewRedButton().click();
				test.log(LogStatus.PASS, "  Overview Button Working properly" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
				
			}
			
			
			Thread.sleep(4000);
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(4000);
			
			
			
			
			Method1.SWSSubContractorGreyInGreenGraph(test, workbook);
			
			
			Thread.sleep(4000);
			
	}
			
			
			
	
	
	
	
	
	public static void SWSSubContractorGreyInGreenGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator1.SWSSubContractorGreyInGreenGraph().getText());	//Reading Dashboard count.
	    Locator1.SWSSubContractorGreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.GreenGraphinGreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator1.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
			
	
	//Sub Contractor Audit Completion Status
	
	
	
	public static void SubContractorOverdueStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1270)");
	    Thread.sleep(5000);
		
		
		
		int open = Integer.parseInt(Locator1.SWSSubContractorOverdue().getText());	//Reading Dashboard count.
	    Locator1.SWSSubContractorOverdue().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.SWSSubContractorOverdueGrid().getText();
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
		
		
		if(Locator1.SWSSubContractorOverdueGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.SWSSubContractorOverdueGridClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		if(Locator1.SWSSubContractorOverdueGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.SWSSubContractorOverdueGridExportButton().click();
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
		
		Method1.SubContractorPendingReviewStatus(test, workbook);
		
		Thread.sleep(2000);
		
		Method1.SubContractorClosedStatus(test, workbook);
			
		Thread.sleep(2000);
		
		
		
		
	}
	
	
	
	
	public static void SubContractorPendingReviewStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		/*
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(5000);
		
		*/
		
		int open = Integer.parseInt(Locator1.SWSSubContractorPendingReview().getText());	//Reading Dashboard count.
	    Locator1.SWSSubContractorPendingReview().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.SWSSubContractorPendinReviewGrid().getText();
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
		
		
		if(Locator1.SWSSubContractorPendinReviewGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.SWSSubContractorPendinReviewGridClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		if(Locator1.SWSSubContractorPendinReviewGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.SWSSubContractorPendinReviewGridExportButton().click();
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
	
	
	
	
	public static void SubContractorClosedStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		/*
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator1.SWSSubContractorClosed().getText());	//Reading Dashboard count.
	    Locator1.SWSSubContractorClosed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.SWSSubContractorClosedGrid().getText();
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
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.SWSSubContractorClosedGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.SWSSubContractorClosedGridClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		if(Locator1.SWSSubContractorClosedGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.SWSSubContractorClosedGridExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	//  PWS COMPLIED
	
	
	public static void PWSSUBContractorCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1900)");
	    Thread.sleep(2000);
		
		Locator1.PWSSubContractorComplied().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator1.PWSSubContractorCompliedMedium().getText());	//Reading Dashboard count.
	    Locator1.PWSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator1.RedGraphGrid().getText();
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
						
		test.log(LogStatus.FAIL, " Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonRedGraphGrid().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator1.ViewRedButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ViewRedButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(4000);
		
	//	Method1.YellowGraphDashboardGridCount(test, workbook);
	//	Thread.sleep(4000);
		
		
		Method1.PWSSubContractorCompliedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void PWSSubContractorCompliedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator1.PWSSubContractorCompliedLow().getText());	//Reading Dashboard count.
	    Locator1.PWSSubContractorCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.GreenGraphinGreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator1.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void PWSSUBContractorNotCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1900)");
	    Thread.sleep(2000);
		
		Locator1.PWSSubContractorNotComplied().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator1.PWSSubContractorNotCompliedMedium().getText());	//Reading Dashboard count.
	    Locator1.PWSSubContractorNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator1.RedGraphGrid().getText();
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
						
		test.log(LogStatus.FAIL, " Medium Risk :- Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonRedGraphGrid().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator1.ViewRedButton().isEnabled())
		{
			
			Thread.sleep(5000);
		    Locator1.ViewRedButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(4000);
		
	//	Method1.YellowGraphDashboardGridCount(test, workbook);
	//	Thread.sleep(4000);
		
		
		Method1.PWSSubContractorNotCompliedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void PWSSubContractorNotCompliedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator1.PWSSubContractorNotCompliedLow().getText());	//Reading Dashboard count.
	    Locator1.PWSSubContractorNotCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.GreenGraphinGreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator1.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	
	
	
	public static void PWSNotCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1070)");
	    Thread.sleep(3000);
	    
	    Locator1.CompliedCircle().click();
	    Thread.sleep(2000);
	    
	    Locator1.NotApplicableCircle().click();
	    Thread.sleep(4000);
		
		Locator1.PWSNotComplied().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator1.PWSNotCompliedHigh().getText());	//Reading Dashboard count.
	    Locator1.PWSNotCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator1.RedGraphGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonRedGraphGrid().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator1.ViewRedButton().isEnabled())
		{
			
			Thread.sleep(5000);
		    Locator1.ViewRedButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(4000);
		
		
		Method1.PWSNotCompliedMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method1.PWSNotCompliedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void PWSNotCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator1.PWSNotCompliedMedium().getText());	//Reading Dashboard count.
	    Locator1.PWSNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.GreenGraphinGreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator1.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	public static void PWSNotCompliedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator1.PWSNotCompliedLow().getText());	//Reading Dashboard count.
	    Locator1.PWSNotCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.GreenGraphinGreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator1.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void PWSSUBContractorNotApplicableMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1900)");
	    Thread.sleep(2000);
		
		Locator1.PWSSubContractorNotApplicable().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator1.PWSSubContractorNotApplicableMedium().getText());	//Reading Dashboard count.
	    Locator1.PWSSubContractorNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator1.RedGraphGrid().getText();
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
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.ClearButtonRedGraphGrid().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator1.ViewRedButton().isEnabled())
		{
			
			Thread.sleep(5000);
		    Locator1.ViewRedButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(4000);
		
	//	Method1.YellowGraphDashboardGridCount(test, workbook);
	//	Thread.sleep(4000);
		
		
		Method1.PWSSubContractorNotApplicableLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void PWSSubContractorNotApplicableLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator1.PWSSubContractorNotApplicableLow().getText());	//Reading Dashboard count.
	    Locator1.PWSSubContractorNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator1.GreenGraphinGreenGrid().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Low Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator1.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator1.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator1.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator1.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator1.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button Does not Working properly"  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	
	
	//.........................Negative Test Script
	
	
	
	
	
	
	
	
	
	
	public static void AddHeadCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(10000);
		Locator1.Upcoming().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(5000);
		
		
		
		Locator1.HeadCountselectmonth().click();
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
				
				Thread.sleep(4000);
		
				Method1.deleteHeadCount(test,workbook);
				Thread.sleep(2000);
	
		
	}
	
	
	
	
	
	
	public static void AddHeadCountvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Upcoming().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		
		Locator1.HeadCountsave().click();
		
		Thread.sleep(5000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t4 );
				
				Thread.sleep(4000);
				ac3.accept();
				
				Thread.sleep(2000);

			
			
		/*
			if(Locator1.HeadCountsave().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.HeadCountsave().click();
				test.log(LogStatus.PASS, "  Please Enter Mandatory Data " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Please Enter Mandatory Data "  );
				
			}
			Thread.sleep(2000);
		*/
	
		
	}
	
	
	public static void AddHeadCountvalidation1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Upcoming().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		
		Locator1.HeadCountsave().click();
		
		Thread.sleep(5000);
		 Alert ac5=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS," Without Enter Data  = " + t3 );
			
			Thread.sleep(2000);
			ac5.accept();
		
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
				
				test.log(LogStatus.PASS,"Without select month add head count = " + t4 );
				
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
					/*
					Locator1.HeadCountsave().click();
					
					Thread.sleep(5000);
					 Alert ac1=getDriver().switchTo().alert();
						
						String t1=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS," Without select male Head Count  = " + t1 );
						
						Thread.sleep(2000);
						ac1.accept();
						
						Thread.sleep(2000);
			*/
					 Locator1.HeadCountmaleCount().clear();
					 Thread.sleep(2000);
				
					if(Locator1.HeadCountsave().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator1.HeadCountsave().click();
						test.log(LogStatus.PASS, "  without select male Head Count  = Please Enter male Head Count  " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  without select male Head Count = Please Enter male Head Count  "  );
						
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
						//	Locator1.HeadCountsave().click();
							
							Thread.sleep(9000);
							if(Locator1.HeadCountsave().isEnabled())
							{
								
								Thread.sleep(2000);
							    Locator1.HeadCountsave().click();
								test.log(LogStatus.PASS, "  Without Select Female Head Count - Please Enter Female Head Count " );
								
							}
							
							else
							{
								test.log(LogStatus.FAIL, "   Without Select Female Head Count - Please Enter Female Head Count "  );
								
							}
							Thread.sleep(2000);	
								Locator1.HeadCountclose().click();
								Thread.sleep(3000);
								
					
				
		
	}
	
	
	
	
	
	public static void deleteHeadCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(10000);
		Locator1.Upcoming().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		*/
		
		Locator1.HeadCountDelete().click();
		
		
			Thread.sleep(5000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t4 );
				
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
	
	
	////////////////////////////Overdue
	
	
	
	public static void AddHeadCountOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
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
		
				Method1.deleteHeadCountOverdue(test,workbook);
				Thread.sleep(2000);
	
		
	}
	
	
	
	
	public static void AddHeadCountOverduevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
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
		
		Locator1.HeadCountsave().click();
			
		Thread.sleep(5000);
		 Alert ac3=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t4 );
			
			Thread.sleep(2000);
			ac3.accept();
			
			Thread.sleep(2000);
			Thread.sleep(2000);
		
		
	
		
	}
	
	
	
	
	
	
	public static void deleteHeadCountOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(10000);
		Locator1.Overdue().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		*/
		
		Thread.sleep(5000);
		Locator1.HeadCountDelete().click();
		
		
			Thread.sleep(5000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t4 );
				
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
	
	
	////////////Rejected Audit
	
	
	public static void AddHeadCountRejectedRejected( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Rejected().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(6000);
		
		
		
		Locator1.HeadCountselectmonthRejected().click();
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
				Method1.deleteHeadCountRejected(test,workbook);
				Thread.sleep(2000);
		
	
		
	}
	
	
	
	
	
	public static void AddHeadCountRejectedvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.Rejected().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
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
		
		Locator1.HeadCountsave().click();
			
		Thread.sleep(5000);
		 Alert ac3=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t4 );
			
			Thread.sleep(2000);
			ac3.accept();
			Thread.sleep(2000);
		
		
	
		
	}
	
	
	
	
	public static void deleteHeadCountRejected( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(10000);
		Locator1.Rejected().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		*/
		Thread.sleep(3000);
		
		Locator1.HeadCountDelete().click();
		
		
			Thread.sleep(5000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t4 );
				
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
	
	
	
	
	/////////Pending Review
	
	
	
	
	public static void AddHeadCountPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.PendingRewiew().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
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
		
				Method1.deleteHeadCountPendingReview(test,workbook);
				Thread.sleep(2000);
	
		
	}
	
	
	
	
	public static void AddHeadCountPendingReviewvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.PendingRewiew().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
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
				test.log(LogStatus.PASS, "  Please Enter Mandatory Data " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Please Enter Mandatory Data "  );
				
			}
			Thread.sleep(2000);
		
		
	
		
	}
	
	
	
	
	
	public static void deleteHeadCountPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(10000);
		Locator1.PendingRewiew().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		*/
		Thread.sleep(3000);
		Locator1.HeadCountDelete().click();
		
		
			Thread.sleep(5000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t4 );
				
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
	
	
	
	
	
	///////////Closed
	
	
	
	
	
	public static void AddHeadCountClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.CountMatchClose().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
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
				Method1.deleteHeadCountClosed(test,workbook);
				Thread.sleep(2000);
		
	
		
	}
	
	
	
	
	public static void AddHeadCountClosedvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(20000);
		Locator1.CountMatchClose().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
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
		
		Locator1.HeadCountsave().click();
			
		Thread.sleep(5000);
		 Alert ac3=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t4 );
			
			Thread.sleep(2000);
			ac3.accept();
         	Thread.sleep(2000);
		
		
	
		
	}
	
	
	
	
	
	public static void deleteHeadCountClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		Thread.sleep(10000);
		Locator1.CountMatchClose().click();
		Thread.sleep(10000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(2000);
		
         Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
		
		Locator1.HeadCountButton().click();
		Thread.sleep(3000);
		*/
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void UpdateUpcomingMultipleFile( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.Upcoming().click();
		Thread.sleep(20000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
        Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
        
		
		sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(15);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(9000);
		
       Alert ace=getDriver().switchTo().alert();
		
		String te=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "File " + te );
		
		Thread.sleep(4000);
		ace.accept();
		Thread.sleep(9000);
		
		/*
		Locator1.UPEditInEdit().click();
		Thread.sleep(5000);
		
		Locator1.ComplianceStatus().click();
		Thread.sleep(3000);
		
		Locator1.ComplianceStatusDD().click();
		Thread.sleep(5000);
		
		
		
		Locator1.Save().click();
		Thread.sleep(5000);
		
		
        Alert ac=getDriver().switchTo().alert();
		
		String t=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t );
		
		Thread.sleep(4000);
		ace.accept();
		
		*/	
		
	}
	
	
	
	
	public static void UpcomingWithoutSelectCheckListStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Upcoming().click();
		Thread.sleep(20000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(6000);
		
//		WebWait wait = new WebWait( 60000);
		
	//	 Locator1.CheckBoxUpcomingAudit().click();
		// Thread.sleep(2000);
		 
		 WebElement element = Locator1.CheckBoxUpcomingAudit();	      
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
		      
		      Locator1.SaveUpcomingAudit().click();   
		      Thread.sleep(16000);
		      /*
		      Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t3 );
				
				Thread.sleep(6000);
				ac2.accept();	
				Thread.sleep(6000);
				
				Alert ac4=getDriver().switchTo().alert();
				Thread.sleep(6000);
				ac2.accept();
				Thread.sleep(6000);
				*/
	}
	
	
	
	
	
	public static void UpcomingWithoutSelectCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Upcoming().click();
		Thread.sleep(20000);
		
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(7000);
		
		
		Locator1.UpcomingAuditCheckListStatus().click();
		Thread.sleep(5000);
		
		Locator1.UpcomingAuditCheckListStatusBox().click();
		Thread.sleep(5000);
		
		Locator1.UpcomingAuditCheckListStatusDD().click();
		Thread.sleep(5000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
		
		      Locator1.SaveUpcomingAudit().click();   
		      Thread.sleep(5000);
		      
		      Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t3 );
				
				Thread.sleep(6000);
				ac2.accept();
			
				Thread.sleep(2000);
		
	
	
	}
	
	
	
	public static void OverdueWithoutSelectCheckListStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(20000);
		
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(4000);
	        
	        Locator1.LastPaging().click();
			Thread.sleep(5000);
			
			Locator1.FirstLeftPaging().click();
			Thread.sleep(5000);
		       
			Locator1.FirstLeftPaging().click();
			Thread.sleep(5000);
		       
			Locator1.UpdateOverdue().click();
			Thread.sleep(5000);

//		Locator1.UpcomingEditButton().click();
	//	Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(6000);
		
//		WebWait wait = new WebWait(, 60000);
		
	//	 Locator1.CheckBoxUpcomingAudit().click();
		// Thread.sleep(2000);
		 
		 WebElement element = Locator1.CheckBoxUpcomingAudit();	      
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
		      
		      Locator1.SaveUpcomingAudit().click();   
		      Thread.sleep(5000);
		      
		      Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t3 );
				
				Thread.sleep(6000);
				ac2.accept();
			
				Thread.sleep(2000);
		
	
	
	}
	
	
	public static void OverdueWithoutSelectCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator1.Overdue().click();
		Thread.sleep(20000);
		
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(4000);
	        
	        Locator1.LastPaging().click();
			Thread.sleep(5000);
			
			Locator1.FirstLeftPaging().click();
			Thread.sleep(5000);
		       
			Locator1.FirstLeftPaging().click();
			Thread.sleep(5000);
		       
			Locator1.UpdateOverdue().click();
			Thread.sleep(5000);

	//	Locator1.UpcomingEditButton().click();
	//	Thread.sleep(5000);
		
		Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(7000);
		
		
		Locator1.OverdueAuditCheckListStatus().click();
		Thread.sleep(5000);
		
		Locator1.UpcomingAuditCheckListStatusBox().click();
		Thread.sleep(5000);
		
		Locator1.UpcomingAuditCheckListStatusDD().click();
		Thread.sleep(5000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
		
		      Locator1.SaveUpcomingAudit().click();   
		      Thread.sleep(5000);
		      
		      Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t3 );
				
				Thread.sleep(6000);
				ac2.accept();
			
				Thread.sleep(2000);
		
	
	
	}
	
	
	
	
	public static void UpdateUpcomingAddPdfFile( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.Upcoming().click();
		Thread.sleep(20000);
		
		Locator1.UpcomingEditButton().click();
		Thread.sleep(4000);
		
        Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
        
		
		sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		Thread.sleep(5000);
		
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(20000);
		
       Alert ace=getDriver().switchTo().alert();
		
		String te=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Excel File - " + te );
		
		Thread.sleep(4000);
		ace.accept();
		Thread.sleep(5000);
		
		
		row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(30000);
		
       Alert ac1=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Pdf File - " + t1 );
		
		Thread.sleep(4000);
		ac1.accept();
		Thread.sleep(5000);
		
		
		
		row0 = sheet.getRow(18);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(20000);
		
       Alert ac2=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Image - " + t2 );
		
		Thread.sleep(4000);
		ac2.accept();
		Thread.sleep(5000);
		
		
		
		row0 = sheet.getRow(19);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(20000);
		
       Alert ac3=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, " Word File - " + t3 );
		
		Thread.sleep(4000);
		ac3.accept();
		Thread.sleep(5000);
		
		
		
	}
	
	
	
	
	
	
	public static void UpdateOverdueAddPdfFile( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.Overdue().click();
		Thread.sleep(20000);
		
	       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(4000);
	        
	        Locator1.LastPaging().click();
			Thread.sleep(5000);
			
			Locator1.FirstLeftPaging().click();
			Thread.sleep(5000);
		       
			Locator1.FirstLeftPaging().click();
			Thread.sleep(5000);
		       
			Locator1.UpdateOverdue().click();
			Thread.sleep(5000);

		
	//	Locator1.UpcomingEditButton().click();
	//	Thread.sleep(4000);
		
        Method2.SwitchToNewlyOpenedWindow(test, workbook);
		
		Thread.sleep(5000);
		
        
		
		sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		Thread.sleep(5000);
		
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(20000);
		
       Alert ace=getDriver().switchTo().alert();
		
		String te=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Excel File - " + te );
		
		Thread.sleep(4000);
		ace.accept();
		Thread.sleep(5000);
		
		
		row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(20000);
		
       Alert ac1=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Pdf File - " + t1 );
		
		Thread.sleep(4000);
		ac1.accept();
		Thread.sleep(5000);
		
		
		
		row0 = sheet.getRow(18);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(20000);
		
       Alert ac2=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Image - " + t2 );
		
		Thread.sleep(4000);
		ac2.accept();
		Thread.sleep(5000);
		
		
		
		row0 = sheet.getRow(19);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.UpcomingSelectFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(20000);
		
       Alert ac3=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, " Word File - " + t3 );
		
		Thread.sleep(4000);
		ac3.accept();
		Thread.sleep(9000);
		
			
	
		
		
		
	}
	
	
	
	
	
	
	public static void UpcomingMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(6000);
		Locator1.Upcoming().click();
		Thread.sleep(7000);
		
		
		
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);
	       Locator1.ColumnLocation().click();
	       Thread.sleep(2000);
	       Locator1.ColumnState().click();
	       Thread.sleep(2000);
	 
		       
		 Locator1.Location().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD1().click();
	       Thread.sleep(1000);
	       String LocationText =Locator1.LocationDD2().getText();
	       Thread.sleep(1000);
	       Locator1.LocationDD2().click();
	       Thread.sleep(1000);
	       Locator1.Location().click();
	       Thread.sleep(1000);
	       
	       Locator1.State().click();
	       Thread.sleep(1000);
	       String StateText =Locator1.StateDD().getText();
	       Thread.sleep(2000);
	       Locator1.StateDD().click();
	       Thread.sleep(1000);
	       Locator1.State().click();
	       Thread.sleep(2000);

	       
       Locator1.Project().click();
       Thread.sleep(2000);
       String ProjectText =Locator1.IBPConstruction().getText();
       Thread.sleep(2000);
       Locator1.IBPConstruction().click();
       Thread.sleep(2000);
       Locator1.Project().click();
       Thread.sleep(2000);
        
       Locator1.ContractorType().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator1.Frequency().click();
       Thread.sleep(1000);
       String FrequencyText =Locator1.FrequencyDD().getText();
       Thread.sleep(1000);
       Locator1.FrequencyDD().click();
       Thread.sleep(1000);
       Locator1.Frequency().click();
       Thread.sleep(2000);
       
       Locator1.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator1.Status1R().getText();
       Thread.sleep(1000);
       Locator1.Status1R().click();
       Thread.sleep(1000);
       Locator1.Status2R().click();
       Thread.sleep(1000);
       Locator1.Status().click();
       Thread.sleep(2000);

       
       Locator1.PeriodFilterCompliedHigh().click();
       Thread.sleep(1000);
       String Periodtext =Locator1.Jun24().getText();
       Thread.sleep(1000);
       Locator1.Jun24().click();
       Thread.sleep(2000);
       

       
       
        List<String> li=new ArrayList<String>();
        
        li.add(LocationText);
        li.add(StateText);     
        li.add(ProjectText);
        li.add(ContractorTypeText);
        li.add(FrequencyText);
        li.add(Statustext);
        li.add(Periodtext);
        
        
        
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("State");
		filter.add("Facility");
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
	
		List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[10]"));
		List<WebElement> statecol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[11]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[8]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(entitycol);
				}
			else if(i==1)
				{
					raw.addAll(statecol);
				}
			else if(i==2)
			{
				raw.addAll(projectcol);
			}
				
			else if(i==3)
			{
				raw.addAll(contractorcol);
			}
				
			else if(i==4)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==5)
			{
				raw.addAll(statuscol);
			}

			else if(i==6)
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
		
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);
	       Locator1.ColumnLocation().click();
	       Thread.sleep(2000);
	       Locator1.ColumnState().click();
	       Thread.sleep(2000);
	 
		       
		 Locator1.Location().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD1().click();
	       Thread.sleep(1000);
	       String LocationText =Locator1.LocationDD2().getText();
	       Thread.sleep(1000);
	       Locator1.LocationDD2().click();
	       Thread.sleep(1000);
	       Locator1.Location().click();
	       Thread.sleep(1000);
	       
	       Locator1.State().click();
	       Thread.sleep(1000);
	       String StateText =Locator1.StateDD().getText();
	       Thread.sleep(2000);
	       Locator1.StateDD().click();
	       Thread.sleep(1000);
	       Locator1.State().click();
	       Thread.sleep(2000);

	       
    Locator1.Project().click();
    Thread.sleep(2000);
    String ProjectText =Locator1.IBPConstruction().getText();
    Thread.sleep(2000);
    Locator1.IBPConstruction().click();
    Thread.sleep(2000);
    Locator1.Project().click();
    Thread.sleep(2000);
     
    Locator1.ContractorType().click();
    Thread.sleep(1000);
    String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
    Thread.sleep(1000);
    Locator1.ContractorTypeDD1().click();
    Thread.sleep(1000);
    Locator1.ContractorType().click();
    Thread.sleep(2000);
    
    
    
    
    Locator1.Frequency().click();
    Thread.sleep(1000);
    String FrequencyText =Locator1.FrequencyDD().getText();
    Thread.sleep(1000);
    Locator1.FrequencyDD().click();
    Thread.sleep(1000);
    Locator1.Frequency().click();
    Thread.sleep(2000);
       
       Locator1.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator1.Status1Overdue().getText();
       Thread.sleep(2000);
       Locator1.Status1Overdue().click();
       Thread.sleep(2000);
       Locator1.Status2Overdue().click();
       Thread.sleep(2000);
       Locator1.Status().click();
       Thread.sleep(2000);
 
       
       Locator1.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String Periodtext =Locator2.Jul22().getText();
       Thread.sleep(2000);
       Locator2.Jul22().click();
       Thread.sleep(2000);
  
       
       
        List<String> li=new ArrayList<String>();
        
        li.add(LocationText);
        li.add(StateText);     
        li.add(ProjectText);
        li.add(ContractorTypeText);
        li.add(FrequencyText);
        li.add(Statustext);
        li.add(Periodtext);
       
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("State");
		filter.add("Facility");
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
	
		List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[10]"));
		List<WebElement> statecol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[11]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[8]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

			if(i==0)
			{
				raw.addAll(entitycol);
			}
		else if(i==1)
			{
				raw.addAll(statecol);
			}
		else if(i==2)
		{
			raw.addAll(projectcol);
		}
			
		else if(i==3)
		{
			raw.addAll(contractorcol);
		}
			
		else if(i==4)
		{
			raw.addAll(frequencycol);
		}
			
		else if(i==5)
		{
			raw.addAll(statuscol);
		}

		else if(i==6)
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
	
	
	
	public static void RejectedMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(19000);
		Locator1.Rejected().click();
		Thread.sleep(16000);
		
		
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);
	       Locator1.ColumnLocation().click();
	       Thread.sleep(2000);
	       Locator1.ColumnState().click();
	       Thread.sleep(2000);
	 
		       
		 Locator1.Location().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD1().click();
	       Thread.sleep(1000);
	       String LocationText =Locator1.LocationDD2().getText();
	       Thread.sleep(1000);
	       Locator1.LocationDD2().click();
	       Thread.sleep(1000);
	       Locator1.Location().click();
	       Thread.sleep(1000);
	       
	       Locator1.State().click();
	       Thread.sleep(1000);
	       String StateText =Locator1.StateDD().getText();
	       Thread.sleep(2000);
	       Locator1.StateDD().click();
	       Thread.sleep(1000);
	       Locator1.State().click();
	       Thread.sleep(2000);

	       
 Locator1.Project().click();
 Thread.sleep(2000);
 String ProjectText =Locator1.IBPConstruction().getText();
 Thread.sleep(2000);
 Locator1.IBPConstruction().click();
 Thread.sleep(2000);
 Locator1.Project().click();
 Thread.sleep(2000);
  
 Locator1.ContractorType().click();
 Thread.sleep(1000);
 String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
 Thread.sleep(1000);
 Locator1.ContractorTypeDD1().click();
 Thread.sleep(1000);
 Locator1.ContractorType().click();
 Thread.sleep(2000);
 
 
 
 
 Locator1.Frequency().click();
 Thread.sleep(1000);
 String FrequencyText =Locator1.FrequencyDD().getText();
 Thread.sleep(1000);
 Locator1.FrequencyDD().click();
 Thread.sleep(1000);
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
       Thread.sleep(2000);
       
       Locator1.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String Periodtext =Locator2.Feb22().getText();
       Thread.sleep(2000);
       Locator2.Feb22().click();
       Thread.sleep(2000);
 
       
       
       List<String> li=new ArrayList<String>();
       
       li.add(LocationText);
       li.add(StateText);     
       li.add(ProjectText);
       li.add(ContractorTypeText);
       li.add(FrequencyText);
       li.add(Statustext);
       li.add(Periodtext);
      
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("State");
		filter.add("Facility");
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
	
		List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[10]"));
		List<WebElement> statecol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[11]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[8]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

			if(i==0)
			{
				raw.addAll(entitycol);
			}
		else if(i==1)
			{
				raw.addAll(statecol);
			}
		else if(i==2)
		{
			raw.addAll(projectcol);
		}
			
		else if(i==3)
		{
			raw.addAll(contractorcol);
		}
			
		else if(i==4)
		{
			raw.addAll(frequencycol);
		}
			
		else if(i==5)
		{
			raw.addAll(statuscol);
		}

		else if(i==6)
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
		
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);
	       Locator1.ColumnLocation().click();
	       Thread.sleep(2000);
	       Locator1.ColumnState().click();
	       Thread.sleep(2000);
	 
		       
		 Locator1.Location().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD1().click();
	       Thread.sleep(1000);
	       String LocationText =Locator1.LocationDD2().getText();
	       Thread.sleep(1000);
	       Locator1.LocationDD2().click();
	       Thread.sleep(1000);
	       Locator1.Location().click();
	       Thread.sleep(1000);
	       
	       Locator1.State().click();
	       Thread.sleep(1000);
	       String StateText =Locator1.StateDD().getText();
	       Thread.sleep(2000);
	       Locator1.StateDD().click();
	       Thread.sleep(1000);
	       Locator1.State().click();
	       Thread.sleep(2000);

	       
Locator1.Project().click();
Thread.sleep(2000);
String ProjectText =Locator1.IBPConstruction().getText();
Thread.sleep(2000);
Locator1.IBPConstruction().click();
Thread.sleep(2000);
Locator1.Project().click();
Thread.sleep(2000);

Locator1.ContractorType().click();
Thread.sleep(1000);
String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
Thread.sleep(1000);
Locator1.ContractorTypeDD1().click();
Thread.sleep(1000);
Locator1.ContractorType().click();
Thread.sleep(2000);


Locator1.Frequency().click();
Thread.sleep(1000);
String FrequencyText =Locator1.FrequencyDD().getText();
Thread.sleep(1000);
Locator1.FrequencyDD().click();
Thread.sleep(1000);
Locator1.Frequency().click();
Thread.sleep(2000); 


       Locator1.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator1.Status1PendingReview().getText();
       Thread.sleep(2000);
       Locator1.Status1PendingReview().click();
       Thread.sleep(2000);
       Locator1.Status2PendingReview().click();
       Thread.sleep(2000);
       Locator1.Status().click();
       Thread.sleep(2000);
 
       
       Locator1.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String Periodtext =Locator2.Apr22().getText();
       Thread.sleep(2000);
       Locator2.Apr22().click();
       Thread.sleep(2000);

       
       
       List<String> li=new ArrayList<String>();
       
       li.add(LocationText);
       li.add(StateText);     
       li.add(ProjectText);
       li.add(ContractorTypeText);
       li.add(FrequencyText);
       li.add(Statustext);
       li.add(Periodtext);
      
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("State");
		filter.add("Facility");
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
	
		List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[10]"));
		List<WebElement> statecol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[11]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[8]"));

		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

			if(i==0)
			{
				raw.addAll(entitycol);
			}
		else if(i==1)
			{
				raw.addAll(statecol);
			}
		else if(i==2)
		{
			raw.addAll(projectcol);
		}
			
		else if(i==3)
		{
			raw.addAll(contractorcol);
		}
			
		else if(i==4)
		{
			raw.addAll(frequencycol);
		}
			
		else if(i==5)
		{
			raw.addAll(statuscol);
		}

		else if(i==6)
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
		
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);
	       Locator1.ColumnLocation().click();
	       Thread.sleep(2000);
	       Locator1.ColumnState().click();
	       Thread.sleep(2000);
	 
		       
		 Locator1.Location().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD1().click();
	       Thread.sleep(1000);
	       String LocationText =Locator1.LocationDD2().getText();
	       Thread.sleep(1000);
	       Locator1.LocationDD2().click();
	       Thread.sleep(1000);
	       Locator1.Location().click();
	       Thread.sleep(1000);
	       
	       Locator1.State().click();
	       Thread.sleep(1000);
	       String StateText =Locator1.StateDD().getText();
	       Thread.sleep(2000);
	       Locator1.StateDD().click();
	       Thread.sleep(1000);
	       Locator1.State().click();
	       Thread.sleep(2000);

	       
Locator1.Project().click();
Thread.sleep(2000);
String ProjectText =Locator1.IBPConstruction().getText();
Thread.sleep(2000);
Locator1.IBPConstruction().click();
Thread.sleep(2000);
Locator1.Project().click();
Thread.sleep(2000);

Locator1.ContractorType().click();
Thread.sleep(1000);
String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
Thread.sleep(1000);
Locator1.ContractorTypeDD1().click();
Thread.sleep(1000);
Locator1.ContractorType().click();
Thread.sleep(2000);


Locator1.Frequency().click();
Thread.sleep(1000);
String FrequencyText =Locator1.FrequencyDD().getText();
Thread.sleep(1000);
Locator1.FrequencyDD().click();
Thread.sleep(1000);
Locator1.Frequency().click();
Thread.sleep(2000); 
       
       Locator1.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator1.Status1Closed().getText();
       Thread.sleep(2000);
       Locator1.Status1Closed().click();
       Thread.sleep(2000);
       Locator1.Status2Closed().click();
       Thread.sleep(2000);
       Locator1.Status().click();
       Thread.sleep(2000);

       
       Locator1.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String Periodtext =Locator2.Mar22().getText();
       Thread.sleep(2000);
       Locator2.Mar22().click();
       Thread.sleep(2000);

   
       
       
      List<String> li=new ArrayList<String>();
       
       li.add(LocationText);
       li.add(StateText);     
       li.add(ProjectText);
       li.add(ContractorTypeText);
       li.add(FrequencyText);
       li.add(Statustext);
       li.add(Periodtext);
      
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("State");
		filter.add("Facility");
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
	
		List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[10]"));
		List<WebElement> statecol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[11]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[8]"));
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

			if(i==0)
			{
				raw.addAll(entitycol);
			}
		else if(i==1)
			{
				raw.addAll(statecol);
			}
		else if(i==2)
		{
			raw.addAll(projectcol);
		}
			
		else if(i==3)
		{
			raw.addAll(contractorcol);
		}
			
		else if(i==4)
		{
			raw.addAll(frequencycol);
		}
			
		else if(i==5)
		{
			raw.addAll(statuscol);
		}

		else if(i==6)
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
	
	
	////////////////GraphFilter
	
	
	public static void CompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator1.GreenGraph().click();
		Thread.sleep(2000);
		
	    Locator1.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(10000);
	    
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);

	   
       Locator1.Project2().click();
       Thread.sleep(1000);
       String ProjectText =Locator1.Projecttext3().getText();
       Thread.sleep(1000);
       Locator1.Projecttext3().click();
       Thread.sleep(1000);
       Locator1.Project2().click();
       Thread.sleep(2000);
       
       
       Locator1.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator1.StatusFilterCompliedHighDD().getText();
       Thread.sleep(1000);
       Locator1.StatusFilterCompliedHighDD().click();
       Thread.sleep(1000);
       Locator1.StatusFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       
       
       Locator1.RiskFilterComplied().click();
       Thread.sleep(1000);
       Locator1.RiskFilterCompliedHigh().click();
       Thread.sleep(1000);
       String RiskText =Locator1.RiskFilterCompliedHighDD1().getText();
       Thread.sleep(1000);
       Locator1.RiskFilterCompliedHighDD1().click();
       Thread.sleep(1000);
       Locator1.RiskFilterComplied().click();
       Thread.sleep(2000);
       
       Locator1.ContractorType1().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType1().click();
       Thread.sleep(2000);

       
       
       Locator1.PeriodFilterCompliedHigh().click();
       Thread.sleep(1000);
       String PeriodText =Locator2.Apr22().getText();
       Thread.sleep(1000);
       Locator2.Apr22().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
      
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(ContractorTypeText);
        li.add(PeriodText);
       
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("ContractorType");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		
		
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
				raw.addAll(contractortypecol);
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

		
	}
	
	
	
	
	public static void CompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
		
	    Locator2.YellowGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
	    
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);

	    
	       Locator1.Project2().click();
	       Thread.sleep(2000);
	       String ProjectText =Locator1.Projecttext3().getText();
	       Thread.sleep(1000);
	       Locator1.Projecttext3().click();
	       Thread.sleep(1000);
	       Locator1.Project2().click();
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
       
       
       Locator1.ContractorType1().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType1().click();
       Thread.sleep(2000);

     
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.Apr22().getText();
       Thread.sleep(2000);
       Locator2.Apr22().click();
       Thread.sleep(2000);
       
       
       
       
       
       List<String> li=new ArrayList<String>();
       
     
       li.add(ProjectText);
       li.add(Statustext);
       li.add(RiskText);
       li.add(ContractorTypeText);
       li.add(PeriodText);
      
       
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
	
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("ContractorType");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		
		
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
				raw.addAll(contractortypecol);
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

		
		
		
		
		
		
		
		
		
	}
	

	
	
	public static void CompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
		
	    Locator2.GreenGraphinGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
	    
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);

	
     
	       Locator1.Project2().click();
	       Thread.sleep(2000);
	       String ProjectText =Locator1.Projecttext3().getText();
	       Thread.sleep(1000);
	       Locator1.Projecttext3().click();
	       Thread.sleep(1000);
	       Locator1.Project2().click();
	       Thread.sleep(2000);
       
       
       Locator2.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(1000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(1000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(2000);
       
       
       Locator2.Risk().click();
       Thread.sleep(1000);
       Locator2.RiskFilterCompliedLow().click();
       Thread.sleep(1000);
       String RiskText =Locator2.RiskFilterCompliedLowDD1().getText();
       Thread.sleep(1000);
       Locator2.RiskFilterCompliedLowDD1().click();
       Thread.sleep(1000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       Locator1.ContractorType1().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType1().click();
       Thread.sleep(2000);

       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(1000);
       String PeriodText =Locator2.Apr22().getText();
       Thread.sleep(1000);
       Locator2.Apr22().click();
       Thread.sleep(2000);
       
       
       
       
       List<String> li=new ArrayList<String>();
       
       
       li.add(ProjectText);
       li.add(Statustext);
       li.add(RiskText);
       li.add(ContractorTypeText);
       li.add(PeriodText);
      
       
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
	
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("ContractorType");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		
		
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
				raw.addAll(contractortypecol);
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

		
	
		
	}
	

	////////////////////////////
	
	
	public static void NotCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraphInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
      
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);


	       
	       Locator1.Project2().click();
	       Thread.sleep(2000);
	       String ProjectText =Locator1.Projecttext3().getText();
	       Thread.sleep(1000);
	       Locator1.Projecttext3().click();
	       Thread.sleep(1000);
	       Locator1.Project2().click();
	       Thread.sleep(2000);
	       
	       
       
       
       Locator2.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
       Thread.sleep(1000);
       Locator2.StatusFilterNotCompliedHighDD().click();
       Thread.sleep(1000);
       Locator2.StatusFilterNotCompliedHighDD1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(2000);
       
       
       Locator2.Risk().click();
       Thread.sleep(1000);
       Locator2.RiskNADD().click();
       Thread.sleep(1000);
       String RiskText =Locator2.RiskNADD1().getText();
       Thread.sleep(1000);
       Locator2.RiskNADD1().click();
       Thread.sleep(1000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       Locator1.ContractorType1().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType1().click();
       Thread.sleep(2000);

 
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(1000);
       String PeriodText =Locator2.May22().getText();
       Thread.sleep(1000);
       Locator2.May22().click();
       Thread.sleep(2000);
      
       
       
       
       
       List<String> li=new ArrayList<String>();
       
       
       li.add(ProjectText);
       li.add(Statustext);
       li.add(RiskText);
       li.add(ContractorTypeText);
       li.add(PeriodText);
      
       
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
	
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("ContractorType");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		
		
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
				raw.addAll(contractortypecol);
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

		
		
		
		
		
		
	}
	
	
	
	
	public static void NotCompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraphInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
      
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);
       
     
	    Locator1.Project2().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext3().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext3().click();
	       Thread.sleep(2000);
	       Locator1.Project2().click();
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
       
       Locator1.ContractorType1().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType1().click();
       Thread.sleep(2000);

 
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.May22().getText();
       Thread.sleep(2000);
       Locator2.May22().click();
       Thread.sleep(2000);
       
       
       
       List<String> li=new ArrayList<String>();
       
       
       li.add(ProjectText);
       li.add(Statustext);
       li.add(RiskText);
       li.add(ContractorTypeText);
       li.add(PeriodText);
      
       
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
	
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("ContractorType");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		
		
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
				raw.addAll(contractortypecol);
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

		
		
		
		
	}

	
	
	public static void NotCompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
      
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);


     
	    Locator1.Project2().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext3().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext3().click();
	       Thread.sleep(2000);
	       Locator1.Project2().click();
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
       
       
       Locator1.ContractorType1().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType1().click();
       Thread.sleep(2000);

 
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.May22().getText();
       Thread.sleep(2000);
       Locator2.May22().click();
       Thread.sleep(2000);
        
       
       
       
       List<String> li=new ArrayList<String>();
       
       
       li.add(ProjectText);
       li.add(Statustext);
       li.add(RiskText);
       li.add(ContractorTypeText);
       li.add(PeriodText);
      
       
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
	
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("ContractorType");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		
		
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
				raw.addAll(contractortypecol);
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
		
		
		
		
		
	}

	////////////////////////////////////////
	
	
	public static void NotApplicableGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
	    Locator2.GreyInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
      
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);


     
	    Locator1.Project2().click();
	       Thread.sleep(16000);
	       String ProjectText =Locator1.Projecttext3().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext3().click();
	       Thread.sleep(2000);
	       Locator1.Project2().click();
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
       
       
       Locator1.ContractorType1().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType1().click();
       Thread.sleep(2000);

 
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.Mar22().getText();
       Thread.sleep(2000);
       Locator2.Mar22().click();
       Thread.sleep(2000);
      
       
       
       
       List<String> li=new ArrayList<String>();
       
       
       li.add(ProjectText);
       li.add(Statustext);
       li.add(RiskText);
       li.add(ContractorTypeText);
       li.add(PeriodText);
      
       
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
	
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("ContractorType");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		
		
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
				raw.addAll(contractortypecol);
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
		
		
		
		
		
	}

	
	
	public static void NotApplicableGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(3000);
		
	    Locator2.GreyInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
      
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);


     
	    Locator1.Project2().click();
	       Thread.sleep(2000);
	       String ProjectText =Locator1.Projecttext3().getText();
	       Thread.sleep(1000);
	       Locator1.Projecttext3().click();
	       Thread.sleep(1000);
	       Locator1.Project2().click();
	       Thread.sleep(2000);
       
       
       
       Locator2.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator2.StatusNADD().getText();
       Thread.sleep(1000);
       Locator2.StatusNADD().click();
       Thread.sleep(1000);
       Locator2.StatusNADD1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(2000);
       
       
       Locator2.Risk().click();
       Thread.sleep(1000);
       Locator2.RiskNADDMedium().click();
       Thread.sleep(1000);
       String RiskText =Locator2.RiskNADDMedium1().getText();
       Thread.sleep(1000);
       Locator2.RiskNADDMedium1().click();
       Thread.sleep(1000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       Locator1.ContractorType1().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType1().click();
       Thread.sleep(2000);

 
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(1000);
       String PeriodText =Locator2.Mar22().getText();
       Thread.sleep(1000);
       Locator2.Mar22().click();
       Thread.sleep(2000);
     //  Locator2.PeriodFilterCompliedHigh().click();
     //  Thread.sleep(2000);
       
       
       
       
       List<String> li=new ArrayList<String>();
       
       
       li.add(ProjectText);
       li.add(Statustext);
       li.add(RiskText);
       li.add(ContractorTypeText);
       li.add(PeriodText);
      
       
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
	
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("ContractorType");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		
		
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
				raw.addAll(contractortypecol);
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
		
		
		
		
		
	}

	
	
	
	
	public static void NotApplicableGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
	    Locator2.GreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
      
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnType().click();
	       Thread.sleep(2000);


     
	    Locator1.Project2().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator1.Projecttext3().getText();
	       Thread.sleep(2000);
	       Locator1.Projecttext3().click();
	       Thread.sleep(1000);
	       Locator1.Project2().click();
	       Thread.sleep(2000);
       
       
       
       Locator2.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator2.StatusNADD().getText();
       Thread.sleep(1000);
       Locator2.StatusNADD().click();
       Thread.sleep(1000);
       Locator2.StatusNADD1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(2000);
       
       
       Locator2.Risk().click();
       Thread.sleep(1000);
       Locator2.RiskNADDLow().click();
       Thread.sleep(1000);
       String RiskText =Locator2.RiskNADDLow1().getText();
       Thread.sleep(1000);
       Locator2.RiskNADDLow1().click();
       Thread.sleep(1000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       Locator1.ContractorType1().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator1.ContractorTypeDD1().getText();
       Thread.sleep(1000);
       Locator1.ContractorTypeDD1().click();
       Thread.sleep(1000);
       Locator1.ContractorType1().click();
       Thread.sleep(2000);

 
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(1000);
       String PeriodText =Locator2.Mar22().getText();
       Thread.sleep(1000);
       Locator2.Mar22().click();
       Thread.sleep(2000);
       
       
       
       
       List<String> li=new ArrayList<String>();
       
       
       li.add(ProjectText);
       li.add(Statustext);
       li.add(RiskText);
       li.add(ContractorTypeText);
       li.add(PeriodText);
      
       
       Thread.sleep(3000);
       
		List<String> filter=new ArrayList<String>();	
	
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("ContractorType");
		filter.add("Period");
			
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		
		
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
				raw.addAll(contractortypecol);
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
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void GridCountExcelCountUpcomingAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(20000);
		
		int open = Integer.parseInt(Locator1.Upcoming().getText());	//Reading Dashboard count.
        Locator1.Upcoming().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

		String item = Locator1.GridCount().getText();
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
		
		
	
		Thread.sleep(4000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		
	    
	    
	    if(Locator1.UpcomingExport().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingExport().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button From Workspace "  );
			
		}
	    
	    Thread.sleep(4000);
	    
	    Locator1.ClearButtonStateRejected().click();
		Thread.sleep(3000);
		Locator1.ClearButtonStateDDRejected().click();
		Thread.sleep(3000);
		
		if(Locator1.UpcomingCleartButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator1.UpcomingCleartButton().click();
			test.log(LogStatus.PASS, "  Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
	    
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
      
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnLocation1().click();
	       Thread.sleep(2000);
	       Locator1.ColumnState1().click();
	       Thread.sleep(2000);
	 
		       
		 Locator1.Location1().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD1().click();
	       Thread.sleep(1000);
	       String LocationText =Locator1.LocationDD3().getText();
	       Thread.sleep(1000);
	       Locator1.LocationDD3().click();
	       Thread.sleep(1000);
	       Locator1.Location1().click();
	       Thread.sleep(2000);
	       
	       Locator1.State1().click();
	       Thread.sleep(1000);
	       String StateText =Locator1.StateDD().getText();
	       Thread.sleep(2000);
	       Locator1.StateDD().click();
	       Thread.sleep(1000);
	       Locator1.State1().click();
	       Thread.sleep(2000);


		
	    Locator1.Project1().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator1.Projecttext().getText();
	       Thread.sleep(1000);
	       Locator1.Projecttext().click();
	       Thread.sleep(1000);
	       Locator1.Project1().click();
	       Thread.sleep(2000);
	    
       
       
       
       
       Locator2.ContractorType().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator2.ReportTabContractorTypeDD().getText();
       Thread.sleep(1000);
       Locator2.ReportTabContractorTypeDD().click();
       Thread.sleep(1000);
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Frequency().click();
       Thread.sleep(1000);
       String FrequencyText =Locator1.FrequencyDD().getText();
       Thread.sleep(1000);
       Locator1.FrequencyDD().click();
       Thread.sleep(1000);
       Locator2.Frequency().click();
       Thread.sleep(2000);
       
       Locator2.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator2.StatusOverdue().getText();
       Thread.sleep(1000);
       Locator2.StatusOverdue().click();
       Thread.sleep(1000);
       Locator2.StatusOverdue1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(2000);
       
       
       Locator2.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator2.Jul22().getText();
       Thread.sleep(2000);
      Locator2.Jul22().click();
      Thread.sleep(2000);
      
      
      
      List<String> li=new ArrayList<String>();
      
      li.add(LocationText);
      li.add(StateText);     
      li.add(ProjectText);
      li.add(ContractorTypeText);
      li.add(FrequencyText);
      li.add(Statustext);
      li.add(periodtext);
     
      Thread.sleep(3000);
      
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("State");
		filter.add("Facility");
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
	
		List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> statecol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[10]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

			if(i==0)
			{
				raw.addAll(entitycol);
			}
		else if(i==1)
			{
				raw.addAll(statecol);
			}
		else if(i==2)
		{
			raw.addAll(projectcol);
		}
			
		else if(i==3)
		{
			raw.addAll(contractorcol);
		}
			
		else if(i==4)
		{
			raw.addAll(frequencycol);
		}
			
		else if(i==5)
		{
			raw.addAll(statuscol);
		}

		else if(i==6)
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
      
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnLocation1().click();
	       Thread.sleep(2000);
	       Locator1.ColumnState1().click();
	       Thread.sleep(2000);
	 
		       
		 Locator1.Location1().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD1().click();
	       Thread.sleep(1000);
	       String LocationText =Locator1.LocationDD3().getText();
	       Thread.sleep(1000);
	       Locator1.LocationDD3().click();
	       Thread.sleep(1000);
	       Locator1.Location1().click();
	       Thread.sleep(1000);
	       
	       Locator1.State1().click();
	       Thread.sleep(1000);
	       String StateText =Locator1.StateDD().getText();
	       Thread.sleep(2000);
	       Locator1.StateDD().click();
	       Thread.sleep(1000);
	       Locator1.State1().click();
	       Thread.sleep(2000);


	   
	    Locator1.Project1().click();
	       Thread.sleep(2000);
	       String ProjectText =Locator1.Projecttext().getText();
	       Thread.sleep(1000);
	       Locator1.Projecttext().click();
	       Thread.sleep(1000);
	       Locator1.Project1().click();
	       Thread.sleep(2000);
       
       
       
       Locator2.ContractorType().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator2.ReportTabContractorTypeDD().getText();
       Thread.sleep(1000);
       Locator2.ReportTabContractorTypeDD().click();
       Thread.sleep(1000);
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Frequency().click();
       Thread.sleep(1000);
       String FrequencyText =Locator1.FrequencyDD().getText();
       Thread.sleep(1000);
       Locator1.FrequencyDD().click();
       Thread.sleep(1000);
       Locator2.Frequency().click();
       Thread.sleep(2000);
       
       Locator2.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator2.StatusPendingReview().getText();
       Thread.sleep(1000);
       Locator2.StatusPendingReview().click();
       Thread.sleep(1000);
       Locator2.StatusPendingReview1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(2000);
       
       
       
       Locator2.Period().click();
       Thread.sleep(1000);
       String periodtext =Locator2.Apr22().getText();
       Thread.sleep(1000);
      Locator2.Apr22().click();
      Thread.sleep(2000);
      
       
      List<String> li=new ArrayList<String>();
      
      li.add(LocationText);
      li.add(StateText);     
      li.add(ProjectText);
      li.add(ContractorTypeText);
      li.add(FrequencyText);
      li.add(Statustext);
      li.add(periodtext);
     
      Thread.sleep(3000);
      
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("State");
		filter.add("Facility");
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
	
		List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> statecol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[10]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

			if(i==0)
			{
				raw.addAll(entitycol);
			}
		else if(i==1)
			{
				raw.addAll(statecol);
			}
		else if(i==2)
		{
			raw.addAll(projectcol);
		}
			
		else if(i==3)
		{
			raw.addAll(contractorcol);
		}
			
		else if(i==4)
		{
			raw.addAll(frequencycol);
		}
			
		else if(i==5)
		{
			raw.addAll(statuscol);
		}

		else if(i==6)
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



	
	public static void ACSPClosedMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		Locator2.ACSGreenGraph().click();
		Thread.sleep(16000);
		
		
		getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
      
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnLocation1().click();
	       Thread.sleep(2000);
	       Locator1.ColumnState1().click();
	       Thread.sleep(2000);
	 
		       
		 Locator1.Location1().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD1().click();
	       Thread.sleep(1000);
	       String LocationText =Locator1.LocationDD3().getText();
	       Thread.sleep(1000);
	       Locator1.LocationDD3().click();
	       Thread.sleep(1000);
	       Locator1.Location1().click();
	       Thread.sleep(1000);
	       
	       Locator1.State1().click();
	       Thread.sleep(1000);
	       String StateText =Locator1.StateDD().getText();
	       Thread.sleep(2000);
	       Locator1.StateDD().click();
	       Thread.sleep(1000);
	       Locator1.State1().click();
	       Thread.sleep(2000);


	   
	    Locator1.Project1().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator1.Projecttext().getText();
	       Thread.sleep(1000);
	       Locator1.Projecttext().click();
	       Thread.sleep(1000);
	       Locator1.Project1().click();
	       Thread.sleep(2000);
       
       
       
       Locator2.ContractorType().click();
       Thread.sleep(1000);
       String ContractorTypeText =Locator2.ReportTabContractorTypeDD().getText();
       Thread.sleep(1000);
       Locator2.ReportTabContractorTypeDD().click();
       Thread.sleep(1000);
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.Frequency().click();
       Thread.sleep(1000);
       String FrequencyText =Locator1.FrequencyDD().getText();
       Thread.sleep(1000);
       Locator2.FrequencyDD().click();
       Thread.sleep(1000);
       Locator2.Frequency().click();
       Thread.sleep(2000);
       
       Locator2.Status().click();
       Thread.sleep(1000);
       Locator1.Closed().click();
       Thread.sleep(1000);
       String Statustext =Locator1.Closed1().getText();
       Thread.sleep(1000);
       Locator1.Closed1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(2000);
       
       
       
       Locator2.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator2.Mar22().getText();
       Thread.sleep(2000);
      Locator2.Mar22().click();
      Thread.sleep(2000);
      
       
      List<String> li=new ArrayList<String>();
      
      li.add(LocationText);
      li.add(StateText);     
      li.add(ProjectText);
      li.add(ContractorTypeText);
      li.add(FrequencyText);
      li.add(Statustext);
      li.add(periodtext);
     
      Thread.sleep(3000);
      
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("State");
		filter.add("Facility");
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
	
		List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> statecol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[10]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridAuditStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

			if(i==0)
			{
				raw.addAll(entitycol);
			}
		else if(i==1)
			{
				raw.addAll(statecol);
			}
		else if(i==2)
		{
			raw.addAll(projectcol);
		}
			
		else if(i==3)
		{
			raw.addAll(contractorcol);
		}
			
		else if(i==4)
		{
			raw.addAll(frequencycol);
		}
			
		else if(i==5)
		{
			raw.addAll(statuscol);
		}

		else if(i==6)
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

		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-1000)");	
		Thread.sleep(3000);

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

	
////////////////////////////////////////////////////////////////
	
	
	public static void PWSCompliedJKHillsMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,2000)");
		    Thread.sleep(5000);
			
		   /*
			Locator1.NotCompliedCircle().click();
			Thread.sleep(3000);
		    
		    Locator1.NotApplicableCircle().click();
		    Thread.sleep(3000);
			*/
		    
		   Locator1.PWSCompliedJKHills().click();
		   
		   Thread.sleep(3000);
			
		    Locator1.PWSCompliedJKHillsHigh().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
	       
		    
		    
		    Locator1.Project2().click();
		       Thread.sleep(2000);
		       String ProjectText =Locator1.Projecttext3().getText();
		       Thread.sleep(2000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Project2().click();
		       Thread.sleep(2000);
	       
	       
	       
		       Locator2.Status().click();
		       Thread.sleep(1000);
		       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
		       Thread.sleep(1000);
		       Locator2.StatusFilterCompliedHighDD().click();
		       Thread.sleep(1000);
		       Locator2.StatusFilterCompliedHighDD1().click();
		       Thread.sleep(1000);
		       Locator2.Status().click();
		       Thread.sleep(2000);
		       
		       
		       Locator2.Risk().click();
		       Thread.sleep(1000);
		       Locator2.RiskNADD().click();
		       Thread.sleep(1000);
		       String RiskText =Locator2.RiskNADD1().getText();
		       Thread.sleep(1000);
		       Locator2.RiskNADD1().click();
		       Thread.sleep(1000);
		       Locator2.Risk().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       
		       Locator2.PeriodFilterCompliedHigh().click();
		       Thread.sleep(1000);
		       String PeriodText =Locator2.Apr22().getText();
		       Thread.sleep(1000);
		       Locator2.Apr22().click();
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
			
			JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			js1.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("No items to display")) {
			Thread.sleep(5000);
		
//			List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
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
				 test.log(LogStatus.PASS, "High Risk - " + filter.get(i)+" dropdown working properly.");
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

			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " The applied filter get cleared after clicking on the clear button " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
				
			}
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
				
			Method1.PWSCompliedJKHillsMediumMultipleFilter(test, workbook);
			
			Thread.sleep(2000);
			
			Method1.PWSCompliedJKHillsLowMultipleFilter(test, workbook);
				
			Thread.sleep(2000);
				
		
	}
	
	
	
	
	public static void PWSCompliedJKHillsMediumMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			
		    Locator1.PWSCompliedJKHillsmedium().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		    
		    
		    Locator1.Project2().click();
		       Thread.sleep(2000);
		       String ProjectText =Locator1.Projecttext3().getText();
		       Thread.sleep(2000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Project2().click();
		       Thread.sleep(2000);
	       
	       
	       
		       Locator1.Status().click();
		       Thread.sleep(1000);
		       String Statustext =Locator1.StatusFilterCompliedHighDD().getText();
		       Thread.sleep(1000);
		       Locator1.StatusFilterCompliedHighDD().click();
		       Thread.sleep(1000);
		       Locator1.StatusFilterCompliedHighDD1().click();
		       Thread.sleep(1000);
		       Locator1.Status().click();
		       Thread.sleep(2000);
		       
		       
		       Locator2.Risk().click();
		       Thread.sleep(1000);
		       Locator2.RiskNADDMedium().click();
		       Thread.sleep(1000);
		       String RiskText =Locator2.RiskNADDMedium1().getText();
		       Thread.sleep(1000);
		       Locator2.RiskNADDMedium1().click();
		       Thread.sleep(1000);
		       Locator2.Risk().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       
		       Locator2.PeriodFilterCompliedHigh().click();
		       Thread.sleep(1000);
		       String PeriodText =Locator2.Apr22().getText();
		       Thread.sleep(1000);
		       Locator2.Apr22().click();
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
		    filter.add("Period");
		    filter.add("Risk");
			
			JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			js1.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("No items to display")) {
			Thread.sleep(5000);
		
//			List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
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
				 test.log(LogStatus.PASS, "Medium Risk - " +  filter.get(i)+" dropdown working properly.");
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

			
			// clear button
			
	        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
		    
		    jss1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);
			
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " The applied filter get cleared after clicking on the clear button " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
				
			}
		
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
	}

	
	
	
	public static void PWSCompliedJKHillsLowMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
		    Locator1.PWSCompliedJKHillsLow().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
		    
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		    Locator1.Project2().click();
		       Thread.sleep(2000);
		       String ProjectText =Locator1.Projecttext3().getText();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Project2().click();
		       Thread.sleep(2000);
	       
	       
	       
		       Locator1.Status().click();
		       Thread.sleep(2000);
		       String Statustext =Locator1.StatusFilterCompliedHighDD().getText();
		       Thread.sleep(1000);
		       Locator1.StatusFilterCompliedHighDD().click();
		       Thread.sleep(1000);
		       Locator1.StatusFilterCompliedHighDD1().click();
		       Thread.sleep(1000);
		       Locator1.Status().click();
		       Thread.sleep(2000);
		       
		       Locator2.Risk().click();
		       Thread.sleep(1000);
		       Locator2.RiskNADDLow().click();
		       Thread.sleep(1000);
		       String RiskText =Locator2.RiskNADDLow1().getText();
		       Thread.sleep(1000);
		       Locator2.RiskNADDLow1().click();
		       Thread.sleep(1000);
		       Locator2.Risk().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       
		       Locator2.PeriodFilterCompliedHigh().click();
		       Thread.sleep(2000);
		       String PeriodText =Locator2.Apr22().getText();
		       Thread.sleep(1000);
		       Locator2.Apr22().click();
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
			
			JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			js1.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.GridCount().getText();
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
				 test.log(LogStatus.PASS, "Low Risk - " + filter.get(i)+" dropdown working properly.");
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

		    
		    
		    
            JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(9000);
			
			if(Locator1.PWSCompliedGraphHighGridClearButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator1.ACSREDGraphGridClearButton().click();
				test.log(LogStatus.PASS, " The applied filter get cleared after clicking on the clear button " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  The applied filter Not get cleared after clicking on the clear button "  );
				
			}
			
			
			
			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
	}

	
	////////////////////////////////////////////////////
	
	
	
	public static void PWSNotCompliedJKHillsHighMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,750)");
		    Thread.sleep(5000);
			
	//	   Locator1.CompliedCircle().click();
	//	   Thread.sleep(3000);
		    
		//	Locator1.NotCompliedCircle().click();
		//	Thread.sleep(3000);
		    
	//	    Locator1.NotApplicableCircle().click();
	//	    Thread.sleep(3000);
			
		    
		   Locator1.PWSCompliedJKHills().click();
		   
		   Thread.sleep(3000);
		   Locator1.PWSNotCompliedJKHillsHigh().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		    
		    getDriver().switchTo().frame(Locator2.Frame());
		    Thread.sleep(5000);
		    
	      
		    Locator1.Project2().click();
		       Thread.sleep(2000);
		       String ProjectText =Locator1.Projecttext3().getText();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Project2().click();
		       Thread.sleep(2000);
	       
	       
	       
		       Locator2.Status().click();
		       Thread.sleep(1000);
		       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
		       Thread.sleep(1000);
		       Locator2.StatusFilterNotCompliedHighDD().click();
		       Thread.sleep(1000);
		       Locator2.StatusFilterNotCompliedHighDD1().click();
		       Thread.sleep(1000);
		       Locator2.Status().click();
		       Thread.sleep(2000);
		       
		       
		       Locator2.Risk().click();
		       Thread.sleep(1000);
		       Locator2.RiskNADD().click();
		       Thread.sleep(1000);
		       String RiskText =Locator2.RiskNADD1().getText();
		       Thread.sleep(1000);
		       Locator2.RiskNADD1().click();
		       Thread.sleep(1000);
		       Locator2.Risk().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       
		       
		       Locator2.PeriodFilterCompliedHigh().click();
		       Thread.sleep(1000);
		       String PeriodText =Locator2.May22().getText();
		       Thread.sleep(1000);
		       Locator2.May22().click();
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
			
			JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			js1.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.GridCount().getText();
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
				 test.log(LogStatus.PASS, "High Risk - " + filter.get(i)+" dropdown working properly.");
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
			
			
			
			Method1.PWSNotCompliedJKHillsMediumMultipleFilter(test, workbook);
			
			Thread.sleep(2000);
			
			Method1.PWSNotCompliedJKHillsLowMultipleFilter(test, workbook);
				
		   Thread.sleep(2000);
			
		
		
		
			
				
		
		
	}
	
	
	
	
	public static void PWSNotCompliedJKHillsMediumMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
		    Locator1.PWSNotCompliedJKHillsMedium().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
	       
		    Locator1.Project2().click();
		       Thread.sleep(1000);
		       String ProjectText =Locator1.Projecttext3().getText();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Project2().click();
		       Thread.sleep(2000);
	       
	       
	       
		       Locator2.Status().click();
		       Thread.sleep(1000);
		       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
		       Thread.sleep(1000);
		       Locator2.StatusFilterNotCompliedHighDD().click();
		       Thread.sleep(1000);
		       Locator2.StatusFilterNotCompliedHighDD1().click();
		       Thread.sleep(1000);
		       Locator2.Status().click();
		       Thread.sleep(2000);
		       
		       
		       Locator2.Risk().click();
		       Thread.sleep(1000);
		       Locator2.RiskFilterCompliedMedium().click();
		       Thread.sleep(1000);
		       String RiskText =Locator2.RiskFilterCompliedMediumDD1().getText();
		       Thread.sleep(1000);
		       Locator2.RiskFilterCompliedMediumDD1().click();
		       Thread.sleep(1000);
		       Locator2.Risk().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       
		       Locator2.PeriodFilterCompliedHigh().click();
		       Thread.sleep(1000);
		       String PeriodText =Locator2.May22().getText();
		       Thread.sleep(1000);
		       Locator2.May22().click();
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
			
			JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			js1.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.GridCount().getText();
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
			Thread.sleep(3000);


			
			
			Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
	}

	
	
	
	public static void PWSNotCompliedJKHillsLowMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
		    Locator1.PWSNotCompliedJKHillsLow().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
	       
		    Locator1.Project2().click();
		       Thread.sleep(2000);
		       String ProjectText =Locator1.Projecttext3().getText();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Project2().click();
		       Thread.sleep(2000);
	       
	       
	       
		       Locator2.Status().click();
		       Thread.sleep(1000);
		       String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
		       Thread.sleep(1000);
		       Locator2.StatusFilterNotCompliedHighDD().click();
		       Thread.sleep(1000);
		       Locator2.StatusFilterNotCompliedHighDD1().click();
		       Thread.sleep(1000);
		       Locator2.Status().click();
		       Thread.sleep(2000);
		       
		       Locator2.Risk().click();
		       Thread.sleep(1000);
		       Locator2.RiskNADDLow().click();
		       Thread.sleep(1000);
		       String RiskText =Locator2.RiskNADDLow1().getText();
		       Thread.sleep(1000);
		       Locator2.RiskNADDLow1().click();
		       Thread.sleep(1000);
		       Locator2.Risk().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       
		       Locator2.PeriodFilterCompliedHigh().click();
		       Thread.sleep(2000);
		       String PeriodText =Locator2.May22().getText();
		       Thread.sleep(1000);
		       Locator2.May22().click();
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
			
			JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			js1.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.GridCount().getText();
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
				 test.log(LogStatus.PASS, "Low Risk - " + filter.get(i)+" dropdown working properly.");
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

	
	////////////////////////////////////////////////////////////////
	
	
	public static void PWSNotApplicableJKHillHighMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,2000)");
		    Thread.sleep(5000);
			
		//   Locator1.CompliedCircle().click();
		//   Thread.sleep(3000);
		    
		//	Locator1.NotCompliedCircle().click();
		//	Thread.sleep(3000);
		    
		 //   Locator1.NotApplicableCircle().click();
		 //   Thread.sleep(3000);
			
		    
		   Locator1.PWSCompliedJKHills().click();
		   
		   Thread.sleep(3000);
			
		    Locator1.PWSNotApplicableJKHillHigh().click();					                //Clicking on Dashboard count

		    Thread.sleep(10000);
		   
		    getDriver().switchTo().frame(Locator2.Frame());
		    Thread.sleep(5000);
		    
		    Locator1.Project2().click();
		       Thread.sleep(2000);
		       String ProjectText =Locator1.Projecttext3().getText();
		       Thread.sleep(2000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Project2().click();
		       Thread.sleep(2000);
	       
	       
	       
		       Locator2.Status().click();
		       Thread.sleep(1000);
		       Locator2.StatusNADD().click();
		       Thread.sleep(1000);
		       String Statustext =Locator2.StatusNADD1().getText();
		       Thread.sleep(1000);
		       Locator2.StatusNADD1().click();
		       Thread.sleep(1000);
		       Locator2.Status().click();
		       Thread.sleep(2000);
		       
		       
		       Locator2.Risk().click();
		       Thread.sleep(1000);
		       Locator2.RiskNADD().click();
		       Thread.sleep(1000);
		       String RiskText =Locator2.RiskNADD1().getText();
		       Thread.sleep(1000);
		       Locator2.RiskNADD1().click();
		       Thread.sleep(1000);
		       Locator2.Risk().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       
		       Locator2.PeriodFilterCompliedHigh().click();
		       Thread.sleep(1000);
		       String PeriodText =Locator2.Mar22().getText();
		       Thread.sleep(1000);
		       Locator2.Mar22().click();
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
			
			JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			js1.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.GridCount().getText();
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
				 test.log(LogStatus.PASS, "High Risk - " + filter.get(i)+" dropdown working properly.");
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
			
			
			
			Method1.PWSNotApplicableJKHillsMediumMultipleFilter(test, workbook);
			
			Thread.sleep(2000);
			
			Method1.PWSNotApplicableJKHillsLowMultipleFilter(test, workbook);
				
			Thread.sleep(2000);
			
		
		
		
			
				
		
		
	}
	
	
	
	public static void PWSNotApplicableJKHillsMediumMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
		    Locator1.PWSNotApplicableJKHillsMedium().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		   
		    
		    getDriver().switchTo().frame(Locator2.Frame());
		    Thread.sleep(5000);
		    
		    Locator1.Project2().click();
		       Thread.sleep(2000);
		       String ProjectText =Locator1.Projecttext3().getText();
		       Thread.sleep(2000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Project2().click();
		       Thread.sleep(2000);
	       
	       
	       
		       Locator2.Status().click();
		       Thread.sleep(1000);
		       String Statustext =Locator2.StatusNADD().getText();
		       Thread.sleep(1000);
		       Locator2.StatusNADD().click();
		       Thread.sleep(1000);
		       Locator2.StatusNADD1().click();
		       Thread.sleep(1000);
		       Locator2.Status().click();
		       Thread.sleep(2000);
		       
		       
		       Locator2.Risk().click();
		       Thread.sleep(1000);
		       Locator2.RiskNADDMedium().click();
		       Thread.sleep(1000);
		       String RiskText =Locator2.RiskNADDMedium1().getText();
		       Thread.sleep(1000);
		       Locator2.RiskNADDMedium1().click();
		       Thread.sleep(1000);
		       Locator2.Risk().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       
		       Locator2.PeriodFilterCompliedHigh().click();
		       Thread.sleep(1000);
		       String PeriodText =Locator2.Mar22().getText();
		       Thread.sleep(1000);
		       Locator2.Mar22().click();
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
			
			JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			js1.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.GridCount().getText();
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
			Thread.sleep(3000);	
			
			

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(3000);
			
			
			
		
			
				
		
		
	}
	
	
	

	
	public static void PWSNotApplicableJKHillsLowMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			
		   Thread.sleep(3000);
		   Locator1.PWSNotApplicableJKHillsLow().click();					                //Clicking on Dashboard count

		    Thread.sleep(20000);
		    getDriver().switchTo().frame(Locator2.Frame());
		    Thread.sleep(5000);
		    
	       
		    Locator1.Project2().click();
		       Thread.sleep(2000);
		       String ProjectText =Locator1.Projecttext3().getText();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Projecttext3().click();
		       Thread.sleep(1000);
		       Locator1.Project2().click();
		       Thread.sleep(2000);
	       
	       
	       
		       Locator2.Status().click();
		       Thread.sleep(1000);
		       String Statustext =Locator2.StatusNADD().getText();
		       Thread.sleep(1000);
		       Locator2.StatusNADD().click();
		       Thread.sleep(1000);
		       Locator2.StatusNADD1().click();
		       Thread.sleep(1000);
		       Locator2.Status().click();
		       Thread.sleep(2000);
		       
		       
		       Locator2.Risk().click();
		       Thread.sleep(1000);
		       Locator2.RiskNADDLow().click();
		       Thread.sleep(1000);
		       String RiskText =Locator2.RiskNADDLow1().getText();
		       Thread.sleep(1000);
		       Locator2.RiskNADDLow1().click();
		       Thread.sleep(1000);
		       Locator2.Risk().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       
		       Locator2.PeriodFilterCompliedHigh().click();
		       Thread.sleep(1000);
		       String PeriodText =Locator2.Mar22().getText();
		       Thread.sleep(1000);
		       Locator2.Mar22().click();
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
			
			JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
			js1.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.GridCount().getText();
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
				 test.log(LogStatus.PASS, "Low Risk - " + filter.get(i)+" dropdown working properly.");
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
	
	
	
//////////////////////////////////////////////////
	
	
	public static void SWSSubContractorCompliedHighMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			Thread.sleep(2000);
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,1270)");
		    Thread.sleep(4000);
			
			Locator1.SWSSubContractorGreenGraph().click();
			Thread.sleep(2000);
			
		    Locator1.SWSSubContractorCompliedHigh().click();					                //Clicking on Dashboard count
		    Thread.sleep(2000);
		    
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    

		       Locator1.Project().click();
		       Thread.sleep(5000);
		       String ProjectText =Locator1.Projecttext2().getText();
		       Thread.sleep(6000);
		       Locator1.Projecttext2().click();
		       Thread.sleep(2000);
		       Locator1.Project().click();
		       Thread.sleep(2000);
		       
		       
		       Locator1.Status().click();
		       Thread.sleep(2000);
		       String Statustext =Locator1.StatusFilterCompliedHighDD().getText();
		       Thread.sleep(2000);
		       Locator1.StatusFilterCompliedHighDD().click();
		       Thread.sleep(2000);
		       Locator1.StatusFilterCompliedHighDD1().click();
		       Thread.sleep(2000);
		       
		       
		       Locator1.RiskFilterComplied().click();
		       Thread.sleep(2000);
		       Locator1.RiskFilterCompliedHigh().click();
		       Thread.sleep(2000);
		       String RiskText =Locator1.RiskFilterCompliedHighDD1().getText();
		       Thread.sleep(2000);
		       Locator1.RiskFilterCompliedHighDD1().click();
		       Thread.sleep(2000);
		       Locator1.RiskFilterComplied().click();
		       Thread.sleep(2000);
		       
		       
		       
		       
		       Locator1.PeriodFilterCompliedHigh().click();
		       Thread.sleep(2000);
		       String PeriodText =Locator1.Period().getText();
		       Thread.sleep(2000);
		       Locator1.Period().click();
		       Thread.sleep(2000);
		       Locator1.PeriodFilterCompliedHigh().click();
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
				String s = Locator1.RedGraphGrid().getText();
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
					 test.log(LogStatus.PASS, "High Risk - " +  filter.get(i)+" dropdown working properly.");
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
			
			Thread.sleep(4000);
			
			Method1.SWSSubContractorGraphMediumMultiplefilter(test, workbook);
			Thread.sleep(4000);
			
			Method1.SWSSubContractorLowMultipleFilter(test, workbook);
			
			
			Thread.sleep(4000);
			
	}
			
			
			
	
	
	
	

	
	
	
	
	public static void SWSSubContractorGraphMediumMultiplefilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
		    Locator1.SWSSubContractorGreenInYelloGraph().click();					                //Clicking on Dashboard count

		    Thread.sleep(2000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		  
		    Locator1.Project().click();
		       Thread.sleep(5000);
		       String ProjectText =Locator1.Projecttext2().getText();
		       Thread.sleep(6000);
		       Locator1.Projecttext2().click();
		       Thread.sleep(2000);
		       Locator1.Project().click();
		       Thread.sleep(2000);
		       
		       
		       Locator1.Status().click();
		       Thread.sleep(2000);
		       String Statustext =Locator1.StatusFilterCompliedHighDD().getText();
		       Thread.sleep(2000);
		       Locator1.StatusFilterCompliedHighDD().click();
		       Thread.sleep(2000);
		       Locator1.StatusFilterCompliedHighDD1().click();
		       Thread.sleep(2000);
		       
		       
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
		       
		       
		       
		       
		       Locator1.PeriodFilterCompliedHigh().click();
		       Thread.sleep(2000);
		       String PeriodText =Locator1.Period().getText();
		       Thread.sleep(2000);
		       Locator1.Period().click();
		       Thread.sleep(2000);
		       Locator1.PeriodFilterCompliedHigh().click();
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
				String s = Locator1.RedGraphGrid().getText();
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
					 test.log(LogStatus.PASS, "Medium Risk - " +  filter.get(i)+" dropdown working properly.");
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
			
			Thread.sleep(4000);
			
	//		Method1.SWSSubContractorGreenInGreenGraph(test, workbook);
			
			
			Thread.sleep(4000);
			
	}
			
			
			
	
	
	
	
	
	public static void SWSSubContractorLowMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
	    Locator1.SWSSubContractorGreenIngreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
	       Thread.sleep(2000);
	       
	       
	       Locator1.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator1.StatusFilterCompliedHighDD().getText();
	       Thread.sleep(2000);
	       Locator1.StatusFilterCompliedHighDD().click();
	       Thread.sleep(2000);
	       Locator1.StatusFilterCompliedHighDD1().click();
	       Thread.sleep(2000);
	       
	       
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
	       
	       
	       
	       
	       Locator1.PeriodFilterCompliedHigh().click();
	       Thread.sleep(2000);
	       String PeriodText =Locator1.Period().getText();
	       Thread.sleep(2000);
	       Locator1.Period().click();
	       Thread.sleep(2000);
	       Locator1.PeriodFilterCompliedHigh().click();
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
			String s = Locator1.RedGraphGrid().getText();
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
		
       	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	//////////////////////////////////
	
	
	public static void SWSSubContractorNotCompliedHighMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			Thread.sleep(2000);
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,1270)");
		    Thread.sleep(5000);
			
			Locator1.SWSSubContractorRedGraph().click();
			Thread.sleep(3000);
			
		    Locator1.SWSSubContractorNotCompliedHigh().click();					                //Clicking on Dashboard count

		    Thread.sleep(2000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		    Locator1.Project().click();
		       Thread.sleep(5000);
		       String ProjectText =Locator1.Projecttext2().getText();
		       Thread.sleep(6000);
		       Locator1.Projecttext2().click();
		       Thread.sleep(2000);
		       Locator1.Project().click();
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
	       
	       
	       Locator1.RiskFilterComplied().click();
	       Thread.sleep(2000);
	       Locator1.RiskFilterCompliedHigh().click();
	       Thread.sleep(2000);
	       String RiskText =Locator1.RiskFilterCompliedHighDD1().getText();
	       Thread.sleep(2000);
	       Locator1.RiskFilterCompliedHighDD1().click();
	       Thread.sleep(2000);
	       Locator1.RiskFilterComplied().click();
	       Thread.sleep(2000);
	       
	       
	       
	       
	       Locator2.PeriodFilterCompliedHigh().click();
	       Thread.sleep(2000);
	       String PeriodText =Locator1.Period().getText();
	       Thread.sleep(2000);
	       Locator1.Period().click();
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
				 test.log(LogStatus.PASS, "High Risk - " + filter.get(i)+" dropdown working properly.");
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
			
			Thread.sleep(4000);
			
			Method1.SWSSubContractorMediumMultipleFilter(test, workbook);
			Thread.sleep(4000);
			
			Method1.SWSSubContractorLowMultipleFilters(test, workbook);
			
			
			Thread.sleep(4000);
			
	}
			
		
	public static void SWSSubContractorMediumMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
		   Locator1.SWSSubContractorRedInYellowGraph().click();					                //Clicking on Dashboard count

		    Thread.sleep(2000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(5000);
		    
		    Locator1.Project().click();
		       Thread.sleep(5000);
		       String ProjectText =Locator1.Projecttext2().getText();
		       Thread.sleep(6000);
		       Locator1.Projecttext2().click();
		       Thread.sleep(2000);
		       Locator1.Project().click();
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
	       String PeriodText =Locator1.period5().getText();
	       Thread.sleep(2000);
	       Locator1.period5().click();
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
			Thread.sleep(3000);

			
			
			Thread.sleep(4000);
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(4000);
			
			
			
	}
			
			
			
	
	
	
	
	
	public static void SWSSubContractorLowMultipleFilters( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    Locator1.SWSSubContractorRedIngreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
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
    String PeriodText =Locator1.period6().getText();
    Thread.sleep(2000);
    Locator1.period6().click();
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
			 test.log(LogStatus.PASS, "Low Risk - " + filter.get(i)+" dropdown working properly.");
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
		
		Thread.sleep(2000);
		
		
		
	}
	
			
	
	
	public static void SWSSubContractorApplicableMediumFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
			
			
			//WebWait wait = new WebWait(, 1000);
			Thread.sleep(26000);
			
			Thread.sleep(2000);
			
		    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
		    
		    jss.executeScript("window.scrollBy(0,1270)");
		    Thread.sleep(4000);
			
			Locator1.SWSSubContractorGreyGraph().click();
			Thread.sleep(2000);
			
		    Locator1.SWSSubContractorGreyInYellowGraph().click();					                //Clicking on Dashboard count

		    Thread.sleep(5000);
		    
		    getDriver().switchTo().frame(Locator1.Frame());
		    Thread.sleep(17000);
		    
		    Locator1.Project().click();
		       Thread.sleep(5000);
		       String ProjectText =Locator1.Projecttext2().getText();
		       Thread.sleep(6000);
		       Locator1.Projecttext2().click();
		       Thread.sleep(2000);
		       Locator1.Project().click();
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
	       String PeriodText =Locator1.period7().getText();
	       Thread.sleep(2000);
	       Locator1.period7().click();
	       Thread.sleep(2000);
	     //  Locator2.PeriodFilterCompliedHigh().click();
	     //  Thread.sleep(2000);
	       
	       
	       
	       
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
			
			
				
			
			
			
			Thread.sleep(4000);
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator1.ClosePage().click();
			
			Thread.sleep(4000);
			Method1.SWSSubContractorNotApplicableLowMultipleFilter(test, workbook);
			
			Thread.sleep(4000);
			
	}
			
			
			
	
	
	
	
	
	public static void SWSSubContractorNotApplicableLowMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
	    Locator1.SWSSubContractorGreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
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
    String PeriodText =Locator1.period5().getText();
    Thread.sleep(2000);
    Locator1.period5().click();
    Thread.sleep(2000);
  //  Locator2.PeriodFilterCompliedHigh().click();
  //  Thread.sleep(2000);
    
    
    
    
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
		
       
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	////////////////////////////////////////
	
	
	
	public static void PWSSUBContractorMediumFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1900)");
	    Thread.sleep(2000);
		
		Locator1.PWSSubContractorComplied().click();
		Thread.sleep(2000);
		
	    Locator1.PWSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
			
	    
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
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
	       String PeriodText =Locator1.period7().getText();
	       Thread.sleep(2000);
	       Locator1.period7().click();
	       Thread.sleep(2000);
	      //  Locator2.PeriodFilterCompliedHigh().click();
	      //  Thread.sleep(2000);
	       
 
 
 
 
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
		
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(4000);
		
	//	Method1.YellowGraphDashboardGridCount(test, workbook);
	//	Thread.sleep(4000);
		
		
		Method1.PWSSubContractorLowMultipleFilter(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void PWSSubContractorLowMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    Locator1.PWSSubContractorCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
      
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
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
	       String PeriodText =Locator1.period7().getText();
	       Thread.sleep(2000);
	       Locator1.period7().click();
	       Thread.sleep(2000);
	      //  Locator2.PeriodFilterCompliedHigh().click();
	      //  Thread.sleep(2000);
	       




List<String> li=new ArrayList<String>();

//li.add(locationtext);
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
		
		
	    
	    
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
////////////////////////////////////////////////////
	
	public static void PWSSUBContractorNotCompliedMediumMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1900)");
	    Thread.sleep(2000);
		
		Locator1.PWSSubContractorNotComplied().click();
		Thread.sleep(2000);
		
	    Locator1.PWSSubContractorNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	  
	       Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
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
	       String PeriodText =Locator1.period7().getText();
	       Thread.sleep(2000);
	       Locator1.period7().click();
	       Thread.sleep(2000);
	      //  Locator2.PeriodFilterCompliedHigh().click();
	      //  Thread.sleep(2000);
	       

	       List<String> li=new ArrayList<String>();

	     //li.add(locationtext);
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
		
	    
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(4000);
		
	//	Method1.YellowGraphDashboardGridCount(test, workbook);
	//	Thread.sleep(4000);
		
		
		Method1.PWSSubContractorNotCompliedLowMultipleFilter(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void PWSSubContractorNotCompliedLowMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    Locator1.PWSSubContractorNotCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
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
	       String PeriodText =Locator1.period7().getText();
	       Thread.sleep(2000);
	       Locator1.period7().click();
	       Thread.sleep(2000);
	      //  Locator2.PeriodFilterCompliedHigh().click();
	      //  Thread.sleep(2000);
	       

	       List<String> li=new ArrayList<String>();

	     //li.add(locationtext);
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
		
	    
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	/////////////////////////////
	
	
	public static void PWSSUBContractorNotApplicableMediumMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1900)");
	    Thread.sleep(2000);
		
		Locator1.PWSSubContractorNotApplicable().click();
		Thread.sleep(2000);
		
	    Locator1.PWSSubContractorNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    

	    
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
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
	       String PeriodText =Locator1.period7().getText();
	       Thread.sleep(2000);
	       Locator1.period7().click();
	       Thread.sleep(2000);
	      //  Locator2.PeriodFilterCompliedHigh().click();
	      //  Thread.sleep(2000);
	       

	       List<String> li=new ArrayList<String>();

	     //li.add(locationtext);
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
		
	    
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(4000);
		
	//	Method1.YellowGraphDashboardGridCount(test, workbook);
	//	Thread.sleep(4000);
		
		
		Method1.PWSSubContractorNotApplicableLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void PWSSubContractorNotApplicableLowMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    Locator1.PWSSubContractorNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(5000);
	    

	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
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
	       String PeriodText =Locator1.period5().getText();
	       Thread.sleep(2000);
	       Locator1.period5().click();
	       Thread.sleep(2000);
	      //  Locator2.PeriodFilterCompliedHigh().click();
	      //  Thread.sleep(2000);
	       

	       List<String> li=new ArrayList<String>();

	     //li.add(locationtext);
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
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	////////////////////////////////////////////////////////
	
	
	
	
	public static void AuditCompletionStatusOverdueStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1270)");
	    Thread.sleep(5000);
		
	    Locator1.SWSSubContractorOverdue().click();					                //Clicking on Dashboard count
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(17000);
	    
	       Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
	       Thread.sleep(2000);
	       
    
    Locator2.ContractorType().click();
    Thread.sleep(4000);
    Locator1.ContractorType3().click();
    Thread.sleep(2000);
    String ContractorTypeText =Locator1.ContractorTypeS().getText();
    Thread.sleep(4000);
    Locator1.ContractorTypeS().click();
    Thread.sleep(2000);
    Locator2.ContractorType().click();
    Thread.sleep(2000);
    
    
    
    
    Locator2.Frequency().click();
    Thread.sleep(2000);
    String FrequencyText =Locator1.Frequency1().getText();
    Thread.sleep(2000);
    Locator1.Frequency1().click();
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
    String periodtext =Locator1.Period8().getText();
    Thread.sleep(2000);
   Locator1.Period8().click();
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


		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method1.AuditCompletionStatusPendingReviewMultipleFilter(test, workbook);
		
		Thread.sleep(2000);
		
		Method1.AuditCompletionStatusClosedMultipleFilter(test, workbook);
			
		Thread.sleep(2000);
		
	}
	
	
	
	
	public static void AuditCompletionStatusPendingReviewMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    Locator1.SWSSubContractorPendingReview().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(17000);
	    
	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
	       Thread.sleep(2000);
	       
 
 
 
	       Locator2.ContractorType().click();
	       Thread.sleep(4000);
	       Locator1.ContractorType3().click();
	       Thread.sleep(2000);
	       String ContractorTypeText =Locator1.ContractorTypeS().getText();
	       Thread.sleep(4000);
	       Locator1.ContractorTypeS().click();
	       Thread.sleep(2000);
	       Locator2.ContractorType().click();
	       Thread.sleep(2000);
	       
 
 
 
 
 Locator2.Frequency().click();
 Thread.sleep(2000);
 String FrequencyText =Locator1.Frequency1().getText();
 Thread.sleep(2000);
 Locator1.Frequency1().click();
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
 String periodtext =Locator1.period7().getText();
 Thread.sleep(2000);
Locator1.period7().click();
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


		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
			
		
		
	}
	
	
	
	
	public static void AuditCompletionStatusClosedMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    Locator1.SWSSubContractorClosed().click();					                //Clicking on Dashboard count

	    Thread.sleep(15000);
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(17000);
	    

	    Locator1.Project().click();
	       Thread.sleep(5000);
	       String ProjectText =Locator1.Projecttext2().getText();
	       Thread.sleep(6000);
	       Locator1.Projecttext2().click();
	       Thread.sleep(2000);
	       Locator1.Project().click();
	       Thread.sleep(2000);
	       



	       Locator2.ContractorType().click();
	       Thread.sleep(4000);
	       Locator1.ContractorType3().click();
	       Thread.sleep(2000);
	       String ContractorTypeText =Locator1.ContractorTypeS().getText();
	       Thread.sleep(4000);
	       Locator1.ContractorTypeS().click();
	       Thread.sleep(2000);
	       Locator2.ContractorType().click();
	       Thread.sleep(2000);
	       
	       Locator2.Frequency().click();
	       Thread.sleep(2000);
	       String FrequencyText =Locator1.Frequency1().getText();
	       Thread.sleep(2000);
	       Locator1.Frequency1().click();
	       Thread.sleep(2000);
	       Locator2.Frequency().click();
	       Thread.sleep(2000);

	       Locator2.Status().click();
	       Thread.sleep(2000);
	       Locator1.Closed().click();
	       Thread.sleep(2000);
	       String Statustext =Locator1.Closed1().getText();
	       Thread.sleep(2000);
	       Locator1.Closed1().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(2000);






Locator2.Period().click();
Thread.sleep(2000);
String periodtext =Locator1.period5().getText();
Thread.sleep(2000);
Locator1.period5().click();
Thread.sleep(2000);



List<String> li=new ArrayList<String>();

//li.add(locationtext);

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
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	///////////////////////////////////////////////////
	
	
	
	
	
	public static void UpcomingAuditExcelCountGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(20000);
		
        Locator1.Upcoming().click();					                //Clicking on Dashboard count
        Thread.sleep(20000);
        
       
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       
/
        */
        
        Thread.sleep(9000);
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
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
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
	
	
	
	public static void overdueExcelcountAndGridMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
        Locator1.Overdue().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
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
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Downloads\\Audit Compliances Report .xlsx");
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
	
	String fis1 = "C:\\Users\\Shital Bhoyar\\Downloads\\Audit Compliances Report .xlsx";
	
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
	
	
	
	public static void RejectedExcelAndGridCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
        Locator1.Rejected().click();					                //Clicking on Dashboard count
        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
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
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Downloads\\Audit Compliances Report .xlsx");
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
	
	String fis1 = "C:\\Users\\Shital Bhoyar\\Downloads\\Audit Compliances Report .xlsx";
	
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
	
	
	
	
	public static void PendingForReviewExcelAndGridCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
        Locator1.PendingRewiew().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
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
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Downloads\\Audit Compliances Report .xlsx");
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
	
	String fis1 = "C:\\Users\\Shital Bhoyar\\Downloads\\Audit Compliances Report .xlsx";
	
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
	
	
	
	
	public static void CountmatchExcelAndGridCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
        Locator1.CountMatchClose().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
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
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Downloads\\Audit Compliances Report .xlsx");
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
	
	String fis1 = "C:\\Users\\Shital Bhoyar\\Downloads\\Audit Compliances Report .xlsx";
	
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
	
	
	
	
////////////////////////////////////////////////////////
	
	
	
	
	public static void ACSOverdueExcelAndGridCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
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
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Downloads\\Audit Status Report .xlsx");
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
	
	String fis1 = "C:\\Users\\Shital Bhoyar\\Downloads\\Audit Status Report .xlsx";
	
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

	
	
	
	public static void ACSPendingReviewExcelAndGridCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		Locator2.ACSBlueGraph().click();
		Thread.sleep(16000);
		
		
		getDriver().switchTo().frame(Locator1.Frame());
	    Thread.sleep(9000);
      
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
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Downloads\\Audit Status Report .xlsx");
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
	
	String fis1 = "C:\\Users\\Shital Bhoyar\\Downloads\\Audit Status Report .xlsx";
	
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

	
	
	
	
	public static void DownoadAndViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator1.ReportButton().click();
		Thread.sleep(9000);
		
		Locator1.ReportTabTriangleExpand().click();
		Thread.sleep(15000);
		
		
		if(Locator1.ReportDownloadAndViewButton().isEnabled())
		{
			
			Thread.sleep(5000);
		 Locator1.ReportDownloadAndViewButton().click();
			test.log(LogStatus.PASS, "  Document Viewed Successfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Document Viewed Successfully  "  );
			
		}
		
		Thread.sleep(20000);
		
		/*
		.switchTo().frame(Locator1.Frame1());
	    Thread.sleep(20000);
	    
	    
	    if(Locator1.ReportDownloadButton().isEnabled())
		{
			
			Thread.sleep(9000);
		 Locator1.ReportDownloadButton().click();
			test.log(LogStatus.PASS, "  Report Download Successfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Report Download Successfully   "  );
			
		}
      
	    Thread.sleep(2000);
	    Locator1.ReportDownloadButton().click();
		Thread.sleep(2000);
		*/
		
		
	}
	
	
	
	public static void AuditCompletionStatusOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
	    Locator2.ACSREDGraph().click();					                
	    Thread.sleep(20000);	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);

	    Locator1.Edit1().click();					                
	    Thread.sleep(2000);
	    
        Method2.SwitchToNewlyOpenedWindow(test, workbook);
        Thread.sleep(9000);
        
	    Locator1.Comment().click();					                
	    Thread.sleep(2000);
        
	    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.CommentType().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(6000);
		
	
	if(Locator1.submitComment().isEnabled())
	{
		
		Thread.sleep(2000);
	    Locator1.submitComment().click();
		test.log(LogStatus.PASS, " Comment added Successfully " );
		
	}
	
	else
	{
		test.log(LogStatus.FAIL, "  Comment added Successfully "  );
		
	}
	
	Thread.sleep(2000);
    Locator1.CommentClose().click();					                
    Thread.sleep(2000);

	    if(Locator1.View().isEnabled())
		{
			
			Thread.sleep(9000);
		 Locator1.View().click();
			test.log(LogStatus.PASS, " View Compliance Button Working Successfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " View Compliance Button Does Not Working "  );
			
		}
	    Thread.sleep(2000);
	    
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.Download().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "View Compliance - File Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL,  "View Compliance - File Download Successfully");
		}

	   Thread.sleep(6000);
	    Locator1.Close().click();					                
	    Thread.sleep(4000);

		Locator1.SelectFile().sendKeys("E:\\BackupDesktop\\FileUploadForEntityMaster//ProjectMaster.xlsx"); // Writing Task title
		Thread.sleep(9000);
		
		 Alert ac1=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "File " + t1 );		
			Thread.sleep(4000);
			ac1.accept();
			
		    if(Locator1.DownloadAndViewButton().isEnabled())
			{
				
				Thread.sleep(9000);
			 Locator1.DownloadAndViewButton().click();
				test.log(LogStatus.PASS, "  Download document button Working Successfully  " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Download document button Does Not Working "  );
				
			}
		    Thread.sleep(2000);
		    
		    if(Locator1.ViewDocument1().isEnabled())
			{
				
				Thread.sleep(9000);
			 Locator1.ViewDocument1().click();
				test.log(LogStatus.PASS, "  View Document button Working Successfully  " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " View Document button Does Not Working "  );
				
			}
		    Thread.sleep(2000);
		 //   Locator1.Close1().click();					                
		 //   Thread.sleep(4000);
		    
		    
	
	
	}
	
	
	public static void AuditCompletionStatusPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
	    Locator2.ACSBlueGraph().click();					                
	    Thread.sleep(20000);	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);

	    Locator1.Edit1().click();					                
	    Thread.sleep(2000);
	    
        Method2.SwitchToNewlyOpenedWindow(test, workbook);
        Thread.sleep(9000);
        
	    Locator1.Comment().click();					                
	    Thread.sleep(2000);
        
	    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.CommentType().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(6000);
		
	
	if(Locator1.submitComment().isEnabled())
	{
		
		Thread.sleep(2000);
	    Locator1.submitComment().click();
		test.log(LogStatus.PASS, " Comment added Successfully " );
		
	}
	
	else
	{
		test.log(LogStatus.FAIL, "  Comment added Successfully "  );
		
	}
	
	Thread.sleep(2000);
    Locator1.CommentClose().click();					                
    Thread.sleep(2000);

	    if(Locator1.View().isEnabled())
		{
			
			Thread.sleep(9000);
		 Locator1.View().click();
			test.log(LogStatus.PASS, " View Compliance Button Working Successfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " View View Compliance Button Does Not Working "  );
			
		}
	    Thread.sleep(2000);
	    
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.Download().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "View Compliance - File Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL,  "View Compliance - File Download Successfully");
		}

	   Thread.sleep(6000);
	    Locator1.Close().click();					                
	    Thread.sleep(4000);

		Locator1.SelectFile().sendKeys("E:\\BackupDesktop\\FileUploadForEntityMaster//ProjectMaster.xlsx"); // Writing Task title
		Thread.sleep(9000);
		
		 Alert ac1=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "File " + t1 );		
			Thread.sleep(4000);
			ac1.accept();
			
		    if(Locator1.DownloadAndViewButton().isEnabled())
			{
				
				Thread.sleep(9000);
			 Locator1.DownloadAndViewButton().click();
				test.log(LogStatus.PASS, "  Download document button Working Successfully  " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Download document button Does Not Working "  );
				
			}
		    Thread.sleep(2000);
		    
		    if(Locator1.ViewDocument1().isEnabled())
			{
				
				Thread.sleep(9000);
			 Locator1.ViewDocument1().click();
				test.log(LogStatus.PASS, "  View Document button Working Successfully  " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " View Document button Does Not Working "  );
				
			}
		    Thread.sleep(2000);
	
	
	}
	
	
	public static void AuditCompletionStatusClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
	    Locator2.ACSGreenGraph().click();					                
	    Thread.sleep(20000);	    
	    
	    getDriver().switchTo().frame(Locator2.Frame());
	    Thread.sleep(5000);

	    Locator1.Edit1().click();					                
	    Thread.sleep(2000);
	    
        Method2.SwitchToNewlyOpenedWindow(test, workbook);
        Thread.sleep(9000);
        
	    Locator1.Comment().click();					                
	    Thread.sleep(2000);
        
	    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.CommentType().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(6000);
		
	
	if(Locator1.submitComment().isEnabled())
	{
		
		Thread.sleep(2000);
	    Locator1.submitComment().click();
		test.log(LogStatus.PASS, " Comment added Successfully " );
		
	}
	
	else
	{
		test.log(LogStatus.FAIL, "  Comment added Successfully "  );
		
	}
	
	Thread.sleep(2000);
    Locator1.CommentClose().click();					                
    Thread.sleep(2000);

	    if(Locator1.View().isEnabled())
		{
			
			Thread.sleep(9000);
		 Locator1.View().click();
			test.log(LogStatus.PASS, " View Button Working Successfully  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " View Button Does Not Working "  );
			
		}
	    Thread.sleep(2000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.Download().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "View Compliance - File Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL,  "View Compliance - File Download Successfully");
		}

	   Thread.sleep(6000);
	    Locator1.Close().click();					                
	    Thread.sleep(4000);

		Locator1.SelectFile().sendKeys("E:\\BackupDesktop\\FileUploadForEntityMaster//ProjectMaster.xlsx"); // Writing Task title
		Thread.sleep(9000);
		
		 Alert ac1=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "File " + t1 );		
			Thread.sleep(4000);
			ac1.accept();
			
		    if(Locator1.DownloadAndViewButton().isEnabled())
			{
				
				Thread.sleep(9000);
			 Locator1.DownloadAndViewButton().click();
				test.log(LogStatus.PASS, "  Download document button Working Successfully  " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Download document button Does Not Working "  );
				
			}
		    Thread.sleep(2000);
		    
		    if(Locator1.ViewDocument1().isEnabled())
			{
				
				Thread.sleep(9000);
			 Locator1.ViewDocument1().click();
				test.log(LogStatus.PASS, "  View Document button Working Successfully  " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " View Document button Does Not Working "  );
				
			}
		    Thread.sleep(2000);
	
	
	}

	
	
	public static void DocumentTabMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(10000);
		Locator2.Document().click();
		Thread.sleep(3000);
	    
	       Locator1.ColumnMenu().click();
	       Thread.sleep(2000);
	       Locator1.Column().click();
	       Thread.sleep(2000);
	       Locator1.ColumnLocation11().click();
	       Thread.sleep(2000);
	    //   Locator1.ColumnState1().click();
	    //   Thread.sleep(2000);
	 
		       
		 Locator1.Location11().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD().click();
	       Thread.sleep(1000);
	       Locator1.LocationDD1().click();
	       Thread.sleep(1000);
	       String LocationText =Locator1.LocationDD3().getText();
	       Thread.sleep(1000);
	       Locator1.LocationDD3().click();
	       Thread.sleep(1000);
	       Locator1.Location11().click();
	       Thread.sleep(1000);
	       
    
	       Locator2.DocumentTabSelectContractor().click();
	       Thread.sleep(2000);
	       String contractortext =Locator2.DocumentContractorDD().getText();
	       Thread.sleep(2000);
	       Locator2.DocumentContractorDD().click();
	       Thread.sleep(2000);
	       Locator2.DocumentTabSelectContractor().click();
	       Thread.sleep(5000);
    
    
    Locator2.DocumentTabSelectProject1().click();
    Thread.sleep(2000);
    String projectText =Locator2.DocumentTabSelectProjectDD().getText();
    Thread.sleep(2000);
    Locator2.DocumentTabSelectProjectDD().click();
    Thread.sleep(2000);
    Locator2.DocumentTabSelectProject1().click();
    Thread.sleep(2000);
    
    
    
    
     List<String> li=new ArrayList<String>();
     
     li.add(LocationText);
     li.add(contractortext);
     li.add(projectText);
    
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
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
	
		List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[2]"));
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(entitycol);
				}
			else if(i==1)
				{
					raw.addAll(contractorcol);
				}
			else if(i==2)
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
			test.log(LogStatus.PASS, " The applied filter get cleared after clicking on the clear button " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  The applied filter not get cleared after clicking on the clear button "  );
			
		}
		
	
		
	}
	

	public static void MyWorkspaceLicense( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(10000);
			
		   Locator1.MyWorkspace().click();
		   Thread.sleep(3000);
		   
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='linoticeCase']"))); 
			Thread.sleep(1000);
			
	if(Locator1.Audit().isDisplayed()&&Locator1.License().isDisplayed()) {
				
				test.log(LogStatus.PASS, "Audit and License tab should be seen under the my workspace tab.");
			}else {
				
				test.log(LogStatus.FAIL, "Audit and License tab should not be seen under the my workspace tab.");
				
			}
		
		    
			Locator1.Audit().click();
			Thread.sleep(3000);
		   
			
	}
	
	public static void MyWorkspaceLicenseSearch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(10000);
			
		   Locator1.MyWorkspace().click();
		   Thread.sleep(3000);
		   
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='linoticeCase']"))); 
			Thread.sleep(1000);
			
			Locator1.License().click();
			Thread.sleep(2000);
		  
			Locator1.Serach().sendKeys("AK Heights");
			Thread.sleep(3000);
		   if(Locator1.Clear().isEnabled()) {
			   Thread.sleep(2000);
			   Locator1.Clear().click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Clear button working properly");

		   }
		   else
		   {
			   test.log(LogStatus.PASS, "Clear button does not working properly");
		   }
			
		   Thread.sleep(1000);
		   Method1.LicenceGridAndExcelCount(test,workbook);
		   
		   /*
			File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			Locator1.Export().click();
			
		 	Thread.sleep(9000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Excel Report download successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL,  "Excel Report does not download successfully");
			}
*/
		   Thread.sleep(2000);
          if(Locator1.viewlicensedocument().isEnabled()) {
			   
        	  Thread.sleep(2000);
			   Locator1.viewlicensedocument().click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Licence document viewed successfully");

		   }
		   else
		   {
			   test.log(LogStatus.PASS, "Licence document does not viewed");
		   }
		   
          Thread.sleep(2000);
          
          getDriver().switchTo().frame(Locator1.OuterFrame());
          Thread.sleep(1000);
          getDriver().switchTo().frame(Locator1.InnerFrame());
          
			File dir = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			Locator1.Download1().click();
			
		 	Thread.sleep(9000);
			File dir1 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		  
	        
		   if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "License document download successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL,  "License document does not download successfully");
			}
		   Thread.sleep(1000);
		   
		   
	}

	
	
	public static void LicenceGridAndExcelCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
	
		Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        
        Thread.sleep(3000);
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
 		
		Thread.sleep(4000);
 
        File dir9 = new File("C:\\Users\\shitalb\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.Export().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\shitalb\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " Excel Report Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, "  Excel Report Does Not Download Successfully "   );

 		}   
 	   Thread.sleep(4000);

		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\License Report .xlsx");
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
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\License Report .xlsx";
	
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
	
	

	public static void MyWorkspaceRenewLicense( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(10000);
			
		   Locator1.MyWorkspace().click();
		   Thread.sleep(3000);
		   
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='linoticeCase']"))); 
			Thread.sleep(1000);
			
			Locator1.License().click();
			Thread.sleep(1000);
			
			Locator1.ColumnSetting().click();
			Thread.sleep(1000);
			
			Locator1.Filter().click();
			Thread.sleep(1000);
			
			Locator1.Expiring().click();
			Thread.sleep(1000);
			
			Locator1.Expired().click();
			Thread.sleep(1000);
			
			Locator1.FilterButton().click();
			Thread.sleep(1000);
			
			
			
		/*    
JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(2000);
		   
		   Locator.All().click();
		   Thread.sleep(3000);
		   
		   Locator.PagingDD1().click();
		   Thread.sleep(3000);
		   
		   JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	        
	        js1.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(2000);
	 		*/
		   	    
			Locator1.RenewLicense().click();
			Thread.sleep(1000);
			
			String l = Locator1.Label().getText();
			Thread.sleep(1000);
			
			Locator1.RegistractionNo().sendKeys(l);
			Thread.sleep(1000);
			
			String t = Locator1.EndDateLabel().getText();
			Thread.sleep(1000);
			
			
			Locator1.StartDateCalender().click();
			Thread.sleep(1000);
			
			Locator1.ChangeMonthDrop().click();
			Thread.sleep(1000);
						
			Locator1.StartDateCalenderDD().click();
			Thread.sleep(1000);
			
			Locator1.EndDateCalender().sendKeys("30-Dec-2024");
			Thread.sleep(2000);
			
		//	Locator1.EndDateCalenderDD().sendKeys("30-Dec-2024");
		//	Thread.sleep(1000);
			
			Locator1.HeadCount().sendKeys("10");
			Thread.sleep(1000);
			
			Locator1.Remark1().sendKeys("Renewed");
			Thread.sleep(1000);
			
			Locator1.SelectFile1().sendKeys("E:\\BackupDesktop\\FileUploadForEntityMaster\\License Report .xlsx");
			Thread.sleep(1000);
			
			Locator1.Updatelicenseandsendforapprovalbutton().click();
			Thread.sleep(1000);
			
            Alert ac1=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t1 );		
			Thread.sleep(4000);
			ac1.accept();
			
			
	
	}

	

	public static void MyWorkspaceResendForApproval( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(10000);
			
		   Locator1.MyWorkspace().click();
		   Thread.sleep(3000);
		   
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='linoticeCase']"))); 
			Thread.sleep(1000);
			
			Locator1.License().click();
			Thread.sleep(1000);
			
			Locator1.ColumnSetting().click();
			Thread.sleep(1000);
			
			Locator1.Filter().click();
			Thread.sleep(1000);
			
			Locator1.Rejected1().click();
			Thread.sleep(1000);
		
			Locator1.FilterButton().click();
			Thread.sleep(1000);
			/*
			 JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(2000);
		   
		   Locator.All().click();
		   Thread.sleep(3000);
		   
		   Locator.PagingDD1().click();
		   Thread.sleep(3000);
		   
		   JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	        
	        js1.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(2000);
	 	*/
		    	    
			Locator1.ResendForApproval().click();
			Thread.sleep(2000);
			
			/*
			String l = Locator1.Label().getText();
			Thread.sleep(1000);
			
			Locator1.RegistractionNo().sendKeys(l);
			Thread.sleep(1000);
			
			Locator1.StartDateCalender().click();
			Thread.sleep(1000);
				
			Locator1.StartDateCalenderDD().click();
			Thread.sleep(1000);
			
			Locator1.EndDateCalender().click();
			Thread.sleep(2000);
			
			Locator1.EndDateCalenderDD().click();
			Thread.sleep(1000);
			
			Locator1.HeadCount().sendKeys("10");
			Thread.sleep(1000);
			
			Locator1.Remark1().sendKeys("Renewed");
			Thread.sleep(1000);
			*/
			Locator1.SelectFile1().sendKeys("E:\\BackupDesktop\\FileUploadForEntityMaster\\License Report .xlsx");
			Thread.sleep(2000);
			
			Locator1.Updatelicenseandsendforapprovalbutton().click();
			Thread.sleep(2000);
			
            Alert ac1=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t1 );		
			Thread.sleep(4000);
			ac1.accept();
			Thread.sleep(500);
			
	
	}

	
	public static void MyWorkspacePreviousDocumentView( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(10000);
			
		   Locator1.MyWorkspace().click();
		   Thread.sleep(3000);
		   
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='linoticeCase']"))); 
			Thread.sleep(1000);
			
			Locator1.License().click();
			Thread.sleep(1000);
			
			Locator1.ColumnSetting().click();
			Thread.sleep(1000);
			
			Locator1.Filter().click();
			Thread.sleep(1000);
			
			Locator1.Rejected1().click();
			Thread.sleep(1000);
		
			Locator1.FilterButton().click();
			Thread.sleep(1000);
		    	    
			Locator1.Drop().click();
			Thread.sleep(2000);

	         if(Locator1.ViewLicenseDocument().isEnabled()) {
				   
	        	  Thread.sleep(2000);
				   Locator1.ViewLicenseDocument().click();
					Thread.sleep(2000);
					test.log(LogStatus.PASS, "Licence document viewed successfully");

			   }
			   else
			   {
				   test.log(LogStatus.PASS, "Licence document does not viewed");
			   }
			   
	          Thread.sleep(2000);
	          
	          getDriver().switchTo().frame(Locator1.OuterFrame());
	          Thread.sleep(1000);
	          getDriver().switchTo().frame(Locator1.InnerFrame());
	          
				File dir = new File("C:\\Users\\shitalb\\Downloads");
				File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(3000);
				Locator1.Download1().click();
				
			 	Thread.sleep(9000);
				File dir1 = new File("C:\\Users\\shitalb\\Downloads");
				File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
				
				Thread.sleep(3000);
			  
		        
			   if (dirContents.length < allFilesNew.length) {
					test.log(LogStatus.PASS,  "License document download successfully");
				}
			   else
			   {
					test.log(LogStatus.FAIL,  "License document does not download successfully");
				}
			   Thread.sleep(1000);
			 
			
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
		
		
	
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

