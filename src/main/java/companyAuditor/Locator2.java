package companyAuditor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import login.BasePage;


public class Locator2  extends BasePage{

	
	
	
	
	
   private static WebElement UpcomingCountDashboard = null;
   private static WebElement UpcomingCountGrid = null;
   private static WebElement UpcomingExportButton = null;
   private static WebElement UpcomingClearButton = null;
   private static WebElement ClearButtonStateUpcoming = null;
   private static WebElement ClearButtonStateDDUpcoming = null;
   
   
   
	
	
   private static WebElement OverdueDasboardCount = null;
   private static WebElement OverdueCountGrid = null;
   private static WebElement OverdueExportButton = null;
   private static WebElement OverdueClearButton = null;
   private static WebElement ClearButtonStateOverdue = null;
   private static WebElement ClearButtonStateDDOverdue = null;
   
   
   
   
   
   private static WebElement RejectedDasboardCount = null;
   private static WebElement RejectedCountGrid = null;
   private static WebElement RejectedExportButton = null;
   private static WebElement RejectedClearButton = null;
   private static WebElement ClearButtonStateRejected = null;
   private static WebElement ClearButtonStateDDRejected = null;
   
   
	
	
	
   private static WebElement PendingReviewCountDashboard = null;
   private static WebElement PendingReviewCountGrid = null;
   private static WebElement PendingReviewExportButton = null;
   private static WebElement PendingReviewClearButton = null;
   private static WebElement ClearButtonStatePendingReview = null;
   private static WebElement ClearButtonStateDDRewiew = null;
   private static WebElement ViewButtonPR = null;
   private static WebElement EditButtonPendingReview = null;
   private static WebElement ViewButtonofEditPR = null;
   private static WebElement CommentButtonPR = null;
   private static WebElement CommentTypePR = null;
   private static WebElement EditInEditButton = null;
   private static WebElement ComplianceStatus = null;
   private static WebElement ComplianceStatusDD = null;
   private static WebElement ReviewerStatus = null;
   private static WebElement ReviewerStatusDD = null;
   private static WebElement SaveReviewerStatus = null;
   
   private static WebElement SelectStatus = null;
   private static WebElement SelectStatusDD = null;
   private static WebElement CheckBox = null;
   private static WebElement Save1 = null;

   
   
   private static WebElement ClosedDashboardCountMatch = null;
   private static WebElement ClosedGridCountMatch = null;
   private static WebElement ClosedExportButton = null;
   private static WebElement ClosedClearButton = null;
   private static WebElement ClearButtonStateClosed = null;
   private static WebElement ClearButtonStateDDClosed = null;
   
   
   
   
   
   private static WebElement Document = null;
   private static WebElement DocumentViewButton = null;
   private static WebElement CheckBoxDocument = null;
   private static WebElement CheckBox2Document = null;
   private static WebElement CheckBox3Document = null;
   private static WebElement DownloadDocument = null;
   private static WebElement SelectLocationDocument = null;
   private static WebElement SelectLocationDropDocument = null;
   private static WebElement SelectLocationDropDownDocument = null;
   private static WebElement ClearDocument = null;
   private static WebElement SelectLocationDropDownDocument1 = null;

   
   
   
   
   
   
   private static WebElement Report = null;
   private static WebElement ExportReportR = null;
   private static WebElement StatusR = null;
   private static WebElement StatusDDR = null;
   private static WebElement StateR = null;
   private static WebElement StateDDR = null;
   private static WebElement ClearButtonReport = null;
   private static WebElement ActionClmFileDonld = null;
   private static WebElement MoreReport = null;
   private static WebElement CloseAuditReportR = null;
   private static WebElement MouthCloseReportR = null;
   private static WebElement RemarkReportR = null;
   private static WebElement AuditReport = null;
   private static WebElement ReportDrop = null;
   private static WebElement ReportViewCoplc = null;
   private static WebElement MonthReport = null;
   private static WebElement MonthReportDD = null;
   
   private static WebElement ProjectReport1 = null;
   private static WebElement ProjectReport1DD = null;
   
	
   
   
	
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
   
   
   
   
   
  // Red In Green
   
   
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
   
   
   
   ///////
   
   
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
   private static WebElement ClosePage = null;
   
   
   
   
   
   
   
   
   
   //Project Wise Summery Bar Graph 
   
   private static WebElement PWSCompliedGraph = null;
   private static WebElement PWSCompliedGraphHigh = null;
   private static WebElement PWSCompliedGraphHighGrid = null;
   private static WebElement PWSCompliedGraphHighGridClearButton = null;
   private static WebElement PWSCompliedGraphHighGridViewButton = null;
   private static WebElement CloseFrame = null;
   
   
   
   
   private static WebElement PWSCompliedGraphMedium = null;
   private static WebElement PWSCompliedGraphMediumGrid = null;
   private static WebElement PWSCompliedGraphMediumGridClearButton = null;
   private static WebElement PWSCompliedGraphMediumGridViewButton = null;
   
   
   
   
   
   
   
     private static WebElement PWSCompliedGraphLow = null;
     private static WebElement PWSCompliedGraphLowGrid = null;
     private static WebElement PWSCompliedGraphLowGridClearButton = null;
     private static WebElement PWSCompliedGraphLowGridViewButton = null;
     
   
   
     
     
     private static WebElement PWSNotCompliedGraph = null;
     private static WebElement PWSNotCompliedGraphHighRisk = null;
     private static WebElement PWSNotCompliedGraphHighRiskGrid = null;
     private static WebElement PWSNotCompliedGraphHighRiskGridClearButton = null;
     private static WebElement PWSNotCompliedGraphHighRiskGridViewButton = null;
     
   
     
   
     
     private static WebElement PWSNotCompliedGraphMediumRisk = null;
     private static WebElement PWSNotCompliedGraphMediumRiskGrid = null;
     private static WebElement PWSNotCompliedGraphMediumRiskGridClearButton = null;
     private static WebElement PWSNotCompliedGraphMediumRiskGridViewButton = null;
     
     
     
     
     
     
     
     

     private static WebElement PWSNotCompliedGraphLowRisk = null;
     private static WebElement PWSNotCompliedGraphLowRiskGrid = null;
     private static WebElement PWSNotCompliedGraphLowRiskGridClearButton = null;
     
     
    private static WebElement PWSNotApplicableGraph = null;
    private static WebElement PWSNotApplicableGraphHigh = null;
    private static WebElement PWSNotApplicableGraphHighGrid = null;
    private static WebElement PWSNotApplicableGraphHighGridClearButton = null;
    private static WebElement EditClosedButton = null;
    private static WebElement ClosedReopenButton = null;
    private static WebElement ClosedWindow = null;
    
    private static WebElement PWSNotApplicableGraphLow = null;
    private static WebElement PWSNotApplicableGraphmedium = null;
    
    
	
    
   
    
    
    private static WebElement UpcomingEditButton = null;
    private static WebElement PRCommentFile = null;
   
    private static WebElement PRCommentButton = null;
    private static WebElement EditButtonnPendingReview = null;
    private static WebElement CommentButton = null;
    private static WebElement File = null;
    
    
    
    private static WebElement PRChecklistStatus = null;
    private static WebElement PRAuditCheckListStatusBox = null;
    private static WebElement PRAuditCheckListStatusDD = null;
    private static WebElement CheckBoxPRAudit = null;
    private static WebElement SavePRAudit = null;
    
    
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
    private static WebElement Feb22 = null;

    
    private static WebElement Status1PendingReview = null;
    private static WebElement Status2PendingReview = null;
    private static WebElement ProjectYashConstruction = null;
    private static WebElement ChandranganConstruction = null;
    private static WebElement CreationConstruction = null;

    
    
