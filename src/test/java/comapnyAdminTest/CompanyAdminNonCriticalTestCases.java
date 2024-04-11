package comapnyAdminTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyAdmin.Method;
import login.BasePage;

public class CompanyAdminNonCriticalTestCases extends BasePage{
	
	
	
	public static WebDriver driver = null;		//WebDriver instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	public static List<String> lines = null;
	
	/*
	public static XSSFSheet ReadExcel() throws IOException
	{
		
		fis = new FileInputStream("E:\\VenderAuditProject\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	*/
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyAdminNonCritical.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Company Admin Login");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		
		initialization("company",0);
	/*
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);	

	
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,"company");		//Method of Login class to login user.
		*/
	}
	
	
	
	
	
	
//	@Test(priority = 1) 
	void EntityValidation() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Without Enter Data Verification");
		
		Method.validationEntity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

//	@Test(priority = 2) 
	void Validation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Without Enter Data in every Field Verification ");
		
		Method.Validation1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 3) 
	void UploadEntityBlankSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Without Enter Data File Upload Verification");
		
		Method.UploadEntityBlankSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 4) 
	void ValidationUser1() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - Without Enter Data For Every Field");
		
		Method.ValidationUser(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 5) 
	void UploadUserWithoutEnterData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Without Enter Data File Upload Verification");
		
		Method.UploadUserWithoutEnterData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 6) 
	void UploadProjectBlankSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Without Enter Data Upload File Verification ");
		
		Method.UploadProjectBlankSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	@Test(priority = 7) 
	void uploadContractorBlanksheet1() throws InterruptedException, IOException
	{
		test = extent.startTest("Contractor Master - Without Enter Data Upload File Verification");
		
		Method.uploadContractorBlanksheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 8) 
	void UploadContractorProjectMappingBlankSheet1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Contractor Master -  Without enter data Project Mapping File Upload Verification ");
		
		Method.UploadContractorProjectMapping(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 9) 
	void AddActWithState1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Add Act With State Verification");
		
		Method.AddActWithState(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 10) 
	void AddActWithDifferentState1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Add Act With Different State Verification");
		
		Method.AddActWithDifferentState(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 11) 
	void AddActDuplicate1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Add Duplicate Act With State Verification");
		
		Method.AddActDuplicate(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	@Test(priority = 12) 
	void AddActDuplicateForCentral1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Add Duplicate Act With Central Verification");
		
		Method.AddActDuplicateForCentral(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 13) 
	void UploadActWithsameAct1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Upload File With Same Act Verification");
		
		Method.UploadActWithsameAct(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 14) 
	void UploadeActBlankSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Without Enter Data File Upload Verification");
		
		Method.UploadeActBlankSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 15) 
	void AddDuplicateComplianceCentral1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Add  Duplicate Compliance For Central Verification");
		
		Method.AddDuplicateComplianceCentral(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 16) 
	void UploadBlankSheetComplianceAC1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Without Enter Data Compliance File Upload Verification");
		
		Method.UploadBlankSheetComplianceAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 17) 
	void UploadBlankSheetTemplateAC1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Without Enter Data Template File Upload Verification ");
		
		Method.UploadBlankSheetTemplateAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 18) 
	void DuplicateTemplateAC1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Add Duplicate Template Verification ");
		
		Method.DuplicateTemplateAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	@Test(priority = 19) 
	void UploadBlankSheetCM1() throws InterruptedException, IOException
	{
		test = extent.startTest("Compliance Mapping Tab - Without Enter Data File Upload Verification");
		
		Method.UploadBlankSheetCM(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	@Test(priority = 20) 
	void UploadEntityValidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Without inserting File upload verification  ");
		
		Method.UploadEntityValidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 21) 
	void UploadUservalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Without inserting File Upload Verification");
		
		Method.UploadUservalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 22) 
	void AddContractorsvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Without Enter data Add Contractor Verification");
		
		Method.AddContractorsvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 23) 
	void AddContractorsvalidationallfield1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Without Enter Data in every Field Verification");
		
		Method.AddContractorsvalidationallfield(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 24) 
	void AddManagementAssignmentvalidation11() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Without Enter data Add Management Assignment Verification");
		
		Method.AddManagementAssignmentvalidation1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 25) 
	void AddManagementAssignmentvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Without Enter Data in every Field Add Management Assignment Verification");
		
		Method.AddManagementAssignmentvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 26) 
	void UploadProjectvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Without inserting File Upload Verification");
		
		Method.UploadProjectvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 27) 
	void UploadContractorCTvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Without inserting File Upload Verification");
		
		Method.UploadContractorCTvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 28) 
	void UploadContractorProjectMappingSheetvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Without inserting Project Mapping File Upload Verification");
		
		Method.UploadContractorProjectMappingSheetvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	///////
	
	
	
	@Test(priority = 29) 
	void UploadeActvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Act - Without inserting File Upload Verification");
		
		Method.UploadeActvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 30) 
	void UploadCompliancevalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Compliance - Without inserting File Upload Verification");
		
		Method.UploadCompliancevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 31) 
	void UploadTemplatevalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Template - Without inserting File Upload Verification");
		
		Method.UploadTemplatevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 32) 
	void UploadCMFTabvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Compliance mapping Tab - Without inserting File Upload Verification");
		
		Method.UploadCMFTabvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 33) 
	void AddNewCompliancevalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Compliance mapping Tab - Add Compliance without selecting Project Verification");
		
		Method.AddNewCompliancevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 34) 
	void AuditSchedulevalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Audit Schedule Tab - 	Without selecting activation date Add Scheduled Verification");
		
		Method.AuditSchedulevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 35) 
	void AssignCompliencevalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Audit Assignment Tab - Without selecting Auditor Audit Assignment Verification");
		
		Method.AssignCompliencevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 36) 
	void AddSubEntity2validation21() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Without Entre Data Add Sub-Entity Verification");
		
		Method.AddSubEntity2validation2(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority = 37) 
	void AddSubEntity2validation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Without Entre For Particular Field Add Sub-Entity Verification");
		
		Method.AddSubEntity2validation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 38) 
	void AddCityvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" City Master - Without Entre City Name Add City Verification");
		
		Method.AddCityvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 39) 
	void AddLicenceTypevalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Licence Type Master - Without Entre Licence Name Add Add Licence Type Verification");
		
		Method.AddLicenceTypevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	//////////
	
	
	
	
	@Test(priority = 40) 
	void Addentity2validatinEmail1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Add Entity By Invalid EmailId Verification");
		
		Method.Addentity2validatinEmail(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 41) 
	void AddSubEntity2validationemail1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Add Sub-Entity By Invalid EmailId Verification");
		
		Method.AddSubEntity2validationemail(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 42) 
	void AddUserInvalidEmail1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Add User By Invalid Email Id Verification ");
		
		Method.AddUserInvalidEmail(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 43) 
	void AddUserInvalidContact1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Add User By Invalid Contact No. Verification ");
		
		Method.AddUserInvalidContact(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 44) 
	void AddContractorsInvalidEmail1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Add Contractor By Invalid Email Id Verification ");
		
		Method.AddContractorsInvalidEmail(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 45) 
	void AddLicenceCTvalidation11() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Without Enter Data Add Licence Verification ");
		
		Method.AddLicenceCTvalidation1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 46) 
	void AddLicenceCTvalidation21() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Add Licence - Without Enter Data For Every Field Verification ");
		
		Method.AddLicenceCTvalidation2(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 47) 
	void AddDataPointvalidation11() throws InterruptedException, IOException
	{
		test = extent.startTest(" Data Point Master - Without Enter Data For Every Field Add Data Point Verification ");
		
		Method.AddDataPointvalidation1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 48) 
	void AddDataPointvalidation12() throws InterruptedException, IOException
	{
		test = extent.startTest(" Data Point Master - Without Enter Data Add Data Point Verification ");
		
		Method.AddDataPointvalidation1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 49) 
	void AddActAndCompliencevalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Without Enter Data Add Act Verification ");
		
		Method.AddActAndCompliencevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 50) 
	void AddActAndCompliencevalidation21() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Without Enter For Particular Field Add Act Verification ");
		
		Method.AddActAndCompliencevalidation2(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 51) 
	void AddTemplateACvalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Template - Without Enter data Add Template Verification ");
		
		Method.AddTemplateACvalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 52) 
	void AddTemplateACvalidation21() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Template - Without Selecting Compliance Add Template Verification ");
		
		Method.AddTemplateACvalidation2(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 53) 
	void AddContractorTypevalidation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Type Master - Without Enter data Add Contractor Type Verification ");
		
		Method.AddContractorTypevalidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	
	@Test(priority = 54) 
	void UploadEntitydifferentExcelsheet1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Upload Entity With Different sheet Name Verification ");
		
		Method.UploadEntitydifferentExcelsheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 55) 
	void UploadUserDifferentExcelSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Upload User With Different Sheet Name Verification ");
		
		Method.UploadUserDifferentExcelSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 56) 
	void UploadProjectDifferentExcelSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Upload Project With Different Excel Sheet Verification ");
		
		Method.UploadProjectDifferentExcelSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 57) 
	void UploadContractorCTDifferentExcelSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Upload Contractor With Different Excel Sheet Name Verification ");
		
		Method.UploadContractorCTDifferentExcelSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 58) 
	void UploadContractorProjectMappingDifferentSheetName1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Upload Contractor Project-Mapping With different excel sheet name Verification ");
		
		Method.UploadContractorProjectMappingDifferentSheetName(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 59) 
	void UploadActAndComplianceDifferentExcelSheetName1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Upload Act With Different Excel Sheet Name Verification ");
		
		Method.UploadActAndComplianceDifferentExcelSheetName(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 60) 
	void UploadComplianceDifferentExcelSheetName1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master -Compliance- Upload File With Different Sheet Name Verification ");
		
		Method.UploadComplianceDifferentExcelSheetName(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 61) 
	void UploadTemplateDifferentExcelSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master -Template- Upload File With Different Sheet Name  Verification ");
		
		Method.UploadTemplateDifferentExcelSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	@Test(priority = 62) 
	void UploadCMFTabDifferentSheetName1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Compliance Mapping Tab - Upload File With Different Sheet Name Verification ");
		
		Method.UploadCMFTabDifferentSheetName(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 63) 
	void AddContractorsInvalidContacts1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Add Contractor By Invalid contact number verification ");
		
		Method.AddContractorsInvalidContacts(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 64) 
	void UploadEntityMandatoryDataNotFilled1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Upload Entity Without Filling Mandatory Field verification ");
		
		Method.UploadEntityMandatoryDataNotFilled(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 65) 
	void UploadUserNotFilledMandatoryData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Upload User Without Filling Mandatory Field verification ");
		
		Method.UploadUserNotFilledMandatoryData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 66) 
	void UploadProjectNotFillingMandatoryData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Upload Project Without Filling Mandatory Field verification ");
		
		Method.UploadProjectNotFillingMandatoryData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 67) 
	void UploadContractorCTNotFillingMandatoryData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Upload Contractor Without Filling Mandatory Field verification ");
		
		Method.UploadContractorCTNotFillingMandatoryData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 68) 
	void UploadContractorProjectMappingNotFilledMandatoryData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Upload Contractor Project-Mapping Without Filling Mandatory Field verification ");
		
		Method.UploadContractorProjectMappingNotFilledMandatoryData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 69) 
	void UploadActAndComplianceNotFillingMandatoryData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Upload Act Without Filling Mandatory Field verification ");
		
		Method.UploadActAndComplianceNotFillingMandatoryData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 70) 
	void UploadComplianceNotFilledMandatoryData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Upload Compliance Without Filling Mandatory Field verification ");
		
		Method.UploadComplianceNotFilledMandatoryData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 71) 
	void UploadTemplateNotFillingMandatoryData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Upload Compliance Without Filling Mandatory Field verification ");
		
		Method.UploadTemplateNotFillingMandatoryData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 72) 
	void UploadCMFTabNotFillingMandtoryData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Compliance Mapping Tab - Upload Compliance Without Filling Mandatory Field verification ");
		
		Method.UploadCMFTabNotFillingMandtoryData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	//Multifilter
	
	
	@Test(priority = 73) 
	void ProjectMasterMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Multiple Filter Verification ");
		
		Method.ProjectMasterMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 74) 
	void ContractorMasterMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Multiple Filter Verification ");
		
		Method.ContractorMasterMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 75) 
	void AddNewComplianceFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Compliance Mapping Tab - Multiple Filter Verification ");
		
		Method.AddNewComplianceFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 76) 
	void ASMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Audit Scheduled Tab - Multiple Filter Verification ");
		
		Method.ASMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 77) 
	void AAMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Audit Assignment Tab - Multiple Filter Verification ");
		
		Method.AAMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 78) 
	void ReportMultipleFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report Tab - Multiple Filter Verification ");
		
		Method.ReportMultipleFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 79) 
	void UploadEntityWithoutEnterTwoMandatoryField11() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Without Enter Two Mandatory Field File Upload Verification");
		
		Method.UploadEntityWithoutEnterTwoMandatoryField1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 80) 
	void UploadEntityAcceptDiffrentSubEntityTypeField1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Upload File With Enter Different Sub-Entity Type Verification");
		
		Method.UploadEntityAcceptDiffrentSubEntityTypeField(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 81) 
	void UploadEntityAcceptDifferentTypeField1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Upload File With Enter Different Entity Type Verification");
		
		Method.UploadEntityAcceptDifferentTypeField(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 82) 
	void UploadEntityAcceptDifferentLegalEntityTypeField1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Upload File With Enter Different Legal Entity Type Verification");
		
		Method.UploadEntityAcceptDifferentLegalEntityTypeField(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 83) 
	void UploadEntityAcceptDifferentIndustryTypeField1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Upload File With Enter Different Industry Type Verification");
		
		Method.UploadEntityAcceptDifferentIndustryTypeField(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 84) 
	void UploadEntityAcceptEmailFieldNumbers1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Upload File With Enter Numbers in EmailId Field Verification");
		
		Method.UploadEntityAcceptEmailFieldNumbers(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 85) 
	void UploadUserUserMastercontactfieldaccepttext1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Upload File With Enter text in contact Field Verification");
		
		Method.UploadUserUserMastercontactfieldaccepttext(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 86) 
	void UserMasterEmailIdfieldAcceptnumbers1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Upload File With Enter Numbers in EmailId Field Verification");
		
		Method.UserMasterEmailIdfieldAcceptnumbers(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 87) 
	void UserMasterrolefieldacceptdifferentname1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Upload File With Enter different name in role Field Verification");
		
		Method.UserMasterrolefieldacceptdifferentname(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 88) 
	void UserMastertextfieldacceptnumbers1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Upload File With Enter numbers in text Field Verification");
		
		Method.UserMastertextfieldacceptnumbers(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 89) 
	void UserMasterwithoutenteringtwomandatoryfield1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Upload File Without Enter two mandatory Field Verification");
		
		Method.UserMasterwithoutenteringtwomandatoryfield(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority = 90) 
	void UploadProject11() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master -  ");
		
		Method.UploadProject1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority = 91) 
	void GridCountExcelCountMatchContractorMaster11() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Grid and Excel sheet count match Verification ");
		
		Method.GridCountExcelCountMatchContractorMaster1(test, workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 92) 
	void GridAndExcelCountMatchComplianceTab1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance Master - Compliance - Grid and Excel sheet count match Verification ");
		
		Method.GridAndExcelCountMatchComplianceTab(test, workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 94) 
	void ReportTabGridAndExcelCountMatch1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report tab - Grid and Excel sheet count match Verification ");
		
		Method.ReportTabGridAndExcelCountMatch(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 95) 
	void downloadViewReportProject1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Tab - Project triangle - Download and View Button Verification ");
		
		Method.downloadViewReportProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		//driver.close();
  		closeBrowser();
  	}	

	
	
	
	
	
	
	
	

}
