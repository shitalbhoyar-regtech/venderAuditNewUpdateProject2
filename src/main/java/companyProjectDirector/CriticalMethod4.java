package companyProjectDirector;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyAdmin.Locator;
import companyAuditor.Locator2;
import companyContractor.Locator1;
import companyManagement.Locator5;
import companyProjectHead.Locator3;
import login.BasePage;


public class CriticalMethod4 extends BasePage{
	
	
	
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable

	
	
	public static void LocationPopupColumnist( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(20000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divLocationCount']"))); 
		Thread.sleep(1000);
		Locator4.Location().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Locationdetailinfo']/div[1]/div/table/thead/tr/th[1]/a[2]"))); 

if(Locator4.LocationColumn().isDisplayed()&&Locator4.AdressColumn().isDisplayed()&&Locator4.EmailColumn().isDisplayed()&&Locator4.ContactPersonColumn().isDisplayed()) {
			
			test.log(LogStatus.PASS, "The Column of Location, Adress, Email and contact person should be seen in the Location popup");
		}else {
			
			test.log(LogStatus.FAIL, "The Column of Location, Adress, Email and contact person should be not seen in the Location popup");
			
		}
	        
		
	}

	public static void LocationPopupCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divCompletionCount']"))); 
		Thread.sleep(1000);
		
		
if(Locator4.ComplianceTab().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Compliance box should be seen on the Dashboard");
		}else {
			
			test.log(LogStatus.FAIL, "Compliance box should not seen on the Dashboard");
			
		}
	        
		
	}

	

	
	
	public static void ProjectsCountGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(20000);
		
		int open = Integer.parseInt(Locator4.Projects().getText());	//Reading Dashboard count.
        Locator4.Projects().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

		String item = Locator4.Projectsgrid().getText();
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
	
	
	
	
	public static void ContractorsCountGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(20000);
		
		int open = Integer.parseInt(Locator4.Contractors().getText());	//Reading Dashboard count.
        Locator4.Contractors().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

		String item = Locator4.Contractorsgrid().getText();
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
		
