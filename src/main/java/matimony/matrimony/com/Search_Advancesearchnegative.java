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


public class Search_Advancesearchnegative extends BaseTest {
	Actions acc;
	String marital_statuswid;
	WebDriver driver;
	int count = 0;

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
	@BeforeMethod
	public void setup() throws MalformedURLException {
	

		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();

		}
	
	
	
	
	@Test
	public void setup6() throws Throwable {
		
		searchPOM g = new searchPOM(driver);
		 acc = new Actions(driver);
		//Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;

			
		Thread.sleep(3000);
		driver.get("https://www.nepalimatrimony.com");

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "nep140675");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		
		Thread.sleep(3000);
		BaseTest.click(g.getLogin_btn());
		
		try {
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@class='clr7']")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		
		try {
			Thread.sleep(3000);
			BaseTest.click(g.getInterMediate_page());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				BaseTest.click(g.getInterMediate_page1());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
			} catch (Exception e) {
				
			}
			
			Thread.sleep(20000);

			
			try {
				Robot robot = new Robot();
				
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				driver.switchTo().alert().accept();

			} catch (Exception e) {
				// TODO: handle exception
			}
			Thread.sleep(20000);
			
			
			
			
			

			
			try {
				driver.findElement(By.xpath("//a[text()='Search']")).click();
			} catch (Exception e) {
				System.out.println("5");
			}
	
		
		//// advance search////
		
		
		
				
			Thread.sleep(5000);
			
			try {
				driver.findElement(By.xpath("(//a[@class='active'])[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[text()='Advanced']")).click();
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}

			
			///age to///
			Thread.sleep(5000);
			driver.findElement(By.id("ageTo")).click();
			Thread.sleep(5000);
//
//
			BaseTest.select_text(driver.findElement(By.id("ageTo")),BaseTest.exceladvancesearchnegative("Sheet1", 1, 2));
//
			System.out.println("Age is 31 to 29 ");
//			
			Thread.sleep(5000);
//
//			
            WebElement ageerr = driver.findElement(By.id("ageerr"));
//
			Thread.sleep(5000);
//
            if (ageerr.isDisplayed()) {
				System.out.println("Invalid age range = matched");
			}else {
				
				System.out.println("Invalid age range = Not matched");

			}
			 
//			
//			
//			//age to correct //
			Thread.sleep(5000);
//
			BaseTest.select_text(driver.findElement(By.id("ageTo")),BaseTest.exceladvancesearchnegative("Sheet1", 2, 2));
			Thread.sleep(5000);

			System.out.println("Age is 31 to 39 ");
			
//			//height///
//			
//			
			driver.findElement(By.id("heightFrom")).click();
//
//			
			Thread.sleep(5000);

			BaseTest.select_text(driver.findElement(By.id("heightFrom")),BaseTest.exceladvancesearchnegative("Sheet1", 1, 3));

			Thread.sleep(5000);
			
			driver.findElement(By.id("heightTo")).click();
			Thread.sleep(5000);

			BaseTest.select_text(driver.findElement(By.id("heightTo")),BaseTest.exceladvancesearchnegative("Sheet1", 1, 4));

			Thread.sleep(5000);

             System.out.println("Height is 4 feet 3 inches to 4 feet 2 inches ");
			
			Thread.sleep(5000);

			
            WebElement heighterr = driver.findElement(By.id("heighterr"));

			Thread.sleep(5000);

            if (heighterr.isDisplayed()) {
				System.out.println("Invalid Height range = matched");
			}else {
				
				System.out.println("Invalid Height range = Not matched");

			}
			 
			Thread.sleep(5000);

			
			//age to correct //
			Thread.sleep(5000);
//			
			BaseTest.select_text(driver.findElement(By.id("heightFrom")),BaseTest.exceladvancesearchnegative("Sheet1", 2, 3));
//
//
			BaseTest.select_text(driver.findElement(By.id("heightTo")),BaseTest.exceladvancesearchnegative("Sheet1", 2, 4));
			Thread.sleep(5000);
//
            System.out.println("Height is 4 feet 3 inches to 4 feet 2 inches ");
			
			Thread.sleep(10000);
			WebElement widow = driver.findElement(By.id("maritalStatus2"));
					driver.findElement(By.id("maritalStatus2")).click();
//
  if (widow.isSelected()) {
//	
  System.out.println("Already selected");
}else {
	Thread.sleep(5000);
//
	driver.findElement(By.id("maritalStatus2")).click();
	driver.findElement(By.xpath("//label[text()='Widow / Widower']")).click();
	System.out.println("widow selected");
}
// 
			
