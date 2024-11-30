package companyAdmin;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyAuditor.Locator2;
import companyContractor.Locator1;
import companyProjectHead.Locator3;
import login.BasePage;
import login.LoginPOM;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyAuditor.Locator2;
import companyContractor.Locator1;
import companyProjectHead.Locator3;
import login.BasePage;
import login.LoginPOM;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;




public class Method extends BasePage {

	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	private static int open;
	
	
	
	
	
	
	public static void LoginSuccessfully( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//*[@id='txtemail']")).sendKeys("management@tlregtech.in");
		Thread.sleep(1000);
		
		getDriver().findElement(By.xpath("//*[@id='txtpass']")).sendKeys("admin@123");
		Thread.sleep(1000);
		
	//	getDriver().findElement(By.xpath("//input[@name='Submit']")).click();
	//	Thread.sleep(3000);
		
		if(getDriver().findElement(By.xpath("//input[@name='Submit']")).isEnabled())
		{
			
			Thread.sleep(2000);
			getDriver().findElement(By.xpath("//input[@name='Submit']")).click();
			test.log(LogStatus.PASS, " OTP Page Displyed Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  OTP Page Does Not Displyed Successfully "  );
			
		}
		Thread.sleep(1000);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void Login( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//*[@id='txtemail']")).sendKeys("mayuri@vca.com");
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//*[@id='txtpass']")).sendKeys("admin@123");
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
		
		String t = getDriver().findElement(By.xpath("//*[@id='vsLogin']/ul/li")).getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "valid Username Invalid Password - " + t );
		
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//*[@id='txtemail']")).sendKeys("mayuri@vca.com");
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//*[@id='txtpass']")).sendKeys("admin@123");
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
		
		String t1 = getDriver().findElement(By.xpath("//*[@id='vsLogin']/ul/li")).getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Invalid Username valid Password - " + t1 );
		
		Thread.sleep(4000);
		
		getDriver().findElement(By.xpath("//*[@id='txtemail']")).sendKeys("mayuri@vca.com");
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//*[@id='txtpass']")).sendKeys("admin@123");
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
		
		String t3 = getDriver().findElement(By.xpath("//*[@id='vsLogin']/ul/li")).getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Invalid Username Invalid Password - " + t3 );
		Thread.sleep(3000);
		
		
		
	}
	
	
	public static void Login1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(3000);
		getDriver().findElement(By.id("lbtResetPassword")).click();
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//input[@id='txtResetPasswordUserID']")).sendKeys("vca_admin@tlregtech.com");
		Thread.sleep(3000);
		
		getDriver().findElement(By.id("btnProceed")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)getDriver() ;
	    
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(9000);
		
