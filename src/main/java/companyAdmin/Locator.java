package companyAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import login.BasePage;



public class Locator extends BasePage{

	
	private static WebElement AddEntity = null;	
	private static WebElement EntityName = null;
	private static WebElement SubEntity = null;
	private static WebElement SubEntityD = null;
	private static WebElement EntityType = null;
	private static WebElement EntityTypeD = null;
	private static WebElement LegalEntity = null;
	private static WebElement LegalEntityD = null;
	private static WebElement LegalRelationship = null;
	private static WebElement LegalRelationshipD = null;
	private static WebElement State = null;
	private static WebElement StateD = null;
	private static WebElement City = null;
	private static WebElement CitySearch = null;
	private static WebElement CitySelect = null;
	private static WebElement Adress = null;
	private static WebElement ContactPerson = null;
	private static WebElement Email = null;
	private static WebElement Status = null;
	private static WebElement StatusD = null;
	private static WebElement industry = null;
	private static WebElement industryD = null;
	private static WebElement SubmitButton = null;
	private static WebElement CloseEntityButton = null;
	private static WebElement RefreshEntity = null;
	private static WebElement CityUpdate = null;
	private static WebElement CityDropDown = null;
	private static WebElement Cityvalidationsearch = null;
	private static WebElement CityvalidationSelect = null;
	private static WebElement ValidationSelectCity = null;
	private static WebElement GridCount = null;

	
	private static WebElement Search = null;
	private static WebElement AddSubEntity = null;
	private static WebElement AddSubEntityBranch = null;
	private static WebElement SubEntityName = null;
	private static WebElement SubEntityType = null;
	private static WebElement UpdateSubEntity = null;
	private static WebElement CitySearchsub = null;
	
	
	
	
	private static WebElement SType = null;
	private static WebElement STypeD = null;
	
	private static WebElement LegalRelationshipS = null;
	private static WebElement LegalRelationshipSD = null;
	private static WebElement LegalEntityS = null;
	
	private static WebElement LegalEntitySD = null;
	private static WebElement StateS = null;
	private static WebElement StateSD = null;
	private static WebElement SubAdress = null;
	private static WebElement SubEmail = null;
	private static WebElement SubContactPerson = null;
	private static WebElement SubStatus = null;
	private static WebElement SubStatusD = null;
	private static WebElement CityS = null;
	private static WebElement CitySearchS = null;
	private static WebElement CitySelectS = null;
	
	private static WebElement industryS = null;
	private static WebElement industrySD = null;
	private static WebElement sumitS = null;
	private static WebElement CityDropSub = null;
	private static WebElement EntityClear = null;
	private static WebElement DeleteEntity = null;
	
	private static WebElement Confirm = null;
	private static WebElement EditEntity = null;
	private static WebElement UploadEntity = null;
	private static WebElement ChooseFile = null;
	private static WebElement UploadButton = null;
	private static WebElement DeleteSubEntity = null;
	private static WebElement CloseSubEntity = null;
	private static WebElement StateSD1 = null;
	
	
	private static WebElement ConfirmSubEntityDelete = null;
	private static WebElement RefreshSubEntity = null;
	private static WebElement MasterButton = null;
	
	private static WebElement UserButton = null;
	private static WebElement AddUser = null;
	private static WebElement AddUserFirstName = null;
	private static WebElement AddUserLastName = null;
	private static WebElement AddUserEmail = null;
	private static WebElement AddUserContact = null;
	private static WebElement AddUserRole = null;
	private static WebElement AddUserRoleText = null;
	private static WebElement AddUserSelectRole = null;
	private static WebElement UserSubmitButton = null;
	private static WebElement CloseUserPage = null;
	private static WebElement SearchUser = null;
	private static WebElement DeleteUser = null;
	private static WebElement EditUser = null;
	private static WebElement UserResetPass5 = null;
	private static WebElement Paging = null;
	private static WebElement PagingDD = null;
	
	private static WebElement UserDelete = null;
	private static WebElement UploadUser = null;
	private static WebElement ChooseFileUser = null;
	private static WebElement SubmitUploadUser = null;
	private static WebElement CloseUploadPage = null;
	private static WebElement ClosePageUploadUser = null;
	private static WebElement ContractorClose = null;
	private static WebElement ErrorFile1 = null;
	
	
	
	
	
	private static WebElement ViewContractor = null;
	private static WebElement AddContractor = null;
	private static WebElement AddContractorName = null;
	private static WebElement AddContractorSPOCName = null;
	private static WebElement AddContractorSPOCMail = null;
	private static WebElement AddContractorSPOCContact = null;
	private static WebElement AddContractorType = null;
	private static WebElement AddContractorTypeSearch = null;
	private static WebElement AddContractorTypeSearchSelect = null;
	private static WebElement NatureOfWorkContractor = null;
	private static WebElement SubmitContractor = null;
	private static WebElement CloseContractorPage = null;
	private static WebElement CloseAddContractorPage = null;
	private static WebElement SearchBoxContractor = null;
	private static WebElement EditContractor = null;
	private static WebElement ResetPassContractor = null;
	private static WebElement UpdateContractorType = null;
	private static WebElement DeleteContractor = null;
	private static WebElement UpdateContractor = null;
	private static WebElement DeleteContractor1 = null;

	
	
	private static WebElement ManagementAssignmentButton = null;
	private static WebElement AddManagementAssignment = null;
	private static WebElement LocationMAssign = null;
	private static WebElement LocationMAssignDrop = null;
	private static WebElement LocationMAssignDropDown = null;
	private static WebElement MAssignProject = null;
	private static WebElement MAssignProjectCheckBox = null;
	private static WebElement Space = null;
	private static WebElement MAssignProjectSpace = null;
	private static WebElement MAssignUser = null;
	private static WebElement MAssignUserCheckBox = null;
	private static WebElement MAssignUserUserSpace = null;
	private static WebElement SubmitAssignment = null;
	private static WebElement CloseAddAssignment = null;
	private static WebElement CloseManagementAssignmentPage = null;
	private static WebElement managementClose = null;
	private static WebElement managementuser = null;
	private static WebElement managementProject = null;
	private static WebElement LocationMAssignDropDown1 = null;
	private static WebElement MAssignProjectCheckBox1 = null;
	
	
	
	
	private static WebElement SearchLocationMA = null;
	private static WebElement SearchLocationMADrop = null;
	private static WebElement SearchLocationMADropDown = null;
	private static WebElement SearchSelectProjectMA = null;
	private static WebElement SearchPMA = null;
	private static WebElement SearchPMASelect = null;
	private static WebElement SearchSelectProjectMADropDown = null;
	private static WebElement SearchUserMA = null;
	private static WebElement SearchUserMADropDown = null;
	private static WebElement DeleteMA = null;
	private static WebElement CloseMA = null;
	private static WebElement AddLicenceTypeCT1 = null;
	
	private static WebElement ProjectButton = null;
	private static WebElement AddProject = null;
	private static WebElement AddLocation = null;
	private static WebElement TypeLocation = null;
	private static WebElement SubmitLocation = null;
	private static WebElement CloseLocation = null;
	private static WebElement LocationType = null;
	//private static WebElement ProjectButton = null;
	private static WebElement LocationTypeD = null;
	private static WebElement StatusP = null;
	private static WebElement StatusPD = null;
	private static WebElement ProjectNameP = null;
	private static WebElement Catogarization = null;
	private static WebElement CatogarizationD = null;
	private static WebElement Element = null;
	private static WebElement ElementD = null;
	private static WebElement LocationP = null;
	private static WebElement LocationPDrop = null;
	private static WebElement LocationPDropDown = null;
	private static WebElement Head = null;
	private static WebElement HeadD = null;
	private static WebElement Director = null;
	private static WebElement DirectorD = null;
	private static WebElement SubmitProject = null;
	private static WebElement CloseButtonP = null;
	
	private static WebElement ProjectSearchBox = null;
	private static WebElement EditProject = null;
	private static WebElement LicenceDetails = null;
	private static WebElement AddLicence = null;
	private static WebElement LicenceTypeL = null;
	private static WebElement LicenceTypeLD = null;
	private static WebElement RegistrationNo = null;
	private static WebElement Remark = null;
	private static WebElement ValidityDateL = null;
	private static WebElement UploadDocumentL = null;
	private static WebElement SubmitLicence = null;
	private static WebElement ClosetLicence = null;
	private static WebElement EditProject1 = null;
	private static WebElement SpaceProject1 = null;
	private static WebElement UpdateHead = null;
	private static WebElement DeleteProject = null;
	private static WebElement CloserDate = null;
	private static WebElement SaveCloser = null;
	
	private static WebElement ProjectUpload = null;
	private static WebElement FileInputProject = null;
	private static WebElement ProjectUploadButton = null;
	private static WebElement ViewBranches = null;
	private static WebElement ProjectSearchButton = null;
	private static WebElement ProjectClearButton = null;
	
	//Contractor Tab
	private static WebElement Contractortab = null;
	private static WebElement MapNewProjectButton = null;
	private static WebElement Mapcontractor = null;
	private static WebElement MapcontractorDropDown = null;
	private static WebElement MapSelectProject = null;
	private static WebElement MapSelectProjectDropDown = null;
	private static WebElement MapIfSubContractor = null;
	private static WebElement MapIfSubContractorDropDown = null;
	private static WebElement MapFrequencyofComplienceSubmission = null;
	private static WebElement MapFrequencyofComplienceSubmissionDD = null;
	private static WebElement MapDocumentSubmissionDueDays = null;
	private static WebElement MapContractStartDate = null;
	private static WebElement MapContractEndDate = null;
	private static WebElement MapButtonSave = null;
	private static WebElement MapcontractorSearchBox = null;
	
	
	private static WebElement CTAddContractor = null;
	private static WebElement ContractorNameCT = null;
	private static WebElement ContractorTypeSearchCT = null;
	private static WebElement SaveButtonCT = null;
	private static WebElement EditContractorCT = null;
	private static WebElement DeleteContractorCT = null;
	private static WebElement TextCloserTextCT = null;
	private static WebElement btnSaveClouserDateCT = null;
	private static WebElement AddContractorTypeCT = null;
	private static WebElement ExportButtonCT = null;
	private static WebElement SearchCTCCC = null;
    private static WebElement ClearCT = null;
	private static WebElement SearchSelectState = null;
	private static WebElement SearchSelectStateCTDD = null;
	private static WebElement SearchProjectCT = null;
	private static WebElement SearchProjectCTDD = null;
	private static WebElement SearchSelectLocationCT = null;
	private static WebElement SearchSelectLocationCTDD = null;
	private static WebElement SearchSelectLocationCTDrop = null;
	private static WebElement UploadContractorCT = null;
	private static WebElement FileInputCT = null;
	private static WebElement UploadSubmitCT = null;
	private static WebElement CloseUploadMasterCT = null;
	private static WebElement UploadContractorProjectMappingCT = null;
	private static WebElement UploadContractorProjectMappingUploadBCT = null;
	
	private static WebElement UploadContractorProjectMappingFileCT = null;
	private static WebElement MappingEditProjectCT = null;
	private static WebElement LicenceDetailsCT = null;
	private static WebElement AddLicenceDetailsCT = null;
	private static WebElement AddLicenceTypeCT = null;
	private static WebElement AddLicenceHeadCountCT = null;
	private static WebElement ViewLicenceCT = null;
	private static WebElement EditLicenceCT = null;
	private static WebElement ActAndComplianceMaster = null;
	private static WebElement AddActAndCompliance = null;
	private static WebElement CloseViewLicence = null;
	private static WebElement Hand = null;
	private static WebElement UpdateLicenceTypeCT = null;
	private static WebElement DeleteLicenceC = null;
	
	
	private static WebElement ActAndComplienceCentral = null;
	private static WebElement ActAndComplienceCentralDropDown = null;
	private static WebElement ActNameAC = null;
	private static WebElement ContractorTypeAC = null;
	private static WebElement ContractorTypeDDAC = null;
	private static WebElement ContractorTypespaceAC = null;
	private static WebElement CatogaryAC = null;
	private static WebElement CatogaryACDD = null;
	private static WebElement ButtonSaveAct = null;
	private static WebElement CloseButtonAct = null;
	private static WebElement SelectActAC = null;
	private static WebElement SelectActACDD = null;
	private static WebElement ClearAC = null;
	private static WebElement SelectStateAC = null;
	private static WebElement SelectStateACDD = null;
	private static WebElement SelectCentralorStateAC = null;
	private static WebElement SelectCentralorStateACDD = null;
	private static WebElement EditActAndCompliance = null;
	private static WebElement UpdateActAndComplienceCentral = null;
	private static WebElement DeleteActAndComplienceCentral = null;
	private static WebElement UploadActAndCompliance = null;
	private static WebElement SelectFileActAndCompliance = null;
	private static WebElement UploadButtonAC = null;
	private static WebElement UpdateCatogaryAC = null;
	private static WebElement EnableAC = null;
	private static WebElement ContractorCalendor = null;
	private static WebElement ContractorCalendorDate = null;
	
	private static WebElement CloseAct = null;
	
	
	
	
	private static WebElement ActivationDateAC = null;
	private static WebElement BtnSaveActivationAC = null;
	
	private static WebElement DeActivationDateAC = null;
	private static WebElement BtnSaveDeActivationAC = null;
	private static WebElement AddActSelectStateAC = null;
	private static WebElement ChhoseStateAC = null;
	private static WebElement ChhoseStateACDD = null;
	private static WebElement ComplienceButtonAC = null;
	private static WebElement AddComplienceAC = null;
	private static WebElement AddComplienceSelectAC = null;
	private static WebElement AddComplienceSelectStatutaryAC = null;
	private static WebElement AddComplienceSelectStatutaryACDD = null;
	private static WebElement AddComplienceSelectStatutaryStateAC = null;
	private static WebElement ComplianceHeader = null;
	private static WebElement FrequencyAC = null;
	private static WebElement FrequencyACDD = null;
	private static WebElement ComplianceSaveButtonAC = null;
	private static WebElement ComplianceExportButtonAC = null;
	private static WebElement SelectActDDCOM = null;
	private static WebElement SelectActCom = null;
	private static WebElement SelectStateComplianceDD = null;
	private static WebElement SelectActComplianceDD = null;
	private static WebElement SelectDiffStateComplianceDD = null;
	private static WebElement SelectActAndhraComplianceDD = null;
	private static WebElement EditComplianceAC = null;
	private static WebElement UpdateStatutoryAC = null;
	private static WebElement UpdateCentralorStateAC = null;
	private static WebElement UpdateFrequencyAC = null;
	private static WebElement DeleteComplianceAC = null;
	private static WebElement DeleteTextStartDeactivateDateAC = null;
	private static WebElement DeleteButtonSaveDeactivateAC = null;
	private static WebElement CalenderComplianceAC = null;
	private static WebElement CalenderComplianceDateSelectAC = null;
	private static WebElement ComplianceSearchAC = null;
	private static WebElement ComplianceSearchDDAC = null;
	private static WebElement ComplianceClearBAC = null;
	private static WebElement ComplianceUploadAC = null;
	private static WebElement ChooseFileUploadCompliance = null;
	private static WebElement ButtonComplianceUploadAC = null;
	private static WebElement TemplateButtonAC = null;
	private static WebElement A1ddTemplateAC = null;
	private static WebElement TemplateNameAC = null;
	private static WebElement TemplateTypeAC = null;
	private static WebElement TemplateTypeDDAC = null;
	private static WebElement TemplateCheckBoxAC = null;
	private static WebElement TemplateSaveButtonAC = null;
	private static WebElement EditTemplateAC = null;
	private static WebElement SearchButtonTemplateAC = null;
	private static WebElement SearchButtonTemplateDDAC = null;
	private static WebElement ClerButtonTemplateDDAC = null;
	private static WebElement DeleteTemplateAC = null;
	private static WebElement UploadTemplateDDAC = null;
	private static WebElement ChooseFileTemplateAC = null;
	private static WebElement UploadButtonTemplateAC = null;
	private static WebElement UpdateSelectActCom = null;
	
	
	//ContractorType Master
	
	private static WebElement ContractorTypeButton = null;
	private static WebElement AddContractorTypeButton = null;
	private static WebElement AddContractorTypeName = null;
	private static WebElement AddContractorTypeSaveButton = null;
	private static WebElement CloseContractorTypePage = null;
	private static WebElement EditContractorType = null;
	private static WebElement DeleteContractorType = null;
	private static WebElement ContractorTypeSearchButton = null;
	private static WebElement ContractorTypeClearButton = null;
	private static WebElement ContractorTypeCT = null;
	
	//City Master
	
	private static WebElement CityMasterButton = null;
	private static WebElement AddCityButton = null;
	private static WebElement AddStatenameCityM = null;
	private static WebElement AddStatenameDDCityM = null;
	private static WebElement AddCityName = null;
	private static WebElement SaveCityMaster = null;
	private static WebElement CloseCityPage = null;
	private static WebElement EditCityMaster = null;
	private static WebElement DeletetCityMaster = null;
	private static WebElement CitySearchButtonMaster = null;
	private static WebElement CityClearButtonMaster = null;
	private static WebElement CitySearcStateButtonMaster = null;
	private static WebElement CitySearcStateDDMaster = null;
	private static WebElement UpdateCityStateDDMaster = null;
	
	
	// Licence Type
	
	private static WebElement LicenceTypeMaster = null;
	private static WebElement AddLicenceTypeButton = null;
	private static WebElement AddLicenceTypeName = null;
	private static WebElement SaveLicenceTypeButton = null;
	private static WebElement CloseLicenceTypePage = null;
	private static WebElement EditLicenceType = null;
	private static WebElement DeleteLicenceType = null;
	private static WebElement LicenceTypeSearchButton = null;
	private static WebElement LicenceTypeClearButton = null;
	
	
	//Data Point Master
	private static WebElement DataPointMaster = null;
	private static WebElement AddDataPoint = null;
	private static WebElement AddDataPointDescription = null;
	private static WebElement AddDataPointDescriptionType = null;
	private static WebElement AddDataPointDescriptionTypeDD = null;
	private static WebElement SaveDataPoint = null;
	private static WebElement CloseDataPointPage = null;
	private static WebElement EditDataPoint = null;
	private static WebElement DeleteDataPoint = null;
	private static WebElement SearchBoxDataPoint = null;
	private static WebElement ClearButtonDataPoint = null;
	private static WebElement UpdateDescriptionTypeDDDataPoint = null;
	private static WebElement CloseDataPoint = null;
	
	
	
	//Compliance Mapping
	
	private static WebElement ComplianceMapping = null;
	private static WebElement AddComplianceMapping = null;
	private static WebElement SelectMappingType = null;
	private static WebElement SelectMappingTypeDD = null;
	private static WebElement PendingMapping = null;
	private static WebElement StateCm = null;
	private static WebElement StateCmDD = null;
	private static WebElement SelectLocationCM = null;
	private static WebElement SelectLocationDropCM = null;
	private static WebElement SelectLocationDropDownCM = null;
	private static WebElement ProjectCM = null;
	private static WebElement ProjectCMDD = null;
	private static WebElement SelectComplianceCM = null;
	private static WebElement SelectComplianceDDCM = null;
	private static WebElement SelectActCM = null;
	private static WebElement SelectActDDCM = null;
	private static WebElement CMAddButton = null;
	private static WebElement CMAddProject = null;
	private static WebElement CMAddProjectDD = null;
	
	
	
	
	
	
	
	
	//entity
	private static WebElement CitySelect1 = null;
	
	//Compliance Mapping
	private static WebElement SpaceCM = null;
	private static WebElement ComplianceCheckBox = null;
	private static WebElement SaveCompliance = null;
	private static WebElement mapCompliance = null;
	
	private static WebElement StateCM = null;
	
