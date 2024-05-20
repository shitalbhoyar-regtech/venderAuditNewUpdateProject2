package companyProjectHead;


import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyContractor.Locator1;
import companyProjectDirector.Locator4;
import login.BasePage;

public class CriticalMethod3 extends BasePage{
	
	
	
	
	
	
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	
	
	
	
	
	
	public static void LocationPopupColumnist( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divLocationCount']"))); 
		Thread.sleep(1000);
		Locator4.Location().click();
		Thread.sleep(2000);
		
if(Locator4.LocationColumn().isDisplayed()&&Locator4.AdressColumn().isDisplayed()&&Locator4.EmailColumn().isDisplayed()&&Locator4.ContactPersonColumn().isDisplayed()) {
			
			test.log(LogStatus.PASS, "The Column of Location, Adress, Email and contact person should be seen in the Location popup");
		}else {
			
			test.log(LogStatus.FAIL, "The Column of Location, Adress, Email and contact person should be not seen in the Location popup");
			
		}
	        
		
	}

	

	
	
	
	
	
	
	public static void ProjectsCountGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
	//	WebWait wait = new WebWait(getDriver(), 1000);
		Thread.sleep(20000);
		
		int open = Integer.parseInt(Locator3.Projects().getText());	//Reading Dashboard count.
        Locator3.Projects().click();					                //Clicking on Dashboard count

        Thread.sleep(20000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
	//	wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
