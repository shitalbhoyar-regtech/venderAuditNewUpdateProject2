package companyProjectHead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import login.BasePage;

public class Locator3 extends BasePage{

	
	private static WebElement Document = null;
	private static WebElement DocumentView = null;
	private static WebElement DocumentDownload = null;
	private static WebElement DocumentCheckBox = null;
	private static WebElement DocumentCheckBox1 = null;
	private static WebElement DocumentSelectLocation = null;
	private static WebElement DocumentSelectLocationDrop = null;
	private static WebElement DocumentSelectLocationDropDown = null;
	private static WebElement DocumentSelectLocationDropDown1 = null;

	
	private static WebElement DocumentSelectContractor = null;
	private static WebElement DocumentSelectContractorDropDown = null;
	private static WebElement DocumentSelectProject = null;
	private static WebElement DocumentSelectProjectDropDown = null;
	private static WebElement DocumentClearButton = null;
	
	   
	
	private static WebElement Report = null;
	private static WebElement ReportExtendReport = null;
	private static WebElement ReportFileDownload = null;
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
	  
	
	//Status Wise Summery Not Complied Status
	   
	   
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
	   private static WebElement DashboardClearButton = null;

	   
	   
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
	   
	   private static WebElement PWAuditStatusSummeryCompleted = null;//No
	   
	   private static WebElement PWAuditStatusSummeryYashHeritageOverdue = null;//No
	   
	   private static WebElement PWAuditStatusSummeryABC4HeritageOverdue = null;//No
	   
	   private static WebElement PWAuditStatusSummeryashHeritagePendingReview = null;//No
	   
	   private static WebElement PWAuditStatusSummeryABCConstructionOverdue = null;
	   private static WebElement PWAuditStatusSummerABCConstructionPendingReview = null;
	   
	   private static WebElement PWSGraph1 = null;
	   
		
	   //Bar Graph TLR1
	   
	   
       private static WebElement PWSTLR1High = null;
	   private static WebElement PWSTLR1Low = null;
	   
	   
	   
	   //Bar Graph Project-2-Legalbright
	   
	   private static WebElement PWSLegalbright = null;
	   private static WebElement PWSLegalbrightHigh = null;
	   private static WebElement PWSLegalbrightLow = null;
	   
	   
	   
		//
	   
	   private static WebElement Projects = null;
	   private static WebElement Projectsgrid = null;
	   
	   
	   //
	   
	   private static WebElement Contractors = null;
	   private static WebElement Contractorsgrid = null;
	   
		
	   
		
	 //Project Wise Complience Summery-Complied
	   
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
	   
	   //Multiple Filter
	   
	   private static WebElement EntityLocation = null;
	    private static WebElement EntityLocationExpand = null;
	    private static WebElement EntityLocationExpand1 = null;
	    private static WebElement Status = null;
	    private static WebElement Status1R = null;
	    private static WebElement Status2R = null;
	    private static WebElement Project = null;
	    private static WebElement ProjectDD = null;
	    private static WebElement Frequency = null;
	    private static WebElement FrequencyDD = null;
	    private static WebElement ContractorType = null;
	    private static WebElement ContractorTypeDD = null;
	    private static WebElement StartDate = null;
	    
	    
	    private static WebElement StartDateDD = null;
	    private static WebElement EndDateDate = null;
	    private static WebElement EndDateDateDD = null;
	    
	    
	    private static WebElement Status1Overdue = null;
	    private static WebElement Status2Overdue = null;
	    private static WebElement Period = null;
	    private static WebElement PeriodDD = null;
	    
		
	    private static WebElement Status1PendingReview = null;
	    private static WebElement Status2PendingReview = null;
	    private static WebElement ClosedProject = null;
	    private static WebElement ClosedProject1 = null;

	    
	    private static WebElement Status1Closed = null;
	    private static WebElement Status2Closed = null;
	    private static WebElement PRIUpdate = null;

		
	    
	    private static WebElement ProjectFilterCompliedHigh = null;
	    private static WebElement StatusFilterCompliedHighDD = null;
	    private static WebElement StatusFilterCompliedHighDD1 = null;
	    private static WebElement RiskFilterCompliedHigh = null;
	    private static WebElement RiskFilterCompliedHighDD1 = null;
	    private static WebElement PeriodFilterCompliedHigh = null;
	    private static WebElement PeriodFilterCompliedHighDD = null;
	    private static WebElement Risk = null;

		
		
	    
		
	    private static WebElement PeriodFilterCompliedMediumDD = null;
	    private static WebElement RiskFilterCompliedMedium = null;
	    private static WebElement RiskFilterCompliedMediumDD1 = null;

		
	    private static WebElement RiskFilterCompliedLow = null;
	    private static WebElement RiskFilterCompliedLowDD1 = null;
	    
	    
	    private static WebElement StatusFilterNotCompliedHighDD = null;
		private static WebElement StatusFilterNotCompliedHighDD1 = null;
	    
		private static WebElement RiskFilterNotCompliedLow = null;
		private static WebElement RiskFilterNotCompliedLowDD1 = null;
		private static WebElement PeriodMediumNC = null;
	    
		
		private static WebElement PeriodNADD = null;
	    private static WebElement StatusNADD = null;
		private static WebElement StatusNADD1 = null;  
		private static WebElement RiskNADD = null;
		private static WebElement RiskNADD1 = null;
		private static WebElement RiskNADDMedium = null;
	//	private static WebElement RiskNADDMedium1 = null;
		private static WebElement RiskNADDLow = null;
		private static WebElement RiskNADDLow1 = null;
	    
		
		private static WebElement PeriodOverdue = null;
		private static WebElement StatusOverdue = null;
		private static WebElement StatusOverdue1 = null;
	    
		private static WebElement StatusPendingReview = null;
		private static WebElement StatusPendingReview1 = null;
		private static WebElement PeriodNCPWCSSDD = null;
		private static WebElement Project1 = null;
		private static WebElement Project2 = null;
		private static WebElement Project3 = null;
		private static WebElement PeriodNA = null;
		private static WebElement Period3 = null;

		
		
		
		private static WebElement DocumentTabSelectContractor = null;
		private static WebElement DocumentTabSelectContractorDD = null;
		private static WebElement DocumentTabSelectProject = null;
		private static WebElement DocumentTabSelectProjectDD = null;
		
		
		
		private static WebElement VCALegalEntityExpandAA = null;
		private static WebElement VCALegalEntityAADD = null;
		private static WebElement ProjectReport = null;
		private static WebElement ProjectReportDD = null;
		private static WebElement ReportTabContractor = null;
		private static WebElement ReportTabContractorDD = null;
		private static WebElement ReportTabContractorType = null;
		private static WebElement ReportTabContractorTypeDD = null;
		private static WebElement ReportTabFequency = null;
		private static WebElement ReportTabFequencyDD = null;
		private static WebElement ReportTabPeriod = null;
		private static WebElement ReportTabPeriodDD = null;
		private static WebElement Sep23 = null;

		
		private static WebElement ReportTabStatus = null;
		private static WebElement ReportTabStatusDD = null;
		private static WebElement LocationReport = null;
		private static WebElement LocationProjectMasterExpand = null;
		private static WebElement VCALegalEntityAADDGetText = null;
		
