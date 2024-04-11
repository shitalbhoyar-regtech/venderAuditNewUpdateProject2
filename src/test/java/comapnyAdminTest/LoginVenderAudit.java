package comapnyAdminTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyAdmin.Method;
import login.BasePage;

public class LoginVenderAudit extends BasePage{
	
	public static WebDriver driver = null;
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	public static WebElement element = null;
	public static WebElement graphElement = null;
	
	
	public static XSSFSheet ReadExcel() throws IOException
	{
		
	//	fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\TestData1.xlsx");
		
		fis = new FileInputStream("E:\\\\VenderAuditProject\\\\TestData\\\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(2);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
	//	extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\Reports\\VCACompanyAdmin.html",true);
	//	extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Shital Bhoyar\\Desktop\\VenderAuditProject\\Reports\\VCACompanyContractor.html",true);
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\VenderAuditProject\\Reports\\VenderAuditLogin.html",true);
		
		
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Login");
		extent.endTest(test);
		extent.flush();
	}
	
	
	
//	@Test(priority = 1) 
	void UpcomingdashboardAndGridCountMatch1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\\\ChromeDriver\\\\chromedriver-win32\\\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://login.teamleaseregtech.com/BM_Management/Meetings/Meetings#");
		Thread.sleep(1000);

        test = extent.startTest("Login With Invalid Username");
        Thread.sleep(1000);
       
		Method.Login(test,workbook);
		
		extent.endTest(test);
		extent.flush();

		
	}
	
	
	
//	@Test(priority = 2) 
	void Login11() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\\\ChromeDriver\\\\chromedriver-win32\\\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://login.teamleaseregtech.com/BM_Management/Meetings/Meetings#");
		Thread.sleep(1000);

        test = extent.startTest("Forgot Password Verification");
        Thread.sleep(1000);
       
		Method.Login1(test,workbook);
		
		extent.endTest(test);
		extent.flush();

		
	}
	
	
//	@Test(priority = 3) 
	void Login2() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\\\ChromeDriver\\\\chromedriver-win32\\\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://login.teamleaseregtech.com/BM_Management/Meetings/Meetings#");
		Thread.sleep(1000);

        test = extent.startTest("Account Locked Verification");
        Thread.sleep(1000);
       
		Method.Login2(test,workbook);
		
		extent.endTest(test);
		extent.flush();

		
	}
	
//	@Test(priority = 4) 
	void Login31() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\\\ChromeDriver\\\\chromedriver-win32\\\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://login.teamleaseregtech.com/BM_Management/Meetings/Meetings#");
		Thread.sleep(1000);

        test = extent.startTest("Login With SSO Verification");
        Thread.sleep(1000);
       
		Method.Login3(test,workbook);
		
		extent.endTest(test);
		extent.flush();

		
	}
	
	
	@Test(priority = 5) 
	void Login41() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\\\ChromeDriver\\\\chromedriver-win32\\\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://login.teamleaseregtech.com/BM_Management/Meetings/Meetings#");
		Thread.sleep(1000);

        test = extent.startTest("Login Help Verification");
        Thread.sleep(1000);
       
		Method.Login4(test,workbook);
		
		extent.endTest(test);
		extent.flush();

		
	}
	
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		driver.close();
  		closeBrowser();
  	}	

	
	
	
	

}
