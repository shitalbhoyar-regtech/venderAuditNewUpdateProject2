package companyProjectDirector;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import companyAuditor.Locator2;
import companyProjectHead.Locator3;
import login.BasePage;

public class Locator4 extends BasePage{

	
	private static WebElement Document = null;
	private static WebElement DocumentView = null;
	private static WebElement DocumentDownload = null;
	private static WebElement DocumentCheckBox = null;
	private static WebElement DocumentCheckBox1 = null;
	private static WebElement DocumentDownloadIcon = null;
	private static WebElement DocumentSelectLocation = null;
	private static WebElement DocumentSelectLocationDrop = null;
	private static WebElement DocumentSelectLocationDropDown = null;
	private static WebElement DocumentSelectContractor = null;
	private static WebElement DocumentSelectContractorDropDown = null;
	private static WebElement DocumentSelectProject = null;
	private static WebElement DocumentSelectProjectDropDown = null;
	private static WebElement DocumentClearButton = null;
	
	private static WebElement Report = null;
	private static WebElement ReportExtendReport = null;
	private static WebElement ReportFileDownload = null;
	private static WebElement Paging = null;
	private static WebElement PagingDD = null;
	private static WebElement LeftTab = null;
	private static WebElement Location = null;
	
	
    
	
	
	private static WebElement ReportState = null;
	private static WebElement ReportStateDropDown = null;
	private static WebElement ReportClearButton = null;
	private static WebElement ReportMoreReport = null;
	private static WebElement ClosedAuditReport = null;
	private static WebElement MonthWiseClosedAuditReport = null;
	private static WebElement ComplianceRemarkReport = null;
	private static WebElement AuditReport = null;
	private static WebElement ProjectDrop = null;
	private static WebElement ProjectDropViewButton = null;
	private static WebElement ProjectDropViewButton1 = null;
	
	private static WebElement MonthReport = null;
	private static WebElement MonthReportDD = null;
	  
	
	// Status Wise Summery Graph
	
	   private static WebElement GridLoad = null;
	   private static WebElement GreenGraph = null;
	   private static WebElement RedGraph = null;
	   private static WebElement RedGraphGrid = null;
	   private static WebElement Bar = null;
	   private static WebElement ClearButtonRedGraphGrid = null;
	   private static WebElement ClearContractorRedGraphGrid = null;
	   private static WebElement ClearContractorDDRedGraphGrid = null;
	   
	   
	   
	   private static WebElement YellowGraph = null;
	   private static WebElement YellowGraphGrid = null;
	   private static WebElement YellowGraphClearButton = null;
	   private static WebElement YellowGraphViewButton = null;
	   
	   
	   
	   
	   private static WebElement GreenGraphinGreen = null;
	   private static WebElement GreenGraphinGreenGrid = null; 
	   private static WebElement Frame = null;
	   private static WebElement ClearButtonGreen = null;
	   private static WebElement GreenViewButton = null;
	  
	   
	   
	   //Not Complied Red SWS
	   
	   
	   
	   
	   private static WebElement RedGraph2 = null; 
	   private static WebElement RedGraph2Green = null;
	   private static WebElement RedGraph2GreenGrid = null;
	   private static WebElement RedGraph2GreenClearButton = null;
	   private static WebElement ViewRedButton = null;
	   
	   
	   
	   private static WebElement RedGraphInYellow = null;
	   private static WebElement RedGraphInYellowGrid = null;
	   private static WebElement RedGraphInYellowClearButton = null;
	   
	   
	   private static WebElement RedGraphInRed = null;
	   private static WebElement RedGraphInRedGrid = null;
	   private static WebElement RedGraphInRedGridClearButton = null;
	   
	   
	   
	   
	 //Status Wise Summery Not Applicable
	   
	   
		 //Grey Graph green
		   
		   
		   private static WebElement GreyGraph = null;
		   private static WebElement GreyInGreenGraph = null;
		   private static WebElement GreyInGreenGraphGrid = null;
		   private static WebElement GreyInGreenClearButton = null;
		   
		   
		   private static WebElement CloseGrid = null;
		   private static WebElement ViewGreyInGreen = null;
		   private static WebElement CloseView = null;
		   
		   
		   
		   /////Grey In Yellow
		   
		   
		   private static WebElement GreyInYellow = null;
		   private static WebElement GreyInYellowGrid = null;
		   private static WebElement GreyInYellowClearButton = null;
		   private static WebElement GreyInYellowViewButton = null;
		   
		   
		   // Grey Red
		   
		   
		   
		   private static WebElement GreyInRed = null;
		   private static WebElement GreyInRedGrid = null;
		   private static WebElement GreyInRedGridClearButton = null;
		   private static WebElement GreyInRedGridViewButton = null;
		   private static WebElement ModelHeader = null;
		   private static WebElement ClosePage = null;
		   
		   
		   
		   
		 //Status Wise Summery Audit Completion Status
		   
		   private static WebElement ACSREDGraph = null;
		   private static WebElement ACSREDGraphGrid = null;
		   private static WebElement ACSREDGraphGridClearButton = null;
		   private static WebElement ACSREDGraphGridExportButton = null;
		   
		   
		   
		   private static WebElement ACSBlueGraph = null;
		   private static WebElement ACSBlueGraphGrid = null;
		   private static WebElement ACSBlueGraphGridClearButton = null;
		   private static WebElement ACSBlueGraphGridExportButton = null;
		   
		   
		   
		   
		   private static WebElement ACSGreenGraph = null;
		   private static WebElement ACSGreenGraphGreed = null;
		   private static WebElement ACSGreenGraphGreedClearButton = null;
		   private static WebElement ACSGreenGraphGreedExportButton = null;
		   
	   
	   