			///clan  for pakistan//
			try {
				System.out.println();
				System.out.println("Select the Clan from the DropDown");
				WebElement casteTemp = driver.findElement(By.id("casteTemp"));
	            Thread.sleep(5000);
	            WebElement Gakhars = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 2, 22)+"']"));
	            WebElement Rawns = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 3, 22)+"']"));
	            acc.click(casteTemp);
	            acc.doubleClick(Gakhars).build().perform();
	            Thread.sleep(1000);
	            acc.doubleClick(Rawns).build().perform();
	            Thread.sleep(1000);
	            System.out.println("Get all selected options");
	            WebElement caste = driver.findElement(By.id("caste"));
	            Select castemp = new Select(casteTemp);
	            Select cas = new Select(caste);
	            int ctsize = castemp.getOptions().size();
	            int csize = cas.getOptions().size();
	            count = 0;
	            for (int i = 0; i < ctsize; i++) 
	            {
					for (int j = 0; j < csize; j++) 
					{
						if (castemp.getOptions().get(i).getText().equals(cas.getOptions().get(j).getText())) 
						{
							System.out.println(castemp.getOptions().get(i).getText()+"  is visible on both the sides.");
							count++;
						}
					}
				}
	            if (count==0) 
	            {
	            	System.out.println("Nothing is visible on both the sides.");
				}
			} catch (Exception e) {
				System.out.println("Exception");
			}
			 
		      //////////////////////////////////////SCENARIO 5/////////////////////////////////
		      // Select the Branch for srilanka///
			
				try {
					System.out.println();
					System.out.println("Select the Branch from the DropDown");
					WebElement casteTemp = driver.findElement(By.id("casteTemp"));
		            Thread.sleep(5000);
		            WebElement Nichiren = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 2, 23)+"']"));
		            WebElement Mahayana = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 3, 23)+"']"));
		            acc.click(casteTemp);
		            acc.doubleClick(Nichiren).build().perform();
		            Thread.sleep(1000);
		            acc.doubleClick(Mahayana).build().perform();
		            Thread.sleep(1000);
		            System.out.println("Get all selected options");
		            WebElement caste = driver.findElement(By.id("caste"));
		            Select castemp = new Select(casteTemp);
		            Select cas = new Select(caste);
		            int ctsize = castemp.getOptions().size();
		            int csize = cas.getOptions().size();
		            count = 0;
		            for (int i = 0; i < ctsize; i++) 
		            {
						for (int j = 0; j < csize; j++) 
						{
							if (castemp.getOptions().get(i).getText().equals(cas.getOptions().get(j).getText())) 
							{
								System.out.println(castemp.getOptions().get(i).getText()+"  is visible on both the sides.");
								count++;
							}
						}
					}
		            if (count==0) 
		            {
		            	System.out.println("Nothing is visible on both the sides.");
					}
				} catch (Exception e) {
					System.out.println("Exception");
				}
	            
        //////////////////////////////////////SCENARIO 6/////////////////////////////////
        // Select the Mother Tongue from the DropDown
				//mother tounge for nepali//
			try {
				System.out.println();
				System.out.println("Select the Mother Tongue from the DropDown");
	            WebElement motherTongueTemp = driver.findElement(By.id("motherTongueTemp"));
	            Thread.sleep(5000);
	            WebElement bengali = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 2, 6)+"']"));
	            WebElement Miji = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 3, 6)+"']"));
	            WebElement Tamil = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 4, 6)+"']"));
	            acc.click(motherTongueTemp);
	            acc.doubleClick(bengali).build().perform();
	            Thread.sleep(1000);
	            acc.doubleClick(Miji).build().perform();
	            Thread.sleep(1000);
	            acc.doubleClick(Tamil).build().perform();
	            Thread.sleep(1000);
	            System.out.println("Get all selected options");
	            WebElement motherTongue = driver.findElement(By.id("motherTongue"));
	            Select mtp = new Select(motherTongueTemp);
	            Select mt = new Select(motherTongue);
	            int mtpsize = mtp.getOptions().size();
	            int mtsize = mt.getOptions().size();
	            count = 0;
	            for (int i = 0; i < mtpsize; i++) 
	            {
					for (int j = 0; j < mtsize; j++) 
					{
						if (mtp.getOptions().get(i).getText().equals(mt.getOptions().get(j).getText())) 
						{
							System.out.println(mtp.getOptions().get(i).getText()+"  is visible on both the sides.");
							count++;
						}
					}
				}
	            if (count==0) 
	            {
	            	System.out.println("Nothing is visible on both the sides.");
				}
			} catch (Exception e) {
				System.out.println("Exception");
			}
			
			
                       
			
 