    private static WebElement ClosedProject = null;
    private static WebElement Status1Closed = null;
    private static WebElement Status2Closed = null;

    private static WebElement Agriculture = null;

    
    
    private static WebElement ProjectFilterCompliedHigh = null;
    private static WebElement StatusFilterCompliedHighDD = null;
    private static WebElement StatusFilterCompliedHighDD1 = null;
    private static WebElement RiskFilterCompliedHigh = null;
    private static WebElement RiskFilterCompliedHighDD1 = null;
    private static WebElement PeriodFilterCompliedHigh = null;
    private static WebElement PeriodFilterCompliedHighDD = null;
    private static WebElement Risk = null;

    
	
    
    private static WebElement Apr24 = null;

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
    private static WebElement Jun20 = null;
    private static WebElement Sep20 = null;
	private static WebElement StatusNADD1 = null;  
	private static WebElement RiskNADD = null;
	private static WebElement RiskNADD1 = null;
	private static WebElement RiskNADDMedium = null;
	private static WebElement RiskNADDMedium1 = null;
	private static WebElement RiskNADDLow = null;
	private static WebElement RiskNADDLow1 = null;
	private static WebElement Jul23 = null;

	
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
	private static WebElement ReportTabStatus = null;
	private static WebElement ReportTabStatusDD = null;
	private static WebElement LocationReport = null;
	private static WebElement LocationProjectMasterExpand = null;
	private static WebElement VCALegalEntityAADDGetText = null;
	
	
	private static WebElement Period2 = null;
	private static WebElement Period3 = null;
	private static WebElement PWSNotApplicableGraphConstruction = null;
	private static WebElement Jul20 = null;
	private static WebElement Feb23 = null;
	private static WebElement Jan24 = null;
	private static WebElement Mar23 = null;
	private static WebElement Jan23 = null;

	private static WebElement PWSCompliedJKHills = null;
	private static WebElement Edit = null;
	private static WebElement Framenew = null;
	private static WebElement Download = null;
	private static WebElement PRIUpdate = null;
	private static WebElement ChandranganConstruction1 = null;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
   
     
    
    
    
    
    
    
    public static WebElement CheckBoxPRAudit()		//Method for searching Username input
	{
    	CheckBoxPRAudit = getDriver().findElement(By.xpath("//th[@class='k-header']//*[name()='input' and @class='k-checkbox']"));
	return CheckBoxPRAudit;
    }


	
	public static WebElement SavePRAudit()		//Method for searching Username input
	{
		SavePRAudit = getDriver().findElement(By.id("btnSavemultiReviewerData"));
	return SavePRAudit;
    }
    
    
    
    
    
    		public static WebElement PRChecklistStatus()		//Method for searching Username input
    		{
    			PRChecklistStatus = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-edit'])[9]"));
    			return PRChecklistStatus;
    		}
    		
    		
    		
    		public static WebElement PRAuditCheckListStatusBox()		//Method for searching Username input
    		{
    			PRAuditCheckListStatusBox = getDriver().findElement(By.xpath("(//span[.='Select Status'])[3]"));
    		return PRAuditCheckListStatusBox;
    	    }
    
    		
    		
    		public static WebElement PRAuditCheckListStatusDD()		//Method for searching Username input
    		{
    			PRAuditCheckListStatusDD = getDriver().findElement(By.xpath("(//li[.='Rejected'])[5]"));
    		return PRAuditCheckListStatusDD;
    	    }
    
    
    
    
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    
    
    
    public static WebElement PRCommentButton()		//Method for searching Username input
	{
    	PRCommentButton = getDriver().findElement(By.xpath("(//button[@class='k-button'])[10]"));
		return PRCommentButton;
	}
    
    
    
    
    
    public static WebElement PRCommentFile()		//Method for searching Username input
	{
    	PRCommentFile = getDriver().findElement(By.xpath("//a[@id='file']"));
		return PRCommentFile;
	}
    
    
    
  
    
    
    public static WebElement UpcomingEditButton()		//Method for searching Username input
	{
    	UpcomingEditButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return UpcomingEditButton;
	}
    
    
  
  
    
    public static WebElement ClosedWindow()		//Method for searching Username input
	{
    	ClosedWindow = getDriver().findElement(By.xpath("//div[@id='ComplianceRevWindow']"));
		return ClosedWindow;
	}
    
    
   
    
   
    public static WebElement ClosedReopenButton()		//Method for searching Username input
	{
    	ClosedReopenButton = getDriver().findElement(By.cssSelector("#btnReopen"));
		return ClosedReopenButton;
	}
	
   
   
  
   
    public static WebElement EditClosedButton()		//Method for searching Username input
	{
      EditClosedButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return EditClosedButton;
	}
    
    
    
   
   
     public static WebElement CloseFrame()		//Method for searching Username input
			{
    	 CloseFrame = getDriver().findElement(By.xpath("(//div[@class='modal-body'])[1]"));
				return CloseFrame;
			}	   
		   
		   
		   
   
   
   
   public static WebElement GridLoad()		//Method for searching Username input
	{
		GridLoad = getDriver().findElement(By.xpath("//div[@class='k-grid-content k-auto-scrollable']"));
		return GridLoad;
	}
	
	
	public static WebElement UpcomingCountDashboard()		//Method for searching Username input
	{
		UpcomingCountDashboard = getDriver().findElement(By.id("divUpcomingCount"));
		return UpcomingCountDashboard;
	}
	
	public static WebElement ViewDocument()		//Method for searching Username input
	{
		UpcomingCountDashboard = getDriver().findElement(By.xpath("//*[@id='gridComplianceAsPerSchedule']/div[2]/table/tbody/tr[1]/td[9]/a[1]"));
		return UpcomingCountDashboard;
	}

	public static WebElement OuterFrame()		//Method for searching Username input
	{
		UpcomingCountDashboard = getDriver().findElement(By.xpath("//iframe[@class='k-content-frame']"));
		return UpcomingCountDashboard;
	}

	
	public static WebElement InnerFrame()		//Method for searching Username input
	{
		UpcomingCountDashboard = getDriver().findElement(By.xpath("//div[@id='doccontrol']//iframe[@src]"));
		return UpcomingCountDashboard;
	}

	public static WebElement Downloadbutton()		//Method for searching Username input
	{
		UpcomingCountDashboard = getDriver().findElement(By.xpath("//span[@id='downloadButton']"));
		return UpcomingCountDashboard;
	}

	
	
	
	public static WebElement UpcomingCountGrid()		//Method for searching Username input
	{
		UpcomingCountGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-labelsss']"));
		return UpcomingCountGrid;
	}
	
	
	public static WebElement UpcomingExportButton()		//Method for searching Username input
	{
		UpcomingExportButton = getDriver().findElement(By.id("btnexport"));
		return UpcomingExportButton;
	}
	
	public static WebElement UpcomingClearButton()		//Method for searching Username input
	{
		UpcomingClearButton = getDriver().findElement(By.xpath("//button[@id='ClearfilterMain']"));
		return UpcomingClearButton;
	}
	
	
	
