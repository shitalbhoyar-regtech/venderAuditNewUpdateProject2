package companyManagement;

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

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyAdmin.Locator;
import companyAuditor.Locator2;
import companyContractor.Locator1;
import companyProjectDirector.Locator4;
import companyProjectDirector.Method4;
import companyProjectHead.Locator3;
import companyProjectHead.Method3;
import login.BasePage;

public class Method5 extends BasePage{
	
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable

	
	
	
	
	
	
	
	
	
	public static void ProjectsCountGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(20000);
		
		int open = Integer.parseInt(Locator5.Projects().getText());	//Reading Dashboard count.
        Locator5.Projects().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

		String item = Locator5.Projectsgrid().getText();
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
		
		int open = Integer.parseInt(Locator5.Contractors().getText());	//Reading Dashboard count.
        Locator5.Contractors().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

		String item = Locator5.Contractorsgrid().getText();
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
		
		Locator5.GreenGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator5.RedGraph().getText());	//Reading Dashboard count.
	    Locator5.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(6000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(18000);

		String item = Locator5.RedGraphGrid().getText();
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
		
		
		Locator5.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator5.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator5.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.ClearButtonRedGraphGrid().click();
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator5.ViewRedButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.ViewRedButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator5.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method5.YellowGraphDashboardGridCount(test, workbook);
		Thread.sleep(4000);
		
		
		Method5.GreenInGreenGraph(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
	public static void YellowGraphDashboardGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator5.YellowGraph().getText());	//Reading Dashboard count.
	    Locator5.YellowGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator5.YellowGraphGrid().getText();
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
		
		Locator5.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator5.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator5.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator5.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator5.YellowGraphViewButton().click();
				test.log(LogStatus.PASS, "  Overview Button working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
				
			}
			
			
			Thread.sleep(4000);
		
		
			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator5.ClosePage().click();
			
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
		
		int open = Integer.parseInt(Locator5.GreenGraphinGreen().getText());	//Reading Dashboard count.
	    Locator5.GreenGraphinGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator5.GreenGraphinGreenGrid().getText();
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
		
		Locator5.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator5.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator5.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator5.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator5.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	//Red SWS
	
	
	
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
		int open = Integer.parseInt(Locator5.RedGraph2Green().getText());	//Reading Dashboard count.
	    Locator5.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator5.RedGraph2GreenGrid().getText();
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
		
		Locator5.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator5.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator5.RedGraph2GreenClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.RedGraph2GreenClearButton().click();
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator5.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(2000);
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator5.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void RedInYellowCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		int open = Integer.parseInt(Locator5.RedGraphInYellow().getText());	//Reading Dashboard count.
	    Locator5.RedGraphInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator5.RedGraphInYellowGrid().getText();
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
		
		
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		
		Thread.sleep(2000);
		Locator5.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator5.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator5.RedGraphInYellowClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.RedGraphInYellowClearButton().click();
			test.log(LogStatus.PASS, "  Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator5.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator5.ClosePage().click();
		
		Thread.sleep(2000);
		

	}
	
	
	
	
	
	
	
	public static void RedInRedGraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
			
		Locator5.RedGraph2().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator5.RedGraphInRed().getText());	//Reading Dashboard count.
	    Locator5.RedGraphInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator5.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator5.RedGraphInRedGrid().getText();
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
		
		
		
		Locator5.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator5.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator5.RedGraphInRedGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.RedGraphInRedGridClearButton().click();
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
			
		}
		
		
		
		
		
        Thread.sleep(2000);
		
		if(Locator5.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.GreenViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator5.ClosePage().click();
		
		Thread.sleep(2000);
		
		Method5.RedInYellowCountMatch(test, workbook);
		
		Thread.sleep(4000);
		
		Method5.RedInGreenGraphCountMatch(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
	}
	

	
	//Grey
	
		/// Status Wise Summery Not Applicable
			
			
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
				
				int open = Integer.parseInt(Locator5.GreyInGreenGraph().getText());	//Reading Dashboard count.
			    Locator5.GreyInGreenGraph().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
			    
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.GreyInGreenGraphGrid().getText();
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
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.GreyInGreenClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.GreyInGreenClearButton().click();
					test.log(LogStatus.PASS, "  Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				Thread.sleep(2000);
				
				if(Locator5.ViewGreyInGreen().isEnabled())
				{
					
					Thread.sleep(4000);
				    Locator5.ViewGreyInGreen().click();
					test.log(LogStatus.PASS, "   Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
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
				
				int open = Integer.parseInt(Locator5.GreyInYellow().getText());	//Reading Dashboard count.
			    Locator5.GreyInYellow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.GreyInGreenGraphGrid().getText();
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
			    
			    
			    Thread.sleep(2000);
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.GreyInYellowClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.GreyInYellowClearButton().click();
					test.log(LogStatus.PASS, "  Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
					
				}
				
				Thread.sleep(2000);
				
				if(Locator5.GreyInYellowViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.GreyInYellowViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, " Overview Button working Properly "  );
					
				}
				

				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
				
				
			}
			
			
			
			
			//SWS Not Applicable
			
			
			public static void GreyInRedCountMtch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(2000);
				
				Locator5.GreyGraph().click();
				Thread.sleep(2000);
				
				int open = Integer.parseInt(Locator5.GreyInRed().getText());	//Reading Dashboard count.
			    Locator5.GreyInRed().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.GreyInRedGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.GreyInRedGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.GreyInRedGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				Thread.sleep(2000);
				
				if(Locator5.GreyInRedGridViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.GreyInRedGridViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				Method5.GreyGraphYellowCountMatch(test, workbook);
				
				Thread.sleep(2000);
				
				
				Method5.GreyGraphCountMatchGreen(test, workbook);
				Thread.sleep(2000);
				
				
			
			}

	
	
	
	
	//Audit Completion Status - Status Wise Summary
			
			
			
			
			
			public static void AuditCompletionStatusRed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(2000);
				
				
				
				int open = Integer.parseInt(Locator5.ACSREDGraph().getText());	//Reading Dashboard count.
			    Locator5.ACSREDGraph().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(18000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.ACSREDGraphGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.ACSREDGraphGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				if(Locator5.ACSREDGraphGridExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(3000);
				
				Method5.AuditCompletionStatusBlueGraph(test, workbook);
				
				Thread.sleep(4000);
				
				Method5.AuditCompletionStatusGreenGraph(test, workbook);
					
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
				
				int open = Integer.parseInt(Locator5.ACSBlueGraph().getText());	//Reading Dashboard count.
			    Locator5.ACSBlueGraph().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(18000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.ACSBlueGraphGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.ACSBlueGraphGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSBlueGraphGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				if(Locator5.ACSBlueGraphGridExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSBlueGraphGridExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
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
				
				int open = Integer.parseInt(Locator5.ACSGreenGraph().getText());	//Reading Dashboard count.
			    Locator5.ACSGreenGraph().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.ACSGreenGraphGreed().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.ACSGreenGraphGreedClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSGreenGraphGreedClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				if(Locator5.ACSGreenGraphGreedExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSGreenGraphGreedExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
				
				
}
	
	
	
	
	//Contractor Wise Compliance Summery
	
			public static void CTWCompliedgreen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
            {
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,800)");
			    Thread.sleep(2000);
				
				Locator5.CTWCompliedGreen().click();
				Thread.sleep(2000);
				
				int open = Integer.parseInt(Locator5.CTWCompliedGreenHigh().getText());	//Reading Dashboard count.
			    Locator5.CTWCompliedGreenHigh().click();					                //Clicking on Dashboard count

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
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
		        Thread.sleep(2000);
				
				if(Locator4.CTWCompliedGreenHighGridViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.CTWCompliedGreenHighGridViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
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
			
			
			
			
			
				
			public static void CTWCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator4.CTWCompliedGreenMedium().getText());	//Reading Dashboard count.
			    Locator4.CTWCompliedGreenMedium().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
			    Thread.sleep(5000);
			    
			    
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(18000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator4.YellowGraphGrid().getText();
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
				
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator2.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator2.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "   Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator2.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator2.YellowGraphViewButton().click();
						test.log(LogStatus.PASS, "  Overview Button working Properly " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
						
					}
					
					
					Thread.sleep(4000);
				
				
					
					getDriver().switchTo().parentFrame();
					
					Thread.sleep(4000);
					
					Locator4.ClosePage().click();
					
					Thread.sleep(2000);
				
				
			}
			
			
			
			
			
			
			
			public static void CTWCompliedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
				
				int open = Integer.parseInt(Locator4.CTWCompliedGreenLow().getText());	//Reading Dashboard count.
			    Locator4.CTWCompliedGreenLow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator3.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator4.GreenGraphinGreenGrid().getText();
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
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				Thread.sleep(2000);
				
				if(Locator4.GreenViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.GreenViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
			}
			

		      //Not Complied
			
			
			
			
			public static void CTWNotCompliedRed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,800)");
			    Thread.sleep(2000);
				
				Locator5.CTWNotCompliedRed().click();
				Thread.sleep(2000);
				
				int open = Integer.parseInt(Locator5.CTWNotCompliedRedHigh().getText());	//Reading Dashboard count.
			    Locator5.CTWNotCompliedRedHigh().click();					                //Clicking on Dashboard count

			    Thread.sleep(3000);
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
			   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				//Thread.sleep(500);	
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
				//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
					
				Thread.sleep(4000);
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,11000)");
			    Thread.sleep(9000);

				String item = Locator5.CTWCompliedGreenHighGrid().getText();
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
				
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.CTWCompliedGreenHighGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.CTWCompliedGreenHighGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
		        Thread.sleep(2000);
				
				if(Locator5.CTWCompliedGreenHighGridViewButton().isEnabled())
				{
					
					Thread.sleep(3000);
				    Locator5.CTWCompliedGreenHighGridViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
				
				Thread.sleep(4000);
				
				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(4000);
				
				Method5.CTWNotCompliedRedMedium(test, workbook);
				Thread.sleep(4000);
				
				
				Method5.CTWNotCompliedRedLow(test, workbook);
				
				
				Thread.sleep(4000);
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
				
			public static void CTWNotCompliedRedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator5.CTWNotCompliedRedmedium().getText());	//Reading Dashboard count.
			    Locator5.CTWNotCompliedRedmedium().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
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
				
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "   Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator4.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator4.YellowGraphViewButton().click();
						test.log(LogStatus.PASS, "  Overview Button working Properly " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
						
					}
					
					
					Thread.sleep(4000);
				
				
					
					getDriver().switchTo().parentFrame();
					
					Thread.sleep(4000);
					
					Locator3.ClosePage().click();
					
					Thread.sleep(2000);
				
				
			}
			
			
			
			
			
			
			
			public static void CTWNotCompliedRedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
				
				int open = Integer.parseInt(Locator4.CTWNotCompliedRedLow().getText());	//Reading Dashboard count.
			    Locator4.CTWNotCompliedRedLow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator4.GreenGraphinGreenGrid().getText();
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
				
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				Thread.sleep(2000);
				
				if(Locator4.GreenViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.GreenViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
			}
			

			//Not Applicable
			
			
			
			public static void CTWNotApplicableGrey( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,800)");
			    Thread.sleep(2000);
				
				Locator5.CTWNotApplicableGrey().click();
				Thread.sleep(2000);
				
				int open = Integer.parseInt(Locator5.CTWNotApplicableHigh().getText());	//Reading Dashboard count.
			    Locator5.CTWNotApplicableHigh().click();					                //Clicking on Dashboard count

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
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
		        Thread.sleep(2000);
				
				if(Locator4.CTWCompliedGreenHighGridViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.CTWCompliedGreenHighGridViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
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
			
			
			
			
			
				
			public static void CTWNotApplicableMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator4.CTWNotApplicableMedium().getText());	//Reading Dashboard count.
			    Locator4.CTWNotApplicableMedium().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
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
				
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "  Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator4.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator4.YellowGraphViewButton().click();
						test.log(LogStatus.PASS, "   Overview Button working Properly " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
						
					}
					
					
					Thread.sleep(4000);
				
				
					
					getDriver().switchTo().parentFrame();
					
					Thread.sleep(4000);
					
					Locator3.ClosePage().click();
					
					Thread.sleep(2000);
				
				
			}
			
			
			
			
			
			
			
			public static void CTWNotApplicableLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
				
				int open = Integer.parseInt(Locator4.CTWNotApplicableLow().getText());	//Reading Dashboard count.
			    Locator4.CTWNotApplicableLow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator3.Frame());
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
				
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "  Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				Thread.sleep(2000);
				
				if(Locator4.GreenViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.GreenViewButton().click();
					test.log(LogStatus.PASS, "   Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Overview Button working Properly "  );
					
				}
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
			}
			

	
	
	
	//Contractor Type Wise Audit Status Summery
			
			
			
			public static void CTWAuditStatusSummeryOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,1550)");
			    Thread.sleep(18000);
				
				
				
				int open = Integer.parseInt(Locator5.CTWOverdueRed().getText());	//Reading Dashboard count.
			    Locator5.CTWOverdueRed().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.ACSREDGraphGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.ACSREDGraphGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				if(Locator5.ACSREDGraphGridExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(3000);
				
				Method5.CTWAuditStatusSummeryPendingReview(test, workbook);
				
				Thread.sleep(4000);
				
				Method5.CTWAuditStatusSummeryCompleted(test, workbook);
					
				Thread.sleep(2000);
				
			}
			
			
			
			
			public static void CTWAuditStatusSummeryPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(5000);
				
				*/
				
				int open = Integer.parseInt(Locator5.CTWPendingReviewYellow().getText());	//Reading Dashboard count.
			    Locator5.CTWPendingReviewYellow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(18000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.ACSBlueGraphGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.ACSBlueGraphGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSBlueGraphGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				if(Locator5.ACSBlueGraphGridExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSBlueGraphGridExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
				
				
					
				
				
			}
			
			
			
			
			
			
			
			public static void CTWAuditStatusSummeryCompleted( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(2000);
				
				*/
				
				int open = Integer.parseInt(Locator5.CTWCompletedGreen().getText());	//Reading Dashboard count.
			    Locator5.CTWCompletedGreen().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.ACSGreenGraphGreed().getText();
				String[] bits = item.split(" ");								//Splitting the String
				String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
				int count1 = Integer.parseInt(compliancesCount);

				
				
				if(open == count1)
							
				{
								
				//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
								
				test.log(LogStatus.PASS, "  Completed -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
							
				}
							
				else
							
				{
								
				//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
								
				test.log(LogStatus.FAIL, " Completed - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
							
				}
				
				
				// clear button
				
		        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
			    
			    jss1.executeScript("window.scrollBy(0,-1000)");
			    Thread.sleep(2000);
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.ACSGreenGraphGreedClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSGreenGraphGreedClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				if(Locator5.ACSGreenGraphGreedExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSGreenGraphGreedExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
				
				
			}
			
			

//Project Wise Compliance Status Summary
			
			
			public static void PWCSSABCConstructionCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
            {
				
				
				//WebWait wait = new WebWait(, 1000);
				
				Thread.sleep(26000);
				
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
				
				Locator5.PWCSSABCConstructionComplied().click();
				Thread.sleep(2000);
				
				
			//	Locator1.CompliedCircle().click();
			//	   Thread.sleep(3000);
				    
			  //  Locator4.NotCompliedCircle().click();
			//	Thread.sleep(3000);
				    
				// Locator4.NotApplicableCircle().click();
				  Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator5.PWCSSABCConstructionCompliedHigh().getText());	//Reading Dashboard count.
			    Locator5.PWCSSABCConstructionCompliedHigh().click();					                //Clicking on Dashboard count

			    Thread.sleep(3000);
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
			   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				//Thread.sleep(500);	
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
				//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
					
				Thread.sleep(4000);
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,11000)");
			    Thread.sleep(18000);

				String item = Locator5.CTWCompliedGreenHighGrid().getText();
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
				
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.CTWCompliedGreenHighGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.CTWCompliedGreenHighGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
		        Thread.sleep(2000);
				
				if(Locator5.CTWCompliedGreenHighGridViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.CTWCompliedGreenHighGridViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
				
				Thread.sleep(4000);
				
				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(4000);
				
				Method5.PWCSSABCConstructionCompliedMedium(test, workbook);
				Thread.sleep(4000);
				
				
				Method5.PWCSSABCConstructionCompliedLow(test, workbook);	
				Thread.sleep(4000);
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
				
			public static void PWCSSABCConstructionCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator5.PWCSSABCConstructionCompliedMedium().getText());	//Reading Dashboard count.
			    Locator5.PWCSSABCConstructionCompliedMedium().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
			    
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(18000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.YellowGraphGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "   Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator5.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator5.YellowGraphViewButton().click();
						test.log(LogStatus.PASS, "  Overview Button working Properly " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
						
					}
					
					
					Thread.sleep(4000);
				
				
					
					getDriver().switchTo().parentFrame();
					
					Thread.sleep(4000);
					
					Locator5.ClosePage().click();
					
					Thread.sleep(2000);
				
				
			}
			
			
			
			
			
			
			
			public static void PWCSSABCConstructionCompliedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
				
				int open = Integer.parseInt(Locator5.PWCSSABCConstructionCompliedLow().getText());	//Reading Dashboard count.
			    Locator5.PWCSSABCConstructionCompliedLow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.GreenGraphinGreenGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				Thread.sleep(2000);
				
				if(Locator5.GreenViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.GreenViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
			}
			

	
	//Not Complied
			
			
			
			public static void PWCSSABCconstructionNotCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
            {
				
				
				//WebWait wait = new WebWait(, 1000);
				
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
			    
				
				Locator5.PWCSSABCConstructionComplied().click();
				Thread.sleep(4000);
				
				int open = Integer.parseInt(Locator5.PWCSSABCconstructionNotCompliedHigh().getText());	//Reading Dashboard count.
			    Locator5.PWCSSABCconstructionNotCompliedHigh().click();					                //Clicking on Dashboard count

			    Thread.sleep(9000);
			    
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
				
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.CTWCompliedGreenHighGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.CTWCompliedGreenHighGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
		        Thread.sleep(2000);
				
				if(Locator5.CTWCompliedGreenHighGridViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.CTWCompliedGreenHighGridViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
				
				Thread.sleep(4000);
				
				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(4000);
				
				Method5.PWCSSABCconstructionNotCompliedMedium(test, workbook);
				Thread.sleep(4000);
				
				
				Method5.PWCSSABCconstructionNotCompliedLow(test, workbook);
				
				
				Thread.sleep(4000);
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
				
			public static void PWCSSABCconstructionNotCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator5.PWCSSABCconstructionNotCompliedMedium().getText());	//Reading Dashboard count.
			    Locator5.PWCSSABCconstructionNotCompliedMedium().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
			    
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(18000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.YellowGraphGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "   Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator5.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator5.YellowGraphViewButton().click();
						test.log(LogStatus.PASS, "  Overview Button working Properly " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
						
					}
					
					
					Thread.sleep(4000);
				
				
					
					getDriver().switchTo().parentFrame();
					
					Thread.sleep(4000);
					
					Locator5.ClosePage().click();
					
					Thread.sleep(2000);
				
				
			}
			
			
			
			
			
			
			
			public static void PWCSSABCconstructionNotCompliedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				/*
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(2000);
				
				Locator2.GreenGraph().click();
				Thread.sleep(2000);
				
				*/
				
				
				
				
				Thread.sleep(6000);
				
				int open = Integer.parseInt(Locator5.PWCSSABCconstructionNotCompliedLow().getText());	//Reading Dashboard count.
			    Locator5.PWCSSABCconstructionNotCompliedLow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.GreenGraphinGreenGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				Thread.sleep(2000);
				
				if(Locator5.GreenViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.GreenViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
			}
			

	
	
	//Not Applicable
			
			
			
			public static void PWCSSABCconstructionNotApplicableHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
            {
				
				
				//WebWait wait = new WebWait(, 1000);
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
			    
			    
				
				Locator5.PWCSSABCConstructionComplied().click();
				Thread.sleep(6000);
				
				int open = Integer.parseInt(Locator5.PWCSSABCconstructionNotApplicableHigh().getText());	//Reading Dashboard count.
			    Locator5.PWCSSABCconstructionNotApplicableHigh().click();					                //Clicking on Dashboard count

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
				
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.CTWCompliedGreenHighGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.CTWCompliedGreenHighGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
		        Thread.sleep(2000);
				
				if(Locator5.CTWCompliedGreenHighGridViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.CTWCompliedGreenHighGridViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
				
				Thread.sleep(4000);
				
				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(4000);
				
				Method5.PWCSSABCconstructionNotApplicableMedium(test, workbook);
				Thread.sleep(4000);
				
				
				Method5.PWCSSABCconstructionNotApplicableLow(test, workbook);
				
				
				Thread.sleep(4000);
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
				
			public static void PWCSSABCconstructionNotApplicableMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator5.PWCSSABCconstructionNotApplicableMedium().getText());	//Reading Dashboard count.
			    Locator5.PWCSSABCconstructionNotApplicableMedium().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
			    
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,200)");
			    Thread.sleep(18000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.YellowGraphGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "   Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear Button working Properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator5.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator5.YellowGraphViewButton().click();
						test.log(LogStatus.PASS, "  Overview Button working Properly " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
						
					}
					
					
					Thread.sleep(4000);
				
				
					
					getDriver().switchTo().parentFrame();
					
					Thread.sleep(4000);
					
					Locator5.ClosePage().click();
					
					Thread.sleep(2000);
				
				
			}
			
			
			
			
			
			
			
			public static void PWCSSABCconstructionNotApplicableLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
				
				int open = Integer.parseInt(Locator5.PWCSSABCconstructionNotApplicableLow().getText());	//Reading Dashboard count.
			    Locator5.PWCSSABCconstructionNotApplicableLow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.GreenGraphinGreenGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				Thread.sleep(2000);
				
				if(Locator5.GreenViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.GreenViewButton().click();
					test.log(LogStatus.PASS, "  Overview Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
					
				}
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
			}
			

	

			
			//Project Wise Audit Status Summery
			
			
			
			
			public static void PWAuditStatusSummeryABCConstructionOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,2350)");
			    Thread.sleep(18000);
				
				
				
				int open = Integer.parseInt(Locator5.PWAuditStatusSummeryABCConstructionOverdue().getText());	//Reading Dashboard count.
			    Locator5.PWAuditStatusSummeryABCConstructionOverdue().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.ACSREDGraphGrid().getText();
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.ACSREDGraphGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				if(Locator5.ACSREDGraphGridExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(3000);
				
				Method5.PWAuditStatusSummerABCConstructionPendingReview(test, workbook);
				
				Thread.sleep(3000);
				
				Method5.PWAuditStatusSummerABCConstructionClosed(test, workbook);
				Thread.sleep(3000);
				
			
			}   
			
			
			public static void PWAuditStatusSummerABCConstructionPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,2350)");
			    Thread.sleep(18000);
				
				*/
				
				int open = Integer.parseInt(Locator5.PWAuditStatusSummerABCConstructionPendingReview().getText());	//Reading Dashboard count.
			    Locator5.PWAuditStatusSummerABCConstructionPendingReview().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.ACSREDGraphGrid().getText();
				String[] bits = item.split(" ");								//Splitting the String
				String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
				int count1 = Integer.parseInt(compliancesCount);

				
				
				if(open == count1)
							
				{
								
				//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
								
				test.log(LogStatus.PASS, " Pending Review -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
							
				}
							
				else
							
				{
								
				//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
								
				test.log(LogStatus.FAIL, " Pending Review - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
							
				}
				
				
				// clear button
				
		        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
			    
			    jss1.executeScript("window.scrollBy(0,-1000)");
			    Thread.sleep(2000);
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.ACSREDGraphGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				if(Locator5.ACSREDGraphGridExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(3000);
				
			}
			

			public static void PWAuditStatusSummerABCConstructionClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,2350)");
			    Thread.sleep(18000);
				
				*/
				
				int open = Integer.parseInt(Locator5.PWAuditStatusSummerABCConstructionClosed().getText());	//Reading Dashboard count.
			    Locator5.PWAuditStatusSummerABCConstructionClosed().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator5.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator5.ACSREDGraphGrid().getText();
				String[] bits = item.split(" ");								//Splitting the String
				String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
				int count1 = Integer.parseInt(compliancesCount);

				
				
				if(open == count1)
							
				{
								
				//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
								
				test.log(LogStatus.PASS, " Closed -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
							
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
				
				Locator5.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator5.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator5.ACSREDGraphGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridClearButton().click();
					test.log(LogStatus.PASS, " Clear Button working Properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
					
				}
				
				
				
				if(Locator5.ACSREDGraphGridExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator5.ACSREDGraphGridExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator5.ClosePage().click();
				
				Thread.sleep(3000);
				
			}
			
			

		
	
	
	public static void DocumentViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator5.Document().click();
		Thread.sleep(20000);
		
		
		
		if(Locator5.DocumentView().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.DocumentView().click();
			test.log(LogStatus.PASS, " View Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button working Properly "  );
			
		}
		
		
		
	}
	
	
	
	
	public static void DownoloadCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator5.Document().click();
		Thread.sleep(20000);
		
		
		if(Locator3.DocumentDownload().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.DocumentDownload().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		
		/*
		
		File dir2 = new File("C:\\Users\\Shital Bhoyar\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(5000);
	     Locator5.DocumentDownloadIcon().click();
		
	 	Thread.sleep(5000);
		File dir3 = new File("C:\\\\Users\\\\Shital Bhoyar\\\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(5000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   
	   else
	   {
			test.log(LogStatus.FAIL, "Filet does not Download Successfully");
		}
		
		
	*/
		
	}
	
	
	
	
	public static void multipleDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator5.Document().click();
		Thread.sleep(20000);
		
		Locator5.DocumentCheckBox().click();
		Thread.sleep(2000);
		
		Locator5.DocumentCheckBox1().click();
		Thread.sleep(4000);
		
		
		
		
		if(Locator3.DocumentDownload().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.DocumentDownload().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		/*
		File dir2 = new File("C:\\Users\\Shital Bhoyar\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
	     Locator5.DocumentDownload().click();
		
	 	Thread.sleep(7000);
		File dir3 = new File("C:\\\\Users\\\\Shital Bhoyar\\\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   
	   else
	   {
			test.log(LogStatus.FAIL, "File does not Download Successfully");
		}
		
	*/
		
		
	}
	
	
	public static void DocumentClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator5.Document().click();
		Thread.sleep(9000);
		
		Locator5.DocumentSelectLocation().click();
		Thread.sleep(2000);
		
	//	Locator5.DocumentSelectLocationDrop().click();
	//	Thread.sleep(2000);
		
		Locator5.DocumentSelectLocationDropDown().click();
		Thread.sleep(2000);
		
		Locator5.DocumentSelectContractor().click();
		Thread.sleep(2000);
		
		Locator5.DocumentSelectContractorDropDown().click();
		Thread.sleep(2000);
		
		Locator5.DocumentSelectProject().click();
		Thread.sleep(2000);
		
		Locator5.DocumentSelectProjectDropDown().click();
		Thread.sleep(2000);
		
		
		if(Locator5.DocumentClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.DocumentClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button Does Not Working Properly "  );
			
		}
		
		
		
	}
	
	
	
	
	public static void ExtendReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator5.Report().click();
		Thread.sleep(20000);
		
		
		
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
	     Locator5.ReportExtendReport().click();
		
	 	Thread.sleep(3000);
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
		Locator5.Report().click();
		Thread.sleep(20000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
		 js1.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(9000);
		
		Locator1.LastPaging().click();
		Thread.sleep(3000);
	
		
		JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
	    
		 js2.executeScript("window.scrollBy(0,-1000)");
		 Thread.sleep(9000);
			
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator5.ReportFileDownload().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Audit Month Compliance Report Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Audit Month Compliance Report Does Not Download Successfully");
		}

		
		
	}
	
	
	   
	public static void ReportClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator5.Report().click();
		Thread.sleep(20000);
		
		Locator5.ReportState().click();
		Thread.sleep(2000);
		
		Locator5.ReportStateDropDown().click();
		Thread.sleep(2000);
		
		Locator5.ReportClearButton().click();
		Thread.sleep(2000);
		
		if(Locator5.ReportClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.ReportClearButton().click();
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
	}
	
	
	
	
	public static void MoreReportDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator5.Report().click();
		Thread.sleep(20000);
		
		Locator5.ReportMoreReport().click();
		Thread.sleep(2000);
		
		if(Locator5.ClosedAuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.ClosedAuditReport().click();
			test.log(LogStatus.PASS, " Closed Audit Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Closed Audit Report Download Successfully "  );
			
		}
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		Locator5.SelectMonth().click();
		Thread.sleep(2000);
		
		Locator5.SelectMonthDD().click();
		Thread.sleep(5000);
		
		if(Locator.MouthCloseReportR().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.MouthCloseReportR().click();
			test.log(LogStatus.PASS, "Month Wise Closed Audit Report Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Month Wise Closed Audit Report Download Successfully"  );
			
		}
		
		
		
		/*
		Locator5.MonthWiseClosedAuditReport().click();
		
		
        Thread.sleep(20000);
		
		
        Alert ac=.switchTo().alert();
		
		String t1=.switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Month Wise Closed Audit Report -" + t1 );
		
		Thread.sleep(4000);
		ac.accept();
		*/
		
		
		Thread.sleep(9000);
		
		if(Locator5.ComplianceRemarkReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.ComplianceRemarkReport().click();
			test.log(LogStatus.PASS, " Compliance Remark Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Compliance Remark Report Download Successfully  "  );
			
		}
		
		Thread.sleep(9000);
		

		
		if(Locator5.AuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.AuditReport().click();
			test.log(LogStatus.PASS, " Audit Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Audit Report Download Successfully  "  );
			
		}
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	public static void ViewButtonReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator5.Report().click();
		Thread.sleep(20000);
		
		Locator5.ProjectDrop().click();
		Thread.sleep(9000);
		
		
		
		
		
		if(Locator5.ProjectDropViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator5.ProjectDropViewButton().click();
			test.log(LogStatus.PASS, " View Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " View Button working Properly "  );
			
		}
		
	}
	
	
	
	///Multiple Filter Verification
	
	
	public static void CompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(6000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(10000);
	   
       
     
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
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
			
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
		
	    Locator2.GreenGraphinGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
      
       
     
       Locator5.Project().click();
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
       String PeriodText =Locator5.May23().getText();
       Thread.sleep(2000);
       Locator5.May23().click();
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
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
	      JavascriptExecutor jse = (JavascriptExecutor) ;
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
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
	      JavascriptExecutor jse = (JavascriptExecutor) ;
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
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
	      JavascriptExecutor jse = (JavascriptExecutor) ;
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
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(3000);
		
	    Locator2.GreyInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
	    Locator2.GreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
	    
	    jss.executeScript("window.scrollBy(0,350)");
	    Thread.sleep(2000);
	    
		Locator3.ACSREDGraph().click();
		Thread.sleep(3000);
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
		
	   
       Locator3.Project().click();
       Thread.sleep(2000);
     //  Locator3.ProjectReport().click();
     //  Thread.sleep(2000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(2000);
       Locator3.ClosedProject().click();
       Thread.sleep(2000);
       Locator3.Project().click();
       Thread.sleep(2000);
       
       
       
       Locator3.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator3.ContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator3.ContractorTypeDD().click();
       Thread.sleep(2000);
       Locator3.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator3.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator3.FrequencyDD().getText();
       Thread.sleep(2000);
       Locator3.FrequencyDD().click();
       Thread.sleep(2000);
       Locator3.Frequency().click();
       Thread.sleep(2000);
       
       Locator3.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator3.StatusOverdue().getText();
       Thread.sleep(2000);
       Locator3.StatusOverdue().click();
       Thread.sleep(2000);
       Locator3.StatusOverdue1().click();
       Thread.sleep(2000);
       Locator3.Status().click();
       Thread.sleep(2000);
       
       
       
       Locator3.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator3.PeriodOverdue().getText();
       Thread.sleep(2000);
      Locator3.PeriodOverdue().click();
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

		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-1000)");	
		Thread.sleep(3000);
		
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
		
		
		
	}

	
	
	
	
	public static void ACSPendingReviewMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,350)");
	    Thread.sleep(2000);
	    
		Locator3.ACSBlueGraph().click();
		Thread.sleep(16000);
		
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
		
	   
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator3.ClosedProject().getText();
	       Thread.sleep(2000);
	       Locator3.ClosedProject().click();
	       Thread.sleep(2000);
	       Locator3.Project().click();
	       Thread.sleep(2000);
       
       
       
       Locator3.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator3.ContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator3.ContractorTypeDD().click();
       Thread.sleep(2000);
       Locator3.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator3.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator3.FrequencyDD().getText();
       Thread.sleep(2000);
       Locator3.FrequencyDD().click();
       Thread.sleep(2000);
       Locator3.Frequency().click();
       Thread.sleep(2000);
       
       Locator3.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator3.StatusPendingReview().getText();
       Thread.sleep(2000);
       Locator3.StatusPendingReview().click();
       Thread.sleep(2000);
       Locator3.StatusPendingReview1().click();
       Thread.sleep(2000);
       Locator3.Status().click();
       Thread.sleep(2000);
       
       
       
       
       
       Locator3.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator3.PeriodFilterCompliedMediumDD().getText();
       Thread.sleep(2000);
      Locator3.PeriodFilterCompliedMediumDD().click();
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

		
		
	}

	
	
	
	
	public static void CTWCompliedgreen1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(2000);
		
		Locator3.CTWCompliedGreen().click();
		Thread.sleep(2000);
		
	    Locator3.CTWCompliedGreenCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(10000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.Project2().getText();
	       Thread.sleep(3000);
	       Locator2.Project2().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
    
    
    Locator3.Status().click();
    Thread.sleep(2000);
    String Statustext =Locator3.StatusFilterCompliedHighDD().getText();
    Thread.sleep(2000);
    Locator3.StatusFilterCompliedHighDD().click();
    Thread.sleep(2000);
    Locator3.StatusFilterCompliedHighDD1().click();
    Thread.sleep(2000);
    Locator3.Status().click();
    Thread.sleep(5000);
    
    
    Locator3.Risk().click();
    Thread.sleep(2000);
    Locator3.RiskFilterCompliedHigh().click();
    Thread.sleep(2000);
    String RiskText =Locator3.RiskFilterCompliedHighDD1().getText();
    Thread.sleep(2000);
    Locator3.RiskFilterCompliedHighDD1().click();
    Thread.sleep(2000);
    Locator3.Risk().click();
    Thread.sleep(2000);
    
    
    
    
    Locator3.PeriodFilterCompliedHigh().click();
    Thread.sleep(2000);
    String PeriodText =Locator3.PeriodFilterCompliedMediumDD().getText();
    Thread.sleep(2000);
    Locator3.PeriodFilterCompliedMediumDD().click();
    Thread.sleep(2000);
    Locator3.PeriodFilterCompliedHigh().click();
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

		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method3.CTWCompliedMedium1(test, workbook);
		Thread.sleep(4000);
		
		Method3.CTWCompliedLow1(test, workbook);
		
		Thread.sleep(4000);
		
	
	}
	
	
	
	public static void CTWNotCompliedRed1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(2000);
		
		Locator5.CTWNotCompliedRed().click();
		Thread.sleep(2000);
		
		Locator5.CTWNotCompliedRedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
    String PeriodText =Locator2.Feb23().getText();
    Thread.sleep(2000);
    Locator2.Feb23().click();
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

		
	   
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method3.CTWNotCompliedRedMedium1(test, workbook);
		Thread.sleep(4000);
		
		
		Method3.CTWNotCompliedRedLow1(test, workbook);
		Thread.sleep(4000);
		
		
	
	}
	
	
	
	
	
	public static void CTWNotApplicableGrey1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(2000);
		
		Locator5.CTWNotApplicableGrey().click();
		Thread.sleep(2000);
		
	    Locator5.CTWNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
 String PeriodText =Locator5.May23().getText();
 Thread.sleep(2000);
 Locator5.May23().click();
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

		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(4000);
	
		
		Method3.CTWNotApplicableMedium1(test, workbook);
		Thread.sleep(4000);
		
		
		Method3.CTWNotApplicableLow1(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
	}
	
	
	
	
	
		
	public static void CTWNotApplicableMedium1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
	    Locator3.CTWNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	   
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

			
			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			Locator3.ClosePage().click();
			
			Thread.sleep(2000);
		
		
	}
	
	
	
	
	
	
	
	public static void CTWNotApplicableLow1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
	    Locator3.CTWNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
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
		
		Locator3.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	
	public static void CTWAuditStatusSummeryOverdue1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(18000);
		
	    Locator5.CTWOverdueRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	  
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(2000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(2000);
	       Locator3.Project().click();
	       Thread.sleep(2000);
 

	       Locator2.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator3.Status1Overdue().getText();
	       Thread.sleep(2000);
	       Locator3.Status1Overdue().click();
	       Thread.sleep(2000);
	       Locator3.Status2Overdue().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(5000);
 
 
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	       String ContractorTypeText =Locator3.PWCSSubContractorContractorTypeDD11().getText();
	       Thread.sleep(2000);
	       Locator3.PWCSSubContractorContractorTypeDD11().click();
	       Thread.sleep(2000);
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	       
	       
	       
	       
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       String FrequencyText =Locator3.Frequency2().getText();
	       Thread.sleep(2000);
	       Locator3.Frequency2().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Jul23().getText();
	       Thread.sleep(2000);
	      Locator2.Jul23().click();
	      Thread.sleep(2000);
	      
	       
	      
 
 
  List<String> li=new ArrayList<String>();
  
//  li.add(locationtext);
  li.add(ProjectText);
  li.add(Statustext);
  li.add(ContractorTypeText);
  li.add(FrequencyText);
  li.add(periodtext);
  
  Thread.sleep(3000);
  
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Contractor Type");
		filter.add("Frequency");
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
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(contractorcol);
			}
				
			else if(i==3)
			{
				raw.addAll(frequencycol);
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
	
	
	
	public static void CTWAuditStatusSummeryPendingReview1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(10000);
		
	    Locator5.CTWPendingReviewYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	  
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(2000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(2000);
	       Locator3.Project().click();
	       Thread.sleep(2000);
 

	       Locator2.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator3.Status1PendingReview().getText();
	       Thread.sleep(2000);
	       Locator3.Status1PendingReview().click();
	       Thread.sleep(2000);
	       Locator3.Status2PendingReview().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(5000);
 
 
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	       String ContractorTypeText =Locator3.PWCSSubContractorContractorTypeDD11().getText();
	       Thread.sleep(2000);
	       Locator3.PWCSSubContractorContractorTypeDD11().click();
	       Thread.sleep(2000);
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	      
	       
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       String FrequencyText =Locator3.Frequency2().getText();
	       Thread.sleep(2000);
	       Locator3.Frequency2().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Jan24().getText();
	       Thread.sleep(2000);
	      Locator2.Jan24().click();
	      Thread.sleep(2000);
	      
	       
	      
 
 
  List<String> li=new ArrayList<String>();
  
//  li.add(locationtext);
  li.add(ProjectText);
  li.add(Statustext);
  li.add(ContractorTypeText);
  li.add(FrequencyText);
  li.add(periodtext);
  
  Thread.sleep(3000);
  
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("ContractorType");
		filter.add("Frequency");
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
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(contractorcol);
			}
				
			else if(i==3)
			{
				raw.addAll(frequencycol);
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
	
	
	
	
	
	
	public static void PWCSCompliedGraphMultipleFilterHigh1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    
	    
	    Thread.sleep(6000);
		
		Locator5.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator5.PWCSSABCConstructionCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	  
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);
       
       
       Locator3.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator3.StatusFilterCompliedHighDD().getText();
       Thread.sleep(2000);
       Locator3.StatusFilterCompliedHighDD().click();
       Thread.sleep(2000);
       Locator3.StatusFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator3.Status().click();
       Thread.sleep(5000);
       
       
       Locator3.Risk().click();
       Thread.sleep(2000);
       Locator3.RiskFilterCompliedHigh().click();
       Thread.sleep(2000);
       String RiskText =Locator3.RiskFilterCompliedHighDD1().getText();
       Thread.sleep(2000);
       Locator3.RiskFilterCompliedHighDD1().click();
       Thread.sleep(2000);
       Locator3.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       Locator3.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.Mar23().getText();
       Thread.sleep(2000);
       Locator2.Mar23().click();
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
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		Locator5.PWCSSABCConstructionComplied().click();
		Thread.sleep(5000);
		
		
	    Locator5.PWCSSABCConstructionCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	   
	       Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator2.Jan24().getText();
       Thread.sleep(2000);
       Locator2.Jan24().click();
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
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    
	    
	    Thread.sleep(2000);
		
		Locator5.PWCSSABCConstructionComplied().click();
		Thread.sleep(5000);
			
	    Locator5.PWCSSABCConstructionCompliedLow().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	   
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator2.Jan24().getText();
       Thread.sleep(2000);
       Locator2.Jan24().click();
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

	
	
	
	public static void PWCSSNotCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(5000);
		
		Locator5.PWCSSABCConstructionComplied().click();
		Thread.sleep(4000);
		
	    Locator5.PWCSSABCconstructionNotCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator2.Mar23().getText();
       Thread.sleep(2000);
       Locator2.Mar23().click();
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
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(4000);
	    
		Locator5.PWCSSABCConstructionComplied().click();
		Thread.sleep(4000);
		
	    Locator5.PWCSSABCconstructionNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator2.Feb23().getText();
       Thread.sleep(2000);
       Locator2.Feb23().click();
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
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		
		Locator5.PWCSSABCConstructionComplied().click();
		Thread.sleep(4000);
		
	    Locator5.PWCSSABCconstructionNotCompliedLow().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator2.Feb23().getText();
       Thread.sleep(2000);
       Locator2.Feb23().click();
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

	
	
	public static void PWCSNotApplicableHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		Locator5.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator5.PWCSSABCconstructionNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);  
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       	
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
    String RiskText =Locator2.RiskNADD1().getText();
    Thread.sleep(2000);
    Locator2.RiskNADD1().click();
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
	
	
	
	public static void PWCSNotApplicableGraphmedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		Locator5.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator5.PWCSSABCconstructionNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
      
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
    String PeriodText =Locator2.Mar23().getText();
    Thread.sleep(2000);
    Locator2.Mar23().click();
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
	
	
	public static void PWCSSNotApplicableGraphLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		Locator5.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator5.PWCSSABCconstructionNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000); 
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
    String PeriodText =Locator2.Mar23().getText();
    Thread.sleep(2000);
    Locator2.Mar23().click();
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
	
	
	
	
	public static void PWAuditStatusSummeryABCConstructionOverdue1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(18000);
		
	    Locator5.PWAuditStatusSummeryABCConstructionOverdue().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       
	    Locator2.Project().click();
	       Thread.sleep(6000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(9000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);


	       Locator2.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator3.Status1Overdue().getText();
	       Thread.sleep(2000);
	       Locator3.Status1Overdue().click();
	       Thread.sleep(2000);
	       Locator3.Status2Overdue().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(5000);


	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	       String ContractorTypeText =Locator3.PWCSSubContractorContractorTypeDD11().getText();
	       Thread.sleep(2000);
	       Locator3.PWCSSubContractorContractorTypeDD11().click();
	       Thread.sleep(2000);
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	       
	       
	      
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       String FrequencyText =Locator3.Frequency2().getText();
	       Thread.sleep(2000);
	       Locator3.Frequency2().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator3.Sep23().getText();
	       Thread.sleep(2000);
	      Locator3.Sep23().click();
	      Thread.sleep(2000);
	      
	       
	      


List<String> li=new ArrayList<String>();

//li.add(locationtext);
li.add(ProjectText);
li.add(Statustext);
li.add(ContractorTypeText);
li.add(FrequencyText);
li.add(periodtext);

Thread.sleep(3000);

		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("ContractorType");
		filter.add("Frequency");
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));
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
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(contractortypecol);
			}
				
			else if(i==3)
			{
				raw.addAll(frequencycol);
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
			 test.log(LogStatus.PASS, filter.get(i)+" dropdown working properly.");
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
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method5.PWAuditStatusSummerABCConstructionPendingReview1(test, workbook);
		
		Thread.sleep(3000);
		
		Method5.PWAuditStatusSummerABCConstructionCompleted(test, workbook);
		Thread.sleep(3000);
		
	}
	
	

	
	
	
	   
	
	
	public static void PWAuditStatusSummerABCConstructionPendingReview1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
		 Locator5.PWAuditStatusSummerABCConstructionPendingReview().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(5000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);


	       Locator2.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator3.Status1PendingReview().getText();
	       Thread.sleep(2000);
	       Locator3.Status1PendingReview().click();
	       Thread.sleep(2000);
	       Locator3.Status2PendingReview().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(5000);

	       
	
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	       String ContractorTypeText =Locator3.PWCSSubContractorContractorTypeDD11().getText();
	       Thread.sleep(2000);
	       Locator3.PWCSSubContractorContractorTypeDD11().click();
	       Thread.sleep(2000);
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	      
	       
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       String FrequencyText =Locator3.Frequency2().getText();
	       Thread.sleep(2000);
	       Locator3.Frequency2().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Mar23().getText();
	       Thread.sleep(2000);
	      Locator2.Mar23().click();
	      Thread.sleep(2000);
	      
	       
	      