		String t = getDriver().findElement(By.xpath("//*[@id='vsLogin']/ul/li")).getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  t );
		
		
		
	}
	
	
	public static void Login2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(3000);
		getDriver().findElement(By.id("lbtUnlockAccount")).click();
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//input[@id='txtUnlockAccountUserID']")).sendKeys("vca_admin@tlregtech.com");
		Thread.sleep(3000);
		
		getDriver().findElement(By.id("btnProceed")).click();
		Thread.sleep(3000);
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(4000);
		ac.accept();
	    	
		
		
		
	}
	
	
	
	
	
	public static void Login3( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//input[@id='btnSSOLogin']")).click();
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//input[@id='txtemail']")).sendKeys("vca_admin@tlregtech.com");
		Thread.sleep(3000);
		
		getDriver().findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(3000);
		
		String t = getDriver().findElement(By.xpath("//*[@id='vsLogin']/ul/li")).getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  t );
		
		
	}
	
	
	
	public static void Login4( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(3000);
	//	getDriver().findElement(By.id("hlnkHelp")).click();
	//	Thread.sleep(3000);
		
		if(getDriver().findElement(By.id("hlnkHelp")).isEnabled())
		{
			
			Thread.sleep(2000);
			getDriver().findElement(By.id("hlnkHelp")).click();
			test.log(LogStatus.PASS, " Login Steps Displyed Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Login Steps Does Not Displyed Successfully "  );
			
		}
		
	}
	
	
	
	
	
	
	public static void Addentity2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

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
		
		
		
		
		
		
		
		
	/*	
		row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.CitySelect().click();
		Thread.sleep(4000);
		*/
		
		Locator.industry().click();
		Thread.sleep(3000);
		Locator.industryD().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
	
		Thread.sleep(5000);
		
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(4000);
		ac.accept();
	    	
		
		
	}
	
	public static void validationEntity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		// validation msg entity
		Locator.AddEntity1().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
		Thread.sleep(5000);
		
		 try {
	            // Wait for the alert to be present
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
	            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

	            // Once alert is present, handle it
	            System.out.println("Alert is present: " + alert.getText());
	            Alert ac=getDriver().switchTo().alert();
	    		
	    		String t1=getDriver().switchTo().alert().getText();
	    		
	    		test.log(LogStatus.PASS, t1 );
	    		
	    		Thread.sleep(4000);
	    		ac.accept(); // Accept the alert (click OK)
	        } catch (Exception e) {
	            System.out.println("Alert not found within the specified time.");
	        } finally {
	        	Locator.CloseEntityButton().click();
	    		Thread.sleep(3000);
	        }

		/*
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(4000);
		ac.accept();
		*/
	//	Locator.CloseEntityButton().click();
	//	Thread.sleep(4000);
		
	}
		
	
	public static void Validation1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		// validation message for name field
		
		Locator.AddEntity1().click();
		Thread.sleep(3000);
		
		
		
		
		Thread.sleep(3000);
		Locator.SubEntity().click();
		Thread.sleep(1000);
		Locator.SubEntityD().click();
		Thread.sleep(1000);
		Locator.EntityType().click();
		Thread.sleep(1000);
		Locator.EntityTypeD().click();
		Thread.sleep(1000);
		Locator.LegalRelationship().click();
		Thread.sleep(1000);
		Locator.LegalRelationshipD().click();
		Thread.sleep(1000);
		Locator.LegalEntity().click();
		Thread.sleep(1000);
		Locator.LegalEntityD().click();
		Thread.sleep(1000);
		Locator.State().click();
		Thread.sleep(1000);
		Locator.StateD().click();
		Thread.sleep(1000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		Locator.Status().click();
		Thread.sleep(3000);
		Locator.StatusD().click();
		Thread.sleep(1000);
		
		
		Locator.City().click();
		Thread.sleep(1000);
		
		
		Locator.CityDropDown().click();
		Thread.sleep(3000);
		
	/*	
		row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.CitySelect().click();
		Thread.sleep(4000);
		*/
		
		Locator.industry().click();
		Thread.sleep(2000);
		Locator.industryD().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
	
		Thread.sleep(5000);
		
		/*
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Name Field  = " + t1 );
		
		Thread.sleep(4000);
		ac.accept();
		
		Thread.sleep(4000);
		Locator.CloseEntityButton().click();
		Thread.sleep(4000);
		*/
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac=getDriver().switchTo().alert();
    		
    		String t1=getDriver().switchTo().alert().getText();
    		
    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Name Field  = " + t1 );
    		
    		Thread.sleep(4000);
    		ac.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            System.out.println("Alert not found within the specified time.");
        } finally {
        	Locator.CloseEntityButton().click();
    		Thread.sleep(3000);
        }
		
		//Validation message for subentity dropdown
		
		
		Locator.AddEntity1().click();
		Thread.sleep(3000);
		
		
						
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		
		
		Locator.EntityType().click();
		Thread.sleep(1000);
		Locator.EntityTypeD().click();
		Thread.sleep(1000);
		Locator.LegalRelationship().click();
		Thread.sleep(1000);
		Locator.LegalRelationshipD().click();
		Thread.sleep(1000);
		Locator.LegalEntity().click();
		Thread.sleep(1000);
		Locator.LegalEntityD().click();
		Thread.sleep(1000);
		Locator.State().click();
		Thread.sleep(1000);
		Locator.StateD().click();
		Thread.sleep(1000);
		
		
		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		Locator.Status().click();
		Thread.sleep(1000);
		Locator.StatusD().click();
		Thread.sleep(3000);
		
	/*	
		Locator.City().click();
		Thread.sleep(7000);
		
		
		Locator.CityDropDown().click();
		Thread.sleep(9000);
		
		
	*/	
		
		
		
		
		
	/*	
		row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.CitySelect().click();
		Thread.sleep(4000);
		*/
		
		Locator.industry().click();
		Thread.sleep(1000);
		Locator.industryD().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
	
		Thread.sleep(5000);
		
		/*
        Alert aca=getDriver().switchTo().alert();
		
		String ta=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For SubEntity Field  = " + ta );
		
		Thread.sleep(4000);
		aca.accept();
	    	
		Thread.sleep(4000);
		Locator.CloseEntityButton().click();
		Thread.sleep(4000);
		*/
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac=getDriver().switchTo().alert();
    		
    		String t1=getDriver().switchTo().alert().getText();
    		
    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Sub-Entity Field  = " + t1 );
    		
    		Thread.sleep(4000);
    		ac.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            System.out.println("Alert not found within the specified time.");
        } finally {
        	Locator.CloseEntityButton().click();
    		Thread.sleep(3000);
        }

		
		// entity validation message for EntityType field
			
		
		Locator.AddEntity1().click();
		Thread.sleep(3000);
		
		
						
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		
		
		Thread.sleep(3000);
		Locator.SubEntity().click();
		Thread.sleep(1000);
		Locator.SubEntityD().click();
		Thread.sleep(1000);
		
		Locator.LegalRelationship().click();
		Thread.sleep(1000);
		Locator.LegalRelationshipD().click();
		Thread.sleep(1000);
		Locator.LegalEntity().click();
		Thread.sleep(1000);
		Locator.LegalEntityD().click();
		Thread.sleep(1000);
		Locator.State().click();
		Thread.sleep(1000);
		Locator.StateD().click();
		Thread.sleep(1000);
		
		
		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		Locator.Status().click();
		Thread.sleep(3000);
		Locator.StatusD().click();
		Thread.sleep(1000);
		
	/*	
		Locator.City().click();
		Thread.sleep(4000);
		
		
		Locator.CityDropDown().click();
		Thread.sleep(9000);
		*/
		
		
		
		
		
		
		
	/*	
		row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.CitySelect().click();
		Thread.sleep(4000);
		*/
		
		Locator.industry().click();
		Thread.sleep(1000);
		Locator.industryD().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
	
		Thread.sleep(5000);
		
		/*
        Alert acb=getDriver().switchTo().alert();
		
		String tb=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Type Field  = " + tb );
		
		Thread.sleep(4000);
		acb.accept();
	   
		Thread.sleep(4000);
		Locator.CloseEntityButton().click();
		Thread.sleep(3000);
		*/
		
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac=getDriver().switchTo().alert();
    		
    		String t1=getDriver().switchTo().alert().getText();
    		
    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Type Field  = " + t1 );
    		
    		Thread.sleep(4000);
    		ac.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            System.out.println("Alert not found within the specified time.");
        } finally {
        	Locator.CloseEntityButton().click();
    		Thread.sleep(3000);
        }
		
		//entity validation for legal entity dropdown field
		
		Locator.AddEntity1().click();
		Thread.sleep(2000);
		
		
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		
		
		Thread.sleep(3000);
		Locator.SubEntity().click();
		Thread.sleep(1000);
		Locator.SubEntityD().click();
		Thread.sleep(1000);
		
		Locator.EntityType().click();
		Thread.sleep(1000);
		Locator.EntityTypeD().click();
		Thread.sleep(3000);
		
		Locator.LegalRelationship().click();
		Thread.sleep(1000);
		Locator.LegalRelationshipD().click();
		Thread.sleep(1000);
		
		Locator.State().click();
		Thread.sleep(1000);
		Locator.StateD().click();
		Thread.sleep(1000);
		
		
		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		Locator.Status().click();
		Thread.sleep(3000);
		Locator.StatusD().click();
		Thread.sleep(1000);
		
	/*	
		Locator.City().click();
		Thread.sleep(3000);
		
		
		Locator.City().click();
		Thread.sleep(3000);
		*/
		Locator.industry().click();
		Thread.sleep(1000);
		Locator.industryD().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
	
		Thread.sleep(5000);
		
		/*
        Alert ac4=getDriver().switchTo().alert();
		
		String t5=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Legal Entity Field  = " + t5 );
		
		Thread.sleep(4000);
		ac4.accept();
	    	
		
		Thread.sleep(2000);
		Locator.CloseEntityButton().click();
		Thread.sleep(2000);
		*/
		
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac=getDriver().switchTo().alert();
    		
    		String t1=getDriver().switchTo().alert().getText();
    		
    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Legal Entity Field  = " + t1 );
    		
    		Thread.sleep(4000);
    		ac.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            System.out.println("Alert not found within the specified time.");
        } finally {
        	Locator.CloseEntityButton().click();
    		Thread.sleep(3000);
        }
		
		
		// Entity Validation For State Field
		
		
		Locator.AddEntity1().click();
		Thread.sleep(3000);
		
		
						
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		Locator.SubEntity().click();
		Thread.sleep(1000);
		Locator.SubEntityD().click();
		Thread.sleep(1000);
		Locator.EntityType().click();
		Thread.sleep(1000);
		Locator.EntityTypeD().click();
		Thread.sleep(1000);
		Locator.LegalRelationship().click();
		Thread.sleep(1000);
		Locator.LegalRelationshipD().click();
		Thread.sleep(1000);
		Locator.LegalEntity().click();
		Thread.sleep(1000);
		Locator.LegalEntityD().click();
		Thread.sleep(1000);
		
		
		
		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);

		Locator.Status().click();
		Thread.sleep(1000);
		Locator.StatusD().click();
		Thread.sleep(3000);
		
		
		
		
		
	
		
		
		
		
		
	/*	
		row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.CitySelect().click();
		Thread.sleep(4000);
		*/
		
		Locator.industry().click();
		Thread.sleep(2000);
		Locator.industryD().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
	
		Thread.sleep(5000);
		
		/*
        Alert acd=getDriver().switchTo().alert();
		
		String td=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For State Field  = " + td );
		
		Thread.sleep(4000);
		acd.accept();
	   
		
		Thread.sleep(4000);
		Locator.CloseEntityButton().click();
		Thread.sleep(4000);
		*/
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac=getDriver().switchTo().alert();
    		
    		String t1=getDriver().switchTo().alert().getText();
    		
    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For State Field  = " + t1 );
    		
    		Thread.sleep(4000);
    		ac.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            System.out.println("Alert not found within the specified time.");
        } finally {
        	Locator.CloseEntityButton().click();
    		Thread.sleep(3000);
        }
		
		// Entity Validation For Adress Field
		
		
		
		
				Locator.AddEntity1().click();
				Thread.sleep(2000);
				
				row0 = sheet.getRow(3);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
			
				
				
				
				Thread.sleep(1000);
				Locator.SubEntity().click();
				Thread.sleep(1000);
				Locator.SubEntityD().click();
				Thread.sleep(1000);
				Locator.EntityType().click();
				Thread.sleep(1000);
				Locator.EntityTypeD().click();
				Thread.sleep(1000);
				Locator.LegalRelationship().click();
				Thread.sleep(1000);
				Locator.LegalRelationshipD().click();
				Thread.sleep(1000);
				Locator.LegalEntity().click();
				Thread.sleep(1000);
				Locator.LegalEntityD().click();
				Thread.sleep(1000);
				Locator.State().click();
				Thread.sleep(1000);
				Locator.StateD().click();
				Thread.sleep(1000);
				
						
				
				row0 = sheet.getRow(6);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);

				row0 = sheet.getRow(7);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);

				Locator.Status().click();
				Thread.sleep(1000);
				Locator.StatusD().click();
				Thread.sleep(1000);
				
				
				
				
				Locator.industry().click();
				Thread.sleep(2000);
				Locator.industryD().click();
				Thread.sleep(3000);
				Locator.SubmitButton().click();
			
				Thread.sleep(5000);
				
				/*
		        Alert ac8=getDriver().switchTo().alert();
				
				String t9=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Without Enter Data Validation Message For Adress Field  = " + t9 );
				
				Thread.sleep(4000);
				ac8.accept();
				
				Thread.sleep(2000);
				Locator.CloseEntityButton().click();
				Thread.sleep(4000);
				*/
				try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac=getDriver().switchTo().alert();
		    		
		    		String t1=getDriver().switchTo().alert().getText();
		    		
		    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Adress Field  = " + t1 );
		    		
		    		Thread.sleep(4000);
		    		ac.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		        } finally {
		        	Locator.CloseEntityButton().click();
		    		Thread.sleep(3000);
		        }
				
				
			// Entity Validation For Contact Person TextBox	
				
				Locator.AddEntity1().click();
				Thread.sleep(3000);
				
				
								
				row0 = sheet.getRow(3);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(2000);
				
				
				
				Thread.sleep(3000);
				Locator.SubEntity().click();
				Thread.sleep(1000);
				Locator.SubEntityD().click();
				Thread.sleep(1000);
				Locator.EntityType().click();
				Thread.sleep(1000);
				Locator.EntityTypeD().click();
				Thread.sleep(1000);
				Locator.LegalRelationship().click();
				Thread.sleep(1000);
				Locator.LegalRelationshipD().click();
				Thread.sleep(1000);
				Locator.LegalEntity().click();
				Thread.sleep(1000);
				Locator.LegalEntityD().click();
				Thread.sleep(1000);
				Locator.State().click();
				Thread.sleep(1000);
				Locator.StateD().click();
				Thread.sleep(1000);
				
				
				row0 = sheet.getRow(5);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);
				
				
				

				row0 = sheet.getRow(7);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);

				Locator.Status().click();
				Thread.sleep(1000);
				Locator.StatusD().click();
				Thread.sleep(1000);
				
			/*	
				Locator.City().click();
				Thread.sleep(4000);
				
				
				Locator.CityDropDown().click();
				Thread.sleep(9000);
				
				
				
				*/
				
				
				
				
			/*	
				row0 = sheet.getRow(4);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(4000);
				
				Locator.CitySelect().click();
				Thread.sleep(4000);
				*/
				
				Locator.industry().click();
				Thread.sleep(1000);
				Locator.industryD().click();
				Thread.sleep(3000);
				Locator.SubmitButton().click();
			
				Thread.sleep(5000);
				
				/*
		        Alert acf=getDriver().switchTo().alert();
				
				String tf=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Without Enter Data Validation Message For Contact Person Field  = " + tf );
				
				Thread.sleep(4000);
				acf.accept();
			   
				
				Thread.sleep(4000);
				Locator.CloseEntityButton().click();
				Thread.sleep(3000);
				*/
				try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac=getDriver().switchTo().alert();
		    		
		    		String t1=getDriver().switchTo().alert().getText();
		    		
		    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Contact Person Field  = " + t1 );
		    		
		    		Thread.sleep(4000);
		    		ac.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		        } finally {
		        	Locator.CloseEntityButton().click();
		    		Thread.sleep(3000);
		        }
				
				
				
				// Entity Validation For Email Text Field
				
				Locator.AddEntity1().click();
				Thread.sleep(2000);
				
				row0 = sheet.getRow(3);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);
				
			
				Locator.SubEntity().click();
				Thread.sleep(1000);
				Locator.SubEntityD().click();
				Thread.sleep(1000);
				Locator.EntityType().click();
				Thread.sleep(1000);
				Locator.EntityTypeD().click();
				Thread.sleep(1000);
				Locator.LegalRelationship().click();
				Thread.sleep(1000);
				Locator.LegalRelationshipD().click();
				Thread.sleep(1000);
				Locator.LegalEntity().click();
				Thread.sleep(1000);
				Locator.LegalEntityD().click();
				Thread.sleep(1000);
				Locator.State().click();
				Thread.sleep(1000);
				Locator.StateD().click();
				Thread.sleep(1000);
				
				
				row0 = sheet.getRow(5);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);
				
				
				row0 = sheet.getRow(6);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);

				

				Locator.Status().click();
				Thread.sleep(1000);
				Locator.StatusD().click();
				Thread.sleep(1000);
			/*	
				
				Locator.City().click();
				Thread.sleep(3000);
				Locator.City().click();
				Thread.sleep(3000);
				*/
				Locator.industry().click();
				Thread.sleep(1000);
				Locator.industryD().click();
				Thread.sleep(3000);
				Locator.SubmitButton().click();
			
				Thread.sleep(5000);
				
				/*
		        Alert ach=getDriver().switchTo().alert();
				
				String th=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Without Enter Data Validation Message For Email Field  = " + th );
				
				Thread.sleep(4000);
				ach.accept();
				
				
				Thread.sleep(2000);
				Locator.CloseEntityButton().click();
				Thread.sleep(2000);
				*/
				try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac=getDriver().switchTo().alert();
		    		
		    		String t1=getDriver().switchTo().alert().getText();
		    		
		    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Email Field  = " + t1 );
		    		
		    		Thread.sleep(4000);
		    		ac.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		        } finally {
		        	Locator.CloseEntityButton().click();
		    		Thread.sleep(3000);
		        }
				
				
				// Entity Validation For Status DropDown
				
				Locator.AddEntity1().click();
				Thread.sleep(2000);

				row0 = sheet.getRow(3);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);
				
				Locator.SubEntity().click();
				Thread.sleep(1000);
				Locator.SubEntityD().click();
				Thread.sleep(1000);
				Locator.EntityType().click();
				Thread.sleep(1000);
				Locator.EntityTypeD().click();
				Thread.sleep(1000);
				Locator.LegalRelationship().click();
				Thread.sleep(1000);
				Locator.LegalRelationshipD().click();
				Thread.sleep(1000);
				Locator.LegalEntity().click();
				Thread.sleep(1000);
				Locator.LegalEntityD().click();
				Thread.sleep(1000);
				Locator.State().click();
				Thread.sleep(1000);
				Locator.StateD().click();
				Thread.sleep(1000);
				
				
				row0 = sheet.getRow(5);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);
				
				
				row0 = sheet.getRow(6);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);

				row0 = sheet.getRow(7);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);

			/*	
				
				Locator.City().click();
				Thread.sleep(3000);
				Locator.CityDropDown().click();
				Thread.sleep(3000);
				*/
				Locator.industry().click();
				Thread.sleep(2000);
				Locator.industryD().click();
				Thread.sleep(3000);
				Locator.SubmitButton().click();
			
				Thread.sleep(5000);
				
				/*
		        Alert aci=getDriver().switchTo().alert();
				
				String ti=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Without Enter Data Validation Message For Status Field  = " + ti );
				
				Thread.sleep(4000);
				aci.accept();
			    	
				
				
				Thread.sleep(2000);
				Locator.CloseEntityButton().click();
				Thread.sleep(4000);
				*/
				try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac=getDriver().switchTo().alert();
		    		
		    		String t1=getDriver().switchTo().alert().getText();
		    		
		    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Status Field  = " + t1 );
		    		
		    		Thread.sleep(4000);
		    		ac.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		        } finally {
		        	Locator.CloseEntityButton().click();
		    		Thread.sleep(3000);
		        }
				
				
				// Entity Validation For Industry Field
				
				Locator.AddEntity1().click();
				Thread.sleep(1000);
				
				
								
				row0 = sheet.getRow(3);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.EntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(2000);
				
				
				
				Thread.sleep(1000);
				Locator.SubEntity().click();
				Thread.sleep(1000);
				Locator.SubEntityD().click();
				Thread.sleep(1000);
				Locator.EntityType().click();
				Thread.sleep(1000);
				Locator.EntityTypeD().click();
				Thread.sleep(1000);
				Locator.LegalRelationship().click();
				Thread.sleep(1000);
				Locator.LegalRelationshipD().click();
				Thread.sleep(1000);
				Locator.LegalEntity().click();
				Thread.sleep(1000);
				Locator.LegalEntityD().click();
				Thread.sleep(1000);
				Locator.State().click();
				Thread.sleep(1000);
				Locator.StateD().click();
				Thread.sleep(1000);
				
				
				row0 = sheet.getRow(5);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);
				
				
				row0 = sheet.getRow(6);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);

				row0 = sheet.getRow(7);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(1000);

				Locator.Status().click();
				Thread.sleep(1000);
				Locator.StatusD().click();
				Thread.sleep(1000);
			/*	
				
				Locator.City().click();
				Thread.sleep(4000);
				
				
				Locator.CityDropDown().click();
				Thread.sleep(9000);
				
				
				*/
				
				
				
				
				
			/*	
				row0 = sheet.getRow(4);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(4000);
				
				Locator.CitySelect().click();
				Thread.sleep(4000);
				*/
				
				
				Thread.sleep(3000);
				Locator.SubmitButton().click();
			
				Thread.sleep(5000);
				
				/*
		        Alert acj=getDriver().switchTo().alert();
				
				String tj=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Without Enter Data Validation Message For Industry Field  = " + tj );
				
				Thread.sleep(4000);
				acj.accept();
			   
				Thread.sleep(4000);
				Locator.CloseEntityButton().click();
				Thread.sleep(4000);
				*/
				try {
		            // Wait for the alert to be present
		            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
		            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

		            // Once alert is present, handle it
		            System.out.println("Alert is present: " + alert.getText());
		            Alert ac=getDriver().switchTo().alert();
		    		
		    		String t1=getDriver().switchTo().alert().getText();
		    		
		    		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Industry Field  = " + t1 );
		    		
		    		Thread.sleep(4000);
		    		ac.accept(); // Accept the alert (click OK)
		        } catch (Exception e) {
		            System.out.println("Alert not found within the specified time.");
		        } finally {
		        	Locator.CloseEntityButton().click();
		    		Thread.sleep(3000);
		        }
					
		
		
	}	
		
		public static void Validation2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
		
		
		
		
				
		
		// Entity Validation For City DropDown 
		
				Locator.AddEntity1().click();
				Thread.sleep(3000);
				
				
								
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
				Thread.sleep(7000);
				
				Locator.CitySelect1().click();
				Thread.sleep(7000);
				
				Locator.City().click();
				Thread.sleep(7000);
				
				Locator.ValidationSelectCity().click();
				Thread.sleep(9000);
				
				
				
				
				
				
			/*	
				row0 = sheet.getRow(4);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(4000);
				
				Locator.CitySelect().click();
				Thread.sleep(4000);
				*/
				
				Locator.industry().click();
				Thread.sleep(3000);
				Locator.industryD().click();
				Thread.sleep(3000);
				Locator.SubmitButton().click();
			
				Thread.sleep(5000);
				
				
		        Alert ace=getDriver().switchTo().alert();
				
				String te=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Without Enter Any Data Validation Message For City Field  = " + te );
				
				Thread.sleep(4000);
				ace.accept();
			   
				
				Thread.sleep(4000);
				Locator.CloseEntityButton().click();
				Thread.sleep(4000);
				
		
		
		
	}
	
	
	
	
	public static void AddSubEntity2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

	
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
	
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
		
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
				
		
	}
	
	
	public static void UpdateSubEntity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
	

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
		 
		 Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
        Thread.sleep(5000);
		
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
				
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	public static void ClearEntityButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable "  );
			
		}
		
		Locator.EntityClear().click();
		Thread.sleep(2000);
		
	//	String msg = Locator.EntityClear().getText();
	//	Thread.sleep(2000);
		
	//	String msg = Locator.EntityClear().getText();
		
	/*	if(msg.equalsIgnoreCase("Search Entity Clear Succesfully"))
		{
		
			test.log(LogStatus.PASS, " Clear Succesfully= " + msg );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Succesfully= " + msg );
			
		}
		
		*/
		
		
		
	
	}
	
	public static void DeleteE( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		
	Locator.DeleteEntity().click();
	Thread.sleep(3000);
	Locator.Confirm().click();
	Thread.sleep(5000);
	
	Alert ac=getDriver().switchTo().alert();
	
	String t1=getDriver().switchTo().alert().getText();
	
	test.log(LogStatus.PASS,  t1 );
	
	Thread.sleep(4000);
	ac.accept();
	
	
	
	
	
	
	
	
	}
	
	
	public static void UpdateEntity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
				
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
		Thread.sleep(4000);
		
		
		Locator.CityDropDown().click();
		Thread.sleep(9000);
		
		Locator.industry().click();
		Thread.sleep(3000);
		Locator.industryD().click();
		Thread.sleep(3000);
		//Locator.SubmitButton().click();
	
		Thread.sleep(3000);
		Locator.industryD().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
	
		Thread.sleep(20000);
		
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
		
		
		
	}
	
	public static void UploadEntity1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
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
	Thread.sleep(5000);
	
	 Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
	
		Thread.sleep(4000);
		
		
		
	}
	
	
	public static void UploadEntityBlankSheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Locator.UploadEntity().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(15);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		
		Locator.UploadButton().click();
		Thread.sleep(5000);
		
        Alert ac1=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t2 );
		
		Thread.sleep(4000);
		ac1.accept();
		
		Thread.sleep(3000);
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void DeleteSubEntity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
	
	Locator.ViewBranches().click();
	Thread.sleep(5000);

	Locator.DeleteSubEntity().click();
	Thread.sleep(3000);
	
	Locator.ConfirmSubEntityDelete().click();
	Thread.sleep(3000);
	
	Alert ac=getDriver().switchTo().alert();
	
	String t1=getDriver().switchTo().alert().getText();
	
	test.log(LogStatus.PASS,  t1 );
	
	Thread.sleep(3000);
	ac.accept();
	Thread.sleep(3000);
	
	
	}
	
	 
	public static void AddUser( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
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
		Thread.sleep(20000);
		
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(2000);
			ac1.accept();
			Thread.sleep(2000);
			
		
		Locator.CloseUserPage().click();
		Thread.sleep(2000);
		
	}
	
	
	public static void UpdateUser( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	//Locator.MasterButton().click();
	Thread.sleep(3000);
	Locator.UserButton().click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	
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
	Thread.sleep(20000);
	
	 Alert ac1=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t2 );
		
		Thread.sleep(2000);
		ac1.accept();
		
		Thread.sleep(2000);
	
	Locator.CloseUserPage().click();
	
	Thread.sleep(3000);
	
	
	
	
	
	
	
	}
	
	public static void UserReset4( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.UserButton().click();
		Thread.sleep(3000);
		
		
		
		Locator.UserResetPass5().click();
		Thread.sleep(3000);
		
        Alert ac1=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t2 );
		
		Thread.sleep(3000);
		ac1.accept();
		
		Thread.sleep(9000);
		
		
        Alert ac2=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t3 );
		
		Thread.sleep(2000);
		ac2.accept();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	public static void ValidationUser( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	/*	
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(3000);
		Locator.AddUser().click();
		Thread.sleep(3000);
		Locator.UserSubmitButton().click();
		
        Thread.sleep(3000);
		
        Alert ac2=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, " User Validation Message Verification Succesfully = " + t3 );
		
		Thread.sleep(2000);
		ac2.accept();
		
		Thread.sleep(2000);
		
		Locator.CloseUserPage().click();
		
		*/
		// validatin for name
		
		Thread.sleep(3000);
		
	//	//Locator.MasterButton().click();
	//	Thread.sleep(3000);
		
	//	Actions action = new Actions(getDriver());
	//	action.moveToElement(Locator.UserButton()).click().build().perform();	 //Clicking on Back button
		Thread.sleep(2000);
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
		Thread.sleep(4000);
		
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "User validation message for First Name Field = " + t2 );
			
			Thread.sleep(2000);
			ac1.accept();
			Thread.sleep(2000);
			
		
	//	Locator.CloseUserPage().click();
	//	Thread.sleep(2000);
		
		// last name
		
		//Locator.MasterButton().click();
	//	Thread.sleep(3000);
		
	//	Thread.sleep(3000);
	//	Locator.UserButton().click();
		
		Thread.sleep(3000);
	//	Locator.AddUser().click();
	//	Thread.sleep(3000);
		
		
		
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserFirstName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.AddUserLastName().clear();
		Thread.sleep(2000);
		/*
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
		*/
		Locator.UserSubmitButton().click();
		Thread.sleep(4000);
		
		 Alert ac11=getDriver().switchTo().alert();
			
			String t21=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " User Validation for Last Name Field  = " + t21 );
			
			Thread.sleep(2000);
			ac11.accept();
			Thread.sleep(2000);
			
		
	//	Locator.CloseUserPage().click();
	//	Thread.sleep(2000);
		
		// for email
		
		//Locator.MasterButton().click();
	//	Thread.sleep(3000);
		
	//	Thread.sleep(3000);
	//	Locator.UserButton().click();
		
	//	Thread.sleep(3000);
	//	Locator.AddUser().click();
		Thread.sleep(3000);
		
		
		/*
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserFirstName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		*/
		row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserLastName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		Locator.AddUserEmail().clear();
		Thread.sleep(2000);
		/*
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
		*/
		Locator.UserSubmitButton().click();
		Thread.sleep(4000);
		
		 Alert ac12=getDriver().switchTo().alert();
			
			String t22=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " User Validation message for Email Field   = " + t22 );
			
			Thread.sleep(2000);
			ac12.accept();
			Thread.sleep(2000);
			
		
	//	Locator.CloseUserPage().click();
	//	Thread.sleep(2000);
		
		// user contact
		
		//Locator.MasterButton().click();
	//	Thread.sleep(3000);
		
	//	Thread.sleep(3000);
	//	Locator.UserButton().click();
		/*
		Thread.sleep(3000);
		Locator.AddUser().click();
		Thread.sleep(3000);
		
		
		
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserFirstName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserLastName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		*/
		row0 = sheet.getRow(18);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.AddUserContact().clear();
		Thread.sleep(2000);
		/*
		
		
		
		Locator.AddUserRole().click();
		Thread.sleep(4000);
		
		row0 = sheet.getRow(20);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserRoleText().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		Thread.sleep(4000);
		Locator.AddUserSelectRole().click();
		Thread.sleep(4000);
		*/
		Locator.UserSubmitButton().click();
		Thread.sleep(4000);
		
		 Alert ac13=getDriver().switchTo().alert();
			
			String t23=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " User validation message for User contact Field = " + t23 );
			
			Thread.sleep(2000);
			ac13.accept();
			Thread.sleep(2000);
			
		
		Locator.CloseUserPage().click();
		Thread.sleep(2000);
		
		// user role
		
		//Locator.MasterButton().click();
	//	Thread.sleep(3000);
		
	//	Thread.sleep(3000);
	//	Locator.UserButton().click();
		
		Thread.sleep(3000);
		Locator.AddUser().click();
		Thread.sleep(3000);
		
		
		
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
		
		
		Thread.sleep(4000);
		Locator.UserSubmitButton().click();
		Thread.sleep(4000);
		/*
		 Alert ac14=getDriver().switchTo().alert();
			
			String t24=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " User validation message for Role Field = " + t24 );
			
			Thread.sleep(2000);
			ac14.accept();
			Thread.sleep(2000);
			*/
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 80); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert a=getDriver().switchTo().alert();
    		
    		String t=getDriver().switchTo().alert().getText();
			test.log(LogStatus.PASS, " User validation message for Role Field = " + t);

    		Thread.sleep(5000);
            a.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            System.out.println("Alert not found within the specified time.");
        } finally {
        	Locator.CloseUserPage().click();
    		Thread.sleep(2000);
        }
		
	//	Locator.CloseUserPage().click();
	//	Thread.sleep(2000);
		
		
		
	}
	
	
	public static void ValidationUserRole( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.UserButton().click();
		Thread.sleep(3000);
		Locator.AddUser().click();
		Thread.sleep(3000);
		Locator.AddUserRole().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(20);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddUserRoleText().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.AddUserSelectRole().click();
		Thread.sleep(3000);
		Locator.UserSubmitButton().click();
		Thread.sleep(3000);
		
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(2000);
			ac1.accept();
			
			Thread.sleep(2000);
		Locator.CloseUserPage().click();
		Thread.sleep(3000);
		
		
		
		
	}
	
	 public static void UserDelete1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	 {
		 //Locator.MasterButton().click();
		 Thread.sleep(3000);
		 Locator.UserButton().click();
		 Thread.sleep(3000);
		
			
			
			Locator.DeleteUser().click();
			
			Thread.sleep(3000);
			
			 Alert ac1=getDriver().switchTo().alert();
				
				String t2=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t2 );
				
				Thread.sleep(2000);
				ac1.accept();
				
				Thread.sleep(3000);
		 
              Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t3 );
				
				Thread.sleep(2000);
				ac2.accept();
				
				Thread.sleep(3000);
		 
		 
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
		Thread.sleep(20000);
		
		 Alert ac=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,t1 );
			
			Thread.sleep(4000);
			ac.accept();
		
			Thread.sleep(4000);
	 	
			
			
		
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
		
		row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.AddContractorTypeuser().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SubmitContractor().click();
		
		
		Thread.sleep(5000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(3000);
	 
		
		
		
		
			
		
	}
	
	
	public static void UpdateContractor( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(1000);
		
		Locator.UserButton().click();
		Thread.sleep(1000);
		
		Locator.ViewContractor().click();
		Thread.sleep(1000);
		
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
		
		
		Locator.AddContractorSPOCName().clear();
		Thread.sleep(1000);
		
		row0 = sheet.getRow(94);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCName().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		Locator.AddContractorSPOCMail().clear();
		Thread.sleep(1000);
		
		row0 = sheet.getRow(95);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
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
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(3000);
	 
		
		
			
		
		
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
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
		
			
			Thread.sleep(5000);
			 Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t3 );
				
				Thread.sleep(4000);
				ac2.accept();
		
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
		Locator.LocationMAssignDrop().click();
		Thread.sleep(3000);
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
		
		Thread.sleep(20000);
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
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
		
		
		
		Thread.sleep(20000);
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
		
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
		Thread.sleep(24000);
		Locator.LocationPDrop().click();
		Thread.sleep(4000);
		Locator.LocationPDropDown().click();
		Thread.sleep(6000);
		Locator.Head().click();
		Thread.sleep(15000);
		Locator.HeadD().click();
		Thread.sleep(6000);
		Locator.Director().click();
		Thread.sleep(15000);
		Locator.DirectorD().click();
		Thread.sleep(5000);
		Locator.SubmitProject().click();
		
		
		Thread.sleep(5000);
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
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
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(30000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(3000);
			
		
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
		Thread.sleep(24000);
		Locator.LocationPDrop().click();
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
		Thread.sleep(10000);
		
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		

		
		
		
		
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
		Thread.sleep(33000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
			
			
			
			
            
           
		
	}
	
	
	
	public static void UploadProjectBlankSheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	//	//Locator.MasterButton().click();
	//	Thread.sleep(4000);
		
		Locator.ProjectButton().click();
		Thread.sleep(4000);
		
		Locator.ProjectUpload().click();
		Thread.sleep(4000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		
		row0 = sheet.getRow(42);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputProject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.ProjectUploadButton().click();
		
		Thread.sleep(10000);
		 Alert ac4=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t4 );
			
			Thread.sleep(4000);
			ac4.accept();
		
			Thread.sleep(4000);
		
	}
	
	
	public static void UploadUserWithoutEnterData( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		////Locator.MasterButton().click();
		//Thread.sleep(3000);
		////Locator.MasterButton().click();
	//	Thread.sleep(3000);
	//	//Locator.MasterButton().click();
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
		
		row0 = sheet.getRow(39);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(5000);
		
		 Alert ac=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t1 );
			
			Thread.sleep(4000);
			ac.accept();
		
			Thread.sleep(4000);
	 
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable "  );
			
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
		
		 Alert ac=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t1 );
			
			Thread.sleep(4000);
			ac.accept();
		
			Thread.sleep(4000);
	 
		
	
		
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
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
	 
		
		
		
		
		
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
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
	 
		
		
		
		
		
		
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
		
		Thread.sleep(23000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
	 
		    	
		
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
		
		
		
		Thread.sleep(20000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
			
						

			
		
			
	}
	
	
	public static void uploadContractorBlanksheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
	
		row0 = sheet.getRow(57);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
	
		Locator.UploadSubmitCT().click();
		Thread.sleep(3000);
		
		/*
		Thread.sleep(23000);
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(5000);
			ac2.accept();
			
			Thread.sleep(6000);
*/
		try {
            // Wait for the alert to be present
            WebDriverWait wait1 = new WebDriverWait(getDriver(), 120); // 10 seconds timeout
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

            // Once alert is present, handle it
            System.out.println("Alert is present: " + alert.getText());
            Alert ac=getDriver().switchTo().alert();
    		
    		String t1=getDriver().switchTo().alert().getText();
    		
    		test.log(LogStatus.PASS, t1 );
    		
    		Thread.sleep(4000);
    		ac.accept(); // Accept the alert (click OK)
        } catch (Exception e) {
            System.out.println("Alert not found within the specified time.");
        } 
		
		
		
	}
	
	
	
	
	
	
	public static void UploadContractorProjectMapping( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
			row0 = sheet.getRow(59);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.UploadContractorProjectMappingFileCT().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.UploadContractorProjectMappingUploadBCT().click();
			
			Thread.sleep(7000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t4 );
				
				Thread.sleep(5000);
				ac3.accept();
				
				Thread.sleep(6000);
			
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
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.FAIL,  t4 );
				
				Thread.sleep(5000);
				ac3.accept();
		
		
	}
	
	
	
	
	
	
	
	public static void AddLicenceCT( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
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
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(40000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(3000);
		
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
		
		row0 = sheet.getRow(35);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ValidityDateL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
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
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(31000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(3000);
	

	}
	
	
	public static void AddActAndComplience( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		Locator.AddActAndCompliance().click();
		Thread.sleep(3000);
		Locator.ActAndComplienceCentral().click();
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
		
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
		
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is clickable "  );
			
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
		
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(9000);
			ac2.accept();
		
			Thread.sleep(9000);
		
		
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
		Thread.sleep(20000);
		
		
		Alert ac3=getDriver().switchTo().alert();
		
		String t4=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t4 );
		
		Thread.sleep(5000);
		ac3.accept();
	
		Thread.sleep(4000);
			
		
	
		
	}
	
	public static void UploadActWithsameAct( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(3000);
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(7000);
		
		Locator.UploadActAndCompliance().click();
	       Thread.sleep(4000);
			
	       sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(87);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.SelectFileActAndCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.UploadButtonAC().click();
			Thread.sleep(24000);
			
			
			Alert ac4=getDriver().switchTo().alert();
			
			String t5=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t5 );
			
			Thread.sleep(5000);
			ac4.accept();
		
			Thread.sleep(4000);		
	}
	
	
	
	public static void UploadeActBlankSheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(66);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SelectFileActAndCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonAC().click();
		Thread.sleep(9000);
		
		
		Alert ac3=getDriver().switchTo().alert();
		
		String t4=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t4 );
		
		Thread.sleep(5000);
		ac3.accept();
	
		Thread.sleep(4000);
		
		
		
	}
	
	
	public static void AddActWithState( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		Locator.AddActAndCompliance().click();
		Thread.sleep(3000);
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		Locator.AddActSelectStateAC().click();
		Thread.sleep(5000);
		
		Locator.ChhoseStateAC().click();
		Thread.sleep(7000);
		
		Locator.ChhoseStateACDD().click();
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
		Thread.sleep(3000);
		Locator.CatogaryAC().click();
		Thread.sleep(3000);
		Locator.CatogaryACDD().click();
		Thread.sleep(3000);
		Locator.ButtonSaveAct().click();
		
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
	}
	
	
	public static void AddActWithDifferentState( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		Locator.AddActAndCompliance().click();
		Thread.sleep(3000);
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		Locator.AddActSelectStateAC().click();
		Thread.sleep(5000);
		
		Locator.ChhoseStateAC().click();
		Thread.sleep(3000);
		
		Locator.ChhosediffStateACDD().click();
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
		Thread.sleep(3000);
		Locator.CatogaryAC().click();
		Thread.sleep(3000);
		Locator.CatogaryACDD().click();
		Thread.sleep(3000);
		Locator.ButtonSaveAct().click();
		
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
	}
	
	
	
	public static void AddActDuplicate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
			
			//Locator.MasterButton().click();
			Thread.sleep(3000);
			
			Locator.ActAndComplianceMaster().click();
			Thread.sleep(6000);
			Locator.AddActAndCompliance().click();
			Thread.sleep(3000);
			Locator.ActAndComplienceCentral().click();
			Thread.sleep(4000);
			Locator.ActAndComplienceCentralDropDown().click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(67);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.ActNameAC().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.ContractorTypeAC().click();
			Thread.sleep(3000);
			Locator.ContractorTypeDDAC().click();
			Thread.sleep(3000);
			Locator.CatogaryAC().click();
			Thread.sleep(3000);
			Locator.CatogaryACDD().click();
			Thread.sleep(3000);
			Locator.ButtonSaveAct().click();
			
			Thread.sleep(8000);
			
			 Alert ac2=getDriver().switchTo().alert();
				
				String t3=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t3 );
				
				Thread.sleep(20000);
				ac2.accept();
			
				Thread.sleep(4000);
			
		
	}
	
	
	
	public static void AddActDuplicateForCentral( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		Locator.AddActAndCompliance().click();
		Thread.sleep(3000);
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		Locator.ActAndComplienceCentralDropDown().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(67);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ActNameAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.ContractorTypeAC().click();
		Thread.sleep(3000);
		Locator.ContractorTypeDDAC().click();
		Thread.sleep(3000);
		Locator.CatogaryAC().click();
		Thread.sleep(3000);
		Locator.CatogaryACDD().click();
		Thread.sleep(3000);
		Locator.ButtonSaveAct().click();
		
		Thread.sleep(8000);
		
		
	  
	 	/*
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		*/
		
		
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
		
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		
		Locator.ActAndComplienceCentralDropDown().click();
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
		
		
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
		
	}
	
	public static void AddComplianceForState( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		
		Locator.AddActSelectStateAC().click();
		Thread.sleep(5000);
		
		Locator.ChhoseStateAC().click();
		Thread.sleep(7000);
		
		Locator.SelectStateComplianceDD().click();
		Thread.sleep(3000);
		
		
		Locator.SelectActCom().click();
		Thread.sleep(3000);
		
		Locator.SelectActComplianceDD().click();
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
		
		
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
		
		
	}
	
	
	public static void AddComplianceForDiffeState( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		
		Locator.AddActSelectStateAC().click();
		Thread.sleep(5000);
		
		Locator.ChhoseStateAC().click();
		Thread.sleep(7000);
		
		Locator.SelectDiffStateComplianceDD().click();
		Thread.sleep(3000);
		
		
		Locator.SelectActCom().click();
		Thread.sleep(3000);
		
		Locator.SelectActAndhraComplianceDD().click();
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
		
		
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
	}
	
	
	public static void AddDuplicateComplianceCentral( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		
		Locator.ActAndComplienceCentralDropDown().click();
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
		
		
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		

		
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
		
		
		Thread.sleep(8000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);	
		
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
        Thread.sleep(25000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
        
		
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
				test.log(LogStatus.PASS, " Clear Button Is Clickable " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Clear Button Is Clickable"  );
				
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
		Thread.sleep(3000);
		
		
		
		Locator.ButtonComplianceUploadAC().click();
		
		
		Thread.sleep(39000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
	}
	
	
	public static void UploadBlankSheetComplianceAC( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(71);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUploadCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		
		Locator.ButtonComplianceUploadAC().click();
		
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
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
	      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
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
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("arguments[0].click;",element);
        Thread.sleep(5000);
	//	js.exicuteScript("arguments[0].click;",element);
		*/
		Locator.TemplateSaveButtonAC().click();
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
		
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
			test.log(LogStatus.PASS, "Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable "  );
			
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
        Thread.sleep(39000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
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
		
		Thread.sleep(39000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
	}
	
	
	public static void UploadBlankSheetTemplateAC( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(74);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileTemplateAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonTemplateAC().click();
		
		Thread.sleep(39000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
	}
	
	
	public static void DuplicateTemplateAC( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		WebElement element = Locator.TemplateCheckBoxAC();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
	      jse.executeScript("arguments[0].click();", element);
	      boolean b = element.isSelected();
	      if (b) {
	         System.out.println("Checkbox is not checked");
	      }else {
	         System.out.println("Checkbox is checked");
	      }
		
	      Thread.sleep(20000);
		
		
		Locator.TemplateSaveButtonAC().click();
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
		
		
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
			
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t4 );
				
				Thread.sleep(20000);
				ac3.accept();
			
		
			
		
		
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
			test.log(LogStatus.PASS, "  Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable "  );
			
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
	}
	
	
	public static void DeleteCity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.CityMasterButton().click();
		Thread.sleep(3000);
		
		Locator.DeletetCityMaster().click();
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable "  );
			
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
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
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
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable "  );
			
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
	}
	
	
	
	
	
	public static void DeleteDataPoint( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.DataPointMaster().click();
		Thread.sleep(3000);
		
		Locator.DeleteDataPoint().click();
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
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
			test.log(LogStatus.PASS, " Clear Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable "  );
			
		}
		
		
	}
	
	// Add Compliance Mapping
	
	
	public static void AddNewCompliance( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
		
		Locator.CheckBox().click();
		Thread.sleep(3000);
		
		Locator.NextButton().click();
		Thread.sleep(7000);
			
        Locator.SelectComplianceCheckBox1().click();
        Thread.sleep(3000);
        
		Locator.SelectComplianceCheckBox2().click();
		Thread.sleep(7000);
		
		Locator.SaveMappingButton().click();
		Thread.sleep(3000);
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
	}
	
	
	
	public static void UpdateCompliencesFTab( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(6000);
		
		Locator.UpdateComplienceCM().click();
		Thread.sleep(5000);
		
		Locator.TemplateDropCM().click();
		Thread.sleep(3000);
		
		
		
		
	//	Locator.UpdateComplienceTempCheckBoxDrop().click();
	//	Thread.sleep(3000);
		
		Locator.RemoveCM().click();
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
	}
	
	
	
	public static void ExportReportDownloadCM( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
		Locator.UpdateComplienceCM().click();
		Thread.sleep(5000);
		
		Locator.TemplateDropCM().click();
		Thread.sleep(3000);
		
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
		
		
		
		
	}
	
	public static void ExportButtonCM( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
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
		
		
		Thread.sleep(3000);
		int open = ComplianceMappingTabCountMatch(getDriver(), test);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	private static int ComplianceMappingTabCountMatch(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated method stub
		return 0;
	}











	public static void ClearButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
			test.log(LogStatus.PASS, "Clear Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable"  );
			
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
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
	}
	
	
	public static void UploadBlankSheetCM( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		
		row0 = sheet.getRow(105);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileCM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonCM().click();
		
		
		Thread.sleep(2000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);

		
		
		
	}
	
	
	public static void ViewIconCM( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(7000);
		
		
		
		if(Locator.ViewButtonCM().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ViewButtonCM().click();
			test.log(LogStatus.PASS, "View Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		
		
		
		
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
//		WebWait wait = new WebWait(, 10000);
		Thread.sleep(4000);
		
		WebElement element = Locator.SelectYearASDD();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
	      jse.executeScript("arguments[0].click();", element);
	      
		
	      Thread.sleep(20000);
		
		Locator.SaveAuditScheduling().click();
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
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
		Locator.LocationDropASh().click();
		Thread.sleep(4000);
		
		if(Locator.ClearButtonAS().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearButtonAS().click();
			test.log(LogStatus.PASS, "Clear Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable"  );
			
		}
		
		
		Thread.sleep(4000);
		
		
		
	}
	
	public static void AssignComplience( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		Locator.AuditAssignment().click();
		Thread.sleep(9000);
		Locator.AssignButtonAA().click();
	//	WebWait wait = new WebWait(, 10000);
		Thread.sleep(4000);
		
		Locator.SelectAuditor().click();
		Thread.sleep(4000);
		WebElement element = Locator.SelectAuditorDDAA();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
	      jse.executeScript("arguments[0].click();", element);
	      
		
	      Thread.sleep(20000);
		

	
		Locator.SelectAuditorSaveAA().click();
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		

		
		
		
	}
	
	public static void UnassignComplianceAA( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		Locator.AuditAssignment().click();
		Thread.sleep(9000);
		Locator.UnassignButtonAA().click();
		Thread.sleep(20000);
		Locator.SelectAuditor().click();
		Thread.sleep(20000);
		
		
		
		Locator.SelectAuditorDDAA().click();
		Thread.sleep(4000);
		Locator.SelectAuditorSaveAA().click();
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		Locator.ScheduleAS().click();
		
		
		
	}
	
	
	public static void ClearButtonAA( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(4000);
		Locator.AuditAssignment().click();
		Thread.sleep(4000);
		
		Locator.LocationAS().click();
		Thread.sleep(4000);
		Locator.LocationDropAS().click();
		Thread.sleep(4000);
		Locator.LocationDropASh().click();
		Thread.sleep(4000);
		
		if(Locator.ClearButtonAA().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearButtonAA().click();
			test.log(LogStatus.PASS, "Clear Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable"  );
			
		}
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
	}
	
	public static void ExportReportFromReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(4000);
		
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
		
		
		if(Locator.ClearButtonReport().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ClearButtonReport().click();
			test.log(LogStatus.PASS, "Clear Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Clear Button Is Clickable"  );
			
		}
		
		
	}
	
	
	
	
		
		
		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void MoreReportR( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(4000);
		
		Locator.MoreReportReport().click();
		Thread.sleep(4000);
		
		
		if(Locator.CloseAuditReportR().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.CloseAuditReportR().click();
			test.log(LogStatus.PASS, "Closed Audit Report - File Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Closed Audit Report - File Download Successfully"  );
			
		}
		
		
		
		Locator.MouthCloseReportR().click();
		
		
		Thread.sleep(24000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Month Wise Closed Audit Report - " + t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
			
			if(Locator.RemarkReportR().isEnabled())
			{
				
				Thread.sleep(2000);
				Locator.RemarkReportR().click();
				test.log(LogStatus.PASS, "Compliance Remark Report  - File Download Successfully" );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Compliance Remark Report - File Download Successfully"  );
				
			}
			
			
		
		

		Locator.AuditReport().click();
		
		Thread.sleep(20000);
		
		 Alert ac21=getDriver().switchTo().alert();
			
			String t31=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "audit Report - " + t31 );
			
			Thread.sleep(20000);
			ac21.accept();
		
			Thread.sleep(4000);
		
		
	}
	
	
	
	public static void ActionColReportDownload( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(20000);
		
		
		if(Locator.ActionColmnReportDownload().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ActionColmnReportDownload().click();
			test.log(LogStatus.PASS, "Compliance Remark Report Download Successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "Compliance Remark Report Download Successfully"  );
			
		}
		
		
		
		
		
	}

	

     public static void ViewReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
     {
    	 
    	 
    	 Thread.sleep(4000);
 		Locator.Report().click();
 		Thread.sleep(20000);
 		
 		Locator.ViewButtonDropReport().click();
 		Thread.sleep(20000);
 	
 		
 		if(Locator.ViewButtonReport().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.ViewButtonReport().click();
 			test.log(LogStatus.PASS, "View Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " View Button Is Clickable"  );
 			
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
	    
	    
//	    WebWait wait = new WebWait(, 10000);
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
	      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
	      jse.executeScript("arguments[0].click();", element);
	      
		
	      Thread.sleep(20000);
    	 
    	 
    	 
    	
     }
	
	
	
	
     public static void UploadEntityValidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
 	{
 		
 		Locator.UploadEntity().click();
 		Thread.sleep(2000);
 		
 		Locator.UploadButton().click();
 		Thread.sleep(2000);
 		
        Alert ac1=getDriver().switchTo().alert();
 		
 		String t2=getDriver().switchTo().alert().getText();
 		
 		test.log(LogStatus.PASS,  t2 );
 		
 		Thread.sleep(2000);
 		ac1.accept();
 		
 		Thread.sleep(3000);
 		
 		
 		
 		
 		
 		
 	}
 	
 	
 	
 	

 	public static void UploadUservalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
 	{
 		//Locator.MasterButton().click();
 		Thread.sleep(3000);
 		Locator.UserButton().click();
 		Thread.sleep(3000);
 		Locator.UploadUserButton().click();
 		Thread.sleep(3000);
 		
 		
 		//Locator.SubmitUploadUser().click();
 		//Thread.sleep(2000);
 		
 		if(Locator.SubmitUploadUser().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.SubmitUploadUser().click();
 			test.log(LogStatus.PASS, "File Not Uploaded " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " File Uploaded successfully"  );
 			
 		}
 		
 	 	
 			
 			
 		
 	}
 	
	
 	public static void AddContractorsvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.UserButton().click();
		Thread.sleep(2000);
		Locator.ViewContractor().click();
		Thread.sleep(2000);
		Locator.AddContractor().click();
		Thread.sleep(2000);
		
			
		Locator.SubmitContractor().click();
	
		Thread.sleep(5000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(3000);
	 

	}
	
	
	
 	public static void AddContractorsvalidationallfield( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.UserButton().click();
		Thread.sleep(2000);
		Locator.ViewContractor().click();
		Thread.sleep(2000);
		Locator.AddContractor().click();
		Thread.sleep(2000);
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		/*
		row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorName().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		*/
		
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
		
		row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.AddContractorTypeuser().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SubmitContractor().click();
		
		
		Thread.sleep(5000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Without Enter Data Validation Message For Contractor Name Field  = " +  t2 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(3000);
	 
			Locator.ContractorClose().click();
			Thread.sleep(3000);
			
		
			Locator.AddContractor().click();
			Thread.sleep(3000);
			
			
			
			row0 = sheet.getRow(23);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddContractorName().sendKeys(c1.getStringCellValue()); // Writing Task title
			
			
			
			/*
			row0 = sheet.getRow(24);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddContractorSPOCName().sendKeys(c1.getStringCellValue()); // Writing Task title
			
			*/
			
			row0 = sheet.getRow(25);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
			
			
			row0 = sheet.getRow(26);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
			
			Thread.sleep(4000);
			Locator.AddContractorType().click();
			Thread.sleep(4000);
			
			row0 = sheet.getRow(27);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			Locator.AddContractorTypeuser().click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.SubmitContractor().click();
			
			
			Thread.sleep(5000);
			 Alert ac15=getDriver().switchTo().alert();
				
				String t25=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Without Enter Data Validation Message For SPOC Name Field  = " +  t25 );
				
				Thread.sleep(4000);
				ac1.accept();
				
				Thread.sleep(3000);
		
				Locator.ContractorClose().click();
				Thread.sleep(3000);
		
				Locator.AddContractor().click();
				Thread.sleep(3000);
				
				
				
				row0 = sheet.getRow(23);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.AddContractorName().sendKeys(c1.getStringCellValue()); // Writing Task title
				
				
				
				
				row0 = sheet.getRow(24);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.AddContractorSPOCName().sendKeys(c1.getStringCellValue()); // Writing Task title
				
				
				/*
				row0 = sheet.getRow(25);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
				
				*/
				row0 = sheet.getRow(26);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
				
				Thread.sleep(4000);
				Locator.AddContractorType().click();
				Thread.sleep(4000);
				
				row0 = sheet.getRow(27);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(3000);
				
				
				Locator.AddContractorTypeuser().click();
				Thread.sleep(3000);
				
				row0 = sheet.getRow(28);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(3000);
				
				Locator.SubmitContractor().click();
				
				
				Thread.sleep(5000);
				 Alert ac14=getDriver().switchTo().alert();
					
					String t24=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS,"Without Enter Data Validation Message For SPOC Email Field  = " +   t24 );
					
					Thread.sleep(4000);
					ac1.accept();
					
					Thread.sleep(3000);
					
					Locator.ContractorClose().click();
					Thread.sleep(3000);
			
					Locator.AddContractor().click();
					Thread.sleep(3000);
					
					
					
					row0 = sheet.getRow(23);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator.AddContractorName().sendKeys(c1.getStringCellValue()); // Writing Task title
					
					
					row0 = sheet.getRow(24);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator.AddContractorSPOCName().sendKeys(c1.getStringCellValue()); // Writing Task title
					
					
					
					row0 = sheet.getRow(25);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
					
					/*
					row0 = sheet.getRow(26);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
					
					*/
					
					
					Thread.sleep(4000);
					Locator.AddContractorType().click();
					Thread.sleep(4000);
					
					row0 = sheet.getRow(27);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
					Thread.sleep(3000);
					
					
					Locator.AddContractorTypeuser().click();
					Thread.sleep(3000);
					
					row0 = sheet.getRow(28);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
					Thread.sleep(3000);
					
					Locator.SubmitContractor().click();
					
					
					Thread.sleep(5000);
					 Alert ac13=getDriver().switchTo().alert();
						
						String t23=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS, "Without Enter Data Validation Message For SPOC Contact Field  = " +  t23 );
						
						Thread.sleep(4000);
						ac1.accept();
						
						Thread.sleep(3000);
						
						Locator.ContractorClose().click();
						Thread.sleep(3000);
					
							Locator.AddContractor().click();
							Thread.sleep(3000);
							
							
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
							/*
							Thread.sleep(4000);
							Locator.AddContractorType().click();
							Thread.sleep(4000);
							
							
							row0 = sheet.getRow(27);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(3000);
							
							
							Locator.AddContractorTypeuser().click();
							Thread.sleep(3000);
							
							*/
							
							row0 = sheet.getRow(28);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(3000);
							
							Locator.SubmitContractor().click();
							
							
							Thread.sleep(5000);
							 Alert ac11=getDriver().switchTo().alert();
								
								String t21=getDriver().switchTo().alert().getText();
								
								test.log(LogStatus.PASS, "Without Enter Data Validation Message For Contractor Type Field  = " +  t21 );
								
								Thread.sleep(4000);
								ac1.accept();
								
								Thread.sleep(3000);
						
								Locator.ContractorClose().click();
								Thread.sleep(3000);	
								
								
								
	}
 	
 	
 	
 	

	
 	public static void AddManagementAssignmentvalidation1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.UserButton().click();
		Thread.sleep(2000);
		Locator.ManagementAssignmentButton().click();
		Thread.sleep(3000);
		Locator.AddManagementAssignment().click();
		Thread.sleep(4000);
		/*
		Locator.LocationMAssign().click();
		Thread.sleep(26000);
		Locator.LocationMAssignDrop().click();
		Thread.sleep(3000);
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
		*/
		Locator.SubmitAssignment().click();
		
		Thread.sleep(20000);
		 Alert ac23=getDriver().switchTo().alert();
			
			String t33=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t33 );
			
			Thread.sleep(4000);
			ac23.accept();
		
			Thread.sleep(4000);
		
				
	}
 	
 	
 	
 	
 	
	
	
 	public static void AddManagementAssignmentvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.UserButton().click();
		Thread.sleep(2000);
		Locator.ManagementAssignmentButton().click();
		Thread.sleep(3000);
		Locator.AddManagementAssignment().click();
		Thread.sleep(4000);
		/*
		Locator.LocationMAssign().click();
		Thread.sleep(26000);
		Locator.LocationMAssignDrop().click();
		Thread.sleep(3000);
		Locator.LocationMAssignDropDown().click();
		Thread.sleep(5000);
		Locator.Space().click();
		*/
		Locator.MAssignProject().click();
		Thread.sleep(5000);
		Locator.managementProject2().click();
		
	//	Locator.managementProject().click();
		Thread.sleep(5000);
		Locator.MAssignProjectSpace().click();
		Thread.sleep(3000);
		
		Locator.MAssignUser().click();
		Thread.sleep(3000);
		Locator.managementUser2().click();
		
		//Locator.managementuser().click();
		Thread.sleep(3000);
		Locator.MAssignUserUserSpace().click();
		Thread.sleep(3000);
		Locator.SubmitAssignment().click();
		
		Thread.sleep(5000);
		 Alert ac23=getDriver().switchTo().alert();
			
			String t33=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.FAIL, "Without Enter Location Field  = " + t33 );
			
			Thread.sleep(4000);
			ac23.accept();
		
			Thread.sleep(4000);
		
			Locator.managementClose().click();
			Thread.sleep(3000);
			
			Locator.AddManagementAssignment().click();
			Thread.sleep(2000);
			
			Locator.LocationMAssign().click();
			Thread.sleep(6000);
			Locator.LocationMAssignDrop().click();
			Thread.sleep(3000);
			
			Locator.managementLocation2().click();
			
			//Locator.LocationMAssignDropDown1().click();
			Thread.sleep(3000);
			Locator.Space().click();
			
			/*
			Locator.MAssignProject().click();
			Thread.sleep(5000);
			Locator.MAssignProjectCheckBox().click();
			Thread.sleep(5000);
			Locator.MAssignProjectSpace().click();
			Thread.sleep(3000);
			*/
			Locator.MAssignUser().click();
			Thread.sleep(3000);
			Locator.managementUser2().click();
			
			
			//Locator.managementuser().click();
			Thread.sleep(3000);
			Locator.MAssignUserUserSpace().click();
			Thread.sleep(3000);
			Locator.SubmitAssignment().click();
			
			Thread.sleep(20000);
			 Alert ac22=getDriver().switchTo().alert();
				
				String t32=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Without Enter Project Field  = " + t32 );
				
				Thread.sleep(4000);
				ac22.accept();
			
				Thread.sleep(4000);
				
				Locator.managementClose().click();
				Thread.sleep(3000);
				
				Locator.AddManagementAssignment().click();
				Thread.sleep(4000);
				
				Locator.LocationMAssign().click();
				Thread.sleep(26000);
				Locator.LocationMAssignDrop().click();
				Thread.sleep(3000);
				Locator.managementLocation2().click();
				
			//	Locator.LocationMAssignDropDown1().click();
				Thread.sleep(5000);
				Locator.Space().click();
				
				Locator.MAssignProject().click();
				Thread.sleep(5000);
				Locator.managementProject2().click();
				
			//	Locator.MAssignProjectCheckBox1().click();
				Thread.sleep(5000);
				Locator.MAssignProjectSpace().click();
				Thread.sleep(3000);
				/*
				Locator.MAssignUser().click();
				Thread.sleep(3000);
				Locator.MAssignUserCheckBox().click();
				Thread.sleep(3000);
				Locator.MAssignUserUserSpace().click();
				Thread.sleep(3000);
				*/
				Locator.SubmitAssignment().click();
				
				Thread.sleep(20000);
				 Alert ac21=getDriver().switchTo().alert();
					
					String t31=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, "Without Enter User Field  = " + t31 );
					
					Thread.sleep(4000);
					ac21.accept();
				
					Thread.sleep(4000);
				
					Locator.managementClose().click();
					Thread.sleep(3000);
		
		
	}
	
	
	
	
 	public static void UploadProjectvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.ProjectButton().click();
		Thread.sleep(2000);
		Locator.ProjectUpload().click();
		Thread.sleep(2000);
		
	//	Locator.ProjectUploadButton().click();
		
		if(Locator.ProjectUploadButton().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.ProjectUploadButton().click();
 			test.log(LogStatus.PASS, "File Not Uploaded " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " File Uploaded successfully"  );
 			
 		}
		
		    
		
	}
	
	
 	
 	
 	
 	public static void UploadContractorCTvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		Locator.UploadContractorCT().click();
		Thread.sleep(3000);
		
		
		//Locator.UploadSubmitCT().click();
		
		
		
		if(Locator.UploadSubmitCT().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.UploadSubmitCT().click();
 			test.log(LogStatus.PASS, "File Not Uploaded " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " File Uploaded successfully"  );
 			
 		}
				
			
	}
	
 	
 	
 	
 	public static void UploadContractorProjectMappingSheetvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		Locator.UploadContractorProjectMappingCT().click();
		Thread.sleep(6000);
		
		
			
		//	Locator.UploadContractorProjectMappingUploadBCT().click();
			
			if(Locator.UploadContractorProjectMappingUploadBCT().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator.UploadContractorProjectMappingUploadBCT().click();
	 			test.log(LogStatus.PASS, "File Not Uploaded " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, " File Uploaded successfully"  );
	 			
	 		}
		
		
	}
	
	
 	
 	
 	public static void UploadeActvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(2000);
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(2000);
		
		Locator.UploadActAndCompliance().click();
		Thread.sleep(2000);
		
		Locator.UploadButtonAC().click();
		Thread.sleep(3000);
		
		
		Alert ac3=getDriver().switchTo().alert();
		
		String t4=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t4 );
		
		Thread.sleep(3000);
		ac3.accept();
	
		Thread.sleep(2000);
		
		
		
	}
	
 	
 	
 	
 	public static void UploadCompliancevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(2000);
		
		Locator.ComplienceButtonAC().click();
		Thread.sleep(2000);
		
		Locator.ComplianceUploadAC().click();
		Thread.sleep(2000);
		
		Locator.ButtonComplianceUploadAC().click();
		Thread.sleep(4000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
	}
	
	
 	
 	public static void UploadTemplatevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(2000);
		
		Locator.TemplateButtonAC().click();
		Thread.sleep(3000);
		
		Locator.UploadTemplateDDAC().click();
		Thread.sleep(3000);
	
		
		Locator.UploadButtonTemplateAC().click();
		
		Thread.sleep(4000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
	}
	
 	
 	
 	
 	public static void UploadCMFTabvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(2000);
		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
		Locator.UploadCM().click();
		Thread.sleep(3000);
		
		Locator.UploadButtonCM().click();
		
		Thread.sleep(2000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(3000);
		
	}
	
	
 	
 	
 	public static void AddNewCompliancevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
		
		Locator.CMAddButton().click();
		Thread.sleep(3000);
		
	//	Locator.mapCompliance().click();
	//	Thread.sleep(7000);
		
   
		
  //      Locator.SelectCompliance11CM().click();
   //     Thread.sleep(3000);
        
	//	Locator.SelectMappingTypeDD().click();
	//	Thread.sleep(7000);
		
		
		/*
		Locator.CMAddProject().click();
		Thread.sleep(7000);
		
   
		
        Locator.CMAddProjectDD().click();
        Thread.sleep(3000);
		*/
		
	//	Locator.SaveCompliance().click();
		
		
		
		Thread.sleep(6000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
	}
	
 	
 	
 	public static void AuditSchedulevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(3000);
		Locator.AuditScheduling().click();
		Thread.sleep(5000);
		Locator.AuditSchedulingUnschedule().click();
		Thread.sleep(2000);
		
		Locator.SaveAuditScheduling().click();
		
		Thread.sleep(3000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(3000);
			ac2.accept();
		
			Thread.sleep(4000);
		

		
		
		
	}
	
	

 	public static void AssignCompliencevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(2000);
		Locator.AuditAssignment().click();
		Thread.sleep(3000);
		Locator.AssignButtonAA().click();
		Thread.sleep(2000);
		Locator.SelectAuditorSaveAA().click();
		
		Thread.sleep(4000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		

		
		
		
	}
 	
 	
 	
 	
 	public static void AddSubEntity2validation2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

	
 		Thread.sleep(1000);
	
		Locator.AddSubEntity().click();
		Thread.sleep(3000);
		
		Locator.AddSubEntityBranch().click();
		Thread.sleep(3000);
		
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
				
		
	}
 	
 	//////////////////
 	
 	
 	
 	public static void AddSubEntity2validation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

	
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
	
		Locator.AddSubEntity().click();
		Thread.sleep(3000);
		
		Locator.AddSubEntityBranch().click();
		Thread.sleep(3000);
		
		/*
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubEntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		*/
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
		      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
		      jse.executeScript("arguments[0].click();", element);
		      boolean b = element.isSelected();
		      if (b) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Name Field  = " + t1 );
		
		Thread.sleep(4000);
		ac.accept();
		
		Thread.sleep(2000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);
		
		
		//////
		
		Locator.AddSubEntityBranch().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubEntityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		/*
		Locator.SubEntity().click();
		 Thread.sleep(3000);
		Locator.SubEntityD().click();
		 Thread.sleep(3000);
		 */
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
			
			
			
			
			WebElement element1 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element1);
		      boolean b1 = element1.isSelected();
		      if (b1) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac1=getDriver().switchTo().alert();
		
		String t11=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Sub Entity Type Field  = " +  t11 );
		
		Thread.sleep(4000);
		ac1.accept();
		
		Thread.sleep(2000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);

		//////////////////
		
		
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
		 /*
		Locator.SType().click();
		 Thread.sleep(3000);
		Locator.STypeD().click();
		 Thread.sleep(3000);
		 */
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
			
			
			
			
			WebElement element2 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse2 = (JavascriptExecutor) getDriver();
		      jse2.executeScript("arguments[0].click();", element2);
		      boolean b2 = element2.isSelected();
		      if (b2) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac2=getDriver().switchTo().alert();
		
		String t12=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Type Field  = " + t12 );
		
		Thread.sleep(3000);
		ac2.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);

		///////
		
		
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
		 /*
		Locator.LegalRelationshipS().click();
		 Thread.sleep(3000);
		Locator.LegalRelationshipSD().click();
		 Thread.sleep(3000);
		 */
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
			
			
			
			
			WebElement element3 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse3 = (JavascriptExecutor)getDriver() ;
		      jse.executeScript("arguments[0].click();", element3);
		      boolean b3 = element3.isSelected();
		      if (b3) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac3=getDriver().switchTo().alert();
		
		String t13=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Legal Relationship Field  = " + t13 );
		
		Thread.sleep(4000);
		ac3.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);

		////////
		
		
		
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
		 /*
		Locator.LegalEntityS().click();
		 Thread.sleep(3000);
		Locator.LegalEntitySD().click();
		 Thread.sleep(3000);
		 */
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
			
			
			
			
			WebElement element4 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse4 = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element4);
		      boolean b4 = element4.isSelected();
		      if (b4) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac5=getDriver().switchTo().alert();
		
		String t15=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,"Without Enter Data Validation Message For Legal Entity Type Field  = " +  t15 );
		
		Thread.sleep(4000);
		ac5.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(4000);

		//////
		
		
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
		 /*
		Locator.StateS().click();
		 Thread.sleep(3000);
		Locator.StateSD().click();
		 Thread.sleep(3000);
		 */
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
			
			
			
			
			WebElement element6 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse6 = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element6);
		      boolean b6 = element6.isSelected();
		      if (b6) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac6=getDriver().switchTo().alert();
		
		String t16=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For State Field  = " + t16 );
		
		Thread.sleep(4000);
		ac6.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);

		//////
		
		
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
		 /*
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubAdress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		*/
		
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
			
			
			
			
			WebElement element7 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse7 = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element7);
		      boolean b7 = element7.isSelected();
		      if (b7) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac7=getDriver().switchTo().alert();
		
		String t17=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Adress Field  = " + t17 );
		
		Thread.sleep(4000);
		ac7.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);

		//////
		
		
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
		
		/*
		
		row0 = sheet.getRow(11);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		*/
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
			
			
			
			
			WebElement element8 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse8 = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element8);
		      boolean b8 = element8.isSelected();
		      if (b8) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac8=getDriver().switchTo().alert();
		
		String t18=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Email Field  = " + t18 );
		
		Thread.sleep(4000);
		ac8.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);

		//////
		
		
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
		/*
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SubContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		*/
		Locator.SubStatus().click();
		 Thread.sleep(3000);
		Locator.SubStatusD().click();
		 Thread.sleep(6000);
		 
		 Locator.CityS().click();
			Thread.sleep(4000);
			
			
			
			
			WebElement element9 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse9 = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element9);
		      boolean b9 = element9.isSelected();
		      if (b9) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac9=getDriver().switchTo().alert();
		
		String t19=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,"Without Enter Data Validation Message For Contact Person Field  = " +  t19 );
		
		Thread.sleep(4000);
		ac9.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);