	public static WebElement ClearButtonStateUpcoming()		//Method for searching Username input
	{
		ClearButtonStateUpcoming = getDriver().findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]"));
	return ClearButtonStateUpcoming;
    }




	public static WebElement ClearButtonStateDDUpcoming()		//Method for searching Username input
	{
		ClearButtonStateDDUpcoming = getDriver().findElement(By.xpath("//span[.='Arunachal Pradesh']"));
	return ClearButtonStateDDUpcoming;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement OverdueDasboardCount()		//Method for searching Username input
	{
		OverdueDasboardCount = getDriver().findElement(By.id("divOverdueCount"));
		return OverdueDasboardCount;
	}
	
	
	public static WebElement OverdueCountGrid()		//Method for searching Username input
	{
		OverdueCountGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return OverdueCountGrid;
	}
	
	
	public static WebElement OverdueExportButton()		//Method for searching Username input
	{
		OverdueExportButton = getDriver().findElement(By.id("btnexport"));
		return OverdueExportButton;
	}
	
	
	public static WebElement OverdueClearButton()		//Method for searching Username input
	{
		OverdueClearButton = getDriver().findElement(By.xpath("//button[@id='ClearfilterMain']"));
		return OverdueClearButton;
	}
	
	
	public static WebElement ClearButtonStateOverdue()		//Method for searching Username input
	{
		ClearButtonStateOverdue = getDriver().findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]"));
	return ClearButtonStateOverdue;
    }




	public static WebElement ClearButtonStateDDOverdue()		//Method for searching Username input
	{
		ClearButtonStateDDOverdue = getDriver().findElement(By.xpath("//span[.='Arunachal Pradesh']"));
	return ClearButtonStateDDOverdue;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement RejectedDasboardCount()		//Method for searching Username input
	{
		RejectedDasboardCount = getDriver().findElement(By.xpath("//div[@id='divRejectedCount']"));
		return RejectedDasboardCount;
	}
	
	
	public static WebElement RejectedCountGrid()		//Method for searching Username input
	{
		RejectedCountGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return RejectedCountGrid;
	}
	
	
	public static WebElement RejectedExportButton()		//Method for searching Username input
	{
		RejectedExportButton = getDriver().findElement(By.id("btnexport"));
		return RejectedExportButton;
	}
	
	public static WebElement RejectedClearButton()		//Method for searching Username input
	{
		RejectedClearButton = getDriver().findElement(By.xpath("//button[@id='ClearfilterMain']"));
		return RejectedClearButton;
	}
	
	
	public static WebElement ClearButtonStateRejected()		//Method for searching Username input
	{
		ClearButtonStateRejected = getDriver().findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]"));
	return ClearButtonStateRejected;
    }




	public static WebElement ClearButtonStateDDRejected()		//Method for searching Username input
	{
		ClearButtonStateDDRejected = getDriver().findElement(By.xpath("//span[.='Arunachal Pradesh']"));
	return ClearButtonStateDDRejected;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement PendingReviewCountDashboard()		//Method for searching Username input
	{
		PendingReviewCountDashboard = getDriver().findElement(By.id("divPendingForReviewCount"));
		return PendingReviewCountDashboard;
	}
	
	
	public static WebElement PendingReviewCountGrid()		//Method for searching Username input
	{
		PendingReviewCountGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return PendingReviewCountGrid;
	}
	
	public static WebElement PendingReviewExportButton()		//Method for searching Username input
	{
		PendingReviewExportButton = getDriver().findElement(By.id("btnexport"));
		return PendingReviewExportButton;
	}
	
	
	public static WebElement PendingReviewClearButton()		//Method for searching Username input
	{
		PendingReviewClearButton = getDriver().findElement(By.xpath("//button[@id='ClearfilterMain']"));
		return PendingReviewClearButton;
	}
	
	
	
	public static WebElement ClearButtonStatePendingReview()		//Method for searching Username input
	{
		ClearButtonStatePendingReview = getDriver().findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]"));
	return ClearButtonStatePendingReview;
    }




	public static WebElement ClearButtonStateDDRewiew()		//Method for searching Username input
	{
		ClearButtonStateDDRewiew = getDriver().findElement(By.xpath("//span[.='Arunachal Pradesh']"));
	return ClearButtonStateDDRewiew;
    }
	
	
	public static WebElement ViewButtonPR()		//Method for searching Username input
	{
		ViewButtonPR = getDriver().findElement(By.xpath("(//a[@role='button'])[2]"));
	return ViewButtonPR;
    }
	
	
	public static WebElement ViewButtonofEditPR()		//Method for searching Username input
	{
		ViewButtonofEditPR = getDriver().findElement(By.xpath("//*[@id='gridComplianceAsPerSchedule']/div[2]/table/tbody/tr[1]/td[9]/a[3]"));
	return ViewButtonofEditPR;
    }

	
 
	public static WebElement CommentButtonPR()		//Method for searching Username input
	{
		CommentButtonPR = getDriver().findElement(By.xpath("//*[@id='gridComplianceAsPerSchedule']/div[2]/table/tbody/tr[1]/td[9]/a[6]"));
	return CommentButtonPR;
    }
	
	
	public static WebElement Downloadupcoming()		//Method for searching Username input
	{
		CommentButtonPR = getDriver().findElement(By.xpath("//*[@id='gridComplianceAsPerSchedule']/div[2]/table/tbody/tr[1]/td[9]/a[2]"));
	return CommentButtonPR;
    }

	public static WebElement CommentTypePR()		//Method for searching Username input
	{
		CommentTypePR = getDriver().findElement(By.id("TxtComments"));
	return CommentTypePR;
    }
	
	
	
	public static WebElement CommentButton()		//Method for searching Username input
	{
		CommentButton = getDriver().findElement(By.xpath("//button[@id='MainSubmit']"));
	return CommentButton;
    }
	
	
	public static WebElement File()		//Method for searching Username input
	{
		File = getDriver().findElement(By.xpath("//a[@id='file']"));
	return File;
    }
	
	
	

	public static WebElement EditInEditButton()		//Method for searching Username input
	{
		EditInEditButton = getDriver().findElement(By.xpath("//*[@id='gridComplianceAsPerSchedule']/div[2]/table/tbody/tr[1]/td[7]/span"));
	return EditInEditButton;
    }
	
	  public static WebElement SelectStatus()		//Method for searching Username input
		{
	    	SelectStatus = getDriver().findElement(By.xpath("(//span[.='Select Status'])[3] | //span[@aria-owns='AuditCheckListStatusID_listbox']"));
			return SelectStatus;
			
			
		}
	  
	    public static WebElement SelectStatusDD()		//Method for searching Username input
	  		{
	    	SelectStatusDD = getDriver().findElement(By.xpath("//*[@id='AuditCheckListStatusID_listbox']/li[1]"));
	  			return SelectStatusDD;
	  			
	  			
	  		}
	  
		   
	    public static WebElement CheckBox()		//Method for searching Username input
		{
	    	CheckBox = getDriver().findElement(By.xpath("(//label[@class='k-checkbox-label k-no-text'])[3]"));
			return CheckBox;
			
			
		}

	    
	    public static WebElement Save1()		//Method for searching Username input
  		{
	    	Save1 = getDriver().findElement(By.xpath("//button[@id='btnSavemultiReviewerData']"));
  			return Save1;
  			
  			
  		}
  
	
	
	public static WebElement ComplianceStatus()		//Method for searching Username input
	{
		ComplianceStatus = getDriver().findElement(By.xpath("(//span[.='Not Applicable'])[3]"));
	return ComplianceStatus;
    }
	
	public static WebElement ComplianceStatusDD()		//Method for searching Username input
	{
		ComplianceStatusDD = getDriver().findElement(By.xpath("(//li[.='Complied'])[1]"));
	return ComplianceStatusDD;
    }
	
	
	public static WebElement ReviewerStatus()		//Method for searching Username input
	{
		ReviewerStatus = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[8]"));
	return ReviewerStatus;
    }
	
	public static WebElement ReviewerStatusDD()		//Method for searching Username input
	{
		ReviewerStatusDD = getDriver().findElement(By.xpath("(//li[.='Rejected'])[1]"));
	return ReviewerStatusDD;
    }
	
	
	public static WebElement SaveReviewerStatus()		//Method for searching Username input
	{
		SaveReviewerStatus = getDriver().findElement(By.id("btnSaveReviewerStatus"));
	return SaveReviewerStatus;
    }
	
	public static WebElement FRAME1()		//Method for searching Username input
	{
		SaveReviewerStatus = getDriver().findElement(By.xpath("//iframe[@id='fc12']"));
	return SaveReviewerStatus;
    }

	
	public static WebElement FRAME()		//Method for searching Username input
	{
		SaveReviewerStatus = getDriver().findElement(By.xpath("//iframe[@class='k-content-frame']"));
	return SaveReviewerStatus;
    }

	
	
	
	public static WebElement EditButtonPendingReview()		//Method for searching Username input
	{
		EditButtonPendingReview = getDriver().findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[14]/a"));
	return EditButtonPendingReview;
    }
	
	public static WebElement Gridload()		//Method for searching Username input
	{
		EditButtonPendingReview = getDriver().findElement(By.xpath("//div[@id='grid']"));
	return EditButtonPendingReview;
    }

	
	
	public static WebElement EditButtonnPendingReview()		//Method for searching Username input
	{
		EditButtonnPendingReview = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
	return EditButtonnPendingReview;
    }
	
	public static WebElement PendingReviewview()		//Method for searching Username input
	{
		EditButtonnPendingReview = getDriver().findElement(By.xpath("//*[@id='gridComplianceAsPerSchedule']/div[2]/table/tbody/tr[1]/td[9]/a[1]"));
	return EditButtonnPendingReview;
    }

	
	
	
	public static WebElement PWSCompliedJKHills()		//Method for searching Username input
	{
		PWSCompliedJKHills = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Geet Heritage']"));
	return PWSCompliedJKHills;
    }
	

	public static WebElement Framenew()		//Method for searching Username input
	{
		Framenew = getDriver().findElement(By.xpath("//iframe[@id='0f66']"));
	return Framenew;
    }
	
	public static WebElement Download()		//Method for searching Username input
	{
		Download = getDriver().findElement(By.xpath("//a[@id='dwn-btn-contract']"));
	return Download;
    }

	
	
	public static WebElement Downloadpr()		//Method for searching Username input
	{
		Download = getDriver().findElement(By.xpath("//*[@id='gridComplianceAsPerSchedule']/div[2]/table/tbody/tr[1]/td[9]/a[2]"));
	return Download;
    }

	
	public static WebElement ClosedDashboardCountMatch()		//Method for searching Username input
	{
		ClosedDashboardCountMatch = getDriver().findElement(By.id("divClosedCount"));
	return ClosedDashboardCountMatch;
    }
	
	public static WebElement ClosedGridCountMatch()		//Method for searching Username input
	{
		ClosedGridCountMatch = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
	return ClosedGridCountMatch;
    }
	
	
	public static WebElement ClosedExportButton()		//Method for searching Username input
	{
		ClosedExportButton = getDriver().findElement(By.id("btnexport"));
	return ClosedExportButton;
    }
	
	
	public static WebElement ClosedClearButton()		//Method for searching Username input
	{
		ClosedClearButton = getDriver().findElement(By.xpath("//button[@id='ClearfilterMain']"));
	return ClosedClearButton;
    }
	
	
	public static WebElement ClearButtonStateClosed()		//Method for searching Username input
	{
		ClearButtonStateClosed = getDriver().findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]"));
	return ClearButtonStateClosed;
    }




	public static WebElement ClearButtonStateDDClosed()		//Method for searching Username input
	{
		ClearButtonStateDDClosed = getDriver().findElement(By.xpath("//span[.='Arunachal Pradesh']"));
	return ClearButtonStateDDClosed;
    }
	
	
	
	public static WebElement Document()		//Method for searching Username input
	{
		Document = getDriver().findElement(By.id("leftdocumentmenu"));
	return Document;
    }
	
	
	public static WebElement DocumentViewButton()		//Method for searching Username input
	{
		DocumentViewButton = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-View k-grid-edit2']"));
	return DocumentViewButton;
    }
	
	
	public static WebElement CheckBoxDocument()		//Method for searching Username input
	{
		CheckBoxDocument = getDriver().findElement(By.xpath("(//input[@id='sel_chkbx'])[3]"));
	return CheckBoxDocument;
    }
	public static WebElement download()		//Method for searching Username input
	{
		CheckBoxDocument = getDriver().findElement(By.xpath("//div[@id='grid']//table//tr//td//a[2]"));
	return CheckBoxDocument;
    }
	
	
	public static WebElement CheckBox2Document()		//Method for searching Username input
	{
		CheckBox2Document = getDriver().findElement(By.xpath("(//input[@id='sel_chkbx'])[4]"));
	return CheckBox2Document;
    }
	
	
	public static WebElement CheckBox3Document()		//Method for searching Username input
	{
		CheckBox3Document = getDriver().findElement(By.xpath("(//input[@id='sel_chkbx'])[5]"));
	return CheckBox3Document;
    }
	
	public static WebElement DownloadDocument()		//Method for searching Username input
	{
		DownloadDocument = getDriver().findElement(By.id("btndownloadDocument"));
	return DownloadDocument;
    }
	
	
	
	public static WebElement SelectLocationDocument()		//Method for searching Username input
	{
		SelectLocationDocument = getDriver().findElement(By.xpath("//*[@id='dvDocuments']/div[1]/div[1]"));
	return SelectLocationDocument;
    }
	
	public static WebElement FacilityOne()		//Method for searching Username input
	{
		SelectLocationDropDocument = getDriver().findElement(By.xpath("//*[@id='dvWC']/div[3]"));
	return SelectLocationDropDocument;
    }
	
	
	
	public static WebElement SelectLocationDropDownDocument()		//Method for searching Username input
	{
		SelectLocationDropDownDocument = getDriver().findElement(By.xpath("(//span[.='VCA Customer Audit'])[5]"));
	return SelectLocationDropDownDocument;
    }
	
	
	public static WebElement SelectLocationDropDownDocument1()		//Method for searching Username input
	{
		SelectLocationDropDownDocument1 = getDriver().findElement(By.xpath("//span[.='Select All']"));
	return SelectLocationDropDownDocument1;
    }

	
	
	public static WebElement ClearDocument()		//Method for searching Username input
	{
		ClearDocument = getDriver().findElement(By.xpath("//button[@id='btnClear']"));
	return ClearDocument;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement Report()		//Method for searching Username input
	{
		Report = getDriver().findElement(By.id("leftReportsmenu"));
	return Report;
    }
	
	public static WebElement ExportReportR()		//Method for searching Username input
	{
		ExportReportR = getDriver().findElement(By.id("btnDownloaddrpReports"));
	return ExportReportR;
    }
	
	
	public static WebElement StatusR()		//Method for searching Username input
	{
		StatusR = getDriver().findElement(By.xpath("//span[.='Status']"));
	return StatusR;
    }
	
	
	public static WebElement StatusDDR()		//Method for searching Username input
	{
		StatusDDR = getDriver().findElement(By.xpath("//span[.='Upcoming']"));
	return StatusDDR;
    }
	
	
	public static WebElement StateR()		//Method for searching Username input
	{
		StateR = getDriver().findElement(By.xpath("//span[.='State']"));
	return StateR;
    }
	
	
	
	
	
	public static WebElement StateDDR()		//Method for searching Username input
	{
		StateDDR = getDriver().findElement(By.xpath("//span[.='Arunachal Pradesh']"));
	return StateDDR;
    }
	
	public static WebElement ClearButtonReport()		//Method for searching Username input
	{
		ClearButtonReport = getDriver().findElement(By.id("ClearfilterMain"));
	return ClearButtonReport;
    }
	
	
	public static WebElement ActionClmFileDonld()		//Method for searching Username input
	{
		ActionClmFileDonld = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-exportAnyStatus k-grid-edit'])[1]"));
	return ActionClmFileDonld;
    }
	
	public static WebElement ProjectReport1()		//Method for searching Username input
	{
		ProjectReport1 = getDriver().findElement(By.xpath("//*[@id='dvProject']/div[2]"));
	return ProjectReport1;
    }

	
	public static WebElement ProjectReport1DD()		//Method for searching Username input
	{
		ProjectReport1DD = getDriver().findElement(By.xpath("//span[.='Chandragan Construction ']"));
	return ProjectReport1DD;
    }

	
	public static WebElement MoreReport()		//Method for searching Username input
	{
		MoreReport = getDriver().findElement(By.xpath("//button[@id='MoreReport']"));
	return MoreReport;
    }
	
	
	
	
	
	public static WebElement CloseAuditReportR()		//Method for searching Username input
	{
		CloseAuditReportR = getDriver().findElement(By.xpath("//button[@id='btnGetVendorAuditForCloseReport']"));
		return CloseAuditReportR;
		
		
	}
	
	
	public static WebElement MouthCloseReportR()		//Method for searching Username input
	{
		MouthCloseReportR = getDriver().findElement(By.xpath("//button[@id='btnReportGeneric']"));
		return MouthCloseReportR;
		
		
	}
	
	
	public static WebElement MonthReport()		//Method for searching Username input
   	{
    	MonthReport = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[2]"));
   	 return MonthReport;
   	}
	
    
    public static WebElement MonthReportDD()		//Method for searching Username input
   	{
    	MonthReportDD = getDriver().findElement(By.xpath("//li[.='Jan 24']"));
   	 return MonthReportDD;
   	}
    
    public static WebElement Facilty()		//Method for searching Username input
   	{
    	MonthReportDD = getDriver().findElement(By.xpath("//*[@id='divReportss']/div[1]/div[2]"));
   	 return MonthReportDD;
   	}

    public static WebElement FaciltyDD()		//Method for searching Username input
   	{
    	MonthReportDD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//div//ul//li[1]"));
   	 return MonthReportDD;
   	}
  
	
	public static WebElement RemarkReportR()		//Method for searching Username input
	{
		RemarkReportR = getDriver().findElement(By.xpath("//button[@id='btnComplianceRemarksReport']"));
		return RemarkReportR;
		
		
	}
	
	
	public static WebElement AuditReport()		//Method for searching Username input
	{
		AuditReport = getDriver().findElement(By.xpath("//button[@id='btnReportGenericAll']"));
		return AuditReport;
		
		
	}
	
	
	
	public static WebElement ReportDrop()		//Method for searching Username input
	{
		ReportDrop = getDriver().findElement(By.cssSelector("#grid > div.k-grid-content.k-auto-scrollable > table > tbody > tr:nth-child(1) > td.k-hierarchy-cell"));
		return ReportDrop;
		
		
	}
	
	
	public static WebElement ReportViewCoplc()		//Method for searching Username input
	{
		ReportViewCoplc = getDriver().findElement(By.xpath("(//a[@role='button'])[4]"));
		return ReportViewCoplc;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement GreenGraph()		//Method for searching Username input
	{
		//GreenGraph = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"));
		GreenGraph = getDriver().findElement(By.xpath("//div[@id='divpieChartPeriodWiseComplianceStatus']//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"));

		
		return GreenGraph;
		
		
	}
	
	
	
	public static WebElement RedGraph()		//Method for searching Username input
	{
	//	RedGraph = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[1]"));
		RedGraph = getDriver().findElement(By.xpath("//div[@id='divpieChartPeriodWiseComplianceStatus']//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"));
		
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
		Frame = getDriver().findElement(By.xpath("//iframe[@id='showdetails']"));
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
	
	
	
	
	
	public static WebElement ViewRedButton()		//Method for searching Username input
	{
		ViewRedButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return ViewRedButton;
		
		
	}
	
	
	
	
	
	
	
	
	
	//   RED Graph DASHBOARD
	
	
	
	public static WebElement RedGraph2()		//Method for searching Username input
	{
	//	RedGraph2 = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"));
		RedGraph2 = getDriver().findElement(By.xpath("//div[@id='divpieChartPeriodWiseComplianceStatus']//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"));

		
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
	
	
	
	
	
	
	
	
	
	/////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement GreyGraph()		//Method for searching Username input
	{
		//GreyGraph = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-2 highcharts-drilldown-data-label']"));
		GreyGraph = getDriver().findElement(By.xpath("//div[@id='divpieChartPeriodWiseComplianceStatus']//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-data-label highcharts-data-label-color-2 highcharts-drilldown-data-label']"));
		
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
		ClosePage = getDriver().findElement(By.xpath("//*[@id='ConstractorPopUpForScheduleComplainces']/div/div/div[1]/button"));
		return ClosePage;
		
		
	}
	
	
	
	
	
	
	////////// Audit Completion Status
	
	/// Red Graph - 
	
	
	
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
	
	public static WebElement Export()		//Method for searching Username input
	{
		ACSBlueGraphGridExportButton = getDriver().findElement(By.xpath("//button[@id='btnDownloaddrpReports']"));
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
	
	
	
	
	//Bar Graph Project Wise Summery
	
	
	public static WebElement PWSCompliedGraph()		//Method for searching Username input
	{
		PWSCompliedGraph = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='ABC Construction']"));
		return PWSCompliedGraph;
		
		
	}
	
	
	public static WebElement PWSCompliedGraphHigh()		//Method for searching Username input
	{
		//PWSCompliedGraphHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
		PWSCompliedGraphHigh = getDriver().findElement(By.xpath("//div[@id='divbarChartProjectWiseComplianceStatus']//*[local-name()='svg']//*[local-name()='g' and contains(@class, 'highcharts-series-3')]//*[local-name()='g' and contains(@class, 'highcharts-data-label')][1]"));
		//PWSCompliedGraphHigh = getDriver().findElement(By.xpath("//*[contains(@class, 'highcharts-label highcharts-data-label highcharts-data-label-color-undefined ') and @transform='translate(156,110)']"));

		
		
		return PWSCompliedGraphHigh;
		
		
	}
	
	
	
	public static WebElement PWSCompliedGraphHighGrid()		//Method for searching Username input
	{
		PWSCompliedGraphHighGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return PWSCompliedGraphHighGrid;
		
		
	}
	
	
	
	
	
	
	public static WebElement PWSCompliedGraphHighGridClearButton()		//Method for searching Username input
	{
		PWSCompliedGraphHighGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
		return PWSCompliedGraphHighGridClearButton;
		
		
	}
	
	
	
	public static WebElement PWSCompliedGraphHighGridViewButton()		//Method for searching Username input
	{
		PWSCompliedGraphHighGridViewButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return PWSCompliedGraphHighGridViewButton;
		
		
	}
	
	
	
	public static WebElement PWSCompliedGraphMedium()		//Method for searching Username input
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), 50);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divbarChartProjectWiseComplianceStatus']//*[local-name()='svg']//*[local-name()='g' and contains(@class, 'highcharts-series-3')]//*[local-name()='g' and contains(@class, 'highcharts-data-label')][1]/following-sibling::*[local-name()='g'][1]")));
		//PWSCompliedGraphMedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
		//PWSCompliedGraphHigh = getDriver().findElement(By.xpath("//div[@id='divbarChartProjectWiseComplianceStatus']//*[local-name()='svg']//*[local-name()='g' and contains(@class, 'highcharts-series-3')]//*[local-name()='g' and contains(@class, 'highcharts-data-label')][1]/following-sibling::*[local-name()='g'][1]"));

		//return PWSCompliedGraphMedium;
		
		
	}
	
	
	public static WebElement PWSCompliedGraphMediumGrid()		//Method for searching Username input
	{
		PWSCompliedGraphMediumGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return PWSCompliedGraphMediumGrid;
		
		
	}
	
	
	public static WebElement PWSCompliedGraphMediumGridClearButton()		//Method for searching Username input
	{
		PWSCompliedGraphMediumGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
		return PWSCompliedGraphMediumGridClearButton;
		
		
	}
	
	
	
	public static WebElement PWSCompliedGraphMediumGridViewButton()		//Method for searching Username input
	{
		PWSCompliedGraphMediumGridViewButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return PWSCompliedGraphMediumGridViewButton;
		
		
	}
	
	
	
	public static WebElement PWSCompliedGraphLow()		//Method for searching Username input
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), 50);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divbarChartProjectWiseComplianceStatus']//*[local-name()='svg']//*[local-name()='g' and contains(@class, 'highcharts-series-3')]//*[local-name()='g' and contains(@class, 'highcharts-data-label')][1]/following-sibling::*[local-name()='g'][2]")));
		
		//PWSCompliedGraphLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[3]"));
		//PWSCompliedGraphLow = getDriver().findElement(By.xpath("//div[@id='divbarChartProjectWiseComplianceStatus']   //*[@id='highcharts-9']  //*[local-name()='svg']   //*[name()='g' and contains(@class, 'highcharts-series-3')]   //*[name()='g' and contains(@class, 'highcharts-data-label')][1]/following-sibling::*[name()='g'][2]"));

		
	//	return PWSCompliedGraphLow;
		
		
	}
	
	
	
	
	public static WebElement PWSCompliedGraphLowGrid()		//Method for searching Username input
	{
		PWSCompliedGraphLowGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return PWSCompliedGraphLowGrid;
		
		
	}
	
	
	
	public static WebElement PWSCompliedGraphLowGridClearButton()		//Method for searching Username input
	{
		PWSCompliedGraphLowGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
		return PWSCompliedGraphLowGridClearButton;
		
		
	}
	
	
	
	public static WebElement PWSCompliedGraphLowGridViewButton()		//Method for searching Username input
	{
		PWSCompliedGraphLowGridViewButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return PWSCompliedGraphLowGridViewButton;
		
		
	}
	
	
	
	////////////////////////
	
	
	
	public static WebElement PWSNotCompliedGraph()		//Method for searching Username input
	{
		PWSNotCompliedGraph = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='ABC Construction']"));
		return PWSNotCompliedGraph;
		
		
	}
	
	
	public static WebElement PWSNotCompliedGraphHighRisk()		//Method for searching Username input
	{
		PWSNotCompliedGraphHighRisk = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[4]"));
		return PWSNotCompliedGraphHighRisk;
		
		
	}
	
	
	
	public static WebElement PWSNotCompliedGraphHighRiskGrid()		//Method for searching Username input
	{
		PWSNotCompliedGraphHighRiskGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return PWSNotCompliedGraphHighRiskGrid;
		
		
	}
	
	
	public static WebElement PWSNotCompliedGraphHighRiskGridClearButton()		//Method for searching Username input
	{
		PWSNotCompliedGraphHighRiskGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
		return PWSNotCompliedGraphHighRiskGridClearButton;
		
		
	}
	
	
	
	public static WebElement PWSNotCompliedGraphHighRiskGridViewButton()		//Method for searching Username input
	{
		PWSNotCompliedGraphHighRiskGridViewButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return PWSNotCompliedGraphHighRiskGridViewButton;
		
		
	}
	
	
	
	
	
	
	
	
	public static WebElement PWSNotCompliedGraphMediumRisk()		//Method for searching Username input
	{
		PWSNotCompliedGraphMediumRisk = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[5]"));
		return PWSNotCompliedGraphMediumRisk;
		
		
	}
	
	
	
	public static WebElement PWSNotCompliedGraphMediumRiskGrid()		//Method for searching Username input
	{
		PWSNotCompliedGraphMediumRiskGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return PWSNotCompliedGraphMediumRiskGrid;
		
		
	}
	
	
	
	
	public static WebElement PWSNotCompliedGraphMediumRiskGridClearButton()		//Method for searching Username input
	{
		PWSNotCompliedGraphMediumRiskGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
		return PWSNotCompliedGraphMediumRiskGridClearButton;
		
		
	}
	
	
	
	public static WebElement PWSNotCompliedGraphMediumRiskGridViewButton()		//Method for searching Username input
	{
		PWSNotCompliedGraphMediumRiskGridViewButton = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return PWSNotCompliedGraphMediumRiskGridViewButton;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement PWSNotCompliedGraphLowRisk()		//Method for searching Username input
	{
		PWSNotCompliedGraphLowRisk = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[6]"));
		return PWSNotCompliedGraphLowRisk;
		
		
	}
	
	
	
	public static WebElement PWSNotCompliedGraphLowRiskGrid()		//Method for searching Username input
	{
		PWSNotCompliedGraphLowRiskGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return PWSNotCompliedGraphLowRiskGrid;
		
		
	}
	
	
	
	public static WebElement PWSNotCompliedGraphLowRiskGridClearButton()		//Method for searching Username input
	{
		PWSNotCompliedGraphLowRiskGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
		return PWSNotCompliedGraphLowRiskGridClearButton;
		
		
	}
	
	
	
	
	
	
	
	
	
	public static WebElement PWSNotApplicableGraph()		//Method for searching Username input
	{
		PWSNotApplicableGraph = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='ABC']"));
		return PWSNotApplicableGraph;
		
		
	}
	
	public static WebElement PWSNotApplicableGraphConstruction()		//Method for searching Username input
	{
		PWSNotApplicableGraphConstruction = getDriver().findElement(By.xpath("((//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Construction'])[1]"));
		return PWSNotApplicableGraphConstruction;
		
		
	}
	
	
	
	
	
	public static WebElement PWSNotApplicableGraphHigh()		//Method for searching Username input
	{
		PWSNotApplicableGraphHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"));
		return PWSNotApplicableGraphHigh;
		
		
	}
	
	
	
	
	public static WebElement PWSNotApplicableGraphHighGrid()		//Method for searching Username input
	{
		PWSNotApplicableGraphHighGrid = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return PWSNotApplicableGraphHighGrid;
		
		
	}
	
	
	
	
	public static WebElement PWSNotApplicableGraphHighGridClearButton()		//Method for searching Username input
	{
		PWSNotApplicableGraphHighGridClearButton = getDriver().findElement(By.id("ClearfilterMain"));
		return PWSNotApplicableGraphHighGridClearButton;
		
		
	}
	
	
	public static WebElement PWSNotApplicableGraphmedium()		//Method for searching Username input
	{
		PWSNotApplicableGraphmedium = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[8]"));
		return PWSNotApplicableGraphmedium;
		
		
	}
	
	
	public static WebElement PWSNotApplicableGraphLow()		//Method for searching Username input
	{
		PWSNotApplicableGraphLow = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[9]"));
		return PWSNotApplicableGraphLow;
		
		
	}
	
	
	///////Multiple Filter
	
	
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
		Project = getDriver().findElement(By.xpath("//*[@id='dvWC']/div[2]"));
	return Project;
    }
	
	
	
	public static WebElement Project2()		//Method for searching Username input
	{
		Project2 = getDriver().findElement(By.xpath("//*[@id='dvWC']/div[1]/div[1]"));
	return Project2;
    }
	
	
	public static WebElement Project3()		//Method for searching Username input
	{
		Project3 = getDriver().findElement(By.xpath("(//span[.='ABC Construction'])[2]"));
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
	
	
	public static WebElement Feb22()		//Method for searching Username input
	{
		Feb22 = getDriver().findElement(By.xpath("//span[.='Feb 22']"));
	return Feb22;
    }
	
	public static WebElement Feb24()		//Method for searching Username input
	{
		Feb22 = getDriver().findElement(By.xpath("//span[.='Feb 24']"));
	return Feb22;
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
		ClosedProject = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=14]"));
	return ClosedProject;
    }
	
	public static WebElement projectdd()		//Method for searching Username input
	{
		ClosedProject = getDriver().findElement(By.xpath("(//span[.='Ecobuild Solutions'])[3]"));
	return ClosedProject;
    }
	
	
	public static WebElement ClickNewProject()		//Method for searching Username input
	{
		ClosedProject = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=3]"));
	return ClosedProject;
    }

	
	public static WebElement ClickProject()		//Method for searching Username input
	{
		ClosedProject = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=7]"));
	return ClosedProject;
    }

	
	public static WebElement Projects()		//Method for searching Username input
	{
		ClosedProject = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=18]"));
	return ClosedProject;
    }

	public static WebElement Agriculture()		//Method for searching Username input
	{
		Agriculture = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=15]//span[.='RCV Industries']"));
	return Agriculture;
    }

	
	
	public static WebElement ProjectYashConstruction()		//Method for searching Username input
	{
		ProjectYashConstruction = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=14]"));
	return ProjectYashConstruction;
    }
	

	public static WebElement ChandranganConstruction()		//Method for searching Username input
	{
		ChandranganConstruction = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=2]"));
	return ChandranganConstruction;
    }

	
	public static WebElement CreationConstruction()		//Method for searching Username input
	{
		CreationConstruction = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=14]"));
	return CreationConstruction;
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
		ProjectFilterCompliedHigh = getDriver().findElement(By.xpath("//*[@id='4798238f-bff6-4b3a-9bc1-333faad3070e_tv_active']/div/span[1]/span"));
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
	
	public static WebElement SelectAll()		//Method for searching Username input
	{
		StatusFilterCompliedHighDD1 = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//div//div/input[@class='k-checkbox']"));
	return StatusFilterCompliedHighDD1;
    }

	
	
	public static WebElement RiskFilterCompliedHigh()		//Method for searching Username input
	{
		RiskFilterCompliedHigh = getDriver().findElement(By.xpath("(//span[.='High'])[3]"));
	return RiskFilterCompliedHigh;
    }
	
	
	
	
	public static WebElement RiskFilterCompliedHighDD1()		//Method for searching Username input
	{
		RiskFilterCompliedHighDD1 = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=1]/div/span[.='High']"));
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
	
	public static WebElement Jun20()		//Method for searching Username input
	{
		Jun20 = getDriver().findElement(By.xpath("//span[.='Jun 20']"));
	return Jun20;
    }

	
	public static WebElement Sep20()		//Method for searching Username input
	{
		Sep20 = getDriver().findElement(By.xpath("//span[.='Sep 20']"));
	return Sep20;
    }

	public static WebElement Jul23()		//Method for searching Username input
	{
		Jul23 = getDriver().findElement(By.xpath("//span[.='Jul 23']"));
	return Jul23;
    }

	
	//Medium
	
	public static WebElement PeriodFilterCompliedMediumDD()		//Method for searching Username input
	{
		PeriodFilterCompliedMediumDD = getDriver().findElement(By.xpath("//span[.='Apr 20']"));
	return PeriodFilterCompliedMediumDD;
    }
	
	public static WebElement Apr24()		//Method for searching Username input
	{
		Apr24 = getDriver().findElement(By.xpath("//span[.='Apr 24']"));
	return Apr24;
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
	
	
	
	public static WebElement DocumentTabSelectContractor()		//Method for searching Username input
	{
		DocumentTabSelectContractor = getDriver().findElement(By.xpath("(//span[.='Contractor'])[1]"));
	return DocumentTabSelectContractor;
    }
	
	
	public static WebElement DocumentTabSelectContractorDD()		//Method for searching Username input
	{
		DocumentTabSelectContractorDD = getDriver().findElement(By.xpath("//span[.='Suraj']"));
	return DocumentTabSelectContractorDD;
    }
	
	
	public static WebElement DocumentContractorDD()		//Method for searching Username input
	{
		DocumentTabSelectContractorDD = getDriver().findElement(By.xpath("//span[.='Shubham Contractors']"));
	return DocumentTabSelectContractorDD;
    }
	
	
	public static WebElement DocumentTabSelectProject()		//Method for searching Username input
	{
		DocumentTabSelectProject = getDriver().findElement(By.xpath("(//span[.='Project'])[1]"));
	return DocumentTabSelectProject;
    }
	
	public static WebElement DocumentTabSelectProject1()		//Method for searching Username input
	{
		DocumentTabSelectProject = getDriver().findElement(By.xpath("//*[@id='dvWC']/div[3]"));
	return DocumentTabSelectProject;
    }

	
	public static WebElement DocumentTabSelectProjectDD()		//Method for searching Username input
	{
		DocumentTabSelectProjectDD = getDriver().findElement(By.xpath("//span[.='Ecobuild Solutions']"));
	return DocumentTabSelectProjectDD;
    }
	
	
	
	
	
	
	public static WebElement LocationReport()		//Method for searching Username input
	{
		LocationReport = getDriver().findElement(By.xpath("//span[.='Entity/Sub-Entity/Location']"));
		return LocationReport;
		
		
	}
	
	
	
	public static WebElement LocationProjectMasterExpand()		//Method for searching Username input
	{
		LocationProjectMasterExpand = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//div//ul//li//div[1]"));
		return LocationProjectMasterExpand;
		
		
	}
	
	
	public static WebElement VCALegalEntityExpandAA()		//Method for searching Username input
	{
		VCALegalEntityExpandAA = getDriver().findElement(By.xpath("(//div[@class='k-check-all'])[4]//span[.='Select All']"));
		return VCALegalEntityExpandAA;
		
		
	}
	
	
	public static WebElement VCALegalEntityAADD()		//Method for searching Username input
	{
		VCALegalEntityAADD = getDriver().findElement(By.xpath("(//span[.='VCA Customer Audit'])[5]"));
		return VCALegalEntityAADD;
		
		
	}
	
	
	public static WebElement VCALegalEntityAADDGetText()		//Method for searching Username input
	{
		VCALegalEntityAADDGetText = getDriver().findElement(By.xpath("//span[.='VCA Limited ']"));
		return VCALegalEntityAADDGetText;
		
		
	}
	
	
	public static WebElement ProjectReport()		//Method for searching Username input
	{
		ProjectReport = getDriver().findElement(By.xpath("//*[@id='dvProject']/div[2]"));
		return ProjectReport;
		
		
	}
	
	
	
	
	public static WebElement ProjectReportDD()		//Method for searching Username input
	{
		ProjectReportDD = getDriver().findElement(By.xpath("//span[.='Geet Heritage']"));
		return ProjectReportDD;
		
		
	}
	
	
	
	
	public static WebElement ReportTabContractor()		//Method for searching Username input
	{
		ReportTabContractor = getDriver().findElement(By.xpath("//*[@id='dvProject']/div[5]"));
		return ReportTabContractor;
		
		
	}
	
	
	
	public static WebElement ReportTabContractorDD()		//Method for searching Username input
	{
		ReportTabContractorDD = getDriver().findElement(By.xpath("//span[.='Suraj - venderowner@gmail.com']"));
		return ReportTabContractorDD;
		
		
	}
	
	
	public static WebElement ReportTabContractorType()		//Method for searching Username input
	{
		ReportTabContractorType = getDriver().findElement(By.xpath("//*[@id='dvReports']/div[1]/div[2]"));
		return ReportTabContractorType;
		
		
	}
	
	
	public static WebElement ReportTabContractorTypeDD()		//Method for searching Username input
	{
		ReportTabContractorTypeDD = getDriver().findElement(By.xpath("(//span[.='Sub-Contractor'])[1]"));
		return ReportTabContractorTypeDD;
		
		
	}
	
	
	public static WebElement ReportTabFequency()		//Method for searching Username input
	{
		ReportTabFequency = getDriver().findElement(By.xpath("//*[@id='dvProject']/div[4]"));
		return ReportTabFequency;
		
		
	}
	
	
	
	public static WebElement ReportTabFequencyDD()		//Method for searching Username input
	{
		ReportTabFequencyDD = getDriver().findElement(By.xpath("//span[.='One Time']"));
		return ReportTabFequencyDD;
		
		
	}
	
	public static WebElement ReportTabFequencyDD1()		//Method for searching Username input
	{
		ReportTabFequencyDD = getDriver().findElement(By.xpath("//span[.='Monthly']"));
		return ReportTabFequencyDD;
		
		
	}

	
	public static WebElement ReportTabPeriod()		//Method for searching Username input
	{
		ReportTabPeriod = getDriver().findElement(By.xpath("//*[@id='dvProject']/div[3]"));
		return ReportTabPeriod;
		
		
	}
	
	
	
	public static WebElement ReportTabPeriodDD()		//Method for searching Username input
	{
		ReportTabPeriodDD = getDriver().findElement(By.xpath("//span[.='May 23']"));
		return ReportTabPeriodDD;
		
		
	}
	
	
	public static WebElement ReportTabStatus()		//Method for searching Username input
	{
		ReportTabStatus = getDriver().findElement(By.xpath("//span[.='Status']"));
		return ReportTabStatus;
		
		
	}
	
	
	public static WebElement ReportTabStatusDD()		//Method for searching Username input
	{
		ReportTabStatusDD = getDriver().findElement(By.xpath("//span[.='Rejected']"));
		return ReportTabStatusDD;
		
		
	}
	
	
	
	public static WebElement Period2()		//Method for searching Username input
	{
		Period2 = getDriver().findElement(By.xpath("//span[.='Oct 23']"));
		return Period2;
		
		
	}
	
	
	public static WebElement Period3()		//Method for searching Username input
	{
		Period3 = getDriver().findElement(By.xpath("//span[.='Jan 20']"));
		return Period3;
		
		
	}
	
	
	
	public static WebElement Jul20()		//Method for searching Username input
	{
		Jul20 = getDriver().findElement(By.xpath("//span[.='Jul 20']"));
		return Jul20;
		
		
	}
	
	
	public static WebElement Jul22()		//Method for searching Username input
	{
		Jul20 = getDriver().findElement(By.xpath("//span[.='Jul 22']"));
		return Jul20;
		
		
	}
	

	
	
	public static WebElement Feb23()		//Method for searching Username input
	{
		Feb23 = getDriver().findElement(By.xpath("//span[.='Feb 23']"));
		return Feb23;
		
		
	}
	

	

	public static WebElement Jan23()		//Method for searching Username input
	{
		Jan23 = getDriver().findElement(By.xpath("//span[.='Jan 23']"));
		return Jan23;
		
		
	}

	
	public static WebElement Jan22()		//Method for searching Username input
	{
		Jan24 = getDriver().findElement(By.xpath("//span[.='Jan 22']"));
		return Jan24;
		
		
	}
	public static WebElement Jun24()		//Method for searching Username input
	{
		Jan24 = getDriver().findElement(By.xpath("//span[.='Jun 24']"));
		return Jan24;
		
		
	}
	
	public static WebElement Jan24()		//Method for searching Username input
	{
		Jan24 = getDriver().findElement(By.xpath("//span[.='Jan 24']"));
		return Jan24;
		
		
	}
	public static WebElement Aug24()		//Method for searching Username input
	{
		Jan24 = getDriver().findElement(By.xpath("//span[.='Aug 24']"));
		return Jan24;
		
		
	}
	
	public static WebElement Jul24()		//Method for searching Username input
	{
		Jan24 = getDriver().findElement(By.xpath("//span[.='Jul 24']"));
		return Jan24;
		
		
	}
	
	
	
	public static WebElement May22()		//Method for searching Username input
	{
		Jan24 = getDriver().findElement(By.xpath("//span[.='May 22']"));
		return Jan24;
		
		
	}
	
	
	public static WebElement Apr22()		//Method for searching Username input
	{
		Jan24 = getDriver().findElement(By.xpath("//span[.='Apr 22']"));
		return Jan24;
		
		
	}

	public static WebElement Jul21()		//Method for searching Username input
	{
		Jan24 = getDriver().findElement(By.xpath("//span[.='Jul 21']"));
		return Jan24;
		
		
	}


	public static WebElement Mar23()		//Method for searching Username input
	{
		Mar23 = getDriver().findElement(By.xpath("//span[.='Mar 23']"));
	return Mar23;
    }
	
	public static WebElement Mar24()		//Method for searching Username input
	{
		Mar23 = getDriver().findElement(By.xpath("//span[.='Mar 24']"));
	return Mar23;
    }


	
	public static WebElement Mar22()		//Method for searching Username input
	{
		Mar23 = getDriver().findElement(By.xpath("//span[.='Mar 22']"));
	return Mar23;
    }

	
	public static WebElement Edit()		//Method for searching Username input
	{
		Edit = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-edit k-grid-edit'])[1]"));
	return Edit;
    }

	
	
	public static WebElement PRIUpdate()		//Method for searching Username input
	{
		PRIUpdate = getDriver().findElement(By.xpath("//span[.='SOC Service Limited']"));
	return PRIUpdate;
    }

	public static WebElement ChandranganConstruction1()		//Method for searching Username input
	{
		ChandranganConstruction1 = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[position()=30]"));
	return ChandranganConstruction1;
    }

	
	
	
}