		private static WebElement CTWCompliedGreenNew = null;
		private static WebElement CTWCompliedGreenCompliedHigh = null;
		
		
		private static WebElement PWSCompliedGraph1 = null;
		private static WebElement PWSCompliedGraphHigh1 = null;
		private static WebElement PWSCompliedGraphMedium1 = null;
		private static WebElement PWSCompliedGraphLow1 = null;
		private static WebElement PWSNotCompliedGraphHigh1 = null;
		private static WebElement PWSNotCompliedGraphMedium1 = null;
		private static WebElement PWSNotCompliedGraphLow1 = null;
		private static WebElement PWSNotApplicableGraphHigh1 = null;
		private static WebElement PWSNotApplicableGraphMedium1 = null;
		private static WebElement PWSNotApplicableGraphLow1 = null;
		private static WebElement ProjectDDAbcConstruction = null;
		
		private static WebElement CTWOverdueRed1 = null;
		
		private static WebElement RudraHeritage = null;
		private static WebElement PWCSSubContractorCompliedHigh = null;
		private static WebElement PWCSSubContractorNotCompliedHigh = null;
		private static WebElement PWCSSubContractorNotApplicableHigh = null;
		private static WebElement PWCSSubContractorNotApplicableLow = null;
		
		private static WebElement PWCSSubContractorComplied = null;
		private static WebElement PWCSSubContractorCompliedMedium = null;
		private static WebElement PWCSSubContractorCompliedLow = null;
		private static WebElement PWCSSubContractorNotComplied = null;
		private static WebElement PWCSSubContractorNotCompliedMedium = null;
		private static WebElement PWCSSubContractorNotCompliedLow = null;
		private static WebElement PWCSSubContractorNotApplicable = null;
		private static WebElement PWCSSubContractorNotApplicableMedium = null;
		
		
		private static WebElement PWCSSubContractorProject = null;
		private static WebElement PWCSSubContractorProjectDD = null;
		private static WebElement PWCSSubContractorPeriodDD = null;
		private static WebElement PWCSSubContractorExpand = null;
		private static WebElement PWCSSubContractorExpandColumn = null;
		private static WebElement PWCSSubContractorExpandColumn1 = null;
		private static WebElement PWCSSubContractorExpandType1 = null;

		
		
		private static WebElement PWCSSubContractorExpandType = null;
		private static WebElement DueDate = null;
		private static WebElement PWCSSubContractorContractorType = null;
		private static WebElement PWCSSubContractorContractorTypeDD = null;
		private static WebElement PWCSSubContractorContractorTypeDD1 = null;
		private static WebElement Close = null;
		private static WebElement PWCSSubContractorContractorTypeDD11 = null;

		private static WebElement SelectContractor = null;
		private static WebElement SelectContractorDD = null;

		private static WebElement Paging = null;
		private static WebElement Paging20 = null;
		private static WebElement Expand = null;
		private static WebElement DownloadAndViewButton = null;

		
		private static WebElement StatusClosed = null;
		private static WebElement StatusClosed1 = null;
		private static WebElement Period2 = null;
		private static WebElement CTWCompletedGreen1 = null;
		private static WebElement ClosedProjecttext = null;
		private static WebElement Sep20 = null;