	private static WebElement UpdateComplienceCM = null;
	private static WebElement UpdateComplienceDrop = null;
	
	private static WebElement UpdateComplienceTempCheckBoxDrop = null;
	private static WebElement RemoveCM = null;
	
	private static WebElement ExportToExcelCM = null;
	private static WebElement ExportButtonCM = null;
	private static WebElement ClearButtonCM = null;
	private static WebElement StateDDCM = null;
	private static WebElement UploadCM = null;
	private static WebElement ChooseFileCM = null;
	
	private static WebElement UploadButtonCM = null;
	private static WebElement ViewButtonCM = null;
	private static WebElement TemplateDropCM = null;
	private static WebElement SelectCompliance11CM = null;
	
	private static WebElement ContractorTypeUser = null;
	private static WebElement ContractorTypeUserSelect = null;
	
	private static WebElement AuditScheduling = null;
	private static WebElement AuditSchedulingUnschedule = null;
	private static WebElement AuditSchedulingUnscheduleSelectPeriod = null;
	private static WebElement SelectPeriodDD = null;
	private static WebElement SelectYearAS = null;
	
	private static WebElement SelectYearASDD = null;
	private static WebElement SaveAuditScheduling = null;
	private static WebElement ScheduleAS = null;
	
	private static WebElement LocationAS = null;
	private static WebElement LocationDropAS = null;
	private static WebElement LocationDropASh = null;
	
	
	private static WebElement SelectProjectAS = null;
	private static WebElement SelectProjectDDAS = null;
	
	private static WebElement ClearButtonAS = null;
	
	
	private static WebElement AuditAssignment = null;
	private static WebElement AssignButtonAA = null;
	private static WebElement SelectAuditor = null;
	private static WebElement SelectAuditorDDAA = null;
	private static WebElement SelectAuditor1 = null;
	private static WebElement SelectAuditorSaveAA = null;
	private static WebElement UnassignButtonAA = null;
	private static WebElement SelectauditorClearBAA = null;
	private static WebElement SelectauditorClearBDDAA = null;
	private static WebElement ClearButtonAA = null;
	private static WebElement UnassignSubmitButtonAA = null;
	private static WebElement AssignSelectAuditorSaveAA = null;

	
	private static WebElement Report = null;
	private static WebElement ExportReportFR = null;
	private static WebElement CalenderStartDReport = null;
	private static WebElement CalenderStartDReportDD = null;
	private static WebElement CalenderEndDReport = null;
	private static WebElement CalenderEndDReportDD = null;
	private static WebElement ClearButtonReport = null;
	private static WebElement MoreReportReport = null;
	private static WebElement CloseAuditReportR = null;
	
	private static WebElement MouthCloseReportR = null;
	private static WebElement RemarkReportR = null;
	private static WebElement AuditReport = null;
	private static WebElement SelectMonth = null;
	private static WebElement SelectMonthDD = null;
	
	
	
	
	
	
	
	private static WebElement UpdateContractorTypeCT = null;
	private static WebElement ActionColmnReportDownload = null;
	
	private static WebElement ViewButtonDropReport = null;
	
	private static WebElement ViewButtonReport = null;
	
	
	
	private static WebElement AddContractorTypeuser = null;
	
	private static WebElement ScheduledTab = null;
	
	
	
	private static WebElement Drop = null;
	private static WebElement editsubentity = null;
	
	
	private static WebElement Reortviewdrop = null;
	private static WebElement ReortviewDownloadbutton = null;
	private static WebElement frame = null;
	private static WebElement download = null;
	
	
	private static WebElement DownloadErrorFile = null;
	private static WebElement DownloadFileNotFound = null;
	private static WebElement DownloadErrorFileTemplate = null;
	
	
	
	private static WebElement managementLocation2 = null;
	private static WebElement managementProject2 = null;
	private static WebElement managementUser2 = null;
	
	
	private static WebElement LocationProjectMaster = null;
	private static WebElement LocationProjectMasterExpand = null;
	private static WebElement LocationProjectMasterDD = null;
	private static WebElement CatogaryProjectMaster = null;
	private static WebElement CatogaryProjectMasterDD = null;
	private static WebElement DirectorProjectMaster = null;
	private static WebElement DirectorProjectMasterDD = null;
	private static WebElement HeadProjectMaster = null;
	private static WebElement HeadProjectMasterDD = null;
	private static WebElement StatusProjectMaster = null;
	private static WebElement StatusProjectMasterDD = null;
	private static WebElement ClearButtonPM = null;
	private static WebElement ContractorProjectMaster = null;
	private static WebElement ContractorMasterProjectDD = null;
	
	private static WebElement ComplianceMappingTabCompliance = null;
	private static WebElement ComplianceMappingTabComplianceDD = null;
	private static WebElement ComplianceMappingTabTemplate = null;
	private static WebElement ComplianceMappingTabTemplateDD = null;
	private static WebElement ASLocationFilterDD = null;
	private static WebElement ASProjectFilterDD = null;
	
	private static WebElement VCALegalEntityExpandAA = null;
	private static WebElement VCALegalEntityAADD = null;
	private static WebElement ProjectDD = null;
	private static WebElement SelectAuditorAA = null;
	private static WebElement SelectAuditorAADD = null;
	private static WebElement LocationProjectMasterAA = null;
	private static WebElement ProjectAA = null;
	private static WebElement LocationReport = null;
	
	
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
	private static WebElement ErrorFile = null;
	
	private static WebElement clickNextPage1 = null;
	private static WebElement readTotalItems1 = null;
	private static WebElement ContractorMasterProjectDD1 = null;
	private static WebElement ProjectAA1 = null;
	private static WebElement readTotalItems11 = null;
	private static WebElement ContractorProjectMaster1 = null;
	private static WebElement ContractorMasterProjectDD11 = null;
	private static WebElement Selectproject = null;
	private static WebElement Close = null;
	private static WebElement uname = null;
	private static WebElement DownloadErrorFile1 = null;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement uname()		//Method for searching Username input
	{
		uname = getDriver().findElement(By.xpath("//*[@id='txtemail']"));
		return uname;
	}
	
	
	
	
	
	
	
	
	public static WebElement ErrorFile()		//Method for searching Username input
	{
		ErrorFile = getDriver().findElement(By.xpath("//a[.='Download Error File']"));
		return ErrorFile;
	}
	
	
	
	public static WebElement CloseSubEntity()		//Method for searching Username input
	{
		CloseSubEntity = getDriver().findElement(By.xpath("(//button[@class='close'])[2]"));
		return CloseSubEntity;
	}
	
	
	
	public static WebElement download()		//Method for searching Username input
	{
		download = getDriver().findElement(By.id("downloadButton"));
		return download;
	}
	
	
	public static WebElement frame()		//Method for searching Username input
	{
		frame = getDriver().findElement(By.xpath("//iframe[@id='cd20']"));
		return frame;
	}
	
	
	
			public static WebElement ReortviewDownloadbutton()		//Method for searching Username input
			{
				ReortviewDownloadbutton = getDriver().findElement(By.xpath("(//td[@class='k-command-cell'])[3]//*[name()='a' and @class='k-button k-button-icontext ob-download k-grid-docView']"));
				return ReortviewDownloadbutton;
			}
	
	
	
			public static WebElement Reortviewdrop()		//Method for searching Username input
			{
				Reortviewdrop = getDriver().findElement(By.xpath("(//a[@class='k-icon k-i-expand'])[3]"));
				return Reortviewdrop;
			}
	
	
	
	public static WebElement editsubentity()		//Method for searching Username input
	{
		editsubentity = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Edit enabled k-grid-edit2']"));
		return editsubentity;
	}
	
	
	
	
	public static WebElement Cityvalidationsearch()		//Method for searching Username input
	{
		Cityvalidationsearch = getDriver().findElement(By.xpath("(//input[@class='k-textbox'])[12]"));
		return Cityvalidationsearch;
	}
	
	
	
	
	public static WebElement CityvalidationSelect()		//Method for searching Username input
	{
		CityvalidationSelect = getDriver().findElement(By.xpath("//li[@class='k-item k-state-selected k-state-focused'])[3]"));
		return CityvalidationSelect;
	}
	
	
	
	
	
	
	
	
	
	
	public static WebElement AddEntity1()		//Method for searching Username input
	{
		AddEntity = getDriver().findElement(By.id("btnNew"));
		return AddEntity;
	}	
		
		
	public static WebElement EntityName()		//Method for searching Username input
	{
		EntityName = getDriver().findElement(By.id("txtEntity"));
		return EntityName;
		
	}
		
	
	public static WebElement SubEntity()		//Method for searching Username input
	{
		SubEntity = getDriver().findElement(By.xpath("(//span[contains(@class,'k-dropdown-wrap k-state-default')])[6]"));
		return SubEntity;
		
	}
	
	
	public static WebElement SubEntityD()		//Method for searching Username input
	{
		SubEntityD = getDriver().findElement(By.xpath("//li[.='Legal Entity (Company)']"));
		return SubEntityD;
		
	}
	
	public static WebElement EntityType()		//Method for searching Username input
	{
		EntityType = getDriver().findElement(By.xpath("(//span[contains(@class,'k-dropdown-wrap k-state-default')])[2]"));
		return EntityType;
		
	}
	
	
	public static WebElement EntityTypeD()		//Method for searching Username input
	{
		EntityTypeD = getDriver().findElement(By.xpath("//li[.='Listed']"));
		return EntityTypeD;
		
	}
	
	
	public static WebElement LegalRelationship()		//Method for searching Username input
	{
		LegalRelationship = getDriver().findElement(By.xpath("(//span[@class='k-input'])[4]"));
		return LegalRelationship;
		
	}
	
	public static WebElement LegalRelationshipD()		//Method for searching Username input
	{
		LegalRelationshipD = getDriver().findElement(By.xpath("//li[.='Joint Venture']"));
		return LegalRelationshipD;
		
	}
	
	
	
	
	public static WebElement LegalEntity()		//Method for searching Username input
	{
		LegalEntity = getDriver().findElement(By.xpath("(//span[.='Select Legal entity type '])[2]"));
		return LegalEntity;
		
	}
	
	public static WebElement LegalEntityD()		//Method for searching Username input
	{
		LegalEntityD = getDriver().findElement(By.xpath("//li[.='Limited Liability Partnership(LLP)']"));
		return LegalEntityD;
		
	}
	
	public static WebElement State()		//Method for searching Username input
	{
		State = getDriver().findElement(By.xpath("(//span[@class='k-input'])[5]"));
		return State;
		
	}
	
	public static WebElement StateD()		//Method for searching Username input
	{
		StateD = getDriver().findElement(By.xpath("//li[.='Maharashtra']"));
		return StateD;
		
	}	
	
	
	public static WebElement City()		//Method for searching Username input
	{
		City = getDriver().findElement(By.xpath("(//span[@class='k-input'])[9]"));
		return City;
		
	}
	
	
	public static WebElement CitySearch()		//Method for searching Username input
	{
		CitySearch = getDriver().findElement(By.xpath("(//input[@role='listbox'])[11]"));
		return CitySearch;
		
	}
	
	
	public static WebElement CityDropDown()		//Method for searching Username input
	{
		CityDropDown = getDriver().findElement(By.xpath("(//li[.='Pune'])[3]"));
		return CityDropDown;
		
	}
	
	public static WebElement ValidationSelectCity()		//Method for searching Username input
	{
		ValidationSelectCity = getDriver().findElement(By.xpath("(//div[@class='k-list-optionlabel'])[10]"));
		return ValidationSelectCity;
		
	}
	
	
	
	
	public static WebElement CitySelect()		//Method for searching Username input
	{
		CitySelect = getDriver().findElement(By.xpath("(//li[.='Pune'])[2]"));
		return CitySelect;
		
	}
	
	public static WebElement CitySelect1()		//Method for searching Username input
	{
		CitySelect1 = getDriver().findElement(By.xpath("(//li[.='Nagpur'])[2]"));
		return CitySelect1;
		
	}
	
	
	
	

	public static WebElement Adress()		//Method for searching Username input
	{
		Adress = getDriver().findElement(By.xpath("//textarea[@id='txtAddress1']"));
		return Adress;
		
	}
	
	
	public static WebElement ContactPerson()		//Method for searching Username input
	{
		ContactPerson = getDriver().findElement(By.xpath("(//input[@type='text'])[3]"));
		return ContactPerson;
		
	}
	
	public static WebElement Email()		//Method for searching Username input
	{
		Email = getDriver().findElement(By.xpath("//input[@id='txtContactEmail']"));
		return Email;
		
	}
	
	public static WebElement Status()		//Method for searching Username input
	{
		Status = getDriver().findElement(By.xpath("(//span[@class='k-input'])[10]"));
		return Status;
		
	}
	
	public static WebElement StatusD()		//Method for searching Username input
	{
		StatusD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul/li[.='Active']"));
		return StatusD;
		
	}
	
	public static WebElement industry()		//Method for searching Username input
	{
		industry = getDriver().findElement(By.xpath("//span[.='Select Industry']"));
		return industry;
		
	}
	
	
	public static WebElement industryD()		//Method for searching Username input
	{
		industryD = getDriver().findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[1]"));
		return industryD;
		
	}
	
	
	public static WebElement SubmitButton()		//Method for searching Username input
	{
		SubmitButton = getDriver().findElement(By.id("btnSave"));
		return SubmitButton;
		
	}
	
	
	
	public static WebElement CloseEntityButton()		//Method for searching Username input
	{
		CloseEntityButton = getDriver().findElement(By.xpath("(//button[contains(@class,'close')])[2]"));
		return CloseEntityButton;
		
	}
	
	public static WebElement RefreshEntity()		//Method for searching Username input
	{
		RefreshEntity = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext k-grid-play disabled k-grid-Activate']"));
		return RefreshEntity;
		
	}
	
	
	
	public static WebElement CityUpdate()		//Method for searching Username input
	{
		CityUpdate = getDriver().findElement(By.xpath("(//input[@class='k-textbox'])[2]']"));
		return CityUpdate;
		
	}
	
	
	// AddSubEntity
	
	
	public static WebElement Search()		//Method for searching Username input
	{
		Search = getDriver().findElement(By.id("txtSearch"));
		return Search;
		
	}
	
		
	public static WebElement AddSubEntity()		//Method for searching Username input
	{
		AddSubEntity = getDriver().findElement(By.xpath("(//a[contains(@class,'k-button k-button-icontext k-grid-arrow-right enabled k-grid-proceed')])[4]"));
		return AddSubEntity;
		
	}
	
	
	public static WebElement AddSubEntityBranch()		//Method for searching Username input
	{
		AddSubEntityBranch = getDriver().findElement(By.id("btnNew"));
		return AddSubEntityBranch;
		
	}
	
	
	
	public static WebElement SubEntityName()		//Method for searching Username input
	{
		SubEntityName = getDriver().findElement(By.id("txtEntity"));
		return SubEntityName;
		
	}
	
	
	public static WebElement SubEntityType()		//Method for searching Username input
	{
		SubEntityType = getDriver().findElement(By.xpath("(//span[contains(@class,'k-input')])[6]"));
		return SubEntityType;
		
	}
	
	public static WebElement SubEntityTypeD()		//Method for searching Username input
	{
		SubEntityType = getDriver().findElement(By.xpath("//li[.='PE']"));
		return SubEntityType;
		
	}
	
	public static WebElement SType()		//Method for searching Username input
	{
		SType = getDriver().findElement(By.xpath("(//span[@class='k-input'])[2]"));
		return SType;
		
	}
	
	
	public static WebElement STypeD()		//Method for searching Username input
	{
		STypeD = getDriver().findElement(By.xpath("//li[.='Listed']"));
		return STypeD;
		
	}
	
	public static WebElement LegalRelationshipS()		//Method for searching Username input
	{
		LegalRelationshipS = getDriver().findElement(By.xpath("(//span[@class='k-input'])[3]"));
		return LegalRelationshipS;
		
	}
	
	
	public static WebElement LegalRelationshipSD()		//Method for searching Username input
	{
		LegalRelationshipSD = getDriver().findElement(By.xpath("//li[.='Joint Venture']"));
		return LegalRelationshipSD;
		
	}
	
	
	public static WebElement LegalEntityS()		//Method for searching Username input
	{
		LegalEntityS = getDriver().findElement(By.xpath("(//span[@class='k-input'])[7]"));
		return LegalEntityS;
		
	}
	
	
	public static WebElement LegalEntitySD()		//Method for searching Username input
	{
		LegalEntitySD = getDriver().findElement(By.xpath("//li[.='Limited Liability Partnership(LLP)']"));
		return LegalEntitySD;
		
	}
	
	public static WebElement StateS()		//Method for searching Username input
	{
		StateS = getDriver().findElement(By.xpath("(//span[.='Select State'])[1]"));
		return StateS;
		
	}
	
	
	public static WebElement StateSD()		//Method for searching Username input
	{
		StateSD = getDriver().findElement(By.xpath("//li[.='Maharashtra']"));
		return StateSD;
		
	}
	
	
	
	public static WebElement StateSD1()		//Method for searching Username input
	{
		StateSD1 = getDriver().findElement(By.xpath("//li[.='Abu Dhabi']"));
		return StateSD1;
		
	}
	
	
	
	
	public static WebElement SubAdress()		//Method for searching Username input
	{
		SubAdress = getDriver().findElement(By.id("txtAddress1"));
		return SubAdress;
		
	}
	
	
	public static WebElement SubEmail()		//Method for searching Username input
	{
		SubEmail = getDriver().findElement(By.id("txtContactEmail"));
		return SubEmail;
		
	}
	
	
	
	public static WebElement SubContactPerson()		//Method for searching Username input
	{
		SubContactPerson = getDriver().findElement(By.id("txtContactPerson"));
		return SubContactPerson;
		
	}
	
	public static WebElement SubStatus()		//Method for searching Username input
	{
		SubStatus = getDriver().findElement(By.xpath("(//span[@class='k-input'])[9]"));
		return SubStatus;
		
	}
	
	
	public static WebElement SubStatusD()		//Method for searching Username input
	{
		SubStatusD = getDriver().findElement(By.xpath("//li[.='Active']"));
		return SubStatusD;
		
	}
	
	public static WebElement CityS()		//Method for searching Username input
	{
		CityS = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header drpreq ddllist'])[5]"));
		return CityS;
		
	}
	
	
	
	public static WebElement CitySearchsub()		//Method for searching Username input
	{
		CitySearchsub = getDriver().findElement(By.xpath("(//input[@role='listbox'])[10]"));
		return CitySearchsub;
		
	}
	
	public static WebElement CityDropSub()		//Method for searching Username input
	{
		CityDropSub = getDriver().findElement(By.xpath("(//ul[@class='k-list k-reset'])[11]//*[name()='li' and .='Mumbai']"));
		return CityDropSub;
		
	}
	
	
	public static WebElement UpdateSubEntity()		//Method for searching Username input
	{
		UpdateSubEntity = getDriver().findElement(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[2]/td[7]/a[1]"));
		return UpdateSubEntity;
		
	}
	
	
	
		
	public static WebElement CitySearchS()		//Method for searching Username input
	{
		CitySearchS = getDriver().findElement(By.xpath("(//input[@class='k-textbox'])[10]"));
		return CitySearchS;
		
	}
	
	public static WebElement CitySelectS()		//Method for searching Username input
	{
		CitySelectS = getDriver().findElement(By.xpath("(//li[.='Kolhapur'])[2]"));
		return CitySelectS;
		
	}
	
	
	public static WebElement industryS()		//Method for searching Username input
	{
		industryS = getDriver().findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]"));
		return industryS;
		
	}
	