		Locator4.GreenGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator4.RedGraph().getText());	//Reading Dashboard count.
	    Locator4.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(6000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(18000);

		String item = Locator4.RedGraphGrid().getText();
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
						
		test.log(LogStatus.FAIL, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.ClearButtonRedGraphGrid().click();
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
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator4.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method4.YellowGraphDashboardGridCount(test, workbook);
		Thread.sleep(4000);
		
		
		Method4.GreenInGreenGraph(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
	}
	
	
	
	public static void RedInRedGraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator4.RedGraph2().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator4.RedGraphInRed().getText());	//Reading Dashboard count.
	    Locator4.RedGraphInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator4.RedGraphInRedGrid().getText();
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
		
		
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.RedGraphInRedGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.RedGraphInRedGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button does not working properly "  );
			
		}
		
		
		
		
		
        Thread.sleep(2000);
		
		if(Locator4.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator4.ClosePage().click();
		
		Thread.sleep(2000);
		
		Method4.RedInYellowCountMatch(test, workbook);
		
		Thread.sleep(4000);
		
		Method4.RedInGreenGraphCountMatch(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
	}
	

	public static void GreyInRedCountMtch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator4.GreyGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator4.GreyInRed().getText());	//Reading Dashboard count.
	    Locator4.GreyInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator4.GreyInRedGrid().getText();
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
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.GreyInRedGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.GreyInRedGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator4.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.GreyInRedGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator4.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		Method4.GreyGraphYellowCountMatch(test, workbook);
		
		Thread.sleep(4000);
		
		Method4.GreyGraphCountMatchGreen(test, workbook);
		Thread.sleep(2000);
		
		
	
	}
	

	
	public static void AuditCompletionStatusRed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		
		
		int open = Integer.parseInt(Locator4.ACSREDGraph().getText());	//Reading Dashboard count.
	    Locator4.ACSREDGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator4.ACSREDGraphGrid().getText();
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
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.ACSREDGraphGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.ACSREDGraphGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		/*
		if(Locator4.ACSREDGraphGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.ACSREDGraphGridExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		*/
		Thread.sleep(4000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(10000);
	     Locator4.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(6000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   
	   else
	   {
			test.log(LogStatus.FAIL, "File does not Download Successfully");
		}

		
		Thread.sleep(4000);

		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator4.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method4.AuditCompletionStatusBlueGraph(test, workbook);
		
		Thread.sleep(4000);
		
		Method4.AuditCompletionStatusGreenGraph(test, workbook);
			
		Thread.sleep(2000);
		
	}
	
	
	
    public static void CTWCompliedgreen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(9000);
		
		Locator4.CTWCompliedGreen().click();
		Thread.sleep(7000);
		
		int open = Integer.parseInt(Locator4.CTWCompliedGreenHigh().getText());	//Reading Dashboard count.
	    Locator4.CTWCompliedGreenHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
     JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator4.CTWCompliedGreenHighGrid().getText();
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
						
		test.log(LogStatus.FAIL, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
      Thread.sleep(2000);
		
		if(Locator4.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator4.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method4.CTWCompliedMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method4.CTWCompliedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
	}
	
	
	
	
	public static void CTWNotCompliedRed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(9000);
		
		Locator4.CTWNotCompliedRed().click();
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator4.CTWNotCompliedRedHigh().getText());	//Reading Dashboard count.
	    Locator4.CTWNotCompliedRedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator3.CTWCompliedGreenHighGrid().getText();
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
						
		test.log(LogStatus.FAIL, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator4.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(3000);
		    Locator4.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method4.CTWNotCompliedRedMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method4.CTWNotCompliedRedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
	}
	
	
	
	
	
	public static void CTWNotApplicableGrey( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(9000);
		
		Locator4.CTWNotApplicableGrey().click();
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator4.CTWNotApplicableHigh().getText());	//Reading Dashboard count.
	    Locator4.CTWNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator4.CTWCompliedGreenHighGrid().getText();
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
						
		test.log(LogStatus.FAIL, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator4.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
	
		
		Method4.CTWNotApplicableMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method4.CTWNotApplicableLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
	}
	
	
	
	
	public static void CTWAuditStatusSummeryOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1600)");
	    Thread.sleep(9000);
		
		
		
		int open = Integer.parseInt(Locator4.CTWOverdueRed().getText());	//Reading Dashboard count.
	    Locator4.CTWOverdueRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator4.ACSREDGraphGrid().getText();
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
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.ACSREDGraphGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.ACSREDGraphGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		/*
		if(Locator4.ACSREDGraphGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.ACSREDGraphGridExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		*/
		
		Thread.sleep(4000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(10000);
	     Locator4.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(6000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   
	   else
	   {
			test.log(LogStatus.FAIL, "File does not Download Successfully");
		}

		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method4.CTWAuditStatusSummeryPendingReview(test, workbook);
		
		Thread.sleep(4000);
		
		Method4.CTWAuditStatusSummeryCompleted(test, workbook);
			
		Thread.sleep(2000);
		
	}
	
	
	
	public static void PWCSSABCConstructionCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		*/
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
		
	//	Locator1.CompliedCircle().click();
	//	   Thread.sleep(3000);
		    
	  //  Locator4.NotCompliedCircle().click();
	//	Thread.sleep(3000);
		    
		// Locator4.NotApplicableCircle().click();
		  Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator4.PWCSSABCConstructionCompliedHigh().getText());	//Reading Dashboard count.
	    Locator4.PWCSSABCConstructionCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(18000);

		String item = Locator4.CTWCompliedGreenHighGrid().getText();
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
						
		test.log(LogStatus.FAIL, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator4.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method4.PWCSSABCConstructionCompliedMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method4.PWCSSABCConstructionCompliedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
	
	}
	
	
	public static void PWCSSABCconstructionNotCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
	    
	//    Locator4.CompliedCircle().click();
	//	   Thread.sleep(3000);
		    
	  //  Locator4.NotCompliedCircle().click();
	//	Thread.sleep(3000);
		    
	//	 Locator4.NotApplicableCircle().click();
	//    Thread.sleep(3000);
	    */
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(4000);
		
		int open = Integer.parseInt(Locator4.PWCSSABCconstructionNotCompliedHigh().getText());	//Reading Dashboard count.
	    Locator4.PWCSSABCconstructionNotCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator4.CTWCompliedGreenHighGrid().getText();
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
						
		test.log(LogStatus.FAIL, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator4.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method4.PWCSSABCconstructionNotCompliedMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method4.PWCSSABCconstructionNotCompliedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
	
	}
	
	
	
	public static void PWCSSABCconstructionNotApplicableHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
	    
	    
	  //  Locator4.CompliedCircle().click();
		//   Thread.sleep(3000);
		    
	//    Locator4.NotCompliedCircle().click();
	//	Thread.sleep(3000);
		    
	//	 Locator4.NotApplicableCircle().click();
	//	  Thread.sleep(3000);
	    */
	    
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSABCconstructionNotApplicableHigh().getText());	//Reading Dashboard count.
	    Locator4.PWCSSABCconstructionNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator4.CTWCompliedGreenHighGrid().getText();
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
						
		test.log(LogStatus.FAIL, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		   Thread.sleep(5000);
	       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,-1000)");
		    Thread.sleep(2000);    
		
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator4.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method4.PWCSSABCconstructionNotApplicableMedium(test, workbook);
		Thread.sleep(4000);
		Method4.PWCSSABCconstructionNotApplicableLow(test, workbook);	
		Thread.sleep(4000);
		
	
		
	}
	
	
	
	
	public static void PWAuditStatusSummeryABCConstructionOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(18000);
		
		
		
		int open = Integer.parseInt(Locator4.PWAuditStatusSummeryABCConstructionOverdue().getText());	//Reading Dashboard count.
	    Locator4.PWAuditStatusSummeryABCConstructionOverdue().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.ACSREDGraphGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.ACSREDGraphGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSREDGraphGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		/*
		if(Locator3.ACSREDGraphGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSREDGraphGridExportButton().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		*/
		Thread.sleep(4000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(10000);
	     Locator4.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(6000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   
	   else
	   {
			test.log(LogStatus.FAIL, "File does not Download Successfully");
		}

		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method4.PWAuditStatusSummerABCConstructionPendingReview(test, workbook);
		
		Thread.sleep(3000);
		
		Method4.PWAuditStatusSummerABCConstructionCompleted(test, workbook);
		Thread.sleep(3000);
		
		
	}
	
	

	
	public static void PWCSSubcontractorCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(2000);
	    
	   
		
		Locator4.PWCSSubContractorComplied().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorCompliedMedium().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(9000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator5.CTWCompliedGreenHighGrid().getText();
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
		
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method4.PWCSSubcontractorLow(test, workbook);
		Thread.sleep(2000);
		
    }
	
	
	
	
	public static void PWCSSubcontractorLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
	    
		
		Locator3.PWCSSubContractorComplied().click();
		
		*/
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorCompliedLow().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(6000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator5.CTWCompliedGreenHighGrid().getText();
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
		
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		
		
		
		
	}
	
	
	
	public static void PWCSSubcontractorNotCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
	    
		
		Locator4.PWCSSubContractorNotComplied().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorNotCompliedMedium().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator5.CTWCompliedGreenHighGrid().getText();
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
		
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method4.PWCSSubcontractorNotCompliedLow(test, workbook);
		Thread.sleep(2000);
		
    }
	
	
	public static void PWCSSubcontractorNotCompliedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
	    
		
		Locator3.PWCSSubContractorComplied().click();
		
		*/
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorNotCompliedLow().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorNotCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator5.CTWCompliedGreenHighGrid().getText();
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
		
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		
		
		
		
	}
	
	
	
	
	public static void PWCSSubcontractorNotApplicableMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
	    
		
		Locator4.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorNotApplicableMedium().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator5.CTWCompliedGreenHighGrid().getText();
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
		
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
	//	Method5.PWCSSubcontractorNotCompliedLow(test, workbook);
	//	Thread.sleep(2000);
		
    }
	
	
	
	public static void DownloadAndViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator3.Report().click();
		Thread.sleep(20000);
		
		 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		 js1.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(9000);
			
		
		Locator4.ProjectDrop1().click();
		Thread.sleep(7000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
	    
		 js2.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(9000);
			
		
		if(Locator4.ProjectDropViewButton1().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator4.ProjectDropViewButton1().click();
			test.log(LogStatus.PASS, " Download And Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Download And View Button Is not Clickable "  );
			
		}
		Thread.sleep(4000);
		
	}
	
	
	public static void DocumentViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator4.Document().click();
		Thread.sleep(20000);
		
		
		
		if(Locator4.DocumentView().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.DocumentView().click();
			test.log(LogStatus.PASS, " Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		
	}
	
	
	
	
	
	public static void DownoloadCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator4.Document().click();
		Thread.sleep(20000);
		
		Locator4.DocumentCheckBox().click();
		Thread.sleep(2000);
		
	//	Locator4.DocumentCheckBox1().click();
	//	Thread.sleep(6000);
		
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
	     Locator4.DocumentDownloadIcon().click();
		
	 	Thread.sleep(10000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   
	   else
	   {
			test.log(LogStatus.FAIL, "File does not Download Successfully");
		}
		
		
	
		
	}
	
	
	
	
	public static void multipleDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator4.Document().click();
		Thread.sleep(20000);
		
		Locator4.DocumentCheckBox().click();
		Thread.sleep(2000);
		
		Locator4.DocumentCheckBox1().click();
		Thread.sleep(6000);
		
		
		
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(10000);
	     Locator4.DocumentDownload().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(6000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   
	   else
	   {
			test.log(LogStatus.FAIL, "File does not Download Successfully");
		}
		
	
		
		
	}
	
	
	public static void DocumentClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator4.Document().click();
		Thread.sleep(20000);
		
		Locator4.DocumentSelectLocation().click();
		Thread.sleep(2000);
		
	//	Locator4.DocumentSelectLocationDrop().click();
	//	Thread.sleep(2000);
		
		Locator4.DocumentSelectLocationDropDown().click();
		Thread.sleep(2000);
		
		Locator4.DocumentSelectContractor().click();
		Thread.sleep(2000);
		
		Locator4.DocumentSelectContractorDropDown().click();
		Thread.sleep(2000);
		
		Locator4.DocumentSelectProject().click();
		Thread.sleep(2000);
		
		Locator4.DocumentSelectProjectDropDown().click();
		Thread.sleep(2000);
		
		
		if(Locator4.DocumentClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.DocumentClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
	}
	
	
	
	
	public static void ExtendReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator4.Report().click();
		Thread.sleep(20000);
		
		
		
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
	     Locator4.ReportExtendReport().click();
		
	 	Thread.sleep(5000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File does not Download Successfully");
		}

		
		
		
		
		
	}
	
	
	
	public static void AuditMonthComplianceReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator4.Report().click();
		Thread.sleep(20000);
		
		Thread.sleep(1000);
		
		File dir5 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents5 = dir5.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator.ActionColmnReportDownload().click();
		
	 	Thread.sleep(18000);
		File dir6 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew6 = dir6.listFiles();						//Counting number of files in directory after download
		
	   
	    Thread.sleep(9000);
	   if (dirContents5.length < allFilesNew6.length) {
			test.log(LogStatus.PASS,  "Excel Format Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Excel Format Does Not Downloaded Successfully");
		}		

	   Thread.sleep(1000);
	   
	   Locator.Status1().click();
	   Thread.sleep(500);
	   Locator.Status1DD().click();
	   Thread.sleep(500);
	   
	   if (Locator.PDFViewandDownload().isEnabled()) {
		   
		   Locator.PDFViewandDownload().click();
		   Thread.sleep(500);
			test.log(LogStatus.PASS,  "PDF Viewed Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "PDF Does Not Viewed Successfully");
		}
	   Thread.sleep(500);
	   getDriver().switchTo().frame(Locator.Frame());
		Thread.sleep(3000);
	
		getDriver().switchTo().frame(Locator2.InnerFrame());
		Thread.sleep(7000);
		
		File dir = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator.Downloadasapdf().click();
		
	 	Thread.sleep(18000);
		File dir1 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir1.listFiles();						//Counting number of files in directory after download
		
	   
	    Thread.sleep(9000);
	   if (dirContents.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "PDF Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "PDF Does Not Downloaded Successfully");
		}		
	   Thread.sleep(500);

		
	}
	
	
	   
	public static void ReportClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator4.Report().click();
		Thread.sleep(20000);
		
		Locator4.ReportState().click();
		Thread.sleep(2000);
		
		Locator4.ReportStateDropDown().click();
		Thread.sleep(2000);
		
		Locator4.ReportClearButton().click();
		Thread.sleep(2000);
		
		if(Locator4.ReportClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.ReportClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
	}
	
	
	
	
	public static void MoreReportDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator4.Report().click();
		Thread.sleep(20000);
		
		Locator4.ReportMoreReport().click();
		Thread.sleep(2000);
		/*
		if(Locator4.ClosedAuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.ClosedAuditReport().click();
			test.log(LogStatus.PASS, " Closed Audit Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Closed Audit Report Download Successfully "  );
			
		}
		*/
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(4000);
	     Locator4.ClosedAuditReport().click();
		
	 	Thread.sleep(20000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(6000);
	   if (dirContents1.length < allFilesNew1.length) {
		   Thread.sleep(2000);
			test.log(LogStatus.PASS,  "Closed Audit Report Download Successfully");
		}
	   else
	   {
		   Thread.sleep(2000);
			test.log(LogStatus.FAIL, "Closed Audit Report Does Not Download Successfully");
		}

	   Thread.sleep(2000);
		
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		*/
		
		File dir = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(4000);
	     Locator.MouthCloseReportR().click();
		
	 	Thread.sleep(20000);
		File dir1 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(6000);
	   if (dirContents.length < allFilesNew.length) {
		   Thread.sleep(2000);
			test.log(LogStatus.PASS,  "Month Wise Closed Audit Report Download Successfully");
		}
	   else
	   {
		   Thread.sleep(2000);
			test.log(LogStatus.FAIL, "Month Wise Closed Audit Report Does Not Download Successfully");
		}

	   Thread.sleep(2000);

		/*
		
		Locator4.MonthReport().click();
		
		Thread.sleep(2000);
		
		Locator4.MonthReportDD().click();
		
		Thread.sleep(2000);
		
	//	Locator3.MonthWiseClosedAuditReport().click();
		
		
		if(Locator4.MonthWiseClosedAuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.MonthWiseClosedAuditReport().click();
			test.log(LogStatus.PASS, " Month Wise Closed Audit Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Month Wise Closed Audit Report Download Successfully  "  );
			
		}
		*/
		
		Thread.sleep(2000);
		/*
		if(Locator4.ComplianceRemarkReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.ComplianceRemarkReport().click();
			test.log(LogStatus.PASS, " Compliance Remark Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Compliance Remark Report Download Successfully  "  );
			
		}
		*/
		File dira = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContentsa = dira.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(4000);
	     Locator4.ComplianceRemarkReport().click();
		
	 	Thread.sleep(20000);
		File dirb = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNewb = dirb.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(6000);
	   if (dirContentsa.length < allFilesNewb.length) {
		   Thread.sleep(2000);
			test.log(LogStatus.PASS,  "Compliance Remark Report Download Successfully");
		}
	   else
	   {
		   Thread.sleep(2000);
			test.log(LogStatus.FAIL, "Compliance Remark Report Does Not Download Successfully");
		}

	   Thread.sleep(2000);
		/*
		if(Locator4.AuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.AuditReport().click();
			test.log(LogStatus.PASS, " Audit Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Audit Report Download Successfully  "  );
			
		}
		*/
	   
		File dirc = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContentsc = dirc.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(4000);
	     Locator4.AuditReport().click();
		
	 	Thread.sleep(20000);
		File dird = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNewd = dird.listFiles();						//Counting number of files in directory after download
		
	   
       Thread.sleep(6000);
	   if (dirContentsc.length < allFilesNewd.length) {
		   Thread.sleep(2000);
			test.log(LogStatus.PASS,  "Audit Report Download Successfully");
		}
	   else
	   {
		   Thread.sleep(2000);
			test.log(LogStatus.FAIL, "Audit Report Does Not Download Successfully");
		}

	   Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	public static void ViewButtonReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator4.Report().click();
		Thread.sleep(20000);
		
		Locator4.ProjectDrop().click();
		Thread.sleep(9000);
		
		
		if(Locator4.ProjectDropViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.ProjectDropViewButton().click();
			test.log(LogStatus.PASS, " View button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View button does not working properly "  );
			
		}
		
	}
	
	
	
	
	
	
	

}