		 //Contractor Type Wise Compliance Summery
		   
		   //Green-Complied-High
		   
		   private static WebElement CTWCompliedGreen = null;
		   private static WebElement CTWCompliedGreenHigh = null;
		   private static WebElement CTWCompliedGreenHighGrid = null;
		   private static WebElement CTWCompliedGreenHighGridClearButton = null;
		   private static WebElement CTWCompliedGreenHighGridViewButton = null;
		   
		 //Green-Complied-Medium
		   
		   private static WebElement CTWCompliedGreenMedium = null;
		   
		 //Green-Complied-Low
		   
		   private static WebElement CTWCompliedGreenLow = null;
		   
		   
	       //Contractor Type Wise Compliance Summery
		   
		   //Red-Not Complied-High
		   
		   private static WebElement CTWNotCompliedRed = null;
		   private static WebElement CTWNotCompliedRedHigh = null;
		   private static WebElement CTWNotCompliedRedmedium = null;
		   private static WebElement CTWNotCompliedRedLow = null;
		   
		   
		   
	        //Contractor Type Wise Compliance Summery
		   
		   //Green-Not Aplicable-High
		   
		   
		   private static WebElement CTWNotApplicableGrey = null;
		   private static WebElement CTWNotApplicableHigh = null;
		   private static WebElement CTWNotApplicableMedium = null;
		   private static WebElement CTWNotApplicableLow = null;
		   
		   
		 //Contractor Type Wise - Audit Status Summary
		   
		   
		   private static WebElement CTWCompletedGreen = null;
		   private static WebElement CTWOverdueRed = null;
		   private static WebElement CTWPendingReviewYellow = null;
		   
	   
		   
			
			
		   //  Project Wise - Audit Status Summary
		   
		   private static WebElement PWAuditStatusSummeryABCHeritageCompleted = null;
		   
		   private static WebElement PWAuditStatusSummeryABCConstructionOverdue = null;
		   
		   private static WebElement PWAuditStatusSummeryABC4HeritagePendingReview = null;
		   
		   private static WebElement PWAuditStatusSummerABCConstructionPendingReview = null;
		   
		   private static WebElement PWAuditStatusSummerABCConstructionCompleted = null;

		   
		   
		   private static WebElement PWSGraph1 = null;
		   
			
		   
	   //Project Wise Complience status Summery-Complied
		   
		   private static WebElement PWCSSABCConstructionComplied = null;
		   private static WebElement PWCSSABCConstructionCompliedHigh = null;
		   private static WebElement PWCSSABCConstructionCompliedMedium = null;
		   private static WebElement PWCSSABCConstructionCompliedLow = null;
		   
		   
		   
		 //  Not Complied
			
		   
		   private static WebElement PWCSSABCconstructionNotCompliedHigh = null;
		   private static WebElement PWCSSABCconstructionNotCompliedMedium = null;
		   private static WebElement PWCSSABCconstructionNotCompliedLow = null;
		   
	   
		   //Not Applicable
		   
		   private static WebElement PWCSSABCconstructionNotApplicableHigh = null;
		   private static WebElement PWCSSABCconstructionNotApplicableMedium = null;
		   private static WebElement PWCSSABCconstructionNotApplicableLow = null;
			
		   private static WebElement NotApplicableCircle = null;
		   private static WebElement NotCompliedCircle = null;
		   private static WebElement CompliedCircle = null;
		   
		   //project Box
		   
		   private static WebElement Projects = null;
		   private static WebElement Projectsgrid = null;
		   
		   
		   //Contractor box
		   
		   private static WebElement Contractors = null;
		   private static WebElement Contractorsgrid = null;
		   
		   
		   
		   
		   private static WebElement PWCSSubContractorComplied = null;
			
			private static WebElement PWCSSubContractorNotComplied = null;
			
			private static WebElement PWCSSubContractorNotApplicable = null;
			
			
			private static WebElement ProjectDrop1 = null;
			private static WebElement Projectnametext = null;
			private static WebElement ClosedProject = null;

			
		   
			private static WebElement RudraHeritage = null;
			private static WebElement PWCSSubContractorCompliedHigh = null;
			private static WebElement PWCSSubContractorCompliedMedium = null;
			private static WebElement PWCSSubContractorCompliedLow = null;
			private static WebElement PWCSSubContractorNotCompliedHigh = null;
			private static WebElement PWCSSubContractorNotCompliedMedium = null;
			private static WebElement PWCSSubContractorNotCompliedLow = null;
			private static WebElement PWCSSubContractorNotApplicableHigh = null;
			private static WebElement PWCSSubContractorNotApplicableMedium = null;
			private static WebElement PWCSSubContractorNotApplicableLow = null;
		   
			private static WebElement CreationConstruction = null;

			
			private static WebElement LocationColumn = null;
			private static WebElement AdressColumn = null;
			private static WebElement EmailColumn = null;   
			private static WebElement ContactPersonColumn = null;

			
			
			   
			   
			   
		   
		   
		   
		   
		   

		   
			
		   
			   public static WebElement Location()		//Method for searching Username input
				{
				   Location = getDriver().findElement(By.xpath("//div[@id='divLocationCount']"));
					return Location;
					
					
				}

			   public static WebElement LocationColumn()		//Method for searching Username input
				{
				   LocationColumn = getDriver().findElement(By.xpath("//*[@id='Locationdetailinfo']/div[1]/div/table/thead/tr/th[1]/a[2]"));
					return LocationColumn;
					
					
				}

		   
			   public static WebElement AdressColumn()		//Method for searching Username input
				{
				   AdressColumn = getDriver().findElement(By.xpath("//*[@id='Locationdetailinfo']/div[1]/div/table/thead/tr/th[2]/a[2]"));
					return AdressColumn;
					
					
				}
	   
			   
			   public static WebElement EmailColumn()		//Method for searching Username input
				{
				   EmailColumn = getDriver().findElement(By.xpath("//*[@id='Locationdetailinfo']/div[1]/div/table/thead/tr/th[3]/a[2]"));
					return EmailColumn;
					
					
				}
	   