////phy status//
//	Thread.sleep(5000);
//
//  driver.findElement(By.id("physicalStatus0")).click();
//  System.out.println("physical status normal selected");
//  ///gothra//
//	Thread.sleep(5000);
//
			try {
			//  BaseTest.typeData(driver.findElement(By.id("gothram")),BaseTest.exceladvancesearchnegative("Sheet1", 1, 19));
//				
//				System.out.println("Gothra %%% entered");
//				Thread.sleep(5000);
	//
//				  BaseTest.typeData(driver.findElement(By.id("gothram")),BaseTest.exceladvancesearchnegative("Sheet1", 1, 20));
//					
//					System.out.println("Gothra Test entered");
	//
//			////star//
//					
//					Thread.sleep(5000);
	/////chevidosham//
//					
//					driver.findElement(By.id("manglik1")).click();
//					System.out.println("Manglik yes selected");
//					
//					
//					
//					///country living status//
//					
//					Thread.sleep(5000);
	//
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			//country living in//
			
			try {
				System.out.println();
				System.out.println("Select the Country Living from the DropDown");
	            WebElement countryTemp = driver.findElement(By.id("countryTemp"));
	            Thread.sleep(5000);
	            WebElement Albania = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 2, 10)+"']"));
	            WebElement Bangladesh = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 3, 10)+"']"));
	            WebElement India = driver.findElement(By.xpath("//*[text()='"+BaseTest2.getExcelsearchnep("Sheet1", 4, 10)+"']"));
	            acc.click(countryTemp);
	            acc.doubleClick(Albania).build().perform();
	            Thread.sleep(1000);
	            acc.doubleClick(Bangladesh).build().perform();
	            Thread.sleep(1000);
	            acc.doubleClick(India).build().perform();
	            Thread.sleep(1000);
	            System.out.println("Get all selected options");
	            WebElement country = driver.findElement(By.id("country"));
	            Select ctp = new Select(countryTemp);
	            Select cntry = new Select(country);
	            int ctpsize = ctp.getOptions().size();
	            int cysize = cntry.getOptions().size();
	            count = 0;
	            for (int i = 0; i < ctpsize; i++) 
	            {
					for (int j = 0; j < cysize; j++) 
					{
						if (ctp.getOptions().get(i).getText().equals(cntry.getOptions().get(j).getText())) 
						{
							System.out.println(ctp.getOptions().get(i).getText()+"  is visible on both the sides.");
							count++;
						}
					}
				}
	            if (count==0) 
	            {
	            	System.out.println("Nothing is visible on both the sides.");
				}
			} catch (Exception e) {
				System.out.println("Exception");
			}
			

//				///residence status//
//				
//				driver.findElement(By.id("residentStatus2")).click();
//				System.out.println("Permanent resident selected");
//				
				//anual income//
				
				driver.findElement(By.id("annualIncome")).click();
				Thread.sleep(5000);

			   BaseTest.select_text(driver.findElement(By.id("annualIncome")),BaseTest.exceladvancesearchnegative("Sheet1", 1, 17));
				//anual income to//
				Thread.sleep(5000);

				driver.findElement(By.id("annualIncome1")).click();

				Thread.sleep(5000);

			   BaseTest.select_text(driver.findElement(By.id("annualIncome1")),BaseTest.exceladvancesearchnegative("Sheet1", 1, 18));
				Thread.sleep(5000);
   System.out.println("anual income from is more than anual income to");
               String anualinc = driver.findElement(By.id("annerr")).getText();
                System.out.println("Anual income error = " + anualinc);
                
				Thread.sleep(5000);
				//age to second senario//
				
				driver.findElement(By.id("annualIncome")).click();
				Thread.sleep(5000);

			   BaseTest.select_text(driver.findElement(By.id("annualIncome")),BaseTest.exceladvancesearchnegative("Sheet1", 2, 17));
				//anual income to//
				Thread.sleep(5000);

				driver.findElement(By.id("annualIncome1")).click();

				Thread.sleep(5000);

			   BaseTest.select_text(driver.findElement(By.id("annualIncome1")),BaseTest.exceladvancesearchnegative("Sheet1", 2, 18));
				Thread.sleep(5000);
      		
			 
   System.out.println("anual income from is low and anual income to is high ");
                
                ///life style//
	
   Thread.sleep(5000);

            driver.findElement(By.id("eating2")).click();
            System.out.println("Non veg selected");
            
			Thread.sleep(5000);

			driver.findElement(By.id("drinking2")).click();
            System.out.println("Light/social drinker selected");
            
            Thread.sleep(5000);

			driver.findElement(By.id("smoking2")).click();
            System.out.println("Light/social Smoker selected");
            
            
            
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