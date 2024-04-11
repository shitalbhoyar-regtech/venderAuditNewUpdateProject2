package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login extends BasePage {
	
//	public static Web  = null;				//Web instance created
	public static WebElement upload = null;				//WebElement to get upload button
	
	/*
	public static void BrowserSetup(String URL)
	{

		System.setProperty("web.chrome.","E:\\\\chrome-win32\\chrome.exe");
		
		//WebManager.chrome().setup();
//		 = new Chrome();		
		
	.manage().window().maximize();			//Set window size to maximum.
		.get(URL);								//Set the URL of WebApplication.
	}
	*/
	
	/*
	public static void BrowserSetup1(String URL)
	{

		System.setProperty("web.opera.","C:\\Users\\shitalb\\Documents\\opera_win32\\opera.exe");
		
		//WebManager.chrome().setup();
		 = new Opera();		
		
	.manage().window().maximize();			//Set window size to maximum.
		.get(URL);								//Set the URL of WebApplication.
	}
//	C:\Users\shitalb\AppData\Local\Programs\Opera
	*/
	
	/*
	public static void BrowserSetup1(String URL)
	{

	//	System.setProperty("web.chrome.","E:\\\\chrome-win32\\\\chrome.exe");
		//WebManager.chrome().setup();
		
		System.setProperty("web.gecko.","E:\\gecko.exe");
		
			//WebManager.chrome().setup();
			 = new Firefox();	
		
	.manage().window().maximize();			//Set window size to maximum.
		.get(URL);								//Set the URL of WebApplication.
	}
	
	
	public static void BrowserSetup2(String URL)
	{

		System.setProperty("web.opera.", "E:\\Documents\\\\opera_win64\\opera.exe");
	    OperaOptions operaOptions =new OperaOptions();
	    operaOptions.setBinary("C:\\Program Files\\Operabrowser\\opera.exe");
		 = new Opera(operaOptions);
		
	//	System.setProperty("web.opera.","C:\\Users\\shitalb\\Desktop\\opera_win64\\opera.exe");
		
		//WebManager.chrome().setup();
	//	 = new Opera();		
		
	.manage().window().maximize();			//Set window size to maximum.
		.get(URL);								//Set the URL of WebApplication.
	}

	
	public static void BrowserSetup3(String URL)
	{

	//	System.setProperty("web.chrome.","E:\\\\chrome-win32\\\\chrome.exe");
		//WebManager.chrome().setup();
		
		System.setProperty("web.edge.","C:\\Users\\shitalb\\Documents\\\\msedge.exe");
		
			//WebManager.chrome().setup();
			 = new Edge();	
		
	.manage().window().maximize();			//Set window size to maximum.
		.get(URL);								//Set the URL of WebApplication.
	}

*/
	
	
					
	public static WebDriver UserLogin(String username, String password, String method) throws InterruptedException
	{		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(1000);
		LoginPOM.setUname().sendKeys(username);		//Sent username to input box 
		Thread.sleep(500);
		LoginPOM.setPassword().sendKeys(password);	//Sent password to input box
		LoginPOM.clickSubmit().click();				//Clicked on Sign-in button
		Thread.sleep(500);
		if(!username.equalsIgnoreCase("performer@avantis.info"))
		{
			try
			{
				Thread.sleep(500);
				wait.until(ExpectedConditions.visibilityOf(LoginPOM.clickQALink()));
				wait.until(ExpectedConditions.elementToBeClickable(LoginPOM.clickQALink()));
				LoginPOM.clickQALink().click();				//Clicking on QA Link instead of OTP.
				
				//----------------------------------------------------------------------------//
				
				wait.until(ExpectedConditions.invisibilityOf(LoginPOM.clickQALink()));
			}
			catch(Exception e)
			{
				
			}
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(LoginPOM.Question1()));
			wait.until(ExpectedConditions.elementToBeClickable(LoginPOM.Question1()));
			String que1 = LoginPOM.Question1().getText();	//Storing the question in que variable.
			String ans1 = null;
			
			
			
			if(method.equalsIgnoreCase("cfo"))
			{
				ans1 = getAnswerCFO(que1);						//Storing the answer in ans variable.
			}
			else if(method.equalsIgnoreCase("fe"))
			{
				ans1 = getAnswerFE(que1);						//Storing the answer in ans variable.
			}
			else if(method.equalsIgnoreCase("cfo-diy"))
			{
				ans1 = "123";						//Storing the answer in ans variable.
			}
			
			else if(method.equalsIgnoreCase("company"))
			{
				ans1 = "123";						//Storing the answer in ans variable.
			}
			
			
			
			else
			{
				ans1 = getAnswer(que1);							//Storing the answer in ans variable.
			}
			
			
			if(ans1.equalsIgnoreCase("birthplace"))
				LoginPOM.Answer1().sendKeys("place");		//Sending answer to the input box.
			else
				LoginPOM.Answer1().sendKeys(ans1);		//Sending answer to the input box.
			Thread.sleep(1000);
			
			//----------------------------------------------------------//
			
			String que2 = LoginPOM.Question2().getText();	//Storing the question in que variable.
			String ans2 = null;
			if(method.equalsIgnoreCase("cfo"))
			{
				ans2 = getAnswerCFO(que2);						//Storing the answer in ans variable.
			}
			else if(method.equalsIgnoreCase("fe"))
			{
				ans2 = getAnswerFE(que2);						//Storing the answer in ans variable.
			}
			
			else if(method.equalsIgnoreCase("cfo-diy"))
			{
				ans2 = "123";						//Storing the answer in ans variable.
			}
			
			else if(method.equalsIgnoreCase("company"))
			{
				ans2 = "123";						//Storing the answer in ans variable.
			}
			else
			{
				ans2 = getAnswer(que2);							//Storing the answer in ans variable.
			}
			
			
			if(ans2.equalsIgnoreCase("birthplace"))
				LoginPOM.Answer2().sendKeys("place");		//Sending answer to the input box.
			else
				LoginPOM.Answer2().sendKeys(ans2);		//Sending answer to the input box.
			Thread.sleep(100);
			
			LoginPOM.SubmitAnswer().click();				//Clicking on Submit button.
			
			
		}
		
		
		
		if(!method.equalsIgnoreCase("company"))
		{
			//wait1.until(ExpectedConditions.elementToBeClickable(LoginPOM.clickComplicane()));
			
			if(method.equalsIgnoreCase("License"))
			{
				LoginPOM.clickLicense().click();				//Clicking on Litigation Image.
			}
			else if(method.equalsIgnoreCase("Litigation"))
			{
				LoginPOM.ClickLitigation().click();			//Clicking on Litigation Image.
			}
			else if(method.equalsIgnoreCase("Contract"))
			{
				LoginPOM.ClickContract().click();			//Clicking on Litigation Image.
			}
			else if(method.equalsIgnoreCase("Compnay Secretory"))
			{
				LoginPOM.clickSecreterial().click();			//Clicking on Litigation Image.
			}
			else
			{
				LoginPOM.ClickLitigation().click();	
			//	LoginPOM.clickComplicane().click();			//Clicking on Compliance Image.
			}
			
			
	
		}		
		return getDriver(); 
	}
	
	public static String getAnswer(String que)				//Method created to extract last word from question
	{														//as it is the answer of the question.
		String last = que.substring(que.lastIndexOf(" "));		//We are selecting word after last " ".
		int len = last.length();							
		String ans = last.substring(1, len-1);				//We are neglecting letters from string of position first " " and last "?"
		return ans.toLowerCase();							//Returning answer and converting to LowerCase too.  
	}
	
	public static String getAnswerCFO(String que)			//Method created to extract last word from question
	{														//as it is the answer of the question.
		String last = que.substring(que.lastIndexOf(" "));	//We are selecting word after last " ".
		int len = last.length();							
		String ans = last.substring(1, len-1);				//We are neglecting letters from string of position first " " and last "?"
		if(ans.equalsIgnoreCase("pet"))
			ans = "dog";
		if(ans.equalsIgnoreCase("car"))
			ans = "red";
		return ans.toLowerCase();							//Returning answer and converting to LowerCase too.  
	}
	public static String getAnswerFE(String que)			//Method created to extract last word from question
	{														//as it is the answer of the question.
		String last = que.substring(que.lastIndexOf(" "));	//We are selecting word after last " ".
		int len = last.length();							
		String ans = last.substring(1, len-1);				//We are neglecting letters from string of position first " " and last "?"
		if(ans.equalsIgnoreCase("pet"))
			ans = "dog";
		if(ans.equalsIgnoreCase("car"))
			ans = "red";
		return ans.toLowerCase();							//Returning answer and converting to LowerCase too.  
	}
	
	 
	  
	  
	 
		
	  

}