			   public static WebElement ContactPersonColumn()		//Method for searching Username input
				{
				   ContactPersonColumn = getDriver().findElement(By.xpath("//*[@id='Locationdetailinfo']/div[1]/div/table/thead/tr/th[4]/a[2]"));
					return ContactPersonColumn;
					
					
				}

			   
		   
		   public static WebElement Projects()		//Method for searching Username input
			{
			   Projects = getDriver().findElement(By.id("divProjectsCount"));
				return Projects;
				
				
			}
		   
		   
		   public static WebElement Projectsgrid()		//Method for searching Username input
			{
			   Projectsgrid = getDriver().findElement(By.xpath("(//span[@class='k-pager-info k-label'])[1]"));
				return Projectsgrid;
				
				
			}
		   
		   
		   
		   public static WebElement Contractors()		//Method for searching Username input
			{
			   Contractors = getDriver().findElement(By.id("divContractorsCount"));
				return Contractors;
				
				
			}
		   
		   
		   public static WebElement Contractorsgrid()		//Method for searching Username input
			{
			   Contractorsgrid = getDriver().findElement(By.xpath("(//span[@class='k-pager-info k-label'])[1]"));
				return Contractorsgrid;
				
				
			}
		   
		   
		   
		
			
	   
	   
	   
	   
	   
	   
	

	
	
	
	
	
	   public static WebElement GreenGraph()		//Method for searching Username input
		{
			GreenGraph = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"));
			return GreenGraph;
			
			
		}
		
		
		
		public static WebElement RedGraph()		//Method for searching Username input
		{
			RedGraph = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[1]"));
			return RedGraph;
			
			
		}
		
		
		public static WebElement RedGraphGrid()		//Method for searching Username input
		{
			RedGraphGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return RedGraphGrid;
			
			
		}
		
		public static WebElement Bar()		//Method for searching Username input
		{
			Bar = getDriver().findElement(By.xpath("//iframe[@id='showdetails']"));
			return Bar;
			
			
		}
		
		
		public static WebElement ClearButtonRedGraphGrid()		//Method for searching Username input
		{
			ClearButtonRedGraphGrid = getDriver().findElement(By.id("ClearfilterMain"));
			return ClearButtonRedGraphGrid;
			
			
		}
		
		
		public static WebElement ClearContractorRedGraphGrid()		//Method for searching Username input
		{
			ClearContractorRedGraphGrid = getDriver().findElement(By.xpath("//span[.='State']"));
			return ClearContractorRedGraphGrid;
			
			
		}
		
		
		public static WebElement ClearContractorDDRedGraphGrid()		//Method for searching Username input
		{
			ClearContractorDDRedGraphGrid = getDriver().findElement(By.xpath("//span[.='Arunachal Pradesh']"));
			return ClearContractorDDRedGraphGrid;
			
			
		}
		
		
		public static WebElement YellowGraph()		//Method for searching Username input
		{
			YellowGraph = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[1]"));
			return YellowGraph;
			
			
		}
		
		
		public static WebElement YellowGraphGrid()		//Method for searching Username input
		{
			YellowGraphGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return YellowGraphGrid;
			
			
		}
		
		
		public static WebElement YellowGraphClearButton()		//Method for searching Username input
		{
			YellowGraphClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return YellowGraphClearButton;
			
			
		}
		
		
		public static WebElement YellowGraphViewButton()		//Method for searching Username input
		{
			YellowGraphViewButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
			return YellowGraphViewButton;
			
			
		}
		
		
	
		
		public static WebElement GreenGraphinGreen()		//Method for searching Username input
		{
			GreenGraphinGreen = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-2 '])[1]"));
			return GreenGraphinGreen;
			
			
		}
		
		
		public static WebElement GreenGraphinGreenGrid()		//Method for searching Username input
		{
			GreenGraphinGreenGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return GreenGraphinGreenGrid;
			
			
		}
		
		
		public static WebElement Frame()		//Method for searching Username input
		{
			Frame = getDriver().findElement(By.xpath("//iframe[@id='showdetailsLocation']"));
			return Frame;
			
			
		}
		
		
		
		public static WebElement ClearButtonGreen()		//Method for searching Username input
		{
			ClearButtonGreen = getDriver().findElement(By.id("ClearfilterMain"));
			return ClearButtonGreen;
			
			
		}
		
		
		public static WebElement GreenViewButton()		//Method for searching Username input
		{
			GreenViewButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
			return GreenViewButton;
			
			
		}
		
	
	
	//Red
		
		
		public static WebElement RedGraph2()		//Method for searching Username input
		{
			RedGraph2 = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"));
			return RedGraph2;
			
			
		}
		
		
		
		public static WebElement RedGraph2Green()		//Method for searching Username input
		{
			RedGraph2Green = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-2 '])[1]"));
			return RedGraph2Green;
			
			
		}
		
		public static WebElement RedGraph2GreenClearButton()		//Method for searching Username input
		{
			RedGraph2GreenClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return RedGraph2GreenClearButton;
			
			
		}
		
		
		
		
		
		public static WebElement RedGraph2GreenGrid()		//Method for searching Username input
		{
			RedGraph2GreenGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return RedGraph2GreenGrid;
			
			
		}
		
		
		
