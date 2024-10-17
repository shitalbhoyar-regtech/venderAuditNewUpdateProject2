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

import companyAdmin.CriticalMethod;
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

	
	public static XSSFSheet ReadExcel() throws IOException
	{
		
		fis = new FileInputStream("E:\\VenderAuditProject\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyAdminNonCritical.html",true);
		test = extent.startTest("Loging In --Company Admin Login(Non-Critical)");
		
		test.log(LogStatus.PASS, "Test Passed ");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		
		initialization("company",0);
	
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		/*
		login.Login.BrowserSetup(URL);	
*/
	
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		/*
		driver = login.Login.UserLogin(uname,password,"company");		//Method of Login class to login user.
		*/
	}
	
	//-------------Entity Master-------------------------
	
	@Test(priority = 1) 
	void Entity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Add Entity Verification ");
		
		CriticalMethod.Addentity2(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 2) 
	void EntityValidation() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Without Enter Data Verification");
		
		Method.validationEntity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	@Test(priority = 3) 
	void Validation1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Without Enter Data in every Field Verification ");
		
		Method.Validation1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 4) 
	void UpdateEntity11() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Update Entity Verification ");
		
		CriticalMethod.UpdateEntity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 5) 
	void Clear() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Clear Button Verification");
		
		CriticalMethod.ClearEntityButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 6) 
	void SubEntity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Add Sub Entity Verification ");
		
		CriticalMethod.AddSubEntity2(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 7) 
	void UpdateSubEntity1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Update Sub Entity Verification ");
		
		CriticalMethod.UpdateSubEntity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 8) 
	void DeleteSubEntity1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Delete Sub Entity Verification ");
		
		CriticalMethod.DeleteSubEntity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	 @Test(priority = 9) 
	 void DeleteE() throws InterruptedException, IOException
	 {
		test = extent.startTest("Entity Master - Delete Entity Verification");
			
		CriticalMethod.DeleteE(test,workbook);
			
		extent.endTest(test);
		extent.flush();
		
		}
		
	
	
	
	@Test(priority = 10) 
	void UploadEntity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - File Upload Verification");
		
		CriticalMethod.UploadEntity1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 11) 
	void UploadEntityBlankSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Master - Without Enter Data File Upload Verification");
		
		Method.UploadEntityBlankSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	///------------------------User Master------------------------------------------
	
	
	@Test(priority = 12) 
	void AddUser1() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - Add User Verification");
		
		CriticalMethod.AddUser(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 13) 
	void ValidationUser1() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - Without Enter Data For Every Field");
		
		Method.ValidationUser(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority =14) 
	void UpdateUser1() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - Update User Verification ");
		
		CriticalMethod.UpdateUser(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 15) 
	void UserResetPass2() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - User Reset Password Verification ");
		
		CriticalMethod.UserReset4(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 16) 
	void UserDelete11() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Delete User Verification ");
		
		CriticalMethod.UserDelete1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

//	@Test(priority = 17) 
	void UploadUser1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - File Upload Verification");
		
		CriticalMethod.UploadUser(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 17) 
	void UploadUser11() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - File Upload Verification");
		
		CriticalMethod.UploadUser11(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 18) 
	void UploadUserWithoutEnterData1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Without Enter Data File Upload Verification");
		
		Method.UploadUserWithoutEnterData(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 19) 
	void AddContractor1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Add Contractor Verification ");
		
		CriticalMethod.AddContractors(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 19) 
	void AddDuplicateContractor1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Add Duplicate Contractor Verification ");
		
		CriticalMethod.AddDuplicateContractor(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 20) 
	void UpdateContractor1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Update Contractor Verification ");
		
		CriticalMethod.UpdateContractor(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 21) 
	void ResetPassContractor11() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - Reset Password Contractor Verification ");
		
		CriticalMethod.ResetPassContractor1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 22) 
	void DeleteContractor1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Delete Contractor Verification");
		
		CriticalMethod.DeleteContractor(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 23) 
	void DeleteContractor11() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - View Contractor User - Alerady In Used Contractor Delete Verification");
		
		CriticalMethod.DeleteContractor1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	
	@Test(priority = 24) 
	void AddManagementAssignment1() throws InterruptedException, IOException                     
	{
		test = extent.startTest(" User Master - Add Management Assignment Verification ");
		
		CriticalMethod.AddManagementAssignment(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 25) 
	void DeleteMA() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Delete Management Assignment Verification ");
		
		CriticalMethod.DeleteMA(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	//--------------------------------------------Project Master--------------------------
	
	@Test(priority = 26) 
	void AddProject1() throws InterruptedException, IOException         
	{
		test = extent.startTest(" Project Master - Add Project Verification ");
		
		CriticalMethod.AddProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 27) 
	void AddLicence1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Add Licence Verification ");
		
		CriticalMethod.AddLicence(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 28) 
	void UpdateProject1() throws InterruptedException, IOException               
	{
		test = extent.startTest(" Project Master - Update Project Verification");
		
		CriticalMethod.UpdateProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 29) 
	void DeleteProject1() throws InterruptedException, IOException     
	{
		test = extent.startTest(" Project Master - Delete Project Verification");
		
		CriticalMethod.DeleteProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 30) 
	void UploadProject1() throws InterruptedException, IOException      
	{
		test = extent.startTest(" Project Master - Upload File Verification ");
		
		CriticalMethod.UploadProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 31) 
	void ProjectClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Clear Button Verification ");
		
		CriticalMethod.ProjectClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 32) 
	void MapNewProje1ct() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Map New Project Verification ");
		
		CriticalMethod.MapNewProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 33) 
	void UploadProjectBlankSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Without Enter Data Upload File Verification ");
		
		Method.UploadProjectBlankSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
