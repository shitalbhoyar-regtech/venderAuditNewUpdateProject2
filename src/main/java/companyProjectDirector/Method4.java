package companyProjectDirector;

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
import companyContractor.Method1;
import companyManagement.Locator5;
import companyManagement.Method5;
import companyProjectHead.Locator3;
import companyProjectHead.Method3;
import login.BasePage;

public class Method4 extends BasePage{
	
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable

	
	
	
	
	
	
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
	
	
	
	
	
		
	public static void YellowGraphDashboardGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator4.YellowGraph().getText());	//Reading Dashboard count.
	    Locator4.YellowGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,200)");
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
		
		
		if(Locator4.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator4.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator4.YellowGraphViewButton().click();
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
		
		int open = Integer.parseInt(Locator4.GreenGraphinGreen().getText());	//Reading Dashboard count.
	    Locator4.GreenGraphinGreen().click();					                //Clicking on Dashboard count

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
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
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
		
	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator4.ClosePage().click();
		
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
		int open = Integer.parseInt(Locator4.RedGraph2Green().getText());	//Reading Dashboard count.
	    Locator4.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator4.RedGraph2GreenGrid().getText();
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
		
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.RedGraph2GreenClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.RedGraph2GreenClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
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
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void RedInYellowCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		int open = Integer.parseInt(Locator4.RedGraphInYellow().getText());	//Reading Dashboard count.
	    Locator4.RedGraphInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator4.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator4.RedGraphInYellowGrid().getText();
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
		Locator4.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator4.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator4.RedGraphInYellowClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator4.RedGraphInYellowClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
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
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
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
	

	
	//Grey
	
		/// Status Wise Summery Not Applicable
			
			
	public static void GreyGraphCountMatchGreen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				
				//WebWait wait = new WebWait(, 1000);
				/*
				Thread.sleep(26000);
				
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(2000);
				
				Locator2.GreyGraph().click();
				Thread.sleep(2000);
				
				*/
				
				int open = Integer.parseInt(Locator4.GreyInGreenGraph().getText());	//Reading Dashboard count.
			    Locator4.GreyInGreenGraph().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
			    Thread.sleep(5000);
			    
			    
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator4.GreyInGreenGraphGrid().getText();
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
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.GreyInGreenClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.GreyInGreenClearButton().click();
					test.log(LogStatus.PASS, "  Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
				}
				
				Thread.sleep(2000);
				
				if(Locator4.ViewGreyInGreen().isEnabled())
				{
					
					Thread.sleep(4000);
				    Locator4.ViewGreyInGreen().click();
					test.log(LogStatus.PASS, "   Overview button working properly " );
					
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
			    

			    
			    
			}
			
			
			
			public static void GreyGraphYellowCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				
				
				//WebWait wait = new WebWait(, 1000);
				/*
				Thread.sleep(26000);
				
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(2000);
				
				Locator2.GreyGraph().click();
				Thread.sleep(2000);
				
				*/
				
				int open = Integer.parseInt(Locator4.GreyInYellow().getText());	//Reading Dashboard count.
			    Locator4.GreyInYellow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator4.GreyInGreenGraphGrid().getText();
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
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.GreyInYellowClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.GreyInYellowClearButton().click();
					test.log(LogStatus.PASS, "  Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear button working properly "  );
					
				}
				
				Thread.sleep(2000);
				
				if(Locator4.GreyInYellowViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.GreyInYellowViewButton().click();
					test.log(LogStatus.PASS, "  Overview button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, " Overview button working properly "  );
					
				}
				

				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator4.ClosePage().click();
				
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
				
				Thread.sleep(2000);
				
				
				Method4.GreyGraphCountMatchGreen(test, workbook);
				Thread.sleep(2000);
				
				
			
			}
			
	
	
	// Audit Completion Status
	
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
			
			
			
			
			public static void AuditCompletionStatusBlueGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(5000);
				
				*/
				
				int open = Integer.parseInt(Locator4.ACSBlueGraph().getText());	//Reading Dashboard count.
			    Locator4.ACSBlueGraph().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(18000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator4.ACSBlueGraphGrid().getText();
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
				
				
				
				
		        JavascriptExecutor jss1 = (JavascriptExecutor) getDriver();
			    
			    jss1.executeScript("window.scrollBy(0,-1000)");
			    Thread.sleep(2000);
			    
			 // clear button
				if(Locator4.ACSBlueGraphGridExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.ACSBlueGraphGridExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.ACSBlueGraphGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.ACSBlueGraphGridClearButton().click();
					test.log(LogStatus.PASS, " Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
				}
				
				
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator4.ClosePage().click();
				
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
				
				int open = Integer.parseInt(Locator4.ACSGreenGraph().getText());	//Reading Dashboard count.
			    Locator4.ACSGreenGraph().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator4.ACSGreenGraphGreed().getText();
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
			    if(Locator4.ACSGreenGraphGreedExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.ACSGreenGraphGreedExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.ACSGreenGraphGreedClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.ACSGreenGraphGreedClearButton().click();
					test.log(LogStatus.PASS, " Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
				}
				
				
				
				
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
				
				
}
			
			
			
			
//Contractor Type Wise Compliance Summery
			   
//Green-Complied-High
			

			
			
              public static void CTWCompliedgreen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
              {
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,800)");
			    Thread.sleep(2000);
				
				Locator4.CTWCompliedGreen().click();
				Thread.sleep(2000);
				
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
			
			
			
			
			
				
			public static void CTWCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator5.CTWCompliedGreenMedium().getText());	//Reading Dashboard count.
			    Locator5.CTWCompliedGreenMedium().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator3.Frame());
			    Thread.sleep(5000);
			    
			    
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,200)");
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
					test.log(LogStatus.PASS, "   Clear button working properly " );
					
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
				
				int open = Integer.parseInt(Locator5.CTWCompliedGreenLow().getText());	//Reading Dashboard count.
			    Locator5.CTWCompliedGreenLow().click();					                //Clicking on Dashboard count

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
					test.log(LogStatus.PASS, " Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
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
				
				Locator4.CTWNotCompliedRed().click();
				Thread.sleep(2000);
				
				int open = Integer.parseInt(Locator4.CTWNotCompliedRedHigh().getText());	//Reading Dashboard count.
			    Locator4.CTWNotCompliedRedHigh().click();					                //Clicking on Dashboard count

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
			
			
			
			
			
				
			public static void CTWNotCompliedRedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(9000);
				
				int open = Integer.parseInt(Locator4.CTWNotCompliedRedmedium().getText());	//Reading Dashboard count.
			    Locator4.CTWNotCompliedRedmedium().click();					                //Clicking on Dashboard count

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
					test.log(LogStatus.PASS, "  Medium Risk - Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Medium Risk - Clear button working properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator4.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator4.YellowGraphViewButton().click();
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
					
					Thread.sleep(2000);
				
				
			}
			
			
			
			
			
			
			
			public static void CTWNotCompliedRedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				//WebWait wait = new WebWait(, 1000);
				/*
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
					test.log(LogStatus.PASS, " Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
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
				
				Locator4.CTWNotApplicableGrey().click();
				Thread.sleep(2000);
				
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
					test.log(LogStatus.PASS, "  Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear button working properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator4.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator4.YellowGraphViewButton().click();
						test.log(LogStatus.PASS, "   Overview button working properly " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
						
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
					test.log(LogStatus.PASS, "  Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
				}
				
				
				
				Thread.sleep(2000);
				
				if(Locator4.GreenViewButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.GreenViewButton().click();
					test.log(LogStatus.PASS, "   Overview button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Overview button working properly "  );
					
				}
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
			}
			
						

	
	
	
			//Contractor Type Wise - Audit Status Summary
			
			public static void CTWAuditStatusSummeryOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,1550)");
			    Thread.sleep(18000);
				
				
				
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
			
			
			
			
			public static void CTWAuditStatusSummeryPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				WebDriverWait wait = new WebDriverWait( getDriver(),(60));
				Thread.sleep(5000);
					
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(5000);
				
				*/
				
				int open = Integer.parseInt(Locator4.CTWPendingReviewYellow().getText());	//Reading Dashboard count.
			    Locator4.CTWPendingReviewYellow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(18000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator4.ACSBlueGraphGrid().getText();
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
			    
			    Thread.sleep(4000);
				File dir2 = new File("C:\\Users\\shitalb\\Downloads");
				File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(10000);
			     Locator4.ACSBlueGraphGridExportButton().click();
				
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

				
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.ACSBlueGraphGridClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.ACSBlueGraphGridClearButton().click();
					test.log(LogStatus.PASS, " Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
				}
				
				
				/*
				if(Locator4.ACSBlueGraphGridExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.ACSBlueGraphGridExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				*/
				
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
				
				
					
				
				
			}
			
			
			
			
			
			
			
			public static void CTWAuditStatusSummeryCompleted( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				//WebWait wait = new WebWait(, 1000);
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(2000);
				
				*/
				
				int open = Integer.parseInt(Locator4.CTWCompletedGreen().getText());	//Reading Dashboard count.
			    Locator4.CTWCompletedGreen().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator3.Frame());
			    Thread.sleep(5000);
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
			    Thread.sleep(9000);
			    
			    
			 //   scrollToBottom();
			    
			    
			   

				String item = Locator4.ACSGreenGraphGreed().getText();
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
			    
			    Thread.sleep(4000);
				File dir2 = new File("C:\\Users\\shitalb\\Downloads");
				File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(10000);
			     Locator4.ACSGreenGraphGreedExportButton().click();
				
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

				
				Locator4.ClearContractorRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				Locator4.ClearContractorDDRedGraphGrid().click();
				Thread.sleep(2000);
				
				
				if(Locator4.ACSGreenGraphGreedClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.ACSGreenGraphGreedClearButton().click();
					test.log(LogStatus.PASS, " Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
				}
				
				/*
				
				if(Locator4.ACSGreenGraphGreedExportButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.ACSGreenGraphGreedExportButton().click();
					test.log(LogStatus.PASS, " File Download Successfully " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  File Download Successfully "  );
					
				}
				*/
				
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
				
				
			}
			
			

	
	
	
	
		//  Project Wise - Audit Status Summary
			
			
			
						
			
			
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
			
			

			
			
			
			   
			
			
			public static void PWAuditStatusSummerABCConstructionPendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,2350)");
			    Thread.sleep(18000);
				
				*/
				
				int open = Integer.parseInt(Locator4.PWAuditStatusSummerABCConstructionPendingReview().getText());	//Reading Dashboard count.
			    Locator4.PWAuditStatusSummerABCConstructionPendingReview().click();					                //Clicking on Dashboard count

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
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(3000);
				
			}
			
			


			public static void PWAuditStatusSummerABCConstructionCompleted( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,2350)");
			    Thread.sleep(18000);
				
				*/
				
				int open = Integer.parseInt(Locator4.PWAuditStatusSummerABCConstructionCompleted().getText());	//Reading Dashboard count.
			    Locator4.PWAuditStatusSummerABCConstructionCompleted().click();					                //Clicking on Dashboard count

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
								
				test.log(LogStatus.PASS, " Completed -  Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
							
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
				
				
				
				
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(3000);
				
			}
			
			

			
			
			
			
			
			public static void PWAuditStatusSummeryashHeritagePendingReview( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				/*
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,2350)");
			    Thread.sleep(18000);
				
				*/
				
				int open = Integer.parseInt(Locator3.PWAuditStatusSummeryashHeritagePendingReview().getText());	//Reading Dashboard count.
			    Locator3.PWAuditStatusSummeryashHeritagePendingReview().click();					                //Clicking on Dashboard count

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
				
				
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator3.ClosePage().click();
				
				Thread.sleep(3000);
				
			}
			
			
			
	
	//Bar Graph project Wise Complience Summery
			
			
			
			
			
			public static void PWCSSABCConstructionCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
            {
				
				
				//WebWait wait = new WebWait(, 1000);
				Thread.sleep(26000);
				
				Thread.sleep(2000);
				
			    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
			    
			    jss.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
				
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
			
			
			
			
			
				
			public static void PWCSSABCConstructionCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator4.PWCSSABCConstructionCompliedMedium().getText());	//Reading Dashboard count.
			    Locator4.PWCSSABCConstructionCompliedMedium().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator3.Frame());
			    Thread.sleep(5000);
			    
			    
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,1000)");
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
				
				
				if(Locator2.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator2.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "   Clear button working properly " );
					
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
						test.log(LogStatus.PASS, "  Overview button working properly " );
						
					}
					
					else
					{
						test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
						
					}
					
					
					Thread.sleep(4000);
				
				
					
					getDriver().switchTo().parentFrame();
					
					Thread.sleep(4000);
					
					Locator2.ClosePage().click();
					
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
				
				int open = Integer.parseInt(Locator4.PWCSSABCConstructionCompliedLow().getText());	//Reading Dashboard count.
			    Locator4.PWCSSABCConstructionCompliedLow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
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
					test.log(LogStatus.PASS, "  Overview button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
					
				}
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator2.ClosePage().click();
				
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
			
			
			
			
			
				
			public static void PWCSSABCconstructionNotCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator4.PWCSSABCconstructionNotCompliedMedium().getText());	//Reading Dashboard count.
			    Locator4.PWCSSABCconstructionNotCompliedMedium().click();					                //Clicking on Dashboard count

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
				
				
				if(Locator4.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "   Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear button working properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator4.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator4.YellowGraphViewButton().click();
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
				
				int open = Integer.parseInt(Locator4.PWCSSABCconstructionNotCompliedLow().getText());	//Reading Dashboard count.
			    Locator4.PWCSSABCconstructionNotCompliedLow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
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
					test.log(LogStatus.PASS, " Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
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
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator2.ClosePage().click();
				
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
			
			
			
			
			
				
			public static void PWCSSABCconstructionNotApplicableMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				Thread.sleep(5000);
				
				int open = Integer.parseInt(Locator4.PWCSSABCconstructionNotApplicableMedium().getText());	//Reading Dashboard count.
			    Locator4.PWCSSABCconstructionNotApplicableMedium().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator3.Frame());
			    Thread.sleep(5000);
			    
			    
			    
		       JavascriptExecutor js = (JavascriptExecutor) getDriver();
			    
			    js.executeScript("window.scrollBy(0,200)");
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
				
				
				if(Locator4.YellowGraphClearButton().isEnabled())
				{
					
					Thread.sleep(2000);
				    Locator4.YellowGraphClearButton().click();
					test.log(LogStatus.PASS, "   Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "   Clear button working properly "  );
					
				}
				
				
				
				
				
				 Thread.sleep(2000);
					
					if(Locator4.YellowGraphViewButton().isEnabled())
					{
						
						Thread.sleep(2000);
					    Locator4.YellowGraphViewButton().click();
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
				Thread.sleep(3000);
				int open = Integer.parseInt(Locator4.PWCSSABCconstructionNotApplicableLow().getText());	//Reading Dashboard count.
			    Locator4.PWCSSABCconstructionNotApplicableLow().click();					                //Clicking on Dashboard count

			    Thread.sleep(20000);
			   
			    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
			//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
			    
			    
			    getDriver().switchTo().frame(Locator4.Frame());
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
					test.log(LogStatus.PASS, " Clear button working properly " );
					
				}
				
				else
				{
					test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
					
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
				
			
				Thread.sleep(4000);

				getDriver().switchTo().parentFrame();
				
				Thread.sleep(4000);
				
				Locator2.ClosePage().click();
				
				Thread.sleep(2000);
				
				
				
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
		
		
		
		File dir2 = new File("C:\\Users\\Shital Bhoyar\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
	     Locator4.DocumentDownloadIcon().click();
		
	 	Thread.sleep(3000);
		File dir3 = new File("C:\\\\Users\\\\Shital Bhoyar\\\\Downloads");
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
	
	
	
	
	public static void multipleDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator4.Document().click();
		Thread.sleep(20000);
		
		Locator4.DocumentCheckBox().click();
		Thread.sleep(2000);
		
		Locator4.DocumentCheckBox1().click();
		Thread.sleep(4000);
		
		
		
		
		File dir2 = new File("C:\\Users\\Shital Bhoyar\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(6000);
	     Locator4.DocumentDownload().click();
		
	 	Thread.sleep(7000);
		File dir3 = new File("C:\\\\Users\\\\Shital Bhoyar\\\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(4000);
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
		
		Locator4.DocumentSelectLocationDrop().click();
		Thread.sleep(2000);
		
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
		
		
		
		
		File dir2 = new File("C:\\Users\\Shital Bhoyar\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
	     Locator4.ReportExtendReport().click();
		
	 	Thread.sleep(5000);
		File dir3 = new File("C:\\\\Users\\\\Shital Bhoyar\\\\Downloads");
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
		
		
		
		File dir2 = new File("C:\\Users\\Shital Bhoyar\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(4000);
	     Locator4.ReportFileDownload().click();
		
	 	Thread.sleep(15000);
		File dir3 = new File("C:\\\\Users\\\\Shital Bhoyar\\\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(6000);
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
		
		Thread.sleep(2000);
		
		
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
		
		
		Thread.sleep(2000);
		
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
		
		Thread.sleep(2000);
		

		
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
			test.log(LogStatus.PASS, " Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
	}
	
	
	////////////////////////////////////////////////// Multiple Filter Verification
	
	
	public static void CompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
	    Locator2.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(6000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(10000);
	   
       
       Locator2.Project2().click();
       Thread.sleep(3000);
       String ProjectText =Locator4.ClosedProject().getText();
       Thread.sleep(2000);
       Locator4.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project2().click();
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
       String PeriodText =Locator2.Jan24().getText();
       Thread.sleep(2000);
       Locator2.Jan24().click();
       Thread.sleep(2000);
        
       
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);
	//    Locator3.DueDate().click();
	//    Thread.sleep(2000);


	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD1().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD1().click();
	    Thread.sleep(2000);
	//    Locator3.PWCSSubContractorContractorTypeDD1().click();
	//    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

       
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(contractorTypeText);
        
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
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

	
	
	
	
	public static void CompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		Thread.sleep(2000);
		
		
	    Locator2.YellowGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	   
		

	
       
     
       Locator2.Project2().click();
       Thread.sleep(3000);
       String ProjectText =Locator4.ClosedProject().getText();
       Thread.sleep(2000);
       Locator4.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project2().click();
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
        
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);
	//    Locator3.DueDate().click();
	//    Thread.sleep(2000);


	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD1().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD1().click();
	    Thread.sleep(2000);
	//    Locator3.PWCSSubContractorContractorTypeDD1().click();
	//    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(contractorTypeText);
        
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr/td[4]"));

		
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
	    
      
       
     
       Locator3.ProjectReport().click();
       Thread.sleep(3000);
       String ProjectText =Locator4.ClosedProject().getText();
       Thread.sleep(2000);
       Locator4.ClosedProject().click();
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
       String PeriodText =Locator2.Apr22().getText();
       Thread.sleep(2000);
       Locator2.Apr22().click();
       Thread.sleep(2000);
 
       
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);
	//    Locator3.DueDate().click();
	//    Thread.sleep(2000);


	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD11().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	//    Locator3.PWCSSubContractorContractorTypeDD1().click();
	//    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);


       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(contractorTypeText);
       
        
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr/td[4]"));

		
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
	

	
	public static void NotCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(9000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
//		Thread.sleep(2000);
			
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraphInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project2().click();
       Thread.sleep(3000);
       String ProjectText =Locator4.ClosedProject().getText();
       Thread.sleep(2000);
       Locator4.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project2().click();
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
       String PeriodText =Locator2.Feb24().getText();
       Thread.sleep(2000);
       Locator2.Feb24().click();
       Thread.sleep(2000);
      
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);
	//    Locator3.DueDate().click();
	//    Thread.sleep(2000);


	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD1().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD1().click();
	    Thread.sleep(2000);
	//    Locator3.PWCSSubContractorContractorTypeDD1().click();
	//    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(contractorTypeText);
        
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
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
	
	
	
	
	
	
	public static void NotCompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,370)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
			
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraphInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project2().click();
       Thread.sleep(3000);
       String ProjectText =Locator4.ClosedProject().getText();
       Thread.sleep(2000);
       Locator4.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project2().click();
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
       String PeriodText =Locator2.Feb24().getText();
       Thread.sleep(2000);
       Locator2.Feb24().click();
       Thread.sleep(2000);
 //      Locator2.PeriodFilterCompliedHigh().click();
 //      Thread.sleep(2000);
       
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);
	//    Locator3.DueDate().click();
	//    Thread.sleep(2000);


	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD1().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD1().click();
	    Thread.sleep(2000);
	//    Locator3.PWCSSubContractorContractorTypeDD1().click();
	//    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(contractorTypeText);
        
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
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

	
	
	
	
	public static void NotCompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(9000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
//		Thread.sleep(2000);
			
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project2().click();
       Thread.sleep(3000);
       String ProjectText =Locator4.ClosedProject().getText();
       Thread.sleep(2000);
       Locator4.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project2().click();
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
       String PeriodText =Locator2.Feb24().getText();
       Thread.sleep(2000);
       Locator2.Feb24().click();
       Thread.sleep(2000);
  //     Locator2.PeriodFilterCompliedHigh().click();
  //     Thread.sleep(2000);
       
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);
	//    Locator3.DueDate().click();
	//    Thread.sleep(2000);


	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD1().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD1().click();
	    Thread.sleep(2000);
	//    Locator3.PWCSSubContractorContractorTypeDD1().click();
	//    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);


       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(contractorTypeText);
        
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
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

	
	
	
	
	
	public static void NotApplicableGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
	    Locator2.GreyInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project2().click();
       Thread.sleep(3000);
       String ProjectText =Locator4.ClosedProject().getText();
       Thread.sleep(2000);
       Locator4.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project2().click();
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
       String PeriodText =Locator2.Mar24().getText();
       Thread.sleep(2000);
       Locator2.Mar24().click();
       Thread.sleep(2000);
       
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);
	//    Locator3.DueDate().click();
	//    Thread.sleep(2000);


	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD12().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD12().click();
	    Thread.sleep(2000);
	//    Locator3.PWCSSubContractorContractorTypeDD1().click();
	//    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);


  
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(contractorTypeText);
       
        
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
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

	
	
	
	
	public static void NotApplicableGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(3000);
		
	    Locator2.GreyInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project2().click();
       Thread.sleep(3000);
       String ProjectText =Locator4.ClosedProject().getText();
       Thread.sleep(2000);
       Locator4.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project2().click();
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
       String PeriodText =Locator2.Mar24().getText();
       Thread.sleep(2000);
       Locator2.Mar24().click();
       Thread.sleep(2000);
   //    Locator2.PeriodFilterCompliedHigh().click();
    //   Thread.sleep(2000);
       
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);
	//    Locator3.DueDate().click();
	//    Thread.sleep(2000);


	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD12().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD12().click();
	    Thread.sleep(2000);
	//    Locator3.PWCSSubContractorContractorTypeDD1().click();
	//    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);


 
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(contractorTypeText);
        
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
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

	
	
	
	public static void NotApplicableGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
	    Locator2.GreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project2().click();
       Thread.sleep(3000);
       String ProjectText =Locator4.ClosedProject().getText();
       Thread.sleep(2000);
       Locator4.ClosedProject().click();
       Thread.sleep(2000);
       Locator2.Project2().click();
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
       String PeriodText =Locator2.Mar24().getText();
       Thread.sleep(2000);
       Locator2.Mar24().click();
       Thread.sleep(2000);
      
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);
	//    Locator3.DueDate().click();
	//    Thread.sleep(2000);


	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD12().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD12().click();
	    Thread.sleep(2000);
	//    Locator3.PWCSSubContractorContractorTypeDD1().click();
	//    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);


       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(ProjectText);
        li.add(Statustext);
        li.add(RiskText);
        li.add(PeriodText);
        li.add(contractorTypeText);
        
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
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
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

	
	
	
	
	public static void ACSOverdueMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
	    
		Locator3.ACSREDGraph().click();
		Thread.sleep(3000);
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
		
	    
       Locator3.Project().click();
       Thread.sleep(2000);
     //  Locator3.ProjectReport().click();
     //  Thread.sleep(2000);
       String ProjectText =Locator4.Projectnametext().getText();
       Thread.sleep(2000);
       Locator4.Projectnametext().click();
       Thread.sleep(2000);
       Locator3.Project().click();
       Thread.sleep(2000);
       
       
       
       Locator3.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator3.PWCSSubContractorContractorTypeDD12().getText();
       Thread.sleep(2000);
       Locator3.PWCSSubContractorContractorTypeDD12().click();
       Thread.sleep(2000);
       Locator3.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator3.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator3.ReportTabFequencyDD().getText();
       Thread.sleep(2000);
       Locator3.ReportTabFequencyDD().click();
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
       String periodtext =Locator2.Feb24().getText();
       Thread.sleep(2000);
      Locator2.Feb24().click();
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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
	    
		Locator3.ACSBlueGraph().click();
		Thread.sleep(16000);
		
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
		
	   
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator4.Projectnametext().getText();
	       Thread.sleep(2000);
	       Locator4.Projectnametext().click();
	       Thread.sleep(2000);
	       Locator3.Project().click();
	       Thread.sleep(2000);
       
       
       
       Locator3.ContractorType().click();
       Thread.sleep(2000);
       String ContractorTypeText =Locator3.PWCSSubContractorContractorTypeDD12().getText();
       Thread.sleep(2000);
       Locator3.PWCSSubContractorContractorTypeDD12().click();
       Thread.sleep(2000);
       Locator3.ContractorType().click();
       Thread.sleep(2000);
       
       
       
       
       Locator3.Frequency().click();
       Thread.sleep(2000);
       String FrequencyText =Locator3.ReportTabFequencyDD().getText();
       Thread.sleep(2000);
       Locator3.ReportTabFequencyDD().click();
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
       String periodtext =Locator1.Jun24().getText();
       Thread.sleep(2000);
      Locator1.Jun24().click();
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

	
	public static void ACSClosedMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
	    
	    Locator4.ACSGreenGraph().click();
		Thread.sleep(16000);
		
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
		
	   
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator4.Projectnametext().getText();
	       Thread.sleep(2000);
	       Locator4.Projectnametext().click();
	       Thread.sleep(2000);
	       Locator3.Project().click();
	       Thread.sleep(2000);
       
       
       
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
       String FrequencyText =Locator3.ReportTabFequencyDD().getText();
       Thread.sleep(2000);
       Locator3.ReportTabFequencyDD().click();
       Thread.sleep(2000);
       Locator3.Frequency().click();
       Thread.sleep(2000);
       
       Locator3.Status().click();
       Thread.sleep(2000);
       String Statustext =Locator3.StatusClosed().getText();
       Thread.sleep(2000);
       Locator3.StatusClosed().click();
       Thread.sleep(2000);
       Locator3.StatusClosed1().click();
       Thread.sleep(2000);
       Locator3.Status().click();
       Thread.sleep(2000);
       
       Locator3.Period().click();
       Thread.sleep(2000);
       String periodtext =Locator2.Mar22().getText();
       Thread.sleep(2000);
      Locator2.Mar22().click();
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
		Thread.sleep(20000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(120));
		Thread.sleep(10000);
	   		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Canteen']"))); 
		Thread.sleep(2000);

		
		Locator5.CTWCompliedGreen().click();
		Thread.sleep(2000);
		
	    Locator5.CTWCompliedGreenHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(10000);
	    
	       Locator2.Project2().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator2.ProjectYashConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ProjectYashConstruction().click();
	       Thread.sleep(3000);
	     //  Locator2.Project2().click();
	     //  Thread.sleep(3000);
	       Locator2.Project2().click();
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
    String PeriodText =Locator2.Aug24().getText();
    Thread.sleep(2000);
    Locator2.Aug24().click();
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
		filter.add("High Risk -   Project");
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
		
		Locator3.CTWNotCompliedRed().click();
		Thread.sleep(2000);
		
		Locator3.CTWNotCompliedRedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator2.ProjectYashConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ProjectYashConstruction().click();
	       Thread.sleep(3000);
	     //  Locator2.Project2().click();
	     //  Thread.sleep(3000);
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
    String PeriodText =Locator2.May22().getText();
    Thread.sleep(2000);
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
		filter.add("High Risk - Project");
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
		
		Locator3.CTWNotApplicableGrey().click();
		Thread.sleep(2000);
		
	    Locator3.CTWNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator2.ProjectYashConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ProjectYashConstruction().click();
	       Thread.sleep(3000);
	     //  Locator2.Project2().click();
	     //  Thread.sleep(3000);
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
 String PeriodText =Locator2.Mar22().getText();
 Thread.sleep(2000);
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
		filter.add("High Risk - Project");
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
	
	
	
	public static void CTWAuditStatusSummeryOverdue1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(3000);
	    
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"))); 
	//	Thread.sleep(2000);
		
	    Locator3.CTWOverdueRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	  
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(2000);
	       Locator2.CreationConstruction().click();
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
	       String FrequencyText =Locator3.ReportTabFequencyDD().getText();
	       Thread.sleep(2000);
	       Locator3.ReportTabFequencyDD().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Jul22().getText();
	       Thread.sleep(2000);
	      Locator2.Jul22().click();
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
	
	
	
	
	
	
	public static void CTWAuditStatusSummeryPendingReviewn( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(2000);
	    
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"))); 
	//	Thread.sleep(2000);
		
	    Locator3.CTWPendingReviewYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	  
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(2000);
	       Locator2.CreationConstruction().click();
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
	       String FrequencyText =Locator3.ReportTabFequencyDD().getText();
	       Thread.sleep(2000);
	       Locator3.ReportTabFequencyDD().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Apr22().getText();
	       Thread.sleep(2000);
	      Locator2.Apr22().click();
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
	
	
	
	public static void CTWAuditStatusSummeryClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(2000);
	    
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"))); 
	//	Thread.sleep(2000);
		
	    Locator3.CTWCompletedGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	  
	       Locator3.Project().click();
	       Thread.sleep(2000);
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(2000);
	       Locator2.CreationConstruction().click();
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
	       String FrequencyText =Locator3.ReportTabFequencyDD().getText();
	       Thread.sleep(2000);
	       Locator3.ReportTabFequencyDD().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Mar22().getText();
	       Thread.sleep(2000);
	      Locator2.Mar22().click();
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
	
	
	
	
	
	public static void CTWAuditStatusSummeryOverduen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(18000);
		
	    Locator4.CTWOverdueRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	  
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator2.ProjectYashConstruction().getText();
	       Thread.sleep(2000);
	       Locator2.ProjectYashConstruction().click();
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
	       String FrequencyText =Locator3.ReportTabFequencyDD().getText();
	       Thread.sleep(2000);
	       Locator3.ReportTabFequencyDD().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Jul22().getText();
	       Thread.sleep(2000);
	      Locator2.Jul22().click();
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
		
	    Locator4.CTWPendingReviewYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	  
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator2.ProjectYashConstruction().getText();
	       Thread.sleep(2000);
	       Locator2.ProjectYashConstruction().click();
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
	       String periodtext =Locator2.Jan22().getText();
	       Thread.sleep(2000);
	      Locator2.Jan22().click();
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
	
	
	
	public static void CTWAuditStatusSummeryCompletedStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(10000);
		
	    Locator4.CTWCompletedGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(5000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	  
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator2.ProjectYashConstruction().getText();
	       Thread.sleep(2000);
	       Locator2.ProjectYashConstruction().click();
	       Thread.sleep(2000);
	 //      Locator3.ClosedProjecttext().click();
	 //      Thread.sleep(2000);
	       Locator3.Project().click();
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
	
	
	
	public static void PWAuditStatusSummeryABCConstructionOverduep( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(2000);
	    
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[6]"))); 
//		Thread.sleep(2000);
		
	    Locator4.PWAuditStatusSummeryABCConstructionOverdue().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       
	    Locator2.Project().click();
	       Thread.sleep(6000);
	       String ProjectText =Locator3.Project2().getText();
	       Thread.sleep(9000);
	       Locator3.Project2().click();
	       Thread.sleep(3000);
	       Locator3.Project2().click();
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
	       String FrequencyText =Locator3.FrequencyDD().getText();
	       Thread.sleep(2000);
	       Locator3.FrequencyDD().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Jul22().getText();
	       Thread.sleep(2000);
	      Locator2.Jul22().click();
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
		filter.add("Overdue - Project");
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
		
		Method4.PWAuditStatusSummerABCConstructionPendingReview1(test, workbook);	
		Thread.sleep(3000);
		
		Method4.PWAuditStatusSummerABCConstructionClosed1(test, workbook);	
		Thread.sleep(3000);

		
		
		
	}
	
	
	public static void PWAuditStatusSummerABCConstructionClosed1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		 Locator4.PWAuditStatusSummerABCConstructionCompleted().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator3.Project2().getText();
	       Thread.sleep(3000);
	       Locator3.Project2().click();
	       Thread.sleep(3000);
	       Locator3.Project2().click();
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
	       String FrequencyText =Locator3.FrequencyDD().getText();
	       Thread.sleep(2000);
	       Locator3.FrequencyDD().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Mar22().getText();
	       Thread.sleep(2000);
	      Locator2.Mar22().click();
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
		filter.add("Completed   -  Project");
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

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
	}


	
	
	public static void PWAuditStatusSummerABCConstructionPendingReviewp( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		 Locator4.PWAuditStatusSummerABCConstructionPendingReview().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator3.Project2().getText();
	       Thread.sleep(3000);
	       Locator3.Project2().click();
	       Thread.sleep(3000);
	       Locator3.Project2().click();
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
	       String FrequencyText =Locator3.FrequencyDD().getText();
	       Thread.sleep(2000);
	       Locator3.FrequencyDD().click();
	       Thread.sleep(2000);
	       Locator3.Frequency().click();
	       Thread.sleep(2000);
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator2.Apr22().getText();
	       Thread.sleep(2000);
	      Locator2.Apr22().click();
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
		filter.add("Pending Review   -  Project");
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
	
	

	
	
	
	
	public static void PWCSCompliedGraphMultipleFilterHigh1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    
	    
	    Thread.sleep(6000);
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator4.PWCSSABCConstructionCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	  
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ChandranganConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
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
       String PeriodText =Locator2.Apr22().getText();
       Thread.sleep(2000);
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
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(5000);
		
		
	    Locator4.PWCSSABCConstructionCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	   
	       Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ChandranganConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
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
       String PeriodText =Locator2.Apr22().getText();
       Thread.sleep(2000);
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
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator4.PWCSSABCConstructionCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	   
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ChandranganConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
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
       String PeriodText =Locator2.Apr22().getText();
       Thread.sleep(2000);
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
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator4.PWCSSABCconstructionNotCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ChandranganConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
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
       String PeriodText =Locator2.May22().getText();
       Thread.sleep(2000);
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
	    
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(7000);
		
	    Locator4.PWCSSABCconstructionNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ChandranganConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
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
       String PeriodText =Locator2.May22().getText();
       Thread.sleep(2000);
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
	    
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
		
	    Locator4.PWCSSABCconstructionNotCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ChandranganConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
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
       String PeriodText =Locator2.May22().getText();
       Thread.sleep(2000);
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
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(6000);
		
	    Locator4.PWCSSABCconstructionNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);  
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       	
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ChandranganConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
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
    String PeriodText =Locator2.Mar22().getText();
    Thread.sleep(2000);
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
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator4.PWCSSABCconstructionNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
      
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ChandranganConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
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
    String PeriodText =Locator2.Mar22().getText();
    Thread.sleep(2000);
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
		
		Locator4.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator4.PWCSSABCconstructionNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000); 
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.ChandranganConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
	       Thread.sleep(3000);
	       Locator2.ChandranganConstruction().click();
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
    String PeriodText =Locator2.Mar22().getText();
    Thread.sleep(2000);
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
		
	    Locator4.PWAuditStatusSummeryABCConstructionOverdue().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       
	    Locator2.Project().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator3.PRIUpdate().getText();
	       Thread.sleep(3000);
	       Locator3.PRIUpdate().click();
	       Thread.sleep(3000);
	       Locator3.PRIUpdate().click();
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
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator3.ReportTabPeriodDD().getText();
	       Thread.sleep(2000);
	      Locator3.ReportTabPeriodDD().click();
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
		filter.add("Overdue  -  Project");
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
		
		Method4.PWAuditStatusSummerABCConstructionPendingReview1(test, workbook);
		
		Thread.sleep(3000);
		Method4.PWAuditStatusSummerABCConstructionCompletedStatus(test, workbook);

		Thread.sleep(3000);
		
		
		
	}
	
	

	
	
	
	   
	
	
	public static void PWAuditStatusSummerABCConstructionPendingReview1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		 Locator4.PWAuditStatusSummerABCConstructionPendingReview().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator3.PRIUpdate().getText();
	       Thread.sleep(5000);
	       Locator3.PRIUpdate().click();
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
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator3.PeriodFilterCompliedMediumDD().getText();
	       Thread.sleep(2000);
	      Locator3.PeriodFilterCompliedMediumDD().click();
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
	
	
	
	
	public static void PWAuditStatusSummerABCConstructionCompletedStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		 Locator4.PWAuditStatusSummerABCConstructionCompleted().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	       Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator3.PRIUpdate().getText();
	       Thread.sleep(5000);
	       Locator3.PRIUpdate().click();
	       Thread.sleep(3000);
	       Locator3.PRIUpdate().click();
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
	       
	       Locator3.Period().click();
	       Thread.sleep(2000);
	       String periodtext =Locator3.Period3().getText();
	       Thread.sleep(2000);
	      Locator3.Period3().click();
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
		filter.add("Completed  - Project");
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
		
		Thread.sleep(20000);
		Locator2.Document().click();
		Thread.sleep(3000);
	    
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn1().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType1().click();
	    Thread.sleep(3000);
	    
	       Locator2.SelectLocationDocument().click();
	       Thread.sleep(3000);
			Locator3.DocumentSelectLocationDropDown().click();
			Thread.sleep(2000);
	       Locator2.SelectLocationDropDownDocument1().click();
	       Thread.sleep(3000);
		//	Locator3.DocumentSelectLocationDropDown1().click();
		//	Thread.sleep(2000);
		//     Locator2.SelectLocationDropDownDocument().click();
		//     Thread.sleep(3000);



	
	//       Locator2.SelectLocationDocument().click();
	//       Thread.sleep(3000);
	  //     Locator2.SelectLocationDropDocument().click();
	//		Thread.sleep(2000);
	       String locationText =Locator3.DocumentSelectLocationDropDown1().getText();
	       Thread.sleep(3000);
	       Locator3.DocumentSelectLocationDropDown1().click();
	       Thread.sleep(3000);
	       Locator2.SelectLocationDocument().click();
	       Thread.sleep(2000);
    
	       /*
		    Locator3.SelectContractor().click();
		    Thread.sleep(2000);
		    String contractortext =Locator3.SelectContractorDD().getText();
		    Thread.sleep(2000);
		    Locator3.SelectContractorDD().click();
		    Thread.sleep(2000);
		//    Locator3.SelectContractor().click();
		//    Thread.sleep(3000);
*/
	       
	       Locator2.DocumentTabSelectContractor().click();
	       Thread.sleep(2000);
	       String contractortext =Locator3.DocumentSelectContractorDropDown().getText();
	       Thread.sleep(2000);
	       Locator3.DocumentSelectContractorDropDown().click();
	       Thread.sleep(2000);
	       Locator2.DocumentTabSelectContractor().click();
	       Thread.sleep(5000);
    
    
    Locator3.DocumentSelectProject().click();
    Thread.sleep(2000);
    String projectText =Locator3.DocumentSelectProjectDropDown().getText();
    Thread.sleep(2000);
    Locator3.DocumentSelectProjectDropDown().click();
    Thread.sleep(2000);
    Locator3.DocumentSelectProject().click();
    Thread.sleep(2000);
    
    
    
    
     List<String> li=new ArrayList<String>();
     
     li.add(locationText);
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
	

	
	
	
	
	public static void ReportMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(10000);
		Locator2.Report().click();
		Thread.sleep(6000);
		
		Locator2.LocationReport().click();
		Thread.sleep(2000);
		
		String script = "return window.getComputedStyle(document.querySelector('k-icon k-i-expand'),':before').getPropertyValue('content')";
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String content = (String) js.executeScript(script);
        System.out.println(content);
        
        Thread.sleep(2000);
		Locator2.LocationProjectMasterExpand().click();
		Thread.sleep(2000);
	//	Locator2.VCALegalEntityExpandAA().click();
	//	Thread.sleep(3000);
		String locationtext =Locator2.VCALegalEntityAADD().getText();
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
  //     String contractortext =Locator2.ReportTabContractorDD().getText();
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
       String periodtext =Locator2.Feb23().getText();
       Thread.sleep(2000);
       Locator2.Feb23().click();
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
    //    li.add(contractortext);
        li.add(contractorTypetext);
        li.add(frequencytext);
        li.add(periodtext);
        li.add(statustext);
        
        
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("Project");
	//	filter.add("Contractor");
		filter.add("Contractor Type");
		filter.add("Frequency");
		filter.add("Period");
		filter.add("Status");
		
		
		JavascriptExecutor j = (JavascriptExecutor) getDriver();
		j.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator1.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator1.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> locationcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[11]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[2]"));
	//	List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> contractorTypecol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[10]"));

		
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
			/*
			else if(i==2)
			{
				raw.addAll(contractorcol);
			}
			*/
		
			else if(i==2)
			{
				raw.addAll(contractorTypecol);
			}
				
			else if(i==3)
			{
				raw.addAll(frequencycol);
			}
				
			else if(i==4)
			{
				raw.addAll(periodcol);
			}
				
			else if(i==5)
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
		
		Locator4.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorCompliedHigh().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorCompliedHigh().click();					                //Clicking on Dashboard count

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
		
		
		Method4.PWCSSubcontractorCompliedMedium(test, workbook);
		Thread.sleep(2000);
		
		
		Method4.PWCSSubcontractorLow(test, workbook);
		Thread.sleep(2000);
		
		
		
		
    }
	
	
	
	
	public static void PWCSSubcontractorCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorCompliedMedium().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count

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
		Locator4.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorNotCompliedHigh().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorNotCompliedHigh().click();					                //Clicking on Dashboard count

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
		Method4.PWCSSubcontractorNotCompliedMedium(test, workbook);
		Thread.sleep(2000);
		
		
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
	    
	   
		
		Locator3.PWCSSubContractorNotComplied().click();
		
		*/
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorNotCompliedLow().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorNotCompliedLow().click();					                //Clicking on Dashboard count

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
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorNotCompliedMedium().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorNotCompliedMedium().click();					                //Clicking on Dashboard count

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
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorNotApplicableHigh().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorNotApplicableHigh().click();					                //Clicking on Dashboard count

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
		
		Method4.PWCSSubcontractorNotApplicableMedium(test,workbook);
		Thread.sleep(4000);
		
		Method4.PWCSSubcontractorNotApplicableLow(test,workbook);
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
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorNotApplicableMedium().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorNotApplicableMedium().click();					                //Clicking on Dashboard count

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
		
		int open = Integer.parseInt(Locator4.PWCSSubContractorNotApplicableLow().getText());	//Reading Dashboard count.
	    Locator4.PWCSSubContractorNotApplicableLow().click();					                //Clicking on Dashboard count

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
	
    }
	
	
	
	
	
	
	public static void DownloadAndViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator3.Report().click();
		Thread.sleep(20000);
		
		 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		 js1.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(9000);
			
		
		Locator4.ProjectDrop1().click();
		Thread.sleep(7000);
		
		if(Locator3.DownloadAndViewButton().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator3.DownloadAndViewButton().click();
			test.log(LogStatus.PASS, " Download And view button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Download And View Button does not working properly "  );
			
		}
		Thread.sleep(4000);
		
	}
	
	
	public static void PWCSSubContractorCompliedHighmultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait(, 1000);
		
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3500)");
	    Thread.sleep(2000);
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator4.PWCSSubContractorCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator4.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator3.PWCSSubContractorProject().click();
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
	    String RiskText =Locator2.RiskNADD1().getText();
	    Thread.sleep(2000);
	    Locator2.RiskNADD1().click();
	    Thread.sleep(2000);
	    Locator2.Risk().click();
	    Thread.sleep(2000);
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(2000);
	    String PeriodText =Locator2.Apr22().getText();
	    Thread.sleep(2000);
	    Locator2.Apr22().click();
	    Thread.sleep(2000);
	
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

	    
	    List<String> li=new ArrayList<String>();
	     
	    
	      li.add(ProjectText);
	      li.add(Statustext);
	      li.add(RiskText);
	      li.add(PeriodText);
	      li.add(contractorTypeText);
	     
	      
	      Thread.sleep(3000);
	      
	 		List<String> filter=new ArrayList<String>();	
	 		
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
		
			List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
			List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
			List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));

			
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

			getDriver().switchTo().parentFrame();
				
			Thread.sleep(4000);
				
			Locator2.ClosePage().click();
				
			Thread.sleep(2000);
			
	      
		
		
		
		
		
	}
	
	
	
	
	public static void PWCSSubContractorCompliedMediummultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait(, 1000);
		
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3500)");
	    Thread.sleep(2000);
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator4.PWCSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator4.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator3.PWCSSubContractorProject().click();
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
	    String PeriodText =Locator2.Apr22().getText();
	    Thread.sleep(2000);
	    Locator2.Apr22().click();
	    Thread.sleep(2000);
	  
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

	    
	    List<String> li=new ArrayList<String>();
	     
	    
	      li.add(ProjectText);
	      li.add(Statustext);
	      li.add(RiskText);
	      li.add(PeriodText);
	      li.add(contractorTypeText);
	     
	      
	      Thread.sleep(3000);
	      
	 		List<String> filter=new ArrayList<String>();	
	 		
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
		
			List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
			List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
			List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));

			
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

			getDriver().switchTo().parentFrame();
				
			Thread.sleep(4000);
				
			Locator2.ClosePage().click();
				
			Thread.sleep(2000);
			
	      
		
		
		
		
		
	}
	
	
	
	public static void PWCSSubContractorCompliedLowmultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait(, 1000);
		
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3500)");
	    Thread.sleep(2000);
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator4.PWCSSubContractorCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator4.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator3.PWCSSubContractorProject().click();
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
	    String PeriodText =Locator2.Apr22().getText();
	    Thread.sleep(2000);
	    Locator2.Apr22().click();
	    Thread.sleep(2000);
	 
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

	    
	    List<String> li=new ArrayList<String>();
	     
	    
	      li.add(ProjectText);
	      li.add(Statustext);
	      li.add(RiskText);
	      li.add(PeriodText);
	      li.add(contractorTypeText);
	     
	      
	      Thread.sleep(3000);
	      
	 		List<String> filter=new ArrayList<String>();	
	 		
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
		
			List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
			List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
			List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));

			
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

			
			
		    
			Thread.sleep(4000);
			
			getDriver().switchTo().parentFrame();
				
			Thread.sleep(4000);
				
			Locator2.ClosePage().click();
				
			Thread.sleep(2000);
			
	      
		
		
		
		
		
	}
	
	
	
	
	
	public static void PWCSSubContractorNotCompliedHighmultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait(, 1000);
		
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator4.PWCSSubContractorNotCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator4.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator3.PWCSSubContractorProject().click();
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
	    String RiskText =Locator2.RiskNADD1().getText();
	    Thread.sleep(2000);
	    Locator2.RiskNADD1().click();
	    Thread.sleep(2000);
	    Locator2.Risk().click();
	    Thread.sleep(2000);
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(2000);
	    String PeriodText =Locator2.May22().getText();
	    Thread.sleep(2000);
	    Locator2.May22().click();
	    Thread.sleep(2000);
	 
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

	    
	    List<String> li=new ArrayList<String>();
	     
	    
	      li.add(ProjectText);
	      li.add(Statustext);
	      li.add(RiskText);
	      li.add(PeriodText);
	      li.add(contractorTypeText);
	     
	      
	      Thread.sleep(3000);
	      
	 		List<String> filter=new ArrayList<String>();	
	 		
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
		
			List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
			List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
			List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));

			
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

			getDriver().switchTo().parentFrame();
				
			Thread.sleep(4000);
				
			Locator2.ClosePage().click();
				
			Thread.sleep(2000);
			
	      
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void PWCSSubContractorNotCompliedMediummultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait(, 1000);
		
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator4.PWCSSubContractorNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator4.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator3.PWCSSubContractorProject().click();
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
	    String PeriodText =Locator2.May22().getText();
	    Thread.sleep(2000);
	    Locator2.May22().click();
	    Thread.sleep(2000);
	  
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

	    
	    List<String> li=new ArrayList<String>();
	     
	    
	      li.add(ProjectText);
	      li.add(Statustext);
	      li.add(RiskText);
	      li.add(PeriodText);
	      li.add(contractorTypeText);
	     
	      
	      Thread.sleep(3000);
	      
	 		List<String> filter=new ArrayList<String>();	
	 		
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
		
			List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
			List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
			List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));

			
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

			getDriver().switchTo().parentFrame();
				
			Thread.sleep(4000);
				
			Locator2.ClosePage().click();
				
			Thread.sleep(2000);
			
	      
		
		
		
		
		
	}
	
	
	public static void PWCSSubContractorNotCompliedLowmultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait(, 1000);
		
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
	    
	    
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator4.PWCSSubContractorNotCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator4.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator3.PWCSSubContractorProject().click();
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
	    String PeriodText =Locator2.May22().getText();
	    Thread.sleep(2000);
	    Locator2.May22().click();
	    Thread.sleep(2000);
	 
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

	    
	    List<String> li=new ArrayList<String>();
	     
	    
	      li.add(ProjectText);
	      li.add(Statustext);
	      li.add(RiskText);
	      li.add(PeriodText);
	      li.add(contractorTypeText);
	     
	      
	      Thread.sleep(3000);
	      
	 		List<String> filter=new ArrayList<String>();	
	 		
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
		
			List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
			List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
			List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));

			
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

			
			
		    
			Thread.sleep(4000);
			
			getDriver().switchTo().parentFrame();
				
			Thread.sleep(4000);
				
			Locator2.ClosePage().click();
				
			Thread.sleep(2000);
			
	      
		
		
		
		
		
	}
	
	
	
	public static void PWCSSubContractorNotApplicableHighmultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait(, 1000);
		
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator4.PWCSSubContractorNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator4.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator3.PWCSSubContractorProject().click();
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
	    Locator2.Risk().click();
	    Thread.sleep(2000);
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(2000);
	    String PeriodText =Locator2.Mar22().getText();
	    Thread.sleep(2000);
	    Locator2.Mar22().click();
	    Thread.sleep(2000);
	  
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

	    
	    List<String> li=new ArrayList<String>();
	     
	    
	      li.add(ProjectText);
	      li.add(Statustext);
	      li.add(RiskText);
	      li.add(PeriodText);
	      li.add(contractorTypeText);
	     
	      
	      Thread.sleep(3000);
	      
	 		List<String> filter=new ArrayList<String>();	
	 		
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
		
			List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
			List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
			List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));

			
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

			getDriver().switchTo().parentFrame();
				
			Thread.sleep(4000);
				
			Locator2.ClosePage().click();
				
			Thread.sleep(2000);
			
	      
		
		
		
		
		
	}
	
	
	
	
	public static void PWCSSubContractorNotApplicableMediummultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait(, 1000);
		
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator4.PWCSSubContractorNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator4.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator3.PWCSSubContractorProject().click();
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
	    String PeriodText =Locator2.Mar22().getText();
	    Thread.sleep(2000);
	    Locator2.Mar22().click();
	    Thread.sleep(2000);
	 
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

	    
	    List<String> li=new ArrayList<String>();
	     
	    
	      li.add(ProjectText);
	      li.add(Statustext);
	      li.add(RiskText);
	      li.add(PeriodText);
	      li.add(contractorTypeText);
	     
	      
	      Thread.sleep(3000);
	      
	 		List<String> filter=new ArrayList<String>();	
	 		
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
		
			List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
			List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
			List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));

			
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

			getDriver().switchTo().parentFrame();
				
			Thread.sleep(4000);
				
			Locator2.ClosePage().click();
				
			Thread.sleep(2000);
			
	      
		
		
		
		
		
	}
	
	
	
	
	public static void PWCSSubContractorNotApplicableLowmultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//WebWait wait = new WebWait(, 1000);
		
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		Locator4.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator4.PWCSSubContractorNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator4.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator4.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator3.PWCSSubContractorProject().click();
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
	    String PeriodText =Locator2.Mar22().getText();
	    Thread.sleep(2000);
	    Locator2.Mar22().click();
	    Thread.sleep(2000);
	  
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(3000);

	    
	    List<String> li=new ArrayList<String>();
	     
	    
	      li.add(ProjectText);
	      li.add(Statustext);
	      li.add(RiskText);
	      li.add(PeriodText);
	      li.add(contractorTypeText);
	     
	      
	      Thread.sleep(3000);
	      
	 		List<String> filter=new ArrayList<String>();	
	 		
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
		
			List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[1]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[6]"));
			List<WebElement> riskcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[7]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[5]"));
			List<WebElement> contractortypecol=getDriver().findElements(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr[1]/td[4]"));

			
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

			getDriver().switchTo().parentFrame();
				
			Thread.sleep(4000);
				
			Locator2.ClosePage().click();
				
			Thread.sleep(2000);
				
		
	}
	

	public static void WorkspaceTaskFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(10000);
		Locator2.Report().click();
		Thread.sleep(6000);
		
		Locator2.LocationReport().click();
		Thread.sleep(2000);
		Locator2.VCALegalEntityAADD().click();
		Thread.sleep(2000);
		Locator2.VCALegalEntityExpandAA().click();
		Thread.sleep(3000);
		String locationtext =Locator2.VCALegalEntityAADDGetText().getText();
	    Thread.sleep(2000);
	   Locator2.VCALegalEntityAADDGetText().click();
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
       String frequencytext =Locator2.ReportTabFequencyDD1().getText();
       Thread.sleep(2000);
       Locator2.ReportTabFequencyDD1().click();
       Thread.sleep(2000);
       Locator2.ReportTabFequency().click();
       Thread.sleep(2000);
       
       
       Locator2.ReportTabPeriod().click();
       Thread.sleep(2000);
       String periodtext =Locator2.Jan22().getText();
       Thread.sleep(2000);
       Locator2.Jan22().click();
       Thread.sleep(2000);
       Locator2.ReportTabPeriod().click();
       Thread.sleep(2000);
       
       
       Locator2.ReportTabStatus().click();
       Thread.sleep(2000);
       String statustext =Locator2.Status2Closed().getText();
       Thread.sleep(2000);
       Locator2.Status2Closed().click();
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
	
		List<WebElement> locationcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[11]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[2]"));
		List<WebElement> contractorcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[5]"));
		List<WebElement> contractorTypecol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[7]"));
		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[9]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[10]"));

		
		Thread.sleep(2000);
			
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
						//||text.get(l).equalsIgnoreCase("Pending")
						if(i==2)
						{
							if(text.get(l).equalsIgnoreCase(" - vendor@tlregtech.in"))
							{
							  pass.add(text.get(l));
							}
							/*
							else
							{
								 fail.add(text.get(l));
							}
							*/
						}
						else
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
	
	
	
	}
	
	public static void MyWorkspaceLicense( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(10000);
			
		   Locator4.LicenseTab().click();
		   Thread.sleep(3000);
		   
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='leftdocumentmenu']"))); 
			Thread.sleep(1000);
			
	if(Locator4.LicenseTab().isDisplayed()) {
				
				test.log(LogStatus.PASS, "License tab should be seen below the dashboard tab.");
			}else {
				
				test.log(LogStatus.FAIL, "Audit and License tab should not be below the dashboard tab.");
				
			}
		
		    
			Locator4.LicenseTab().click();
			Thread.sleep(3000);
		   
			
	}
	
	public static void MyWorkspaceLicenseSearch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(10000);
			
		   
		   
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='leftdocumentmenu']"))); 
			Thread.sleep(1000);
			
			Locator4.LicenseTab().click();
			Thread.sleep(3000);
		  
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
		   Method4.LicenceGridAndExcelCount(test,workbook);
		   
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
	
	
	
	}