/////
		
		
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
		/*
		Locator.SubStatus().click();
		 Thread.sleep(3000);
		Locator.SubStatusD().click();
		 Thread.sleep(6000);
		 */
		 Locator.CityS().click();
			Thread.sleep(4000);
			
			
			
			
			WebElement element10 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse10 = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element10);
		      boolean b10 = element10.isSelected();
		      if (b10) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac10=getDriver().switchTo().alert();
		
		String t110=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Status Field  = " + t110 );
		
		Thread.sleep(4000);
		ac10.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);
//////
		
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
		Locator.StateSD1().click();
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
		 /*
		 Locator.CityS().click();
			Thread.sleep(4000);
			
			
			
			
			WebElement element = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
		      jse.executeScript("arguments[0].click();", element);
		      boolean b = element.isSelected();
		      if (b) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
			*/
		      Thread.sleep(6000);
			

		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		Locator.sumitS().click();
		
		
        Thread.sleep(5000);
		
		
        Alert ac11=getDriver().switchTo().alert();
		
		String t111=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For City Field  = " + t111 );
		
		Thread.sleep(4000);
		ac11.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(4000);

		///////
		
		
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
			
			
			
			
			WebElement element12 = Locator.CityDropSub();	      
			//JavascriptExecutor to click element
		      JavascriptExecutor jse12 = (JavascriptExecutor) getDriver();
		      jse.executeScript("arguments[0].click();", element12);
		      boolean b12 = element12.isSelected();
		      if (b12) {
		         System.out.println("Checkbox is not checked");
		      }else {
		         System.out.println("Checkbox is checked");
		      }
			
		      Thread.sleep(5000);
			