		public static WebElement RedGraphInYellow()		//Method for searching Username input
		{
			RedGraphInYellow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[1]"));
			return RedGraphInYellow;
			
			
		}
		
		
		
		public static WebElement RedGraphInYellowClearButton()		//Method for searching Username input
		{
			RedGraphInYellowClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return RedGraphInYellowClearButton;
			
			
		}
		
		
		
		
		
		
		public static WebElement RedGraphInYellowGrid()		//Method for searching Username input
		{
			RedGraphInYellowGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return RedGraphInYellowGrid;
			
			
		}
		
		
		
		public static WebElement RedGraphInRed()		//Method for searching Username input
		{
			RedGraphInRed = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[1]"));
			return RedGraphInRed;
			
			
		}
		
		
		
		public static WebElement RedGraphInRedGrid()		//Method for searching Username input
		{
			RedGraphInRedGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return RedGraphInRedGrid;
			
			
		}
		
		
		
		
		
		public static WebElement RedGraphInRedGridClearButton()		//Method for searching Username input
		{
			RedGraphInRedGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return RedGraphInRedGridClearButton;
			
			
		}
		
		
		
		//Grey
		
		
		
		
		public static WebElement GreyGraph()		//Method for searching Username input
		{
			GreyGraph = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-2 highcharts-drilldown-data-label']"));
			return GreyGraph;
			
			
		}
		
		
		
		public static WebElement GreyInGreenGraph()		//Method for searching Username input
		{
			GreyInGreenGraph = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-2 '])[1]"));
			return GreyInGreenGraph;
			
			
		}
		
		
		
		public static WebElement GreyInGreenGraphGrid()		//Method for searching Username input
		{
			GreyInGreenGraphGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return GreyInGreenGraphGrid;
			
			
		}
		
		
		public static WebElement CloseGrid()		//Method for searching Username input
		{
			CloseGrid = getDriver().findElement(By.xpath("(//button[@class='close'])[1]"));
			return CloseGrid;
			
			
		}
		
		
		public static WebElement ViewGreyInGreen()		//Method for searching Username input
		{
			ViewGreyInGreen = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
			return ViewGreyInGreen;
			
			
		}
		
		public static WebElement CloseView()		//Method for searching Username input
		{
			CloseView = getDriver().findElement(By.xpath("(//a[@aria-label='Close'])[1]"));
			return CloseView;
			
			
		}
		
		
		public static WebElement GreyInGreenClearButton()		//Method for searching Username input
		{
			GreyInGreenClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return GreyInGreenClearButton;
			
			
		}
		
		
		
		
		////
		
		
		
