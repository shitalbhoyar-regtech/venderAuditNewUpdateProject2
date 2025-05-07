
package login;
import java.io.File;
	import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.applitools.eyes.selenium.Eyes;

import javax.xml.datatype.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;

import companyContractor.Locator1;




	public class BasePage {
		public Eyes eyes=null;

		public Properties prop;
		protected static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
		String URL;
		public String browser= "chrome";	
		public String website;
		public static ExtentReports extent;			//Instance created for report file
		public static ExtentTest test;
		public static FileInputStream fis = null;	//File input stream variable
		public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
		public static XSSFSheet sheet = null;		//Sheet variable
		private final ReadWriteLock lock;
	    protected String uname;
	    protected   String password;
	    protected String url;
	    
	    String filePath ="E:\\VenderAuditProject\\TestData\\TestData.xlsx";
	    
		public static WebDriver getDriver() {
			return driver.get();
		}

		public static XSSFSheet ReadExcel(int no) throws IOException
		{
			//String workingDir = System.getProperty("webdriver.chrome.driver","C:/March2022/PerformerPom/Driver/chromedriver.exe");
			fis = new FileInputStream("E:\\VenderAuditProject\\TestData\\TestData.xlsx");
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(no);					//Retrieving third sheet of Workbook
			return sheet;
		}
		
	private synchronized void loadProperties(int no) throws IOException {
		
		XSSFSheet sheet = ReadExcel(no);
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		 URL = c1.getStringCellValue();
			/*prop = new Properties();
			try {
				FileInputStream file = new FileInputStream("D:\\LabourCompliance_m\\LabourCompliance\\LabourCompliance\\env_data\\config.properties");
				prop.load(file);
				  browser = prop.getProperty("browser");	
				  website = prop.getProperty("website");
				  
				  }
			catch(Exception e){
				e.printStackTrace();
			}*/
		}
		

		
	
	
	public  BasePage() {
		   // this.filePath = filePath;
		    this.lock = new ReentrantReadWriteLock();
		}
	
	public String read_Login_url(int no) throws IOException {
		  lock.readLock().lock();
	    try {
	        FileInputStream fis = new FileInputStream(filePath);
	        Workbook workbook = WorkbookFactory.create(fis);
	        Sheet sheet = workbook.getSheetAt(no);
	        Row row1 = sheet.getRow(0);
	        Cell c1 = row1.getCell(1);
	         url = c1.getStringCellValue();
	         
	        workbook.close();
	        fis.close();
	        return url;
	        
	    }
	    
	    finally {
	        lock.readLock().unlock();
	    }

	}

	
	public String read_Login_username(int no) throws IOException {
		  lock.readLock().lock();
	    try {
	        FileInputStream fis = new FileInputStream(filePath);
	        Workbook workbook = WorkbookFactory.create(fis);
	        Sheet sheet = workbook.getSheetAt(no);
	        Row row1 = sheet.getRow(1);
	        Cell c1 = row1.getCell(1);
	         uname = c1.getStringCellValue();
	        workbook.close();
	        fis.close();
	        return uname;
	    }
	    
	    finally {
	        lock.readLock().unlock();
	    }

	}

	public String read_Login_password(int no) throws IOException {
		  lock.readLock().lock();
	  try {
	      FileInputStream fis = new FileInputStream(filePath);
	      Workbook workbook = WorkbookFactory.create(fis);
	      Sheet sheet = workbook.getSheetAt(no);
	      Row row2 = sheet.getRow(2);
	      Cell c2 = row2.getCell(1);
	       password = c2.getStringCellValue();
	      workbook.close();
	      fis.close();
	      return password;
	  }
	  
	  finally {
	      lock.readLock().unlock();
	  }
	}
	
	private void openBrower(int no) throws IOException {

		if (browser.contains("chrome")) {
				
			
				System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shitalb\\Documents\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					//WebDriverManager.chromedriver().setup();
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--remote-allow-origins=*");
					driver.set(new ChromeDriver(options));	
				/*	eyes = new Eyes();
			        System.out.println("open");
			        eyes.setApiKey("W0iJ6tayX7GqHk5M8tCoYKZJbGfDOTqntPF4YDR9bRA110");
			        System.out.println("open1");
			        Dimension currentSize = getDriver().manage().window().getSize();
			        eyes.open(getDriver(), "MyApp", "Homepage Test",
			        	    new RectangleSize(currentSize.getWidth(), currentSize.getHeight()));
			    //    eyes.open(driver, "MyApp", "Homepage Test", new RectangleSize(1024, 768));
			        System.out.println("open3");*/
	}
				
				else {
					System.out.println("please select valid browser");
				}
		
			getDriver().manage().window().maximize();
			getDriver().manage().deleteAllCookies();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//getDriver().get(url);
			read_Login_url(no);
			getDriver().get(url);
			

	 }

	public void initialization(String link,int no) throws InterruptedException, IOException {
		try {
		//loadProperties(no);
		openBrower(no);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	/*	Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c1 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c1.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c2 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c2.getStringCellValue();		//Got the URL stored at position 2,1
		*/
		
		read_Login_username( no);
		read_Login_password( no);
		
		login.Login.UserLogin(uname,password,link);		//Method of Login class to login user.
		
		
	/*	try {
			Locator1.VendorAudit().click();
			Thread.sleep(2000);
			}
			catch(Exception e) {
				
			}*/
		try {
		Locator1.Dashboard1().click();
		Thread.sleep(2000);
		}
		catch(Exception e) {
			
		}
		
	       WebElement element = getDriver().findElement(By.xpath("//li[@id='leftAssingmentmenu'] | //*[@id='leftmastermenu']"));

	        if (element != null) {
	        	element.click();
	            System.out.println("Element found!");
	            // Perform actions on the element
	        } else {
	        	
	            System.out.println("Element not found");
	        }

		
	}
	
	
	public void closeBrowser() {
		getDriver().quit();
		driver.remove();
	}
	
	
	

}