//------------------Contractor Master-------------------------------	
	
	
	@Test(priority = 34) 
	void uploadContractorBlanksheet1() throws InterruptedException, IOException
	{
		test = extent.startTest("Contractor Master - Without Enter Data Upload File Verification");
		
		Method.uploadContractorBlanksheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 35) 
	void CTContractorAdd1() throws InterruptedException, IOException              
	{
		test = extent.startTest(" Contractor Master - Add Contractor Verification ");
		
		CriticalMethod.CTContractorAdd(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	


	@Test(priority = 36) 
	void UpdateContractorCT1() throws InterruptedException, IOException        
	{
		test = extent.startTest(" Contractor Master - Update Contractor Verification");
		
		CriticalMethod.UpdateContractorCT(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 37) 
	void ExportButton() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Export Button Verification");
		
		CriticalMethod.ContractorExport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 38) 
	void ClearButtonCTCC1() throws InterruptedException, IOException
	{
		test = extent.startTest("Contractor Master - Clear Button Verification");
		
		CriticalMethod.ClearButtonCTCC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 39)
	void UploadContractorCT1() throws InterruptedException, IOException         
	{
		test = extent.startTest("Contractor Master - File Upload Verification ");
		
		CriticalMethod.UploadContractorCT(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 40) 
	void UploadContractorProjectMapping1() throws InterruptedException, IOException
	{
		test = extent.startTest("Contractor Master - Project Mapping File Upload Verification ");
		
		CriticalMethod.UploadContractorProjectMappingSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	   @Test(priority = 41) 
		void AddLicenceCT1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Master - Add Licence Verification ");
			
			CriticalMethod.AddLicenceCT(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	   
	   
	   
	   @Test(priority = 42) 
		void LicenceDetailsVisilbe1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Master - Licence grid column Verification ");
			
			CriticalMethod.LicenceDetailsVisilbe(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}

	   
	   
	   
		
		@Test(priority = 43) 
		void ViewLicence1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Master - View Licence Verification");
			
			CriticalMethod.ViewLicence(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 44) 
		void UpdateLicence1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Master - Update Licence Verification ");
			
			CriticalMethod.UpdateLicence(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
    	@Test(priority = 45) 
		void DeleteLicenceC1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Master - Delete Licence Verification");
			
			CriticalMethod.DeleteLicenceC(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
   	@Test(priority = 46) 
		void DeleteContractorCT1() throws InterruptedException, IOException             
		{
			test = extent.startTest(" Contractor Master - Delete Contractor Verification");
			
			CriticalMethod.DeleteContractorCT(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		

	
	@Test(priority = 47) 
	void UploadContractorProjectMappingBlankSheet1() throws InterruptedException, IOException          
	{
		test = extent.startTest("Contractor Master -  Without enter data Project Mapping File Upload Verification ");
		
		Method.UploadContractorProjectMapping(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	//--------------------------------Act and Compliance master------------------
	
	@Test(priority = 48) 
	void AddActWithState1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Add Act With State Verification");
		
		Method.AddActWithState(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 49) 
	void AddActWithDifferentState1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Add Act With Different State Verification");
		
		Method.AddActWithDifferentState(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 49) 
	void AddActDuplicate1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Add Duplicate Act With State Verification");
		
		Method.AddActDuplicate(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	@Test(priority = 50) 
	void AddActDuplicateForCentral1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Add Duplicate Act With Central Verification");
		
		Method.AddActDuplicateForCentral(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 51) 
	void UploadActWithsameAct1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Upload File With Same Act Verification");
		
		Method.UploadActWithsameAct(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 52) 
	void AddActAndComplience1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Add Act Verification");
		
		CriticalMethod.AddActAndComplience(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	@Test(priority = 53) 
	void ClearAC1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Act - Clear Button Verification");
		
		CriticalMethod.ClearAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 54) 
	void UpdateActAndCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Update Act Verification");
		
		CriticalMethod.UpdateActAndCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

		
	@Test(priority = 55) 
	void DeleteAc1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Delete Act Verification");
		
		CriticalMethod.DeleteAc(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 56) 
	void UploadActAndCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Act - Upload File Verification");
		
		CriticalMethod.UploadActAndCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	
	
	@Test(priority = 57) 
	void UploadeActBlankSheet1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Without Enter Data File Upload Verification");
		
		Method.UploadeActBlankSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 58) 
	void AddDuplicateComplianceCentral1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Add  Duplicate Compliance For Central Verification");
		
		Method.AddDuplicateComplianceCentral(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 59) 
	void UploadBlankSheetComplianceAC1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Without Enter Data Compliance File Upload Verification");
		
		Method.UploadBlankSheetComplianceAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 60) 
	void AddCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Add Compliance For Statutory Verification");
		
		CriticalMethod.AddCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 61) 
	void AddComplianceForInternal() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Add Compliance For Internal Verification");
		
		CriticalMethod.AddComplianceForInternal(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	

	@Test(priority = 62) 
	void UpdateComplianceAC1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Update Compliance Verification");
		
		CriticalMethod.UpdateComplianceAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 63) 
	void DeleteCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Delete Compliance Verification");
		
		CriticalMethod.DeleteCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 64) 
	void ComplianceClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Compliance - Clear Button Verification");
		
		CriticalMethod.ComplianceClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 65) 
	void UploadCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master -Compliance - for statutory -File Upload Verification");
		
		CriticalMethod.UploadCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 66) 
	void UploadComplianceInternal() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master -Compliance - for Internal -File Upload Verification");
		
		CriticalMethod.UploadComplianceInternal(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	
	@Test(priority = 67) 
	void UploadBlankSheetTemplateAC1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Without Enter Data Template File Upload Verification ");
		
		Method.UploadBlankSheetTemplateAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 68) 
	void AddTemplateAC1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Add Template Verification");
		
		CriticalMethod.AddTemplateAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 69) 
	void ComplianceCombinedFormUpload() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Compliance - upload combined form Verification");
		
		CriticalMethod.ComplianceCombinedFormUpload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 70) 
	void TemplateClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Act And Compliance master - Template Clear Button Verification");
		
		CriticalMethod.TemplateClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 71) 
	void DeleteTemplateAC1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Delete Template Verification ");
		
		CriticalMethod.DeleteTemplateAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 72) 
	void UploadTemplate1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Template - File Upload Verification ");
		
		CriticalMethod.UploadTemplate(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 73) 
	void DuplicateTemplateAC1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Act And Compliance master - Add Duplicate Template Verification ");
		
		Method.DuplicateTemplateAC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 74) 
	void AddContractorType1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Type Master - Add Contractor Type Verification ");
		
		CriticalMethod.AddContractorType(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 75) 
	void UpdateContractorType1() throws InterruptedException, IOException
	{
		test = extent.startTest("Contractor Type Master - Update Contractor Type Verification ");
		
		CriticalMethod.UpdateContractorType(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 76) 
	void DeleteContractorType1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Type Master - Delete Contractor Type Verification ");
		
		CriticalMethod.DeleteContractorType(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 77) 
	void ContractorTypeClearButtonn1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Type Master - Clear Button Verification ");
		
		CriticalMethod.ContractorTypeClearButtonn(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 78) 
	void AddCity1() throws InterruptedException, IOException
	{
		test = extent.startTest(" City Master - Add City Verification ");
		
		CriticalMethod.AddCity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 79) 
	void UpdateCity1() throws InterruptedException, IOException
	{
		test = extent.startTest(" City Master - Update City Verification ");
		
		CriticalMethod.UpdateCity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 80) 
	void DeleteCity1() throws InterruptedException, IOException
	{
		test = extent.startTest(" City Master - Delete City Verification ");
		
		CriticalMethod.DeleteCity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 81) 
	void CityMasterClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest(" City Master - Clear Button Verification ");
		
		CriticalMethod.CityMasterClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 82) 
	void AddLicenceType1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Licence Type Master  - Add Licence Type Verification ");
		
		CriticalMethod.AddLicenceType(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 83) 
	void UpdateLicenceType1() throws InterruptedException, IOException
	{
		test = extent.startTest("  Licence Type Master  - Update Licence Type Verification");
		
		CriticalMethod.UpdateLicenceType(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 84) 
	void DeleteLicenceType1() throws InterruptedException, IOException
	{
		test = extent.startTest("  Licence Type Master  - Delete Licence Type Verification ");
		
		CriticalMethod.DeleteLicenceType(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 85) 
	void LicenceTypeClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("  Licence Type Master  - Clear Button Verification ");
		
		CriticalMethod.LicenceTypeClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 86) 
	void AddDataPoint1() throws InterruptedException, IOException
	{
		test = extent.startTest("  Data Point Master  - Add Data Point Verification");
		
		CriticalMethod.AddDataPoint(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 87) 
	void UpdateDataPoint1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Data Point Master  - Update Data Point Verification ");
		
		CriticalMethod.UpdateDataPoint(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 88) 
	void DeleteDataPoint1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Data Point Master  - Delete Data Point Verification ");
		
		CriticalMethod.DeleteDataPoint(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 89) 
	void DataPointClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Data Point Master -  Clear Button  Verification ");
		
		CriticalMethod.DataPointClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 90) 
	void AddNewCompliance1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Compliance Mapping Tab - Mapping Compliance Verification ");
		
		CriticalMethod.AddNewCompliance(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 91) 
	void UpdateCompliencesFTab1() throws InterruptedException, IOException
	{
		test = extent.startTest("Compliance Mapping Tab - Edit Button-Remove Compliance Verification");
		
		CriticalMethod.UpdateCompliencesFTab(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 92) 
	void ExportReportDownloadCM1() throws InterruptedException, IOException
	{
		test = extent.startTest("Compliance Mapping Tab - Update - Export To Excel Button Verification ");
		
		CriticalMethod.ExportReportDownloadCM(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 93) 
	void ExportButtonCM1() throws InterruptedException, IOException
	{
		test = extent.startTest("Compliance Mapping Tab - Export Button Verification");
		
		CriticalMethod.ExportButtonCM(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 94) 
	void ClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Compliance Mapping Tab - Clear Button Verification ");
		
		CriticalMethod.ClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 95)                                                
	void UploadCMFTab1() throws InterruptedException, IOException
	{
		test = extent.startTest("Compliance Mapping Tab - File Upload Verification ");
		
		CriticalMethod.UploadCMFTab(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 96) 
	void ViewIconCM1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Compliance Mapping Tab - View Button Verification ");
		
		
		CriticalMethod.ViewIconCM(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	
	@Test(priority = 97) 
	void UploadBlankSheetCM1() throws InterruptedException, IOException
	{
		test = extent.startTest("Compliance Mapping Tab - Without Enter Data File Upload Verification");
		
		Method.UploadBlankSheetCM(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 98)                                               
	void AuditSchedule1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Audit Schedule Tab - Audit Scheduled Verification ");
		
		CriticalMethod.AuditSchedule(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 99) 
	void ClearButtonAS1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Audit Schedule Tab - Clear Button Verification");
		
		CriticalMethod.ClearButtonAS(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 100)                                                        
	void AssignComplience1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Audit Assignment Tab - Assigned Compliance Verification ");
		
		CriticalMethod.AssignComplience(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	@Test(priority = 101)                                                          
	void UnassignComplianceAA1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Audit Assignment Tab - UnAssign Compliance Verification  ");
		
		CriticalMethod.UnassignComplianceAA(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 102) 
	void ClearButtonAA1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Audit Assignment Tab - Clear Button Verification  ");
		
		CriticalMethod.ClearButtonAA(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 103) 
	void ExportReportFromReport1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report Tab - Export Button Verification  ");
		
		CriticalMethod.ExportReportFromReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 104) 
	void ClearButtonReport1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report Tab - Clear Button Verification ");
		
		CriticalMethod.ClearButtonReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 105) 
	void MoreReportR1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report Tab - More Reports - File Download Verification  ");
		
		CriticalMethod.MoreReportR(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	

	@Test(priority =106) 
	void ActionColReportDownload1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report Tab - Action Column - File Download Verification  ");
		
		CriticalMethod.ActionColReportDownload(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 107) 
	void ViewReport1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report Tab - View Button Verification  ");
		
		CriticalMethod.ViewReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	


	
	/*
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
	
	
	@Test(priority = 94) 
	void GridAndExcelReport1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Report tab - Grid and Excel sheet count match Verification ");
		
		Method.GridAndExcelReport(test,workbook);
		
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
	
	
	*/
	
	
	
	
	
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		//driver.close();
  		closeBrowser();
  	}	

	
	
	
	
	
	
	
	

}
