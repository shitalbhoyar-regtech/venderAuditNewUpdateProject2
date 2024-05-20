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

public class CompanyAdminCriticalTestCases extends BasePage {

	
	
	
	
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
		
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VCACompanyAdminCritical.html",true);
		test = extent.startTest("Loging In - Company Admin(Critical)");
		
		test.log(LogStatus.PASS, "Test Passed - Company Admin Login");
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
		
	//	driver = login.Login.UserLogin(uname,password,"company");		//Method of Login class to login user.
		
	}
	
	
	
	
	
	

	
	@Test(priority = 1) 
	void Entity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Add Entity Verification ");
		
		CriticalMethod.Addentity2(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 2) 
	void UpdateEntity11() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Update Entity Verification ");
		
		CriticalMethod.UpdateEntity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 3) 
	void Clear() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Clear Button Verification");
		
		CriticalMethod.ClearEntityButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 5) 
	void SubEntity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Add Sub Entity Verification ");
		
		CriticalMethod.AddSubEntity2(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 6) 
	void UpdateSubEntity1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Update Sub Entity Verification ");
		
		CriticalMethod.UpdateSubEntity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 7) 
	void DeleteSubEntity1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - Delete Sub Entity Verification ");
		
		CriticalMethod.DeleteSubEntity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	 @Test(priority = 4) 
	 void DeleteE() throws InterruptedException, IOException
	 {
		test = extent.startTest("Entity Master - Delete Entity Verification");
			
		CriticalMethod.DeleteE(test,workbook);
			
		extent.endTest(test);
		extent.flush();
		
		}
		
	
	
	
	@Test(priority = 8) 
	void UploadEntity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity Master - File Upload Verification");
		
		CriticalMethod.UploadEntity1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 9) 
	void AddUser1() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - Add User Verification");
		
		CriticalMethod.AddUser(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority =10) 
	void UpdateUser1() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - Update User Verification ");
		
		CriticalMethod.UpdateUser(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 11) 
	void UserResetPass2() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - User Reset Password Verification ");
		
		CriticalMethod.UserReset4(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 12) 
	void UserDelete11() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Delete User Verification ");
		
		CriticalMethod.UserDelete1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	

	@Test(priority = 13) 
	void UploadUser1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - File Upload Verification");
		
		CriticalMethod.UploadUser(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 14) 
	void AddContractor1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Add Contractor Verification ");
		
		CriticalMethod.AddContractors(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 15) 
	void UpdateContractor1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Update Contractor Verification ");
		
		CriticalMethod.UpdateContractor(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 16) 
	void ResetPassContractor11() throws InterruptedException, IOException
	{
		test = extent.startTest("User Master - Reset Password Contractor Verification ");
		
		CriticalMethod.ResetPassContractor1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 17) 
	void DeleteContractor1() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Delete Contractor Verification");
		
		CriticalMethod.DeleteContractor(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 17) 
	void DeleteContractor11() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - View Contractor User - Alerady In Used Contractor Delete Verification");
		
		CriticalMethod.DeleteContractor1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	
	@Test(priority = 18) 
	void AddManagementAssignment1() throws InterruptedException, IOException                     
	{
		test = extent.startTest(" User Master - Add Management Assignment Verification ");
		
		CriticalMethod.AddManagementAssignment(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 19) 
	void DeleteMA() throws InterruptedException, IOException
	{
		test = extent.startTest(" User Master - Delete Management Assignment Verification ");
		
		CriticalMethod.DeleteMA(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 20) 
	void AddProject1() throws InterruptedException, IOException         
	{
		test = extent.startTest(" Project Master - Add Project Verification ");
		
		CriticalMethod.AddProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 21) 
	void AddLicence1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Add Licence Verification ");
		
		CriticalMethod.AddLicence(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 22) 
	void UpdateProject1() throws InterruptedException, IOException               
	{
		test = extent.startTest(" Project Master - Update Project Verification");
		
		CriticalMethod.UpdateProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 23) 
	void DeleteProject1() throws InterruptedException, IOException     
	{
		test = extent.startTest(" Project Master - Delete Project Verification");
		
		CriticalMethod.DeleteProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 24) 
	void UploadProject1() throws InterruptedException, IOException      
	{
		test = extent.startTest(" Project Master - Upload File Verification ");
		
		CriticalMethod.UploadProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 25) 
	void ProjectClearButton1() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Clear Button Verification ");
		
		CriticalMethod.ProjectClearButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 26) 
	void MapNewProje1ct() throws InterruptedException, IOException
	{
		test = extent.startTest(" Project Master - Map New Project Verification ");
		
		CriticalMethod.MapNewProject(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
		
	@Test(priority = 27) 
	void CTContractorAdd1() throws InterruptedException, IOException              
	{
		test = extent.startTest(" Contractor Master - Add Contractor Verification ");
		
		CriticalMethod.CTContractorAdd(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	


	@Test(priority = 28) 
	void UpdateContractorCT1() throws InterruptedException, IOException        
	{
		test = extent.startTest(" Contractor Master - Update Contractor Verification");
		
		CriticalMethod.UpdateContractorCT(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 29) 
	void ExportButton() throws InterruptedException, IOException
	{
		test = extent.startTest(" Contractor Master - Export Button Verification");
		
		CriticalMethod.ExportButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 30) 
	void ClearButtonCTCC1() throws InterruptedException, IOException
	{
		test = extent.startTest("Contractor Master - Clear Button Verification");
		
		CriticalMethod.ClearButtonCTCC(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 31)
	void UploadContractorCT1() throws InterruptedException, IOException         
	{
		test = extent.startTest("Contractor Master - File Upload Verification ");
		
		CriticalMethod.UploadContractorCT(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 32) 
	void UploadContractorProjectMapping1() throws InterruptedException, IOException
	{
		test = extent.startTest("Contractor Master - Project Mapping File Upload Verification ");
		
		CriticalMethod.UploadContractorProjectMappingSheet(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	   @Test(priority = 33) 
		void AddLicenceCT1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Master - Add Licence Verification ");
			
			CriticalMethod.AddLicenceCT(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	   
	   
		
		@Test(priority = 34) 
		void ViewLicence1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Master - View Licence Verification");
			
			CriticalMethod.ViewLicence(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 35) 
		void UpdateLicence1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Master - Update Licence Verification ");
			
			CriticalMethod.UpdateLicence(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
     	@Test(priority = 36) 
		void DeleteLicenceC1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Master - Delete Licence Verification");
			
			CriticalMethod.DeleteLicenceC(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 37) 
		void DeleteContractorCT1() throws InterruptedException, IOException             
		{
			test = extent.startTest(" Contractor Master - Delete Contractor Verification");
			
			CriticalMethod.DeleteContractorCT(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 38) 
		void AddActAndComplience1() throws InterruptedException, IOException
		{
			test = extent.startTest("Act And Compliance master - Add Act Verification");
			
			CriticalMethod.AddActAndComplience(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
	
		@Test(priority = 39) 
		void ClearAC1() throws InterruptedException, IOException
		{
			test = extent.startTest("Act And Compliance master - Clear Button Verification");
			
			CriticalMethod.ClearAC(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 40) 
		void UpdateActAndCompliance1() throws InterruptedException, IOException
		{
			test = extent.startTest("Act And Compliance master - Update Act Verification");
			
			CriticalMethod.UpdateActAndCompliance(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		

			
		@Test(priority = 41) 
		void DeleteAc1() throws InterruptedException, IOException
		{
			test = extent.startTest("Act And Compliance master - Delete Act Verification");
			
			CriticalMethod.DeleteAc(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 42) 
		void UploadActAndCompliance1() throws InterruptedException, IOException
		{
			test = extent.startTest("Act And Compliance master - Act - Upload File Verification");
			
			CriticalMethod.UploadActAndCompliance(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
	
		@Test(priority = 43) 
		void AddCompliance1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Act And Compliance master - Add Compliance For Central Verification");
			
			CriticalMethod.AddCompliance(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
	
		@Test(priority = 44) 
		void UpdateComplianceAC1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Act And Compliance master - Update Compliance For State Verification");
			
			CriticalMethod.UpdateComplianceAC(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 45) 
		void DeleteCompliance1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Act And Compliance master - Delete Compliance Verification");
			
			CriticalMethod.DeleteCompliance(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 46) 
		void ComplianceClearButton1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Act And Compliance master - Compliance Clear Button Verification");
			
			CriticalMethod.ComplianceClearButton(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 47) 
		void UploadCompliance1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Act And Compliance master -Compliance - File Upload Verification");
			
			CriticalMethod.UploadCompliance(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
		@Test(priority = 48) 
		void AddTemplateAC1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Act And Compliance master - Add Template Verification");
			
			CriticalMethod.AddTemplateAC(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 49) 
		void TemplateClearButton1() throws InterruptedException, IOException
		{
			test = extent.startTest("Act And Compliance master - Template Clear Button Verification");
			
			CriticalMethod.TemplateClearButton(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 50) 
		void DeleteTemplateAC1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Act And Compliance master - Delete Template Verification ");
			
			CriticalMethod.DeleteTemplateAC(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 51) 
		void UploadTemplate1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Act And Compliance master - Template - File Upload Verification ");
			
			CriticalMethod.UploadTemplate(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 52) 
		void AddContractorType1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Contractor Type Master - Add Contractor Type Verification ");
			
			CriticalMethod.AddContractorType(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 53) 
		void UpdateContractorType1() throws InterruptedException, IOException
		{
			test = extent.startTest("Contractor Type Master - Update Contractor Type Verification ");
			
			CriticalMethod.UpdateContractorType(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 54) 
		void DeleteContractorType1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Contractor Type Master - Delete Contractor Type Verification ");
			
			CriticalMethod.DeleteContractorType(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 55) 
		void ContractorTypeClearButtonn1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Contractor Type Master - Clear Button Verification ");
			
			CriticalMethod.ContractorTypeClearButtonn(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 56) 
		void AddCity1() throws InterruptedException, IOException
		{
			test = extent.startTest(" City Master - Add City Verification ");
			
			CriticalMethod.AddCity(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 57) 
		void UpdateCity1() throws InterruptedException, IOException
		{
			test = extent.startTest(" City Master - Update City Verification ");
			
			CriticalMethod.UpdateCity(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 58) 
		void DeleteCity1() throws InterruptedException, IOException
		{
			test = extent.startTest(" City Master - Delete City Verification ");
			
			CriticalMethod.DeleteCity(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 59) 
		void CityMasterClearButton1() throws InterruptedException, IOException
		{
			test = extent.startTest(" City Master - Clear Button Verification ");
			
			CriticalMethod.CityMasterClearButton(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 60) 
		void AddLicenceType1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Licence Type Master  - Add Licence Type Verification ");
			
			CriticalMethod.AddLicenceType(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 61) 
		void UpdateLicenceType1() throws InterruptedException, IOException
		{
			test = extent.startTest("  Licence Type Master  - Update Licence Type Verification");
			
			CriticalMethod.UpdateLicenceType(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 62) 
		void DeleteLicenceType1() throws InterruptedException, IOException
		{
			test = extent.startTest("  Licence Type Master  - Delete Licence Type Verification ");
			
			CriticalMethod.DeleteLicenceType(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 63) 
		void LicenceTypeClearButton1() throws InterruptedException, IOException
		{
			test = extent.startTest("  Licence Type Master  - Clear Button Verification ");
			
			CriticalMethod.LicenceTypeClearButton(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 64) 
		void AddDataPoint1() throws InterruptedException, IOException
		{
			test = extent.startTest("  Data Point Master  - Add Data Point Verification");
			
			CriticalMethod.AddDataPoint(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 65) 
		void UpdateDataPoint1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Data Point Master  - Update Data Point Verification ");
			
			CriticalMethod.UpdateDataPoint(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 66) 
		void DeleteDataPoint1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Data Point Master  - Delete Data Point Verification ");
			
			CriticalMethod.DeleteDataPoint(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 67) 
		void DataPointClearButton1() throws InterruptedException, IOException
		{
			test = extent.startTest("Data Point Master -  Clear Button  Verification ");
			
			CriticalMethod.DataPointClearButton(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 68) 
		void AddNewCompliance1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Compliance Mapping Tab - Add Compliance Verification ");
			
			CriticalMethod.AddNewCompliance(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 69) 
		void UpdateCompliencesFTab1() throws InterruptedException, IOException
		{
			test = extent.startTest("Compliance Mapping Tab - Edit Button-Remove Compliance Verification");
			
			CriticalMethod.UpdateCompliencesFTab(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 70) 
		void ExportReportDownloadCM1() throws InterruptedException, IOException
		{
			test = extent.startTest("Compliance Mapping Tab - Update - Export To Excel Button Verification ");
			
			CriticalMethod.ExportReportDownloadCM(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 71) 
		void ExportButtonCM1() throws InterruptedException, IOException
		{
			test = extent.startTest("Compliance Mapping Tab - Export Button Verification");
			
			CriticalMethod.ExportButtonCM(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 72) 
		void ClearButton1() throws InterruptedException, IOException
		{
			test = extent.startTest("Compliance Mapping Tab - Clear Button Verification ");
			
			CriticalMethod.ClearButton(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 73)                                                
		void UploadCMFTab1() throws InterruptedException, IOException
		{
			test = extent.startTest("Compliance Mapping Tab - File Upload Verification ");
			
			CriticalMethod.UploadCMFTab(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 74) 
		void ViewIconCM1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Compliance Mapping Tab - View Button Verification ");
			
			
			CriticalMethod.ViewIconCM(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 75)                                               
		void AuditSchedule1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Audit Schedule Tab - Add Audit Scheduled Verification ");
			
			CriticalMethod.AuditSchedule(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 76) 
		void ClearButtonAS1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Audit Schedule Tab - Clear Button Verification");
			
			CriticalMethod.ClearButtonAS(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 77)                                                        
		void AssignComplience1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Audit Assignment Tab - Assigned Compliance Verification ");
			
			CriticalMethod.AssignComplience(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
	
		@Test(priority = 78)                                                          
		void UnassignComplianceAA1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Audit Assignment Tab - UnAssign Compliance Verification  ");
			
			CriticalMethod.UnassignComplianceAA(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 79) 
		void ClearButtonAA1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Audit Assignment Tab - Clear Button Verification  ");
			
			CriticalMethod.ClearButtonAA(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 80) 
		void ExportReportFromReport1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Report Tab - Export Button Verification  ");
			
			CriticalMethod.ExportReportFromReport(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 81) 
		void ClearButtonReport1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Report Tab - Clear Button Verification ");
			
			CriticalMethod.ClearButtonReport(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 82) 
		void MoreReportR1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Report Tab - More Reports - Files Download Verification  ");
			
			CriticalMethod.MoreReportR(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
	
		@Test(priority =83) 
		void ActionColReportDownload1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Report Tab - Action Column - File Download Verification  ");
			
			CriticalMethod.ActionColReportDownload(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 84) 
		void ViewReport1() throws InterruptedException, IOException
		{
			test = extent.startTest(" Report Tab - View Button Verification  ");
			
			CriticalMethod.ViewReport(test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
	
		@AfterMethod
	  	void browserClosing() throws InterruptedException
	  	{
	  		Thread.sleep(5000);
	  	//	driver.close();
	  		closeBrowser();
	  	}	

	
	
	
}
