package companyProjectHead;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

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
import companyAuditor.Method2;
import companyContractor.Locator1;
import companyManagement.Locator5;
import companyProjectDirector.Locator4;
import companyProjectDirector.Method4;
import login.BasePage;

public class Method3 extends BasePage{

	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ProjectsCountGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(20000);
		
		int open = Integer.parseInt(Locator3.Projects().getText());	//Reading Dashboard count.
        Locator3.Projects().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

		String item = Locator3.Projectsgrid().getText();
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
		
		int open = Integer.parseInt(Locator3.Contractors().getText());	//Reading Dashboard count.
        Locator3.Contractors().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

		String item = Locator3.Contractorsgrid().getText();
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
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Complied
	
	
	public static void GraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator3.GreenGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator3.RedGraph().getText());	//Reading Dashboard count.
	    Locator3.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(9000);

		String item = Locator3.RedGraphGrid().getText();
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
		
		
		if(Locator3.ClearButtonRedGraphGrid().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ClearButtonRedGraphGrid().click();
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
		
		Locator2.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method3.YellowGraphDashboardGridCount(test, workbook);
		Thread.sleep(4000);
		
		
		Method3.GreenInGreenGraph(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
	public static void YellowGraphDashboardGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator2.YellowGraph().getText());	//Reading Dashboard count.
	    Locator2.YellowGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator3.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator3.YellowGraphViewButton().click();
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
	
	
	
	
	
	
	
	public static void GreenInGreenGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		int open = Integer.parseInt(Locator2.GreenGraphinGreen().getText());	//Reading Dashboard count.
	    Locator2.GreenGraphinGreen().click();					                //Clicking on Dashboard count

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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
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
	
	
	
//////////////////////////Not Complied SWS
	
	
	
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
		int open = Integer.parseInt(Locator3.RedGraph2Green().getText());	//Reading Dashboard count.
	    Locator3.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.RedGraph2GreenGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.RedGraph2GreenClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.RedGraph2GreenClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
        Thread.sleep(2000);
		
		if(Locator3.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreenViewButton().click();
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
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void RedInYellowCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		int open = Integer.parseInt(Locator2.RedGraphInYellow().getText());	//Reading Dashboard count.
	    Locator2.RedGraphInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.RedGraphInYellowGrid().getText();
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
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.RedGraphInYellowClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.RedGraphInYellowClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
        Thread.sleep(2000);
		
		if(Locator3.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreenViewButton().click();
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
		
		Locator2.ClosePage().click();
		
		Thread.sleep(2000);
		

	}
	
	
	
	
	
	
	
	public static void RedInRedGraphCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator3.RedGraph2().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator3.RedGraphInRed().getText());	//Reading Dashboard count.
	    Locator3.RedGraphInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.RedGraphInRedGrid().getText();
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
		
		
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.RedGraphInRedGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.RedGraphInRedGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
        Thread.sleep(2000);
		
		if(Locator3.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreenViewButton().click();
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
		
		Locator3.ClosePage().click();
		
		Thread.sleep(2000);
		
		Method3.RedInYellowCountMatch(test, workbook);
		
		Thread.sleep(4000);
		
		Method3.RedInGreenGraphCountMatch(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
	}
	
	/// Status Wise Summery Not Applicable
	
	
	public static void GreyGraphCountMatchGreen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		int open = Integer.parseInt(Locator3.GreyInGreenGraph().getText());	//Reading Dashboard count.
	    Locator3.GreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000); 
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
	    
	    
	    Thread.sleep(2000);
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.GreyInGreenClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreyInGreenClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator3.ViewGreyInGreen().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator3.ViewGreyInGreen().click();
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
	
	
	
	public static void GreyGraphYellowCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		
		
		int open = Integer.parseInt(Locator3.GreyInYellow().getText());	//Reading Dashboard count.
	    Locator3.GreyInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
	    
	    
	    Thread.sleep(2000);
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.GreyInYellowClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreyInYellowClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator3.GreyInYellowViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreyInYellowViewButton().click();
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
	
	
	//SWS Not Applicable
	
	
	public static void GreyInRedCountMtch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator3.GreyGraph().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator3.GreyInRed().getText());	//Reading Dashboard count.
	    Locator3.GreyInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.GreyInRedGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreyInRedGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		
		if(Locator3.GreyInRedGridViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreyInRedGridViewButton().click();
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
		
		
		Method3.GreyGraphYellowCountMatch(test, workbook);
		
		Thread.sleep(2000);
		
		
		Method3.GreyGraphCountMatchGreen(test, workbook);
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	
		
	}
	

	
	
	
	//Status Wise Summary Audit Completion Status
	
	
	public static void AuditCompletionStatusRed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		
		
		int open = Integer.parseInt(Locator3.ACSREDGraph().getText());	//Reading Dashboard count.
	    Locator3.ACSREDGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
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
		
		Method3.AuditCompletionStatusBlueGraph(test, workbook);
		
		Thread.sleep(6000);
		
		Method3.AuditCompletionStatusGreenGraph(test, workbook);
			
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
		
		int open = Integer.parseInt(Locator3.ACSBlueGraph().getText());	//Reading Dashboard count.
	    Locator3.ACSBlueGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.ACSBlueGraphGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.ACSBlueGraphGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSBlueGraphGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		if(Locator3.ACSBlueGraphGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSBlueGraphGridExportButton().click();
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
		
		Thread.sleep(2000);
		
		
		
		
		
			
		
		
	}
	
	
	
	
	public static void AuditCompletionStatusGreenGraph( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		
		/*
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator3.ACSGreenGraph().getText());	//Reading Dashboard count.
	    Locator3.ACSGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.ACSGreenGraphGreed().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.ACSGreenGraphGreedClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSGreenGraphGreedClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		if(Locator3.ACSGreenGraphGreedExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSGreenGraphGreedExportButton().click();
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
		
		Locator3.CTWCompliedGreen().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator3.CTWCompliedGreenHigh().getText());	//Reading Dashboard count.
	    Locator3.CTWCompliedGreenHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
		
		Locator2.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method3.CTWCompliedMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method3.CTWCompliedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
	public static void CTWCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator3.CTWCompliedGreenMedium().getText());	//Reading Dashboard count.
	    Locator3.CTWCompliedGreenMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
	
	
	
	
	
	
	
	public static void CTWCompliedLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		int open = Integer.parseInt(Locator3.CTWCompliedGreenLow().getText());	//Reading Dashboard count.
	    Locator3.CTWCompliedGreenLow().click();					                //Clicking on Dashboard count

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
	
	
	
	
	public static void CTWNotCompliedRed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Canteen']"))); 
		Thread.sleep(2000);
		
		Locator3.CTWNotCompliedRed().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator3.CTWNotCompliedRedHigh().getText());	//Reading Dashboard count.
	    Locator3.CTWNotCompliedRedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
			test.log(LogStatus.FAIL, "  Overview button working properly "  );
			
		}
		
		
		Thread.sleep(4000);
		
		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator2.ClosePage().click();
		
		Thread.sleep(4000);
		
		Method3.CTWNotCompliedRedMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method3.CTWNotCompliedRedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
	public static void CTWNotCompliedRedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator3.CTWNotCompliedRedmedium().getText());	//Reading Dashboard count.
	    Locator3.CTWNotCompliedRedmedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator3.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator3.YellowGraphViewButton().click();
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
		
		int open = Integer.parseInt(Locator3.CTWNotCompliedRedLow().getText());	//Reading Dashboard count.
	    Locator3.CTWNotCompliedRedLow().click();					                //Clicking on Dashboard count

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
	
	
	
	public static void CTWNotApplicableGrey( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Canteen']"))); 
		Thread.sleep(2000);
	
		Locator3.CTWNotApplicableGrey().click();
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator3.CTWNotApplicableHigh().getText());	//Reading Dashboard count.
	    Locator3.CTWNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
		
		Locator2.ClosePage().click();
		
		Thread.sleep(4000);
	
		
		Method3.CTWNotApplicableMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method3.CTWNotApplicableLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
	}
	
	
	
	
	
		
	public static void CTWNotApplicableMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator3.CTWNotApplicableMedium().getText());	//Reading Dashboard count.
	    Locator3.CTWNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "   Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator3.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator3.YellowGraphViewButton().click();
				test.log(LogStatus.PASS, "   OverOverview button working properly " );
				
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
		
		
		int open = Integer.parseInt(Locator3.CTWNotApplicableLow().getText());	//Reading Dashboard count.
	    Locator3.CTWNotApplicableLow().click();					                //Clicking on Dashboard count

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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
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
			test.log(LogStatus.PASS, "   OverOverview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   OverOverview button working properly "  );
			
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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1600)");
	    Thread.sleep(6000);
	    
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"))); 
	//	Thread.sleep(3000);
		
		
		
		int open = Integer.parseInt(Locator3.CTWOverdueRed().getText());	//Reading Dashboard count.
	    Locator3.CTWOverdueRed().click();					                //Clicking on Dashboard count

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
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		

		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method3.CTWAuditStatusSummeryPendingReview(test, workbook);
		
		Thread.sleep(4000);
		
		Method3.CTWAuditStatusSummeryCompleted(test, workbook);
			
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
		
		int open = Integer.parseInt(Locator3.CTWPendingReviewYellow().getText());	//Reading Dashboard count.
	    Locator3.CTWPendingReviewYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.ACSBlueGraphGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.ACSBlueGraphGridClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSBlueGraphGridClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		/*
		if(Locator3.ACSBlueGraphGridExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSBlueGraphGridExportButton().click();
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
	     Locator3.ACSBlueGraphGridExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		

		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
			
		
		
	}
	
	
	
	
	
	
	
	public static void CTWAuditStatusSummeryCompleted( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(2000);
		
		/*
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator3.CTWCompletedGreen().getText());	//Reading Dashboard count.
	    Locator3.CTWCompletedGreen().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.ACSGreenGraphGreed().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.ACSGreenGraphGreedClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSGreenGraphGreedClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		Thread.sleep(2000);
		/*
		if(Locator3.ACSGreenGraphGreedExportButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ACSGreenGraphGreedExportButton().click();
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
	     Locator3.ACSGreenGraphGreedExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		

		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	

	
	
//  Project Wise - Audit Status Summary
	
	
	
	
	
	public static void PWAuditStatusSummeryABCConstructionOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(9000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(7000);
	    
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[29]"))); 
	//	Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator3.PWAuditStatusSummeryABCConstructionOverdue().getText());	//Reading Dashboard count.
	    Locator3.PWAuditStatusSummeryABCConstructionOverdue().click();					                //Clicking on Dashboard count

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
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		

		
		Thread.sleep(4000);

		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method3.PWAuditStatusSummerABCConstructionPendingReview(test, workbook);
		
		Thread.sleep(3000);
		
		Method3.PWAuditStatusSummeryABCConstructionCompleted(test, workbook);
		Thread.sleep(3000);
		
		
	}
	
	

	public static void PWAuditStatusSummeryABCConstructionCompleted( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		/*
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(18000);
		
		*/
	//    Locator3.OverdueCircle().click();					                //Clicking on Dashboard count
	//    Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator3.PWAuditStatusSummeryCompleted().getText());	//Reading Dashboard count.
	    Locator3.PWAuditStatusSummeryCompleted().click();					                //Clicking on Dashboard count

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
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		

		
		Thread.sleep(4000);


		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
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
	    Locator3.OverdueCircle().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator3.PWAuditStatusSummerABCConstructionPendingReview().getText());	//Reading Dashboard count.
	    Locator3.PWAuditStatusSummerABCConstructionPendingReview().click();					                //Clicking on Dashboard count

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
		Thread.sleep(2000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		

		
		Thread.sleep(4000);

		
		
		

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void PWAuditStatusSummeryCompletedABCHeritage( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(18000);
		
		
		
		int open = Integer.parseInt(Locator3.PWAuditStatusSummeryCompleted().getText());	//Reading Dashboard count.
	    Locator3.PWAuditStatusSummeryCompleted().click();					                //Clicking on Dashboard count

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
		Thread.sleep(2000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		

		
		Thread.sleep(4000);

		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
	}
	
	
	

	
	
	
	public static void PWAuditStatusSummeryYashHeritageOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(18000);
		
		
		
		int open = Integer.parseInt(Locator3.PWAuditStatusSummeryYashHeritageOverdue().getText());	//Reading Dashboard count.
	    Locator3.PWAuditStatusSummeryYashHeritageOverdue().click();					                //Clicking on Dashboard count

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
		
		Thread.sleep(2000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
		Method3.PWAuditStatusSummeryashHeritagePendingReview(test, workbook);
		
		Thread.sleep(3000);
		
	}
	
	

	
	
	
	
	
	public static void PWAuditStatusSummeryABC4HeritageOverdue( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(18000);
		
		
		
		int open = Integer.parseInt(Locator3.PWAuditStatusSummeryABC4HeritageOverdue().getText());	//Reading Dashboard count.
	    Locator3.PWAuditStatusSummeryABC4HeritageOverdue().click();					                //Clicking on Dashboard count

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
		Thread.sleep(2000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
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
			
		}*/
		
		Thread.sleep(2000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ACSREDGraphGridExportButton().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		
		Thread.sleep(4000);

		
		
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator3.ClosePage().click();
		
		Thread.sleep(3000);
		
	}
	
	
	
	
	
     // Project Wise - Compliance Status Summary-TLR1-project1
	

	
	
	
	public static void PWSGraph1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		Locator3.PWSGraph1().click();
		Thread.sleep(2000);
		
		
		
		int open = Integer.parseInt(Locator3.PWSTLR1High().getText());	//Reading Dashboard count.
	    Locator3.PWSTLR1High().click();					                //Clicking on Dashboard count

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
						
		test.log(LogStatus.PASS, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
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
			test.log(LogStatus.PASS, "   OverOverview button working properly " );
			
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
		
		
		Method3.PWSTLR1Low(test, workbook);
		
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	
	public static void PWSTLR1Low( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		Locator3.PWSGraph1().click();
		Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator3.PWSTLR1Low().getText());	//Reading Dashboard count.
	    Locator3.PWSTLR1Low().click();					                //Clicking on Dashboard count

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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
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
			test.log(LogStatus.PASS, "   OverOverview button working properly " );
			
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
	

	
	
	
	
	//Bar Graph Project2-projectlight
	
	
	
	
	public static void PWSLegalbright( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		Locator3.PWSLegalbright().click();
		Thread.sleep(2000);
		
		
		
		int open = Integer.parseInt(Locator3.PWSLegalbrightHigh().getText());	//Reading Dashboard count.
	    Locator3.PWSLegalbrightHigh().click();					                //Clicking on Dashboard count

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
						
		test.log(LogStatus.PASS, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " High Risk - Dashboard Graph Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(9000);
		
		
		Thread.sleep(2000);
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
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
			test.log(LogStatus.PASS, "   OverOverview button working properly " );
			
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
		
		
		Method3.PWSLegalbrightLow(test, workbook);
		
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	
	public static void PWSLegalbrightLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
		
		Locator3.PWSGraph1().click();
		Thread.sleep(2000);
		
		*/
		
		int open = Integer.parseInt(Locator3.PWSLegalbrightLow().getText());	//Reading Dashboard count.
	    Locator3.PWSLegalbrightLow().click();					                //Clicking on Dashboard count

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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "  Clear button working properly " );
			
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
			test.log(LogStatus.PASS, "   OverOverview button working properly " );
			
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
	
//Bar Graph
	
	
	
	public static void PWCSSABCConstructionCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2100)");
	    Thread.sleep(6000);
	    
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
	//	Thread.sleep(2000);
		
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
		
	//	Locator1.CompliedCircle().click();
	//	   Thread.sleep(3000);
		    
	  //  Locator4.NotCompliedCircle().click();
	//	Thread.sleep(3000);
		    
		// Locator4.NotApplicableCircle().click();
		  Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator3.PWCSSABCConstructionCompliedHigh().getText());	//Reading Dashboard count.
	    Locator3.PWCSSABCConstructionCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(3000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	   // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
		//Thread.sleep(500);	
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
			
		Thread.sleep(4000);
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,11000)");
	    Thread.sleep(18000);

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
		
		Method3.PWCSSABCConstructionCompliedMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method3.PWCSSABCConstructionCompliedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
	public static void PWCSSABCConstructionCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator3.PWCSSABCConstructionCompliedMedium().getText());	//Reading Dashboard count.
	    Locator3.PWCSSABCConstructionCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.YellowGraphGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "   Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator3.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator3.YellowGraphViewButton().click();
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
		
		int open = Integer.parseInt(Locator3.PWCSSABCConstructionCompliedLow().getText());	//Reading Dashboard count.
	    Locator3.PWCSSABCConstructionCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.GreenGraphinGreenGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator3.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreenViewButton().click();
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
	
	
	
	public static void PWCSSABCconstructionNotCompliedHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(4000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2100)");
	    Thread.sleep(2000);
	    
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
	    
	    
	//    Locator4.CompliedCircle().click();
	//	   Thread.sleep(3000);
		    
	  //  Locator4.NotCompliedCircle().click();
	//	Thread.sleep(3000);
		    
	//	 Locator4.NotApplicableCircle().click();
	//    Thread.sleep(3000);
	    
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(4000);
		
		int open = Integer.parseInt(Locator3.PWCSSABCconstructionNotCompliedHigh().getText());	//Reading Dashboard count.
	    Locator3.PWCSSABCconstructionNotCompliedHigh().click();					                //Clicking on Dashboard count

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
		
		Method3.PWCSSABCconstructionNotCompliedMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method3.PWCSSABCconstructionNotCompliedLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
	public static void PWCSSABCconstructionNotCompliedMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator3.PWCSSABCconstructionNotCompliedMedium().getText());	//Reading Dashboard count.
	    Locator3.PWCSSABCconstructionNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.YellowGraphGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "   Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator3.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator3.YellowGraphViewButton().click();
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
		
		int open = Integer.parseInt(Locator3.PWCSSABCconstructionNotCompliedLow().getText());	//Reading Dashboard count.
	    Locator3.PWCSSABCconstructionNotCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.GreenGraphinGreenGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator3.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreenViewButton().click();
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
	
	
	
	public static void PWCSSABCconstructionNotApplicableHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
    {
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2100)");
	    Thread.sleep(2000);
	    
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
	//	Thread.sleep(2000);
	    
	  //  Locator4.CompliedCircle().click();
		//   Thread.sleep(3000);
		    
	//    Locator4.NotCompliedCircle().click();
	//	Thread.sleep(3000);
		    
	//	 Locator4.NotApplicableCircle().click();
	//	  Thread.sleep(3000);
	    
	    
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator3.PWCSSABCconstructionNotApplicableHigh().getText());	//Reading Dashboard count.
	    Locator3.PWCSSABCconstructionNotApplicableHigh().click();					                //Clicking on Dashboard count

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
		
		Method3.PWCSSABCconstructionNotApplicableMedium(test, workbook);
		Thread.sleep(4000);
		
		
		Method3.PWCSSABCconstructionNotApplicableLow(test, workbook);
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
	public static void PWCSSABCconstructionNotApplicableMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		int open = Integer.parseInt(Locator3.PWCSSABCconstructionNotApplicableMedium().getText());	//Reading Dashboard count.
	    Locator3.PWCSSABCconstructionNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(18000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.YellowGraphGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, "   Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "   Clear button working properly "  );
			
		}
		
		
		
		
		
		 Thread.sleep(2000);
			
			if(Locator3.YellowGraphViewButton().isEnabled())
			{
				
				Thread.sleep(2000);
			    Locator3.YellowGraphViewButton().click();
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
		
		int open = Integer.parseInt(Locator3.PWCSSABCconstructionNotApplicableLow().getText());	//Reading Dashboard count.
	    Locator3.PWCSSABCconstructionNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator2.GridLoad()));
	    
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
	    
	    
	 //   scrollToBottom();
	    
	    
	   

		String item = Locator3.GreenGraphinGreenGrid().getText();
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
		
		Locator3.ClearContractorRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		Locator3.ClearContractorDDRedGraphGrid().click();
		Thread.sleep(2000);
		
		
		if(Locator3.YellowGraphClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.YellowGraphClearButton().click();
			test.log(LogStatus.PASS, " Clear button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Clear button does not working properly "  );
			
		}
		
		
		
		Thread.sleep(2000);
		
		if(Locator3.GreenViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.GreenViewButton().click();
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
	



	
	
	public static void DocumentViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator3.Document().click();
		Thread.sleep(20000);
		
		
		
		if(Locator3.DocumentView().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.DocumentView().click();
			test.log(LogStatus.PASS, " Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		
		
		
	}
	
	
	
	public static void DownloadCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator3.Document().click();
		Thread.sleep(20000);
		
		Locator3.DocumentCheckBox().click();
		Thread.sleep(2000);
		
		/*
		if(Locator3.DocumentDownload().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.DocumentDownload().click();
			test.log(LogStatus.PASS, " File Download Verification " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Verification "  );
			
		}
		*/
		
		Thread.sleep(2000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.DocumentDownload().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		
		Thread.sleep(4000);

	
		
		
	}
	
	
	
	public static void MultipleDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		Thread.sleep(20000);
		Locator3.Document().click();
		Thread.sleep(20000);
		
		Locator3.DocumentCheckBox().click();
		Thread.sleep(2000);
		
		Locator3.DocumentCheckBox1().click();
		Thread.sleep(2000);
		
		/*
		if(Locator3.DocumentDownload().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.DocumentDownload().click();
			test.log(LogStatus.PASS, " File Download Verification " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Verification "  );
			
		}
		*/
		Thread.sleep(2000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.DocumentDownload().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " File Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " File Does Not Downloaded Successfully");
		}		
		Thread.sleep(4000);

		
		
		
	}
	
	
	
	
	public static void DocumentClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator3.Document().click();
		Thread.sleep(20000);
		
		Locator3.DocumentSelectLocation().click();
		Thread.sleep(2000);
		
	//	Locator3.DocumentSelectLocationDrop().click();
	//	Thread.sleep(2000);
		
		Locator3.DocumentSelectLocationDropDown().click();
		Thread.sleep(2000);
		
		Locator3.DocumentSelectContractor().click();
		Thread.sleep(2000);
		
		Locator3.DocumentSelectContractorDropDown().click();
		Thread.sleep(2000);
		
		Locator3.DocumentSelectProject().click();
		Thread.sleep(2000);
		
		Locator3.DocumentSelectProjectDropDown().click();
		Thread.sleep(2000);
		
		
		if(Locator3.DocumentClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.DocumentClearButton().click();
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
		Locator3.Report().click();
		Thread.sleep(20000);
		
		
		
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
	     Locator3.ReportExtendReport().click();
		
	 	Thread.sleep(3000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Filet does not Download Successfully");
		}

		
		
		
		/*
		
		
		if(Locator3.ReportExtendReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ReportExtendReport().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  File Download Successfully "  );
			
		}
		
		*/
		
	}
	
	
	
	
	public static void FileDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator3.Report().click();
		Thread.sleep(9000);
		
		/*
		Thread.sleep(2000);
		Locator3.Paging().click();

		Thread.sleep(2000);
		Locator3.Paging20().click();
		Thread.sleep(2000);
		*/
	      Locator2.ProjectReport().click();
	       Thread.sleep(2000);
	       Locator2.ProjectReportDD().click();
	       Thread.sleep(2000);
	       Locator2.ProjectReport().click();
	       Thread.sleep(2000);
	 
		/*
		if(Locator3.ReportFileDownload().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator3.ReportFileDownload().click();
			test.log(LogStatus.PASS, " Compliances Remark Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Compliances Remark Report Download Successfully "  );
			
		}
		*/
	       
			Thread.sleep(2000);
			File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(9000);
		     Locator3.ReportFileDownload().click();
			
		 	Thread.sleep(18000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
		   
	        Thread.sleep(9000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Compliances Remark Report Download Successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "Compliances Remark Report does not Download Successfully");
			}		
			Thread.sleep(4000);

		
 		
	}
	
	
	
	public static void ClearButtonReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator3.Report().click();
		Thread.sleep(20000);
		
		Locator3.ReportState().click();
		Thread.sleep(2000);
		
		Locator3.ReportStateDropDown().click();
		Thread.sleep(2000);
		
		Locator3.ReportClearButton().click();
		Thread.sleep(2000);
		
		if(Locator3.ReportClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ReportClearButton().click();
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
		Locator3.Report().click();
		Thread.sleep(20000);
		
		Locator3.ReportMoreReport().click();
		Thread.sleep(2000);
		/*
		if(Locator3.ClosedAuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ClosedAuditReport().click();
			test.log(LogStatus.PASS, " Closed Audit Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Closed Audit Report Download Successfully "  );
			
		}
		*/
		
		Thread.sleep(2000);
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ClosedAuditReport().click();
		
	 	Thread.sleep(18000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Closed Audit Report Downloaded");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Closed Audit Report does not Downloaded");
		}		
		Thread.sleep(4000);
		
		
		Locator3.MonthReport().click();
		
		Thread.sleep(2000);
		
		Locator3.MonthReportDD().click();
		
		Thread.sleep(2000);
		
	//	Locator3.MonthWiseClosedAuditReport().click();
		
		/*
		if(Locator3.MonthWiseClosedAuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.MonthWiseClosedAuditReport().click();
			test.log(LogStatus.PASS, " Month Wise Closed Audit Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Month Wise Closed Audit Report Download Successfully  "  );
			
		}
		*/
		Thread.sleep(2000);
		File dir = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.MonthWiseClosedAuditReport().click();
		
	 	Thread.sleep(18000);
		File dir1 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "Closed Audit Report Downloaded");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Closed Audit Report does not Downloaded");
		}		
		Thread.sleep(4000);
		

		
		
		Thread.sleep(2000);
		/*
		if(Locator3.ComplianceRemarkReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.ComplianceRemarkReport().click();
			test.log(LogStatus.PASS, " Compliance Remark Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Compliance Remark Report Download Successfully  "  );
			
		}
		*/
		
		Thread.sleep(2000);
		File dira = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContentsa = dira.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.ComplianceRemarkReport().click();
		
	 	Thread.sleep(18000);
		File dirb = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNewb = dirb.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContentsa.length < allFilesNewb.length) {
			test.log(LogStatus.PASS,  "Compliance Remark Report Downloaded");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Compliance Remark does not Report Downloaded");
		}		
		Thread.sleep(4000);

		

		/*
		if(Locator3.AuditReport().isEnabled())
		{
			
			Thread.sleep(2000);
		    Locator3.AuditReport().click();
			test.log(LogStatus.PASS, " Audit Report Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Audit Report Download Successfully  "  );
			
		}
		*/
		
		Thread.sleep(2000);
		File dirc = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContentsc = dirc.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator3.AuditReport().click();
		
	 	Thread.sleep(18000);
		File dird = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNewd = dird.listFiles();						//Counting number of files in directory after download
		
	   
        Thread.sleep(9000);
	   if (dirContentsc.length < allFilesNewd.length) {
			test.log(LogStatus.PASS,  "Audit Report Downloaded");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Audit Report does not Downloaded");
		}		
		Thread.sleep(4000);

		
		
		
	}
	
	
	
	
	
	
	
	public static void ViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator3.Report().click();
		Thread.sleep(20000);
		
		 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		 js1.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(9000);
			
		
		Locator3.ProjectDrop().click();
		Thread.sleep(7000);
		
		
		
		
		
		if(Locator3.ProjectDropViewButton().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator3.ProjectDropViewButton().click();
			test.log(LogStatus.PASS, " Overview button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Overview button does not working properly "  );
			
		}
		Thread.sleep(4000);
		
	}
	
	
	
	//Multiple Filter
	
	
	
	
	public static void CompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator3.GreenGraph().click();
		Thread.sleep(2000);
		
	    Locator3.RedGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(6000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(10000);
	   
       
     
       Locator2.Project().click();
       Thread.sleep(1000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(1000);
       Locator3.ClosedProject().click();
       Thread.sleep(1000);
       Locator2.Project().click();
       Thread.sleep(1000);
       
       
       
       
       Locator2.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(1000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(1000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(1000);
       
       
       Locator2.Risk().click();
       Thread.sleep(1000);
       Locator2.RiskFilterCompliedHigh().click();
       Thread.sleep(1000);
       String RiskText =Locator2.RiskFilterCompliedHighDD1().getText();
       Thread.sleep(1000);
       Locator2.RiskFilterCompliedHighDD1().click();
       Thread.sleep(1000);
       Locator2.Risk().click();
       Thread.sleep(1000);
       
       
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(1000);
       String PeriodText =Locator2.Feb23().getText();
       Thread.sleep(1000);
       Locator2.Feb23().click();
       Thread.sleep(1000);
       
       
       
       
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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
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
	    
     
       Locator2.Project().click();
       Thread.sleep(1000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(1000);
       Locator3.ClosedProject().click();
       Thread.sleep(1000);
       Locator2.Project().click();
       Thread.sleep(1000);
       
       
       
       
       
       Locator2.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(1000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(1000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(1000);
       
       
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
       String PeriodText =Locator2.Jan24().getText();
       Thread.sleep(1000);
       Locator2.Jan24().click();
       Thread.sleep(1000);
       
       
       
       
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
	    
      
       
     
       Locator2.Project().click();
       Thread.sleep(1000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(1000);
       Locator3.ClosedProject().click();
       Thread.sleep(1000);
       Locator2.Project().click();
       Thread.sleep(1000);
       
       
       
       
       Locator2.Status().click();
       Thread.sleep(1000);
       String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
       Thread.sleep(1000);
       Locator2.StatusFilterCompliedHighDD().click();
       Thread.sleep(1000);
       Locator2.StatusFilterCompliedHighDD1().click();
       Thread.sleep(1000);
       Locator2.Status().click();
       Thread.sleep(1000);
       
       
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
       
       
       Locator2.PeriodFilterCompliedHigh().click();
       Thread.sleep(1000);
       String PeriodText =Locator5.May23().getText();
       Thread.sleep(1000);
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

		
		
		
		
		
		
		
		
		
	}
	

	
	
	
	public static void NotCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraphInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(2000);
       Locator3.ClosedProject().click();
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
	
	
	
	
	public static void NotCompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraphInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(2000);
       Locator3.ClosedProject().click();
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
       String PeriodText =Locator2.Mar23().getText();
       Thread.sleep(2000);
       Locator2.Mar23().click();
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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.RedGraph2().click();
		Thread.sleep(2000);
		
	    Locator2.RedGraph2Green().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(2000);
       Locator3.ClosedProject().click();
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
       String PeriodText =Locator2.Jul20().getText();
       Thread.sleep(2000);
       Locator2.Jul20().click();
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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
	    Locator2.GreyInRed().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(2000);
       Locator3.ClosedProject().click();
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
       String PeriodText =Locator2.Jul20().getText();
       Thread.sleep(2000);
       Locator2.Jul20().click();
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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(3000);
		
	    Locator2.GreyInYellow().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(2000);
       Locator3.ClosedProject().click();
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

	
	
	
	
	public static void NotApplicableGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
		
		Locator2.GreyGraph().click();
		Thread.sleep(2000);
		
	    Locator2.GreyInGreenGraph().click();					                //Clicking on Dashboard count

	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
       
     
       Locator2.Project().click();
       Thread.sleep(3000);
       String ProjectText =Locator3.ClosedProject().getText();
       Thread.sleep(2000);
       Locator3.ClosedProject().click();
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

	
	
	
	public static void ACSOverdueMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
	    
		Locator3.ACSREDGraph().click();
		Thread.sleep(3000);
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
		
	   
       Locator3.Project().click();
       Thread.sleep(2000);
     //  Locator3.ProjectReport().click();
     //  Thread.sleep(2000);
       String ProjectText =Locator3.ClosedProject1().getText();
       Thread.sleep(2000);
       Locator3.ClosedProject1().click();
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
       String FrequencyText =Locator3.Frequency2().getText();
       Thread.sleep(2000);
       Locator3.Frequency2().click();
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
       String periodtext =Locator3.Sep23().getText();
       Thread.sleep(2000);
      Locator3.Sep23().click();
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
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
	    
		Locator3.ACSBlueGraph().click();
		Thread.sleep(16000);
		
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
		
	   
	    Locator3.Project().click();
	       Thread.sleep(2000);
	     //  Locator3.ProjectReport().click();
	     //  Thread.sleep(2000);
	       String ProjectText =Locator3.ClosedProject1().getText();
	       Thread.sleep(2000);
	       Locator3.ClosedProject1().click();
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
       String FrequencyText =Locator3.Frequency2().getText();
       Thread.sleep(2000);
       Locator3.Frequency2().click();
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
       String periodtext =Locator2.Mar23().getText();
       Thread.sleep(2000);
      Locator2.Mar23().click();
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

		/*
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
		*/
		
		
	}

	
	public static void ACSClosedMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"))); 
		Thread.sleep(2000);
	    
		Locator3.ACSGreenGraph().click();
		Thread.sleep(16000);
		
		
		getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
      
		
	   
	    Locator3.Project().click();
	       Thread.sleep(2000);
	      String ProjectText =Locator3.ClosedProject1().getText();
	       Thread.sleep(2000);
	       Locator3.ClosedProject1().click();
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
       String FrequencyText =Locator3.Frequency2().getText();
       Thread.sleep(2000);
       Locator3.Frequency2().click();
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
       String periodtext =Locator5.May23().getText();
       Thread.sleep(2000);
      Locator5.May23().click();
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

	
	/////
	
		
	
	
	
	public static void PWCSCompliedGraphMultipleFilterHigh1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
    
	    
	    Thread.sleep(6000);
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator3.PWCSSABCConstructionCompliedHigh().click();					                //Clicking on Dashboard count

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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(5000);
		
		
	    Locator3.PWCSSABCConstructionCompliedMedium().click();					                //Clicking on Dashboard count

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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator3.PWCSSABCConstructionCompliedLow().click();					                //Clicking on Dashboard count

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
       String PeriodText =Locator2.PeriodFilterCompliedMediumDD().getText();
       Thread.sleep(2000);
       Locator2.PeriodFilterCompliedMediumDD().click();
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
	
	public static void PWCSSNotCompliedGraphMultipleFilterHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
	
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator3.PWCSSABCconstructionNotCompliedHigh().click();					                //Clicking on Dashboard count

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
	
	
	
	
	public static void PWCSSNotCompliedGraphMultipleFilterMedium( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
	    
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(7000);
		
	    Locator3.PWCSSABCconstructionNotCompliedMedium().click();					                //Clicking on Dashboard count

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

	
	
	public static void PWCSSNotCompliedGraphMultipleFilterLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
	    
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
		
	    Locator3.PWCSSABCconstructionNotCompliedLow().click();					                //Clicking on Dashboard count

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

	
	public static void PWCSNotApplicableHigh( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator3.PWCSSABCconstructionNotApplicableHigh().click();					                //Clicking on Dashboard count
  
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
    String PeriodText =Locator2.Jul20().getText();
    Thread.sleep(2000);
    Locator2.Jul20().click();
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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator3.PWCSSABCconstructionNotApplicableMedium().click();					                //Clicking on Dashboard count
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
	
	
	public static void PWCSSNotApplicableGraphLow( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"))); 
		Thread.sleep(2000);
		
		Locator3.PWCSSABCConstructionComplied().click();
		Thread.sleep(2000);
		
	    Locator3.PWCSSABCconstructionNotApplicableLow().click();					                //Clicking on Dashboard count

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
	

	
	public static void CTWAuditStatusSummeryOverdue1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"))); 
		Thread.sleep(2000);
		
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
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"))); 
		Thread.sleep(2000);
		
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
	
	
	
	public static void CTWAuditStatusSummeryClosed( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1560)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"))); 
		Thread.sleep(2000);
		
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
	
	
	
	
	/////////////////////////////////////////////
	
	
	
	public static void CTWNotCompliedRed1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])"))); 
		Thread.sleep(2000);
		
		Locator3.CTWNotCompliedRed().click();
		Thread.sleep(2000);
		
		Locator3.CTWNotCompliedRedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.CreationConstruction().click();
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
	
	
	
	
	
		
	public static void CTWNotCompliedRedMedium1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(9000);
	    Locator3.CTWNotCompliedRedmedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.CreationConstruction().click();
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
		filter.add("Medium Risk - Project");
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
	
	
	
	
	
	
	
	public static void CTWNotCompliedRedLow1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		/*
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
		
		Locator2.GreenGraph().click();
		
		*/
		Thread.sleep(9000);
		
	    Locator3.CTWNotCompliedRedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.CreationConstruction().click();
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
		filter.add("Low Risk - Project");
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
		
		Thread.sleep(2000);
		
		
		
	}
	

	//Complied
	
	public static void CTWCompliedgreen1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])"))); 
		Thread.sleep(2000);
		
		Locator3.CTWCompliedGreen().click();
		Thread.sleep(2000);
		
	    Locator3.CTWCompliedGreenHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(10000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.CreationConstruction().click();
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
		filter.add("High Risk  - Project");
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
	
	
	
	
	
		
	public static void CTWCompliedMedium1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(9000);
		
	    Locator3.CTWCompliedGreenMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.CreationConstruction().click();
	       Thread.sleep(3000);
	     //  Locator2.Project2().click();
	     //  Thread.sleep(3000);
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
		filter.add("Medium Risk -   Project");
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
			
		Thread.sleep(2000);
		
		
	}
	
	
	
	
	
	
	
	public static void CTWCompliedLow1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(9000);
	    Locator3.CTWCompliedGreenLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);  
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.CreationConstruction().click();
	       Thread.sleep(3000);
	     //  Locator2.Project2().click();
	     //  Thread.sleep(3000);
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
    
    
    
    
     List<String> li=new ArrayList<String>();
     
   //  li.add(locationtext);
     li.add(ProjectText);
     li.add(Statustext);
     li.add(RiskText);
     li.add(PeriodText);
    
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Low Risk -   Project");
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
		
		Thread.sleep(2000);
		
		
		
	}
	

	
	public static void CTWNotApplicableGrey1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])"))); 
		Thread.sleep(2000);
		
		Locator3.CTWNotApplicableGrey().click();
		Thread.sleep(2000);
		
	    Locator3.CTWNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(9000);
	    
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(9000);
	    
	    Locator2.Project().click();
	       Thread.sleep(3000);
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.CreationConstruction().click();
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
		filter.add("High Risk  - Project");
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
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.CreationConstruction().click();
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
		filter.add("Medium Risk - Project");
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
	       String ProjectText =Locator2.CreationConstruction().getText();
	       Thread.sleep(3000);
	       Locator2.CreationConstruction().click();
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
		filter.add("Low Risk - Project");
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
	
	
	
	
	
	public static void PWAuditStatusSummeryABCConstructionOverdue1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,2350)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[29]"))); 
		Thread.sleep(2000);
		
	    Locator3.PWAuditStatusSummeryABCConstructionOverdue().click();					                //Clicking on Dashboard count

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
		
		Method3.PWAuditStatusSummerABCConstructionPendingReview1(test, workbook);	
		Thread.sleep(3000);
		
		Method3.PWAuditStatusSummerABCConstructionClosed1(test, workbook);	
		Thread.sleep(3000);

		
		
		
	}
	
	

	
	
	
	   
	
	
	public static void PWAuditStatusSummerABCConstructionPendingReview1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		 Locator3.PWAuditStatusSummerABCConstructionPendingReview().click();					                //Clicking on Dashboard count

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
	
	
	public static void PWAuditStatusSummerABCConstructionClosed1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//WebWait wait = new WebWait(, 1000);
		Thread.sleep(26000);
		
		 Locator3.PWAuditStatusSummeryCompleted().click();					                //Clicking on Dashboard count

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
	
	
	