	public static WebElement industrySD()		//Method for searching Username input
	{
		industrySD = getDriver().findElement(By.xpath("(//span[@class='k-checkbox-label checkbox-span'])[1]"));
		return industrySD;
		
	}
	
	
	
	
	public static WebElement sumitS()		//Method for searching Username input
	{
		sumitS = getDriver().findElement(By.id("btnSave"));
		return sumitS;
		
	}
	
	public static WebElement EntityClear()		//Method for searching Username input
	{
		EntityClear = getDriver().findElement(By.id("ClearfilterMain"));
		return EntityClear;
		
	}
	
	
	public static WebElement DeleteEntity()		//Method for searching Username input
	{
		DeleteEntity = getDriver().findElement(By.xpath("(//a[@role='button'])[2]"));
		return DeleteEntity;
		
	}
	
	
	public static WebElement Confirm()		//Method for searching Username input
	{
		Confirm = getDriver().findElement(By.id("btnConfirmdelete"));
		return Confirm;
		
	}
	
	
	public static WebElement EditEntity()		//Method for searching Username input
	{
		EditEntity = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Edit enabled k-grid-edit2']"));
		return EditEntity;
		
	}
	
	public static WebElement UploadEntity()		//Method for searching Username input
	{
		UploadEntity = getDriver().findElement(By.id("btnUpload"));
		return UploadEntity;
		
	}
	
	public static WebElement ChooseFile()		//Method for searching Username input
	{
		ChooseFile = getDriver().findElement(By.xpath("//input[@name='BulkUploadData']"));
		return ChooseFile;
		
	}
	
	public static WebElement UploadButton()		//Method for searching Username input
	{
		UploadButton = getDriver().findElement(By.xpath("//button[@id='btnBulkUpload']"));
		return UploadButton;
		
	}
	
	public static WebElement DeleteEntit()		//Method for searching Username input
	{
		UploadButton = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Delete enabled k-grid-delete']"));
		return UploadButton;
		
	}
	
	public static WebElement ViewBranches()		//Method for searching Username input
	{
		ViewBranches = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext k-grid-arrow-right enabled k-grid-proceed'])[1]"));
		return ViewBranches;
		
	}
	
	
	
	
	
	
	
	
	public static WebElement DeleteSubEntity()		//Method for searching Username input
	{
		DeleteSubEntity = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-Delete enabled k-grid-delete'])[1]"));
		return DeleteSubEntity;
		
	}
	
	
	public static WebElement ConfirmSubEntityDelete()		//Method for searching Username input
	{
		ConfirmSubEntityDelete = getDriver().findElement(By.id("btnConfirmdelete1"));
		return ConfirmSubEntityDelete;
		
	}
	
	
	public static WebElement RefreshSubEntity()		//Method for searching Username input
	{
		RefreshSubEntity = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext k-grid-play disabled k-grid-Activate'])[1]"));
		return RefreshSubEntity;
		
	}
	
	public static WebElement MasterButton()		//Method for searching Username input
	{
		MasterButton = getDriver().findElement(By.id("leftmastermenu"));
		return MasterButton;
		
	}
	
	
	
	public static WebElement UserButton()		//Method for searching Username input
	{
		UserButton = getDriver().findElement(By.xpath("//a[.='User']"));
		return UserButton;
		
	}
	
	public static WebElement AddUser()		//Method for searching Username input
	{
		AddUser = getDriver().findElement(By.id("btnNew"));
		return AddUser;
		
	}
	
	public static WebElement AddUserFirstName()		//Method for searching Username input
	{
		AddUserFirstName = getDriver().findElement(By.id("txtName"));
		return AddUserFirstName;
		
	}
	
	public static WebElement AddUserLastName()		//Method for searching Username input
	{
		AddUserLastName = getDriver().findElement(By.id("txtLastName"));
		return AddUserLastName;
		
	}
	
	public static WebElement AddUserEmail()		//Method for searching Username input
	{
		AddUserEmail = getDriver().findElement(By.id("txtEmail"));
		return AddUserEmail;
		
	}
	
	public static WebElement AddUserContact()		//Method for searching Username input
	{
		AddUserContact = getDriver().findElement(By.id("txtContact"));
		return AddUserContact;
		
	}
	
	public static WebElement AddUserRole()		//Method for searching Username input
	{
		AddUserRole = getDriver().findElement(By.xpath("(//span[contains(@class,'k-icon k-i-arrow-60-down')])[3]"));
		return AddUserRole;
		
	}
	
	public static WebElement AddUserRoleText()		//Method for searching Username input
	{
		AddUserRoleText = getDriver().findElement(By.xpath("(//input[@class='k-textbox'])[11]"));
		return AddUserRoleText;
		
	}
	
	public static WebElement AddUserSelectRole()		//Method for searching Username input
	{
		AddUserSelectRole = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[.='Project Director']"));
		return AddUserSelectRole;
		
	}
	
	public static WebElement UserSubmitButton()		//Method for searching Username input
	{
		UserSubmitButton = getDriver().findElement(By.id("btnSave"));
		return UserSubmitButton;
		
	}
	
	public static WebElement CloseUserPage()		//Method for searching Username input
	{
		CloseUserPage = getDriver().findElement(By.xpath("//a[contains(@class,'k-button k-bare k-button-icon k-window')]"));
		return CloseUserPage;
		
	}
	
	
	public static WebElement SearchUser()		//Method for searching Username input
	{
		SearchUser = getDriver().findElement(By.id("txtSearch"));
		return SearchUser;
		
	}
	
	public static WebElement DeleteUser()		//Method for searching Username input
	{
		DeleteUser = getDriver().findElement(By.xpath("(//a[contains(@class,'k-button k-button-icontext ob-Delete')])[14]"));
		return DeleteUser;
		
	}
	
	public static WebElement EditUser()		//Method for searching Username input
	{
		EditUser = getDriver().findElement(By.xpath("//*[@id='gridUser']/div[2]/table/tbody/tr[14]/td[7]/a[1]"));
		return EditUser;
		
	}
	
	public static WebElement UserResetPass5()		//Method for searching Username input
	{
		UserResetPass5 = getDriver().findElement(By.xpath("(//div[@class='ob-Reset'])[14]"));
		return UserResetPass5;
		
	}
	
	
	public static WebElement Paging()		//Method for searching Username input
	{
		Paging = getDriver().findElement(By.xpath("//*[@id='gridUser']/div[3]/span[1]/span"));
		return Paging;
		
	}
	
	public static WebElement PagingDD()		//Method for searching Username input
	{
		PagingDD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[.='20']"));
		return PagingDD;
		
	}
	
	public static WebElement UserDelete()		//Method for searching Username input
	{
		UserDelete = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Delete k-grid-edit2']"));
		return UserDelete;
		
	}
	
	public static WebElement UploadUserButton()		//Method for searching Username input
	{
		UploadUser = getDriver().findElement(By.id("btnUpload"));
		return UploadUser;
		
	}
	
	public static WebElement ChooseFileUser()		//Method for searching Username input
	{
		ChooseFileUser = getDriver().findElement(By.id("fileinput"));
		return ChooseFileUser;
		
	}
	
	public static WebElement SubmitUploadUser()		//Method for searching Username input
	{
		SubmitUploadUser = getDriver().findElement(By.id("btnFileUpload"));
		return SubmitUploadUser;
		
	}
	
	
	public static WebElement ErrorFile1()		//Method for searching Username input
	{
		ErrorFile1 = getDriver().findElement(By.xpath("//a[@id='errorLink']"));
		return ErrorFile1;
		
	}
	

	
	
	
	
	
	public static WebElement ClosePageUploadUser()		//Method for searching Username input
	{
		ClosePageUploadUser = getDriver().findElement(By.xpath("//div[@class='k-window-actions']"));
		return ClosePageUploadUser;
		
	}
	
	
	
	
	
	
	public static WebElement ViewContractor()		//Method for searching Username input
	{
		ViewContractor = getDriver().findElement(By.id("btnNewcontractorVendor"));
		return ViewContractor;
		
	}
	
	public static WebElement AddContractor()		//Method for searching Username input
	{
		AddContractor = getDriver().findElement(By.id("btnAddCont"));
		return AddContractor;
		
	}
	
	public static WebElement AddContractorName()		//Method for searching Username input
	{
		AddContractorName = getDriver().findElement(By.xpath("//input[@id='txtContractor']"));
		return AddContractorName;
		
	}
	
	public static WebElement AddContractorSPOCName()		//Method for searching Username input
	{
		AddContractorSPOCName = getDriver().findElement(By.xpath("//input[@id='txtSpoc']"));
		return AddContractorSPOCName;
		
	}
	
	public static WebElement AddContractorSPOCMail()		//Method for searching Username input
	{
		AddContractorSPOCMail = getDriver().findElement(By.xpath("//input[@id='txtSPOCEmail']"));
		return AddContractorSPOCMail;
		
	}
	
	public static WebElement AddContractorSPOCContact()		//Method for searching Username input
	{
		AddContractorSPOCContact = getDriver().findElement(By.xpath("//input[@id='txtSpocContact']"));
		return AddContractorSPOCContact;
		
	}
	
	public static WebElement AddContractorType()		//Method for searching Username input
	{
		AddContractorType = getDriver().findElement(By.xpath("(//span[.='Select type'])[2]"));
		return AddContractorType;
		
	}
	
	public static WebElement UpdateContractorType()		//Method for searching Username input
	{
		UpdateContractorType = getDriver().findElement(By.xpath("(//span[.='Construction Contractor '])[3]"));
		return UpdateContractorType;
		
	}
	
	public static WebElement AddContractorTypeCT()		//Method for searching Username input
	{
		AddContractorTypeCT = getDriver().findElement(By.xpath("//li[.='Plumbing']"));
		return AddContractorTypeCT;
		
	}
	
	public static WebElement AddContractorTypeuser()		//Method for searching Username input
	{
		AddContractorTypeuser = getDriver().findElement(By.xpath("//div[@class='k-animation-container']/div//ul[@id='drpContractorType_listbox']/li[1]"));
		return AddContractorTypeuser;
		
	}
	
	
	
	
	public static WebElement AddContractorTypeSearch()		//Method for searching Username input
	{
		AddContractorTypeSearch = getDriver().findElement(By.xpath("(//input[@class='k-textbox'])[10]"));
		return AddContractorTypeSearch;
		
	}
	
	
	
	public static WebElement AddContractorTypeSearchSelect()		//Method for searching Username input
	{
		AddContractorTypeSearchSelect = getDriver().findElement(By.xpath("//li[.='Electrical']"));
		return AddContractorTypeSearchSelect;
		
	}
	
	
	public static WebElement NatureOfWorkContractor()		//Method for searching Username input
	{
		NatureOfWorkContractor = getDriver().findElement(By.xpath("//textarea[@id='txtNaturOfWork']"));
		return NatureOfWorkContractor;
		
	}
	
	public static WebElement SubmitContractor()		//Method for searching Username input
	{
		SubmitContractor = getDriver().findElement(By.id("btnSaveContractor"));
		return SubmitContractor;
		
	}
	
	public static WebElement CloseContractorPage()		//Method for searching Username input
	{
		CloseContractorPage = getDriver().findElement(By.xpath("//a[@class='k-button k-bare k-button-icon k-window-action']"));
		return CloseContractorPage;
		
	}
	
	public static WebElement CloseAddContractorPage()		//Method for searching Username input
	{
		CloseAddContractorPage = getDriver().findElement(By.xpath("(//a[contains(@class,'k-button k-bare k-button-icon k-windo')])[1]"));
		return CloseAddContractorPage;
		
	}
	
	public static WebElement SearchBoxContractor()		//Method for searching Username input
	{
		SearchBoxContractor = getDriver().findElement(By.id("txtSearchMGMT"));
		return SearchBoxContractor;
		
	}
	
	
	public static WebElement EditContractor()		//Method for searching Username input
	{
		EditContractor = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-Edit k-grid-Edit'])[9]"));
		return EditContractor;
		
	}
	
	
	// (//span[@class='k-icon k-i-edit'])[11]
	
	public static WebElement ResetPassContractor()		//Method for searching Username input
	{
		ResetPassContractor = getDriver().findElement(By.xpath("//*[@id='gridUser1']/div[2]/table/tbody/tr[9]/td[5]/div"));
		return ResetPassContractor;
		
	}
	
	public static WebElement DeleteContractor()		//Method for searching Username input
	{
		DeleteContractor = getDriver().findElement(By.xpath("//*[@id='gridUser1']/div[2]/table/tbody/tr[9]/td[5]/a[2]"));
		return DeleteContractor;
		
	}
	
	
	public static WebElement DeleteContractor1()		//Method for searching Username input
	{
		DeleteContractor1 = getDriver().findElement(By.xpath("//*[@id='gridUser1']/div[2]/table/tbody/tr[3]/td[5]/a[2]"));
		return DeleteContractor1;
		
	}

	
	public static WebElement ManagementAssignmentButton()		//Method for searching Username input
	{
		ManagementAssignmentButton = getDriver().findElement(By.xpath("//button[@id='btnNewMGMTAssignment']"));
		return ManagementAssignmentButton;
		
	}
	
	public static WebElement AddManagementAssignment()		//Method for searching Username input
	{
		AddManagementAssignment = getDriver().findElement(By.xpath("//button[@id='btnAddAssignment']"));
		return AddManagementAssignment;
		
	}
	
	
	public static WebElement LocationMAssign()		//Method for searching Username input
	{
		LocationMAssign = getDriver().findElement(By.xpath("//span[.='Select Location']"));
		return LocationMAssign;
		
	}
	
	
	
	public static WebElement LocationMAssignDrop()		//Method for searching Username input
	{
		LocationMAssignDrop = getDriver().findElement(By.xpath("(//div[@class='k-top k-bot']//*[name()='span' and@class='k-icon k-i-expand'])[2]"));
		return LocationMAssignDrop;
		
	}
	
	
	public static WebElement LocationMAssignDropDown()		//Method for searching Username input
	{
		LocationMAssignDropDown = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li"));
		return LocationMAssignDropDown;
		
	}
	
	
	public static WebElement LocationMAssignDropDown1()		//Method for searching Username input
	{
		LocationMAssignDropDown1 = getDriver().findElement(By.xpath("(//span[.='Dhulgaon'])[2]"));
		return LocationMAssignDropDown1;
		
	}
	
	
	
//	(//span[.='Hiroshi'])[2]
	
	public static WebElement MAssignProject()		//Method for searching Username input
	{
		MAssignProject = getDriver().findElement(By.xpath("(//span[.='Select Project'])[4]"));
		return MAssignProject;
		
	}
	
	public static WebElement MAssignProjectCheckBox()		//Method for searching Username input
	{
		MAssignProjectCheckBox = getDriver().findElement(By.xpath("(//div[@class='k-animation-container']//div/div[@class='k-widget k-treeview'])[2]//li[1]//div/span[1]"));
		return MAssignProjectCheckBox;
		
	}
	
	
	public static WebElement MAssignProjectCheckBox1()		//Method for searching Username input
	{
		MAssignProjectCheckBox1 = getDriver().findElement(By.xpath("//span[.='pritesh Construction']"));
		return MAssignProjectCheckBox1;
		
	}
	
	
	
	
	public static WebElement Space()		//Method for searching Username input
	{
		Space = getDriver().findElement(By.xpath("//div[@id='divlocationProj']"));
		return Space;
		
	}
	
	
	public static WebElement MAssignProjectSpace()		//Method for searching Username input
	{
		MAssignProjectSpace = getDriver().findElement(By.xpath("//div[@id='divBranchesProj']"));
		return MAssignProjectSpace;
		
	}
	
	
	public static WebElement MAssignUser()		//Method for searching Username input
	{
		MAssignUser = getDriver().findElement(By.xpath("(//span[.='Select User'])[4]"));
		return MAssignUser;
		
	}
	
	public static WebElement MAssignUserCheckBox()		//Method for searching Username input
	{
		MAssignUserCheckBox = getDriver().findElement(By.xpath("//div[@class='k-animation-container']/div/div[@class='k-widget k-treeview']/ul/li[1]"));
		return MAssignUserCheckBox;
		
	}
	
	
	public static WebElement MAssignUserUserSpace()		//Method for searching Username input
	{
		MAssignUserUserSpace = getDriver().findElement(By.xpath("(//label[@class='MainWrapper'])[11]"));
		return MAssignUserUserSpace;
		
	}
	
	
	public static WebElement SubmitAssignment()		//Method for searching Username input
	{
		SubmitAssignment = getDriver().findElement(By.id("btnmgmtAssigment"));
		return SubmitAssignment;
		
	}
	
	
	public static WebElement CloseAddAssignment()		//Method for searching Username input
	{
		CloseAddAssignment = getDriver().findElement(By.xpath("(//a[contains(@class,'k-button k-bare k-button-icon k-window-ac')])[2]"));
		return CloseAddAssignment;
		
	}
	
	
	public static WebElement CloseManagementAssignmentPage()		//Method for searching Username input
	{
		CloseManagementAssignmentPage = getDriver().findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[1]"));
		return CloseManagementAssignmentPage;
		
	}
	
	public static WebElement SearchLocationMA()		//Method for searching Username input
	{
		SearchLocationMA = getDriver().findElement(By.xpath("(//span[contains(@class,'k-dropdown-wrap k-state-def')])[2]"));
		return SearchLocationMA;
		
	}
	
	public static WebElement SearchLocationMADrop()		//Method for searching Username input
	{
		SearchLocationMADrop = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[1]"));
		return SearchLocationMADrop;
		
	}
	
	public static WebElement SearchLocationMADropDown()		//Method for searching Username input
	{
		SearchLocationMADropDown = getDriver().findElement(By.xpath("//span[.='Manufacturing Plant']"));
		return SearchLocationMADropDown;
		
	}
	
	public static WebElement SearchSelectProjectMA()		//Method for searching Username input
	{
		SearchSelectProjectMA = getDriver().findElement(By.xpath("(//span[@class='k-input'])[3]"));
		return SearchSelectProjectMA;
		
	}
	
	public static WebElement SearchPMA()		//Method for searching Username input
	{
		SearchPMA = getDriver().findElement(By.xpath("(//input[@class='k-textbox'])[15]"));
		return SearchPMA;
		
	}
	
	public static WebElement SearchPMASelect()		//Method for searching Username input
	{
		SearchPMASelect = getDriver().findElement(By.xpath("//li[@class='k-item k-state-focused']"));
		return SearchPMASelect;
		
	}
	
	
	public static WebElement SearchSelectProjectMADropDown()		//Method for searching Username input
	{
		SearchSelectProjectMADropDown = getDriver().findElement(By.xpath("(//li[.='Manufacturing Plant '])[2]"));
		return SearchSelectProjectMADropDown;
		
	}
	
	public static WebElement SearchUserMA()		//Method for searching Username input
	{
		SearchUserMA = getDriver().findElement(By.xpath("(//span[contains(@class,'k-dropdown-wrap k-state-defa')])[4]"));
		return SearchUserMA;
		
	}
	
	
	public static WebElement SearchUserMADropDown()		//Method for searching Username input
	{
		SearchUserMADropDown = getDriver().findElement(By.xpath("//li[.='Mgmt User']"));
		return SearchUserMADropDown;
		
	}
	
	public static WebElement DeleteMA()		//Method for searching Username input
	{
		DeleteMA = getDriver().findElement(By.xpath("//*[@id='gridmaaped1']/div[2]/table/tbody/tr[1]/td[4]/a"));
		return DeleteMA;
		
	}
	
	
	public static WebElement CloseMA()		//Method for searching Username input
	{
		CloseMA = getDriver().findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[1]"));
		return CloseMA;
		
	}
	
	public static WebElement ProjectButton()		//Method for searching Username input
	{
		ProjectButton = getDriver().findElement(By.xpath("//a[.='Project / Offices ']"));
		return ProjectButton;
		
	}
	