		private static WebElement Calender = null;
		private static WebElement CalenderDD = null;
		private static WebElement Frequency2 = null;
		private static WebElement ClosedProjecttext1 = null;
		private static WebElement OverdueCircle = null;

		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	   
	   
	   
	   
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
		
		
		//////////////Red Dasboard Not Complied
		
		
		
		
		
		
		
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
			GreyInRedGridViewButton = getDriver().findElement(By.xpath("//*[@id='gridComplianceStatusWise']/div[2]/table/tbody/tr/td[11]/a"));
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
			CTWCompliedGreen = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Canteen']"));
			return CTWCompliedGreen;
			
			
		}
		
		
		public static WebElement CTWCompliedGreenNew()		//Method for searching Username input
		{
			CTWCompliedGreenNew = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]"));
			return CTWCompliedGreenNew;
			
			
		}
		
		
		public static WebElement CTWCompliedGreenCompliedHigh()		//Method for searching Username input
		{
			CTWCompliedGreenCompliedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
			return CTWCompliedGreenCompliedHigh;
			
			
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
		
		
		public static WebElement DashboardClearButton()		//Method for searching Username input
		{
			DashboardClearButton = getDriver().findElement(By.xpath("//*[@id='btnClearCommonFilters']"));
			return DashboardClearButton;
			
			
		}
		
	
		
		
		
		
		public static WebElement CTWCompliedGreenHighGridViewButton()		//Method for searching Username input
		{
			CTWCompliedGreenHighGridViewButton = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-view k-grid-view']"));
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
		
		
		
		
		
		//Contractor Type Wise - Compliance Status Summary	- Complied
		
		
		 
		public static WebElement CTWNotCompliedRed()		//Method for searching Username input
		{
			CTWNotCompliedRed = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Canteen']"));
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
			CTWNotApplicableGrey = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Canteen']"));
			return CTWNotApplicableGrey;
			
			
		}
	   
	   
		public static WebElement CTWNotApplicableHigh()		//Method for searching Username input
		{
			CTWNotApplicableHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"));
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
			CTWCompletedGreen = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
			return CTWCompletedGreen;
			
			
		}
		
		
		
		
		public static WebElement CTWOverdueRed()		//Method for searching Username input
		{
			CTWOverdueRed = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
			return CTWOverdueRed;
			
			
		}
		
		
		
		public static WebElement CTWPendingReviewYellow()		//Method for searching Username input
		{
			CTWPendingReviewYellow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[3]"));
			return CTWPendingReviewYellow;
			
			
		}
		
		
		public static WebElement CTWCompletedGreen1()		//Method for searching Username input
		{
			CTWCompletedGreen1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
			return CTWCompletedGreen1;
			
			
		}
		
		
		
		
		//Project Wise Audit Status Sumery
		
		
		
		
		public static WebElement PWAuditStatusSummeryABCConstructionOverdue()		//Method for searching Username input
		{
			PWAuditStatusSummeryABCConstructionOverdue = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[29]"));
			return PWAuditStatusSummeryABCConstructionOverdue;
			
			
		}
		
		
		
		public static WebElement PWAuditStatusSummerABCConstructionPendingReview()		//Method for searching Username input
		{
			PWAuditStatusSummerABCConstructionPendingReview = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[42]"));
			return PWAuditStatusSummerABCConstructionPendingReview;
			
			
		}
		
		
		
		
		public static WebElement PWAuditStatusSummeryCompleted()		//Method for searching Username input
		{
			PWAuditStatusSummeryCompleted = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[16]"));
			return PWAuditStatusSummeryCompleted;
			
			
		}
		
		
		
		
		public static WebElement PWAuditStatusSummeryYashHeritageOverdue()		//Method for searching Username input
		{
			PWAuditStatusSummeryYashHeritageOverdue = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"));
			return PWAuditStatusSummeryYashHeritageOverdue;
			
			
		}
		
		
		
		
		
		
		public static WebElement PWAuditStatusSummeryABC4HeritageOverdue()		//Method for searching Username input
		{
			PWAuditStatusSummeryABC4HeritageOverdue = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[9]"));
			return PWAuditStatusSummeryABC4HeritageOverdue;
			
			
		}
		
		
		
		
		
		public static WebElement PWAuditStatusSummeryashHeritagePendingReview()		//Method for searching Username input
		{
			PWAuditStatusSummeryashHeritagePendingReview = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[10]"));
			return PWAuditStatusSummeryashHeritagePendingReview;
			
			
		}
		
		
		
		
		
		//Bar Graph
		
		
		
		
		
		public static WebElement PWSGraph1()		//Method for searching Username input
		{
			PWSGraph1 = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='TLR1']"));
			return PWSGraph1;
			
			
		}
		
		
		
		
		
		
		public static WebElement PWSTLR1High()		//Method for searching Username input
		{
			PWSTLR1High = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[4]"));
			return PWSTLR1High;
			
			
		}
		
		
		
		
		public static WebElement PWSTLR1Low()		//Method for searching Username input
		{
			PWSTLR1Low = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[6]"));
			return PWSTLR1Low;
			
			
		}
		
		
	//Bar Graph-	Project-2
		
		
		
		public static WebElement PWSLegalbright()		//Method for searching Username input
		{
			PWSLegalbright = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='LegalBrite']"));
			return PWSLegalbright;
			
			
		}
		
		
		
		
		public static WebElement PWSLegalbrightHigh()		//Method for searching Username input
		{
			PWSLegalbrightHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[4]"));
			return PWSLegalbrightHigh;
			
			
		}
		
		
		
		public static WebElement PWSLegalbrightLow()		//Method for searching Username input
		{
			PWSLegalbrightLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[6]"));
			return PWSLegalbrightLow;
			
			
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
    	DocumentSelectLocation = getDriver().findElement(By.xpath("//*[@id='dvDocuments']/div[1]/div[1]"));
   	 return DocumentSelectLocation;
   	}
    
  
    public static WebElement DocumentSelectLocationDrop()		//Method for searching Username input
   	{
    	DocumentSelectLocationDrop = getDriver().findElement(By.xpath("//span[@class='k-icon k-i-expand']"));
   	 return DocumentSelectLocationDrop;
   	}
    
    
    
    public static WebElement DocumentSelectLocationDropDown()		//Method for searching Username input
   	{
    	DocumentSelectLocationDropDown = getDriver().findElement(By.xpath("(//span[.='TeamLease Regtech'])[5]"));
   	 return DocumentSelectLocationDropDown;
   	}
    
  
    public static WebElement DocumentSelectLocationDropDown1()		//Method for searching Username input
   	{
    	DocumentSelectLocationDropDown1 = getDriver().findElement(By.xpath("(//span[.='TeamLease Regtech'])[7]"));
   	 return DocumentSelectLocationDropDown1;
   	}

    
    
    public static WebElement DocumentSelectContractor()		//Method for searching Username input
   	{
    	DocumentSelectContractor = getDriver().findElement(By.xpath("//*[@id='dvDocuments']/div[1]/div[2]"));
   	 return DocumentSelectContractor;
   	}
  
    
    
    
    public static WebElement DocumentSelectContractorDropDown()		//Method for searching Username input
   	{
    	DocumentSelectContractorDropDown = getDriver().findElement(By.xpath("//span[.='Suraj Infra']"));
   	 return DocumentSelectContractorDropDown;
   	}
    
  
    
    
    
    public static WebElement DocumentSelectProject()		//Method for searching Username input
   	{
    	DocumentSelectProject = getDriver().findElement(By.xpath("//*[@id='dvDocuments']/div[1]/div[3]"));
   	 return DocumentSelectProject;
   	}
  
  
    
    
    
    public static WebElement DocumentSelectProjectDropDown()		//Method for searching Username input
   	{
    	DocumentSelectProjectDropDown = getDriver().findElement(By.xpath("//span[.='Chandragan Construction ']"));
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
    	ReportFileDownload = getDriver().findElement(By.xpath("(//a[@role='button'])[2]"));
   	 return ReportFileDownload;
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
    	ProjectDrop = getDriver().findElement(By.xpath("(//a[@class='k-icon k-i-expand'])[6]"));
   	 return ProjectDrop;
   	}
    
    
    
    
    
    public static WebElement ProjectDropViewButton()		//Method for searching Username input
   	{
    	ProjectDropViewButton = getDriver().findElement(By.cssSelector("#grid > div.k-grid-content.k-auto-scrollable > table > tbody > tr.k-detail-row.k-alt > td.k-detail-cell > div > div.k-grid-content.k-auto-scrollable > table > tbody > tr:nth-child(1) > td.k-command-cell > a.k-button.k-button-icontext.ob-view.k-grid-view"));
   	 return ProjectDropViewButton;
   	}
    
    
    
    public static WebElement MonthReport()		//Method for searching Username input
   	{
    	MonthReport = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[2]"));
   	 return MonthReport;
   	}
    
    
    public static WebElement MonthReportDD()		//Method for searching Username input
   	{
    	MonthReportDD = getDriver().findElement(By.xpath("//li[.='Feb 23']"));
   	 return MonthReportDD;
   	}
    
    
    
    
    
	
    
    // Bar Graph 
  
    public static WebElement PWCSSABCConstructionComplied()		//Method for searching Username input
	{
		PWCSSABCConstructionComplied = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Geet Heritage']"));
		return PWCSSABCConstructionComplied;
		
		
	}
	
	
	

	public static WebElement PWCSSABCConstructionCompliedHigh()		//Method for searching Username input
	{
		PWCSSABCConstructionCompliedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[4]"));
		return PWCSSABCConstructionCompliedHigh;
		
		
	}

	
	
	
	public static WebElement PWCSSABCConstructionCompliedMedium()		//Method for searching Username input
	{
		PWCSSABCConstructionCompliedMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[5]"));
		return PWCSSABCConstructionCompliedMedium;
		
		
	}
	
	


	public static WebElement PWCSSABCConstructionCompliedLow()		//Method for searching Username input
	{
		PWCSSABCConstructionCompliedLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[6]"));
		return PWCSSABCConstructionCompliedLow;
		
		
	}
	
	

//Not Complied
	


	public static WebElement PWCSSABCconstructionNotCompliedHigh()		//Method for searching Username input
	{
		PWCSSABCconstructionNotCompliedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[19]"));
		return PWCSSABCconstructionNotCompliedHigh;
		
		
	}


	
	public static WebElement PWCSSABCconstructionNotCompliedMedium()		//Method for searching Username input
	{
		PWCSSABCconstructionNotCompliedMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[20]"));
		return PWCSSABCconstructionNotCompliedMedium;
		
		
	}
	
	


	public static WebElement PWCSSABCconstructionNotCompliedLow()		//Method for searching Username input
	{
		PWCSSABCconstructionNotCompliedLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[21]"));
		return PWCSSABCconstructionNotCompliedLow;
		
		
	}