		public static WebElement GreyInYellow()		//Method for searching Username input
		{
			GreyInYellow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[1]"));
			return GreyInYellow;
			
			
		}
		
		
		public static WebElement GreyInYellowGrid()		//Method for searching Username input
		{
			GreyInYellowGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return GreyInYellowGrid;
			
			
		}
		
		
		public static WebElement GreyInYellowClearButton()		//Method for searching Username input
		{
			GreyInYellowClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return GreyInYellowClearButton;
			
			
		}
		
		
		public static WebElement GreyInYellowViewButton()		//Method for searching Username input
		{
			GreyInYellowViewButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
			return GreyInYellowViewButton;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		public static WebElement GreyInRed()		//Method for searching Username input
		{
			GreyInRed = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[1]"));
			return GreyInRed;
			
			
		}
		
		
		
		public static WebElement GreyInRedGrid()		//Method for searching Username input
		{
			GreyInRedGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return GreyInRedGrid;
			
			
		}
		
		
		
		
		public static WebElement GreyInRedGridClearButton()		//Method for searching Username input
		{
			GreyInRedGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return GreyInRedGridClearButton;
			
			
		}
		
		
		
		
		public static WebElement GreyInRedGridViewButton()		//Method for searching Username input
		{
			GreyInRedGridViewButton = getDriver().findElement(By.xpath("//*[@id=\"gridComplianceStatusWise\"]/div[2]/table/tbody/tr/td[11]/a"));
			return GreyInRedGridViewButton;
			
			
		}
		
		
		public static WebElement ModelHeader()		//Method for searching Username input
		{
			ModelHeader = getDriver().findElement(By.xpath("(//div[@id='ConstractorPopUpForScheduleComplainces'])[1]"));
			return ModelHeader;
			
			
		}
		
		
		public static WebElement ClosePage()		//Method for searching Username input
		{
			ClosePage = getDriver().findElement(By.xpath("//div[@id='ConstractorPopUpForScheduleComplainces']//button[@type='button'][normalize-space()='×']"));
			return ClosePage;
			
			
		}
		
		
		
		
		
		
		
		
	   
	   
	 //  Status Wise Summery - Audit Completion Status
	   

		
		
		
		public static WebElement ACSREDGraph()		//Method for searching Username input
		{
			ACSREDGraph = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 ']"));
			return ACSREDGraph;
			
			
		}
		
		
		
		public static WebElement ACSREDGraphGrid()		//Method for searching Username input
		{
			ACSREDGraphGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return ACSREDGraphGrid;
			
			
		}
		
		
		
		public static WebElement ACSREDGraphGridClearButton()		//Method for searching Username input
		{
			ACSREDGraphGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return ACSREDGraphGridClearButton;
			
			
		}
		
		
		
		public static WebElement ACSREDGraphGridExportButton()		//Method for searching Username input
		{
			ACSREDGraphGridExportButton = getDriver().findElement(By.id("btnexport"));
			return ACSREDGraphGridExportButton;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static WebElement ACSBlueGraph()		//Method for searching Username input
		{
			ACSBlueGraph = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 ']"));
			return ACSBlueGraph;
			
			
		}
		
		
		
		public static WebElement ACSBlueGraphGrid()		//Method for searching Username input
		{
			ACSBlueGraphGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return ACSBlueGraphGrid;
			
			
		}
		
		
		public static WebElement ACSBlueGraphGridClearButton()		//Method for searching Username input
		{
			ACSBlueGraphGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return ACSBlueGraphGridClearButton;
			
			
		}
		
		
		
		public static WebElement ACSBlueGraphGridExportButton()		//Method for searching Username input
		{
			ACSBlueGraphGridExportButton = getDriver().findElement(By.id("btnexport"));
			return ACSBlueGraphGridExportButton;
			
			
		}
		
		
		
		public static WebElement ACSGreenGraph()		//Method for searching Username input
		{
			ACSGreenGraph = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-2 ']"));
			return ACSGreenGraph;
			
			
		}
		
		
		
		public static WebElement ACSGreenGraphGreed()		//Method for searching Username input
		{
			ACSGreenGraphGreed = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
			return ACSGreenGraphGreed;
			
			
		}
		
		
		
		public static WebElement ACSGreenGraphGreedClearButton()		//Method for searching Username input
		{
			ACSGreenGraphGreedClearButton = getDriver().findElement(By.id("ClearfilterMain"));
			return ACSGreenGraphGreedClearButton;
			
			
		}
		
		
		
		public static WebElement ACSGreenGraphGreedExportButton()		//Method for searching Username input
		{
			ACSGreenGraphGreedExportButton = getDriver().findElement(By.id("btnexport"));
			return ACSGreenGraphGreedExportButton;
			
			
		}
		

		
		
		//Contractor Type Wise - Compliance Status Summary	- Complied
		
		
		
				public static WebElement CTWCompliedGreen()		//Method for searching Username input
				{
					CTWCompliedGreen = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Food Technology']"));
					return CTWCompliedGreen;
					
					
				}
				
				
				
				public static WebElement CTWCompliedGreenHigh()		//Method for searching Username input
				{
					CTWCompliedGreenHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
					return CTWCompliedGreenHigh;
					
					
				}
				
				
				
				public static WebElement CTWCompliedGreenHighGrid()		//Method for searching Username input
				{
					CTWCompliedGreenHighGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
					return CTWCompliedGreenHighGrid;
					
					
				}
				
				
				
				public static WebElement CTWCompliedGreenHighGridClearButton()		//Method for searching Username input
				{
					CTWCompliedGreenHighGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
					return CTWCompliedGreenHighGridClearButton;
					
					
				}
				
				
				
				
				
				
				
				public static WebElement CTWCompliedGreenHighGridViewButton()		//Method for searching Username input
				{
					CTWCompliedGreenHighGridViewButton = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-view k-grid-view'])[1]"));
					return CTWCompliedGreenHighGridViewButton;
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
				public static WebElement CTWCompliedGreenMedium()		//Method for searching Username input
				{
					CTWCompliedGreenMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
					return CTWCompliedGreenMedium;
					
					
				}
				
				
				
				
				public static WebElement CTWCompliedGreenLow()		//Method for searching Username input
				{
					CTWCompliedGreenLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[3]"));
					return CTWCompliedGreenLow;
					
					
				}
				
				
				
				
				
				//Contractor Type Wise - Compliance Status Summary	- Not Complied
				
				
				 
				public static WebElement CTWNotCompliedRed()		//Method for searching Username input
				{
					CTWNotCompliedRed = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Food Technology']"));
					return CTWNotCompliedRed;
					
					
				}
				
			   
			   
				
				public static WebElement CTWNotCompliedRedHigh()		//Method for searching Username input
				{
					CTWNotCompliedRedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[4]"));
					return CTWNotCompliedRedHigh;
					
					
				}
			   
				
			   
			   
				public static WebElement CTWNotCompliedRedmedium()		//Method for searching Username input
				{
					CTWNotCompliedRedmedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[5]"));
					return CTWNotCompliedRedmedium;
					
					
				}
			   
			   
			   
			   
			   
			   
				public static WebElement CTWNotCompliedRedLow()		//Method for searching Username input
				{
					CTWNotCompliedRedLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[6]"));
					return CTWNotCompliedRedLow;
					
					
				}
				
			   
				
				//Not Applicable
			   
			   
				public static WebElement CTWNotApplicableGrey()		//Method for searching Username input
				{
					CTWNotApplicableGrey = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[3]"));
					return CTWNotApplicableGrey;
					
					
				}
			   
			   
				public static WebElement CTWNotApplicableHigh()		//Method for searching Username input
				{
					CTWNotApplicableHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
					return CTWNotApplicableHigh;
					
					
				}
			   
				
				
				
				public static WebElement CTWNotApplicableMedium()		//Method for searching Username input
				{
					CTWNotApplicableMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[8]"));
					return CTWNotApplicableMedium;
					
					
				}
				
				
			
				
				
				
				public static WebElement CTWNotApplicableLow()		//Method for searching Username input
				{
					CTWNotApplicableLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[9]"));
					return CTWNotApplicableLow;
					
					
				}
				
			
		
		
		
		
				
				
				//Contractor Type Wise - Audit Status Summary
				
				
				
				public static WebElement CTWCompletedGreen()		//Method for searching Username input
				{
					CTWCompletedGreen = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[4]"));
					return CTWCompletedGreen;
					
					
				}
				
				
				
				
				public static WebElement CTWOverdueRed()		//Method for searching Username input
				{
					CTWOverdueRed = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[6]"));
					return CTWOverdueRed;
					
					
				}
				
				
				
				
				public static WebElement CTWPendingReviewYellow()		//Method for searching Username input
				{
					CTWPendingReviewYellow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[8]"));
					return CTWPendingReviewYellow;
					
					
				}
				
		
		///////////////////////////////////////////////////////
				
				
				public static WebElement PWAuditStatusSummeryABCConstructionOverdue()		//Method for searching Username input
				{
					PWAuditStatusSummeryABCConstructionOverdue = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[23]"));
					return PWAuditStatusSummeryABCConstructionOverdue;
					
					
				}
				
				
				
				public static WebElement PWAuditStatusSummerABCConstructionPendingReview()		//Method for searching Username input
				{
					PWAuditStatusSummerABCConstructionPendingReview = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[36]"));
					return PWAuditStatusSummerABCConstructionPendingReview;
					
					
				}
				
				
				
				public static WebElement PWAuditStatusSummerABCConstructionCompleted()		//Method for searching Username input
				{
					PWAuditStatusSummerABCConstructionCompleted = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[10]"));
					return PWAuditStatusSummerABCConstructionCompleted;
					
					
				}
				
				
				
				
				
				public static WebElement PWAuditStatusSummeryABC4HeritagePendingReview()		//Method for searching Username input
				{
					PWAuditStatusSummeryABC4HeritagePendingReview = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[11]"));
					return PWAuditStatusSummeryABC4HeritagePendingReview;
					
					
				}
				
				
				
				
				
				
				
				
				
		
		
				public static WebElement PWAuditStatusSummeryABCHeritageCompleted()		//Method for searching Username input
				{
					PWAuditStatusSummeryABCHeritageCompleted = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[6]"));
					return PWAuditStatusSummeryABCHeritageCompleted;
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//Bar Graph
				
				
				
				
				public static WebElement PWCSSABCConstructionComplied()		//Method for searching Username input
				{
					PWCSSABCConstructionComplied = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[4]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Geet Heritage']"));
					return PWCSSABCConstructionComplied;
					
					
				}
				
				
				
		
				public static WebElement PWCSSABCConstructionCompliedHigh()		//Method for searching Username input
				{
					PWCSSABCConstructionCompliedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[10]"));
					return PWCSSABCConstructionCompliedHigh;
					
					
				}
		
				
				
				
				public static WebElement PWCSSABCConstructionCompliedMedium()		//Method for searching Username input
				{
					PWCSSABCConstructionCompliedMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[11]"));
					return PWCSSABCConstructionCompliedMedium;
					
					
				}
				
				
		
		
				public static WebElement PWCSSABCConstructionCompliedLow()		//Method for searching Username input
				{
					PWCSSABCConstructionCompliedLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[12]"));
					return PWCSSABCConstructionCompliedLow;
					
					
				}
				
				
		
		//Not Complied
				
		
		
				public static WebElement PWCSSABCconstructionNotCompliedHigh()		//Method for searching Username input
				{
					PWCSSABCconstructionNotCompliedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[13]"));
					return PWCSSABCconstructionNotCompliedHigh;
					
					
				}
		
		
				
				public static WebElement PWCSSABCconstructionNotCompliedMedium()		//Method for searching Username input
				{
					PWCSSABCconstructionNotCompliedMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[14]"));
					return PWCSSABCconstructionNotCompliedMedium;
					
					
				}
				
				
		
		
				public static WebElement PWCSSABCconstructionNotCompliedLow()		//Method for searching Username input
				{
					PWCSSABCconstructionNotCompliedLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[15]"));
					return PWCSSABCconstructionNotCompliedLow;
					
					
				}
		
		
		//Not Applicable
				
				
				
				public static WebElement PWCSSABCconstructionNotApplicableHigh()		//Method for searching Username input
				{
					PWCSSABCconstructionNotApplicableHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[16]"));
					return PWCSSABCconstructionNotApplicableHigh;
					
					
				}
				
				
				
				
				public static WebElement PWCSSABCconstructionNotApplicableMedium()		//Method for searching Username input
				{
					PWCSSABCconstructionNotApplicableMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[17]"));
					return PWCSSABCconstructionNotApplicableMedium;
					
					
				}
				
				
		
				public static WebElement PWCSSABCconstructionNotApplicableLow()		//Method for searching Username input
				{
					PWCSSABCconstructionNotApplicableLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[18]"));
					return PWCSSABCconstructionNotApplicableLow;
					
					
				}
				
				
				
				
				
		
				public static WebElement CompliedCircle()		//Method for searching Username input
				{
					CompliedCircle = getDriver().findElement(By.xpath("(//*[@class='highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-0'])[3]"));
				return CompliedCircle;
			    }
				
				
				public static WebElement NotCompliedCircle()		//Method for searching Username input
				{
					NotCompliedCircle = getDriver().findElement(By.xpath("(//*[@class='highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-1'])[3]"));
				return NotCompliedCircle;
			    }
				
				
				
				
				public static WebElement NotApplicableCircle()		//Method for searching Username input
				{
					NotApplicableCircle = getDriver().findElement(By.xpath("(//*[@class='highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-2'])[3]"));
				return NotApplicableCircle;
			    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	public static WebElement Document()		//Method for searching Username input
	{
     Document = getDriver().findElement(By.id("leftdocumentmenu"));
	 return Document;
	}	   
		   
	
	
	
    public static WebElement DocumentView()		//Method for searching Username input
   	{
    	DocumentView = getDriver().findElement(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[11]/a[1]"));
   	 return DocumentView;
   	}	
    
    
    
    public static WebElement DocumentDownloadIcon()		//Method for searching Username input
   	{
    	DocumentDownloadIcon = getDriver().findElement(By.xpath("(//a[@role='button'])[2]"));
   	 return DocumentDownloadIcon;
   	}	
    
    
    
    
    
    
    
    public static WebElement DocumentDownload()		//Method for searching Username input
   	{
    	DocumentDownload = getDriver().findElement(By.id("btndownloadDocument"));
   	 return DocumentDownload;
   	}	
	
  
    public static WebElement DocumentCheckBox()		//Method for searching Username input
   	{
    	DocumentCheckBox = getDriver().findElement(By.id("sel_chkbx"));
   	 return DocumentCheckBox;
   	}
	
    
    
    public static WebElement DocumentCheckBox1()		//Method for searching Username input
   	{
    	DocumentCheckBox1 = getDriver().findElement(By.xpath("(//input[@id='sel_chkbx'])[2]"));
   	 return DocumentCheckBox1;
   	}
    
    
    
    
    
    
    public static WebElement DocumentSelectLocation()		//Method for searching Username input
   	{
    	DocumentSelectLocation = getDriver().findElement(By.xpath("//span[.='Location']"));
   	 return DocumentSelectLocation;
   	}
    
  
    public static WebElement DocumentSelectLocationDrop()		//Method for searching Username input
   	{
    	DocumentSelectLocationDrop = getDriver().findElement(By.xpath("//span[@class='k-icon k-i-expand']"));
   	 return DocumentSelectLocationDrop;
   	}
    
    
    
    public static WebElement DocumentSelectLocationDropDown()		//Method for searching Username input
   	{
    	DocumentSelectLocationDropDown = getDriver().findElement(By.xpath("(//span[.='VCA Customer Audit'])[5]"));
   	 return DocumentSelectLocationDropDown;
   	}
    
  
    
    public static WebElement DocumentSelectContractor()		//Method for searching Username input
   	{
    	DocumentSelectContractor = getDriver().findElement(By.xpath("//span[.='Contractor']"));
   	 return DocumentSelectContractor;
   	}
  
    
    
    
    public static WebElement DocumentSelectContractorDropDown()		//Method for searching Username input
   	{
    	DocumentSelectContractorDropDown = getDriver().findElement(By.xpath("//span[.='Suraj']"));
   	 return DocumentSelectContractorDropDown;
   	}
    
  
    
    
    
    public static WebElement DocumentSelectProject()		//Method for searching Username input
   	{
    	DocumentSelectProject = getDriver().findElement(By.xpath("//span[.='Project']"));
   	 return DocumentSelectProject;
   	}
  
  
    
    
    
    public static WebElement DocumentSelectProjectDropDown()		//Method for searching Username input
   	{
    	DocumentSelectProjectDropDown = getDriver().findElement(By.xpath("//span[.='Geet Heritage']"));
   	 return DocumentSelectProjectDropDown;
   	}
    
  
    
    
    public static WebElement DocumentClearButton()		//Method for searching Username input
   	{
    	DocumentClearButton = getDriver().findElement(By.id("btnClear"));
   	 return DocumentClearButton;
   	}
    
	
	
    
    public static WebElement Report()		//Method for searching Username input
   	{
    	Report = getDriver().findElement(By.id("leftReportsmenu"));
   	 return Report;
   	}
    
    
    
    
    public static WebElement ReportExtendReport()		//Method for searching Username input
   	{
    	ReportExtendReport = getDriver().findElement(By.id("btnDownloaddrpReports"));
   	 return ReportExtendReport;
   	}
    
    
    
    
    
    public static WebElement ReportFileDownload()		//Method for searching Username input
   	{
    	ReportFileDownload = getDriver().findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[13]/a[3]"));
   	 return ReportFileDownload;
   	}
    
    public static WebElement ReportFileDownload1()		//Method for searching Username input
   	{
    	ReportFileDownload = getDriver().findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[13]/a[2]"));
   	 return ReportFileDownload;
   	}

    public static WebElement Paging()		//Method for searching Username input
   	{
    	Paging = getDriver().findElement(By.xpath("(//span[@class='k-input'][normalize-space()='10'])[1]"));
   	 return Paging;
   	}
  
    
    public static WebElement PagingDD()		//Method for searching Username input
   	{
    	PagingDD = getDriver().findElement(By.xpath("//li[normalize-space()='20']"));
   	 return PagingDD;
   	}
  
    
    public static WebElement LeftTab()		//Method for searching Username input
   	{
    	LeftTab = getDriver().findElement(By.xpath("//a[@class='k-link k-pager-nav k-pager-last']"));
   	 return LeftTab;
   	}
  
  
    
    
    public static WebElement ReportState()		//Method for searching Username input
   	{
    	ReportState = getDriver().findElement(By.xpath("//span[.='State']"));
   	 return ReportState;
   	}
    
  
    
    
    public static WebElement ReportStateDropDown()		//Method for searching Username input
   	{
    	ReportStateDropDown = getDriver().findElement(By.xpath("//span[.='Arunachal Pradesh']"));
   	 return ReportStateDropDown;
   	}
    
  
    
    
    public static WebElement ReportClearButton()		//Method for searching Username input
   	{
    	ReportClearButton = getDriver().findElement(By.id("ClearfilterMain"));
   	 return ReportClearButton;
   	}
    
    
    public static WebElement ReportMoreReport()		//Method for searching Username input
   	{
    	ReportMoreReport = getDriver().findElement(By.id("MoreReport"));
   	 return ReportMoreReport;
   	}
    
    
    
    public static WebElement ClosedAuditReport()		//Method for searching Username input
   	{
    	ClosedAuditReport = getDriver().findElement(By.id("btnGetVendorAuditForCloseReport"));
   	 return ClosedAuditReport;
   	}
    
    
    
    
    public static WebElement MonthWiseClosedAuditReport()		//Method for searching Username input
   	{
    	MonthWiseClosedAuditReport = getDriver().findElement(By.id("btnReportGeneric"));
   	 return MonthWiseClosedAuditReport;
   	}
    
    
    
    
    
    public static WebElement ComplianceRemarkReport()		//Method for searching Username input
   	{
    	ComplianceRemarkReport = getDriver().findElement(By.id("btnComplianceRemarksReport"));
   	 return ComplianceRemarkReport;
   	}
    
    
    
    public static WebElement AuditReport()		//Method for searching Username input
   	{
    	AuditReport = getDriver().findElement(By.id("btnReportGenericAll"));
   	 return AuditReport;
   	}
    
    
    
    
    public static WebElement ProjectDrop()		//Method for searching Username input
   	{
    	ProjectDrop = getDriver().findElement(By.xpath("(//a[@class='k-icon k-i-expand'])[1]"));
   	 return ProjectDrop;
   	}
    
    
    
    
    
    public static WebElement ProjectDropViewButton()		//Method for searching Username input
   	{
    	ProjectDropViewButton = getDriver().findElement(By.xpath("(//a[@role='button'])[4]"));
   	 return ProjectDropViewButton;
   	}
    
    
    public static WebElement ProjectDropViewButton1()		//Method for searching Username input
   	{
    	ProjectDropViewButton1 = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-download k-grid-docView'])[1]"));
   	 return ProjectDropViewButton1;
   	}
    
    
    public static WebElement MonthReport()		//Method for searching Username input
   	{
    	MonthReport = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[2]"));
   	 return MonthReport;
   	}
    
    
    public static WebElement MonthReportDD()		//Method for searching Username input
   	{
    	MonthReportDD = getDriver().findElement(By.xpath("//li[.='May 23']"));
   	 return MonthReportDD;
   	}
    
  
    
    
	public static WebElement RudraHeritage()		//Method for searching Username input
	{
		RudraHeritage = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Geet Heritage']"));
		return RudraHeritage;
		
		
	}


	public static WebElement CreationConstruction()		//Method for searching Username input
	{
		CreationConstruction = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=2]"));
	return CreationConstruction;
    }

	
public static WebElement PWCSSubContractorComplied()		//Method for searching Username input
{
PWCSSubContractorComplied = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[34]"));
return PWCSSubContractorComplied;


}


public static WebElement PWCSSubContractorCompliedHigh()		//Method for searching Username input
{
PWCSSubContractorCompliedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[10]"));
return PWCSSubContractorCompliedHigh;


}




public static WebElement PWCSSubContractorCompliedMedium()		//Method for searching Username input
{
PWCSSubContractorCompliedMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[11]"));
return PWCSSubContractorCompliedMedium;


}



public static WebElement PWCSSubContractorCompliedLow()		//Method for searching Username input
{
PWCSSubContractorCompliedLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[12]"));
return PWCSSubContractorCompliedLow;


}


	///// 
	public static WebElement PWCSSubContractorNotComplied()		//Method for searching Username input
	{
		PWCSSubContractorNotComplied = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[35]"));
		return PWCSSubContractorNotComplied;
		
		
	}
	
	
	public static WebElement PWCSSubContractorNotCompliedHigh()		//Method for searching Username input
	{
		PWCSSubContractorNotCompliedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[13]"));
		return PWCSSubContractorNotCompliedHigh;
		
		
	}
	
			
	
	
	public static WebElement PWCSSubContractorNotCompliedMedium()		//Method for searching Username input
	{
		PWCSSubContractorNotCompliedMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[14]"));
		return PWCSSubContractorNotCompliedMedium;
		
		
	}
	
	
	
	
	
	public static WebElement PWCSSubContractorNotCompliedLow()		//Method for searching Username input
	{
		PWCSSubContractorNotCompliedLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[15]"));
		return PWCSSubContractorNotCompliedLow;
		
		
	}
	
	
	
	
	
	
	//////
	
	
	
	
	public static WebElement PWCSSubContractorNotApplicableHigh()		//Method for searching Username input
	{
		PWCSSubContractorNotApplicableHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[16]"));
		return PWCSSubContractorNotApplicableHigh;
		
		
	}

	
	
	public static WebElement PWCSSubContractorNotApplicableMedium()		//Method for searching Username input
	{
		PWCSSubContractorNotApplicableMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[17]"));
		return PWCSSubContractorNotApplicableMedium;
		
		
	}
	
	
	public static WebElement PWCSSubContractorNotApplicableLow()		//Method for searching Username input
	{
		PWCSSubContractorNotApplicableLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[18]"));
		return PWCSSubContractorNotApplicableLow;
		
		
	}

	
	
	
	
	
	
	  public static WebElement ProjectDrop1()		//Method for searching Username input
	   	{
		  ProjectDrop1 = getDriver().findElement(By.xpath("(//a[@class='k-icon k-i-expand'])[10]"));
	   	 return ProjectDrop1;
	   	}
	    
    
    
    
		public static WebElement Projectnametext()		//Method for searching Username input
		{
			Projectnametext = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=1]"));
			return Projectnametext;
			
			
		}
	   

		public static WebElement ClosedProject()		//Method for searching Username input
		{
			ClosedProject = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=1]"));
		return ClosedProject;
	    }

		public static WebElement LicenseTab()		//Method for searching Username input
		{
			ClosedProject = getDriver().findElement(By.xpath("//li[@id='leftworkspacemenu']"));
		return ClosedProject;
	    }
    
		public static WebElement ComplianceTab()		//Method for searching Username input
		{
			ClosedProject = getDriver().findElement(By.xpath("//div[@id='divCompletionCount']"));
		return ClosedProject;
	    }
    
		
    
    
    
}