//////////////////////////////////////////
	
	
	
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
		
		Locator3.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator3.PWCSSubContractorCompliedHigh().getText());	//Reading Dashboard count.
	    Locator3.PWCSSubContractorCompliedHigh().click();					                //Clicking on Dashboard count

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
		
		
		Method3.PWCSSubcontractorCompliedMedium(test, workbook);
		Thread.sleep(2000);
		
		
		Method3.PWCSSubcontractorLow(test, workbook);
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
		
		int open = Integer.parseInt(Locator3.PWCSSubContractorCompliedMedium().getText());	//Reading Dashboard count.
	    Locator3.PWCSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count

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
		
		int open = Integer.parseInt(Locator3.PWCSSubContractorCompliedLow().getText());	//Reading Dashboard count.
	    Locator3.PWCSSubContractorCompliedLow().click();					                //Clicking on Dashboard count

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
	
	
	
	public static void PWCSSubContractorCompliedHighmultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"))); 
		Thread.sleep(2000);
	    
		Locator3.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator3.PWCSSubContractorCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator2.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator2.CreationConstruction().click();
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
	    String PeriodText =Locator2.Mar23().getText();
	    Thread.sleep(2000);
	    Locator2.Mar23().click();
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
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"))); 
		Thread.sleep(2000);
		    
		Locator3.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator3.PWCSSubContractorCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(3000);
	    String ProjectText =Locator2.CreationConstruction().getText();
	    Thread.sleep(3000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(3000);
	    Locator2.CreationConstruction().click();
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
	    String PeriodText =Locator5.May23().getText();
	    Thread.sleep(2000);
	    Locator5.May23().click();
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
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"))); 
		Thread.sleep(2000);
	    
		Locator3.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator3.PWCSSubContractorCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);
	    String ProjectText =Locator2.CreationConstruction().getText();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);

	    Locator2.Status().click();
	    Thread.sleep(1000);
	    String Statustext =Locator2.StatusFilterCompliedHighDD().getText();
	    Thread.sleep(1000);
	    Locator2.StatusFilterCompliedHighDD().click();
	    Thread.sleep(1000);
	    Locator2.StatusFilterCompliedHighDD1().click();
	    Thread.sleep(1000);
	    Locator2.Status().click();
	    Thread.sleep(1000);

	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    Locator2.RiskFilterNotCompliedLow().click();
	    Thread.sleep(1000);
	    String RiskText =Locator2.RiskFilterNotCompliedLowDD1().getText();
	    Thread.sleep(1000);
	    Locator2.RiskFilterNotCompliedLowDD1().click();
	    Thread.sleep(1000);
	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(1000);
	    String PeriodText =Locator5.May23().getText();
	    Thread.sleep(1000);
	    Locator5.May23().click();
	    Thread.sleep(1000);
	
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(1000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);

	    
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
		Locator3.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator3.PWCSSubContractorNotCompliedHigh().getText());	//Reading Dashboard count.
	    Locator3.PWCSSubContractorNotCompliedHigh().click();					                //Clicking on Dashboard count

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
		Method3.PWCSSubcontractorNotCompliedMedium(test, workbook);
		Thread.sleep(2000);
		
		
		Method3.PWCSSubcontractorNotCompliedLow(test, workbook);
		Thread.sleep(2000);
		
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
		
		int open = Integer.parseInt(Locator3.PWCSSubContractorNotCompliedMedium().getText());	//Reading Dashboard count.
	    Locator3.PWCSSubContractorNotCompliedMedium().click();					                //Clicking on Dashboard count

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
	
	
	public static void PWCSSubContractorNotApplicableHighmultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"))); 
		Thread.sleep(3000);
	    
		Locator3.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator3.PWCSSubContractorNotApplicableHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);
	    String ProjectText =Locator2.CreationConstruction().getText();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorProject().click();
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
	    Thread.sleep(1000);

	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    Locator2.RiskNADD().click();
	    Thread.sleep(1000);
	    String RiskText =Locator2.RiskNADD1().getText();
	    Thread.sleep(1000);
	    Locator2.RiskNADD1().click();
	    Thread.sleep(1000);
	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(1000);
	    String PeriodText =Locator2.Jan24().getText();
	    Thread.sleep(1000);
	    Locator2.Jan24().click();
	    Thread.sleep(1000);

	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);

	    
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
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"))); 
		Thread.sleep(3000);
	    
		Locator3.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator3.PWCSSubContractorNotApplicableMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);
	    String ProjectText =Locator2.CreationConstruction().getText();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorProject().click();
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
	    Thread.sleep(1000);

	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    Locator2.RiskFilterCompliedMedium().click();
	    Thread.sleep(1000);
	    String RiskText =Locator2.RiskFilterCompliedMediumDD1().getText();
	    Thread.sleep(1000);
	    Locator2.RiskFilterCompliedMediumDD1().click();
	    Thread.sleep(1000);
	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(1000);
	    String PeriodText =Locator2.Mar23().getText();
	    Thread.sleep(1000);
	    Locator2.Mar23().click();
	    Thread.sleep(1000);

	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(1000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);

	    
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
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"))); 
		Thread.sleep(3000);
	    
		Locator3.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator3.PWCSSubContractorNotApplicableLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);
	    String ProjectText =Locator2.CreationConstruction().getText();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorProject().click();
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
	    Thread.sleep(1000);

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
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(1000);
	    String PeriodText =Locator2.Mar23().getText();
	    Thread.sleep(1000);
	    Locator2.Mar23().click();
	    Thread.sleep(1000);

	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(2000);

	    
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
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"))); 
		Thread.sleep(3000);
	    
		Locator3.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator3.PWCSSubContractorNotCompliedLow().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);
	    String ProjectText =Locator2.CreationConstruction().getText();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);

	    Locator2.Status().click();
	    Thread.sleep(1000);
	    String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
	    Thread.sleep(1000);
	    Locator2.StatusFilterNotCompliedHighDD().click();
	    Thread.sleep(1000);
	    Locator2.StatusFilterNotCompliedHighDD1().click();
	    Thread.sleep(1000);
	    Locator2.Status().click();
	    Thread.sleep(1000);

	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    Locator2.RiskFilterNotCompliedLow().click();
	    Thread.sleep(1000);
	    String RiskText =Locator2.RiskFilterNotCompliedLowDD1().getText();
	    Thread.sleep(1000);
	    Locator2.RiskFilterNotCompliedLowDD1().click();
	    Thread.sleep(1000);
	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(1000);
	    String PeriodText =Locator2.Feb23().getText();
	    Thread.sleep(1000);
	    Locator2.Feb23().click();
	    Thread.sleep(1000);
	
	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);

	    
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
			Thread.sleep(1000);

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
		
		int open = Integer.parseInt(Locator3.PWCSSubContractorNotCompliedLow().getText());	//Reading Dashboard count.
	    Locator3.PWCSSubContractorNotCompliedLow().click();					                //Clicking on Dashboard count

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
	    
		Locator3.RudraHeritage().click();
		Thread.sleep(6000);
		
		int open = Integer.parseInt(Locator3.PWCSSubContractorNotApplicableHigh().getText());	//Reading Dashboard count.
	    Locator3.PWCSSubContractorNotApplicableHigh().click();					                //Clicking on Dashboard count

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
		
		Method3.PWCSSubcontractorNotApplicableMedium(test,workbook);
		Thread.sleep(4000);
		
		Method3.PWCSSubcontractorNotApplicableLow(test,workbook);
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
		
		int open = Integer.parseInt(Locator3.PWCSSubContractorNotApplicableMedium().getText());	//Reading Dashboard count.
	    Locator3.PWCSSubContractorNotApplicableMedium().click();					                //Clicking on Dashboard count

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
		
		int open = Integer.parseInt(Locator3.PWCSSubContractorNotApplicableLow().getText());	//Reading Dashboard count.
	    Locator3.PWCSSubContractorNotApplicableLow().click();					                //Clicking on Dashboard count

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
	
	
	
	public static void PWCSSubContractorNotCompliedHighmultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"))); 
		Thread.sleep(3000);
		    
		Locator3.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator3.PWCSSubContractorNotCompliedHigh().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);
	    String ProjectText =Locator2.CreationConstruction().getText();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);

	    Locator2.Status().click();
	    Thread.sleep(1000);
	    String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
	    Thread.sleep(1000);
	    Locator2.StatusFilterNotCompliedHighDD().click();
	    Thread.sleep(1000);
	    Locator2.StatusFilterNotCompliedHighDD1().click();
	    Thread.sleep(1000);
	    Locator2.Status().click();
	    Thread.sleep(1000);

	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    Locator2.RiskNADD().click();
	    Thread.sleep(1000);
	    String RiskText =Locator2.RiskNADD1().getText();
	    Thread.sleep(1000);
	    Locator2.RiskNADD1().click();
	    Thread.sleep(1000);
	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(1000);
	    String PeriodText =Locator2.Mar23().getText();
	    Thread.sleep(1000);
	    Locator2.Mar23().click();
	    Thread.sleep(1000);

	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(2000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(2000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);

	    
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
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
			
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(3000);
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"))); 
		Thread.sleep(3000);
	    
		Locator3.RudraHeritage().click();
		Thread.sleep(4000);
							                
	    Locator3.PWCSSubContractorNotCompliedMedium().click();					                //Clicking on Dashboard count

	    Thread.sleep(20000);
	   
	    getDriver().switchTo().frame(Locator3.Frame());
	    Thread.sleep(5000);
	    
	    
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);
	    String ProjectText =Locator2.CreationConstruction().getText();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator2.CreationConstruction().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorProject().click();
	    Thread.sleep(1000);

	    Locator2.Status().click();
	    Thread.sleep(1000);
	    String Statustext =Locator2.StatusFilterNotCompliedHighDD().getText();
	    Thread.sleep(1000);
	    Locator2.StatusFilterNotCompliedHighDD().click();
	    Thread.sleep(1000);
	    Locator2.StatusFilterNotCompliedHighDD1().click();
	    Thread.sleep(1000);
	    Locator2.Status().click();
	    Thread.sleep(1000);

	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    Locator2.RiskFilterCompliedMedium().click();
	    Thread.sleep(1000);
	    String RiskText =Locator2.RiskFilterCompliedMediumDD1().getText();
	    Thread.sleep(1000);
	    Locator2.RiskFilterCompliedMediumDD1().click();
	    Thread.sleep(1000);
	    Locator2.Risk().click();
	    Thread.sleep(1000);
	    
	    Locator2.PeriodFilterCompliedHigh().click();
	    Thread.sleep(1000);
	    String PeriodText =Locator2.Feb23().getText();
	    Thread.sleep(1000);
	    Locator2.Feb23().click();
	    Thread.sleep(1000);

	    Locator3.PWCSSubContractorExpand().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandColumn().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorExpandType().click();
	    Thread.sleep(1000);

	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);
	    String contractorTypeText =Locator3.PWCSSubContractorContractorTypeDD().getText();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorTypeDD11().click();
	    Thread.sleep(1000);
	    Locator3.PWCSSubContractorContractorType().click();
	    Thread.sleep(1000);

	    
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
	
	
	
	
	
	
	
	public static void DownloadAndViewButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(20000);
		Locator3.Report().click();
		Thread.sleep(20000);
		
		/*
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator3.Paging().click();
		Thread.sleep(3000);
		
		Locator3.Paging20().click();
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		js1.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		
		Locator3.Expand().click();
		Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
		js2.executeScript("window.scrollBy(0,30)");	
		Thread.sleep(3000);
*/
		 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		 js1.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(9000);
			
		
		Locator3.ProjectDrop().click();
		Thread.sleep(7000);
		
		if(Locator3.DownloadAndViewButton().isEnabled())
		{
			
			Thread.sleep(4000);
		    Locator3.DownloadAndViewButton().click();
			test.log(LogStatus.PASS, " Download And view button working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Download And View Button not Working properly "  );
			
		}
		Thread.sleep(4000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