//Not Applicable
	
	
	
	public static WebElement PWCSSABCconstructionNotApplicableHigh()		//Method for searching Username input
	{
		PWCSSABCconstructionNotApplicableHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[22]"));
		return PWCSSABCconstructionNotApplicableHigh;
		
		
	}
	
	
	
	
	public static WebElement PWCSSABCconstructionNotApplicableMedium()		//Method for searching Username input
	{
		PWCSSABCconstructionNotApplicableMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[23]"));
		return PWCSSABCconstructionNotApplicableMedium;
		
		
	}
	
	

	public static WebElement PWCSSABCconstructionNotApplicableLow()		//Method for searching Username input
	{
		PWCSSABCconstructionNotApplicableLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[24]"));
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



//Multiple Filter
	
	
	
	
	
	
	
	public static WebElement EntityLocation()		//Method for searching Username input
	{
		EntityLocation = getDriver().findElement(By.xpath("//span[.='Entity/Sub-Entity/Location']"));
	return EntityLocation;
    }
	
	
	public static WebElement EntityLocationExpand()		//Method for searching Username input
	{
		EntityLocationExpand = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[1]"));
	return EntityLocationExpand;
    }
	
	
	
	public static WebElement EntityLocationExpand1()		//Method for searching Username input
	{
		EntityLocationExpand1 = getDriver().findElement(By.xpath("//span[.='Manufacturing Plant']"));
	return EntityLocationExpand1;
    }
	
	
	
	public static WebElement Status()		//Method for searching Username input
	{
		Status = getDriver().findElement(By.xpath("//span[.='Status']"));
	return Status;
    }
	
	
	
	

	
	public static WebElement Status1R()		//Method for searching Username input
	{
		Status1R = getDriver().findElement(By.xpath("(//span[.='Upcoming'])[3]"));
	return Status1R;
    }
	
	
	
	public static WebElement Status2R()		//Method for searching Username input
	{
		Status2R = getDriver().findElement(By.xpath("(//span[.='Upcoming'])[1]"));
	return Status2R;
    }
	
	
	
	
	
	
	public static WebElement Project()		//Method for searching Username input
	{
		Project = getDriver().findElement(By.cssSelector("#MainContentAL > div:nth-child(3) > div:nth-child(1)"));
	return Project;
    }
	
	
	
	public static WebElement Project2()		//Method for searching Username input
	{
		Project2 = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=10]/div/span[.='PRI Update']"));
	return Project2;
    }
	
	
	public static WebElement Project3()		//Method for searching Username input
	{
		Project3 = getDriver().findElement(By.cssSelector("(//span[.='ABC Construction'])[2]"));
	return Project3;
    }
	
	
	
	
	public static WebElement ProjectDD()		//Method for searching Username input
	{
		ProjectDD = getDriver().findElement(By.xpath("//span[.='ABC Construction']"));
	return ProjectDD;
    }
	
	
	
	public static WebElement Frequency()		//Method for searching Username input
	{
		Frequency = getDriver().findElement(By.xpath("//span[.='Frequency']"));
	return Frequency;
    }
	
	
	
	public static WebElement FrequencyDD()		//Method for searching Username input
	{
		FrequencyDD = getDriver().findElement(By.xpath("//span[.='Monthly']"));
	return FrequencyDD;
    }
	
	
	
	public static WebElement ContractorType()		//Method for searching Username input
	{
		ContractorType = getDriver().findElement(By.xpath("//span[.='Contractor Type']"));
	return ContractorType;
    }
	
	
	
	public static WebElement ContractorTypeDD()		//Method for searching Username input
	{
		ContractorTypeDD = getDriver().findElement(By.xpath("//span[.='Contractor']"));
	return ContractorTypeDD;
    }
	
	
	
	public static WebElement StartDate()		//Method for searching Username input
	{
		StartDate = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-calendar'])[1]"));
	return StartDate;
    }
	
	
	public static WebElement StartDateDD()		//Method for searching Username input
	{
		StartDateDD = getDriver().findElement(By.xpath("(//a[.='1'])[1]"));
	return StartDateDD;
    }
	
	
	
	public static WebElement EndDateDate()		//Method for searching Username input
	{
		EndDateDate = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-calendar'])[2]"));
	return EndDateDate;
    }
	
	
	public static WebElement EndDateDateDD()		//Method for searching Username input
	{
		EndDateDateDD = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-arrow-60-right'])[2]"));
	return EndDateDateDD;
    }

	
	
	//Overdue
	
	
	
	public static WebElement Status1Overdue()		//Method for searching Username input
	{
		Status1Overdue = getDriver().findElement(By.xpath("(//span[.='Overdue'])[3]"));
	return Status1Overdue;
    }
	
	
	
	public static WebElement Status2Overdue()		//Method for searching Username input
	{
		Status2Overdue = getDriver().findElement(By.xpath("(//span[.='Overdue'])[1]"));
	return Status2Overdue;
    }
	
	
	
	public static WebElement Period()		//Method for searching Username input
	{
		Period = getDriver().findElement(By.xpath("//span[.='Period']"));
	return Period;
    }
	
	
	
	
	public static WebElement PeriodDD()		//Method for searching Username input
	{
		PeriodDD = getDriver().findElement(By.xpath("//span[.='Mar 22']"));
	return PeriodDD;
    }
	
	
	
	
	public static WebElement Status1PendingReview()		//Method for searching Username input
	{
		Status1PendingReview = getDriver().findElement(By.xpath("(//span[.='Pending Review'])[3]"));
	return Status1PendingReview;
    }
	
	
	
	public static WebElement Status2PendingReview()		//Method for searching Username input
	{
		Status2PendingReview = getDriver().findElement(By.xpath("(//span[.='Pending Review'])[1]"));
	return Status2PendingReview;
    }
	

	public static WebElement ClosedProject()		//Method for searching Username input
	{
		ClosedProject = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=5]"));
	return ClosedProject;
    }
	
	public static WebElement ClosedProject1()		//Method for searching Username input
	{
		ClosedProject1 = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=6]"));
	return ClosedProject1;
    }

	
	public static WebElement PRIUpdate()		//Method for searching Username input
	{
		PRIUpdate = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=28]/div/span[.='PRI Update']"));
	return PRIUpdate;
    }

	
	//div[@class='k-animation-container']//li[position()=1]/div/span[.='Chandragan Construction ']
	
	public static WebElement ClosedProjecttext()		//Method for searching Username input
	{
		ClosedProjecttext = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=1]/div/span[.='Chandragan Construction ']"));
	return ClosedProjecttext;
    }
	
	
	public static WebElement ClosedProjecttext1()		//Method for searching Username input
	{
		ClosedProjecttext1 = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=2]/div/span[.='Creation Construction']"));
	return ClosedProjecttext1;
    }
	

	
	public static WebElement Frequency2()		//Method for searching Username input
	{
		Frequency2 = getDriver().findElement(By.xpath("//span[.='One Time']"));
	return Frequency2;
    }

	
	
	
	public static WebElement Status1Closed()		//Method for searching Username input
	{
		Status1Closed = getDriver().findElement(By.xpath("(//span[.='Closed'])[3]"));
	return Status1Closed;
    }
	
	
	
	public static WebElement Status2Closed()		//Method for searching Username input
	{
		Status2Closed = getDriver().findElement(By.xpath("(//span[.='Closed'])[1]"));
	return Status2Closed;
    }
	
	
	
	public static WebElement ProjectFilterCompliedHigh()		//Method for searching Username input
	{
		ProjectFilterCompliedHigh = getDriver().findElement(By.xpath("//*[@id=\"4798238f-bff6-4b3a-9bc1-333faad3070e_tv_active\"]/div/span[1]/span"));
	return ProjectFilterCompliedHigh;
    }
	
		
	
	public static WebElement StatusFilterCompliedHighDD()		//Method for searching Username input
	{
		StatusFilterCompliedHighDD = getDriver().findElement(By.xpath("(//span[.='Complied'])[3]"));
	return StatusFilterCompliedHighDD;
    }
	
	
	public static WebElement StatusFilterNotCompliedHighDD()		//Method for searching Username input
	{
		StatusFilterNotCompliedHighDD = getDriver().findElement(By.xpath("(//span[.='Not Complied'])[3]"));
	return StatusFilterNotCompliedHighDD;
    }
	
	
	
	
	public static WebElement StatusFilterNotCompliedHighDD1()		//Method for searching Username input
	{
		StatusFilterNotCompliedHighDD1 = getDriver().findElement(By.xpath("(//span[.='Not Complied'])[1]"));
	return StatusFilterNotCompliedHighDD1;
    }
	
	
	
	
	public static WebElement Risk()		//Method for searching Username input
	{
		Risk = getDriver().findElement(By.xpath("//span[.='Risk']"));
	return Risk;
    }
	
	
	
	public static WebElement StatusFilterCompliedHighDD1()		//Method for searching Username input
	{
		StatusFilterCompliedHighDD1 = getDriver().findElement(By.xpath("(//span[.='Complied'])[1]"));
	return StatusFilterCompliedHighDD1;
    }
	
	
	
	public static WebElement RiskFilterCompliedHigh()		//Method for searching Username input
	{
		RiskFilterCompliedHigh = getDriver().findElement(By.xpath("(//span[.='High'])[3]"));
	return RiskFilterCompliedHigh;
    }
	
	
	
	
	public static WebElement RiskFilterCompliedHighDD1()		//Method for searching Username input
	{
		RiskFilterCompliedHighDD1 = getDriver().findElement(By.xpath("(//span[.='High'])[1]"));
	return RiskFilterCompliedHighDD1;
    }
	
	public static WebElement RiskFilterNotCompliedLow()		//Method for searching Username input
	{
		RiskFilterNotCompliedLow = getDriver().findElement(By.xpath("(//span[.='Low'])[3]"));
	return RiskFilterNotCompliedLow;
    }
	
	
	
	
	public static WebElement RiskFilterNotCompliedLowDD1()		//Method for searching Username input
	{
		RiskFilterNotCompliedLowDD1 = getDriver().findElement(By.xpath("(//span[.='Low'])[1]"));
	return RiskFilterNotCompliedLowDD1;
    }
	
	
	
	public static WebElement PeriodFilterCompliedHigh()		//Method for searching Username input
	{
		PeriodFilterCompliedHigh = getDriver().findElement(By.xpath("(//span[.='Period'])[1]"));
	return PeriodFilterCompliedHigh;
    }
	
	
	public static WebElement PeriodFilterCompliedHighDD()		//Method for searching Username input
	{
		PeriodFilterCompliedHighDD = getDriver().findElement(By.xpath("//span[.='May 23']"));
	return PeriodFilterCompliedHighDD;
    }
	
	
	public static WebElement PeriodMediumNC()		//Method for searching Username input
	{
		PeriodMediumNC = getDriver().findElement(By.xpath("//span[.='Jan 20']"));
	return PeriodMediumNC;
    }
	
	
	
	
	//Medium
	
	public static WebElement PeriodFilterCompliedMediumDD()		//Method for searching Username input
	{
		PeriodFilterCompliedMediumDD = getDriver().findElement(By.xpath("//span[.='Apr 20']"));
	return PeriodFilterCompliedMediumDD;
    }
	
	
	
	public static WebElement RiskFilterCompliedMedium()		//Method for searching Username input
	{
		RiskFilterCompliedMedium = getDriver().findElement(By.xpath("(//span[.='Medium'])[3]"));
	return RiskFilterCompliedMedium;
    }
	
	
	
	public static WebElement RiskFilterCompliedMediumDD1()		//Method for searching Username input
	{
		RiskFilterCompliedMediumDD1 = getDriver().findElement(By.xpath("(//span[.='Medium'])[1]"));
	return RiskFilterCompliedMediumDD1;
    }
	
	
	
	//Multiple Filter
	
	public static WebElement RiskFilterCompliedLow()		//Method for searching Username input
	{
		RiskFilterCompliedLow = getDriver().findElement(By.xpath("(//span[.='Low'])[3]"));
	return RiskFilterCompliedLow;
    }
	
	
	
	public static WebElement RiskFilterCompliedLowDD1()		//Method for searching Username input
	{
		RiskFilterCompliedLowDD1 = getDriver().findElement(By.xpath("(//span[.='Low'])[1]"));
	return RiskFilterCompliedLowDD1;
    }
	
	
	
	
	
	public static WebElement PeriodNADD()		//Method for searching Username input
	{
		PeriodNADD = getDriver().findElement(By.xpath("//span[.='Mar 20']"));
	return PeriodNADD;
    }
	
	

	
	public static WebElement StatusNADD()		//Method for searching Username input
	{
		StatusNADD = getDriver().findElement(By.xpath("(//span[.='Not Applicable'])[3]"));
	return StatusNADD;
    }
	
	
	
	
	
	public static WebElement StatusNADD1()		//Method for searching Username input
	{
		StatusNADD1 = getDriver().findElement(By.xpath("(//span[.='Not Applicable'])[1]"));
	return StatusNADD1;
    }
	
	
	public static WebElement RiskNADD()		//Method for searching Username input
	{
		RiskNADD = getDriver().findElement(By.xpath("(//span[.='High'])[3]"));
	return RiskNADD;
    }
	
	
	
	public static WebElement RiskNADD1()		//Method for searching Username input
	{
		RiskNADD1 = getDriver().findElement(By.xpath("(//span[.='High'])[1]"));
	return RiskNADD1;
    }
	
	
	public static WebElement RiskNADDMedium()		//Method for searching Username input
	{
		RiskNADDMedium = getDriver().findElement(By.xpath("(//span[.='Medium'])[3]"));
	return RiskNADDMedium;
    }
	
	
	
	public static WebElement RiskNADDMedium1()		//Method for searching Username input
	{
		RiskNADDMedium = getDriver().findElement(By.xpath("(//span[.='Medium'])[1]"));
	return RiskNADDMedium;
    }
	
	
	
	
	public static WebElement RiskNADDLow()		//Method for searching Username input
	{
		RiskNADDLow = getDriver().findElement(By.xpath("(//span[.='Low'])[3]"));
	return RiskNADDLow;
    }
	
	
	
	public static WebElement RiskNADDLow1()		//Method for searching Username input
	{
		RiskNADDLow1 = getDriver().findElement(By.xpath("(//span[.='Low'])[1]"));
	return RiskNADDLow1;
    }
	
	
	//Audit Completion Status
	
	
	
	
	public static WebElement PeriodOverdue()		//Method for searching Username input
	{
		PeriodOverdue = getDriver().findElement(By.xpath("//span[.='Mar 22']"));
	return PeriodOverdue;
    }
	
	
	
	public static WebElement StatusOverdue()		//Method for searching Username input
	{
		StatusOverdue = getDriver().findElement(By.xpath("(//span[.='Overdue'])[3]"));
	return StatusOverdue;
    }
	
	
	
	public static WebElement StatusOverdue1()		//Method for searching Username input
	{
		StatusOverdue1 = getDriver().findElement(By.xpath("(//span[.='Overdue'])[1]"));
	return StatusOverdue1;
    }
	
	
	
	public static WebElement StatusPendingReview()		//Method for searching Username input
	{
		StatusPendingReview = getDriver().findElement(By.xpath("(//span[.='Pending Review'])[3]"));
	return StatusPendingReview;
    }
	
	
	
	public static WebElement StatusPendingReview1()		//Method for searching Username input
	{
		StatusPendingReview1 = getDriver().findElement(By.xpath("(//span[.='Pending Review'])[1]"));
	return StatusPendingReview1;
    }
	
	
	public static WebElement StatusClosed()		//Method for searching Username input
	{
		StatusClosed = getDriver().findElement(By.xpath("(//span[.='Closed'])[3]"));
	return StatusClosed;
    }
	
	
	public static WebElement StatusClosed1()		//Method for searching Username input
	{
		StatusClosed1 = getDriver().findElement(By.xpath("(//span[.='Closed'])[1]"));
	return StatusClosed1;
    }
	
	
	public static WebElement PeriodNCPWCSSDD()		//Method for searching Username input
	{
		PeriodNCPWCSSDD = getDriver().findElement(By.xpath("//span[.='Feb 20']"));
	return PeriodNCPWCSSDD;
    }
	
	
	
	public static WebElement Project1()		//Method for searching Username input
	{
		Project1 = getDriver().findElement(By.xpath("//*[@id='fd58ea5b-2b52-4c5e-8203-96bf8d9a5c41_tv_active']/div"));
	return Project1;
    }
	
	
	
	public static WebElement PeriodNA()		//Method for searching Username input
	{
		PeriodNA = getDriver().findElement(By.xpath("//span[.='Mar 20']"));
	return PeriodNA;
    }
	
	
	public static WebElement Period3()		//Method for searching Username input
	{
		Period3 = getDriver().findElement(By.xpath("//span[.='May 20']"));
	return Period3;
    }
	
	
	
	public static WebElement DocumentTabSelectContractor()		//Method for searching Username input
	{
		DocumentTabSelectContractor = getDriver().findElement(By.xpath("//span[.='Select Contractor']"));
	return DocumentTabSelectContractor;
    }
	
	
	public static WebElement DocumentTabSelectContractorDD()		//Method for searching Username input
	{
		DocumentTabSelectContractorDD = getDriver().findElement(By.xpath("//span[.='Suraj Infra']"));
	return DocumentTabSelectContractorDD;
    }
	
	
	public static WebElement DocumentTabSelectProject()		//Method for searching Username input
	{
		DocumentTabSelectProject = getDriver().findElement(By.xpath("//span[.='Select Project']"));
	return DocumentTabSelectProject;
    }
	
	
	public static WebElement DocumentTabSelectProjectDD()		//Method for searching Username input
	{
		DocumentTabSelectProjectDD = getDriver().findElement(By.xpath("//span[.='ABC Construction']"));
	return DocumentTabSelectProjectDD;
    }
	
	
	
	
	
	
	public static WebElement LocationReport()		//Method for searching Username input
	{
		LocationReport = getDriver().findElement(By.xpath("//span[.='Entity/Sub-Entity/Location']"));
		return LocationReport;
		
		
	}
	
	
	
	public static WebElement LocationProjectMasterExpand()		//Method for searching Username input
	{
		LocationProjectMasterExpand = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[1]"));
		return LocationProjectMasterExpand;
		
		
	}
	
	
	public static WebElement VCALegalEntityExpandAA()		//Method for searching Username input
	{
		VCALegalEntityExpandAA = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[2]"));
		return VCALegalEntityExpandAA;
		
		
	}
	
	
	public static WebElement VCALegalEntityAADD()		//Method for searching Username input
	{
		VCALegalEntityAADD = getDriver().findElement(By.xpath("//span[.='test']"));
		return VCALegalEntityAADD;
		
		
	}
	
	
	public static WebElement VCALegalEntityAADDGetText()		//Method for searching Username input
	{
		VCALegalEntityAADDGetText = getDriver().findElement(By.xpath("//span[.='Demo 1']"));
		return VCALegalEntityAADDGetText;
		
		
	}
	
	
	public static WebElement ProjectReport()		//Method for searching Username input
	{
		ProjectReport = getDriver().findElement(By.xpath("//span[.='Project']"));
		return ProjectReport;
		
		
	}
	
	
	
	
	public static WebElement ProjectReportDD()		//Method for searching Username input
	{
		ProjectReportDD = getDriver().findElement(By.xpath("//span[.='ABC Construction']"));
		return ProjectReportDD;
		
		
	}
	
	
	
	
	public static WebElement ReportTabContractor()		//Method for searching Username input
	{
		ReportTabContractor = getDriver().findElement(By.xpath("(//span[.='Contractor'])[1]"));
		return ReportTabContractor;
		
		
	}
	
	
	
	public static WebElement ReportTabContractorDD()		//Method for searching Username input
	{
		ReportTabContractorDD = getDriver().findElement(By.xpath("//span[.='Amar Contractors']"));
		return ReportTabContractorDD;
		
		
	}
	
	
	public static WebElement ReportTabContractorType()		//Method for searching Username input
	{
		ReportTabContractorType = getDriver().findElement(By.xpath("//span[.='Contractor Type']"));
		return ReportTabContractorType;
		
		
	}
	
	
	public static WebElement ReportTabContractorTypeDD()		//Method for searching Username input
	{
		ReportTabContractorTypeDD = getDriver().findElement(By.xpath("(//span[.='Contractor'])[2]"));
		return ReportTabContractorTypeDD;
		
		
	}
	
	
	public static WebElement ReportTabFequency()		//Method for searching Username input
	{
		ReportTabFequency = getDriver().findElement(By.xpath("//span[.='Frequency']"));
		return ReportTabFequency;
		
		
	}
	
	
	
	public static WebElement ReportTabFequencyDD()		//Method for searching Username input
	{
		ReportTabFequencyDD = getDriver().findElement(By.xpath("//span[.='Monthly']"));
		return ReportTabFequencyDD;
		
		
	}
	
	
	
	public static WebElement ReportTabPeriod()		//Method for searching Username input
	{
		ReportTabPeriod = getDriver().findElement(By.xpath("//span[.='Period']"));
		return ReportTabPeriod;
		
		
	}
	
	
	
	public static WebElement ReportTabPeriodDD()		//Method for searching Username input
	{
		ReportTabPeriodDD = getDriver().findElement(By.xpath("//span[.='Sep 22']"));
		return ReportTabPeriodDD;
		
		
	}
	
	
	public static WebElement Sep23()		//Method for searching Username input
	{
		Sep23 = getDriver().findElement(By.xpath("//span[.='Sep 23']"));
		return Sep23;
		
		
	}

	
	public static WebElement Sep20()		//Method for searching Username input
	{
		Sep20 = getDriver().findElement(By.xpath("//span[.='Sep 20']"));
		return Sep20;
		
		
	}

	
	public static WebElement ReportTabStatus()		//Method for searching Username input
	{
		ReportTabStatus = getDriver().findElement(By.xpath("//span[.='Status']"));
		return ReportTabStatus;
		
		
	}
	
	
	public static WebElement ReportTabStatusDD()		//Method for searching Username input
	{
		ReportTabStatusDD = getDriver().findElement(By.xpath("//span[.='Overdue']"));
		return ReportTabStatusDD;
		
		
	}
	
	


	public static WebElement PWSCompliedGraph1()		//Method for searching Username input
	{
		PWSCompliedGraph1 = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[3]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Chandragan Construction']"));
		return PWSCompliedGraph1;
		
		
	}
	
	
	public static WebElement PWSCompliedGraphHigh1()		//Method for searching Username input
	{
		PWSCompliedGraphHigh1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"));
		return PWSCompliedGraphHigh1;
		
		
	}
	
	
	public static WebElement PWSCompliedGraphMedium1()		//Method for searching Username input
	{
		PWSCompliedGraphMedium1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[8]"));
		return PWSCompliedGraphMedium1;
		
		
	}
	
	
	
	public static WebElement PWSCompliedGraphLow1()		//Method for searching Username input
	{
		PWSCompliedGraphLow1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[9]"));
		return PWSCompliedGraphLow1;
		
		
	}
	
	
	
	
	public static WebElement PWSNotCompliedGraphHigh1()		//Method for searching Username input
	{
		PWSNotCompliedGraphHigh1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[10]"));
		return PWSNotCompliedGraphHigh1;
		
		
	}
	
	
	
	public static WebElement PWSNotCompliedGraphMedium1()		//Method for searching Username input
	{
		PWSNotCompliedGraphMedium1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[11]"));
		return PWSNotCompliedGraphMedium1;
		
		
	}
	
	
	
	public static WebElement PWSNotCompliedGraphLow1()		//Method for searching Username input
	{
		PWSNotCompliedGraphLow1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[12]"));
		return PWSNotCompliedGraphLow1;
		
		
	}
	
	
	public static WebElement PWSNotApplicableGraphHigh1()		//Method for searching Username input
	{
		PWSNotApplicableGraphHigh1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[13]"));
		return PWSNotApplicableGraphHigh1;
		
		
	}
	
	
	public static WebElement PWSNotApplicableGraphMedium1()		//Method for searching Username input
	{
		PWSNotApplicableGraphMedium1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[14]"));
		return PWSNotApplicableGraphMedium1;
		
		
	}
	
	
    
	
	public static WebElement PWSNotApplicableGraphLow1()		//Method for searching Username input
	{
		PWSNotApplicableGraphLow1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[15]"));
		return PWSNotApplicableGraphLow1;
		
		
	}
	
	
	
	public static WebElement ProjectDDAbcConstruction()		//Method for searching Username input
	{
		ProjectDDAbcConstruction = getDriver().findElement(By.xpath("(//span[.='ABC Construction'])[3]"));
		return ProjectDDAbcConstruction;
		
		
	}
	
	
	
	
	
	public static WebElement CTWOverdueRed1()		//Method for searching Username input
	{
		CTWOverdueRed1 = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[5]"));
		return CTWOverdueRed1;
		
		
	}
	
	
	
	////////////////////////////
	
	
	
			public static WebElement RudraHeritage()		//Method for searching Username input
			{
				RudraHeritage = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[5]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Creation Construction']"));
				return RudraHeritage;
				
				
			}
		
			
			
	public static WebElement PWCSSubContractorComplied()		//Method for searching Username input
	{
		PWCSSubContractorComplied = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[34]"));
		return PWCSSubContractorComplied;
		
		
	}
	
	
	public static WebElement PWCSSubContractorCompliedHigh()		//Method for searching Username input
	{
		PWCSSubContractorCompliedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[55]"));
		return PWCSSubContractorCompliedHigh;
		
		
	}
	
	
	
	
	public static WebElement PWCSSubContractorCompliedMedium()		//Method for searching Username input
	{
		PWCSSubContractorCompliedMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[56]"));
		return PWCSSubContractorCompliedMedium;
		
		
	}
	
	
	
	public static WebElement PWCSSubContractorCompliedLow()		//Method for searching Username input
	{
		PWCSSubContractorCompliedLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[57]"));
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
		PWCSSubContractorNotCompliedHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[58]"));
		return PWCSSubContractorNotCompliedHigh;
		
		
	}
	
			
	
	
	public static WebElement PWCSSubContractorNotCompliedMedium()		//Method for searching Username input
	{
		PWCSSubContractorNotCompliedMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[59]"));
		return PWCSSubContractorNotCompliedMedium;
		
		
	}
	
	
	
	
	
	public static WebElement PWCSSubContractorNotCompliedLow()		//Method for searching Username input
	{
		PWCSSubContractorNotCompliedLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[60]"));
		return PWCSSubContractorNotCompliedLow;
		
		
	}
	
	
	
	
	//////
	
	
	
	
	public static WebElement PWCSSubContractorNotApplicable()		//Method for searching Username input
	{
		PWCSSubContractorNotApplicable = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[36]"));
		return PWCSSubContractorNotApplicable;
		
		
	}
	
	public static WebElement PWCSSubContractorNotApplicableHigh()		//Method for searching Username input
	{
		PWCSSubContractorNotApplicableHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[61]"));
		return PWCSSubContractorNotApplicableHigh;
		
		
	}

	
	
	
	public static WebElement PWCSSubContractorNotApplicableMedium()		//Method for searching Username input
	{
		PWCSSubContractorNotApplicableMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[62]"));
		return PWCSSubContractorNotApplicableMedium;
		
		
	}
	
	
	public static WebElement PWCSSubContractorNotApplicableLow()		//Method for searching Username input
	{
		PWCSSubContractorNotApplicableLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[63]"));
		return PWCSSubContractorNotApplicableLow;
		
		
	}

	
	
	
	///////////////////////////
	
	
	
	
	
	
	public static WebElement PWCSSubContractorProject()		//Method for searching Username input
	{
		PWCSSubContractorProject = getDriver().findElement(By.cssSelector("#MainContentCL > div:nth-child(3) > div:nth-child(1)"));
		return PWCSSubContractorProject;
		
		
	}
	
	
	public static WebElement PWCSSubContractorProjectDD()		//Method for searching Username input
	{
		PWCSSubContractorProjectDD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[position()=12]/div/span[.='Yash Heritage']"));
		return PWCSSubContractorProjectDD;
		
		
	}
	
	
	
	
	public static WebElement PWCSSubContractorPeriodDD()		//Method for searching Username input
	{
		PWCSSubContractorPeriodDD = getDriver().findElement(By.xpath("//span[.='Jan 23']"));
		return PWCSSubContractorPeriodDD;
		
		
	}
	
	
	public static WebElement PWCSSubContractorExpand()		//Method for searching Username input
	{
		PWCSSubContractorExpand = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-more-vertical'])[5]"));
		return PWCSSubContractorExpand;
		
		
	}
	
	
	
	public static WebElement PWCSSubContractorExpandColumn()		//Method for searching Username input
	{
		PWCSSubContractorExpandColumn = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-columns'])[1]"));
		return PWCSSubContractorExpandColumn;
		
		
	}

	
	public static WebElement PWCSSubContractorExpandColumn1()		//Method for searching Username input
	{
		PWCSSubContractorExpandColumn1 = getDriver().findElement(By.xpath("(//span[@class='k-link'])[3]"));
		return PWCSSubContractorExpandColumn1;
		
		
	}
	
	
	public static WebElement PWCSSubContractorExpandType1()		//Method for searching Username input
	{
		PWCSSubContractorExpandType1 = getDriver().findElement(By.xpath("(//span[@class='k-link k-menu-link'])[8]"));
		return PWCSSubContractorExpandType1;
		
		
	}

	
	
	public static WebElement PWCSSubContractorExpandType()		//Method for searching Username input
	{
		PWCSSubContractorExpandType = getDriver().findElement(By.xpath("(//span[@class='k-link k-menu-link'])[4]"));
		return PWCSSubContractorExpandType;
		
		
	}
	
	
	public static WebElement DueDate()		//Method for searching Username input
	{
		DueDate = getDriver().findElement(By.xpath("(//span[@class='k-link k-menu-link'])[10]"));
		return DueDate;
		
		
	}
	

	
	
	
	public static WebElement PWCSSubContractorContractorType()		//Method for searching Username input
	{
		PWCSSubContractorContractorType = getDriver().findElement(By.xpath("//span[.='Contractor Type']"));
		return PWCSSubContractorContractorType;
		
		
	}
	
	public static WebElement SelectContractor()		//Method for searching Username input
	{
		SelectContractor = getDriver().findElement(By.xpath("//*[@id='dvDocuments']/div[1]/div[2]"));
		return SelectContractor;
		
		
	}
	
	
	public static WebElement SelectContractorDD()		//Method for searching Username input
	{
		SelectContractorDD = getDriver().findElement(By.xpath("//span[.='Suraj Infra']"));
		return SelectContractorDD;
		
		
	}
	
	
	
	
	public static WebElement PWCSSubContractorContractorTypeDD()		//Method for searching Username input
	{
		PWCSSubContractorContractorTypeDD = getDriver().findElement(By.xpath("(//span[.='Sub-Contractor'])[3]"));
		return PWCSSubContractorContractorTypeDD;
		
		
	}
	
	
	public static WebElement PWCSSubContractorContractorTypeDD1()		//Method for searching Username input
	{
		PWCSSubContractorContractorTypeDD1 = getDriver().findElement(By.xpath("(//span[.='Contractor'])[1]"));
		return PWCSSubContractorContractorTypeDD1;
		
		
	}
	
	
	public static WebElement PWCSSubContractorContractorTypeDD11()		//Method for searching Username input
	{
		PWCSSubContractorContractorTypeDD11 = getDriver().findElement(By.xpath("(//span[.='Sub-Contractor'])[1]"));
		return PWCSSubContractorContractorTypeDD11;
		
		
	}

	
	public static WebElement Close()		//Method for searching Username input
	{
		Close = getDriver().findElement(By.xpath("(//a[@aria-label='Close'])[1]"));
		return Close;
		
		
	}
	
	
	
	public static WebElement Paging()		//Method for searching Username input
	{
		Paging = getDriver().findElement(By.xpath("//*[@id='grid']/div[3]/span[1]/span/span/span[2]"));
		return Paging;
		
		
	}
	
	
	
	public static WebElement Paging20()		//Method for searching Username input
	{
		Paging20 = getDriver().findElement(By.xpath("(//li[.='20'])[1]"));
		return Paging20;
		
		
	}
	
	
	
	public static WebElement Expand()		//Method for searching Username input
	{
		Expand = getDriver().findElement(By.xpath("(//a[@class='k-icon k-i-expand'])[19]"));
		return Expand;
		
		
	}
	
	
	
	public static WebElement DownloadAndViewButton()		//Method for searching Username input
	{
		DownloadAndViewButton = getDriver().findElement(By.cssSelector("#grid > div.k-grid-content.k-auto-scrollable > table > tbody > tr.k-detail-row.k-alt > td.k-detail-cell > div > div.k-grid-content.k-auto-scrollable > table > tbody > tr:nth-child(1) > td.k-command-cell > a.k-button.k-button-icontext.ob-download.k-grid-docView"));
		return DownloadAndViewButton;
		
		
	}
	
	
	
	public static WebElement Period2()		//Method for searching Username input
	{
		Period2 = getDriver().findElement(By.xpath("//span[.='Jan 22']"));
		return Period2;
		
		
	}
	
    
	public static WebElement Calender()		//Method for searching Username input
	{
		Calender = getDriver().findElement(By.xpath("//*[@id='MainContentCL']/div[3]/span[2]/span/span/span"));
		return Calender;
		
		
	}
	
 
	public static WebElement CalenderDD()		//Method for searching Username input
	{
		CalenderDD = getDriver().findElement(By.xpath("//a[.='17']"));
		return CalenderDD;
		
		
	}

	
	public static WebElement OverdueCircle()		//Method for searching Username input
	{
		OverdueCircle = getDriver().findElement(By.xpath("((//*[@class='highcharts-legend'])[6]//*[name()='g' and 'text'])[4]//*[.='Overdue']"));
		return OverdueCircle;
		
		
	}


	
	
}
