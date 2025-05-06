package companyAdmin;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyAuditor.Locator2;
import companyContractor.Locator1;
import companyProjectDirector.Locator4;
import login.BasePage;

public class CriticalMethod extends BasePage {

	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	private static int open;
	
	
	
	public static void Addentity2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Locator.Entity().click();
		Thread.sleep(3000);
		
		Locator.AddEntity1().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
						
		
		
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		
		Thread.sleep(3000);
		Locator.SubEntity().click();
		Thread.sleep(3000);
		Locator.SubEntityD().click();
		Thread.sleep(3000);
		Locator.EntityType().click();
		Thread.sleep(3000);
		Locator.EntityTypeD().click();
		Thread.sleep(3000);
		Locator.LegalRelationship().click();
		Thread.sleep(3000);
		Locator.LegalRelationshipD().click();
		Thread.sleep(3000);
		Locator.LegalEntity().click();
		Thread.sleep(3000);
		Locator.LegalEntityD().click();
		Thread.sleep(3000);
		Locator.State().click();
		Thread.sleep(3000);
		Locator.StateD().click();
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

		Locator.Status().click();
		Thread.sleep(3000);
		Locator.StatusD().click();
		Thread.sleep(3000);
		
		
		Locator.City().click();
		Thread.sleep(4000);
		
		Locator.CityDropDown().click();
		Thread.sleep(9000);
		
		Locator.industry().click();
		Thread.sleep(3000);
		Locator.industryD().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
	
		Thread.sleep(6000);
		/*
		WebDriverWait wait = new WebDriverWait(getDriver(), (80));
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(5000);
		ac.accept();
		Thread.sleep(3000);
	    	
		Locator.Close().click();
		Thread.sleep(3000);
		*/
		
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Entity Details Saved Successfully") || t.equalsIgnoreCase("Entity already exist")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	        } finally {
	        	Locator.Close().click();
	    		Thread.sleep(3000);
	        }
	    
		