/*
		Locator.industryS().click();
		 Thread.sleep(3000);
		Locator.industrySD().click();
		 Thread.sleep(3000);
		 */
		Locator.sumitS().click();
		
		
        Thread.sleep(6000);
		
		
        Alert ac12=getDriver().switchTo().alert();
		
		String t112=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Without Enter Data Validation Message For Industry Type Field  = " + t112 );
		
		Thread.sleep(4000);
		ac12.accept();
		
		Thread.sleep(3000);
		Locator.CloseSubEntity().click();
		Thread.sleep(3000);

		
		
		
				
		
	}
	

 	
 	
 	
 	
 	public static void AddCityvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
	//	Locator.SaveCityMaster().click();
		
		Thread.sleep(20000);
		
		if(Locator.SaveCityMaster().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.SaveCityMaster().click();
 			test.log(LogStatus.PASS, "Enter City Name" );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Enter City Name"  );
 			
 		}
		
		
	}
	
 	
 	
 	public static void AddLicenceTypevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
 	{
 		
 		//Locator.MasterButton().click();
		Thread.sleep(3000);
 		
		Locator.LicenceTypeMaster().click();
		Thread.sleep(3000);
		
		Locator.AddLicenceTypeButton().click();
		Thread.sleep(3000);
		
	//	Locator.SaveLicenceTypeButton().click();
	//	Thread.sleep(20000);
		
		if(Locator.SaveLicenceTypeButton().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.SaveLicenceTypeButton().click();
 			test.log(LogStatus.PASS, "Enter Licence Type" );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Enter Licence Type"  );
 			
 		}
 		
 		
 		
 	}
	
 	
 	
 	///////
 	
 	public static void Addentity2validatinEmail( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

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

		row0 = sheet.getRow(112);
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
		
		
		
		
		
		
		
		
	/*	
		row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.CitySelect().click();
		Thread.sleep(4000);
		*/
		
		Locator.industry().click();
		Thread.sleep(3000);
		Locator.industryD().click();
		Thread.sleep(3000);
		Locator.SubmitButton().click();
	
		Thread.sleep(5000);
		
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(4000);
		ac.accept();
	    	
		
		
	}

 	
 	
 	
 	public static void AddSubEntity2validationemail( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

	
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
	
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
		
		
		row0 = sheet.getRow(112);
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
		      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
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
		
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
				
		
	}

 	//////////////////////////
 	
 	public static void AddLicenceCTvalidation1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(2000);
		
		Locator.Contractortab().click();
		Thread.sleep(2000);
		
		Locator.MappingEditProjectCT().click();
		Thread.sleep(2000);
		
		Locator.LicenceDetailsCT().click();
		Thread.sleep(2000);
		
		Locator.AddLicenceDetailsCT().click();
		Thread.sleep(2000);
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(5000);
			ac2.accept();
		
			Thread.sleep(2000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(2000);
		
	}
	
 	
 	/////////////////////////////////
 	
 	
 	public static void AddLicenceCTvalidation2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.Contractortab().click();
		Thread.sleep(3000);
		
		Locator.MappingEditProjectCT().click();
		Thread.sleep(3000);
		
		Locator.LicenceDetailsCT().click();
		Thread.sleep(3000);
		
		Locator.AddLicenceDetailsCT().click();
		Thread.sleep(3000);
		
		/*
		Locator.AddLicenceTypeCT1().click();
		Thread.sleep(3000);
		
		Locator.LicenceTypeLD().click();
		Thread.sleep(3000);
		*/
		
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
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,"without Enter Data For Licence Type Field = "  + t3 );
			
			Thread.sleep(6000);
			ac2.accept();
		
			Thread.sleep(3000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(2000);
		
		//////
		
		
		
		Locator.AddLicenceDetailsCT().click();
		Thread.sleep(3000);
		
		
		Locator.AddLicenceTypeCT1().click();
		Thread.sleep(3000);
		
		Locator.LicenceTypeLD().click();
		Thread.sleep(3000);
		
		/*
		
		row0 = sheet.getRow(32);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ProjectSearchBox().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(33);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.RegistrationNo().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		*/
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
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(9000);
		
		 Alert ac21=getDriver().switchTo().alert();
			
			String t31=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS," Without Enter Data For Registration Number Field = " + t31 );
			
			Thread.sleep(6000);
			ac21.accept();
		
			Thread.sleep(4000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(3000);
		
		////////////
		
		Locator.AddLicenceDetailsCT().click();
		Thread.sleep(3000);
		
		
		Locator.AddLicenceTypeCT1().click();
		Thread.sleep(3000);
		
		Locator.LicenceTypeLD().click();
		Thread.sleep(3000);
		
		
		/*
		
		row0 = sheet.getRow(32);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ProjectSearchBox().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		*/
		row0 = sheet.getRow(33);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.RegistrationNo().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		/*
		row0 = sheet.getRow(34);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		*/
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
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(9000);
		
		 Alert ac22=getDriver().switchTo().alert();
			
			String t32=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS," Without Enter Data For Remark Field = " + t3 );
			
			Thread.sleep(6000);
			ac22.accept();
		
			Thread.sleep(3000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(3000);
	
	////////
		
		
		Locator.AddLicenceDetailsCT().click();
		Thread.sleep(3000);
		
		
		Locator.AddLicenceTypeCT1().click();
		Thread.sleep(3000);
		
		Locator.LicenceTypeLD().click();
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(33);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.RegistrationNo().sendKeys(c1.getStringCellValue()); // Writing Task title
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
		row0 = sheet.getRow(60);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddLicenceHeadCountCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		row0 = sheet.getRow(36);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.UploadDocumentL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(9000);
		
		 Alert ac23=getDriver().switchTo().alert();
			
			String t33=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " Without Enter Data For validity Field = " + t33 );
			
			Thread.sleep(6000);
			ac23.accept();
		
			Thread.sleep(4000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(3000);
	///////////
		
		
		Locator.AddLicenceDetailsCT().click();
		Thread.sleep(3000);
		
		
		Locator.AddLicenceTypeCT1().click();
		Thread.sleep(3000);
		
		Locator.LicenceTypeLD().click();
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
		/*
		row0 = sheet.getRow(60);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddLicenceHeadCountCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		*/
		
		row0 = sheet.getRow(36);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.UploadDocumentL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(9000);
		
		 Alert ac24=getDriver().switchTo().alert();
			
			String t34=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " Without Enter Data For Head Count Field =" + t34 );
			
			Thread.sleep(6000);
			ac24.accept();
		
			Thread.sleep(3000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(3000);
	////////
		
		
		Locator.AddLicenceDetailsCT().click();
		Thread.sleep(3000);
		
		
		Locator.AddLicenceTypeCT1().click();
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
		
		row0 = sheet.getRow(60);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddLicenceHeadCountCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		/*
		row0 = sheet.getRow(36);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.UploadDocumentL().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		*/
		Locator.SubmitLicence().click();
		
		
		Thread.sleep(9000);
		
		 Alert ac25=getDriver().switchTo().alert();
			
			String t35=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " Without upload Document = " + t35 );
			
			Thread.sleep(6000);
			ac25.accept();
		
			Thread.sleep(4000);
		
		Locator.ClosetLicence().click();
		
		Thread.sleep(3000);
	
		
	}
	
 	
 	
 	
 	
 	public static void AddDataPointvalidation1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.DataPointMaster().click();
		Thread.sleep(3000);
		
		Locator.AddDataPoint().click();
		Thread.sleep(3000);
		/*
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
		*/
		
		if(Locator.SaveDataPoint().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.SaveDataPoint().click();
 			test.log(LogStatus.PASS, "Data Point Not Added" );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Data Point Not Added"  );
 			
 		}
		
		
		
		
	}
	
 	
 	
 	public static void AddDataPointvalidation12( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		/*
		Locator.AddDataPointDescriptionType().click();
		Thread.sleep(3000);
		
		Locator.AddDataPointDescriptionTypeDD().click();
		Thread.sleep(3000);
		
		Locator.SaveDataPoint().click();
		Thread.sleep(3000);
		*/
		
		if(Locator.SaveDataPoint().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.SaveDataPoint().click();
 			test.log(LogStatus.PASS, " Without Enter Data For Discription Field = Enter Description " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Without Enter Data For Discription Field = Enter Description "  );
 			
 		}
		
		Thread.sleep(2000);
		
		Locator.CloseDataPoint().click();
		Thread.sleep(2000);
		
		Locator.AddDataPoint().click();
		Thread.sleep(3000);
		/*
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(84);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddDataPointDescription().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		*/
		Locator.AddDataPointDescriptionType().click();
		Thread.sleep(3000);
		
		Locator.AddDataPointDescriptionTypeDD().click();
		Thread.sleep(3000);
		
		//Locator.SaveDataPoint().click();
	//	Thread.sleep(3000);
		
		
		if(Locator.SaveDataPoint().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.SaveDataPoint().click();
 			test.log(LogStatus.PASS, " Without Enter Data For Discription Type Field = Enter Description Type " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Without Enter Data For Discription Type Field = Enter Description Type "  );
 			
 		}
		
		
		
		Thread.sleep(2000);
		
		Locator.CloseDataPoint().click();
		Thread.sleep(2000);
		
		
		
	}
	
 	
 	
 	
 	
 	public static void AddActAndCompliencevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		Locator.AddActAndCompliance().click();
		Thread.sleep(3000);
		/*
		Locator.ActAndComplienceCentral().click();
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
		
		*/
	//	Locator.ButtonSaveAct().click();
		
		if(Locator.ButtonSaveAct().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.ButtonSaveAct().click();
 			test.log(LogStatus.PASS, " Act Not Added " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Act Not Added "  );
 			
 		}
		
		
		
		
		
	}
	

 	
 	
 	
 	public static void AddActAndCompliencevalidation2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		Locator.AddActAndCompliance().click();
		Thread.sleep(3000);
		/*
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		Locator.ActAndComplienceCentralDropDown().click();
		Thread.sleep(3000);
		*/
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
		
		
	//	Locator.ButtonSaveAct().click();
		
		if(Locator.ButtonSaveAct().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.ButtonSaveAct().click();
 			test.log(LogStatus.PASS, " Without Enter Central Field = Enter Central/State " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Without Enter Central Field = Enter Central/State"  );
 			
 		}
		////
		
		Thread.sleep(3000);
		Locator.CloseAct().click();
		Thread.sleep(3000);
		
		Locator.AddActAndCompliance().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		Locator.ActAndComplienceCentralDropDown().click();
		Thread.sleep(3000);
		
		
		/*
		row0 = sheet.getRow(62);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ActNameAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		*/
		Locator.ContractorTypeAC().click();
		Thread.sleep(3000);
		Locator.ContractorTypeDDAC().click();
		Thread.sleep(10000);
		Locator.CatogaryAC().click();
		Thread.sleep(3000);
		Locator.CatogaryACDD().click();
		Thread.sleep(3000);
		
		
	//	Locator.ButtonSaveAct().click();
		
		if(Locator.ButtonSaveAct().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.ButtonSaveAct().click();
 			test.log(LogStatus.PASS, " Without Enter Act Name Field = Enter Act Name" );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Without Enter Act Name Field = Enter Act Name "  );
 			
 		}

		
        Thread.sleep(3000);
        Locator.CloseAct().click();
		Thread.sleep(3000);
		
		Locator.AddActAndCompliance().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplienceCentral().click();
		Thread.sleep(7000);
		Locator.ActAndComplienceCentralDropDown().click();
		Thread.sleep(3000);
		
		
		
		row0 = sheet.getRow(62);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ActNameAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		/*
		Locator.ContractorTypeAC().click();
		Thread.sleep(3000);
		Locator.ContractorTypeDDAC().click();
		Thread.sleep(10000);
		*/
		Locator.CatogaryAC().click();
		Thread.sleep(3000);
		Locator.CatogaryACDD().click();
		Thread.sleep(3000);
		
		
		Locator.ButtonSaveAct().click();
		
		Thread.sleep(9000);
		
		 Alert ac25=getDriver().switchTo().alert();
			
			String t35=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " Without Enter Contractor type Field = " + t35 );
			
			Thread.sleep(6000);
			ac25.accept();
		
			Thread.sleep(4000);
			
			Locator.CloseAct().click();
			Thread.sleep(3000);
///////////////////////////

			
			Locator.AddActAndCompliance().click();
			Thread.sleep(3000);
			
			Locator.ActAndComplienceCentral().click();
			Thread.sleep(7000);
			Locator.ActAndComplienceCentralDropDown().click();
			Thread.sleep(3000);
			
			
			
			row0 = sheet.getRow(62);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.ActNameAC().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.ContractorTypeAC().click();
			Thread.sleep(3000);
			Locator.ContractorTypeDDAC().click();
			Thread.sleep(10000);
			/*
			Locator.CatogaryAC().click();
			Thread.sleep(3000);
			Locator.CatogaryACDD().click();
			Thread.sleep(3000);
			*/
			
			//Locator.ButtonSaveAct().click();
			
			if(Locator.ButtonSaveAct().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator.ButtonSaveAct().click();
	 			test.log(LogStatus.PASS, " Without Enter Catogary Field = Enter Catogary " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, " Without Enter Catogary Field = Enter Catogary "  );
	 			
	 		}
			
			Thread.sleep(2000);

			Locator.CloseAct().click();
			Thread.sleep(3000);
	}
	

 	
 	
 	
 	
 	public static void AddTemplateACvalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.TemplateButtonAC().click();
		Thread.sleep(6000);
		Locator.A1ddTemplateAC().click();
		Thread.sleep(6000);
		/*
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
	      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
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
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("arguments[0].click;",element);
        Thread.sleep(5000);
	//	js.exicuteScript("arguments[0].click;",element);
		*/
		Locator.TemplateSaveButtonAC().click();
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
		
	}
	
	
 	
 	
 	public static void AddTemplateACvalidation2( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		/*
		
	//	WebWait wait = new WebWait(, 60000);
		
		
		
		
		WebElement element = Locator.TemplateCheckBoxAC();	      
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor)getDriver() ;
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
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("arguments[0].click;",element);
        Thread.sleep(5000);
	//	js.exicuteScript("arguments[0].click;",element);
		*/
		Locator.TemplateSaveButtonAC().click();
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
		
		
		
	}
	
 	
 	
 	
 	
 	
 	
 	public static void AddContractorTypevalidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ContractorTypeButton().click();
		Thread.sleep(3000);
		
		Locator.AddContractorTypeButton().click();
		
		/*
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(75);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorTypeName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		*/
	//	Locator.AddContractorTypeSaveButton().click();
		Thread.sleep(2000);
		
		if(Locator.AddContractorTypeSaveButton().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.AddContractorTypeSaveButton().click();
 			test.log(LogStatus.PASS, " Without Enter Contractor Type Field = Enter Contractor Type " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Without Enter Contractor Type Field = Enter Contractor Type "  );
 			
 		}
		
		//	Locator.CloseContractorTypePage().click();
			Thread.sleep(4000);
	}
	
 	
 	
 	
 	///////////////////////////////////////////////////////////////////
 	
 	
 	
 	
 	
 	public static void UploadEntitydifferentExcelsheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(113);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(10000);
	
	 Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t1 );
		
		Thread.sleep(4000);
		ac.accept();
	
		Thread.sleep(4000);
		
		
		
	}
	
 	
 	
 	public static void UploadEntitypdf( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(114);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(15000);
	
	
	
	Locator.DownloadErrorFile().click();
	Thread.sleep(5000);
	
	String fNotFound = Locator.DownloadFileNotFound().getText();
	
	test.log(LogStatus.PASS,  fNotFound );
	

	Thread.sleep(4000);
		
		
		
	}
	
 	
 	
 	
 	
 	public static void UploadEntityVideo( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(115);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(4000);
	
	Locator.UploadButton().click();
	Thread.sleep(60350);
	
	
	
	Locator.DownloadErrorFile().click();
	Thread.sleep(5000);
	
	String fNotFound = Locator.DownloadFileNotFound().getText();
	
	test.log(LogStatus.PASS,  fNotFound );
	

	Thread.sleep(4000);
		
		
		
	}

 	
 	
 	
 	
 	public static void UploadUserDifferentExcelSheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
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
		
		row0 = sheet.getRow(113);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(20000);
		
		 Alert ac=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,t1 );
			
			Thread.sleep(4000);
			ac.accept();
		
			Thread.sleep(4000);
	 	
			
			
		
	}
	
 	
 	
 	
 	
 	public static void UploadUserPdf( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
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
		
		row0 = sheet.getRow(114);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(15000);
		
		Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,t1 );
		
		Thread.sleep(4000);
		ac.accept();
	
		Thread.sleep(4000);
	 	
			
			
		
	}
	
 	
 	
 	
 	public static void UploadUserVideo( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
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
		
		row0 = sheet.getRow(115);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(60350);
		
		Locator.DownloadErrorFile().click();
		Thread.sleep(5000);
		
		String fNotFound = Locator.DownloadFileNotFound().getText();
		
		test.log(LogStatus.PASS,  fNotFound );
		

		Thread.sleep(4000);

	 	
			
			
		
	}
	

 	
 	
 	
 	
 	public static void UploadProjectDifferentExcelSheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(113);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputProject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.ProjectUploadButton().click();
		
		Thread.sleep(10000);
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
			
			
			
			
            
           
		
	}
	
	
 	
 	
 	public static void UploadProjectpdf( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(114);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputProject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.ProjectUploadButton().click();
		
		Thread.sleep(15000);
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
			
			
			
			
            
           
		
	}
	
	
 	
 	
 	
 	
 	public static void UploadProjectVideo( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(115);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputProject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.ProjectUploadButton().click();
		
		Thread.sleep(60350);
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(4000);
			ac2.accept();
		
			Thread.sleep(4000);
		
			
			
			
			
            
           
		
	}
	
	
 	
 	
 	public static void UploadContractorCTDifferentExcelSheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(113);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadSubmitCT().click();
		
		
		
		Thread.sleep(15000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
			
						

			
		
			
	}
	

 	
 	
 	public static void UploadContractorCTPdf( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(114);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadSubmitCT().click();
		
		
		
		Thread.sleep(20000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
			
						

			
		
			
	}
	


 	
 	
 	
 	public static void UploadContractorCTVideo( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(115);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadSubmitCT().click();
		
		
		
		Thread.sleep(60350);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t2 );
			
			Thread.sleep(5000);
			ac1.accept();
			
			Thread.sleep(6000);
			
						

			
		
			
	}
	



 	
 	public static void UploadContractorProjectMappingDifferentSheetName( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
			row0 = sheet.getRow(113);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.UploadContractorProjectMappingFileCT().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.UploadContractorProjectMappingUploadBCT().click();
			
			Thread.sleep(9000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t4 );
				
				Thread.sleep(5000);
				ac3.accept();
		
		
	}
	
 	
 	
 	
 	public static void UploadContractorProjectMappingpdf( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
			row0 = sheet.getRow(114);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.UploadContractorProjectMappingFileCT().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.UploadContractorProjectMappingUploadBCT().click();
			
			Thread.sleep(9000);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t4 );
				
				Thread.sleep(5000);
				ac3.accept();
		
		
	}
	
 	
 	
 	
 	
 	
 	public static void UploadContractorProjectMappingVideo( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
			row0 = sheet.getRow(115);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.UploadContractorProjectMappingFileCT().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			Locator.UploadContractorProjectMappingUploadBCT().click();
			
			Thread.sleep(60350);
			 Alert ac3=getDriver().switchTo().alert();
				
				String t4=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS,  t4 );
				
				Thread.sleep(5000);
				ac3.accept();
		
		
	}
	
 	
 	
 	
 	
 	public static void UploadActAndComplianceDifferentExcelSheetName( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(113);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SelectFileActAndCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonAC().click();
		Thread.sleep(30000);
		
		
		Alert ac3=getDriver().switchTo().alert();
		
		String t4=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t4 );
		
		Thread.sleep(5000);
		ac3.accept();
	
		Thread.sleep(4000);
			
		
	
		
	}
	
 	
 	
 	
 	public static void UploadActAndCompliancePdf( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(114);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SelectFileActAndCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonAC().click();
		Thread.sleep(30000);
		
		
		Locator.DownloadErrorFileTemplate().click();
		Thread.sleep(5000);
		
		String fNotFound = Locator.DownloadFileNotFound().getText();
		
		test.log(LogStatus.PASS,  fNotFound );
		

		Thread.sleep(4000);
			
		
	
		
	}
	
 	
 	
 	public static void UploadActAndComplianceVideo( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(115);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SelectFileActAndCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonAC().click();
		Thread.sleep(60350);
		
		
		Locator.DownloadErrorFileTemplate().click();
		Thread.sleep(5000);
		
		String fNotFound = Locator.DownloadFileNotFound().getText();
		
		test.log(LogStatus.PASS,  fNotFound );
		

		Thread.sleep(4000);
			
		
	
		
	}
 	
 	
 	
 	public static void UploadComplianceDifferentExcelSheetName( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(113);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUploadCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		
		Locator.ButtonComplianceUploadAC().click();
		
		
		Thread.sleep(9000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
		
	}
	
 	
 	
 	public static void UploadCompliancePdf( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(114);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUploadCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		
		Locator.ButtonComplianceUploadAC().click();
		Thread.sleep(30000);
	
		Locator.DownloadErrorFileTemplate().click();
		Thread.sleep(5000);
		
		String fNotFound = Locator.DownloadFileNotFound().getText();
		
		test.log(LogStatus.PASS,  fNotFound );
		

		Thread.sleep(4000);
		
		
	}
	
 	
 	
 	
 	
 	public static void UploadComplianceVideo( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(115);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUploadCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		
		Locator.ButtonComplianceUploadAC().click();
		Thread.sleep(60350);
		
		
		Locator.DownloadErrorFileTemplate().click();
		Thread.sleep(5000);
		
		String fNotFound = Locator.DownloadFileNotFound().getText();
		
		test.log(LogStatus.PASS,  fNotFound );
		

		Thread.sleep(4000);
		
		
	}
	
 	
 	
 	
 	
 	public static void UploadTemplateDifferentExcelSheet( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(113);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileTemplateAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonTemplateAC().click();
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
	}
	
 	
 	
 	
 	public static void UploadTemplatePdf( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(114);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileTemplateAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonTemplateAC().click();
		
        Thread.sleep(39000);
		
		
		Locator.DownloadErrorFileTemplate().click();
		Thread.sleep(5000);
		
		String fNotFound = Locator.DownloadFileNotFound().getText();
		
		test.log(LogStatus.PASS,  fNotFound );
		

		Thread.sleep(4000);
		
	}
	
 	
 	
 	
 	
 	public static void UploadTemplateVideo( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(115);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileTemplateAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonTemplateAC().click();
		//Thread.sleep(3000);
		
		//WebWait wait = new WebWait(, 5000);
        Thread.sleep(60350);
		
		
		Locator.DownloadErrorFileTemplate().click();
		Thread.sleep(5000);
		
		String fNotFound = Locator.DownloadFileNotFound().getText();
		
		test.log(LogStatus.PASS,  fNotFound );
		

		Thread.sleep(4000);
		
	}
	
 	
 	///////////////////////////////////
 	
 	
 	
 	public static void AddUserInvalidEmail( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
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
		
		row0 = sheet.getRow(116);
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
		Thread.sleep(20000);
		
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Not Accept This Format Of Email Id - avant@is@tlregtech.com = " + t2 );
			
			Thread.sleep(2000);
			ac1.accept();
			Thread.sleep(5000);
			
			Locator.AddUserEmail().clear();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(117);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.UserSubmitButton().click();
			Thread.sleep(20000);
			
			 Alert ac11=getDriver().switchTo().alert();
				
				String t21=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS," Not Accept This Format Of Email Id - tlregtech@ com = " +  t21 );
				
				Thread.sleep(2000);
				ac11.accept();
				Thread.sleep(5000);
				
				Locator.AddUserEmail().clear();
				Thread.sleep(2000);
				
				row0 = sheet.getRow(118);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(2000);
				
				Locator.UserSubmitButton().click();
				Thread.sleep(20000);
				
				 Alert ac12=getDriver().switchTo().alert();
					
					String t22=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, "Not Accept This Format Of Email Id - avantis@ tlregtech com = " + t22 );
					
					Thread.sleep(2000);
					ac12.accept();
					Thread.sleep(5000);
			
					Locator.AddUserEmail().clear();
					Thread.sleep(2000);
					
					row0 = sheet.getRow(119);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
					Thread.sleep(2000);
					
					Locator.UserSubmitButton().click();
					Thread.sleep(20000);
					
					 Alert ac13=getDriver().switchTo().alert();
						
						String t23=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS, "Not Accept This Format Of Email Id - avantis@ tlregtech = " + t23 );
						
						Thread.sleep(2000);
						ac13.accept();
						Thread.sleep(5000);
						
						
						
						Locator.AddUserEmail().clear();
						Thread.sleep(2000);
						
						row0 = sheet.getRow(120);
						c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
						Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
						Thread.sleep(2000);
						
						Locator.UserSubmitButton().click();
						Thread.sleep(20000);
						
						 Alert ac14=getDriver().switchTo().alert();
							
							String t24=getDriver().switchTo().alert().getText();
							
							test.log(LogStatus.PASS, " Not Accept This Format Of Email Id - avantis@ " + t24 );
							
							Thread.sleep(2000);
							ac14.accept();
							Thread.sleep(5000);
						
							Locator.AddUserEmail().clear();
							Thread.sleep(2000);
							
							row0 = sheet.getRow(121);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
							Thread.sleep(2000);
							
							Locator.UserSubmitButton().click();
							Thread.sleep(20000);
							
							 Alert ac15=getDriver().switchTo().alert();
								
								String t25=getDriver().switchTo().alert().getText();
								
								test.log(LogStatus.PASS, "Not Accept This Format Of Email Id- tlregtech@avantis. Com. " + t25 );
								
								Thread.sleep(2000);
								ac15.accept();
								Thread.sleep(5000);
							
							
								Locator.AddUserEmail().clear();
								Thread.sleep(2000);
								
								row0 = sheet.getRow(122);
								c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
								Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
								Thread.sleep(2000);
								
								Locator.UserSubmitButton().click();
								Thread.sleep(20000);
								
								 Alert ac16=getDriver().switchTo().alert();
									
									String t26=getDriver().switchTo().alert().getText();
									
									test.log(LogStatus.PASS, "Not Accept This Format Of Email Id - avan#tis@tlregtech.com - " + t26 );
									
									Thread.sleep(2000);
									ac16.accept();
									Thread.sleep(5000);
								
								
									Locator.AddUserEmail().clear();
									Thread.sleep(2000);
									
									row0 = sheet.getRow(123);
									c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
									Locator.AddUserEmail().sendKeys(c1.getStringCellValue()); // Writing Task title
									Thread.sleep(2000);
									
									Locator.UserSubmitButton().click();
									Thread.sleep(20000);
									
									 Alert ac17=getDriver().switchTo().alert();
										
										String t27=getDriver().switchTo().alert().getText();
										
										test.log(LogStatus.PASS, "Not Accept This Format Of Email Id - avantis-@tlregtech.com - " + t27 );
										
										Thread.sleep(2000);
										ac17.accept();
										Thread.sleep(2000);
								
								
								
								
		
		Locator.CloseUserPage().click();
		Thread.sleep(2000);
		
	}
	
 	
 	
 	
 	public static void AddUserInvalidContact( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
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
		
		
		row0 = sheet.getRow(124);
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
		Thread.sleep(20000);
		
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " Nine digit Contact No. - 983654321 = " + t2 );
			
			Thread.sleep(2000);
			ac1.accept();
			Thread.sleep(5000);
			
			Locator.AddUserContact().clear();
			Thread.sleep(2000);
 	
			row0 = sheet.getRow(125);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddUserContact().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.UserSubmitButton().click();
			Thread.sleep(15000);
			
 	
            Alert ac11=getDriver().switchTo().alert();
			
			String t21=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " Eleven digit Contact No. - 95767432100 = " + t21 );
			
			Thread.sleep(2000);
			ac11.accept();
			Thread.sleep(5000);
 	
			Locator.AddUserContact().clear();
			Thread.sleep(2000);
 	
			row0 = sheet.getRow(126);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddUserContact().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.UserSubmitButton().click();
			Thread.sleep(15000);
 	
            Alert ac12=getDriver().switchTo().alert();
			
			String t22=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " Contact No. - 9 6 1 2 5 7 3 3 8 0 = " + t22 );
			
			Thread.sleep(2000);
			ac12.accept();
			Thread.sleep(5000);
			
			Locator.AddUserContact().clear();
			Thread.sleep(2000);
 	
			row0 = sheet.getRow(127);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddUserContact().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.UserSubmitButton().click();
			Thread.sleep(15000);
 	
            Alert ac13=getDriver().switchTo().alert();
			
			String t23=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, " Contact No. - 1254512899 = " + t23 );
			
			Thread.sleep(2000);
			ac13.accept();
			Thread.sleep(5000);
 	
 	
 	
			Locator.CloseUserPage().click();
			Thread.sleep(2000);
 	
 	
 	

	
	}
 	
 	
 	
 	
 	
 	public static void UploadCMFTabDifferentSheetName( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		
		row0 = sheet.getRow(113);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileCM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonCM().click();
		Thread.sleep(3000);
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
	}
	
 	
 	
 	
 	
 	
 	public static void UploadCMFTabPdf( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		
		row0 = sheet.getRow(114);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileCM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonCM().click();
		Thread.sleep(3000);
		
		Thread.sleep(20000);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
	}
	
 	
 	
 	
 	
 	public static void UploadCMFTabVideo( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		
		row0 = sheet.getRow(115);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileCM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.UploadButtonCM().click();
		
		
		Thread.sleep(60300);
		
		 Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(20000);
			ac2.accept();
		
			Thread.sleep(4000);
		
	}
	
 	
 	
 	
 	
 	public static void AddContractorsInvalidEmail( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		
		
		row0 = sheet.getRow(116);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		
		row0 = sheet.getRow(26);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		Thread.sleep(4000);
		Locator.AddContractorType().click();
		Thread.sleep(4000);
		
		row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.AddContractorTypeCT().click();
		
		
		//Locator.AddContractorTypeuser().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SubmitContractor().click();
		
		
		Thread.sleep(5000);
		 Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Not Accept This Format Of Email Id - avant@is@tlregtech.com = " + t2 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(3000);
			
	 
			Locator.AddContractorSPOCMail().clear();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(117);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
			
		
			Locator.SubmitContractor().click();
			
			Thread.sleep(5000);
			 Alert ac11=getDriver().switchTo().alert();
				
				String t21=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, " Not Accept This Format Of Email Id - tlregtech@ com = " + t21 );
				
				Thread.sleep(4000);
				ac11.accept();
				
				Thread.sleep(3000);
		
				Locator.AddContractorSPOCMail().clear();
				Thread.sleep(2000);
				
				row0 = sheet.getRow(118);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
				
			
				Locator.SubmitContractor().click();
				
				Thread.sleep(5000);
				 Alert ac12=getDriver().switchTo().alert();
					
					String t22=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, " Not Accept This Format Of Email Id - avantis@ tlregtech com " + t22 );
					
					Thread.sleep(4000);
					ac12.accept();
					
					Thread.sleep(3000);
					
					
					Locator.AddContractorSPOCMail().clear();
					Thread.sleep(2000);
					
					row0 = sheet.getRow(119);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
					
				
					Locator.SubmitContractor().click();
					
					Thread.sleep(5000);
					 Alert ac13=getDriver().switchTo().alert();
						
						String t23=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS, " Not Accept This Format Of Email Id - avantis@ tlregtech = " + t23 );
						
						Thread.sleep(4000);
						ac13.accept();
						
						Thread.sleep(3000);
					
					
						Locator.AddContractorSPOCMail().clear();
						Thread.sleep(2000);
						
						row0 = sheet.getRow(120);
						c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
						Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
						
					
						Locator.SubmitContractor().click();
						
						Thread.sleep(5000);
						 Alert ac14=getDriver().switchTo().alert();
							
							String t24=getDriver().switchTo().alert().getText();
							
							test.log(LogStatus.PASS, " Not Accept This Format Of Email Id - avantis@ = " + t24 );
							
							Thread.sleep(4000);
							ac14.accept();
							
							Thread.sleep(3000);
					
					
					
							Locator.AddContractorSPOCMail().clear();
							Thread.sleep(2000);
							
							row0 = sheet.getRow(121);
							c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
							Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
							
						
							Locator.SubmitContractor().click();
							
							Thread.sleep(5000);
							 Alert ac15=getDriver().switchTo().alert();
								
								String t25=getDriver().switchTo().alert().getText();
								
								test.log(LogStatus.PASS, " Not Accept This Format Of Email Id - tlregtech@avantis. Com. = " + t25 );
								
								Thread.sleep(4000);
								ac15.accept();
								
								Thread.sleep(3000);
					
					
					
								Locator.AddContractorSPOCMail().clear();
								Thread.sleep(2000);
								
								row0 = sheet.getRow(122);
								c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
								Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
								
								Thread.sleep(1000);
								Locator.AddContractorSPOCContact().clear();
								Thread.sleep(2000);
								
								row0 = sheet.getRow(128);
								c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
								Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
								Thread.sleep(3000);
								
								
							
								Locator.SubmitContractor().click();
								
								Thread.sleep(5000);
								 Alert ac16=getDriver().switchTo().alert();
									
									String t26=getDriver().switchTo().alert().getText();
									
									test.log(LogStatus.PASS, " Not Accept This Format Of Email Id - avan#tis@tlregtech.com  = " + t26 );
									
									Thread.sleep(4000);
									ac16.accept();
									
									Thread.sleep(3000);
					
					
					
									Locator.AddContractorSPOCMail().clear();
									Thread.sleep(2000);
									
									row0 = sheet.getRow(123);
									c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
									Locator.AddContractorSPOCMail().sendKeys(c1.getStringCellValue()); // Writing Task title
									
									Thread.sleep(1000);
									Locator.AddContractorSPOCContact().clear();
									Thread.sleep(2000);
									
									row0 = sheet.getRow(129);
									c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
									Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
									Thread.sleep(3000);
								
									Locator.SubmitContractor().click();
									
									Thread.sleep(5000);
									 Alert ac17=getDriver().switchTo().alert();
										
										String t27=getDriver().switchTo().alert().getText();
										
										test.log(LogStatus.PASS, " Not Accept This Format Of Email Id - avantis-@tlregtech.com = " + t27 );
										
										Thread.sleep(4000);
										ac17.accept();
										
										Thread.sleep(3000);
					
					
		
	}
	
	
 	
 	
 	public static void AddContractorsInvalidContacts( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		
		row0 = sheet.getRow(124);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
		
		Thread.sleep(4000);
		Locator.AddContractorType().click();
		Thread.sleep(4000);
		
		row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.AddContractorTypeSearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		
		Locator.AddContractorTypeCT().click();
		Thread.sleep(3000);
		
	//	Locator.AddContractorTypeuser().click();
	//	Thread.sleep(3000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.NatureOfWorkContractor().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.SubmitContractor().click();
		
		
		Thread.sleep(5000);
		 Alert ac14=getDriver().switchTo().alert();
			
			String t24=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, "Invalid Contact Number - 983654321 = " + t24 );
			
			Thread.sleep(4000);
			ac14.accept();
			
			Thread.sleep(3000);
	 
			Locator.AddContractorSPOCContact().clear();
			Thread.sleep(1000);
			
			row0 = sheet.getRow(125);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.SubmitContractor().click();
			Thread.sleep(20000);
			 Alert ac15=getDriver().switchTo().alert();
				
				String t25=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, "Invalid Contact Number- 95767432100 = " + t25 );
				
				Thread.sleep(4000);
				ac15.accept();
				
				Thread.sleep(3000);
		
		
				Locator.AddContractorSPOCContact().clear();
				Thread.sleep(1000);
				
				row0 = sheet.getRow(126);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
				Locator.SubmitContractor().click();
		
				Thread.sleep(5000);
				 Alert ac16=getDriver().switchTo().alert();
					
					String t26=getDriver().switchTo().alert().getText();
					
					test.log(LogStatus.PASS, " Invalid Contact Number- 9 6 1 2 5 7 3 3 8 0 0 0 = " + t26 );
					
					Thread.sleep(4000);
					ac16.accept();
					
					Thread.sleep(3000);
				
				
				
					Locator.AddContractorSPOCContact().clear();
					Thread.sleep(1000);
					
					row0 = sheet.getRow(127);
					c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
					Locator.AddContractorSPOCContact().sendKeys(c1.getStringCellValue()); // Writing Task title
					Thread.sleep(2000);
					Locator.SubmitContractor().click();
					Thread.sleep(5000);
					 Alert ac17=getDriver().switchTo().alert();
						
						String t17=getDriver().switchTo().alert().getText();
						
						test.log(LogStatus.PASS, " Invalid Contact Number-125451 = " + t17 );
						
						Thread.sleep(4000);
						ac17.accept();
						
						Thread.sleep(3000);
				
				
			
		
	}
	
	
 	
 	
 	public static void UploadEntityMandatoryDataNotFilled( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(5000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(130);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(5000);
	
	Locator.DownloadErrorFile().click();
	Thread.sleep(5000);
	
	/*
	
	if(Locator.UploadButton().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.UploadButton().click();
			test.log(LogStatus.PASS, " File Not Upload " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Not Upload "  );
			
		}
		
		*/
	Thread.sleep(1000);
		
	}
	
	
 	
 	
 	
 	public static void UploadUserNotFilledMandatoryData( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
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
		
		row0 = sheet.getRow(131);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
	//	Locator.SubmitUploadUser().click();
	//	Thread.sleep(20000);
		
		if(Locator.SubmitUploadUser().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.SubmitUploadUser().click();
			test.log(LogStatus.PASS, " File Not Upload " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Not Upload "  );
			
		}
		
	Thread.sleep(1000);
	 	
			
			
		
	}
	
 	
 	
 	
 	
 	
 	public static void UploadProjectNotFillingMandatoryData( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(132);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputProject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
	//	Locator.ProjectUploadButton().click();
		
		if(Locator.ProjectUploadButton().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ProjectUploadButton().click();
			test.log(LogStatus.PASS, " File Not Upload " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Not Upload "  );
			
		}
		
	Thread.sleep(1000);
			
            
           
		
	}
	
 	
 	
 	
 	
 	public static void UploadContractorCTNotFillingMandatoryData( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(133);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FileInputCT().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		//Locator.UploadSubmitCT().click();
		
		
		
		if(Locator.UploadSubmitCT().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.UploadSubmitCT().click();
			test.log(LogStatus.PASS, " File Not Upload " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Not Upload "  );
			
		}
			
		Thread.sleep(1000);		

			
		
			
	}
	

 	
 	public static void UploadContractorProjectMappingNotFilledMandatoryData( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
			row0 = sheet.getRow(134);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.UploadContractorProjectMappingFileCT().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			//Locator.UploadContractorProjectMappingUploadBCT().click();
			
			if(Locator.UploadContractorProjectMappingUploadBCT().isEnabled())
			{
				
				Thread.sleep(2000);
				Locator.UploadContractorProjectMappingUploadBCT().click();
				test.log(LogStatus.PASS, " File Not Upload " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " File Not Upload "  );
				
			}
				
			Thread.sleep(1000);	
		
		
	}
	
 	
 	
 	
 	public static void UploadActAndComplianceNotFillingMandatoryData( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(135);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.SelectFileActAndCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
	//	Locator.UploadButtonAC().click();
	//	Thread.sleep(20000);
		
		
		if(Locator.UploadButtonAC().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.UploadButtonAC().click();
			test.log(LogStatus.PASS, " File Not Upload " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Not Upload "  );
			
		}
			
		Thread.sleep(1000);
			
		
	
		
	}
	
 	
 	
 	public static void UploadComplianceNotFilledMandatoryData( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(136);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUploadCompliance().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		
		//Locator.ButtonComplianceUploadAC().click();
		
		
		if(Locator.ButtonComplianceUploadAC().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.ButtonComplianceUploadAC().click();
			test.log(LogStatus.PASS, " File Not Upload " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Not Upload "  );
			
		}
			
		Thread.sleep(1000);
		
		
	}
	
	
 	
 	
 	public static void UploadTemplateNotFillingMandatoryData( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		row0 = sheet.getRow(137);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileTemplateAC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
	//	Locator.UploadButtonTemplateAC().click();
		
		if(Locator.UploadButtonTemplateAC().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.UploadButtonTemplateAC().click();
			test.log(LogStatus.PASS, " File Not Upload " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Not Upload "  );
			
		}
			
		Thread.sleep(1000);
		
	}
	
	
 	
 	
 	public static void UploadCMFTabNotFillingMandtoryData( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		
		
		row0 = sheet.getRow(138);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileCM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
	//	Locator.UploadButtonCM().click();
	//	Thread.sleep(3000);
		
		if(Locator.UploadButtonCM().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.UploadButtonCM().click();
			test.log(LogStatus.PASS, " File Not Upload " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Not Upload "  );
			
		}
			
		Thread.sleep(1000);
		
	}
	
 	
 	/////////////////////Multiple Filter 
 	
 	
 	
 	
 	public static void ProjectMasterMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
 		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.ProjectButton().click();
		Thread.sleep(2000);
		
		
		Locator.LocationProjectMaster().click();
		Thread.sleep(2000);
		Locator.LocationProjectMasterExpand().click();
		Thread.sleep(2000);
        String locationtext =Locator.LocationProjectMasterDD().getText();
       Thread.sleep(2000);
       Locator.LocationProjectMasterDD().click();
       Thread.sleep(2000);
       Locator.LocationProjectMaster().click();
       Thread.sleep(3000);
       
          /*
       Locator.CatogaryProjectMaster().click();
       Thread.sleep(2000);
       String catogaryText =Locator.CatogaryProjectMasterDD().getText();
       Thread.sleep(2000);
       Locator.CatogaryProjectMasterDD().click();
       Thread.sleep(2000);
       Locator.CatogaryProjectMaster().click();
       Thread.sleep(2000);
       */
       
       Locator.DirectorProjectMaster().click();
       Thread.sleep(2000);
       String directorText =Locator.DirectorProjectMasterDD().getText();
       Thread.sleep(2000);
       Locator.DirectorProjectMasterDD().click();
       Thread.sleep(2000);
       Locator.DirectorProjectMaster().click();
       Thread.sleep(2000);
       
       
       Locator.HeadProjectMaster().click();
       Thread.sleep(2000);
       String HeadText =Locator.HeadProjectMasterDD().getText();
       Thread.sleep(2000);
       Locator.HeadProjectMasterDD().click();
       Thread.sleep(2000);
       Locator.HeadProjectMaster().click();
       Thread.sleep(2000);
       
       Locator.StatusProjectMaster().click();
       Thread.sleep(2000);
       String Statustext =Locator.StatusProjectMasterDD().getText();
       Thread.sleep(2000);
       Locator.StatusProjectMasterDD().click();
       Thread.sleep(2000);
       Locator.StatusProjectMaster().click();
       Thread.sleep(2000);
       
       
        List<String> li=new ArrayList<String>();
        
        li.add(locationtext);
      //  li.add(catogaryText);
        li.add(directorText);
        li.add(HeadText);
        li.add(Statustext);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
	//	filter.add("Catogary");
		filter.add("Project Director");
		filter.add("Project Head");
		filter.add("Status");	
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> locationcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> projectdirectorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> projectheadcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[5]"));
	//	List<WebElement> frequencycol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]"));
		List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[6]"));
		
		
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
					raw.addAll(projectdirectorcol);
				}
			else if(i==2)
			{
				raw.addAll(projectheadcol);
			}
				
			else if(i==3)
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

		
	
		
	}
 	
 	
 	public static void ContractorMasterMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
 		//Locator.MasterButton().click();
		Thread.sleep(2000);
		Locator.Contractortab().click();
		Thread.sleep(2000);
		
		
		Locator.LocationProjectMaster().click();
		Thread.sleep(2000);
		Locator.LocationProjectMasterExpand().click();
		Thread.sleep(2000);
        String locationtext =Locator.LocationProjectMasterDD().getText();
       Thread.sleep(2000);
       Locator.LocationProjectMasterDD().click();
       Thread.sleep(2000);
       Locator.LocationProjectMaster().click();
       Thread.sleep(3000);
       
       Locator.ContractorProjectMaster1().click();
       Thread.sleep(2000);
       String Projecttext =Locator.ContractorMasterProjectDD11().getText();
       Thread.sleep(2000);
       Locator.ContractorMasterProjectDD11().click();
       Thread.sleep(2000);
       Locator.ContractorProjectMaster1().click();
       Thread.sleep(2000);
       
       
        List<String> li=new ArrayList<String>();
        
        li.add(locationtext);
        li.add(Projecttext);
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("Project");	
		
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> locationcol=getDriver().findElements(By.xpath("//*[@id=\"gridContractor\"]/div[2]/table/tbody/tr[1]/td[4]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridContractor\"]/div[2]/table/tbody/tr[1]/td[2]"));
		
		
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
 	
 	
 	
 	
 	public static void AddNewComplianceFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
 		Thread.sleep(2000);
		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
		/*
		Locator.LocationReport().click();
		Thread.sleep(2000);
		Locator.LocationProjectMasterExpand().click();
		Thread.sleep(2000);
        String locationtext =Locator.LocationProjectMasterDD().getText();
       Thread.sleep(2000);
       Locator.LocationProjectMasterDD().click();
       Thread.sleep(2000);
       Locator.LocationReport().click();
       Thread.sleep(4000);
       */
       Locator.ProjectAA1().click();
       Thread.sleep(2000);
       String Projecttext =Locator.ContractorMasterProjectDD11().getText();
       Thread.sleep(2000);
       Locator.ContractorMasterProjectDD11().click();
       Thread.sleep(2000);
       Locator.ProjectAA1().click();
       Thread.sleep(2000);
       
       
       Locator.ComplianceMappingTabCompliance().click();
       Thread.sleep(2000);
       String Contractortext =Locator.ComplianceMappingTabComplianceDD().getText();
       Thread.sleep(2000);
       Locator.ComplianceMappingTabComplianceDD().click();
       Thread.sleep(2000);
     //  Locator.ComplianceMappingTabCompliance().click();
       Thread.sleep(3000);
       
       
       Locator.ComplianceMappingTabTemplate().click();
       Thread.sleep(2000);
       String Templatetext =Locator.ComplianceMappingTabTemplateDD().getText();
       Thread.sleep(2000);
       Locator.ComplianceMappingTabTemplateDD().click();
       Thread.sleep(2000);
     //  Locator.ComplianceMappingTabTemplate().click();
       Thread.sleep(2000);
       
       
       
        List<String> li=new ArrayList<String>();
        
      //  li.add(locationtext);
        li.add(Projecttext);
        li.add(Contractortext);
        li.add(Templatetext);
        
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
	//	filter.add("Location");
		filter.add("Project");	
		filter.add("Contractor");
		filter.add("Template");
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
	//	List<WebElement> locationcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[1]"));
		List<WebElement> Contractorcol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[2]"));
		List<WebElement> templatecol=getDriver().findElements(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[3]"));
		
		
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
					raw.addAll(Contractorcol);
				}
			
			else if(i==2)
			{
				raw.addAll(templatecol);
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
	
	
 	
 	
 	public static void ASMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
 		Thread.sleep(3000);
		Locator.AuditScheduling().click();
		Thread.sleep(3000);
		
		Locator.LocationProjectMasterAA().click();
		Thread.sleep(2000);
		Locator.LocationProjectMasterExpand().click();
		Thread.sleep(2000);
        String locationtext =Locator.ASLocationFilterDD().getText();
       Thread.sleep(2000);
       Locator.ASLocationFilterDD().click();
      // Thread.sleep(2000);
     //  Locator.LocationProjectMasterAA().click();
       Thread.sleep(3000);
       
       Locator.Selectproject().click();
       Thread.sleep(2000);
       String Projecttext =Locator.ASProjectFilterDD().getText();
       Thread.sleep(2000);
       Locator.ASProjectFilterDD().click();
   //    Thread.sleep(2000);
    //   Locator.ContractorProjectMaster1().click();
       Thread.sleep(2000);
       
       
       
       
        List<String> li=new ArrayList<String>();
        
        li.add(locationtext);
        li.add(Projecttext);
        
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("Project");	
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> locationcol=getDriver().findElements(By.xpath("//*[@id='gridScheduled']/div[2]/table/tbody/tr[1]/td[2]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id='gridScheduled']/div[2]/table/tbody/tr[1]/td[3]"));
		
		
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
	
 	
 	
 	
 	
 	
 	public static void AAMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
 		Thread.sleep(3000);
		Locator.AuditAssignment().click();
		Thread.sleep(3000);
		
		Locator.LocationProjectMasterAA().click();
		Thread.sleep(2000);
		Locator.LocationProjectMasterExpand().click();
		Thread.sleep(2000);
        String locationtext =Locator.ASLocationFilterDD().getText();
       Thread.sleep(2000);
       Locator.ASLocationFilterDD().click();
      // Thread.sleep(2000);
     //  Locator.LocationProjectMasterAA().click();
       Thread.sleep(3000);
       
       Locator.Selectproject().click();
       Thread.sleep(2000);
       String Projecttext =Locator.ProjectDD().getText();
       Thread.sleep(2000);
       Locator.ProjectDD().click();
   //    Thread.sleep(2000);
    //   Locator.ContractorProjectMaster1().click();
       Thread.sleep(2000);
       
       
       Locator.SelectAuditorAA().click();
       Thread.sleep(2000);
       String Auditortext =Locator.SelectAuditorAADD().getText();
       Thread.sleep(2000);
       Locator.SelectAuditorAADD().click();
       Thread.sleep(2000);
     //  Locator.SelectAuditorAA().click();
     //  Thread.sleep(2000);
       
       
        List<String> li=new ArrayList<String>();
        
        li.add(locationtext);
        li.add(Projecttext);
        li.add(Auditortext);
        
        
        
        Thread.sleep(3000);
        
		List<String> filter=new ArrayList<String>();	
		filter.add("Location");
		filter.add("Project");
		filter.add("Auditor Name");
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator.GridCount().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);
	
		List<WebElement> locationcol=getDriver().findElements(By.xpath("//*[@id=\"gridScheduled\"]/div[2]/table/tbody/tr[1]/td[2]"));
		List<WebElement> projectcol=getDriver().findElements(By.xpath("//*[@id=\"gridScheduled\"]/div[2]/table/tbody/tr[1]/td[3]"));
		List<WebElement> auditornamecol=getDriver().findElements(By.xpath("//*[@id=\"gridScheduled\"]/div[2]/table/tbody/tr[1]/td[5]"));

		
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
				raw.addAll(auditornamecol);
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
	

 	
 	
 	
 	
 	public static void ReportMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
 		Thread.sleep(5000);
		Locator.Report().click();
		Thread.sleep(3000);
		
		Locator.LocationReport().click();
		Thread.sleep(2000);
		Locator.LocationProjectMasterExpand().click();
		Thread.sleep(2000);
		Locator.VCALegalEntityExpandAA().click();
		Thread.sleep(3000);
		String locationtext =Locator.VCALegalEntityAADD().getText();
	    Thread.sleep(5000);
	   Locator.VCALegalEntityAADD().click();
       Thread.sleep(2000);
       Locator.LocationReport().click();
	   Thread.sleep(2000);
       
       
       Locator.ProjectReport().click();
       Thread.sleep(2000);
       String Projecttext =Locator.ProjectReportDD().getText();
       Thread.sleep(2000);
       Locator.ProjectReportDD().click();
       Thread.sleep(2000);
       Locator.ProjectReport().click();
       Thread.sleep(2000);
       
       
       Locator.ReportTabContractor().click();
       Thread.sleep(2000);
       String contractortext =Locator.ReportTabContractorDD().getText();
       Thread.sleep(2000);
       Locator.ReportTabContractorDD().click();
       Thread.sleep(2000);
       Locator.ReportTabContractor().click();
       Thread.sleep(2000);
       
       
       
       
       Locator.ReportTabContractorType().click();
       Thread.sleep(2000);
       String contractorTypetext =Locator.ReportTabContractorTypeDD().getText();
       Thread.sleep(2000);
       Locator.ReportTabContractorTypeDD().click();
       Thread.sleep(2000);
       Locator.ReportTabContractorType().click();
       Thread.sleep(2000);
       
       Locator.ReportTabFequency().click();
       Thread.sleep(2000);
       String frequencytext =Locator.ReportTabFequencyDD().getText();
       Thread.sleep(2000);
       Locator.ReportTabFequencyDD().click();
       Thread.sleep(2000);
       Locator.ReportTabFequency().click();
       Thread.sleep(2000);
       
       
       Locator.ReportTabPeriod().click();
       Thread.sleep(2000);
       String periodtext =Locator.ReportTabPeriodDD().getText();
       Thread.sleep(2000);
       Locator.ReportTabPeriodDD().click();
       Thread.sleep(2000);
       Locator.ReportTabPeriod().click();
       Thread.sleep(2000);
       
       
       Locator.ReportTabStatus().click();
       Thread.sleep(2000);
       String statustext =Locator.ReportTabStatusDD().getText();
       Thread.sleep(2000);
       Locator.ReportTabStatusDD().click();
       Thread.sleep(2000);
       Locator.ReportTabStatus().click();
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

		Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
		String s = Locator.GridCount().getText();
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
	
	
	
 	public static void UploadProject1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
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
		Thread.sleep(5000);
		
		/*
		Locator.ErrorFile().click();
		Thread.sleep(19000);
		
		
 	
 	              
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
	            			 
	            			 test.log(LogStatus.PASS, lines.get(i));
	            			 
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
	              catch(IOException e) {
	            	  
	            	  e.printStackTrace();
	              }
	              
 	             */ 
 	    
	
	}
 	
 	
 	
 	
 	
 	
 	public static void UploadEntityWithoutEnterTwoMandatoryField1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(139);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(5000);
	
	Locator.ErrorFile().click();
	Thread.sleep(19000);
		/*
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
			 
			 test.log(LogStatus.PASS, lines.get(i));
			 
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
  catch(IOException e) {
	  
	  e.printStackTrace();
  }
  */
   
     
		
	}
	
	
 	
 	public static void UploadEntityAcceptDiffrentSubEntityTypeField( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(140);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(5000);
	
	Locator.ErrorFile().click();
	Thread.sleep(19000);
		/*
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
			 
			 test.log(LogStatus.PASS, lines.get(i));
			 
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
  catch(IOException e) {
	  
	  e.printStackTrace();
  }
  */
   
		
	}
	
	
 	
 	public static void UploadEntityAcceptDifferentTypeField( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(141);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(5000);
	
	Locator.ErrorFile().click();
	Thread.sleep(19000);
		/*
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
			 
			 test.log(LogStatus.PASS, lines.get(i));
			 
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
  catch(IOException e) {
	  
	  e.printStackTrace();
  }
  
   */
		
	}
	
	
 	
 	
 	public static void UploadEntityAcceptDifferentLegalEntityTypeField( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(142);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(5000);
	
	Locator.ErrorFile().click();
	Thread.sleep(19000);
		/*
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
			 
			 test.log(LogStatus.PASS, lines.get(i));
			 
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
  catch(IOException e) {
	  
	  e.printStackTrace();
  }
  
   */
     
		
	}
	
	
 	
 	
 	
 	
 	public static void UploadEntityAcceptDifferentIndustryTypeField( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(143);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(5000);
	
	Locator.ErrorFile().click();
	Thread.sleep(19000);
		/*
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
			 
			 test.log(LogStatus.PASS, lines.get(i));
			 
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
  catch(IOException e) {
	  
	  e.printStackTrace();
  }
  */
   
     
		
	}
	
	
 	
 	public static void UploadEntityAcceptEmailFieldNumbers( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
	Locator.UploadEntity().click();
	Thread.sleep(3000);

	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
			
	
	row0 = sheet.getRow(144);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.UploadButton().click();
	Thread.sleep(5000);
	
	Locator.ErrorFile().click();
	Thread.sleep(19000);
		/*
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
			 
			 test.log(LogStatus.PASS, lines.get(i));
			 
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
  catch(IOException e) {
	  
	  e.printStackTrace();
  }
  */
   
		
	}
	
 	
 	
 	
 	public static void UploadUserUserMastercontactfieldaccepttext( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
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
		
		row0 = sheet.getRow(145);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(20000);
		
		Locator.ErrorFile().click();
		Thread.sleep(19000);
			/*
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
				 
				 test.log(LogStatus.PASS, lines.get(i));
				 
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
	  catch(IOException e) {
		  
		  e.printStackTrace();
	  }
	  */
	 	
			
			
		
	}
	
 	
 	
 	public static void UserMasterEmailIdfieldAcceptnumbers( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
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
		
		row0 = sheet.getRow(146);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(20000);
		
		Locator.ErrorFile().click();
		Thread.sleep(19000);
			/*
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
				 
				 test.log(LogStatus.PASS, lines.get(i));
				 
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
	  catch(IOException e) {
		  
		  e.printStackTrace();
	  }
	  
	 	*/
			
			
		
	}
 	
 	
 	
 	
 	public static void UserMasterrolefieldacceptdifferentname( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
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
		
		row0 = sheet.getRow(147);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(20000);
		
		Locator.ErrorFile().click();
		Thread.sleep(19000);
			
		 String filePath = "C:\\Users\\shitalb\\Downloads\\ErrorFile.txt";
	     
		 List<String> lines =new ArrayList<>();
		  /*
		 try{
		    BufferedReader reader = new BufferedReader(new FileReader(filePath));
		    String line;
		  
		  
		  while((line = reader.readLine()) != null) {

			 lines.add(line);
			  
		  }
	  
		 reader.close();
		 
		 if(lines.size() >= 2) {
			 
			 for(int i = 1; i < lines.size() - 1; i++) {
				 
				 test.log(LogStatus.PASS, lines.get(i));
				 
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
	  catch(IOException e) {
		  
		  e.printStackTrace();
	  }
	  */
	 	
			
			
		
	}
 	
 	
 	
 	
 	
 	
 	public static void UserMastertextfieldacceptnumbers( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
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
		
		row0 = sheet.getRow(148);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(20000);
		
		Locator.ErrorFile().click();
		Thread.sleep(19000);
			/*
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
				 
				 test.log(LogStatus.PASS, lines.get(i));
				 
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
	  catch(IOException e) {
		  
		  e.printStackTrace();
	  }
	  
	 	*/
			
			
		
	}
 	
 	
 	
 	public static void UserMasterwithoutenteringtwomandatoryfield( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException 
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
		
		row0 = sheet.getRow(149);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFileUser().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		
		Locator.SubmitUploadUser().click();
		Thread.sleep(20000);
		
		Locator.ErrorFile().click();
		Thread.sleep(19000);
			/*
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
				 
				 test.log(LogStatus.PASS, lines.get(i));
				 
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
	  catch(IOException e) {
		  
		  e.printStackTrace();
	  }
	  
	 	*/
			
			
		
	}
 	
 	
 	
 	
 	
 	public static void GridCountExcelCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
	//	WebWait wait = new WebWait(, 1000);
		Thread.sleep(3000);
		Locator.ComplianceMapping().click();
		Thread.sleep(6000);
		
        
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
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
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCM().click();
		Thread.sleep(9000);
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Compliance Mapping Report .xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	//sheet = workbook.getSheetAt(0);
	
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
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\Compliance Mapping Report .xlsx";
	
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
 
	


	    
 	public static void GridCountExcelCountMatchContractorMaster( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
//		WebWait wait = new WebWait(, 1000);
		Thread.sleep(3000);
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
		//Locator.ExportButtonCT().click();
		
        
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
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
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Report .xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	int rowCount = sheet.getLastRowNum();
	
	
	
	//int actualRowCount = rowCount-1;
	
	System.out.println("Row Count : "  + rowCount);
	    
	fis.close();
	
	if(count1 == rowCount)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+count1+" | Total records from Report = "+rowCount);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+count1+" | Total records from Excel Sheet = "+rowCount);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\Audit Report .xlsx";
	
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
 
	
	
 	
 	
 	public static void GridCountExcelCountMatchContractorMaster1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
	//	WebWait wait = new WebWait(, 1000);
		Thread.sleep(3000);
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		Locator.Contractortab().click();
		Thread.sleep(3000);
		//Locator.ExportButtonCT().click();
		
        
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
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
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Report .xlsx");
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
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\Audit Report .xlsx";
	
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
 	
 	
 	
 	public static void GridAndExcelCountMatchComplianceTab( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		//Locator.MasterButton().click();
		Thread.sleep(3000);
		
		Locator.ActAndComplianceMaster().click();
		Thread.sleep(6000);
		
		Locator.ComplienceButtonAC().click();
		Thread.sleep(3000);
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
        Thread.sleep(7000);
        Locator.readTotalItems11().click();
		String item = Locator.readTotalItems11().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
	
		if(compliancesCount.equalsIgnoreCase("to"))
		{
			Thread.sleep(5000);
		   item = Locator.readTotalItems11().getText();
			bits = item.split(" ");
        
		}
		
		Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Report .xlsx");
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
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\Audit Report .xlsx";
	
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
	
	
 	
 	
 	
 	public static void ReportTabGridAndExcelCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(5000);
		
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
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
		
		Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
 		Locator.ExportReportFR().click();
		Thread.sleep(9000);
		
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Status Report .xlsx");
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
	
	Thread.sleep(6000);
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\Audit Status Report .xlsx";
	
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
	
 	
 	
 	
 	public static void ReportTabGridAndExcelCountMatch1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(5000);
		
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
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
		
		Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);

Thread.sleep(1000);
File dir = new File("C:\\Users\\shitalb\\Downloads");
File[] dirContents = dir.listFiles();							//Counting number of files in directory before download 

Thread.sleep(1000);
Locator.ExportReportFR().click();
Thread.sleep(9000);					//Clicking on 'Excel Report' image.
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
}
else
{
	test.log(LogStatus.FAIL, "File doesn't downloaded successfully.");
}

}

 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	public static int ComplianceMappingTabCountMatch( ExtentTest test) throws InterruptedException, IOException
	{
 		Thread.sleep(2000);
 		Locator.ComplianceMapping().click();
		Thread.sleep(3000);
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
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
 		
 		Thread.sleep(200);
		File dir = new File("C:\\Users\\Shital Bhoyar\\Downloads");
		File[] dirContents = dir.listFiles();							//Counting number of files in directory before download 
		
		Thread.sleep(2000);
		Locator.clickNextPage1().sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
		Locator.ExportButtonCM().click();					//Clicking on 'Excel Report' image.
		
		
		Thread.sleep(9000);
		File dir1 = new File("C:\\Users\\Shital Bhoyar\\Downloads");
		File[] allFilesNew = dir1.listFiles();							//Counting number of files in directory after download
		
		if(dirContents.length < allFilesNew.length)
		{
			test.log(LogStatus.PASS, "File downloaded successfully.");
			
			File lastModifiedFile = allFilesNew[0];			//Storing any 0th index file in 'lastModifiedFile' file name.
		    for (int i = 1; i < allFilesNew.length; i++) 	//For loop till the number of files in directory.
		    {
		       if (lastModifiedFile.lastModified() < allFilesNew[i].lastModified()) 	//If allFilesNew[i] file is having large/latest time time of update then latest modified file be allFilesNew[i] file.
		       {
		           lastModifiedFile = allFilesNew[i];
		       }
		    }
			
			Thread.sleep(100);
			fis = new FileInputStream(lastModifiedFile);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);					//Retrieving first sheet of Workbook
			
			int no = sheet.getLastRowNum();
			Row row = sheet.getRow(no);
			Cell c1 = row.getCell(0);
			String records =c1.getStringCellValue();
			int SheetRecords=0;
			//SheetRecords = Integer.parseInt(records);
			try
			{
				SheetRecords = Integer.parseInt(records);
				
			}
			catch(Exception e)
			{
				
			}
			
//			if(flag == 0)
//			{
//				row = sheet.getRow(no-1);
//				c1 = row.getCell(0);
//				records = c1.getStringCellValue();
//				SheetRecords = Integer.parseInt(records);
//			}
			fis.close();
			
	
	
	
	if(count1 == SheetRecords)
			{
				//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
				test.log(LogStatus.PASS, "Total records from Grid = "+count1+" | Total records from Report = "+SheetRecords);
			}
			else
			{
				//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
				test.log(LogStatus.FAIL, "Total records from Grid = "+count1+" | Total records from Excel Sheet = "+SheetRecords);
			}
		}
		else
		{
			test.log(LogStatus.FAIL, "File doesn't downloaded successfully.");
		}
		
		return open;
	}
		
	
	
 	
	public static void GridAndExcelReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(4000);
		Locator.Report().click();
		Thread.sleep(5000);
		
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        /*
        Thread.sleep(7000);
        Locator.readTotalItems11().click();
		String item = Locator.readTotalItems11().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
	
		if(compliancesCount.equalsIgnoreCase("to"))
		{
			Thread.sleep(5000);
		   item = Locator.readTotalItems11().getText();
			bits = item.split(" ");
        
		}
		
		Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
 		Locator.ExportButtonCT().click();
		Thread.sleep(9000);
*/
		//////////////////////////////
	

//	js.executeScript("window.scrollBy(0,1000)");
	
	
	
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
//	CFOcountPOM.clickNextPage1(driver).sendKeys(Keys.PAGE_UP);
//	Thread.sleep(250);
	Locator.ReportExport().click();					//Clicking on 'Excel Report' image.
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
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}

 	

 	
 	
	
 	