	public static WebElement AddProject()		//Method for searching Username input
	{
		AddProject = getDriver().findElement(By.xpath("//button[@id='btnNew']"));
		return AddProject;
		
	}
	
	public static WebElement AddLocation()		//Method for searching Username input
	{
		AddLocation = getDriver().findElement(By.id("lnkAddNewProjectofficeModal"));
		return AddLocation;
		
	}
	
	public static WebElement TypeLocation()		//Method for searching Username input
	{
		TypeLocation = getDriver().findElement(By.id("txtProjectOfficeName"));
		return TypeLocation;
		
	}
	
	
	public static WebElement SubmitLocation()		//Method for searching Username input
	{
		SubmitLocation = getDriver().findElement(By.id("btnSaveProjectOffice"));
		return SubmitLocation;
		
	}

	
	public static WebElement CloseLocation()		//Method for searching Username input
	{
		CloseLocation = getDriver().findElement(By.xpath("(//div[@class='k-window-actions'])[2]"));
		return CloseLocation;
		
	}
	
	
	public static WebElement LocationType()		//Method for searching Username input
	{
		LocationType = getDriver().findElement(By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[3]"));
		return LocationType;
		
	}
	
	public static WebElement LocationTypeD()		//Method for searching Username input
	{
		LocationTypeD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']/div/div/ul[@id='txtProjectOffice_listbox']//li[1]"));
		return LocationTypeD;
		
	}
	
	
	public static WebElement StatusP()		//Method for searching Username input
	{
		StatusP = getDriver().findElement(By.xpath("(//span[contains(@class,'k-dropdown-wrap k-state-defau')])[4]"));
		return StatusP;
		
	}
	
	public static WebElement StatusPD()		//Method for searching Username input
	{
		StatusPD = getDriver().findElement(By.xpath("(//li[.='Active'])[2]"));
		return StatusPD;
		
	}
	
	
	public static WebElement ProjectNameP()		//Method for searching Username input
	{
		ProjectNameP = getDriver().findElement(By.xpath("//input[@id='txtProjectName']"));
		return ProjectNameP;
		
	}
	
	public static WebElement Catogarization()		//Method for searching Username input
	{
		Catogarization = getDriver().findElement(By.xpath("(//span[contains(@class,'k-dropdown-wrap k-state-defa')])[5]"));
		return Catogarization;
		
	}
	
	public static WebElement CatogarizationD()		//Method for searching Username input
	{
		CatogarizationD = getDriver().findElement(By.xpath("(//li[.='CTS'])[2]"));
		return CatogarizationD;
		
	}
	
	public static WebElement Element()		//Method for searching Username input
	{
		Element = getDriver().findElement(By.xpath("(//span[contains(@class,'k-dropdown-wrap k-state-defau')])[6]"));
		return Element;
		
	}
	
	public static WebElement ElementD()		//Method for searching Username input
	{
		ElementD = getDriver().findElement(By.xpath("//li[.='Demo Element']"));
		return ElementD;
		
	}
	
	public static WebElement LocationP()		//Method for searching Username input
	{
		LocationP = getDriver().findElement(By.xpath("//*[@id='divCaseSummary']/div[4]/span"));
		return LocationP;
		
	}
	
	
	public static WebElement LocationPDrop()		//Method for searching Username input
	{
		LocationPDrop = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li/div"));
		return LocationPDrop;
		
	}
	
	public static WebElement LocationPDropDown()		//Method for searching Username input
	{
		LocationPDropDown = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//div//ul[@class='k-group']//li[3]//span/span"));
		return LocationPDropDown;
		
	}
	
	
	public static WebElement Head()		//Method for searching Username input
	{
		Head = getDriver().findElement(By.xpath("(//span[.='Select Name'])[3]"));
		return Head;
		
	}
	
	public static WebElement HeadD()		//Method for searching Username input
	{
		HeadD = getDriver().findElement(By.xpath("(//ul[@id='dropdownHead_listbox']//li)[4]"));
		return HeadD;
		
	}
	
	public static WebElement Director()		//Method for searching Username input
	{
		Director = getDriver().findElement(By.xpath("(//span[@class='k-select'])[16]"));
		return Director;
		
	}
	
	public static WebElement DirectorD()		//Method for searching Username input
	{
		DirectorD = getDriver().findElement(By.xpath("(//ul[@id='dropdownDirector_listbox']//li)[2]"));
		return DirectorD;
		
	}
	
	
	public static WebElement SubmitProject()		//Method for searching Username input
	{
		SubmitProject = getDriver().findElement(By.id("btnSave"));
		return SubmitProject;
		
	}
	
	public static WebElement CloseButtonP()		//Method for searching Username input
	{
		CloseButtonP = getDriver().findElement(By.xpath("(//a[contains(@class,'k-button k-bare k-button-icon k-window-acti')])[1]"));
		return CloseButtonP;
		
	}
	
	
	public static WebElement ProjectSearchBox()		//Method for searching Username input
	{
		ProjectSearchBox = getDriver().findElement(By.id("txtSearch"));
		return ProjectSearchBox;
		
	}
	
	public static WebElement EditProject()		//Method for searching Username input
	{
		EditProject = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return EditProject;
		
	}
	
	
	public static WebElement LicenceDetails()		//Method for searching Username input
	{
		LicenceDetails = getDriver().findElement(By.xpath("//li[contains(@class,'k-item k-state-default k-la')]"));
		return LicenceDetails;
		
	}
	
	
	
	public static WebElement AddLicence()		//Method for searching Username input
	{
		AddLicence = getDriver().findElement(By.xpath("//button[@id='btnAdddoc']"));
		return AddLicence;
		
	}
	
	
	public static WebElement LicenceTypeL()		//Method for searching Username input
	{
		LicenceTypeL = getDriver().findElement(By.xpath("//*[@id='NewDocModal']/div/div[1]/span"));
		return LicenceTypeL;
		
	}
	
	public static WebElement LicenceTypeLD()		//Method for searching Username input
	{
		LicenceTypeLD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']/div/div/ul[@id='dropdownLicenseType_listbox']/li[1]"));
		return LicenceTypeLD;
		
	}
	
	public static WebElement RegistrationNo()		//Method for searching Username input
	{
		RegistrationNo = getDriver().findElement(By.xpath("//input[@id='txtRegistrationNo']"));
		return RegistrationNo;
		
	}
	
	public static WebElement Remark()		//Method for searching Username input
	{
		Remark = getDriver().findElement(By.xpath("//textarea[@id='txtRemark']"));
		return Remark;
		
	}
	
	
	public static WebElement ValidityDateL()		//Method for searching Username input
	{
		ValidityDateL = getDriver().findElement(By.xpath("//input[@id='txtValidity']"));
		return ValidityDateL;
		
	}
	
	
	public static WebElement UploadDocumentL()		//Method for searching Username input
	{
		UploadDocumentL = getDriver().findElement(By.xpath("//input[@id='txtUpload']"));
		return UploadDocumentL;
		
	}
	
	public static WebElement Calender1()		//Method for searching Username input
	{
		UploadDocumentL = getDriver().findElement(By.xpath("//*[@id='NewDocModal']/div/div[3]/span/span/span[2]"));
		return UploadDocumentL;
		
	}

	public static WebElement Calender1DD()		//Method for searching Username input
	{
		UploadDocumentL = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//div/div/table//tr[2]//td[6]"));
		return UploadDocumentL;
		
	}

	public static WebElement Calender2()		//Method for searching Username input
	{
		UploadDocumentL = getDriver().findElement(By.xpath("//*[@id='NewDocModal']/div/div[4]/span/span/span[2]"));
		return UploadDocumentL;
		
	}

	public static WebElement Calender2DD()		//Method for searching Username input
	{
		UploadDocumentL = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//div/div/table//tr[6]//td[1]"));
		return UploadDocumentL;
		
	}

	
	
	public static WebElement SubmitLicence()		//Method for searching Username input
	{
		SubmitLicence = getDriver().findElement(By.id("btnSavedoc"));
		return SubmitLicence;
		
	}
	
	
	public static WebElement ClosetLicence()		//Method for searching Username input
	{
		ClosetLicence = getDriver().findElement(By.xpath("(//a[contains(@class,'k-button k-bare k-button-icon k-window-ac')])[2]"));
		return ClosetLicence;
		
	}
	
	
	public static WebElement EditProject1()		//Method for searching Username input
	{
		EditProject1 = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return EditProject1;
		
	}
	
	
	public static WebElement SpaceProject1()		//Method for searching Username input
	{
		SpaceProject1 = getDriver().findElement(By.xpath("(//label[@class='MainWrapper'])[12]"));
		return SpaceProject1;
		
	}
	
	public static WebElement UpdateHead()		//Method for searching Username input
	{
		UpdateHead = getDriver().findElement(By.xpath("(//span[@class='k-input'])[12]"));
		return UpdateHead;
		
	}
	
	
	public static WebElement DeleteProject()		//Method for searching Username input
	{
		DeleteProject = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Disable k-grid-edit2']"));
		return DeleteProject;
		
	}
	
	public static WebElement CloserDate()		//Method for searching Username input
	{
		CloserDate = getDriver().findElement(By.id("txtClouserDate"));
		return CloserDate;
		
	}
	
	public static WebElement SaveCloser()		//Method for searching Username input
	{
		SaveCloser = getDriver().findElement(By.id("btnSaveClouserDate"));
		return SaveCloser;
		
	}
	
	public static WebElement ProjectUpload()		//Method for searching Username input
	{
		ProjectUpload = getDriver().findElement(By.id("btnUpload"));
		return ProjectUpload;
		
	}
	
	public static WebElement FileInputProject()		//Method for searching Username input
	{
		FileInputProject = getDriver().findElement(By.id("fileinput"));
		return FileInputProject;
		
	}
	
	public static WebElement ProjectUploadButton()		//Method for searching Username input
	{
		ProjectUploadButton = getDriver().findElement(By.id("btnFileUpload"));
		return ProjectUploadButton;
		
	}
	
	public static WebElement UpdateContractor()		//Method for searching Username input
	{
		UpdateContractor = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-Edit k-grid-Edit'])[1]"));
		return UpdateContractor;
		
	}
	
	public static WebElement ProjectSearchButton()		//Method for searching Username input
	{
		ProjectSearchButton = getDriver().findElement(By.id("txtSearch"));
		return ProjectSearchButton;
		
	}
	
	public static WebElement ProjectClearButton()		//Method for searching Username input
	{
		ProjectClearButton = getDriver().findElement(By.id("btnClear"));
		return ProjectClearButton;
		
	}
	
	public static WebElement Contractortab()		//Method for searching Username input
	{
		Contractortab = getDriver().findElement(By.xpath("(//a[.='Contractor'])[1]"));
		return Contractortab;
		
	}
	
	
	public static WebElement MapNewProjectButton()		//Method for searching Username input
	{
		MapNewProjectButton = getDriver().findElement(By.id("btnNewmapping"));
		return MapNewProjectButton;
		
	}
	
	public static WebElement Mapcontractor()		//Method for searching Username input
	{
		Mapcontractor = getDriver().findElement(By.xpath("(//span[.='Select Contractor'])[1]"));
		return Mapcontractor;
		
	}
	
	public static WebElement MapcontractorSearchBox()		//Method for searching Username input
	{
		MapcontractorSearchBox = getDriver().findElement(By.xpath("(//input[@role='listbox'])[5]"));
		return MapcontractorSearchBox;
		
	}
	
	
	
	public static WebElement MapcontractorDropDown()		//Method for searching Username input
	{
		MapcontractorDropDown = getDriver().findElement(By.xpath("//div[@class='k-animation-container']/div/div/ul[@id='dropdownContractorName_listbox']/li[1]"));
		return MapcontractorDropDown;
		
	}
	
	public static WebElement MapSelectProject()		//Method for searching Username input
	{
		MapSelectProject = getDriver().findElement(By.xpath("(//span[.='Select Project'])[1]"));
		return MapSelectProject;
		
	}
	
	public static WebElement MapSelectProjectDropDown()		//Method for searching Username input
	{
		MapSelectProjectDropDown = getDriver().findElement(By.xpath("(//ul[@id='dropdownProjectName_listbox'])[2]//li"));
		return MapSelectProjectDropDown;
		
	}
	
	
	
	
	public static WebElement MapIfSubContractor()		//Method for searching Username input
	{
		MapIfSubContractor = getDriver().findElement(By.xpath("(//span[.='No'])[1]"));
		return MapIfSubContractor;
		
	}
	
	
	public static WebElement SelectType()		//Method for searching Username input
	{
		MapIfSubContractor = getDriver().findElement(By.xpath("//*[@id='subcon']/span"));
		return MapIfSubContractor;
		
	}

	public static WebElement SelectTypeDD()		//Method for searching Username input
	{
		MapIfSubContractor = getDriver().findElement(By.xpath("(//ul[@id='dropdowndrpProjectName_listbox'])[1]/li"));
		return MapIfSubContractor;
		
	}

	
	
	
	public static WebElement MapIfSubContractorDropDown()		//Method for searching Username input
	{
		MapIfSubContractorDropDown = getDriver().findElement(By.xpath("//li[.='Yes']"));
		return MapIfSubContractorDropDown;
		
	}
	
	public static WebElement Mapcheckbox()		//Method for searching Username input
	{
		MapIfSubContractorDropDown = getDriver().findElement(By.xpath("//input[@id='checkboxisshow']"));
		return MapIfSubContractorDropDown;
		
	}

	
	
	public static WebElement MapFrequencyofComplienceSubmission()		//Method for searching Username input
	{
		MapFrequencyofComplienceSubmission = getDriver().findElement(By.xpath("//*[@id='divCaseSummary']/div[10]/span"));
		return MapFrequencyofComplienceSubmission;
		
	}
	
	
	public static WebElement MapFrequencyofComplienceSubmissionDD()		//Method for searching Username input
	{
		MapFrequencyofComplienceSubmissionDD = getDriver().findElement(By.xpath("(//ul[@id='drpFrequency_listbox'])[1]//li"));
		return MapFrequencyofComplienceSubmissionDD;
		
	}
	
	public static WebElement MapDocumentSubmissionDueDays()		//Method for searching Username input
	{
		MapDocumentSubmissionDueDays = getDriver().findElement(By.id("txtDueDays"));
		return MapDocumentSubmissionDueDays;
		
	}
	
	public static WebElement MapContractStartDate()		//Method for searching Username input
	{
		MapContractStartDate = getDriver().findElement(By.id("txtContractStartDate"));
		return MapContractStartDate;
		
	}
	
	
	public static WebElement MapContractEndDate()		//Method for searching Username input
	{
		MapContractEndDate = getDriver().findElement(By.id("txtContractEndDate"));
		return MapContractEndDate;
		
	}
	
	
	public static WebElement MapButtonSave()		//Method for searching Username input
	{
		MapButtonSave = getDriver().findElement(By.id("btnmapSave"));
		return MapButtonSave;
		
	}
	
	
	public static WebElement CTAddContractor()		//Method for searching Username input
	{
		CTAddContractor = getDriver().findElement(By.id("btnNew"));
		return CTAddContractor;
		
	}
	
	
	public static WebElement ContractorNameCT()		//Method for searching Username input
	{
		ContractorNameCT = getDriver().findElement(By.id("txtContractor"));
		return ContractorNameCT;
		
	}
	
	
	public static WebElement ContractorTypeSearchCT()		//Method for searching Username input
	{
		ContractorTypeSearchCT = getDriver().findElement(By.xpath("(//input[@role='listbox'])[3]"));
		return ContractorTypeSearchCT;
		
	}
	
	public static WebElement SaveButtonCT()		//Method for searching Username input
	{
		SaveButtonCT = getDriver().findElement(By.id("btnSave"));
		return SaveButtonCT;
		
	}
	
	
	public static WebElement EditContractorCT()		//Method for searching Username input
	{
		EditContractorCT = getDriver().findElement(By.xpath("//*[@id='gridContractor']/div[2]/table/tbody/tr[1]/td[9]/a[1]"));
		return EditContractorCT;
		
	}
	
	
	public static WebElement DeleteContractorCT()		//Method for searching Username input
	{
		DeleteContractorCT = getDriver().findElement(By.xpath("//*[@id='gridContractor']/div[2]/table/tbody/tr[1]/td[9]/a[7]"));
		return DeleteContractorCT;
		
	}
	
	public static WebElement TextCloserTextCT()		//Method for searching Username input
	{
		TextCloserTextCT = getDriver().findElement(By.id("txtClouserDate"));
		return TextCloserTextCT;
		
	}
	
	public static WebElement btnSaveClouserDateCT()		//Method for searching Username input
	{
		btnSaveClouserDateCT = getDriver().findElement(By.id("btnSaveClouserDate"));
		return btnSaveClouserDateCT;
		
	}
	
	
	
	public static WebElement ExportButtonCT()		//Method for searching Username input
	{
		ExportButtonCT = getDriver().findElement(By.id("btnexport"));
		return ExportButtonCT;
		
	}
	
	public static WebElement ReportExport()		//Method for searching Username input
	{
		ExportButtonCT = getDriver().findElement(By.xpath("//button[@id='btnDownloaddrpReports']"));
		return ExportButtonCT;
		
	}
	

	
	
	public static WebElement SearchCTCCC()		//Method for searching Username input
	{
		SearchCTCCC = getDriver().findElement(By.id("txtSearch"));
		return SearchCTCCC;
		
	}
	
	public static WebElement ClearCT()		//Method for searching Username input
	{
		ClearCT = getDriver().findElement(By.id("btnClear"));
		return ClearCT;
		
	}
	
	public static WebElement SearchSelectState()		//Method for searching Username input
	{
		SearchSelectState = getDriver().findElement(By.xpath("//span[.='Select State']"));
		return SearchSelectState;
		
	}
	
	public static WebElement SearchSelectStateCTDD()		//Method for searching Username input
	{
		SearchSelectStateCTDD = getDriver().findElement(By.xpath("(//div[@class='k-top k-top'])[2]"));
		return SearchSelectStateCTDD;
		
	}
	
	
	public static WebElement SearchProjectCT()		//Method for searching Username input
	{
		SearchProjectCT = getDriver().findElement(By.xpath("//span[.='Project']"));
		return SearchProjectCT;
		
	}
	
	
	public static WebElement SearchProjectCTDD()		//Method for searching Username input
	{
		SearchProjectCTDD = getDriver().findElement(By.xpath("//span[.='Abhilasha Heritage ']"));
		return SearchProjectCTDD;
		
	}
	
	public static WebElement SearchSelectLocationCT()		//Method for searching Username input
	{
		SearchSelectLocationCT = getDriver().findElement(By.xpath("//span[.='Select Location']"));
		return SearchSelectLocationCT;
		
	}
	
	public static WebElement SearchSelectLocationCTDrop()		//Method for searching Username input
	{
		SearchSelectLocationCTDrop = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[1]"));
		return SearchSelectLocationCTDrop;
		
	}
	
	
	
	
	
	public static WebElement SearchSelectLocationCTDD()		//Method for searching Username input
	{
		SearchSelectLocationCTDD = getDriver().findElement(By.xpath("(//div[@class='k-top'])[1]"));
		return SearchSelectLocationCTDD;
		
	}
	
	
	
	public static WebElement UploadContractorCT()		//Method for searching Username input
	{
		UploadContractorCT = getDriver().findElement(By.id("btnUpload"));
		return UploadContractorCT;
		
	}
	
	public static WebElement FileInputCT()		//Method for searching Username input
	{
		FileInputCT = getDriver().findElement(By.id("fileinput"));
		return FileInputCT;
		
	}
	
	public static WebElement UploadSubmitCT()		//Method for searching Username input
	{
		UploadSubmitCT = getDriver().findElement(By.id("btnFileUpload"));
		return UploadSubmitCT;
		
	}
	
	public static WebElement CloseUploadMasterCT()		//Method for searching Username input
	{
		CloseUploadMasterCT = getDriver().findElement(By.xpath("//a[@class='k-button k-bare k-button-icon k-window-action']"));
		return CloseUploadMasterCT;
		
	}
	
	public static WebElement UploadContractorProjectMappingCT()		//Method for searching Username input
	{
		UploadContractorProjectMappingCT = getDriver().findElement(By.xpath("(//button[@id='btnUpload'])[2]"));
		return UploadContractorProjectMappingCT;
		
	}
	
	public static WebElement UploadContractorProjectMappingFileCT()		//Method for searching Username input
	{
		UploadContractorProjectMappingFileCT = getDriver().findElement(By.id("fileinputProjectMapping"));
		return UploadContractorProjectMappingFileCT;
		
	}
	
	
	
	
	
	
	
	public static WebElement UploadContractorProjectMappingUploadBCT()		//Method for searching Username input
	{
		UploadContractorProjectMappingUploadBCT = getDriver().findElement(By.id("btnFileUploadProjectMapping"));
		return UploadContractorProjectMappingUploadBCT;
		
	}
	
	
	public static WebElement MappingEditProjectCT()		//Method for searching Username input
	{
		MappingEditProjectCT = getDriver().findElement(By.xpath("//*[@id='gridContractor']/div[2]/table/tbody/tr[1]/td[9]/a[4]"));
		return MappingEditProjectCT;
		
	}
	
	
	
	public static WebElement LicenceDetailsCT()		//Method for searching Username input
	{
		LicenceDetailsCT = getDriver().findElement(By.xpath("//li[@class='k-item k-state-default k-last']"));
		return LicenceDetailsCT;
		
	}
	
	
	public static WebElement LicenceType()		//Method for searching Username input
	{
		LicenceDetailsCT = getDriver().findElement(By.xpath("//th[@data-title='License Type']"));
		return LicenceDetailsCT;
		
	}

	
	public static WebElement RegistrationNo1()		//Method for searching Username input
	{
		LicenceDetailsCT = getDriver().findElement(By.xpath("//th[@data-title='Registration No.']"));
		return LicenceDetailsCT;
		
	}

	public static WebElement StartDate()		//Method for searching Username input
	{
		LicenceDetailsCT = getDriver().findElement(By.xpath("//th[@data-title='Start Date']"));
		return LicenceDetailsCT;
		
	}

	
	public static WebElement EndDate()		//Method for searching Username input
	{
		LicenceDetailsCT = getDriver().findElement(By.xpath("//th[@data-title='End Date']"));
		return LicenceDetailsCT;
		
	}
	
	
	public static WebElement HeadCount()		//Method for searching Username input
	{
		LicenceDetailsCT = getDriver().findElement(By.xpath("//th[@data-title='Head Count']"));
		return LicenceDetailsCT;
		
	}

	public static WebElement FileName()		//Method for searching Username input
	{
		LicenceDetailsCT = getDriver().findElement(By.xpath("//th[@data-title='File Name']"));
		return LicenceDetailsCT;
		
	}

	
	public static WebElement LicenseStatus()		//Method for searching Username input
	{
		LicenceDetailsCT = getDriver().findElement(By.xpath("//th[@data-title='License Status']"));
		return LicenceDetailsCT;
		
	}

	
	public static WebElement Action()		//Method for searching Username input
	{
		LicenceDetailsCT = getDriver().findElement(By.xpath("//th[@data-index='14']"));
		return LicenceDetailsCT;
		
	}

	
	
	
	public static WebElement AddLicenceDetailsCT()		//Method for searching Username input
	{
		AddLicenceDetailsCT = getDriver().findElement(By.id("btnAdddoc"));
		return AddLicenceDetailsCT;
		
	}
	
	public static WebElement AddLicenceTypeCT()		//Method for searching Username input
	{
		AddLicenceTypeCT = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[10]"));
		return AddLicenceTypeCT;
		
	}
	
	
	public static WebElement AddLicenceHeadCountCT()		//Method for searching Username input
	{
		AddLicenceHeadCountCT = getDriver().findElement(By.xpath("//input[@id='txtHeadCount']"));
		return AddLicenceHeadCountCT;
		
	}
	
	public static WebElement ViewLicenceCT()		//Method for searching Username input
	{
		ViewLicenceCT = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-view1 k-grid-edit2']"));
		return ViewLicenceCT;
		
	}
	
	public static WebElement CloseViewLicence()		//Method for searching Username input
	{
		CloseViewLicence = getDriver().findElement(By.xpath("(//button[@class='close'])[7]"));
		return CloseViewLicence;
		
	}
	
	
	public static WebElement ContractorCalendor()		//Method for searching Username input
	{
		ContractorCalendor = getDriver().findElement(By.xpath("(//span[@class='k-select'])[5]"));
		return ContractorCalendor;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement EditLicenceCT()		//Method for searching Username input
	{
		EditLicenceCT = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Edit1 k-grid-edit2']"));
		return EditLicenceCT;
		
	}
	
	public static WebElement ActAndComplianceMaster()		//Method for searching Username input
	{
		ActAndComplianceMaster = getDriver().findElement(By.xpath("//a[.='Act & Compliance']"));
		return ActAndComplianceMaster;
		
	}
	
	public static WebElement AddActAndCompliance()		//Method for searching Username input
	{
		AddActAndCompliance = getDriver().findElement(By.id("btnNewAddAct"));
		return AddActAndCompliance;
		
	}
	
	
	public static WebElement Hand()		//Method for searching Username input
	{
		Hand = getDriver().findElement(By.xpath("//span[@class='glyphicons customicons hand']"));
		return Hand;
		
	}
	
	
	
	public static WebElement UpdateLicenceTypeCT()		//Method for searching Username input
	{
		UpdateLicenceTypeCT = getDriver().findElement(By.xpath("(//span[@class='k-input'])[10]"));
		return UpdateLicenceTypeCT;
		
	}
	
	
	public static WebElement ActAndComplienceCentral()		//Method for searching Username input
	{
		ActAndComplienceCentral = getDriver().findElement(By.xpath("//ul[@id='ddlCentralOrState_listbox']//li"));
		return ActAndComplienceCentral;
		
	}
	
	
	public static WebElement ActAndComplienceCentral1()		//Method for searching Username input
	{
		ActAndComplienceCentral = getDriver().findElement(By.xpath("//*[@id='divCentralOrStateCompliance']/span"));
		return ActAndComplienceCentral;
		
	}
	
	
	
	
	public static WebElement UpdateActAndComplienceCentral()		//Method for searching Username input
	{
		UpdateActAndComplienceCentral = getDriver().findElement(By.xpath("//*[@id='NewActModal']/div[1]/div[1]/span"));
		return UpdateActAndComplienceCentral;
		
	}
	
	public static WebElement DeleteActAndComplienceCentral()		//Method for searching Username input
	{
		DeleteActAndComplienceCentral = getDriver().findElement(By.xpath("//*[@id='gridAct']/div[2]/table/tbody/tr[1]/td[6]/a[2]"));
		return DeleteActAndComplienceCentral;
		
	}
	
	
	
	
	
	public static WebElement ActAndComplienceCentralDropDown()		//Method for searching Username input
	{
		ActAndComplienceCentralDropDown = getDriver().findElement(By.xpath("//ul[@id='ddlCentralOrState_listbox']//li[1]"));
		return ActAndComplienceCentralDropDown;
		
	}
	
	
	public static WebElement ActAndComplienceCentralDropDown1()		//Method for searching Username input
	{
		ActAndComplienceCentralDropDown = getDriver().findElement(By.xpath("//ul[@id='ddlCentralOrStateCompliance_listbox']//li[1]"));
		return ActAndComplienceCentralDropDown;
		
	}

	
	
	public static WebElement ActAndComplienceStateDropDown()		//Method for searching Username input
	{
		ActAndComplienceCentralDropDown = getDriver().findElement(By.xpath("//ul[@id='ddlCentralOrStateCompliance_listbox']//li[2]"));
		return ActAndComplienceCentralDropDown;
		
	}
	
	public static WebElement StateDropDown()		//Method for searching Username input
	{
		ActAndComplienceCentralDropDown = getDriver().findElement(By.xpath("(//ul[@id='ddlCentralOrStateCompliance_listbox']//li[.='State'])[2]"));
		return ActAndComplienceCentralDropDown;
		
	}
	
	
	

	public static WebElement ActAndComplienceState()		//Method for searching Username input
	{
		ActAndComplienceCentralDropDown = getDriver().findElement(By.xpath("//*[@id='stateDisplayCompliance']/span"));
		return ActAndComplienceCentralDropDown;
		
	}

	public static WebElement ActAndComplienceStateDD()		//Method for searching Username input
	{
		ActAndComplienceCentralDropDown = getDriver().findElement(By.xpath("(//div[@class='k-animation-container']//ul[@id='ddlStateCompliance_listbox'])[1]//li[1]"));
		return ActAndComplienceCentralDropDown;
		
	}

	
	
	public static WebElement ActNameAC()		//Method for searching Username input
	{
		ActNameAC = getDriver().findElement(By.xpath("//textarea[@id='txtActName']"));
		return ActNameAC;
		
	}
	
	
	public static WebElement ContractorTypeAC()		//Method for searching Username input
	{
		ContractorTypeAC = getDriver().findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']"));
		return ContractorTypeAC;
		
	}
	
	public static WebElement ContractorTypeDDAC()		//Method for searching Username input
	{
		ContractorTypeDDAC = getDriver().findElement(By.xpath("(//span[@class='k-checkbox-wrapper'])[2]"));
		return ContractorTypeDDAC;
		
	}
	
	public static WebElement ContractorTypespaceAC()		//Method for searching Username input
	{
		ContractorTypespaceAC = getDriver().findElement(By.xpath("//span[.='Select Contract Type']"));
		return ContractorTypespaceAC;
		
	}
	
	
	public static WebElement CatogaryAC()		//Method for searching Username input
	{
		CatogaryAC = getDriver().findElement(By.xpath("(//span[.='Select Category'])[3]"));
		return CatogaryAC;
		
	}
	
	public static WebElement UpdateCatogaryAC()		//Method for searching Username input
	{
		UpdateCatogaryAC = getDriver().findElement(By.xpath("//*[@id='NewActModal']/div[4]/span"));
		return UpdateCatogaryAC;
		
	}
	
	
	
	
	
	
	
	public static WebElement CatogaryACDD()		//Method for searching Username input
	{
		CatogaryACDD = getDriver().findElement(By.xpath("//*[@id='ddlCategory_listbox']/li[2]"));
		return CatogaryACDD;
		
	}
	
	
	public static WebElement ButtonSaveAct()		//Method for searching Username input
	{
		ButtonSaveAct = getDriver().findElement(By.id("btnSaveAct"));
		return ButtonSaveAct;
		
	}
	
	
	public static WebElement CloseButtonAct()		//Method for searching Username input
	{
		CloseButtonAct = getDriver().findElement(By.xpath("(//div[@class='k-window-actions'])[2]"));
		return CloseButtonAct;
		
	}
	
	
	public static WebElement DeleteLicenceC()		//Method for searching Username input
	{
		DeleteLicenceC = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Delete1 k-grid-edit2']"));
		return DeleteLicenceC;
		
	}
	
	
	
	public static WebElement SelectActAC()		//Method for searching Username input
	{
		SelectActAC = getDriver().findElement(By.xpath("(//span[.='Select Act'])[3]"));
		return SelectActAC;
		
	}
	
	public static WebElement SelectActACDD()		//Method for searching Username input
	{
		SelectActACDD = getDriver().findElement(By.xpath("//ul[@id='ddlActNameFilter_listbox']//li[1]"));
		return SelectActACDD;
		
	}
	
	
	public static WebElement ClearAC()		//Method for searching Username input
	{
		ClearAC = getDriver().findElement(By.id("btnClear"));
		return ClearAC;
		
	}
	
	public static WebElement SelectStateAC()		//Method for searching Username input
	{
		SelectStateAC = getDriver().findElement(By.xpath("(//span[.='Select State'])[3]"));
		return SelectStateAC;
		
	}
	
	
	public static WebElement SelectStateACDD()		//Method for searching Username input
	{
		SelectStateACDD = getDriver().findElement(By.xpath("//li[.='Maharashtra']"));
		return SelectStateACDD;
		
	}
	
	
	public static WebElement SelectCentralorStateAC()		//Method for searching Username input
	{
		SelectCentralorStateAC = getDriver().findElement(By.xpath("(//span[.='Select Central/State'])[3]"));
		return SelectCentralorStateAC;
		
	}
	
	
	public static WebElement SelectCentralorStateACDD()		//Method for searching Username input
	{
		SelectCentralorStateACDD = getDriver().findElement(By.xpath("//li[.='State']"));
		return SelectCentralorStateACDD;
		
	}
	
	
	public static WebElement EditActAndCompliance()		//Method for searching Username input
	{
		EditActAndCompliance = getDriver().findElement(By.xpath("//*[@id='gridAct']/div[2]/table/tbody/tr[1]/td[6]/a[1]"));
		return EditActAndCompliance;
		
	}
	
	public static WebElement UploadActAndCompliance()		//Method for searching Username input
	{
		UploadActAndCompliance = getDriver().findElement(By.id("btnUploadAct"));
		return UploadActAndCompliance;
		
	}
	
	public static WebElement SelectFileActAndCompliance()		//Method for searching Username input
	{
		SelectFileActAndCompliance = getDriver().findElement(By.id("BulkUploadData"));
		return SelectFileActAndCompliance;
		
	}
	
	public static WebElement UploadButtonAC()		//Method for searching Username input
	{
		UploadButtonAC = getDriver().findElement(By.id("btnBulkUpload"));
		return UploadButtonAC;
		
	}
	
	public static WebElement EnableAC()		//Method for searching Username input
	{
		EnableAC = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Enable k-grid-enable']"));
		return EnableAC;
		
	}
	
	public static WebElement ActivationDateAC()		//Method for searching Username input
	{
		ActivationDateAC = getDriver().findElement(By.id("txtActivationDate"));
		return ActivationDateAC;
		
	}
	
	public static WebElement DeActivationDateAC()		//Method for searching Username input
	{
		DeActivationDateAC = getDriver().findElement(By.id("txtStartDate"));
		return DeActivationDateAC;
		
	}
	
	
	
	public static WebElement BtnSaveActivationAC()		//Method for searching Username input
	{
		BtnSaveActivationAC = getDriver().findElement(By.id("btnSaveActivationDate"));
		return BtnSaveActivationAC;
		
	}
	
	
	public static WebElement BtnSaveDeActivationAC()		//Method for searching Username input
	{
		BtnSaveDeActivationAC = getDriver().findElement(By.id("btnSaveStartDate"));
		return BtnSaveDeActivationAC;
		
	}
	
	
	public static WebElement AddActSelectStateAC()		//Method for searching Username input
	{
		AddActSelectStateAC = getDriver().findElement(By.xpath("(//li[.='State'])[2]"));
		return AddActSelectStateAC;
		
	}
	
	
	public static WebElement ChhoseStateAC()		//Method for searching Username input
	{
		ChhoseStateAC = getDriver().findElement(By.xpath("(//span[.='Select State'])[6]"));
		return ChhoseStateAC;
		
	}
	
	
	public static WebElement ChhoseStateACDD()		//Method for searching Username input
	{
		ChhoseStateACDD = getDriver().findElement(By.xpath("(//li[.='Maharashtra'])[2]"));
		return ChhoseStateACDD;
		
	}
	
	public static WebElement ChhosediffStateACDD()		//Method for searching Username input
	{
		ChhoseStateACDD = getDriver().findElement(By.xpath("(//li[.='Abu Dhabi'])[2]"));
		return ChhoseStateACDD;
		
	}
	
	
	public static WebElement ComplienceButtonAC()		//Method for searching Username input
	{
		ComplienceButtonAC = getDriver().findElement(By.xpath("(//span[normalize-space()='Compliance'])[1]"));
		return ComplienceButtonAC;
		
	}
	
	public static WebElement Compliencecheck()		//Method for searching Username input
	{
		ComplienceButtonAC = getDriver().findElement(By.xpath("//*[@id='gridCompliance']/div[2]/table/tbody/tr/td/label"));
		return ComplienceButtonAC;
		
	}

	public static WebElement Compliencecombinedformbutton()		//Method for searching Username input
	{
		ComplienceButtonAC = getDriver().findElement(By.xpath("//button[@id='btnAddCombinedForm']"));
		return ComplienceButtonAC;
		
	}

	public static WebElement Compliencechoosefile()		//Method for searching Username input
	{
		ComplienceButtonAC = getDriver().findElement(By.xpath("//input[@id='combinedFormDocUpload']"));
		return ComplienceButtonAC;
		
	}

	public static WebElement Complienceuploadbutton()		//Method for searching Username input
	{
		ComplienceButtonAC = getDriver().findElement(By.xpath("//button[@id='btncombinedFormDocUpload']"));
		return ComplienceButtonAC;
		
	}
	
	public static WebElement ComplienceClose()		//Method for searching Username input
	{
		ComplienceButtonAC = getDriver().findElement(By.xpath("//div[@class='k-window-actions']/a"));
		return ComplienceButtonAC;
		
	}

	public static WebElement DownloadSampleFormat()		//Method for searching Username input
	{
		ComplienceButtonAC = getDriver().findElement(By.xpath("//*[@id='gridCompliance']/div[2]/table/tbody/tr[1]/td[19]/a[5]"));
		return ComplienceButtonAC;
		
	}


	public static WebElement ViewSampleFormat()		//Method for searching Username input
	{
		ComplienceButtonAC = getDriver().findElement(By.xpath("//*[@id='gridCompliance']/div[2]/table/tbody/tr[1]/td[19]/a[4]"));
		return ComplienceButtonAC;
		
	}

	
	
	public static WebElement AddComplienceAC()		//Method for searching Username input
	{
		AddComplienceAC = getDriver().findElement(By.id("btnNewAddComplaince"));
		return AddComplienceAC;
		
	}
	
	public static WebElement AddComplienceSelectAC()		//Method for searching Username input
	{
		AddComplienceSelectAC = getDriver().findElement(By.xpath("//*[@id='NewComplianceModal']/div[1]/span"));
		return AddComplienceSelectAC;
		
	}
	
	
	public static WebElement AddComplienceSelectStatutaryAC()		//Method for searching Username input
	{
		AddComplienceSelectStatutaryAC = getDriver().findElement(By.xpath("(//span[.='Select'])[6]"));
		return AddComplienceSelectStatutaryAC;
		
	}
	
	
	public static WebElement AddComplienceSelectStatutaryACDD()		//Method for searching Username input
	{
		AddComplienceSelectStatutaryACDD = getDriver().findElement(By.xpath("//ul[@id='ddlStatutory_listbox']//li[1]"));
		return AddComplienceSelectStatutaryACDD;
		
	}
	
	public static WebElement AddComplienceSelectStatutaryInternal()		//Method for searching Username input
	{
		AddComplienceSelectStatutaryACDD = getDriver().findElement(By.xpath("//ul[@id='ddlStatutory_listbox']//li[2]"));
		return AddComplienceSelectStatutaryACDD;
		
	}

	
	public static WebElement Internal()		//Method for searching Username input
	{
		AddComplienceSelectStatutaryACDD = getDriver().findElement(By.xpath("(//ul[@id='ddlStatutory_listbox']//li[.='Internal'])[2]"));
		return AddComplienceSelectStatutaryACDD;
		
	}

	
	public static WebElement AddComplienceSelectStatutaryStateACDD()		//Method for searching Username input
	{
		AddComplienceSelectStatutaryStateAC = getDriver().findElement(By.xpath("//span[@class='k-dropdown-wrap k-state-default'])[11]"));
		return AddComplienceSelectStatutaryStateAC;
		
	}
	
	public static WebElement ComplianceHeader()		//Method for searching Username input
	{
		ComplianceHeader = getDriver().findElement(By.id("txtComplainceName"));
		return ComplianceHeader;
		
	}
	
	public static WebElement FrequencyAC()		//Method for searching Username input
	{
		FrequencyAC = getDriver().findElement(By.xpath("(//span[.='Frequency'])[3]"));
		return FrequencyAC;
		
	}
	
	public static WebElement FrequencyACDD()		//Method for searching Username input
	{
		FrequencyACDD = getDriver().findElement(By.xpath("//ul[@id='drpFrequency_listbox']/li"));
		return FrequencyACDD;
		
	}
	
	public static WebElement FrequencyDD()		//Method for searching Username input
	{
		FrequencyACDD = getDriver().findElement(By.xpath("(//div[@class='k-animation-container']//ul[@id='drpFrequency_listbox'])[2]//li"));
		return FrequencyACDD;
		
	}

	
	
	public static WebElement ComplianceSaveButtonAC()		//Method for searching Username input
	{
		ComplianceSaveButtonAC = getDriver().findElement(By.id("btnSave"));
		return ComplianceSaveButtonAC;
		
	}
	
	
	public static WebElement CloseButton()		//Method for searching Username input
	{
		ComplianceSaveButtonAC = getDriver().findElement(By.xpath("//div[@class='k-window-actions']//a[@class='k-button k-bare k-button-icon k-window-action']"));
		return ComplianceSaveButtonAC;
		
	}

	
	
	public static WebElement ComplianceExportButtonAC()		//Method for searching Username input
	{
		ComplianceExportButtonAC = getDriver().findElement(By.id("btnexport"));
		return ComplianceExportButtonAC;
		
	}
	
	
	public static WebElement SelectActCom()		//Method for searching Username input
	{
		SelectActCom = getDriver().findElement(By.xpath("(//span[.='Select Act'])[6]"));
		return SelectActCom;
		
	}
	
	public static WebElement UpdateSelectActCom()		//Method for searching Username input
	{
		UpdateSelectActCom = getDriver().findElement(By.xpath("//*[@id='divddlAct']/span"));
		return UpdateSelectActCom;
		
	}
	
	
	
	
	public static WebElement SelectActDDCOM()		//Method for searching Username input
	{
		SelectActDDCOM = getDriver().findElement(By.xpath("//ul[@id='ddlAct_listbox']/li[1]"));
		return SelectActDDCOM;
		
	}
	
	public static WebElement SelectActDD()		//Method for searching Username input
	{
		SelectActDDCOM = getDriver().findElement(By.xpath("(//div[@class='k-animation-container']//ul[@id='ddlAct_listbox']/li[1])[2]"));
		return SelectActDDCOM;
		
	}

	
	public static WebElement SelectStateComplianceDD()		//Method for searching Username input
	{
		SelectStateComplianceDD = getDriver().findElement(By.xpath("(//li[.='Maharashtra'])[3]"));
		return SelectStateComplianceDD;
		
	}
	
	public static WebElement SelectActComplianceDD()		//Method for searching Username input
	{
		SelectActComplianceDD = getDriver().findElement(By.xpath("(//li[.='Building and Other Construction Workers (Regulation of Employment and Conditions of Service) Act, 1996 and Maharashtra Building and Other Construction Workers (Regulation of Employment and Conditions of Service) Rules, 2007'])[2]"));
		return SelectActComplianceDD;
		
	}
	
	
	public static WebElement SelectDiffStateComplianceDD()		//Method for searching Username input
	{
		SelectDiffStateComplianceDD = getDriver().findElement(By.xpath("(//li[.='Andhra Pradesh'])[3]"));
		return SelectDiffStateComplianceDD;
	
	}
	
	
	public static WebElement SelectActAndhraComplianceDD()		//Method for searching Username input
	{
		SelectActAndhraComplianceDD = getDriver().findElement(By.xpath("(//li[.='Andhra Pradesh Labour Welfare Fund Act, 1987, and Andhra Pradesh Labour Welfare Fund Rules, 1988'])[2]"));
		return SelectActAndhraComplianceDD;
		
	}
	
	
	
	public static WebElement EditComplianceAC()		//Method for searching Username input
	{
		EditComplianceAC = getDriver().findElement(By.xpath("//*[@id='gridCompliance']/div[2]/table/tbody/tr[1]/td[19]/a[1]"));
		return EditComplianceAC;
		
	}
	
	
	public static WebElement UpdateStatutoryAC()		//Method for searching Username input
	{
		UpdateStatutoryAC = getDriver().findElement(By.xpath("//*[@id='NewComplianceModal']/div[1]/span"));
		return UpdateStatutoryAC;
		
	}
	
	public static WebElement UpdateCentralorStateAC()		//Method for searching Username input
	{
		UpdateCentralorStateAC = getDriver().findElement(By.xpath("//*[@id='divCentralOrStateCompliance']/span"));
		return UpdateCentralorStateAC;
		
	}
	
	public static WebElement UpdateFrequencyAC()		//Method for searching Username input
	{
		UpdateFrequencyAC = getDriver().findElement(By.xpath("//*[@id='NewComplianceModal']/div[10]/span[1]"));
		return UpdateFrequencyAC;
		
	}
	
	
	public static WebElement DeleteComplianceAC()		//Method for searching Username input
	{
		DeleteComplianceAC = getDriver().findElement(By.xpath("//*[@id='gridCompliance']/div[2]/table/tbody/tr[1]/td[19]/a[2]"));
		return DeleteComplianceAC;
		
	}
	
	public static WebElement DeleteTextStartDeactivateDateAC()		//Method for searching Username input
	{
		DeleteTextStartDeactivateDateAC = getDriver().findElement(By.xpath("//input[@id='txtStartDate']"));
		return DeleteTextStartDeactivateDateAC;
		
	}
	
	public static WebElement DeleteButtonSaveDeactivateAC()		//Method for searching Username input
	{
		DeleteButtonSaveDeactivateAC = getDriver().findElement(By.id("btnSaveStartDate"));
		return DeleteButtonSaveDeactivateAC;
		
	}
	
	public static WebElement CalenderComplianceAC()		//Method for searching Username input
	{
		CalenderComplianceAC = getDriver().findElement(By.xpath("//*[@id='NewDisableModal']/div[1]/span/span/span[2]"));
		return CalenderComplianceAC;
		
	}
	
	public static WebElement CalenderComplianceDateSelectAC()		//Method for searching Username input
	{
		CalenderComplianceDateSelectAC = getDriver().findElement(By.xpath("//a[.='22']"));
		return CalenderComplianceDateSelectAC;
		
	}
	
	
	public static WebElement ComplianceSearchAC()		//Method for searching Username input
	{
		ComplianceSearchAC = getDriver().findElement(By.xpath("(//span[.='Select Compliance Type'])[3]"));
		return ComplianceSearchAC;
		
	}
	
	public static WebElement ComplianceSearchDDAC()		//Method for searching Username input
	{
		ComplianceSearchDDAC = getDriver().findElement(By.xpath("(//li[.='Internal'])[1]"));
		return ComplianceSearchDDAC;
		
	}
	
	
	public static WebElement ComplianceClearBAC()		//Method for searching Username input
	{
		ComplianceClearBAC = getDriver().findElement(By.id("btnClearComp"));
		return ComplianceClearBAC;
		
	}
	
	public static WebElement ComplianceUploadAC()		//Method for searching Username input
	{
		ComplianceUploadAC = getDriver().findElement(By.id("btnUploadComplaince"));
		return ComplianceUploadAC;
		
	}
	
	
	public static WebElement ChooseFileUploadCompliance()		//Method for searching Username input
	{
		ChooseFileUploadCompliance = getDriver().findElement(By.id("ComplianceBulkUploadData"));
		return ChooseFileUploadCompliance;
		
	}
	
	public static WebElement ButtonComplianceUploadAC()		//Method for searching Username input
	{
		ButtonComplianceUploadAC = getDriver().findElement(By.id("btnComplianceBulkUpload"));
		return ButtonComplianceUploadAC;
		
	}
	
	
	public static WebElement TemplateButtonAC()		//Method for searching Username input
	{
		TemplateButtonAC = getDriver().findElement(By.xpath("(//li[@class='k-item k-state-default k-last'])[1]"));
		return TemplateButtonAC;
		
	}
	
	public static WebElement A1ddTemplateAC()		//Method for searching Username input
	{
		A1ddTemplateAC = getDriver().findElement(By.id("btnNewAddTemplate"));
		return A1ddTemplateAC;
		
	}
	
	
	public static WebElement TemplateNameAC()		//Method for searching Username input
	{
		TemplateNameAC = getDriver().findElement(By.id("txtTemplateName"));
		return TemplateNameAC;
		
	}
	
	
	public static WebElement TemplateTypeAC()		//Method for searching Username input
	{
		TemplateTypeAC = getDriver().findElement(By.xpath("(//span[.='Select Type'])[3]"));
		return TemplateTypeAC;
		
	}
	
	public static WebElement TemplateTypeDDAC()		//Method for searching Username input
	{
		TemplateTypeDDAC = getDriver().findElement(By.xpath("//*[@id=\"ddlTemplateType_listbox\"]/li[1]"));
		return TemplateTypeDDAC;
		
	}
	
	
	public static WebElement TemplateCheckBoxAC()		//Method for searching Username input
	{
		TemplateCheckBoxAC = getDriver().findElement(By.xpath("//*[@id='gridUnAssingCompliance']/div[2]/table/tbody/tr/td/label"));
		return TemplateCheckBoxAC;
		
	}
	
	public static WebElement TemplateSaveButtonAC()		//Method for searching Username input
	{
		TemplateSaveButtonAC = getDriver().findElement(By.id("btnSaveTemplate"));
		return TemplateSaveButtonAC;
		
	}
	
	
	public static WebElement EditTemplateAC()		//Method for searching Username input
	{
		EditTemplateAC = getDriver().findElement(By.xpath("//*[@id=\"gridTemplate\"]/div[2]/table/tbody/tr[1]/td[6]/a[1]"));
		return EditTemplateAC;
		
	}
	
	public static WebElement SearchButtonTemplateAC()		//Method for searching Username input
	{
		SearchButtonTemplateAC = getDriver().findElement(By.xpath("(//span[.='Select Template Type'])[3]"));
		return SearchButtonTemplateAC;
		
	}
	
	
	
	
	public static WebElement SearchButtonTemplateDDAC()		//Method for searching Username input
	{
		SearchButtonTemplateDDAC = getDriver().findElement(By.xpath("(//li[.='Statutory'])[2]"));
		return SearchButtonTemplateDDAC;
		
	}
	
	public static WebElement ClerButtonTemplateDDAC()		//Method for searching Username input
	{
		ClerButtonTemplateDDAC = getDriver().findElement(By.id("btnClearTemp"));
		return ClerButtonTemplateDDAC;
		
	}
	
	public static WebElement DeleteTemplateAC()		//Method for searching Username input
	{
		DeleteTemplateAC = getDriver().findElement(By.xpath("//*[@id='gridTemplate']/div[2]/table/tbody/tr[2]/td[6]/a[2]"));
		return DeleteTemplateAC;
		
	}
	
	public static WebElement UploadTemplateDDAC()		//Method for searching Username input
	{
		UploadTemplateDDAC = getDriver().findElement(By.id("btnUploadTemplate"));
		return UploadTemplateDDAC;
		
	}
	
	
	public static WebElement ChooseFileTemplateAC()		//Method for searching Username input
	{
		ChooseFileTemplateAC = getDriver().findElement(By.id("TemplateBulkUploadData"));
		return ChooseFileTemplateAC;
		
	}
	
	public static WebElement UploadButtonTemplateAC()		//Method for searching Username input
	{
		UploadButtonTemplateAC = getDriver().findElement(By.id("btnTemplateBulkUpload"));
		return UploadButtonTemplateAC;
		
	}
	
	
	
	
	public static WebElement ContractorTypeButton()		//Method for searching Username input
	{
		ContractorTypeButton = getDriver().findElement(By.xpath("//*[@id=\"Documentssubmenu\"]/li[6]/a"));
		return ContractorTypeButton;
		
	}
	
	
	
	public static WebElement AddContractorTypeButton()		//Method for searching Username input
	{
		AddContractorTypeButton = getDriver().findElement(By.id("btnNew"));
		return AddContractorTypeButton;
		
	}
	
	
	public static WebElement AddContractorTypeName()		//Method for searching Username input
	{
		AddContractorTypeName = getDriver().findElement(By.id("txtTypeName"));
		return AddContractorTypeName;
		
	}
	
	
	public static WebElement AddContractorTypeSaveButton()		//Method for searching Username input
	{
		AddContractorTypeSaveButton = getDriver().findElement(By.id("btnSave_ContType"));
		return AddContractorTypeSaveButton;
		
	}
	
	public static WebElement CloseContractorTypePage()		//Method for searching Username input
	{
		CloseContractorTypePage = getDriver().findElement(By.xpath("//div[@class='k-window-actions']"));
		return CloseContractorTypePage;
		
	}
	
	
	public static WebElement EditContractorType()		//Method for searching Username input
	{
		EditContractorType = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Edit k-grid-edit2']"));
		return EditContractorType;
		
	}
	
	
	public static WebElement DeleteContractorType()		//Method for searching Username input
	{
		DeleteContractorType = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-Delete k-grid-edit2'])[7]"));
		return DeleteContractorType;
		
	}
	
	
	
	public static WebElement ContractorTypeSearchButton()		//Method for searching Username input
	{
		ContractorTypeSearchButton = getDriver().findElement(By.id("txtSearch"));
		return ContractorTypeSearchButton;
		
	}
	
	
	
	public static WebElement ContractorTypeClearButton()		//Method for searching Username input
	{
		ContractorTypeClearButton = getDriver().findElement(By.id("ClearfilterMain"));
		return ContractorTypeClearButton;
		
	}
	
	
	public static WebElement CityMasterButton()		//Method for searching Username input
	{
		CityMasterButton = getDriver().findElement(By.xpath("//*[@id=\"Documentssubmenu\"]/li[7]/a"));
		return CityMasterButton;
		
	}
	
	public static WebElement AddCityButton()		//Method for searching Username input
	{
		AddCityButton = getDriver().findElement(By.id("btnNew"));
		return AddCityButton;
		
	}
	
	public static WebElement AddStatenameCityM()		//Method for searching Username input
	{
		AddStatenameCityM = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[3]"));
		return AddStatenameCityM;
		
	}
	
	public static WebElement AddStatenameDDCityM()		//Method for searching Username input
	{
		AddStatenameDDCityM = getDriver().findElement(By.xpath("(//li[.='Maharashtra'])[1]"));
		return AddStatenameDDCityM;
		
	}
	
	
	public static WebElement AddCityName()		//Method for searching Username input
	{
		AddCityName = getDriver().findElement(By.id("txtCityName"));
		return AddCityName;
		
	}
	
	
	public static WebElement SaveCityMaster()		//Method for searching Username input
	{
		SaveCityMaster = getDriver().findElement(By.id("btnSave"));
		return SaveCityMaster;
		
	}
	
	public static WebElement CloseCityPage()		//Method for searching Username input
	{
		CloseCityPage = getDriver().findElement(By.xpath("//div[@class='k-window-actions']"));
		return CloseCityPage;
		
	}
	
	public static WebElement EditCityMaster()		//Method for searching Username input
	{
		EditCityMaster = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Edit k-grid-edit2']"));
		return EditCityMaster;
		
	}
	
	
	public static WebElement DeletetCityMaster()		//Method for searching Username input
	{
		DeletetCityMaster = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Delete k-grid-edit2']"));
		return DeletetCityMaster;
		
	}
	
	public static WebElement CitySearchButtonMaster()		//Method for searching Username input
	{
		CitySearchButtonMaster = getDriver().findElement(By.id("txtSearch"));
		return CitySearchButtonMaster;
		
	}
	
	public static WebElement CityClearButtonMaster()		//Method for searching Username input
	{
		CityClearButtonMaster = getDriver().findElement(By.id("ClearfilterMain"));
		return CityClearButtonMaster;
		
	}
	
	
	
	public static WebElement CitySearcStateButtonMaster()		//Method for searching Username input
	{
		CitySearcStateButtonMaster = getDriver().findElement(By.xpath("(//span[.='Select State'])[3]"));
		return CitySearcStateButtonMaster;
		
		
	}
	
	public static WebElement CitySearcStateDDMaster()		//Method for searching Username input
	{
		CitySearcStateDDMaster = getDriver().findElement(By.xpath("(//li[.='Abu Dhabi'])[2]"));
		return CitySearcStateDDMaster;
		
		
	}
	
	public static WebElement UpdateCityStateDDMaster()		//Method for searching Username input
	{
		UpdateCityStateDDMaster = getDriver().findElement(By.xpath("(//li[.='Uttar Pradesh'])[3]"));
		return UpdateCityStateDDMaster;
		
		
	}
	
	
	
	public static WebElement LicenceTypeMaster()		//Method for searching Username input
	{
		LicenceTypeMaster = getDriver().findElement(By.xpath("//*[@id=\"Documentssubmenu\"]/li[8]/a"));
		return LicenceTypeMaster;
		
		
	}
	
	public static WebElement AddLicenceTypeButton()		//Method for searching Username input
	{
		AddLicenceTypeButton = getDriver().findElement(By.id("btnNew"));
		return AddLicenceTypeButton;
		
		
	}
	
	
	public static WebElement AddLicenceTypeName()		//Method for searching Username input
	{
		AddLicenceTypeName = getDriver().findElement(By.id("txtLicName"));
		return AddLicenceTypeName;
		
		
	}
	
	
	public static WebElement SaveLicenceTypeButton()		//Method for searching Username input
	{
		SaveLicenceTypeButton = getDriver().findElement(By.id("btnSave"));
		return SaveLicenceTypeButton;
		
		
	}
	
	public static WebElement CloseLicenceTypePage()		//Method for searching Username input
	{
		CloseLicenceTypePage = getDriver().findElement(By.xpath("//div[@class='k-window-actions']"));
		return CloseLicenceTypePage;
		
		
	}
	
	public static WebElement EditLicenceType()		//Method for searching Username input
	{
		EditLicenceType = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Edit k-grid-edit2']"));
		return EditLicenceType;
		
		
	}
	
	
	public static WebElement DeleteLicenceType()		//Method for searching Username input
	{
		DeleteLicenceType = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Delete k-grid-edit2']"));
		return DeleteLicenceType;
		
		
	}
	
	public static WebElement LicenceTypeSearchButton()		//Method for searching Username input
	{
		LicenceTypeSearchButton = getDriver().findElement(By.id("txtSearch"));
		return LicenceTypeSearchButton;
		
		
	}
	
	public static WebElement LicenceTypeClearButton()		//Method for searching Username input
	{
		LicenceTypeClearButton = getDriver().findElement(By.id("ClearfilterMain"));
		return LicenceTypeClearButton;
		
		
	}
	
	
	public static WebElement DataPointMaster()		//Method for searching Username input
	{
		DataPointMaster = getDriver().findElement(By.xpath("//*[@id=\"Documentssubmenu\"]/li[9]/a"));
		return DataPointMaster;
		
		
	}
	
	
	public static WebElement AddDataPoint()		//Method for searching Username input
	{
		AddDataPoint = getDriver().findElement(By.id("btnNew"));
		return AddDataPoint;
		
		
	}
	
	
	
	public static WebElement AddDataPointDescription()		//Method for searching Username input
	{
		AddDataPointDescription = getDriver().findElement(By.id("desc"));
		return AddDataPointDescription;
		
		
	}
	
	public static WebElement AddDataPointDescriptionType()		//Method for searching Username input
	{
		AddDataPointDescriptionType = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[3]"));
		return AddDataPointDescriptionType;
		
		
	}
	
	
	public static WebElement AddDataPointDescriptionTypeDD()		//Method for searching Username input
	{
		AddDataPointDescriptionTypeDD = getDriver().findElement(By.xpath("//li[.='Text']"));
		return AddDataPointDescriptionTypeDD;
		
		
	}
	
	
	public static WebElement SaveDataPoint()		//Method for searching Username input
	{
		SaveDataPoint = getDriver().findElement(By.id("btnSave"));
		return SaveDataPoint;
		
		
	}
	
	public static WebElement CloseDataPointPage()		//Method for searching Username input
	{
		CloseDataPointPage = getDriver().findElement(By.xpath("//div[@class='k-window-actions']"));
		return CloseDataPointPage;
		
		
	}
	
	public static WebElement EditDataPoint()		//Method for searching Username input
	{
		EditDataPoint = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Edit k-grid-edit2']"));
		return EditDataPoint;
		
		
	}
	
	
	public static WebElement DeleteDataPoint()		//Method for searching Username input
	{
		DeleteDataPoint = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-Delete k-grid-edit2']"));
		return DeleteDataPoint;
		
		
	}
	
	public static WebElement SearchBoxDataPoint()		//Method for searching Username input
	{
		SearchBoxDataPoint = getDriver().findElement(By.id("txtSearch"));
		return SearchBoxDataPoint;
		
		
	}
	
	public static WebElement ClearButtonDataPoint()		//Method for searching Username input
	{
		ClearButtonDataPoint = getDriver().findElement(By.id("ClearfilterMain"));
		return ClearButtonDataPoint;
		
		
	}
	
	public static WebElement UpdateDescriptionTypeDDDataPoint()		//Method for searching Username input
	{
		UpdateDescriptionTypeDDDataPoint = getDriver().findElement(By.xpath("(//li[.='Number'])[2]"));
		return UpdateDescriptionTypeDDDataPoint;
		
		
	}
	
	public static WebElement ComplianceMapping()		//Method for searching Username input
	{
		ComplianceMapping = getDriver().findElement(By.id("leftAssingmentmenu"));
		return ComplianceMapping;
		
		
	}
	
	
	public static WebElement Assign()		//Method for searching Username input
	{
		ComplianceMapping = getDriver().findElement(By.xpath("//*[@id='tabstripAll']/ul/li[2]/span[2]"));
		return ComplianceMapping;
		
		
	}

	
	

	public static WebElement AddComplianceMapping()		//Method for searching Username input
	{
		AddComplianceMapping = getDriver().findElement(By.id("btnAddAssingment"));
		return AddComplianceMapping;
		
		
	}
	
	public static WebElement SelectMappingType()		//Method for searching Username input
	{
		SelectMappingType = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[7]"));
		return SelectMappingType;
		
		
	}
	

	
	public static WebElement SelectComplianceCheckBox2()		//Method for searching Username input
	{
		SelectMappingTypeDD = getDriver().findElement(By.xpath("(//div[@id='gridCompliances']//td//label[@class='k-checkbox-label k-no-text'])[2]"));
		return SelectMappingTypeDD;
		
		
	}
	
	
	public static WebElement CheckBox()		//Method for searching Username input
	{
		PendingMapping = getDriver().findElement(By.xpath("(//div[@id='gridPendingMapping']//td//label[@class='k-checkbox-label k-no-text'])[1]"));
		return PendingMapping;
		
		
	}
	
	public static WebElement StateCm()		//Method for searching Username input
	{
		StateCm = getDriver().findElement(By.xpath("(//div[@class='k-widget k-dropdowntree k-dropdowntree-clearable'])[3]"));
		return StateCm;
		
		
	}
	
	
	public static WebElement StateCmDD()		//Method for searching Username input
	{
		StateCmDD = getDriver().findElement(By.xpath("//span[.='Andhra Pradesh']"));
		return StateCmDD;
		
		
	}
	
	
	
	public static WebElement SelectLocationCM()		//Method for searching Username input
	{
		SelectLocationCM = getDriver().findElement(By.xpath("(//span[.='Entity/Sub-Entity/Location'])[2]"));
		return SelectLocationCM;
		
		
	}
	
	
	public static WebElement SelectLocationDropCM()		//Method for searching Username input
	{
		SelectLocationDropCM = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[9]"));
		return SelectLocationDropCM;
		
		
	}
	
	
	public static WebElement SelectLocationDropDownCM()		//Method for searching Username input
	{
		SelectLocationDropDownCM = getDriver().findElement(By.xpath("(//span[.='MSI Business'])[4]"));
		return SelectLocationDropDownCM;
		
		
	}
	
	
	
	public static WebElement ProjectCM()		//Method for searching Username input
	{
		ProjectCM = getDriver().findElement(By.xpath("(//div[@class='k-widget k-dropdowntree k-dropdowntree-clearable'])[5]"));
		return ProjectCM;
		
		
	}
	
	
	public static WebElement ProjectCMDD()		//Method for searching Username input
	{
		ProjectCMDD = getDriver().findElement(By.xpath("(//span[.='MSI Business '])[2]"));
		return ProjectCMDD;
		
		
	}
	
	
	public static WebElement SelectComplianceCM()		//Method for searching Username input
	{
		SelectComplianceCM = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[8]"));
		return SelectComplianceCM;
		
		
	}
	
	
	public static WebElement SelectComplianceDDCM()		//Method for searching Username input
	{
		SelectComplianceDDCM = getDriver().findElement(By.xpath("(//li[.='Statutory'])[2]"));
		return SelectComplianceDDCM;
		
		
	}
	
	public static WebElement SelectActCM()		//Method for searching Username input
	{
		SelectActCM = getDriver().findElement(By.xpath("(//div[@class='k-widget k-dropdowntree k-dropdowntree-clearable'])[8]"));
		return SelectActCM;
		
		
	}
	
	public static WebElement SelectActDDCM()		//Method for searching Username input
	{
		SelectActDDCM = getDriver().findElement(By.xpath("(//div[@class='k-top k-top'])[5]"));
		return SelectActDDCM;
		
		
	}
	
	// contractor master
	
	public static WebElement ContractorTypeCT()		//Method for searching Username input
	{
		ContractorTypeCT = getDriver().findElement(By.xpath("//*[@id=\"drpContractorType_listbox\"]/li[1]"));
		return ContractorTypeCT;
		
		
	}
	
	
	public static WebElement SpaceCM()		//Method for searching Username input
	{
		SpaceCM = getDriver().findElement(By.xpath("//label[.='Compliance and Template Mapping']"));
		return SpaceCM;
		
		
	}
	
	public static WebElement ComplianceCheckBox()		//Method for searching Username input
	{
		ComplianceCheckBox = getDriver().findElement(By.xpath("//input[@data-role='checkbox']"));
		return ComplianceCheckBox;
		
		
	}
	
	public static WebElement SaveMappingButton()		//Method for searching Username input
	{
		SaveCompliance = getDriver().findElement(By.xpath("//button[@id='btnSaveComplianceMapping']"));
		return SaveCompliance;
		
		
	}
	
	public static WebElement NextButton()		//Method for searching Username input
	{
		mapCompliance = getDriver().findElement(By.xpath("//button[@id='btnNext']"));
		return mapCompliance;
		
		
	}
	
	
	public static WebElement StateCM()		//Method for searching Username input
	{
		StateCM = getDriver().findElement(By.xpath("//*[@id='divMain']/div[1]"));
		return StateCM;
		
		
	}
	
	
	public static WebElement UpdateComplienceCM()		//Method for searching Username input
	{
		UpdateComplienceCM = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-edit k-grid-edit2']"));
		return UpdateComplienceCM;
		
		
	}
	
	
	public static WebElement UpdateComplienceDrop()		//Method for searching Username input
	{
		UpdateComplienceDrop = getDriver().findElement(By.xpath("//a[@class='k-icon k-i-expand']"));
		return UpdateComplienceDrop;
		
		
	}
	
	public static WebElement UpdateComplienceTempCheckBoxDrop()		//Method for searching Username input
	{
		UpdateComplienceTempCheckBoxDrop = getDriver().findElement(By.xpath("(//input[@class='k-checkbox'])[795]"));
		return UpdateComplienceTempCheckBoxDrop;
		
		
	}
	
	public static WebElement RemoveCM()		//Method for searching Username input
	{
		RemoveCM = getDriver().findElement(By.id("btnDeleteComplianceMapping"));
		return RemoveCM;
		
		
	}
	
	public static WebElement ExportToExcelCM()		//Method for searching Username input
	{
		ExportToExcelCM = getDriver().findElement(By.xpath("//*[@id=\"gridEditMapping\"]/div[2]/table/tbody/tr[2]/td[2]/div/div[1]/a"));
		return ExportToExcelCM;
		
		
	}
	
	public static WebElement ExportButtonCM()		//Method for searching Username input
	{
		ExportButtonCM = getDriver().findElement(By.id("btnexport"));
		return ExportButtonCM;
		
		
	}
	
	public static WebElement ClearButtonCM()		//Method for searching Username input
	{
		ClearButtonCM = getDriver().findElement(By.xpath("//button[@id='ClearfilterAddMapping']"));
		return ClearButtonCM;
		
		
	}
	
	public static WebElement StateDDCM()		//Method for searching Username input
	{
		StateDDCM = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[.='Arunachal Pradesh']"));
		return StateDDCM;
		
		
	}
	
	
	public static WebElement UploadCM()		//Method for searching Username input
	{
		UploadCM = getDriver().findElement(By.xpath("//*[@id='btnexcelUplaod']"));
		return UploadCM;
		
		
	}
	
	public static WebElement ChooseFileCM()		//Method for searching Username input
	{
		ChooseFileCM = getDriver().findElement(By.id("ComplianceBulkUploadData"));
		return ChooseFileCM;
		
		
	}
	
	
	
	public static WebElement UploadButtonCM()		//Method for searching Username input
	{
		UploadButtonCM = getDriver().findElement(By.id("btnComplianceBulkUpload"));
		return UploadButtonCM;
		
		
	}
	
	public static WebElement ViewButtonCM()		//Method for searching Username input
	{
		ViewButtonCM = getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-view k-grid-edit2']"));
		return ViewButtonCM;
		
		
	}
	
	public static WebElement ProjectGetText()		//Method for searching Username input
	{
		ViewButtonCM = getDriver().findElement(By.xpath("//*[@id='divViewMapping']/div[1]/div[1]/label[1]"));
		return ViewButtonCM;
		
		
	}

	
	
	public static WebElement TemplateDropCM()		//Method for searching Username input
	{
		TemplateDropCM = getDriver().findElement(By.xpath("//*[@id='gridEditMapping']/div[2]/table/tbody/tr/td[1]"));
		return TemplateDropCM;
		
		
	}
	
	public static WebElement SelectComplianceCheckBox1()		//Method for searching Username input
	{
		SelectCompliance11CM = getDriver().findElement(By.xpath("(//div[@id='gridCompliances']//td//label[@class='k-checkbox-label k-no-text'])[1]"));
		return SelectCompliance11CM;
		
		
	}
	
	
	public static WebElement ContractorTypeUser()		//Method for searching Username input
	{
		ContractorTypeUser = getDriver().findElement(By.xpath("//*[@id='NewContractorEditModal']/div[4]/div/span/span/span[2]"));
		return ContractorTypeUser;
		
		
	}
	
	
	public static WebElement ContractorTypeUserSelect()		//Method for searching Username input
	{
		ContractorTypeUserSelect = getDriver().findElement(By.xpath("//div[@class='k-animation-container']/div//ul[@id='drpContractorType_listbox']/li[1]"));
		return ContractorTypeUserSelect;
		
		
	}
	
	public static WebElement AuditScheduling()		//Method for searching Username input
	{
		AuditScheduling = getDriver().findElement(By.id("leftAuditSchedulingmenu"));
		return AuditScheduling;
		
		
	}
	
	
	public static WebElement AuditSchedulingUnschedule()		//Method for searching Username input
	{
		AuditSchedulingUnschedule = getDriver().findElement(By.xpath("(//span[@class='k-link'])[2]"));
		return AuditSchedulingUnschedule;
		
		
	}
	
	
	public static WebElement AuditSchedulingUnscheduleSelectPeriod()		//Method for searching Username input
	{
		AuditSchedulingUnscheduleSelectPeriod = getDriver().findElement(By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[4]//*[name()='span' and .='Select Period']"));
		return AuditSchedulingUnscheduleSelectPeriod;
		
		
	}
	
	
	public static WebElement SelectPeriodDD()		//Method for searching Username input
	{
		SelectPeriodDD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul[@class='k-list k-reset']//li[1]"));
		return SelectPeriodDD;
		
		
	}
	
	public static WebElement ScheduledTab()		//Method for searching Username input
	{
		ScheduledTab = getDriver().findElement(By.xpath("//*[@id='tabstrip']/ul/li[1]/span[2]"));
		return ScheduledTab;
		
		
	}
	
	
	
	
	
	public static WebElement SelectYearAS()		//Method for searching Username input
	{
		SelectYearAS = getDriver().findElement(By.xpath("//span[@class='k-dropdown-wrap k-state-default']//*[name()='span' and .='Select Year']"));
		return SelectYearAS;
		
		
	}
	
	
	public static WebElement SelectYearASDD()		//Method for searching Username input
	{
		SelectYearASDD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//div//div[@class='k-list-scroller']//ul//li[.='2023']"));
		return SelectYearASDD;
		
		
	}
	
	public static WebElement SaveAuditScheduling()		//Method for searching Username input
	{
		SaveAuditScheduling = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-edit k-grid-edit'])[1]"));
		return SaveAuditScheduling;
		
		
	}
	
	
	public static WebElement ScheduleAS()		//Method for searching Username input
	{
		ScheduleAS = getDriver().findElement(By.xpath("//li[@class='k-item k-state-default k-first k-tab-on-top k-state-active']"));
		return ScheduleAS;
		
		
	}
	
	
	public static WebElement LocationAS()		//Method for searching Username input
	{
		LocationAS = getDriver().findElement(By.xpath("//*[@id='dvAuditScheduling']/div[1]/span[3]"));
		return LocationAS;
		
		
	}
	
	public static WebElement Project()		//Method for searching Username input
	{
		LocationAS = getDriver().findElement(By.xpath("//*[@id='dvAuditAssigment']/div[1]/span[3]"));
		return LocationAS;
		
		
	}

	
	
	
	
	
	public static WebElement LocationDropAS()		//Method for searching Username input
	{
		LocationDropAS = getDriver().findElement(By.xpath("//ul[@id='dropdownFilterProjectName_listbox']/li"));
		return LocationDropAS;
		
		
	}
	
	
	public static WebElement SelectProjectAS()		//Method for searching Username input
	{
		SelectProjectAS = getDriver().findElement(By.xpath("(//span[.='Select Project'])[3]"));
		return SelectProjectAS;
		
		
	}
	
	public static WebElement SelectProjectDDAS()		//Method for searching Username input
	{
		SelectProjectDDAS = getDriver().findElement(By.xpath("//li[.='Abhinav Heritage ']"));
		return SelectProjectDDAS;
		
		
	}
	
	
	public static WebElement ClearButtonAS()		//Method for searching Username input
	{
		ClearButtonAS = getDriver().findElement(By.id("btnClear"));
		return ClearButtonAS;
		
		
	}
	
	
	public static WebElement AuditAssignment()		//Method for searching Username input
	{
		AuditAssignment = getDriver().findElement(By.id("leftAuditAssingmenmenu"));
		return AuditAssignment;
		
		
	}
	
	
	public static WebElement AssignButtonAA()		//Method for searching Username input
	{
		AssignButtonAA = getDriver().findElement(By.xpath("(//span[@class='k-link'])[1]"));
		return AssignButtonAA;
		
		
	}
	
	
	public static WebElement SelectAuditor()		//Method for searching Username input
	{
		SelectAuditor = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header dropDownTemplate1']//span[.='Select Auditor'])[2]"));
		return SelectAuditor;
		
		
	}
	
	
	public static WebElement SelectAuditor1()		//Method for searching Username input
	{
		SelectAuditor1 = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header dropDownTemplate']//span[.='Select Auditor'])[2]"));
		return SelectAuditor1;
		
		
	}

	
	
	
	public static WebElement SelectAuditorDDAA()		//Method for searching Username input
	{
		SelectAuditorDDAA = getDriver().findElement(By.xpath("(//div[@class='k-animation-container']//div//ul//li)[1]"));
		return SelectAuditorDDAA;
		
		
	}
	
	
	public static WebElement SelectAuditorSaveAA()		//Method for searching Username input
	{
		SelectAuditorSaveAA = getDriver().findElement(By.xpath("(//a[@role='button'])[11]"));
		return SelectAuditorSaveAA;
		
		
	}
	
	public static WebElement AssignSelectAuditorSaveAA()		//Method for searching Username input
	{
		AssignSelectAuditorSaveAA = getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return AssignSelectAuditorSaveAA;
		
		
	}

	
	public static WebElement UnassignButtonAA()		//Method for searching Username input
	{
		UnassignButtonAA = getDriver().findElement(By.xpath("(//span[@class='k-link'])[2]"));
		return UnassignButtonAA;
		
		
	}
	
	public static WebElement SelectauditorClearBAA()		//Method for searching Username input
	{
		SelectauditorClearBAA = getDriver().findElement(By.xpath("(//span[@class='k-input'])[15]"));
		return SelectauditorClearBAA;
		
		
	}
	
	
	public static WebElement SelectauditorClearBDDAA()		//Method for searching Username input
	{
		SelectauditorClearBDDAA = getDriver().findElement(By.xpath("(//li[.='Auditor Three Three'])[3]"));
		return SelectauditorClearBDDAA;
		
		
	}
	
	
	public static WebElement ClearButtonAA()		//Method for searching Username input
	{
		ClearButtonAA = getDriver().findElement(By.id("btnClear"));
		return ClearButtonAA;
		
		
	}
	
	
	
	public static WebElement UnassignSubmitButtonAA()		//Method for searching Username input
	{
		UnassignSubmitButtonAA = getDriver().findElement(By.id("btnSavemulti"));
		return UnassignSubmitButtonAA;
		
		
	}
	
	
	
	public static WebElement Report()		//Method for searching Username input
	{
		Report = getDriver().findElement(By.id("leftReportsmenu"));
		return Report;
		
		
	}
	
	public static WebElement ExportReportFR()		//Method for searching Username input
	{
		ExportReportFR = getDriver().findElement(By.id("btnDownloaddrpReports"));
		return ExportReportFR;
		
		
	}
	
	
	public static WebElement CalenderStartDReport()		//Method for searching Username input
	{
		CalenderStartDReport = getDriver().findElement(By.xpath("//*[@id='dvReports']/div[1]/div[1]"));
		return CalenderStartDReport;
		
		
	}
	
	
	public static WebElement CalenderStartDReportDD()		//Method for searching Username input
	{
		CalenderStartDReportDD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li"));
		return CalenderStartDReportDD;
		
		
	}
	
	
	
	public static WebElement CalenderEndDReport()		//Method for searching Username input
	{
		CalenderEndDReport = getDriver().findElement(By.xpath("(//span[@class='k-select'])[3]"));
		return CalenderEndDReport;
		
		
	}
	
	
	public static WebElement CalenderEndDReportDD()		//Method for searching Username input
	{
		CalenderEndDReportDD = getDriver().findElement(By.xpath("(//a[.='31'])[2]"));
		return CalenderEndDReportDD;
		
		
	}
	
	public static WebElement ClearButtonReport()		//Method for searching Username input
	{
		ClearButtonReport = getDriver().findElement(By.id("ClearfilterMain"));
		return ClearButtonReport;
		
		
	}
	
	
	public static WebElement MoreReportReport()		//Method for searching Username input
	{
		MoreReportReport = getDriver().findElement(By.id("MoreReport"));
		return MoreReportReport;
		
		
	}
	
	public static WebElement CloseAuditReportR()		//Method for searching Username input
	{
		CloseAuditReportR = getDriver().findElement(By.id("btnGetVendorAuditForCloseReport"));
		return CloseAuditReportR;
		
		
	}
	
	
	public static WebElement MouthCloseReportR()		//Method for searching Username input
	{
		MouthCloseReportR = getDriver().findElement(By.id("btnReportGeneric"));
		return MouthCloseReportR;
		
		
	}
	
	
	public static WebElement SelectMonth()		//Method for searching Username input
	{
		SelectMonth = getDriver().findElement(By.xpath("//*[@id='divReportss']/div/span[1]"));
		return SelectMonth;
		
		
	}
	
	public static WebElement SelectMonthDD()		//Method for searching Username input
	{
		SelectMonthDD = getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[.='Jul 22']"));
		return SelectMonthDD;
		
		
	}
	
	
	
	public static WebElement RemarkReportR()		//Method for searching Username input
	{
		RemarkReportR = getDriver().findElement(By.id("btnComplianceRemarksReport"));
		return RemarkReportR;
		
		
	}
	
	
	public static WebElement AuditReport()		//Method for searching Username input
	{
		AuditReport = getDriver().findElement(By.id("btnReportGenericAll"));
		return AuditReport;
		
		
	}
	
	public static WebElement LocationDropASh()		//Method for searching Username input
	{
		LocationDropASh = getDriver().findElement(By.xpath("//span[.='Balaji Park']"));
		return LocationDropASh;
		
		
	}
	
	
	public static WebElement UpdateContractorTypeCT()		//Method for searching Username input
	{
		UpdateContractorTypeCT = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[8]"));
		return UpdateContractorTypeCT;
		
		
	}
	
	public static WebElement ActionColmnReportDownload()		//Method for searching Username input
	{
		ActionColmnReportDownload = getDriver().findElement(By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[15]/a[2]"));
		return ActionColmnReportDownload;
		
		
	}
	
	
	public static WebElement Status1()		//Method for searching Username input
	{
		ActionColmnReportDownload = getDriver().findElement(By.xpath("//*[@id='dvReports']/div[1]/div[1]"));
		return ActionColmnReportDownload;
		
		
	}

	public static WebElement Status1DD()		//Method for searching Username input
	{
		ActionColmnReportDownload = getDriver().findElement(By.xpath("//span[.='Closed']"));
		return ActionColmnReportDownload;
		
		
	}
	
	public static WebElement PDFViewandDownload()		//Method for searching Username input
	{
		ActionColmnReportDownload = getDriver().findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[15]/a[3]"));
		return ActionColmnReportDownload;
		
		
	}
	
	public static WebElement Frame()		//Method for searching Username input
	{
		ActionColmnReportDownload = getDriver().findElement(By.xpath("//iframe[@id='OverViews']"));
		return ActionColmnReportDownload;
		
		
	}


	public static WebElement Downloadasapdf()		//Method for searching Username input
	{
		ActionColmnReportDownload = getDriver().findElement(By.xpath("//span[@id='downloadAsPdfButton']"));
		return ActionColmnReportDownload;
		
		
	}

	
	
	public static WebElement ContractorCalendorDate()		//Method for searching Username input
	{
		ContractorCalendorDate = getDriver().findElement(By.xpath("//a[.='27']"));
		return ContractorCalendorDate;
		
		
	}
	
	public static WebElement AddLicenceTypeCT1()		//Method for searching Username input
	{
		AddLicenceTypeCT1 = getDriver().findElement(By.xpath("(//span[@class='k-widget k-dropdown k-header'])[10]"));
		return AddLicenceTypeCT1;
		
		
	}
	
	
	public static WebElement ViewButtonDropReport()		//Method for searching Username input
	{
		ViewButtonDropReport = getDriver().findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/table/tbody/tr[1]/td[7]/a[2]"));
		return ViewButtonDropReport;
		
		
	}
	
	public static WebElement Drop1()		//Method for searching Username input
	{
		ViewButtonDropReport = getDriver().findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td[1]"));
		return ViewButtonDropReport;
		
		
	}

	
	
	public static WebElement ViewButtonReport()		//Method for searching Username input
	{
		ViewButtonReport = getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-view k-grid-view'])[1]"));
		return ViewButtonReport;
		
		
	}
	
	
	public static WebElement Drop()		//Method for searching Username input
	{
		Drop = getDriver().findElement(By.xpath("a[aria-label='Expand']"));
		return Drop;
		
		
	}
	
	
	
	public static WebElement ContractorClose()		//Method for searching Username input
	{
		ContractorClose = getDriver().findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return ContractorClose;
		
		
	}
	
	public static WebElement managementClose()		//Method for searching Username input
	{
		managementClose = getDriver().findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return managementClose;
		
		
	}
	
	
	public static WebElement managementLocation2()		//Method for searching Username input
	{
		managementLocation2 = getDriver().findElement(By.xpath("(//span[.='Manufacturing Plant'])[2]"));
		return managementLocation2;
		
		
	}
	
	
	
	
	public static WebElement managementProject2()		//Method for searching Username input
	{
		managementProject2 = getDriver().findElement(By.xpath("//span[.='IRCON Project']"));
		return managementProject2;
		
		
	}
	
	
	public static WebElement managementUser2()		//Method for searching Username input
	{
		managementUser2 = getDriver().findElement(By.xpath("//span[.='Monika12 Bhoyar']"));
		return managementUser2;
		
		
	}
	
	
	
	
	public static WebElement managementProject()		//Method for searching Username input
	{
		managementProject = getDriver().findElement(By.xpath("//span[.='ABC 4 Heritage']"));
		return managementProject;
		
		
	}
	
	public static WebElement managementuser()		//Method for searching Username input
	{
		managementuser = getDriver().findElement(By.xpath("//span[.='Management User']"));
		return managementuser;
		
		
	}
	
	
	public static WebElement CMAddButton()		//Method for searching Username input
	{
		CMAddButton = getDriver().findElement(By.id("btnAddAssingment"));
		return CMAddButton;
		
		
	}
	
	
	
	public static WebElement CMAddProject()		//Method for searching Username input
	{
		CMAddProject = getDriver().findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[5]"));
		return CMAddProject;
		
		
	}
	
	
	
	public static WebElement CMAddProjectDD()		//Method for searching Username input
	{
		CMAddProjectDD = getDriver().findElement(By.xpath("(//span[.='Contractor_Nileshh'])[2]"));
		return CMAddProjectDD;
		
		
	}
	
	
	
	public static WebElement CloseDataPoint()		//Method for searching Username input
	{
		CloseDataPoint = getDriver().findElement(By.xpath("//a[@class='k-button k-bare k-button-icon k-window-action']"));
		return CloseDataPoint;
		
		
	}
	
	
	public static WebElement CloseAct()		//Method for searching Username input
	{
		CloseAct = getDriver().findElement(By.xpath("//a[@class='k-button k-bare k-button-icon k-window-action']"));
		return CloseAct;
		
		
	}
	
	
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Negative Test Script
	
	
	public static WebElement DownloadErrorFile()		//Method for searching Username input
	{
		DownloadErrorFile = getDriver().findElement(By.xpath("//a[.='Download Error File']"));
		return DownloadErrorFile;
		
		
	}
	
	
	public static WebElement DownloadErrorFileTemplate()		//Method for searching Username input
	{
		DownloadErrorFileTemplate = getDriver().findElement(By.xpath("(//a[.='Download Error File'])[3]"));
		return DownloadErrorFileTemplate;
		
		
	}
	
	
	
	
	
	
	public static WebElement DownloadFileNotFound()		//Method for searching Username input
	{
		DownloadFileNotFound = getDriver().findElement(By.cssSelector("body > pre"));
		return DownloadFileNotFound;
		
		
	}
	
	
	
	
	/////////////////////Multiple Filter
	
	
	
	public static WebElement LocationProjectMaster()		//Method for searching Username input
	{
		LocationProjectMaster = getDriver().findElement(By.xpath("//span[.='Select Location']"));
		return LocationProjectMaster;
		
		
	}
	
	public static WebElement LocationProjectMasterAA()		//Method for searching Username input
	{
		LocationProjectMasterAA = getDriver().findElement(By.xpath("(//span[.='Location'])[1]"));
		return LocationProjectMasterAA;
		
		
	}
	
	
	public static WebElement LocationReport()		//Method for searching Username input
	{
		LocationReport = getDriver().findElement(By.xpath("//span[.='Entity/Sub-Entity/Location']"));
		return LocationReport;
		
		
	}
	
	
	
	
	public static WebElement ProjectAA()		//Method for searching Username input
	{
		ProjectAA = getDriver().findElement(By.xpath("(//span[.='Select Project'])[3]"));
		return ProjectAA;
		
		
	}
	
	
	
	
	public static WebElement ProjectAA1()		//Method for searching Username input
	{
		ProjectAA1 = getDriver().findElement(By.cssSelector("#dvPM > div:nth-child(2)"));
		return ProjectAA1;
		
		
	}
	
	
	
	
	
	
	public static WebElement LocationProjectMasterExpand()		//Method for searching Username input
	{
		LocationProjectMasterExpand = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[1]"));
		return LocationProjectMasterExpand;
		
		
	}
	
	
	
	
	public static WebElement LocationProjectMasterDD()		//Method for searching Username input
	{
		LocationProjectMasterDD = getDriver().findElement(By.xpath("(//span[.='Manufacturing Plant'])[1]"));
		return LocationProjectMasterDD;
		
		
	}
	
	
	
	
	
	
	
	public static WebElement CatogaryProjectMaster()		//Method for searching Username input
	{
		CatogaryProjectMaster = getDriver().findElement(By.xpath("(//span[.='Select Category'])[1]"));
		return CatogaryProjectMaster;
		
		
	}
	
	
	
	
	public static WebElement CatogaryProjectMasterDD()		//Method for searching Username input
	{
		CatogaryProjectMasterDD = getDriver().findElement(By.xpath("//span[.='CTS']"));
		return CatogaryProjectMasterDD;
		
		
	}
	
	
	
	public static WebElement DirectorProjectMaster()		//Method for searching Username input
	{
		DirectorProjectMaster = getDriver().findElement(By.xpath("//span[.='Select Director']"));
		return DirectorProjectMaster;
		
		
	}
	
	

	
	
	
	
	public static WebElement DirectorProjectMasterDD()		//Method for searching Username input
	{
		DirectorProjectMasterDD = getDriver().findElement(By.xpath("(//span[.='Project Director'])[1]"));
		return DirectorProjectMasterDD;
		
		
	}
	
	
	
	public static WebElement HeadProjectMaster()		//Method for searching Username input
	{
		HeadProjectMaster = getDriver().findElement(By.xpath("//span[.='Select Head']"));
		return HeadProjectMaster;
		
		
	}
	
	
	
	public static WebElement HeadProjectMasterDD()		//Method for searching Username input
	{
		HeadProjectMasterDD = getDriver().findElement(By.xpath("//span[.='Project Head']"));
		return HeadProjectMasterDD;
		
		
	}
	
	
	
	public static WebElement StatusProjectMaster()		//Method for searching Username input
	{
		StatusProjectMaster = getDriver().findElement(By.xpath("(//span[.='Select Status'])[1]"));
		return StatusProjectMaster;
		
		
	}
	


	public static WebElement StatusProjectMasterDD()		//Method for searching Username input
	{
		StatusProjectMasterDD = getDriver().findElement(By.xpath("(//span[.='Active'])[1]"));
		return StatusProjectMasterDD;
		
		
	}
	
	
	
	public static WebElement ClearButtonPM()		//Method for searching Username input
	{
		ClearButtonPM = getDriver().findElement(By.id("btnClear"));
		return ClearButtonPM;
		
		
	}
	
	
	
	////Filter
	
	
	public static WebElement ContractorProjectMaster()		//Method for searching Username input
	{
		ContractorProjectMaster = getDriver().findElement(By.cssSelector("#dvComplianceAssignment > div:nth-child(1) > span:nth-child(4)"));
		return ContractorProjectMaster;
		
		
	}
	
	
	public static WebElement ContractorProjectMaster1()		//Method for searching Username input
	{
		ContractorProjectMaster1 = getDriver().findElement(By.xpath("//span[@class='k-input k-readonly' and .='Project']"));
		return ContractorProjectMaster1;
		
		
	}
	
	
	
	
	
	public static WebElement ContractorMasterProjectDD()		//Method for searching Username input
	{
		ContractorMasterProjectDD = getDriver().findElement(By.cssSelector("(//span[.='IRCON Project'])[1]"));
		return ContractorMasterProjectDD;
		
		
	}
	
	
	
	public static WebElement ContractorMasterProjectDD1()		//Method for searching Username input
	{
		ContractorMasterProjectDD1 = getDriver().findElement(By.xpath("(//li[.='Yash contractors'])[1]"));
		return ContractorMasterProjectDD1;
		
		
	}
	
	
	public static WebElement ContractorMasterProjectDD11()		//Method for searching Username input
	{
		ContractorMasterProjectDD11 = getDriver().findElement(By.xpath("//span[.='IRCON Project']"));
		return ContractorMasterProjectDD11;
		
		
	}
	
	
	
	
	
	
	
	public static WebElement ComplianceMappingTabCompliance()		//Method for searching Username input
	{
		ComplianceMappingTabCompliance = getDriver().findElement(By.xpath("(//span[.='Contractor'])[3]"));
		return ComplianceMappingTabCompliance;
		
		
	}
	
	public static WebElement ComplianceMappingTabComplianceDD()		//Method for searching Username input
	{
		ComplianceMappingTabComplianceDD = getDriver().findElement(By.xpath("(//li[.='Govardhan Contractors'])[1]"));
		return ComplianceMappingTabComplianceDD;
		
		
	}
	
	
	
	
	public static WebElement ComplianceMappingTabTemplate()		//Method for searching Username input
	{
		ComplianceMappingTabTemplate = getDriver().findElement(By.xpath("(//span[.='Template'])[3]"));
		return ComplianceMappingTabTemplate;
		
		
	}
	
	
	public static WebElement ComplianceMappingTabTemplateDD()		//Method for searching Username input
	{
		ComplianceMappingTabTemplateDD = getDriver().findElement(By.xpath("(//li[.='Karnataka Template'])[1]"));
		return ComplianceMappingTabTemplateDD;
		
		
	}
	
	
	
	public static WebElement ASLocationFilterDD()		//Method for searching Username input
	{
		ASLocationFilterDD = getDriver().findElement(By.xpath("//span[.='Mastek Limited ']"));
		return ASLocationFilterDD;
		
		
	}
	
	
	public static WebElement ASProjectFilterDD()		//Method for searching Username input
	{
		ASProjectFilterDD = getDriver().findElement(By.xpath("//li[.='HSR Heritage']"));
		return ASProjectFilterDD;
		
		
	}
	
	
	public static WebElement VCALegalEntityExpandAA()		//Method for searching Username input
	{
		VCALegalEntityExpandAA = getDriver().findElement(By.xpath("(//span[@class='k-icon k-i-expand'])[9]"));
		return VCALegalEntityExpandAA;
		
		
	}
	
	
	public static WebElement VCALegalEntityAADD()		//Method for searching Username input
	{
		VCALegalEntityAADD = getDriver().findElement(By.xpath("//span[.='Branch Bangalore']"));
		return VCALegalEntityAADD;
		
		
	}
	
	
	
	
	public static WebElement ProjectDD()		//Method for searching Username input
	{
		ProjectDD = getDriver().findElement(By.xpath("//li[.='NK Heights ']"));
		return ProjectDD;
		
		
	}
	
	
	public static WebElement SelectAuditorAA()		//Method for searching Username input
	{
		SelectAuditorAA = getDriver().findElement(By.xpath("(//span[.='Select Auditor'])[3]"));
		return SelectAuditorAA;
		
		
	}
	
	
	public static WebElement Selectproject()		//Method for searching Username input
	{
		Selectproject = getDriver().findElement(By.xpath("(//span[.='Select Project'])[3]"));
		return Selectproject;
		
		
	}
	
	
	
	
	public static WebElement SelectAuditorAADD()		//Method for searching Username input
	{
		SelectAuditorAADD = getDriver().findElement(By.xpath("(//li[.='Auditor Demo'])[2]"));
		return SelectAuditorAADD;
		
		
	}
	
	
	
	public static WebElement ProjectReport()		//Method for searching Username input
	{
		ProjectReport = getDriver().findElement(By.xpath("//span[.='Project']"));
		return ProjectReport;
		
		
	}
	
	
	
	
	public static WebElement ProjectReportDD()		//Method for searching Username input
	{
		ProjectReportDD = getDriver().findElement(By.xpath("//span[.='Venkatesh Heritage']"));
		return ProjectReportDD;
		
		
	}
	
	
	
	
	public static WebElement ReportTabContractor()		//Method for searching Username input
	{
		ReportTabContractor = getDriver().findElement(By.xpath("(//span[.='Contractor'])[1]"));
		return ReportTabContractor;
		
		
	}
	
	
	
	public static WebElement ReportTabContractorDD()		//Method for searching Username input
	{
		ReportTabContractorDD = getDriver().findElement(By.xpath("//span[.='Yash contractors']"));
		return ReportTabContractorDD;
		
		
	}
	
	
	public static WebElement ReportTabContractorType()		//Method for searching Username input
	{
		ReportTabContractorType = getDriver().findElement(By.xpath("//span[.='Contractor Type']"));
		return ReportTabContractorType;
		
		
	}
	
	
	public static WebElement ReportTabContractorTypeDD()		//Method for searching Username input
	{
		ReportTabContractorTypeDD = getDriver().findElement(By.xpath("//span[.='Sub-Contractor']"));
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
		ReportTabPeriodDD = getDriver().findElement(By.xpath("//span[.='Jan 21']"));
		return ReportTabPeriodDD;
		
		
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
	
	
	public static WebElement clickNextPage1()		//Method for searching Username input
	{
		clickNextPage1 = getDriver().findElement(By.xpath("//*[@title='Go to the next page']"));
		return clickNextPage1;
		
		
	}
	
	
	
	public static WebElement readTotalItems1()		//Method for searching Username input
	{
		readTotalItems1 = getDriver().findElement(By.xpath("//*[@class='k-pager-info k-label']"));
		return readTotalItems1;
		
		
	}
	

	
	public static WebElement readTotalItems11()		//Method for searching Username input
	{
		readTotalItems11 = getDriver().findElement(By.xpath("(//span[@class='k-pager-info k-label'])[2]"));
		return readTotalItems11;
		
		
	}
	
	
	public static WebElement Close()		//Method for searching Username input
	{
		Close = getDriver().findElement(By.xpath("(//button[@class='close'])[2]"));
		return Close;
		
		
	}
	
	
	public static WebElement DownloadErrorFile1()		//Method for searching Username input
	{
		DownloadErrorFile1 = getDriver().findElement(By.xpath("//*[@id='filedownload']/a"));
		return DownloadErrorFile1;
		
		
	}

	public static WebElement GridCount()		//Method for searching Username input
	{
		GridCount = getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return GridCount;
	}

	
	public static WebElement All()		//Method for searching Username input
	{
		GridCount = getDriver().findElement(By.xpath("//li[.='All']"));
		return GridCount;
	}

	
	public static WebElement PagingDD1()		//Method for searching Username input
	{
		GridCount = getDriver().findElement(By.xpath("//*[@id='gridLicense']/div[3]/span[1]/span"));
		return GridCount;
	}

}
	