//		CriticalMethod.ClearEntityButton(,test,workbook);
//		Thread.sleep(3000);
		
	}	
	
	
	
	
	
	public static void AddSubEntity2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Locator.Entity().click();
		Thread.sleep(3000);
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
	
		Thread.sleep(2000);
		
		Locator.AddSubEntity().click();
		Thread.sleep(3000);
		
		Locator.AddSubEntityBranch().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubEntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.SubEntity().click();
		 Thread.sleep(3000);
		Locator.SubEntityD().click();
		 Thread.sleep(3000);
		 
		Locator.SType().click();
		 Thread.sleep(3000);
		Locator.STypeD().click();
		 Thread.sleep(3000);
		 
		Locator.LegalRelationshipS().click();
		 Thread.sleep(3000);
		Locator.LegalRelationshipSD().click();
		 Thread.sleep(3000);
		 
		Locator.LegalEntityS().click();
		 Thread.sleep(3000);
		Locator.LegalEntitySD().click();
		 Thread.sleep(3000);
		 
		Locator.StateS().click();
		 Thread.sleep(3000);
		Locator.StateSD().click();
		 Thread.sleep(3000);
		 
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubAdress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		row0 = sheet.getRow(11);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.SubStatus().click();
		 Thread.sleep(3000);
		Locator.SubStatusD().click();
		 Thread.sleep(6000);
		 
		 Locator.CityS().click();
			Thread.sleep(4000);
			
			
			
			
			WebElement element = Locator.CityDropSub();	      
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
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		/*
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
		
		Thread.sleep(3000);
		*/
        
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Sub-Entity Details Saved Successfully") || t.equalsIgnoreCase("Sub-Entity already exist")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	        } 
	    
				
	//	CriticalMethod.UpdateSubEntity(,test,workbook);
	//	Thread.sleep(3000);
	}
	
	
	
	public static void UpdateSubEntity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Locator.Entity().click();
		Thread.sleep(3000);
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
	
		Thread.sleep(3000);
		Locator.AddSubEntity().click();
		Thread.sleep(3000);
		
		Locator.editsubentity().click();
		Thread.sleep(3000);
		
		Locator.SubEntityName().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(111);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubEntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.SubEntity().click();
		 Thread.sleep(3000);
		Locator.SubEntityD().click();
		 Thread.sleep(3000);
		 
		Locator.SType().click();
		 Thread.sleep(3000);
		Locator.STypeD().click();
		 Thread.sleep(3000);
		 
		Locator.LegalRelationshipS().click();
		 Thread.sleep(3000);
		Locator.LegalRelationshipSD().click();
		 Thread.sleep(3000);
		 
		Locator.LegalEntityS().click();
		 Thread.sleep(3000);
		Locator.LegalEntitySD().click();
		 Thread.sleep(3000);
		 
		 Locator.SubAdress().clear();
		 Thread.sleep(2000);
		 
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubAdress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.SubEmail().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(11);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.SubContactPerson().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.SubStatus().click();
		 Thread.sleep(3000);
		Locator.SubStatusD().click();
		 Thread.sleep(6000);
		 
		
		 /*
		 Locator.CityS().click();
			Thread.sleep(4000);
			
			WebElement element = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse = (JavascriptExecutor)  getDriver();
		      jse.executeScript("arguments[0].click();", element);
		      boolean b = element.isSelected();
		      if (b) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(20000);
		*/
		
		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		 
		 Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
        Thread.sleep(5000);
		
		/*
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
			*/
        
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Sub-Entity Details Updated Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 
	  
		
		
		
		
		
		
	}
	
	
	

	
	public static void ClearEntityButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Locator.Entity().click();
		Thread.sleep(3000);
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(8);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Search().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		
		
		if(Locator.EntityClear().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.EntityClear().click();
			test.log(LogStatus.PASS, " Clear Button Working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button does not working properly "  );
			
		}
		
		
		
	
	}
	
	public static void DeleteE( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Locator.Entity().click();
		Thread.sleep(3000);
		Thread.sleep(3000);
	Locator.DeleteEntity().click();
	Thread.sleep(3000);
	Locator.Confirm().click();
	Thread.sleep(5000);
	/*
	Alert ac=getDriver().switchTo().alert();
	
	String t1=getDriver().switchTo().alert().getText();
	
	test.log(LogStatus.PASS,  t1 );
	
	Thread.sleep(4000);
	ac.accept();
	*/
	 try {
         // Wait for the alert to be present
         WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 120 seconds timeout
         Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

         // Once alert is present, handle it
         System.out.println("Alert is present: " + alert.getText());
         Alert ac1=getDriver().switchTo().alert();
 		
 		String t=getDriver().switchTo().alert().getText();
 		
		 if(t.equalsIgnoreCase("Entity deleted successfully.")) 
		 {
				test.log(LogStatus.PASS, t);
			}
			else
			{
				test.log(LogStatus.FAIL, t);
				
				
			} 
 		
 		Thread.sleep(5000);
         ac1.accept(); // Accept the alert (click OK)
     } catch (Exception e) {
         System.out.println("Alert not found within the specified time.");
         test.log(LogStatus.FAIL, "Alert not found within the specified time.");
     } 

	
	
	}
	
	
	public static void UpdateEntity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		
		Locator.Entity().click();
		Thread.sleep(3000);
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		Thread.sleep(3000);
				
		Locator.EditEntity().click();
		Thread.sleep(3000);
		
		Locator.EntityName().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SubEntity().click();
		Thread.sleep(4000);
		
		Locator.SubEntityD().click();
		Thread.sleep(4000);
		
		Locator.EntityType().click();
		Thread.sleep(4000);
		
		Locator.EntityTypeD().click();
		Thread.sleep(4000);
		
		Locator.LegalRelationship().click();
		Thread.sleep(4000);
		
		Locator.LegalRelationshipD().click();
		Thread.sleep(6000);
		
	//	Locator.LegalEntity().click();
	//	Thread.sleep(6000);
        
	//	Locator.LegalEntityD().click();
	//	Thread.sleep(4000);
        
        
		Locator.State().click();
		Thread.sleep(4000);
		
		Locator.StateD().click();
		Thread.sleep(4000);
		
		Locator.Adress().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.ContactPerson().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

		Locator.Email().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

		Locator.Status().click();
		Thread.sleep(3000);
		Locator.StatusD().click();
		Thread.sleep(3000);
		
		
		Locator.City().click();
		Thread.sleep(6000);
		
		Locator.CityDropDown().click();
		Thread.sleep(9000);
		
		Locator.industry().click();
		Thread.sleep(3000);
		Locator.industryD().click();
		Thread.sleep(3000);
	//	Locator.industry().click();
	//	Thread.sleep(3000);
	//	Locator.industryD().click();
	//	Thread.sleep(5000);
		Locator.SubmitButton().click();
	
		Thread.sleep(9000);
		
		/*
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Entity Details Updated Successfully") || t.equalsIgnoreCase("Entity already exist")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	         //   System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 
	    
		
		
	}
	
	public static void UploadEntity1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		Locator.Entity().click();
		Thread.sleep(3000);
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(14);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(9000);
	/*
	 Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
	
		Thread.sleep(4000);
		*/
	 try {
         // Wait for the alert to be present
         WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
         Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

         // Once alert is present, handle it
         System.out.println("Alert is present: " + alert.getText());
         Alert ac1=getDriver().switchTo().alert();
 		
 		String t=getDriver().switchTo().alert().getText();
 		
		 if(t.equalsIgnoreCase("File uploaded successfully.")) 
		 {
				test.log(LogStatus.PASS, t);
			}
			else
			{
				test.log(LogStatus.FAIL, t);
				
				
			} 
 		
 		Thread.sleep(5000);
         ac1.accept(); // Accept the alert (click OK)
     } catch (Exception e) {
         
     } 

		
		
	}

	
	
	
	public static void DeleteSubEntity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Locator.Entity().click();
		Thread.sleep(3000);
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		Thread.sleep(2000);
	    Locator.ViewBranches().click();
	    Thread.sleep(5000);

	    Locator.DeleteSubEntity().click();
	    Thread.sleep(3000);
	
	    Locator.ConfirmSubEntityDelete().click();
	    Thread.sleep(3000);
	
	    /*
	    Alert ac=getDriver().switchTo().alert();
	
	    String t1=getDriver().switchTo().alert().getText();
	
	    test.log(LogStatus.PASS,  t1 );
	
	    Thread.sleep(3000);
	    ac.accept();
	    Thread.sleep(3000);
	*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 120 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Sub-Entity deleted successfully.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 
	  
	
	}
	
	 
	public static void AddUser( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
	//	//Locator.MasterButton().click();
	//	Thread.sleep(3000);
		
		Thread.sleep(3000);
		Locator.UserButton().click();
		
		Thread.sleep(3000);
		Locator.AddUser().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserFirstName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserLastName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(18);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		row0 = sheet.getRow(19);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserContact().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.AddUserRole().click();
		Thread.sleep(4000);
		
		row0 = sheet.getRow(20);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserRoleText().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		Thread.sleep(4000);
		Locator.AddUserSelectRole().click();
		Thread.sleep(4000);
		Locator.UserSubmitButton().click();
		Thread.sleep(9000);
		/*
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(2000);
			ac1.accept();
			Thread.sleep(2000);
			*/
		
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") || t.equalsIgnoreCase("Contact No Exist.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } finally {
	        	Locator.CloseUserPage().click();
	    		Thread.sleep(2000);
	        }

		
		
	}
	
	
	public static void UpdateUser( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
//	//Locator.MasterButton().click();
//	Thread.sleep(3000);
	Locator.UserButton().click();
	Thread.sleep(3000);
	
	
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
    JavascriptExecutor js1 = (JavascriptExecutor) getDriver() ;
    
    js1.executeScript("window.scrollBy(0,1000)");
    Thread.sleep(5000);
  
 /*
    Locator.Paging().click();
	Thread.sleep(3000);
	
	Locator.PagingDD().click();
	Thread.sleep(3000);
	
    JavascriptExecutor js = (JavascriptExecutor)getDriver() ;
    
    js.executeScript("window.scrollBy(0,1000)");
    Thread.sleep(5000);
  */
    
	Locator.EditUser().click();
	Thread.sleep(3000);
	
	Locator.AddUserFirstName().clear();
	Thread.sleep(3000);
	
	
	row0 = sheet.getRow(89);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddUserFirstName().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.AddUserLastName().clear();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(90);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddUserLastName().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.AddUserEmail().clear();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(91);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.AddUserContact().clear();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(92);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddUserContact().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.AddUserRole().click();
	Thread.sleep(2000);
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddUserRoleText().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.AddUserSelectRole().click();
	Thread.sleep(3000);
	Locator.UserSubmitButton().click();
	Thread.sleep(9000);
	/*
	 Alert ac1=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t2 );
		
		Thread.sleep(2000);
		ac1.accept();
		
		Thread.sleep(2000);
	*/
	
	 try {
         // Wait for the alert to be present
         WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
         Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

         // Once alert is present, handle it
         System.out.println("Alert is present: " + alert.getText());
         Alert ac1=getDriver().switchTo().alert();
 		
 		String t=getDriver().switchTo().alert().getText();
 		
		 if(t.equalsIgnoreCase("Record Saved Successfully") || t.equalsIgnoreCase("Contact No Exist.")) 
		 {
				test.log(LogStatus.PASS, t);
			}
			else
			{
				test.log(LogStatus.FAIL, t);
				
				
			} 
 		
 		Thread.sleep(5000);
         ac1.accept(); // Accept the alert (click OK)
     } catch (Exception e) {
         System.out.println("Alert not found within the specified time.");
         test.log(LogStatus.FAIL, "Alert not found within the specified time.");
     } finally {
     	Locator.CloseUserPage().click();
 		Thread.sleep(2000);
     }


	
	}
	
	public static void UserReset4( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
	//	Thread.sleep(3000);
		
		Locator.UserButton().click();
		Thread.sleep(3000);
		/*
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	    
	    js1.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
	  
	 
	    Locator.Paging().click();
		Thread.sleep(3000);
		
		Locator.PagingDD().click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
	    */
		
		Locator.UserResetPass5().click();
		Thread.sleep(6000);
		
        Alert ac1=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t2 );
		
		Thread.sleep(3000);
		ac1.accept();
		
		Thread.sleep(4000);
		
		/*
        Alert ac2=getDriver()
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t3 );
		
		Thread.sleep(4000);
		ac2.accept();
		
		Thread.sleep(2000);
		
		*/
		
	}
	
	
	
	
	
	 public static void UserDelete1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	 {
		 //Locator.MasterButton().click();
		 Thread.sleep(3000);
		 Locator.UserButton().click();
		 Thread.sleep(3000);
		 /*
		 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		    
		    js1.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(5000);
		  
		 
		 Locator.Paging().click();
			Thread.sleep(3000);
			
			Locator.PagingDD().click();
			Thread.sleep(3000);
			
		
		 JavascriptExecutor js = (JavascriptExecutor)getDriver() ;
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(5000);
		    */
			
			Locator.DeleteUser().click();
			
			Thread.sleep(3000);
			/*
			 Alert ac1=getDriver().switchTo().alert();
				
				String t2=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t2 );
				
				Thread.sleep(2000);
				ac1.accept();
				
				Thread.sleep(3000);
				*/
			
			 try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac=getDriver().switchTo().alert();
		    		
		    		String t=getDriver().switchTo().alert().getText();
		    		
		   		 if(t.equalsIgnoreCase("Are you sure want to inactive this user?")) 
				 {
						test.log(LogStatus.PASS, t);
					}
					else
					{
						test.log(LogStatus.FAIL, t);
						
						
					} 
		    		
		    		Thread.sleep(5000);
		            ac.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
		        } 

				/*
		 
             Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t3 );
				
				Thread.sleep(2000);
				ac2.accept();
				
				Thread.sleep(3000);
				*/
				
				 try {
			            // Wait for the alert to be present
			            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
			            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

			            // Once alert is present, handle it
			            System.out.println("Alert is present: " + alert.getText());
			            Alert ac=getDriver().switchTo().alert();
			    		
			    		String t=getDriver().switchTo().alert().getText();
			    		
			   		 if(t.equalsIgnoreCase("User Inactive Successfully")) 
					 {
							test.log(LogStatus.PASS, t);
						}
						else
						{
							test.log(LogStatus.FAIL, t);
							
							
						} 
			    		
			    		Thread.sleep(5000);
			            ac.accept(); // Accept the alert (click OK)
			        } catch (Exception e) {
			            System.out.println("Alert not found within the specified time.");
			            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
			        } 

		 
		 
	 }
	
	
	public static void UploadUser( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
	{
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(3000);
		Locator.UploadUserButton().click();
		Thread.sleep(3000);
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(22);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(7000);
		/*
		 Alert ac=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,t1 );
			
			Thread.sleep(4000);
			ac.accept();
		
			Thread.sleep(4000);
	 	*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("File Uploaded Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            
	        } 

			
			
		
	}
	
	
	
	
	
	
	public static void UploadUser1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
	{
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(3000);
		Locator.UploadUserButton().click();
		Thread.sleep(3000);
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(22);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(7000);
		
		
		
                 
	}
	
	
	public static void UploadUser11( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException{
	    
		//Locator.MasterButton().click();
				Thread.sleep(3000);
				Locator.UserButton().click();
				Thread.sleep(3000);
				Locator.UploadUserButton().click();
				Thread.sleep(3000);
				
				
				sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
				int row = 0;
				Thread.sleep(500);
				Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
				Cell c1 = null;
				
				row0 = sheet.getRow(22);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(3000);        
	        try {            
	        	Locator.SubmitUploadUser().click();
				Thread.sleep(7000);	            
	            // Define a wait time (e.g., 10 seconds) for the alert to appear
				WebDriverWait wait1 = new WebDriverWait(getDriver(), 120);	            
	            // Check if the alert appears within the specified time
	            try {
	                Alert alert = wait1.until(ExpectedConditions.alertIsPresent());
	                System.out.println("Alert is present. Message: " + alert.getText());
	                
	                String t=getDriver().switchTo().alert().getText();
	                Thread.sleep(1000);	
		    		
	   	   		 if(t.equalsIgnoreCase("File Uploaded Successfully")) 
	   			 {
	   					test.log(LogStatus.PASS, t);
	   				}
	   				else
	   				{
	   					test.log(LogStatus.FAIL, t);
	   					
	   					
	   				} 
	   	   		 
	   	   	Thread.sleep(2000);	
	                
	                alert.accept();  // Accept the alert if needed
	            }
	        catch (Exception e) {
	        } 

	        }
	        catch (Exception e) {
	        } 
	        
	                // Check if the download link is present for the error file
	                /*
	                WebElement downloadLink = null;
	                try {
	                    downloadLink = getDriver().findElement(By.id("errorLink")); // Use the appropriate locator for the download link
	                } catch (Exception linkNotFoundException) {
	                    System.out.println("Download link for error file is not present.");
	                }
	                // If the download link is present, download the file
	                if (downloadLink != null && downloadLink.isDisplayed()) {
	                    System.out.println("Download link is present. Starting the download...");
	                    downloadLink.click();
	                    Thread.sleep(19000);	 
	                    // Wait for download to complete, or manage file download as needed
	                    
	                    String downloadFilePath = "C:\\Users\\shitalb\\Downloads";  // Set your download folder
	                    File downloadedFile = new File(downloadFilePath + "ErrorFile.txt"); // Adjust filename and type
	                    if (downloadedFile.exists()) {
	                        System.out.println("File downloaded successfully: " + downloadedFile.getAbsolutePath());
	                        
	                    
	           		 String filePath = "C:\\Users\\shitalb\\Downloads\\ErrorFile.txt";

	               		 List<String> lines =new ArrayList<>();
	               		 
	               		 try{
	               			 
	               		    BufferedReader reader = new BufferedReader(new FileReader(filePath));
	               		    String line;	               		  
	               		  while((line = reader.readLine()) != null) {
	               			 lines.add(line);	               			  
	               		  }	               	  
	               		 reader.close();	               		 
	               		 if(lines.size() >= 2) {               			 
	               			 for(int i = 1; i < lines.size() - 1; i++) {	
	               				 
	               				 test.log(LogStatus.FAIL, "Error Log Details  :- "+lines.get(i));	               				 
	               			 }               			 
	               		 }	               		 
	               		 File file = new File(filePath);	               		  
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
	               	  catch(IOException e1) {
	               		  
	               		  e1.printStackTrace();
	               	  }	               	  
	                    } else {
	                        System.out.println("File download failed or the file is not found.");
	                    }	                    
	                }
	            
	        } finally {
                System.out.println("...Done All Process");

	            // Close the browser
	        //	getDriver().quit();
	        }
	        */
	        }
	
	
	
	public static void AddContractors( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(3000);
		Locator.ViewContractor().click();
		Thread.sleep(3000);
		Locator.AddContractor().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorName().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCName().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		
		row0 = sheet.getRow(25);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		row0 = sheet.getRow(26);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		Thread.sleep(4000);
		Locator.AddContractorType().click();
		Thread.sleep(4000);
		/*
		row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		*/
		
		Locator.AddContractorTypeuser().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SubmitContractor().click();
		
		
		Thread.sleep(5000);
		/*
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(3000);
	 
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") || t.equalsIgnoreCase("Contact No Exist.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 
		
		
		
			
		
	}
	
	public static void AddDuplicateContractor( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(3000);
		Locator.ViewContractor().click();
		Thread.sleep(3000);
		Locator.AddContractor().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorName().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCName().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		
		row0 = sheet.getRow(25);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		row0 = sheet.getRow(26);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		Thread.sleep(4000);
		Locator.AddContractorType().click();
		Thread.sleep(4000);
		/*
		row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		*/
		
		Locator.AddContractorTypeuser().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SubmitContractor().click();
		
		
		Thread.sleep(5000);
		/*
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(3000);
	 
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") || t.equalsIgnoreCase("Contact No Exist.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 
		
		
		
			
		
	}
	
	
	public static void UpdateContractor( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(1000);
		
		Locator.UserButton().click();
		Thread.sleep(1000);
		
		Locator.ViewContractor().click();
		Thread.sleep(9000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		Locator.EditContractor().click();
		Thread.sleep(3000);
		
		Locator.AddContractorName().clear();
		Thread.sleep(1000);
		
		
		
		row0 = sheet.getRow(93);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		Locator.AddContractorSPOCName().clear();
		Thread.sleep(1000);
		
		row0 = sheet.getRow(94);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		Locator.AddContractorSPOCMail().clear();
		Thread.sleep(1000);
		
		row0 = sheet.getRow(95);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		Locator.AddContractorSPOCContact().clear();
		Thread.sleep(1000);
		
		row0 = sheet.getRow(96);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.ContractorTypeUser().click();
		Thread.sleep(4000);
		
		Locator.ContractorTypeUserSelect().click();
		Thread.sleep(3000);
		
		Locator.NatureOfWorkContractor().clear();
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		Locator.SubmitContractor().click();
		
		
		Thread.sleep(5000);
		/*
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(3000);
	 */
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") || t.equalsIgnoreCase("Contact No Exist.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 
		
		
		
			
		
		
	}
	
	
	
	public static void ResetPassContractor1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(1000);
		
		Locator.UserButton().click();
		Thread.sleep(1000);
		
		Locator.ViewContractor().click();
		Thread.sleep(1000);
		
		
		
		Locator.ResetPassContractor().click();
		
		Thread.sleep(5000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(5000);
		
         Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
			
			Thread.sleep(2000);
				
		
	}
	
	public static void DeleteContractor( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(3000);
		Locator.ViewContractor().click();
		Thread.sleep(3000);
		
		
		Locator.DeleteContractor().click();
		Thread.sleep(3000);
		
		Thread.sleep(5000);
		/*
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Are you sure want to inactive this user?")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

			/*
			Thread.sleep(5000);
			 Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t3 );
				
				Thread.sleep(4000);
				ac2.accept();
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Deleted Successfully.") || t.equalsIgnoreCase("Contractor already in used.") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

	}
	
	
	
	public static void DeleteContractor1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(3000);
		Locator.ViewContractor().click();
		Thread.sleep(3000);
		
		
		Locator.DeleteContractor1().click();
		Thread.sleep(3000);
		/*
		Thread.sleep(5000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
		*/
		
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac=getDriver().switchTo().alert();
    		
    		String t=getDriver().switchTo().alert().getText();
    		
   		 if(t.equalsIgnoreCase("Are you sure want to inactive this user?")) 
		 {
				test.log(LogStatus.PASS, t);
			}
			else
			{
				test.log(LogStatus.FAIL, t);
				
				
			} 
    		
    		Thread.sleep(5000);
            ac.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            System.out.println("Alert not found within the specified time.");
            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
        } 
			
		/*
			Thread.sleep(5000);
			 Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t3 );
				
				Thread.sleep(4000);
				ac2.accept();
		*/
		
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac=getDriver().switchTo().alert();
    		
    		String t=getDriver().switchTo().alert().getText();
    		
   		 if(t.equalsIgnoreCase("Contractor already in used.")) 
		 {
				test.log(LogStatus.PASS, t);
			}
			else
			{
				test.log(LogStatus.FAIL, t);
				
				
			} 
    		
    		Thread.sleep(5000);
            ac.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            System.out.println("Alert not found within the specified time.");
            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
        } 
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void AddManagementAssignment( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(3000);
		Locator.ManagementAssignmentButton().click();
		Thread.sleep(3000);
		Locator.AddManagementAssignment().click();
		Thread.sleep(4000);
		Locator.LocationMAssign().click();
		Thread.sleep(26000);
	//	Locator.LocationMAssignDrop().click();
	//	Thread.sleep(5000);
		Locator.LocationMAssignDropDown().click();
		Thread.sleep(5000);
		Locator.Space().click();
		Locator.MAssignProject().click();
		Thread.sleep(5000);
		Locator.MAssignProjectCheckBox().click();
		Thread.sleep(5000);
		Locator.MAssignProjectSpace().click();
		Thread.sleep(3000);
		Locator.MAssignUser().click();
		Thread.sleep(3000);
		Locator.MAssignUserCheckBox().click();
		Thread.sleep(3000);
		Locator.MAssignUserUserSpace().click();
		Thread.sleep(3000);
		Locator.SubmitAssignment().click();
		
		Thread.sleep(7000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
		
	}
	
	
	public static void DeleteMA( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(4000);
		Locator.ManagementAssignmentButton().click();
		Thread.sleep(4000);
		
		/*	
		Locator.SearchSelectProjectMA().clear();
		Thread.sleep(6000);
		Locator.SearchPMA().click();
		Thread.sleep(4000);
		Locator.SearchPMASelect().click();
		Thread.sleep(4000);
		Locator.SearchSelectProjectMADropDown().click();
		Thread.sleep(4000);
		Locator.SearchUserMA().click();
		Thread.sleep(4000);
		Locator.SearchUserMADropDown().click();
		
		*/
		
		Locator.DeleteMA().click();
		
		
		
		Thread.sleep(6000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Deleted Successfully.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
		
		
		
	}
	
	
	public static void AddProject( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.ProjectButton().click();
		Thread.sleep(2000);
		Locator.AddProject().click();
		Thread.sleep(2000);
		Locator.LocationType().click();
		Thread.sleep(2000);
		Locator.LocationTypeD().click();
		Thread.sleep(5000);	
		
		
		Locator.StatusP().click();
		Thread.sleep(2000);
		Locator.StatusPD().click();
		Thread.sleep(2000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(31);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ProjectNameP().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.Catogarization().click();
		Thread.sleep(2000);
		Locator.CatogarizationD().click();
		Thread.sleep(2000);
		Locator.Element().click();
		Thread.sleep(2000);
		Locator.ElementD().click();
		Thread.sleep(2000);
		Locator.LocationP().click();
		Thread.sleep(9000);
		Locator.LocationPDrop().click();
		Thread.sleep(4000);
		Locator.LocationP().click();
		Thread.sleep(9000);
		Locator.LocationPDropDown().click();
		Thread.sleep(6000);
		Locator.Head().click();
		Thread.sleep(15000);
		Locator.HeadD().click();
		Thread.sleep(6000);
		Locator.Director().click();
		Thread.sleep(3000);
		Locator.DirectorD().click();
		Thread.sleep(5000);
		Locator.SubmitProject().click();
		
		
		Thread.sleep(5000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
	}
	
	
	public static void AddLicence( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//Locator.MasterButton().click();
		
		Locator.ProjectButton().click();
		Thread.sleep(4000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		
		Locator.EditProject().click();
		
		Thread.sleep(4000);
		Locator.LicenceDetails().click();
		Thread.sleep(3000);
		Locator.AddLicence().click();
		Thread.sleep(3000);
		Locator.LicenceTypeL().click();
		Thread.sleep(3000);
		Locator.LicenceTypeLD().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(32);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ProjectSearchBox().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(33);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.RegistrationNo().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(34);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(35);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ValidityDateL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(36);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.UploadDocumentL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.Calender11().click();
		Thread.sleep(3000);
		
		Locator.Calender1DD().click();
		Thread.sleep(3000);
		
		Locator.Calender1().click();
		Thread.sleep(3000);
		Locator1.NextMonthTri().click();
		Thread.sleep(3000);		
		Locator.Calender1DD().click();
		Thread.sleep(3000);
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } finally {
	        	Locator.ClosetLicence().click();    		
	    		Thread.sleep(3000);
	        	
	        }

		
		
			
		
	}
	
	public static void UpdateProject( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.ProjectButton().click();
		Thread.sleep(2000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		
		Locator.EditProject1().click();
		Thread.sleep(3000);
		
		Locator.LocationType().click();
		Thread.sleep(2000);
		Locator.LocationTypeD().click();
		Thread.sleep(5000);	
		
		Locator.StatusP().click();
		Thread.sleep(2000);
		Locator.StatusPD().click();
		Thread.sleep(2000);
		
		Locator.ProjectNameP().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(103);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ProjectNameP().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.Catogarization().click();
		Thread.sleep(4000);
		Locator.CatogarizationD().click();
		Thread.sleep(2000);
		Locator.Element().click();
		Thread.sleep(2000);
		Locator.ElementD().click();
		Thread.sleep(2000);
		Locator.LocationP().click();
		Thread.sleep(2000);
		Locator.LocationPDrop().click();
		Thread.sleep(4000);
		Locator.LocationP().click();
		Thread.sleep(4000);
		Locator.LocationPDropDown().click();
		Thread.sleep(6000);
		Locator.SpaceProject1().click();
		Thread.sleep(6000);
		Locator.UpdateHead().click();
		Thread.sleep(5000);
		Locator.HeadD().click();
		Thread.sleep(6000);
		Locator.SpaceProject1().click();
		Thread.sleep(2000);
		Locator.Director().click();
		Thread.sleep(5000);
		Locator.DirectorD().click();
		Thread.sleep(5000);
		Locator.SpaceProject1().click();
		Thread.sleep(2000);
		Locator.SubmitProject().click();
		Thread.sleep(9000);
		
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
		
			 try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac1=getDriver().switchTo().alert();
		    		
		    		String t=getDriver().switchTo().alert().getText();
		    		
		   		 if(t.equalsIgnoreCase("Record Saved Successfully") || t.equalsIgnoreCase("Project Name already exist.")) 
				 {
						test.log(LogStatus.PASS, t);
					}
					else
					{
						test.log(LogStatus.FAIL, t);
						
						
					} 
		    		
		    		Thread.sleep(5000);
		            ac1.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
		        } 

		
		
		
		
	}
	
	
	public static void DeleteProject( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.ProjectButton().click();
		Thread.sleep(2000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		
		Locator.DeleteProject().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(37);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.CloserDate().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SaveCloser().click();
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
		
	}
	
	
	public static void UploadProject( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(4000);
		Locator.ProjectButton().click();
		Thread.sleep(4000);
		Locator.ProjectUpload().click();
		Thread.sleep(4000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(38);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputProject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.ProjectUploadButton().click();
		
		Thread.sleep(6000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("File Uploaded Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            
	        } 

			  
		
	}
	
	
	
	
	
	
	public static void ProjectClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
        //Locator.MasterButton().click();
        Thread.sleep(3000);
		Locator.ProjectButton().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(41);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ProjectSearchButton().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		
		if(Locator.ProjectClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.ProjectClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working properly  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button does not working properly "  );
			
		}
		
		Locator.ProjectClearButton().click();
		Thread.sleep(2000);
		
	
	
	}
	
	public static void MapNewProject( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
        Thread.sleep(3000);
		
        Locator.Contractortab().click();
        Thread.sleep(3000);
        
        Locator.MapNewProjectButton().click();
        Thread.sleep(3000);
        
        Locator.Mapcontractor().click();
        Thread.sleep(3000);
        
        sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
        
        Locator.MapcontractorDropDown().click();
        Thread.sleep(3000);
        
        Locator.MapSelectProject().click();
        Thread.sleep(3000);
        
        Locator.MapSelectProjectDropDown().click();
        Thread.sleep(5000);
        
        Locator.MapIfSubContractor().click();
        Thread.sleep(3000);
        
        Locator.MapIfSubContractorDropDown().click();
        Thread.sleep(3000);
        
        Locator.Mapcheckbox().click();
        Thread.sleep(3000);
        
        Locator.SelectType().click();
        Thread.sleep(3000);
        
        Locator.SelectTypeDD().click();
        Thread.sleep(3000);
        Locator.MapFrequencyofComplienceSubmission().click();
        Thread.sleep(3000);
        
        Locator.MapFrequencyofComplienceSubmissionDD().click();
        Thread.sleep(3000);
        
        
		
		row0 = sheet.getRow(43);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.MapContractStartDate().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(44);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.MapContractEndDate().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(45);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.MapDocumentSubmissionDueDays().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.MapButtonSave().click();
		
		Thread.sleep(5000);
		/*
		 Alert ac=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t1 );
			
			Thread.sleep(4000);
			ac.accept();
		
			Thread.sleep(4000);
	 */
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 


		
	
		
	}
	
	
	public static void CTContractorAdd( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(6000);
		Locator.CTAddContractor().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
        
        
        row0 = sheet.getRow(46);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContractorNameCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(47);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(48);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(49);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Thread.sleep(4000);
		Locator.AddContractorType().click();
		Thread.sleep(7000);
	/*	
		row0 = sheet.getRow(107);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContractorTypeSearchCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		*/
		
		Locator.ContractorTypeCT().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(50);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
        Locator.SaveButtonCT().click();
		
		
		Thread.sleep(7000);
		/*
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
	 */
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
		
		
		
		
	}
	
	public static void UpdateContractorCT( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(7000);
		
		Locator.EditContractorCT().click();
		Thread.sleep(4000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
        
		Locator.ContractorNameCT().clear();
		Thread.sleep(3000);
		
        row0 = sheet.getRow(98);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContractorNameCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.AddContractorSPOCName().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(102);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.AddContractorSPOCMail().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(109);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.AddContractorSPOCContact().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(100);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(7000);
		
		
		Locator.UpdateContractorTypeCT().click();
     	Thread.sleep(7000);
		
		row0 = sheet.getRow(52);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContractorTypeSearchCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		
		Locator.ContractorTypeCT().click();
		Thread.sleep(3000);
		
		Locator.NatureOfWorkContractor().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(101);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
        Locator.SaveButtonCT().click();
		
		
		Thread.sleep(7000);
		/*
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
	 */
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
		
		
		
		
		
	}
	
	public static void DeleteContractorCT( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
		Locator.DeleteContractorCT().click();
		Thread.sleep(3000);
		
		Locator.ContractorCalendor().click();
        Thread.sleep(3000);
        
        Locator.ContractorCalendorDate().click();
        Thread.sleep(3000);
		
		Locator.btnSaveClouserDateCT().click();
		
		Thread.sleep(5000);
		/*
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
	 */
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		    	
		
	}
	
	
	public static void ExportButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		
		if(Locator.ExportButtonCT().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ExportButtonCT().click();
			test.log(LogStatus.PASS, "File Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Download Successfully"  );
			
		}
		
		Locator.ExportButtonCT().click();
		Thread.sleep(2000);
		
		
	}
	
	public static void ContractorExport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
	      JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(2000);
	 		
	 
		
		Thread.sleep(1000);
		Locator.readTotalItems1().click();
		String item1 = Locator.readTotalItems1().getText();
		String[] bits1 = item1.split(" ");								//Splitting the String
		String compliancesCount1 = bits1[bits1.length - 2];				//Getting the second last word (total number of users)
		int count2 = Integer.parseInt(compliancesCount1);
		
	    
		js.executeScript("window.scrollBy(0,-1000)");
		

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents = dir.listFiles();							//Counting number of files in directory before download 
		
		Thread.sleep(1000);
//		CFOcountPOM.clickNextPage1(driver).sendKeys(Keys.PAGE_UP);
//		Thread.sleep(250);
		Locator.ExportButtonCT().click();					//Clicking on 'Excel Report' image.
		test.log(LogStatus.PASS, "File downloaded successfully.");
		
		Thread.sleep(5500);
		File dir1 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew = dir1.listFiles();							//Counting number of files in directory after download
		
		if(dirContents.length < allFilesNew.length)
		{
			
			
			File lastModifiedFile = allFilesNew[0];			//Storing any 0th index file in 'lastModifiedFile' file name.
		    for (int i = 1; i < allFilesNew.length; i++) 	//For loop till the number of files in directory.
		    {
		       if (lastModifiedFile.lastModified() < allFilesNew[i].lastModified()) 	//If allFilesNew[i] file is having large/latest time time of update then latest modified file be allFilesNew[i] file.
		       {
		           lastModifiedFile = allFilesNew[i];
		       }
		    }
			
			Thread.sleep(1000);
			fis = new FileInputStream(lastModifiedFile);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);					//Retrieving first sheet of Workbook
			/*
			int no = sheet.getFirstRowNum();
			Row row = sheet.getRow(no);
			Cell c1 = row.getCell(0);
			int records =(int) c1.getNumericCellValue();
			*/
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
			fis.close();
			
			if(count2 == actualRow)
			{
				//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
				test.log(LogStatus.PASS, "Total records from Grid = "+count2+" | Total records from Report = "+actualRow);
			}
			else
			{
				//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
				test.log(LogStatus.FAIL, "Total records from Grid = "+count2+" | Total records from Excel Sheet = "+actualRow);
			}
		}
		else
		{
			test.log(LogStatus.FAIL, "File doesn't downloaded successfully.");
		} 
	 Thread.sleep(2000);
     
	    
	}
	
	
	
	public static void ClearButtonCTCC( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(55);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SearchCTCCC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		
		
		
		if(Locator.ClearCT().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearCT().click();
			test.log(LogStatus.PASS, "Clear Button Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Clickable"  );
			
		}
		
		Locator.ClearCT().click();
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	public static void UploadContractorCT( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		Locator.UploadContractorCT().click();
		Thread.sleep(3000);
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(56);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadSubmitCT().click();
		
		Thread.sleep(9000);
		/*
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("File uploaded successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Download error log");
	            test.log(LogStatus.FAIL, "Download error log");
	        } 

		
			
	}
	
	
	public static void UploadContractorProjectMappingSheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		Locator.UploadContractorProjectMappingCT().click();
		Thread.sleep(6000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
			row0 = sheet.getRow(58);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.UploadContractorProjectMappingFileCT().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.UploadContractorProjectMappingUploadBCT().click();
			
			Thread.sleep(7000);
			/*
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t4 );
				
				Thread.sleep(5000);
				ac3.accept();
		*/
			 try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac1=getDriver().switchTo().alert();
		    		
		    		String t=getDriver().switchTo().alert().getText();
		    		
		   		 if(t.equalsIgnoreCase("File uploaded successfully")) 
				 {
						test.log(LogStatus.PASS, t);
					}
					else
					{
						test.log(LogStatus.FAIL, t);
						
						
					} 
		    		
		    		Thread.sleep(5000);
		            ac1.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
		        } 

		
	}
	
	
	
	
	
	
	
	public static void AddLicenceCT( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.Contractortab().click();
		Thread.sleep(6000);
		
		Locator.MappingEditProjectCT().click();
		Thread.sleep(3000);
		
		Locator.LicenceDetailsCT().click();
		Thread.sleep(3000);
		
		Locator.AddLicenceDetailsCT().click();
		Thread.sleep(3000);
		
		Locator.AddLicenceTypeCT1().click();
		Thread.sleep(3000);
		
		Locator.LicenceTypeLD().click();
		Thread.sleep(3000);
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(32);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ProjectSearchBox().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(33);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.RegistrationNo().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		/*
		row0 = sheet.getRow(34);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(35);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ValidityDateL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(60);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddLicenceHeadCountCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(36);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.UploadDocumentL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		*/
		/*
		Locator.Calender1().click();
		Thread.sleep(3000);
		
		Locator.Calender1DD().click();
		Thread.sleep(3000);
		
		Locator.Calender2().click();
		Thread.sleep(3000);
		
		Locator.Calender1DD().click();
		Thread.sleep(3000);
		*/
		Locator.Calender11().click();
		Thread.sleep(3000);
		
		Locator.Calender1DD().click();
		Thread.sleep(3000);
		
		Locator.Calender1().click();
		Thread.sleep(3000);
		Locator1.NextMonthTri().click();
		Thread.sleep(3000);		
		Locator.Calender1DD().click();
		Thread.sleep(3000);
		row0 = sheet.getRow(60);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddLicenceHeadCountCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(34);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(36);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.UploadDocumentL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(4000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
			 try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 50); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac1=getDriver().switchTo().alert();
		    		
		    		String t=getDriver().switchTo().alert().getText();
		    		
		   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
				 {
						test.log(LogStatus.PASS, t);
					}
					else
					{
						test.log(LogStatus.FAIL, t);
						
						
					} 
		    		
		    		Thread.sleep(5000);
		            ac1.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
		        } finally {
		        	Locator.ClosetLicence().click();
		    		
		    		Thread.sleep(3000);
		        	
		        }


		
		
		
	}
	
	
	public static void LicenceDetailsVisilbe( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		
		Locator.Contractortab().click();
		Thread.sleep(2000);
		
		Locator.MappingEditProjectCT().click();
		Thread.sleep(2000);
		
		Locator.LicenceDetailsCT().click();
		Thread.sleep(2000);
		
if(Locator.LicenceType().isDisplayed()&&Locator.RegistrationNo1().isDisplayed()&&Locator.StartDate().isDisplayed()&&Locator.EndDate().isDisplayed()&&Locator.HeadCount().isDisplayed()&&Locator.FileName().isDisplayed()&&Locator.LicenseStatus().isDisplayed()&&Locator.Action().isDisplayed()) {
			
			test.log(LogStatus.PASS, "The Column of Licence Type, Registration No., Start Date, End Date, Head Count, File Name, License Status and Action Column should be seen on the License Details Page.");
		}else {
			
			test.log(LogStatus.FAIL, "The Column of Licence Type, Registration No., Start Date, End Date, Head Count, File Name, License Status and Action Column does not seen on the License Details Page.");
			
		}

        Thread.sleep(2000);
		
	}
	
	public static void ViewLicence( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		Locator.MappingEditProjectCT().click();
		Thread.sleep(3000);
		
		Locator.LicenceDetailsCT().click();
		Thread.sleep(4000);
		
		
		
		if(Locator.ViewLicenceCT().isEnabled())
		{
			Thread.sleep(9000);
			Locator.ViewLicenceCT().click();
			test.log(LogStatus.PASS, "Licence Viewed Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Licence Viewed Successfully"  );
			
		}
		
		
	//	Thread.sleep(3000);
	//	Locator.ViewLicenceCT().click();
	//	Thread.sleep(4000);
		
	//	Locator.Hand().click();
	//	Thread.sleep(4000);
		
		
		
		
		
	}
	
	
	public static void UpdateLicence( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		Locator.MappingEditProjectCT().click();
		Thread.sleep(3000);
		
		Locator.LicenceDetailsCT().click();
		Thread.sleep(4000);
		
		Locator.EditLicenceCT().click();
		Thread.sleep(4000);
		
		Locator.UpdateLicenceTypeCT().click();
		Thread.sleep(3000);
		
		Locator.LicenceTypeLD().click();
		Thread.sleep(3000);
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(32);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ProjectSearchBox().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.RegistrationNo().clear();
		
		row0 = sheet.getRow(61);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.RegistrationNo().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.Remark().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(34);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		/*
		row0 = sheet.getRow(35);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ValidityDateL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		*/
		Locator.AddLicenceHeadCountCT().clear();
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(60);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddLicenceHeadCountCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(36);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.UploadDocumentL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.Calender1().click();
		Thread.sleep(3000);
		
		Locator.Calender1DD().click();
		Thread.sleep(3000);
		
		Locator.Calender2().click();
		Thread.sleep(3000);
		
		Locator.Calender1DD().click();
		Thread.sleep(3000);
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(31000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(3000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } finally {
	        	Locator.ClosetLicence().click();
	    		
	    		Thread.sleep(3000);
	        	
	        }



	

	}
	
	
	public static void AddActAndComplience( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		Locator.AddActAndCompliance().click();
		Thread.sleep(3000);
		Locator.UpdateActAndComplienceCentral().click();
		Thread.sleep(7000);
		Locator.ActAndComplienceCentralDropDown().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(62);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ActNameAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.ContractorTypeAC().click();
		Thread.sleep(3000);
		Locator.ContractorTypeDDAC().click();
		Thread.sleep(10000);
		Locator.CatogaryAC().click();
		Thread.sleep(3000);
		Locator.CatogaryACDD().click();
		Thread.sleep(3000);
		Locator.ButtonSaveAct().click();
		
		Thread.sleep(7000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")|| t.equalsIgnoreCase("Act already exist.") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
		
		
		
	}
	

	public static void DeleteLicenceC( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		Locator.MappingEditProjectCT().click();
		Thread.sleep(3000);
		
		Locator.LicenceDetailsCT().click();
		Thread.sleep(4000);
		
		Locator.DeleteLicenceC().click();
		
		Thread.sleep(4000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 60); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Deleted Successfully.") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
	}

	
	
	public static void ClearAC( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.SelectActAC().click();
		Thread.sleep(5000);
		
		Locator.SelectActACDD().click();
		Thread.sleep(3000);
		
		if(Locator.ClearAC().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.ClearAC().click();
			test.log(LogStatus.PASS, " Clear Button Working properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button does not working properly "  );
			
		}
		
		
		Locator.SelectCentralorStateAC().click();
		Thread.sleep(4000);
		Locator.SelectCentralorStateACDD().click();
		Thread.sleep(4000);
		Locator.ClearAC().click();
		Thread.sleep(4000);
		Locator.SelectStateAC().click();
		Thread.sleep(4000);
		Locator.SelectStateACDD().click();
		Thread.sleep(4000);
		Locator.ClearAC().click();
		Thread.sleep(4000);
		
		
		
		
		
	}
	
	
	public static void UpdateActAndCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.EditActAndCompliance().click();
		Thread.sleep(4000);
		
		Locator.UpdateActAndComplienceCentral().click();
		Thread.sleep(7000);
		
		Locator.ActAndComplienceCentralDropDown().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		Locator.ActNameAC().clear();
		Thread.sleep(1000);
		row0 = sheet.getRow(62);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ActNameAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.ContractorTypeAC().click();
		Thread.sleep(3000);
		Locator.ContractorTypeDDAC().click();
		Thread.sleep(3000);
		Locator.UpdateCatogaryAC().click();
		Thread.sleep(3000);
		Locator.CatogaryACDD().click();
		Thread.sleep(3000);
		Locator.ButtonSaveAct().click();
		
		Thread.sleep(7000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")|| t.equalsIgnoreCase("Act already exist.") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
		
		
	}
	
	public static void DeleteAc( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(3000);
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(7000);
		
		Locator.DeleteActAndComplienceCentral().click();
		Thread.sleep(4000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(64);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.DeActivationDateAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.BtnSaveDeActivationAC().click();
		
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(9000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 60); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Disable Successfully") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 


		
		
	}
	
	
	public static void UploadActAndCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(3000);
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(7000);
		
		Locator.UploadActAndCompliance().click();
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(65);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SelectFileActAndCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonAC().click();
		Thread.sleep(9000);
		
		/*
		Alert ac3=getDriver().switchTo().alert();
		
		String t4=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t4 );
		
		Thread.sleep(5000);
		ac3.accept();
	
		Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("File uploaded successfully.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Download error log");
	            test.log(LogStatus.FAIL, "Download error log");
	        } 

		
	
		
	}
	
	
	
	
	public static void AddCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.ComplienceButtonAC().click();
		Thread.sleep(3000);
		
		Locator.AddComplienceAC().click();
		Thread.sleep(3000);
		
		Locator.AddComplienceSelectAC().click();
		Thread.sleep(3000);
		
		Locator.AddComplienceSelectStatutaryACDD().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplienceCentral1().click();
		Thread.sleep(7000);
		
		Locator.ActAndComplienceCentralDropDown1().click();
		Thread.sleep(3000);
		
		
		Locator.SelectActCom().click();
		Thread.sleep(3000);
		
		Locator.SelectActDDCOM().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(68);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ComplianceHeader().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.FrequencyAC().click();
		Thread.sleep(3000);
		
		Locator.FrequencyACDD().click();
		Thread.sleep(3000);
		
		Locator.ComplianceSaveButtonAC().click();
		Thread.sleep(3000);
		
		/*
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")|| t.equalsIgnoreCase("Compliance Header already exist.") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 


		
		
		
		
	}
	
	
	
	public static void AddComplianceForInternal( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.ComplienceButtonAC().click();
		Thread.sleep(3000);
		
		Locator.AddComplienceAC().click();
		Thread.sleep(3000);
		
		Locator.AddComplienceSelectAC().click();
		Thread.sleep(3000);
		
		Locator.AddComplienceSelectStatutaryInternal().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplienceCentral1().click();
		Thread.sleep(7000);
		
		Locator.ActAndComplienceCentralDropDown1().click();		
		Thread.sleep(3000);
		
		
		Locator.SelectActCom().click();
		Thread.sleep(3000);
		
		Locator.SelectActDDCOM().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(157);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ComplianceHeader().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.FrequencyAC().click();
		Thread.sleep(3000);
		
		Locator.FrequencyACDD().click();
		Thread.sleep(3000);
		
		Locator.ComplianceSaveButtonAC().click();
		Thread.sleep(3000);
	/*
		Thread.sleep(5000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " Central Internal Compliance - "+ t3 );
			
			Thread.sleep(5000);
			ac2.accept();
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")|| t.equalsIgnoreCase("Compliance Header already exist.") ) 
			 {
					test.log(LogStatus.PASS, " Central Internal Compliance - "+ t);
				}
				else
				{
					test.log(LogStatus.FAIL, " Central Internal Compliance - "+t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 


		
			Thread.sleep(200);
			
			Locator.CloseButton().click();
			Thread.sleep(3000);
			
			Locator.AddComplienceAC().click();
			Thread.sleep(3000);
			
			Locator.AddComplienceSelectAC().click();
			Thread.sleep(3000);
			
			Locator.Internal().click();
			Thread.sleep(3000);
			
			Locator.ActAndComplienceCentral1().click();
			Thread.sleep(7000);
			
			Locator.StateDropDown().click();		
			Thread.sleep(3000);
			
			Locator.ActAndComplienceState().click();		
			Thread.sleep(3000);
			
			Locator.ActAndComplienceStateDD().click();		
			Thread.sleep(3000);
			
			Locator.SelectActCom().click();
			Thread.sleep(3000);
			
			Locator.SelectActDD().click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(160);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.ComplianceHeader().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.FrequencyAC().click();
			Thread.sleep(3000);
			
			Locator.FrequencyDD().click();
			Thread.sleep(3000);
			
			Locator.ComplianceSaveButtonAC().click();
			Thread.sleep(3000);
		/*
			Thread.sleep(5000);
			
			 Alert ac=getDriver().switchTo().alert();
				
				String t=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "State Internal Compliance - " + t );
				
				Thread.sleep(5000);
				ac2.accept();
			
				Thread.sleep(200);
*/
			 try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac1=getDriver().switchTo().alert();
		    		
		    		String t=getDriver().switchTo().alert().getText();
		    		
		   		 if(t.equalsIgnoreCase("Record Saved Successfully")|| t.equalsIgnoreCase("Compliance Header already exist.") ) 
				 {
						test.log(LogStatus.PASS, "State Internal Compliance - " + t);
					}
					else
					{
						test.log(LogStatus.FAIL, "State Internal Compliance - " +t);
						
						
					} 
		    		
		    		Thread.sleep(5000);
		            ac1.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
		        } 


		
		
	}

	
	
	public static void UpdateComplianceAC( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
        
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.ComplienceButtonAC().click();
		Thread.sleep(3000);
		
		Locator.EditComplianceAC().click();
		Thread.sleep(3000);
		
		Locator.UpdateStatutoryAC().click();
		Thread.sleep(3000);
		
		Locator.AddComplienceSelectStatutaryACDD().click();
		Thread.sleep(3000);
		
		Locator.UpdateCentralorStateAC().click();
		Thread.sleep(7000);
		
		Locator.ActAndComplienceCentralDropDown().click();
		Thread.sleep(7000);
		
		
		Locator.UpdateSelectActCom().click();
		Thread.sleep(3000);
		
		Locator.SelectActDDCOM().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		Locator.ComplianceHeader().clear();
		Thread.sleep(1000);
		
		row0 = sheet.getRow(68);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ComplianceHeader().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UpdateFrequencyAC().click();
		Thread.sleep(3000);
		
		Locator.FrequencyACDD().click();
		Thread.sleep(3000);
		
		Locator.ComplianceSaveButtonAC().click();
		Thread.sleep(3000);
		
		/*
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);	
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 


	}

	public static void DeleteCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.ComplienceButtonAC().click();
		Thread.sleep(3000);
		
		Locator.DeleteComplianceAC().click();
		Thread.sleep(3000);
		
        Locator.CalenderComplianceAC().click();
        Thread.sleep(3000);
        
        Locator.CalenderComplianceDateSelectAC().click();
        Thread.sleep(3000);
        
		
        Locator.DeleteButtonSaveDeactivateAC().click();
        Thread.sleep(6000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
        */
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Disable Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 


		
	}
	 public static void ComplianceClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	 {
		 
		 
		 //Locator.MasterButton().click();
			Thread.sleep(3000);
			
			Locator.ActAndComplianceMaster().click();
			Thread.sleep(6000);
			
			Locator.ComplienceButtonAC().click();
			Thread.sleep(3000);
		 
			Locator.ComplianceSearchAC().click();
			Thread.sleep(3000);
			
			Locator.ComplianceSearchDDAC().click();
			Thread.sleep(3000);
			
			if(Locator.ComplianceClearBAC().isEnabled())
			{
				
				Thread.sleep(2000);
			 Locator.ComplianceClearBAC().click();
				test.log(LogStatus.PASS, " Clear Button Working properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Clear Button Working properly"  );
				
			}
			
		 
	 }
	 
	 
	 public static void ComplianceCombinedFormUpload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	 {
		 
		 
		 //Locator.MasterButton().click();
			Thread.sleep(3000);
			
			Locator.ActAndComplianceMaster().click();
			Thread.sleep(6000);
			
			Locator.ComplienceButtonAC().click();
			Thread.sleep(3000);
			
		//	Locator.Compliencecheck().click();
		//	Thread.sleep(3000);
			
			WebElement element = Locator.Compliencecheck();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		      jse.executeScript("arguments[0].click();", element);
		      boolean b = element.isSelected();
		      if (b) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
		
		      Thread.sleep(1000);
		      if(Locator.Compliencecombinedformbutton().isDisplayed())
		      {
		    	  test.log(LogStatus.PASS, "Combined Form button displayed on the page of act and compliance master - Compliance page.");
		      }
		      else
		      {
		    	  test.log(LogStatus.PASS, "Combined Form button does not displayed on the page of act and compliance master - compliance page.");

		      }
			
			Locator.Compliencecombinedformbutton().click();
			Thread.sleep(3000);
			
			Locator.Compliencechoosefile().sendKeys("E:\\BackupDesktop\\FileUploadForEntityMaster\\Contractor-ProjectMapping.xlsx");
			Thread.sleep(3000);
			
			Locator.Complienceuploadbutton().click();
			Thread.sleep(3000);
			/*
            Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(2000);
			ac2.accept();
			*/
			 try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac1=getDriver().switchTo().alert();
		    		
		    		String t=getDriver().switchTo().alert().getText();
		    		
		   		 if(t.equalsIgnoreCase("File uploaded successfully.")) 
				 {
						test.log(LogStatus.PASS, t);
					}
					else
					{
						test.log(LogStatus.FAIL, t);
						
						
					} 
		    		
		    		Thread.sleep(5000);
		            ac1.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
		        } 

		
			Thread.sleep(2000);
	//		Locator.ComplienceClose().click();
	//		Thread.sleep(3000);
			
			File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(9000);
		     Locator.DownloadSampleFormat().click();
			
		 	Thread.sleep(18000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
		   
		    Thread.sleep(9000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Sample Format Downloaded.");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "Sample Format Does Not Downloaded.");
			}		

		   Thread.sleep(2000);
			if(Locator.ViewSampleFormat().isEnabled())
			{
				
				Thread.sleep(2000);
			 Locator.ViewSampleFormat().click();
				test.log(LogStatus.PASS, "Sample Format Viewed Successfully " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Sample Format does not Viewed. "  );
				
			}

			
			
			
	 }
	
	public static void UploadCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.ComplienceButtonAC().click();
		Thread.sleep(3000);
		
		Locator.ComplianceUploadAC().click();
		Thread.sleep(3000);
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(70);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUploadCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
			
		Locator.ButtonComplianceUploadAC().click();	
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Central Statutory Compliance - " + t3 );
			
			Thread.sleep(5000);
			ac2.accept();
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
			 {
					test.log(LogStatus.PASS, "Central Statutory Compliance - " +t);
				}
				else
				{
					test.log(LogStatus.FAIL, "Central Statutory Compliance - " +t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 


		
			Thread.sleep(4000);
			Locator.ComplianceUploadAC().click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(159);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.ChooseFileUploadCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(1000);
				
			Locator.ButtonComplianceUploadAC().click();	
			Thread.sleep(9000);
			/*
			 Alert ac=getDriver().switchTo().alert();
				
				String t=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "State Statutory Compliance - " + t );
				
				Thread.sleep(5000);
				ac.accept();
			
				Thread.sleep(4000);
			*/
			 try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac1=getDriver().switchTo().alert();
		    		
		    		String t=getDriver().switchTo().alert().getText();
		    		
		   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
				 {
						test.log(LogStatus.PASS, "State Statutory Compliance - " +t);
					}
					else
					{
						test.log(LogStatus.FAIL, "State Statutory Compliance - " +t);
						
						
					} 
		    		
		    		Thread.sleep(5000);
		            ac1.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		          //  System.out.println("Alert not found within the specified time.");
		           //// test.log(LogStatus.FAIL, "Download error log");
		        } 

		
	}
	
	
	public static void UploadComplianceInternal( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.ComplienceButtonAC().click();
		Thread.sleep(3000);
		
		Locator.ComplianceUploadAC().click();
		Thread.sleep(3000);
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(156);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUploadCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
				
		Locator.ButtonComplianceUploadAC().click();	
		Thread.sleep(5000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Central Internal Compliance - " + t3);
			
			Thread.sleep(5000);
			ac2.accept();
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
			 {
					test.log(LogStatus.PASS, "Central Internal Compliance - " +t);
				}
				else
				{
					test.log(LogStatus.FAIL, "Central Internal Compliance - " +t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

			Thread.sleep(1000);
		
			Locator.ComplianceUploadAC().click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(158);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.ChooseFileUploadCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
					
			Locator.ButtonComplianceUploadAC().click();	
			Thread.sleep(5000);
			/*
			 Alert ac=getDriver().switchTo().alert();
				
				String t=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "State Internal Compliance - " + t);
				
				Thread.sleep(5000);
				ac.accept();
			
				Thread.sleep(500);
			*/
			 try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac1=getDriver().switchTo().alert();
		    		
		    		String t=getDriver().switchTo().alert().getText();
		    		
		   		 if(t.equalsIgnoreCase("Record Saved Successfully") ) 
				 {
						test.log(LogStatus.PASS, "State Internal Compliance - " +t);
					}
					else
					{
						test.log(LogStatus.FAIL, "State Internal Compliance - " +t);
						
						
					} 
		    		
		    		Thread.sleep(5000);
		            ac1.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
		        } 

	}
	
	
	
	
	
	public static void AddTemplateAC( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.TemplateButtonAC().click();
		Thread.sleep(6000);
		Locator.A1ddTemplateAC().click();
		Thread.sleep(6000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(72);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.TemplateNameAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.TemplateTypeAC().click();
		Thread.sleep(3000);
		Locator.TemplateTypeDDAC().click();
		Thread.sleep(9000);
		
		
		
	//	WebWait wait = new WebWait(, 60000);
		
		
		
		
		WebElement element = Locator.TemplateCheckBoxAC();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	      jse.executeScript("arguments[0].click();", element);
	      boolean b = element.isSelected();
	      if (b) {
	         System.out.println("Checkbox is not checked");
	      }else {
	         System.out.println("Checkbox is checked");
	      }
		
	      Thread.sleep(20000);
		
		
		
	/*	
		Thread.sleep(3000);
		
        JavascriptExecutor js = (JavascriptExecutor) ;
        
        js.executeScript("arguments[0].click;",element);
        Thread.sleep(5000);
	//	js.exicuteScript("arguments[0].click;",element);
		*/
		Locator.TemplateSaveButtonAC().click();
		
		Thread.sleep(6000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")|| t.equalsIgnoreCase("Template Name already exist.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		
		
		
	}
	
	
	
	public static void TemplateClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.TemplateButtonAC().click();
		Thread.sleep(6000);
		
		Locator.SearchButtonTemplateAC().click();
		Thread.sleep(3000);
		Locator.SearchButtonTemplateDDAC().click();
		Thread.sleep(3000);
		
		if(Locator.ClerButtonTemplateDDAC().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.ClerButtonTemplateDDAC().click();
			test.log(LogStatus.PASS, "Clear Button Working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button does not working properly "  );
			
		}
	
		
		
		
	}
	
	
	
	
	public static void DeleteTemplateAC( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.TemplateButtonAC().click();
		Thread.sleep(6000);
		
		Locator.DeleteTemplateAC().click();
		Thread.sleep(3000);
		
		Locator.CalenderComplianceAC().click();
        Thread.sleep(3000);
        
        Locator.CalenderComplianceDateSelectAC().click();
        Thread.sleep(3000);
		
        Locator.DeleteButtonSaveDeactivateAC().click();
        Thread.sleep(6000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Disable Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 


	}
	
	
	
	
	public static void UploadTemplate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.TemplateButtonAC().click();
		Thread.sleep(6000);
		
		Locator.UploadTemplateDDAC().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(73);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileTemplateAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonTemplateAC().click();
		
		Thread.sleep(7000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("File uploaded successfully.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Download Error log");
	        } 


	}
	
	
	
	
	
	public static void AddContractorType( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ContractorTypeButton().click();
		Thread.sleep(3000);
		
		Locator.AddContractorTypeButton().click();
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(75);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorTypeName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.AddContractorTypeSaveButton().click();
		
		Thread.sleep(7000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 
		
			Locator.CloseContractorTypePage().click();
			Thread.sleep(4000);
	}
	
	
	
	public static void UpdateContractorType( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ContractorTypeButton().click();
		Thread.sleep(3000);
		
		Locator.EditContractorType().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		Locator.AddContractorTypeName().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(76);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorTypeName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.AddContractorTypeSaveButton().click();
		
		Thread.sleep(7000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")||t.equalsIgnoreCase("Type Name already exist.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);
		
			Locator.CloseContractorTypePage().click();
			Thread.sleep(4000);
		
		
	}
	
	public static void DeleteContractorType( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ContractorTypeButton().click();
		Thread.sleep(3000);
		
		Locator.DeleteContractorType().click();
		
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
			
		
			Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Are you sure want to delete this Contractor Type?")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

			/*
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t4 );
				
				Thread.sleep(9000);
				ac3.accept();
			*/
			 try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac1=getDriver().switchTo().alert();
		    		
		    		String t=getDriver().switchTo().alert().getText();
		    		
		   		 if(t.equalsIgnoreCase("Record Deleted Successfully")|| t.equalsIgnoreCase("Contractor type already in used.")) 
				 {
						test.log(LogStatus.PASS, t);
					}
					else
					{
						test.log(LogStatus.FAIL, t);
						
						
					} 
		    		
		    		Thread.sleep(5000);
		            ac1.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
		        } 

			 Thread.sleep(4000);

		
			
		
		
	}
	
	
	public static void ContractorTypeClearButtonn( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ContractorTypeButton().click();
		Thread.sleep(3000);
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(77);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContractorTypeSearchButton().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		if(Locator.ContractorTypeClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.ContractorTypeClearButton().click();
			test.log(LogStatus.PASS, "  Clear Button Working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button does not working properly "  );
			
		}
		
		
		
		
	}
	
	public static void AddCity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.CityMasterButton().click();
		Thread.sleep(3000);
		
		Locator.AddCityButton().click();
		Thread.sleep(3000);
		
		Locator.AddStatenameCityM().click();
		Thread.sleep(3000);
		
		Locator.AddStatenameDDCityM().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(78);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddCityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SaveCityMaster().click();
		
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")|| t.equalsIgnoreCase("City Name already exist.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
	}
	
	public static void UpdateCity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.CityMasterButton().click();
		Thread.sleep(3000);
		
		Locator.EditCityMaster().click();
		Thread.sleep(3000);
		
		Locator.AddStatenameCityM().click();
		Thread.sleep(3000);
		
		Locator.UpdateCityStateDDMaster().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		Locator.AddCityName().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(79);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddCityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SaveCityMaster().click();
		
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully") || t.equalsIgnoreCase("City Name already exist.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
	}
	
	
	public static void DeleteCity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.CityMasterButton().click();
		Thread.sleep(3000);
		
		Locator.DeletetCityMaster().click();
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Deleted Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
		
		
	}
	
	public static void CityMasterClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.CityMasterButton().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(80);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.CitySearchButtonMaster().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		if(Locator.CityClearButtonMaster().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CityClearButtonMaster().click();
			test.log(LogStatus.PASS, " Clear Button Working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button does not working properly "  );
			
		}
		
		
		Locator.CitySearcStateButtonMaster().click();
		Thread.sleep(3000);
		
		Locator.CitySearcStateDDMaster().click();
		Thread.sleep(3000);
		
	}
	
	
 	public static void AddLicenceType( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
 	{
 		
 		//Locator.MasterButton().click();
		Thread.sleep(3000);
 		
		Locator.LicenceTypeMaster().click();
		Thread.sleep(3000);
		
		Locator.AddLicenceTypeButton().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(81);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddLicenceTypeName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SaveLicenceTypeButton().click();
		Thread.sleep(5000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
 		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
		   		 if(t.equalsIgnoreCase("Record Saved Successfully")||t.equalsIgnoreCase("License name already exists")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

 		
 		
 	}
	
	
	public static void UpdateLicenceType( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
 		
		Locator.LicenceTypeMaster().click();
		Thread.sleep(3000);
		
		Locator.EditLicenceType().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		Locator.AddLicenceTypeName().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(82);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddLicenceTypeName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SaveLicenceTypeButton().click();
		Thread.sleep(5000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
 		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")||t.equalsIgnoreCase("License name already exists")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
	}
	
	
	public static void DeleteLicenceType( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
 		
		Locator.LicenceTypeMaster().click();
		Thread.sleep(3000);
		
		Locator.DeleteLicenceType().click();
		Thread.sleep(3000);
		/*
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Deleted Successfully.") || t.equalsIgnoreCase("License type already in use.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
		
	}
	
	
	public static void LicenceTypeClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
 		
		Locator.LicenceTypeMaster().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(83);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.LicenceTypeSearchButton().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		if(Locator.LicenceTypeClearButton().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.LicenceTypeClearButton().click();
			test.log(LogStatus.PASS, " Clear Button Working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button does not working properly "  );
			
		}
		
		
	}
	
	
	public static void AddDataPoint( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.DataPointMaster().click();
		Thread.sleep(3000);
		
		Locator.AddDataPoint().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(84);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddDataPointDescription().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.AddDataPointDescriptionType().click();
		Thread.sleep(3000);
		
		Locator.AddDataPointDescriptionTypeDD().click();
		Thread.sleep(3000);
		
		Locator.SaveDataPoint().click();
		Thread.sleep(3000);
		/*
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
		
		
	}
	
	public static void UpdateDataPoint( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.DataPointMaster().click();
		Thread.sleep(3000);
		
		Locator.EditDataPoint().click();
		Thread.sleep(3000);
		
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		Locator.AddDataPointDescription().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(85);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddDataPointDescription().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.AddDataPointDescriptionType().click();
		Thread.sleep(3000);
		
		Locator.UpdateDescriptionTypeDDDataPoint().click();
		Thread.sleep(3000);
		
		Locator.SaveDataPoint().click();
		Thread.sleep(3000);
		/*
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 70); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
		
		
	}
	
	
	
	
	
	public static void DeleteDataPoint( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.DataPointMaster().click();
		Thread.sleep(3000);
		
		Locator.DeleteDataPoint().click();
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Deleted Successfully.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
		
		
		
	}
	
	
	
	public static void DataPointClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.DataPointMaster().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(86);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SearchBoxDataPoint().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		if(Locator.ClearButtonDataPoint().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.ClearButtonDataPoint().click();
			test.log(LogStatus.PASS, " Clear Button Working properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button does not working properly "  );
			
		}
		
		
	}
	
	// Add Compliance Mapping
	
	
	public static void AddNewCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait( getDriver(), 30);
		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
		WebElement element = Locator.CheckBox();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
	      jse.executeScript("arguments[0].click();", element);
	      boolean b = element.isSelected();
	      if (b) {
	         System.out.println("Checkbox is not checked");
	      }else {
	         System.out.println("Checkbox is checked");
	      }
		
	      
	//	Locator.CheckBox().click();
		Thread.sleep(1000);
		
		Locator.NextButton().click();
		Thread.sleep(7000);
		
		WebElement element1 = Locator.SelectComplianceCheckBox1();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor js = (JavascriptExecutor) getDriver();
	      jse.executeScript("arguments[0].click();", element1);
	      boolean c = element.isSelected();
	      if (c) {
	         System.out.println("Checkbox is not checked");
	      }else {
	         System.out.println("Checkbox is checked");
	      }
	
	      Thread.sleep(1000);
   //     Locator.SelectComplianceCheckBox1().click();
   //     Thread.sleep(3000);
	      
			WebElement element2 = Locator.SelectComplianceCheckBox2();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element2);
		      boolean d = element.isSelected();
		      if (d) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
		      Thread.sleep(1000);
        
	//	Locator.SelectComplianceCheckBox2().click();
	//	Thread.sleep(7000);
		
		Locator.SaveMappingButton().click();
		Thread.sleep(3000);
		
		/*
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
			*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
		
		
	}
	
	public static void CMCheckBox( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='gridPendingMapping']"))); 
		Thread.sleep(1000);
		WebElement element = Locator.CheckBox();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
	      jse.executeScript("arguments[0].click();", element);
	      boolean b = element.isSelected();
	      if (b) {
	         System.out.println("Checkbox is not checked");
	      }else {
	         System.out.println("Checkbox is checked");
	      }
	      
	      
	//	Locator.CheckBox().click();
		Thread.sleep(1000);
		
		Locator.NextButton().click();
		Thread.sleep(7000);
		
if(Locator.Manualcomplianceselectioncheckbox().isDisplayed()&&Locator.TemplateCompliance().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Manual compliance selection checkbox and Template Compliance checkbox should be seen on the compliance list page");
		}else {
			
			test.log(LogStatus.FAIL, "Manual compliance selection checkbox and Template Compliance checkbox should not seen on the compliance list page");
			
		}

		
	}
	
	public static void UnlockDaysMaster( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.UnlockDaysMaster().click();
		Thread.sleep(1000);
		
		
		WebElement element = Locator.Checkbox();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
	      jse.executeScript("arguments[0].click();", element);
	      boolean b = element.isSelected();
	      if (b) {
	         System.out.println("Checkbox is not checked");
	      }else {
	         System.out.println("Checkbox is checked");
	      }
	
		Thread.sleep(500);
		Locator.Addbutton().click();
		Thread.sleep(500);
		Locator.daysadd().sendKeys("20");
		Thread.sleep(500);
		Locator.Submit().click();
		Thread.sleep(500);
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac1=getDriver().switchTo().alert();
    		
    		String t=getDriver().switchTo().alert().getText();
    		
   		 if(t.equalsIgnoreCase("Successfully updated.")) 
		 {
				test.log(LogStatus.PASS, t);
			}
			else
			{
				test.log(LogStatus.FAIL, t);
				
				
			} 
    		
    		Thread.sleep(5000);
            ac1.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            
        } 
	
		}
	
	public static void UpdateCompliencesFTab( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(6000);
		
		Locator.Assign().click();
		Thread.sleep(6000);
		
		Locator.UpdateComplienceCM().click();
		Thread.sleep(5000);
		
		Locator.TemplateDropCM().click();
		Thread.sleep(3000);
		
		
		
		
	//	Locator.UpdateComplienceTempCheckBoxDrop().click();
	//	Thread.sleep(3000);
		
		Locator.RemoveCM().click();
		
		Thread.sleep(9000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Deleted Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
		
	}
	
	public static void AddTemplateandUpadtetemplateButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='gridPendingMapping']"))); 
		Thread.sleep(1000);
				
		Locator.Assign().click();
		Thread.sleep(6000);
		
		Locator.UpdateComplienceCM().click();
		Thread.sleep(3000);
		
if(Locator.AddTempbutton().isDisplayed()&&Locator.UpdateTempbutton().isDisplayed()) {
			
			test.log(LogStatus.PASS, "Add Template button and Update Template button should be seen on the compliance list page");
		}else {
			
			test.log(LogStatus.FAIL, "Add Template button and Update Template button should not seen on the compliance list page");
			
		}

		

	}
	
	public static void AddTemplate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='gridPendingMapping']"))); 
		Thread.sleep(1000);
				
		Locator.Assign().click();
		Thread.sleep(6000);
		
		Locator.UpdateComplienceCM().click();
		Thread.sleep(3000);
		
		Locator.Filtertemp().click();
		Thread.sleep(3000);
		
		Locator.FiltertempDD().click();
		Thread.sleep(3000);
		Locator.AddTempbutton().click();
		Thread.sleep(3000);
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac1=getDriver().switchTo().alert();
    		
    		String t=getDriver().switchTo().alert().getText();
    		
   		 if(t.equalsIgnoreCase("Template Added Successfully")) 
		 {
				test.log(LogStatus.PASS, t);
			}
			else
			{
				test.log(LogStatus.FAIL, t);
				
				
			} 
    		
    		Thread.sleep(5000);
            ac1.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            
        } 

	 Thread.sleep(4000);
	 Locator.UpdateComplienceCM().click();
		Thread.sleep(3000);
	 WebElement element = Locator.CheckBoxtemp();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
	      jse.executeScript("arguments[0].click();", element);
	      boolean b = element.isSelected();
	      if (b) {
	         System.out.println("Checkbox is not checked");
	      }else {
	         System.out.println("Checkbox is checked");
	      }
	      Thread.sleep(4000);
	      JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,500)");
	        Thread.sleep(5000);
	      Locator.UpdateTempbutton().click();
	      Thread.sleep(4000);
	      try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Template updated Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            
	        } 
		
		
	}
	
	public static void ExportReportDownloadCM( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
		Locator.Assign().click();
		Thread.sleep(6000);
		
		Locator.UpdateComplienceCM().click();
		Thread.sleep(5000);
		
		Locator.TemplateDropCM().click();
		Thread.sleep(3000);
		/*
		if(Locator.ExportToExcelCM().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ExportToExcelCM().click();
			test.log(LogStatus.PASS, "File Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Download Successfully"  );
			
		}
		*/
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator.ExportToExcelCM().click();
		
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
	
	public static void ExportButtonCM( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(6000);
		
		Locator.Assign().click();
		Thread.sleep(6000);
		
		/*
		if(Locator.ExportButtonCM().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ExportButtonCM().click();
			test.log(LogStatus.PASS, "File Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Download Successfully"  );
			
		}
		*/
	    
	File dir2 = new File("C:\\Users\\shitalb\\Downloads");
	File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(9000);
     Locator.ExportButtonCM().click();
	
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
		
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
		Locator.StateCM().click();
		Thread.sleep(2000);
		
		Locator.StateDDCM().click();
		Thread.sleep(2000);
		
		Locator.StateCM().click();
		Thread.sleep(2000);

		
		if(Locator.ClearButtonCM().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearButtonCM().click();
			test.log(LogStatus.PASS, "Clear Button Working Properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Does Not Working Properly"  );
			
		}
		
		
		
		
		
		
	}
	
	
	
	public static void ClearButton1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(6000);
		
		Locator.StateCM().click();
		Thread.sleep(6000);
		
		Locator.StateDDCM().click();
		Thread.sleep(6000);
		
		if(Locator.ClearButtonCM().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearButtonCM().click();
			test.log(LogStatus.PASS, "Record Saved Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Record Saved Successfully"  );
			
		}
	
	}
	
	public static void UploadCMFTab( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(6000);
		
		Locator.UploadCM().click();
		Thread.sleep(6000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(104);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileCM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonCM().click();
		Thread.sleep(3000);
		/*
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("File uploaded successfully.")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		
	}




	public static void ViewIconCM( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(4000);
		
		Locator.Assign().click();
		Thread.sleep(4000);
		
		if(Locator.ViewButtonCM().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ViewButtonCM().click();
			test.log(LogStatus.PASS, "Overview Button Working Properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "Overview Button Working Properly "  );
			
		}
		Thread.sleep(3000);
		Locator.ProjectGetText().getText();
		Thread.sleep(1000);
		
		
		
	}
	
	
	public static void AuditSchedule( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		Locator.AuditScheduling().click();
		Thread.sleep(9000);
		Locator.AuditSchedulingUnschedule().click();
		Thread.sleep(20000);
	
		
		Locator.AuditSchedulingUnscheduleSelectPeriod().click();
		Thread.sleep(9000);
		
		Locator.SelectPeriodDD().click();
		Thread.sleep(9000);
		
		Locator.SelectYearAS().click();
		
		Thread.sleep(4000);
		
		Locator.SelectYearASDD().click();
		Thread.sleep(4000);
		/*
		WebElement element = Locator.SelectYearASDD();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor)  getDriver();
	      jse.executeScript("arguments[0].click();", element);
	      */
		
	      Thread.sleep(2000);
		
		Locator.SaveAuditScheduling().click();
		
		Thread.sleep(7000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			 if(t3.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t3);
				}
				else
				{
					test.log(LogStatus.FAIL, t3);
					
					
				} 

			
		//	test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		

		
		
		
	}
	
	
	
	
	
	
	
	public static void ClearButtonAS( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		Locator.AuditScheduling().click();
		Thread.sleep(4000);
		
		Locator.LocationAS().click();
		Thread.sleep(4000);
		Locator.LocationDropAS().click();
		Thread.sleep(7000);
		Locator.LocationAS().click();
		Thread.sleep(4000);
		
		if(Locator.ClearButtonAS().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearButtonAS().click();
			test.log(LogStatus.PASS, "Clear Button Working Properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Does Not Working Properly"  );
			
		}
		
		
		Thread.sleep(4000);
		
		
		
	}
	
	public static void AssignComplience( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		Locator.AuditAssignment().click();
		Thread.sleep(9000);
	//	Locator.AssignButtonAA().click();
		Thread.sleep(4000);
		
		Locator.SelectAuditor().click();
		Thread.sleep(4000);
		WebElement element = Locator.SelectAuditorDDAA();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor)  getDriver();
	      jse.executeScript("arguments[0].click();", element);
	      
		
	      Thread.sleep(16000);
		

	
		Locator.AssignSelectAuditorSaveAA().click();
		
		Thread.sleep(7000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		


		
		
		
	}
	
	public static void UnassignComplianceAA( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		Locator.AuditAssignment().click();
		Thread.sleep(9000);
		Locator.UnassignButtonAA().click();
		Thread.sleep(9000);
		Locator.SelectAuditor1().click();
		Thread.sleep(7000);
		
		Locator.SelectAuditorDDAA().click();
		Thread.sleep(4000);
		Locator.SelectAuditorSaveAA().click();
		
		Thread.sleep(6000);
		/*
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
	//	Locator.ScheduleAS().click();
		*/
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 30); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac1=getDriver().switchTo().alert();
	    		
	    		String t=getDriver().switchTo().alert().getText();
	    		
	   		 if(t.equalsIgnoreCase("Record Saved Successfully")) 
			 {
					test.log(LogStatus.PASS, t);
				}
				else
				{
					test.log(LogStatus.FAIL, t);
					
					
				} 
	    		
	    		Thread.sleep(5000);
	            ac1.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	            test.log(LogStatus.FAIL, "Alert not found within the specified time.");
	        } 

		 Thread.sleep(4000);

		

		
		
	}
	
	
	public static void ClearButtonAA( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(4000);
		Locator.AuditAssignment().click();
		Thread.sleep(4000);
		
		Locator.Project().click();
		Thread.sleep(4000);
		Locator.LocationDropAS().click();
		Thread.sleep(4000);
		
		
		if(Locator.ClearButtonAA().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearButtonAA().click();
			test.log(LogStatus.PASS, "Clear Button Working Properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Does Not Working Properly"  );
			
		}
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
	}
	
	public static void ExportReportFromReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(4000);
		/*
		if(Locator.ExportReportFR().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ExportReportFR().click();
			test.log(LogStatus.PASS, "File Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Download Successfully");
			
		}
		*/
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator.ExportReportFR().click();
		
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
		
		
		public static void ExportReportFromReport11( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			Thread.sleep(4000);
			Locator.Report().click();
			Thread.sleep(4000);
			
			if(Locator.ExportReportFR().isEnabled())
			{
				
				Thread.sleep(2000);
				Locator.ExportReportFR().click();
				test.log(LogStatus.PASS, "File uploaded successfully." );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " File uploaded successfully."  );
				
			}
		
		
		
		
		
	}
	
	
	
	public static void ClearButtonReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(4000);
		
		Locator.CalenderStartDReport().click();
		Thread.sleep(4000);
		Locator.CalenderStartDReportDD().click();
		Thread.sleep(4000);
		Locator.CalenderStartDReport().click();
		Thread.sleep(4000);
		
		if(Locator.ClearButtonReport().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearButtonReport().click();
			test.log(LogStatus.PASS, "Clear Button Working Properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Does Not Working Properly"  );
			
		}
		
		
	}
	
	
	
	
	public static void MoreReportR( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(4000);
		
		Locator.MoreReportReport().click();
		Thread.sleep(4000);
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator.CloseAuditReportR().click();
		
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

	   Thread.sleep(2000);
	   Locator2.Facilty().click();	
		Thread.sleep(2000);
		
		Locator2.FaciltyDD().click();	
		Thread.sleep(2000);
		Locator.SelectMonth().click();
		Thread.sleep(2000);
		
		Locator.SelectMonthDD().click();
		Thread.sleep(5000);
		
		File dir = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(9000);
	     Locator.MouthCloseReportR().click();
		
	 	Thread.sleep(18000);
		File dir4 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew4 = dir4.listFiles();						//Counting number of files in directory after download
		
	   
	    Thread.sleep(9000);
	   if (dirContents.length < allFilesNew4.length) {
			test.log(LogStatus.PASS,  "Month Wise Closed Audit Report Downloaded Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Month Wise Closed Audit Report Does Not Downloaded Successfully");
		}		

	   Thread.sleep(5000);
		
			Thread.sleep(4000);
				
			File dir7 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents7 = dir7.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(9000);
		     Locator.RemarkReportR().click();
			
		 	Thread.sleep(18000);
			File dir9 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew9 = dir9.listFiles();						//Counting number of files in directory after download
			
		   
		    Thread.sleep(9000);
		   if (dirContents7.length < allFilesNew9.length) {
				test.log(LogStatus.PASS,  "Compliance Remark Report Downloaded Successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "Compliance Remark Report Does Not Downloaded Successfully");
			}		

			Thread.sleep(2000);
			
			
			File dir5 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents5 = dir5.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(9000);
		     Locator.AuditReport().click();
			
		 	Thread.sleep(18000);
			File dir6 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew6 = dir6.listFiles();						//Counting number of files in directory after download
			
		   
		    Thread.sleep(9000);
		   if (dirContents5.length < allFilesNew6.length) {
				test.log(LogStatus.PASS,  "Audit Report Downloaded Successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "Audit Report Does Not Downloaded Successfully");
			}		

		   Thread.sleep(5000);
		
	}
	
	
	

	public static void ActionColReportDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(7000);
		
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
	/*   getDriver().switchTo().frame(Locator.Frame());
		Thread.sleep(3000);
	
		getDriver().switchTo().frame(Locator2.InnerFrame());
		Thread.sleep(7000);
		*/
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

	

     public static void ViewReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
     {
    	 
    	 
    	 Thread.sleep(4000);
 		Locator.Report().click();
 		Thread.sleep(20000);
 		
 		Locator.Drop1().click();
 		Thread.sleep(9000);
 		
 //		Locator.ViewButtonDropReport().click();
 //		Thread.sleep(9000);
 	
 		
 		
 		if(Locator.ViewButtonDropReport().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.ViewButtonDropReport().click();
 			test.log(LogStatus.PASS, "View Button Working Properly " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " View Button Does Not Working Properly"  );
 			
 		}
    	 
    	 
 		Thread.sleep(4000);
    	 
    	 
    	
     }
	
	
     public static void downloadViewReportProject( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
     {
    	 
    	 
    	 Thread.sleep(4000);
 		Locator.Report().click();
 		Thread.sleep(20000);
 		
 		Locator.Reortviewdrop().click();
 		Thread.sleep(20000);
 	
 		Locator.ReortviewDownloadbutton().click();
	    Thread.sleep(25000);
 		
 		getDriver().switchTo().frame(Locator.frame());
	    Thread.sleep(5000);
	    
	    
	    
		Thread.sleep(4000);
 		/*
 		if(Locator.download().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.download().click();
 			test.log(LogStatus.PASS, "View and Download Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " View and Download Button Is Clickable"  );
 			
 		}
 		
 		
 		*/
		
	//	Locator.SelectAuditor().click();
		Thread.sleep(4000);
		WebElement element = Locator.download();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor) getDriver();
	      jse.executeScript("arguments[0].click();", element);
	      
		
	      Thread.sleep(20000);
    	 
    	 
    	 
    	
     }
	
	
	
	

 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