List<String> li=new ArrayList<String>();

//li.add(locationtext);
li.add(ProjectText);
li.add(Statustext);
li.add(ContractorTypeText);
li.add(FrequencyText);
li.add(periodtext);

Thread.sleep(3000);

		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("ContractorType");
		filter.add("Frequency");
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));
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
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(contractortypecol);
			}
				
			else if(i==3)
			{
				raw.addAll(frequencycol);
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
			 test.log(LogStatus.PASS, filter.get(i)+" dropdown working properly.");
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
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
	}
	
	
	
	public static void PWAuditStatusSummerABCConstructionCompleted( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(20000);
		
	    Locator5.PendingReviewCircle().click();
	    Thread.sleep(5000);
	 
		
		 Locator5.PWAuditStatusSummerABCConstructionClosed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	   
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(5000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.Project().click();
	       Thread.sleep(2000);


	       Locator2.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator3.Status1Closed().getText();
	       Thread.sleep(2000);
	       Locator3.Status1Closed().click();
	       Thread.sleep(2000);
	       Locator3.Status2Closed().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(5000);

	       
	       


	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	       String ContractorTypeText =Locator3.PWCSSubContractorContractorTypeDD11().getText();
	       Thread.sleep(2000);
	       Locator3.PWCSSubContractorContractorTypeDD11().click();
	       Thread.sleep(2000);
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	      
	       
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       String FrequencyText =Locator3.Frequency2().getText();
	       Thread.sleep(2000);
	       Locator3.Frequency2().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Jan24().getText();
	       Thread.sleep(2000);
	      Locator2.Jan24().click();
	      Thread.sleep(2000);
	      
	       
	      


List<String> li=new ArrayList<String>();

//li.add(locationtext);
li.add(ProjectText);
li.add(Statustext);
li.add(ContractorTypeText);
li.add(FrequencyText);
li.add(periodtext);

Thread.sleep(3000);

		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("ContractorType");
		filter.add("Frequency");
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"gridAuditStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));
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
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(contractortypecol);
			}
				
			else if(i==3)
			{
				raw.addAll(frequencycol);
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
			 test.log(LogStatus.PASS, filter.get(i)+" dropdown working properly.");
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
		
		Locator3.ClosePage().click();
		
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
			test.log(LogStatus.PASS, " The applied filter get cleared after clicking on the clear button " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  The applied filter not get cleared after clicking on the clear button "  );
			
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
	
	
	
	
	public static void GridCountExcelCountMatchOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(2000);
        
        Locator3.ACSREDGraph().click();
		Thread.sleep(3000);
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
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
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
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
	
	String fis1 = "C:\\\\Users\\\\Shital Bhoyar\\\\Downloads\\\\Audit Status Report .xlsx";
	
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
	
	
	
	
	
	public static void ACSPendingReviewSWSCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,350)");
	    Thread.sleep(2000);
	    
		Locator3.ACSBlueGraph().click();
		Thread.sleep(16000);
		
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
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
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
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
	
	String fis1 = "C:\\\\Users\\\\Shital Bhoyar\\\\Downloads\\\\Audit Status Report .xlsx";
	
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

	
	
	
	public static void CTWAuditStatusSummeryOverdueCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(18000);
		
	    Locator3.CTWOverdueRed1().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
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
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
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
	
	String fis1 = "C:\\\\Users\\\\Shital Bhoyar\\\\Downloads\\\\Audit Status Report .xlsx";
	
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
	
	
	
	public static void CTWAuditStatusSummeryPendingReviewCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(10000);
		
	    Locator3.CTWPendingReviewYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
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
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
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
	
	String fis1 = "C:\\\\Users\\\\Shital Bhoyar\\\\Downloads\\\\Audit Status Report .xlsx";
	
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
	
	
	
	
	
	
	
	
	
	public static void PWAuditStatusSummeryABCConstructionOverdue1CountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(18000);
		
	    Locator3.PWAuditStatusSummeryABCConstructionOverdue().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
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
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
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
		test.log(LogStatus.PASS, " Overdue - Total records from Grid = "+count1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Overdue - Total records from Grid = "+count1+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\Shital Bhoyar\\\\Downloads\\\\Audit Status Report .xlsx";
	
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
	 

	    
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method5.PWAuditStatusSummerABCConstructionPendingReviewCountMatch(test, workbook);
		
		Thread.sleep(3000);
		
	}
	
	

	
	
	
	   
	
	
	public static void PWAuditStatusSummerABCConstructionPendingReviewCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Locator3.PWAuditStatusSummerABCConstructionPendingReview().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
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
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
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
		test.log(LogStatus.PASS, "Pending Review - Total records from Grid = "+count1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Pending Review - Total records from Grid = "+count1+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\Shital Bhoyar\\\\Downloads\\\\Audit Status Report .xlsx";
	
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
	 
		Thread.sleep(3000);
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
	}

	
	
//////////////////////////////////////////////////
	
	
	public static void PWCSSubcontractorCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
	   
		
		Locator5.PWCSSubContractorComplied().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorCompliedMedium().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count

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
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method5.PWCSSubcontractorLow(test, workbook);
		Thread.sleep(2000);
		
    }
	
	
	public static void PWCSSubcontractorLow1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorCompliedLow().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorCompliedLow().click();					                //Clicking on Dashboard count

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
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void PWCSSubcontractorCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		/*
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    */
		
		Locator5.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorCompliedHigh().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
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
		
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		
		Method5.PWCSSubcontractorCompliedMedium1(test, workbook);
		Thread.sleep(2000);
		
		
		Method5.PWCSSubcontractorLow(test, workbook);
		Thread.sleep(2000);
		
		
		
		
    }
	
	
	
	
	public static void PWCSSubcontractorCompliedMedium1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorCompliedMedium().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator3.CTWCompliedGreenHighGrid().getText();
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
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
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
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorCompliedLow().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator3.CTWCompliedGreenHighGrid().getText();
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
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		
		
		
		
	}
	

	
	
	
	
	public static void SubContrctorCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
		
		Locator4.RudraHeritage().click();
		Thread.sleep(6000);
		
	    Locator5.PWCSSubContractorCompliedHigh().click();					                //Clicking on Dashboard count
	    Thread.sleep(6000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	   
	       Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       Thread.sleep(3000);
       String RiskText =Locator2.RiskFilterCompliedHighDD1().getText();
       Thread.sleep(3000);
       Locator2.RiskFilterCompliedHighDD1().click();
       Thread.sleep(3000);
       Locator2.Risk().click();
       Thread.sleep(2000);
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(2000);
       String PeriodText =Locator2.Mar23().getText();
       Thread.sleep(2000);
       Locator2.Mar23().click();
       Thread.sleep(2000);
        
       Locator5.Triangle().click();
       Thread.sleep(4000);
       Locator5.TriangleColumn().click();
       Thread.sleep(4000);
       Locator5.Type().click();
       Thread.sleep(3000);
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorType =Locator5.SubContractorDD().getText();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(4000);
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(ContractorType);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
		filter.add("Contractor Type");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));

		
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
				
			else if(i==4)
			{
				raw.addAll(contractortypecol);
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
	
	
	
	
	
	
	
	
	
	
	
	public static void SubContrctorCompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
		
		Locator5.RudraHeritage().click();
		Thread.sleep(5000);
		   
	    Locator5.PWCSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	   
	       Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator2.Jan24().getText();
       Thread.sleep(2000);
       Locator2.Jan24().click();
       Thread.sleep(2000);
       
       Locator5.Triangle().click();
       Thread.sleep(4000);
       Locator5.TriangleColumn().click();
       Thread.sleep(4000);
       Locator5.Type().click();
       Thread.sleep(3000);
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorType =Locator5.SubContractorDD().getText();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(4000);
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(ContractorType);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
		filter.add("Contractor Type");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));

		
		
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
				
			else if(i==4)
			{
				raw.addAll(contractortypecol);
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
	
	
	public static void PWCSubContractorCompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    
	    Thread.sleep(3000);
		
	    Locator5.RudraHeritage().click();
		Thread.sleep(5000);
		   
		Locator5.PWCSSubContractorCompliedLow().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	   
	    Locator2.Project().click();
	       Thread.sleep(6000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator5.May23().getText();
       Thread.sleep(2000);
       Locator5.May23().click();
       Thread.sleep(2000);
       
       Locator5.Triangle().click();
       Thread.sleep(4000);
       Locator5.TriangleColumn().click();
       Thread.sleep(4000);
       Locator5.Type().click();
       Thread.sleep(3000);
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorType =Locator5.SubContractorDD().getText();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(4000);
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(ContractorType);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
		filter.add("Contractor Type");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
	
		
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
				
			else if(i==4)
			{
				raw.addAll(contractortypecol);
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

	
	public static void PWSubContractorNotCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(4000);
	    
	    Locator5.RudraHeritage().click();
		Thread.sleep(6000);
		
	    Locator5.PWCSSubContractorNotCompliedHigh().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(6000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator2.Jan24().getText();
       Thread.sleep(2000);
       Locator2.Jan24().click();
       Thread.sleep(2000);
     
       Locator5.Triangle().click();
       Thread.sleep(4000);
       Locator5.TriangleColumn().click();
       Thread.sleep(4000);
       Locator5.Type().click();
       Thread.sleep(3000);
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorType =Locator5.SubContractorDD().getText();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(4000);
 
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(ContractorType);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
		filter.add("Contractor Type");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
	
		
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
				
			else if(i==4)
			{
				raw.addAll(contractortypecol);
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


	
	public static void PWSubContractorNotCompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(4000);
	    
	    Locator5.RudraHeritage().click();
		Thread.sleep(6000);
		
	    Locator5.PWCSSubContractorNotCompliedMedium().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(6000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator5.Feb23().getText();
       Thread.sleep(2000);
       Locator5.Feb23().click();
       Thread.sleep(2000);
     
       Locator5.Triangle().click();
       Thread.sleep(4000);
       Locator5.TriangleColumn().click();
       Thread.sleep(4000);
       Locator5.Type().click();
       Thread.sleep(3000);
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorType =Locator5.SubContractorDD().getText();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(4000);
 
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(ContractorType);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
		filter.add("Contractor Type");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		
		
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
				
			else if(i==4)
			{
				raw.addAll(contractortypecol);
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

	public static void PWCSubContractorNotCompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		
	    Locator5.RudraHeritage().click();
		Thread.sleep(6000);
		
	    Locator5.PWCSSubContractorNotCompliedLow().click();					                //Clicking on Dashboard count			                
	    Thread.sleep(4000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(6000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
       String PeriodText =Locator5.Feb23().getText();
       Thread.sleep(2000);
       Locator5.Feb23().click();
       Thread.sleep(2000);
       
       Locator5.Triangle().click();
       Thread.sleep(4000);
       Locator5.TriangleColumn().click();
       Thread.sleep(4000);
       Locator5.Type().click();
       Thread.sleep(3000);
       
       Locator2.ContractorType().click();
       Thread.sleep(2000);
       String ContractorType =Locator5.SubContractorDD().getText();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator5.SubContractorDD().click();
       Thread.sleep(2000);
       Locator2.ContractorType().click();
       Thread.sleep(4000);
 
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(ContractorType);
        
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
		filter.add("Contractor Type");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		
		
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
				
			else if(i==4)
			{
				raw.addAll(contractortypecol);
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
	
	
	
	
	public static void PWCSubContractorNotApplicableGraphHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(4000);
		
	    Locator5.RudraHeritage().click();
		Thread.sleep(6000);
		
	    Locator5.PWCSSubContractorNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
      
	    Locator2.Project().click();
	       Thread.sleep(6000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
	       Locator2.RiskFilterCompliedHighDD1().click();
	       Thread.sleep(2000);
	       String RiskText =Locator2.RiskFilterCompliedHighDD1().getText();
	       Thread.sleep(2000);
	       Locator2.RiskFilterCompliedHighDD1().click();
	       Thread.sleep(2000);
	       Locator2.Risk().click();
	       Thread.sleep(2000);
	       
    
    
    Locator2.PeriodFilterCompliedHigh().click();
    Thread.sleep(2000);
    String PeriodText =Locator2.Jan24().getText();
    Thread.sleep(2000);
    Locator2.Jan24().click();
    Thread.sleep(2000);
  
    Locator5.Triangle().click();
    Thread.sleep(4000);
    Locator5.TriangleColumn().click();
    Thread.sleep(4000);
    Locator5.Type().click();
    Thread.sleep(3000);
    
    Locator2.ContractorType().click();
    Thread.sleep(2000);
    String ContractorType =Locator5.SubContractorDD().getText();
    Thread.sleep(2000);
    Locator5.SubContractorDD().click();
    Thread.sleep(2000);
    Locator5.SubContractorDD().click();
    Thread.sleep(2000);
    Locator2.ContractorType().click();
    Thread.sleep(4000);

    
     List<String> li=new ArrayList<String>();
     
   //  li.add(locationtext);
     li.add(ProjectText);
     li.add(Statustext);
     li.add(RiskText);
     li.add(PeriodText);
     li.add(ContractorType);
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
		filter.add("Contractor Type");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		
		
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
				
			else if(i==4)
			{
				raw.addAll(contractortypecol);
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
	

	
	

	
	public static void PWCSubContractorNotApplicableGraphmedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(4000);
		
	    Locator5.RudraHeritage().click();
		Thread.sleep(6000);
		
	    Locator5.PWCSSubContractorNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
      
	    Locator2.Project().click();
	       Thread.sleep(6000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
    String PeriodText =Locator2.Mar23().getText();
    Thread.sleep(2000);
    Locator2.Mar23().click();
    Thread.sleep(2000);
  
    Locator5.Triangle().click();
    Thread.sleep(4000);
    Locator5.TriangleColumn().click();
    Thread.sleep(4000);
    Locator5.Type().click();
    Thread.sleep(3000);
    
    Locator2.ContractorType().click();
    Thread.sleep(2000);
    String ContractorType =Locator5.SubContractorDD().getText();
    Thread.sleep(2000);
    Locator5.SubContractorDD().click();
    Thread.sleep(2000);
    Locator5.SubContractorDD().click();
    Thread.sleep(2000);
    Locator2.ContractorType().click();
    Thread.sleep(4000);

    
     List<String> li=new ArrayList<String>();
     
   //  li.add(locationtext);
     li.add(ProjectText);
     li.add(Statustext);
     li.add(RiskText);
     li.add(PeriodText);
     li.add(ContractorType);
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
		filter.add("Contractor Type");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		
		
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
				
			else if(i==4)
			{
				raw.addAll(contractortypecol);
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
	
	
	
	public static void PWCSubContractorNotApplicableGraphLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(4000);
		
	    Locator5.RudraHeritage().click();
		Thread.sleep(6000);
		
	    Locator5.PWCSSubContractorNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
      
	    Locator2.Project().click();
	       Thread.sleep(6000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(3000);
	       Locator2.ClosedProject().click();
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
    String PeriodText =Locator2.Mar23().getText();
    Thread.sleep(2000);
    Locator2.Mar23().click();
    Thread.sleep(2000);
  
    Locator5.Triangle().click();
    Thread.sleep(4000);
    Locator5.TriangleColumn().click();
    Thread.sleep(4000);
    Locator5.Type().click();
    Thread.sleep(3000);
    
    Locator2.ContractorType().click();
    Thread.sleep(2000);
    String ContractorType =Locator5.SubContractorDD().getText();
    Thread.sleep(2000);
    Locator5.SubContractorDD().click();
    Thread.sleep(2000);
    Locator5.SubContractorDD().click();
    Thread.sleep(2000);
    Locator2.ContractorType().click();
    Thread.sleep(4000);

    
     List<String> li=new ArrayList<String>();
     
   //  li.add(locationtext);
     li.add(ProjectText);
     li.add(Statustext);
     li.add(RiskText);
     li.add(PeriodText);
     li.add(ContractorType);
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("Risk");
		filter.add("Period");
		filter.add("Contractor Type");
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.RedGraphGrid().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator2.RedGraphGrid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr[1]/td[4]"));
		
		
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
				
			else if(i==4)
			{
				raw.addAll(contractortypecol);
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
	
	
	
	
	public static void PWCSSubcontractorNotCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		/*
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    */
		Thread.sleep(2000);
		Locator5.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorNotCompliedHigh().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorNotCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
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
		
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		Method5.PWCSSubcontractorNotCompliedMedium(test, workbook);
		Thread.sleep(5000);
		
		Method5.PWCSSubcontractorNotCompliedLow(test, workbook);
		Thread.sleep(4000);
		
    }
	
	
	public static void PWCSSubcontractorNotCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		/*
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
	    
	    
	   
		Locator3.PWCSSubContractorNotComplied().click();
		*/
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorNotCompliedMedium().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator3.CTWCompliedGreenHighGrid().getText();
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
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		
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
	    
	   
		
		Locator3.PWCSSubContractorNotComplied().click();
		
		*/
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorNotCompliedLow().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorNotCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator3.CTWCompliedGreenHighGrid().getText();
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
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		
    }
	
	
	
	
	
	public static void PWCSSubcontractorNotApplicableHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		/*
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    */
	    Thread.sleep(2000);
	    
		Locator5.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorNotApplicableHigh().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
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
		
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.CTWCompliedGreenHighGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridClearButton().click();
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method5.PWCSSubcontractorNotApplicableMedium(test,workbook);
		Thread.sleep(4000);
		
		Method5.PWCSSubcontractorNotApplicableLow(test,workbook);
		Thread.sleep(4000);
		
		
	
    }
	
	
	public static void PWCSSubcontractorNotApplicableMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		/*
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		Locator3.PWCSSubContractorNotApplicable().click();
		*/
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorNotApplicableMedium().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator3.CTWCompliedGreenHighGrid().getText();
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
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
	
    }
	
	
	
	public static void PWCSSubcontractorNotApplicableLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		/*
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		Locator3.PWCSSubContractorNotApplicable().click();
		*/
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator5.PWCSSubContractorNotApplicableLow().getText());	//Reading Dashboard count.
	    Locator5.PWCSSubContractorNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);

		String item = Locator3.CTWCompliedGreenHighGrid().getText();
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
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        Thread.sleep(4000);
		
		if(Locator3.CTWCompliedGreenHighGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.CTWCompliedGreenHighGridViewButton().click();
			test.log(LogStatus.PASS, "  Overview Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview Button working Properly "  );
			
		}
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(4000);
	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void CTWAuditStatusSummeryClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(10000);
		
	    Locator5.CTWCompletedGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	  
	       Locator3.Project().click();
	       Thread.sleep(2000);
	       String ProjectText =Locator2.ClosedProject().getText();
	       Thread.sleep(2000);
	       Locator2.ClosedProject().click();
	       Thread.sleep(2000);
	       Locator3.Project().click();
	       Thread.sleep(2000);
 

	       Locator2.Status().click();
	       Thread.sleep(2000);
	       String Statustext =Locator3.StatusClosed().getText();
	       Thread.sleep(2000);
	       Locator3.StatusClosed().click();
	       Thread.sleep(2000);
	       Locator3.StatusClosed1().click();
	       Thread.sleep(2000);
	       Locator2.Status().click();
	       Thread.sleep(5000);
 
 
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	       String ContractorTypeText =Locator3.PWCSSubContractorContractorTypeDD11().getText();
	       Thread.sleep(2000);
	       Locator3.PWCSSubContractorContractorTypeDD11().click();
	       Thread.sleep(2000);
	       Locator3.ContractorType().click();
	       Thread.sleep(2000);
	      
	       
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       String FrequencyText =Locator3.Frequency2().getText();
	       Thread.sleep(2000);
	       Locator3.Frequency2().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Mar23().getText();
	       Thread.sleep(2000);
	      Locator2.Mar23().click();
	      Thread.sleep(2000);
	      
	       
	      
 
 
  List<String> li=new ArrayList<String>();
  
//  li.add(locationtext);
  li.add(ProjectText);
  li.add(Statustext);
  li.add(ContractorTypeText);
  li.add(FrequencyText);
  li.add(periodtext);
  
  Thread.sleep(3000);
  
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");
		filter.add("Status");
		filter.add("ContractorType");
		filter.add("Frequency");
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
					raw.addAll(statuscol);
				}
			else if(i==2)
			{
				raw.addAll(contractorcol);
			}
				
			else if(i==3)
			{
				raw.addAll(frequencycol);
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
	
	
	
	public static void DashboardClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,50)");
	    
	    Thread.sleep(4000);
	    
		Locator5.Project3().click();
		Thread.sleep(2000);
		Locator5.PWCSSubContractorProjectDD1().click();
		Thread.sleep(2000);
		
		
		if(Locator3.DashboardClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.DashboardClearButton().click();
			test.log(LogStatus.PASS, " Clear Button working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear Button working Properly "  );
			
		}
		
		
		
        
	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
