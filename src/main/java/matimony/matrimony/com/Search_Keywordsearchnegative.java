package matimony.matrimony.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.DoubleClick;


public class Search_Keywordsearchnegative extends BaseTest2 {
	Actions acc;
	String marital_statuswid;
	public static WebDriver driver;
	String marital_statusany;
	String marital_statussep5;
	String shwoprofilewith5;
	String marital_statussep6;
	String marital_statuswid5;
	String marital_statusdiv6;
	String marital_statuswid6;
	String marital_statusdiv5;
	 String marital_statussep;
	String marital_statusdiv;
	Boolean flag=false;
	int count = 0;
	@BeforeMethod
	public void setup() throws MalformedURLException 
	{
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void setup6() throws Throwable 
	{
		searchPOM g = new searchPOM(driver);
		 acc = new Actions(driver);
		//Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;

		//Open URL	
		driver.get("https://www.nepalimatrimony.com");

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest2.click(g.getMatriID());
		BaseTest2.typeData(g.getMatriID(), "nep140675");
		
		Thread.sleep(1000);
		BaseTest2.click(g.getPasswordClear());
		BaseTest2.typeData(g.getPassword(), "cbstest");
		
		Thread.sleep(3000);
		BaseTest2.click(g.getLogin_btn());
		
		
		//Skip the intermediate page
		try {
			Thread.sleep(5000);
			BaseTest2.click(driver.findElement(By.xpath("//a[@class='clr7']")));
			} catch (Exception e) {
				System.out.println("Exception");
			}
			
		//Handling the Notification

			Thread.sleep(5000);

		//click on the SEARCH in the tab	
			try {
				driver.findElement(By.xpath("//a[text()='Search']")).click();
				Thread.sleep(5000);

				driver.findElement(By.xpath("(//a[text()='Keyword Search'])[2]")).click();
				
			} catch (Exception e) 
			{
				System.out.println("The element search is not able to find and flag is raised");
			}
			
			Thread.sleep(5000);
			
		/*/////////////////////////////////////SCENARIO 1/////////////////////////////////////	
		//Select "Age to" in the DropDown 
			Thread.sleep(5000);
			BaseTest2.select_text(driver.findElement(By.id("ageTo")),BaseTest2.getExcelsearchnep("Sheet1", 1, 2));
			System.out.println("From Age is 31 and the to age is 29 ");
			
		//Check the visibility of the warning 
            WebElement agegrater = driver.findElement(By.id("ageerr"));
			Thread.sleep(5000);
            if (agegrater.isDisplayed()) 
            {
				System.out.println("'Age to' is not greater than 'Age from ='   : "+ agegrater.getText());
			}else 
			{
				System.out.println("'Age to' is greater than 'Age from' so no warning has been shown");
			}
            
         ////////////////////////////////////SCENARIO 2//////////////////////////////////////
        //Select "Height form" in the DropDown
            
            Thread.sleep(5000);
            BaseTest2.select_text(driver.findElement(By.id("heightFrom")), BaseTest2.getExcelsearchnep("Sheet1", 1, 3));
            
       
       //Check the visibility of the warning
            WebElement heighterr = driver.findElement(By.id("heighterr"));
            if (heighterr.isDisplayed()) 
            {
            	System.out.println("'Height to' is not greater than 'Height from ='   : "+ heighterr.getText());
			}else 
			{
				System.out.println("'Height to' is greater than 'Height from' so no warning has been shown");
			}
            
        ///////////////////////////////////////SCENARIO 3//////////////////////////////////
        // Check on Maratial Status in the checkbox
            
            Thread.sleep(5000);
            BaseTest2.click(driver.findElement(By.xpath("//*[@id=\"maritalStatus2\"]")));
            BaseTest2.click(driver.findElement(By.xpath("//*[@id=\"maritalStatus4\"]")));
            
        //Check the visibility of the Child Status
            WebElement childStatus = driver.findElement(By.xpath("//*[text()='Have Children']"));
            Thread.sleep(3000);
            if (childStatus.isDisplayed()) 
            {
				System.out.println(childStatus.getText()+"  status bar is displayed");
			}else
			{
				System.out.println("Child Status is not displayed");
			}
            */
			
			/////chevidosham//
//			
//			driver.findElement(By.id("manglik1")).click();
//			System.out.println("Manglik yes selected");
//
			
			//keyword search//
			
			driver.findElement(By.id("keywordTxt")).sendKeys("555");
			System.out.println("Keysearch = 5555");
			driver.findElement(By.id("keywordTxt")).sendKeys("Doctor");
			System.out.println("Keysearch = Doctor");

			
		/// photo and horoscope//
        Thread.sleep(5000);

        driver.findElement(By.id("photoOpt")).click();
        System.out.println("Photo selected");
        Thread.sleep(5000);
       try {
    	   driver.findElement(By.id("horoscopeOpt")).click();
           System.out.println("Horoscope selected");
	} catch (Exception e) {
		// TODO: handle exception
	}
        
       //Dont show
        
        driver.findElement(By.id("alreadyViewedOpt")).click();
        System.out.println("Profile already view selected");
        

      
	}		
}