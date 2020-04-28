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


public class Search_Advancesearch extends BaseTest {
	Actions acc;
	String marital_statuswid;
	WebDriver driver;
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
		BaseTest.typeData(g.getMatriID(), "nep140707");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		
		Thread.sleep(3000);
		BaseTest.click(g.getLogin_btn());
		
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

			driver.findElement(By.xpath("(//a[@class='active'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Advanced']")).click();
			Thread.sleep(5000);
			
			Thread.sleep(5000);
			BaseTest.select_text(g.getageFrom(), BaseTest.getExcelDatasearch("Sheet1", 3, 1));
			Thread.sleep(5000);
			BaseTest.select_text(g.getageTo(), BaseTest.getExcelDatasearch("Sheet1", 3, 2));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightFrom")), BaseTest.getExcelDatasearch("Sheet1", 3, 3));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightTo")), BaseTest.getExcelDatasearch("Sheet1", 3, 4));
			Thread.sleep(5000);
			
			
			String marital_status = BaseTest.getExcelDatasearch("Sheet1", 3, 0);
			if (marital_status.contains("Unmarried")&&!g.getunmarried().isEnabled()) {
				 BaseTest.click(g.getunmarried());
				 System.out.println("unmarried selected");
				 Thread.sleep(5000);

				}
			
			marital_statuswid = BaseTest.getExcelDatasearch("Sheet1", 3, 23);

			if (marital_statuswid.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
					 BaseTest.click(g.getwidow());
					 System.out.println("widow selected");
					 
					 marital_statusdiv = BaseTest.getExcelDatasearch("Sheet1", 3, 24);

				} if (marital_statusdiv.contains("Divorced")&&!g.getdivorced().isSelected()) {
					 BaseTest.click(g.getdivorced());
					 System.out.println("divorced selected");
					 
					// marital_statusany = BaseTest.getExcelDatasearch("Sheet1", 1, 25);

				//} if (marital_statusany.contains("Any")&&!g.getany().isSelected()) {
					// BaseTest.click(g.getany());
					 //System.out.println("Any selected");
					 

				}
				try {
					 marital_statussep = BaseTest.getExcelDatasearch("Sheet1", 3, 25);

						if (marital_statussep.contains("Separated")&&!g.getseprated().isSelected()) {
							 BaseTest.click(g.getseprated());
							 System.out.println("seprated selected");
						}else {
							
						}	
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			 	
				Thread.sleep(5000);
			/// children//
				try {
					String children = BaseTest.getExcelDatasearch("Sheet1", 3, 26);
					if (children.contains("No")&&!g.gethaveChildren1().isSelected()) {
						 BaseTest.click(g.gethaveChildren1());
						 System.out.println("No children selected");
						 
							
						}else if (children.contains("Yes, Living together")&&!g.gethaveChildren2().isSelected()) {
							 BaseTest.click(g.gethaveChildren2());
							 System.out.println("Yes, Living together selected");
							 
						}else if (children.contains("Yes, Not living together")&&!g.gethaveChildren3().isSelected()) {
							 BaseTest.click(g.gethaveChildren3());
							 System.out.println("Yes, Not living together  selected");
							 
						}else if (children.contains("Doesn't matter")&&!g.gethaveChildren4().isSelected()) {
							 BaseTest.click(g.gethaveChildren4());
							 System.out.println("Profiles i have blocked selected");
						}else {
							
						}				
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			///----
		        //pak

				try {
					BaseTest.select_text(g.getreli(), BaseTest.getExcelDatasearch("Sheet1", 3, 21));

					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				///clan for pak and bran/den for sri//
				driver.findElement(By.id("casteTemp"));
				
				try {
		        	WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 3, 22)+"']"));
		    		
		    		//acc.contextClick(ele).perform();
		    		acc.doubleClick(ele).perform();
				} catch (Exception e) {
					System.out.println("ele");
				}
				
				Thread.sleep(5000);

				 try {
		        	 WebElement button = driver.findElement(By.id("motherTongueTemp"));
		             JavascriptExecutor jse = (JavascriptExecutor)driver;
		             jse.executeScript("arguments[0].scrollintoView(true)", button);
				} catch (Exception e) {
					// TODO: handle exception
				}
					Thread.sleep(5000);

			///mother tounge////
				
				driver.findElement(By.id("motherTongueTemp")).click();
				Thread.sleep(5000);
		        try {
		        	WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 3, 6)+"']"));
		    		
		    		//acc.contextClick(ele).perform();
		    		acc.doubleClick(ele).perform();
				} catch (Exception e) {
					System.out.println("ele");
				}
		        
		        
		        
			
			
			///phy status///
			Thread.sleep(5000);

			String physicalstatus = BaseTest.getExcelDatasearch("Sheet1", 3, 5);
			if (physicalstatus.contains("Doesn't matter")&&!g.getphysicaldsntm().isSelected()) {
				 BaseTest.click(g.getphysicaldsntm());
				 System.out.println("physical status doesntmatter selected");
				 
					
				}else if (physicalstatus.contains("Normal")&&!g.getphyscialnorma().isSelected()) {
					 BaseTest.click(g.getphyscialnorma());
					 System.out.println("Physical status normal selected");
					 
				}else if (physicalstatus.contains("Physically Challenged")&&!g.getphysicalphychangleed().isSelected()) {
					 BaseTest.click(g.getphysicalphychangleed());
					 System.out.println("Physically Challenged  selected");
					 
				}else {
					
				}
			
			
			try {
				
				Thread.sleep(5000);

				driver.findElement(By.id("gothram")).sendKeys("Testgothram");
			
			Thread.sleep(5000);
			driver.findElement(By.id("starTemp")).click();
			Thread.sleep(5000);
			
            WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 3, 14)+"']"));
    		
    		acc.doubleClick(ele).perform();
		    
             
			///manglik///
			Thread.sleep(5000);

				

			String manglik = BaseTest.getExcelDatasearch("Sheet1", 3, 7);
			if (manglik.contains("Doesn't matter")&&!g.getdoshamfield().isSelected()) {
				 BaseTest.click(g.getdoshamfield());
				 System.out.println("manglik doesntmatter selected");
				 
					
				}else if (manglik.contains("Yes")&&!g.getdoshamyes().isSelected()) {
					 BaseTest.click(g.getdoshamyes());
					 System.out.println("Manglik yes selected");
					 
				}else if (manglik.contains("No")&&!g.getdoshamno().isSelected()) {
					 BaseTest.click(g.getdoshamno());
					 System.out.println("Manglik no  selected");
					 
				}else {
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			Thread.sleep(5000);

			 try {
	        	 WebElement button = driver.findElement(By.id("countryTemp"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			///
				Thread.sleep(5000);

			driver.findElement(By.id("countryTemp")).click();
			Thread.sleep(5000);
			
            WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 3, 13)+"']"));
    		
    		acc.doubleClick(ele).perform();
		    
             
			//////resident status////
			Thread.sleep(5000);

			
			String RS4 = BaseTest.getExcelDatasearch("Sheet1", 3, 15);
			if (RS4.contains("Any")&&!g.getrsany().isSelected()) {
				 BaseTest.click(g.getrsany());
				 System.out.println("Resident status any selected");
				 
					
				}else if (RS4.contains("citizen")&&!g.getrscitizen().isSelected()) {
					 BaseTest.click(g.getrscitizen());
					 System.out.println("Resident status citizen selected");
					 
				}else if (RS4.contains("Permanent resident")&&!g.getrspr().isSelected()) {
					 BaseTest.click(g.getrspr());
					 System.out.println("Resident status  Permanent resident selected");
					 
				}else if (RS4.contains("Work permit")&&!g.getrswp().isSelected()) {
					 BaseTest.click(g.getrswp());
					 System.out.println("Resident status work permit  selected");
					 
				}else if (RS4.contains("student visa")&&!g.getrssv().isSelected()) {
					 BaseTest.click(g.getrssv());
					 System.out.println("Resident status student vise  selected");
					 
				}else if (RS4.contains("Temporary visa")&&!g.getrstv().isSelected()) {
					 BaseTest.click(g.getrstv());
					 System.out.println("Resident status temporary vise  selected");
					 
				}else {
					
				}
			
			Thread.sleep(5000);
			
			//
			 try {
	        	 WebElement button = driver.findElement(By.id("educationTemp"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}

				Thread.sleep(5000);

			driver.findElement(By.id("educationTemp")).click();
			Thread.sleep(5000);
	       
	        	WebElement edu = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 3, 8)+"']"));
	    		
	    		acc.doubleClick(edu).perform();
			
			
			
				Thread.sleep(5000);
				
				
				driver.findElement(By.id("occupationTemp")).click();
				Thread.sleep(5000);
		       
		        	WebElement ocu = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 3, 9)+"']"));
		    		
		    		acc.doubleClick(ocu).perform();
				
					Thread.sleep(5000);

           
			// anualincome//
					try {
						BaseTest.select_text(g.getanualincome(), BaseTest.getExcelDatasearch("Sheet1", 3, 16));

					} catch (Exception e) {
						// TODO: handle exception
					}
					
					try {
						BaseTest.select_text(g.getanualincome(), BaseTest.getExcelDatasearch("Sheet1", 3, 42));

					} catch (Exception e) {
						// TODO: handle exception
					}
					
					
			Thread.sleep(5000);

			 try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Lifestyle']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
				Thread.sleep(5000);

		/// food style///
			
			String foodhabit = BaseTest.getExcelDatasearch("Sheet1", 3, 32);
			if (foodhabit.contains("Vegetarian")&&!g.geteatingHabits1().isSelected()) {
				 BaseTest.click(g.geteatingHabits1());
				 System.out.println("veg selected");
				 
					
				}
			
			String foodhabit5 = BaseTest.getExcelDatasearch("Sheet1", 3, 33);

			if (foodhabit5.contains("Non vegetarian")&&!g.geteatingHabits2().isSelected()) {
					 BaseTest.click(g.geteatingHabits2());
					 System.out.println("Non veg selected");
					 
				}
			
			if (foodhabit.contains("Any")&&!g.geteatingHabits0().isSelected()) {
					 BaseTest.click(g.geteatingHabits0());
					 System.out.println("foodhabit doesnt matter selected");
					 
				}
			
			if (foodhabit.contains("Eggetarian")&&!g.geteatingHabits3().isSelected()) {
					 BaseTest.click(g.geteatingHabits3());
					 System.out.println("egg selected");
					 
				}
			
			if (foodhabit.contains("Vegan")&&!g.geteatingHabits4().isSelected()) {
					 BaseTest.click(g.geteatingHabits4());
					 System.out.println("vegan selected");
					 
				}else {
					
				}
			
			Thread.sleep(5000);

			
			String drinkinghabit = BaseTest.getExcelDatasearch("Sheet1", 3, 18);
			if (drinkinghabit.contains("Non-drinker")&&!g.getdrinking1().isSelected()) {
				 BaseTest.click(g.getdrinking1());
				 System.out.println("non drinker selected");
				 
					
				}
			
			
			
			String drinkinghabit5 = BaseTest.getExcelDatasearch("Sheet1", 3, 37);

			if (drinkinghabit5.contains("Light / Social drinker")&&!g.getdrinking2().isSelected()) {
					 BaseTest.click(g.getdrinking2());
					 System.out.println("light/social drinker selected");
					 
				}if (drinkinghabit5.contains("Any")&&!g.getdrinking0().isSelected()) {
					 BaseTest.click(g.getdrinking0());
					 System.out.println("drinker any selected");
					 
				}if (drinkinghabit5.contains("Regular drinker")&&!g.getdrinking3().isSelected()) {
					 BaseTest.click(g.getdrinking3());
					 System.out.println("Regular drinker selected");
					 
				}else {
					
				}
			//
				Thread.sleep(5000);

				try {
		        	 WebElement button = driver.findElement(By.xpath("//div[text()='Lifestyle']"));
		             JavascriptExecutor jse = (JavascriptExecutor)driver;
		             jse.executeScript("arguments[0].scrollintoView(true)", button);
				} catch (Exception e) {
					// TODO: handle exception
				}
				Thread.sleep(5000);

			
			String smokehabit = BaseTest.getExcelDatasearch("Sheet1", 3, 19);
			if (smokehabit.contains("Non-smoker")&&!g.getsmoking1().isSelected()) {
				 BaseTest.click(g.getsmoking1());
				 System.out.println("non smoker selected");
				 
					
				}
			String smokehabit5 = BaseTest.getExcelDatasearch("Sheet1", 3, 38);

			if (smokehabit5.contains("Light / Social smoker")&&!g.getsmoking2().isSelected()) {
					 BaseTest.click(g.getsmoking2());
					 System.out.println("light/social smoker selected");
					 
				}if (smokehabit.contains("Any")&&!g.getsmoking0().isSelected()) {
					 BaseTest.click(g.getsmoking0());
					 System.out.println("smoker doesnt matter selected");
					 
				}if (smokehabit.contains("Regular smoker")&&!g.getsmoking3().isSelected()) {
					 BaseTest.click(g.getsmoking3());
					 System.out.println("Regular smoker selected");
					 
				}else {
					
				}
			
				Thread.sleep(5000);

			
			String shwoprofileadv = BaseTest.getExcelDatasearch("Sheet1", 3, 11);
			if (shwoprofileadv.contains("photo")&&!g.getphotoOpt().isSelected()) {
				 BaseTest.click(g.getphotoOpt());
				 System.out.println("photo selected");
				 
					
				}
			
			String shwoprofileadvhor = BaseTest.getExcelDatasearch("Sheet1", 3, 31);

			if (shwoprofileadvhor.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
					 BaseTest.click(g.gethoroscopeOpt());
					 System.out.println("horoscope selected");
					 
				}else {
					
				}
			
			///dont show//
			Thread.sleep(5000);

			
			String dnotshows = BaseTest.getExcelDatasearch("Sheet1", 3, 12);
			if (dnotshows.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
				 BaseTest.click(g.getalreadyContOpt());
				 System.out.println("profile already contacted selected");
				 
					
				}
			
			if (dnotshows.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
					 BaseTest.click(g.getalreadyViewedOpt());
					 System.out.println("Profiles already viewed selected");
					 
				}
			
			if (dnotshows.contains("Shortlisted profiles ")&&!g.getshortlistOpt().isSelected()) {
					 BaseTest.click(g.getshortlistOpt());
					 System.out.println("Shortlisted profiles  selected");
					 
				}
			
			if (dnotshows.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
					 BaseTest.click(g.getignoredOpt());
					 System.out.println("Profiles i have blocked selected");
				}
			
			if (dnotshows.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
					 BaseTest.click(g.getigOpt());
					 System.out.println("Profiles i have ignored selected");
				}else {
					
				}		
			Thread.sleep(5000);

			
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			Thread.sleep(10000);
			
			
			
			/////// modify search second////
			
			try {
				Thread.sleep(10000);
				
				WebElement agefrom =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
				String age = agefrom.getText();
				System.out.println("Age  = " + age);
				String[] split3 = age.split(" yrs");
				int ageis = Integer.parseInt(split3[0]);
				System.out.println("ageis:" + ageis);


				int agefro = 22;
				
				int ageto = 29;
				
				if (agefro<=ageis && ageis>=ageto) {
					System.out.println("age matched");
					
					
				}else {
					System.out.println("age not matched");
				}
				
					

				WebElement heigh =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
				String height = heigh.getText();
				System.out.println("height  = " + height);
				String[] split35 = age.split(",");
				String[] split351 = age.split(" ft");

				int heights = Integer.parseInt(split351[0]);
				System.out.println("heights:" + heights);
				
				int heighfrom = 4;
	            int heighto = 5;
	            
	            if (heighfrom<=heights && heights>=heighto) {
					System.out.println("height matched");
					
					
				}else {
					System.out.println("height not matched");
				}
	            
	            
			} catch (Exception e) {
				// TODO: handle exception
			}
				try {
					//religon//
					
					String religion = driver.findElement(By.xpath("(//span[@class='input-data'])[2]")).getText();
					System.out.println("location = " + religion);
					if (religion.equalsIgnoreCase(BaseTest.getExcelDatasearch("Sheet1", 1, 21))) {
						
					}
				
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				try {
					//clan//
					
					String religion = driver.findElement(By.xpath("(//span[@class='input-data'])[3]")).getText();
					System.out.println("location = " + religion);
					if (religion.equalsIgnoreCase(BaseTest.getExcelDatasearch("Sheet1", 1, 22))) {
						
					}
				
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			
			
			
			
			if (driver.findElement(By.xpath("//input[@value='Modify Search']")).isDisplayed()) {
				
				driver.findElement(By.xpath("//a[text()='Search']")).click();
				
				driver.findElement(By.xpath("//a[text()='Advanced']")).click();
				Thread.sleep(5000);
				
									
					Thread.sleep(5000);

					driver.findElement(By.xpath("(//a[@class='active'])[1]")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//a[text()='Advanced']")).click();
					Thread.sleep(5000);
					
					Thread.sleep(5000);
					BaseTest.select_text(g.getageFrom(), BaseTest.getExcelDatasearch("Sheet1", 4, 1));
					Thread.sleep(5000);
					BaseTest.select_text(g.getageTo(), BaseTest.getExcelDatasearch("Sheet1", 4, 2));
					Thread.sleep(5000);
					BaseTest.select_text(driver.findElement(By.id("heightFrom")), BaseTest.getExcelDatasearch("Sheet1", 4, 3));
					Thread.sleep(5000);
					BaseTest.select_text(driver.findElement(By.id("heightTo")), BaseTest.getExcelDatasearch("Sheet1", 4, 4));
					Thread.sleep(5000);
					
					
					String marital_status4 = BaseTest.getExcelDatasearch("Sheet1", 4, 0);
					if (marital_status4.contains("Unmarried")&&!g.getunmarried().isEnabled()) {
						 BaseTest.click(g.getunmarried());
						 System.out.println("unmarried selected");
						 Thread.sleep(5000);

						}
					
					marital_statuswid = BaseTest.getExcelDatasearch("Sheet1", 4, 23);

					if (marital_statuswid.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
							 BaseTest.click(g.getwidow());
							 System.out.println("widow selected");
							 
							 marital_statusdiv = BaseTest.getExcelDatasearch("Sheet1", 4, 24);

						} if (marital_statusdiv.contains("Divorced")&&!g.getdivorced().isSelected()) {
							 BaseTest.click(g.getdivorced());
							 System.out.println("divorced selected");
							 
							// marital_statusany = BaseTest.getExcelDatasearch("Sheet1", 1, 25);

						//} if (marital_statusany.contains("Any")&&!g.getany().isSelected()) {
							// BaseTest.click(g.getany());
							 //System.out.println("Any selected");
							 

						}
						try {
							 marital_statussep = BaseTest.getExcelDatasearch("Sheet1", 4, 25);

								if (marital_statussep.contains("Separated")&&!g.getseprated().isSelected()) {
									 BaseTest.click(g.getseprated());
									 System.out.println("seprated selected");
								}else {
									
								}	
						} catch (Exception e) {
							// TODO: handle exception
						}
						
					 	
						Thread.sleep(5000);
					/// children//
						try {
							String children = BaseTest.getExcelDatasearch("Sheet1", 4, 26);
							if (children.contains("No")&&!g.gethaveChildren1().isSelected()) {
								 BaseTest.click(g.gethaveChildren1());
								 System.out.println("No children selected");
								 
									
								}else if (children.contains("Yes, Living together")&&!g.gethaveChildren2().isSelected()) {
									 BaseTest.click(g.gethaveChildren2());
									 System.out.println("Yes, Living together selected");
									 
								}else if (children.contains("Yes, Not living together")&&!g.gethaveChildren3().isSelected()) {
									 BaseTest.click(g.gethaveChildren3());
									 System.out.println("Yes, Not living together  selected");
									 
								}else if (children.contains("Doesn't matter")&&!g.gethaveChildren4().isSelected()) {
									 BaseTest.click(g.gethaveChildren4());
									 System.out.println("Profiles i have blocked selected");
								}else {
									
								}				
							
						} catch (Exception e) {
							// TODO: handle exception
						}
					///----
				        //pak

						try {
							BaseTest.select_text(g.getreli(), BaseTest.getExcelDatasearch("Sheet1", 4, 21));

							
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						
						///clan for pak and bran/den for sri//
						driver.findElement(By.id("casteTemp"));
						
						try {
				        	WebElement elel1 = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 4, 22)+"']"));
				    		
				    		//acc.contextClick(ele).perform();
				    		acc.doubleClick(elel1).perform();
						} catch (Exception e) {
							System.out.println("elel1");
						}
						
						Thread.sleep(5000);

						 try {
				        	 WebElement button = driver.findElement(By.id("motherTongueTemp"));
				             JavascriptExecutor jse = (JavascriptExecutor)driver;
				             jse.executeScript("arguments[0].scrollintoView(true)", button);
						} catch (Exception e) {
							// TODO: handle exception
						}
							Thread.sleep(5000);

					///mother tounge////
						
						driver.findElement(By.id("motherTongueTemp")).click();
						Thread.sleep(5000);
				        try {
				        	WebElement eleb = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 4, 6)+"']"));
				    		
				    		//acc.contextClick(ele).perform();
				    		acc.doubleClick(eleb).perform();
						} catch (Exception e) {
							System.out.println("eleb");
						}
				        
				        
				        
					
					
					///phy status///
					Thread.sleep(5000);

					String physicalstatus4 = BaseTest.getExcelDatasearch("Sheet1", 4, 5);
					if (physicalstatus4.contains("Doesn't matter")&&!g.getphysicaldsntm().isSelected()) {
						 BaseTest.click(g.getphysicaldsntm());
						 System.out.println("physical status doesntmatter selected");
						 
							
						}else if (physicalstatus4.contains("Normal")&&!g.getphyscialnorma().isSelected()) {
							 BaseTest.click(g.getphyscialnorma());
							 System.out.println("Physical status normal selected");
							 
						}else if (physicalstatus4.contains("Physically Challenged")&&!g.getphysicalphychangleed().isSelected()) {
							 BaseTest.click(g.getphysicalphychangleed());
							 System.out.println("Physically Challenged  selected");
							 
						}else {
							
						}
					
					
					try {
						
						Thread.sleep(5000);

						driver.findElement(By.id("gothram")).sendKeys("Testgothram");
					
					Thread.sleep(5000);
					driver.findElement(By.id("starTemp")).click();
					Thread.sleep(5000);
					
		            WebElement ele4 = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 4, 14)+"']"));
		    		
		    		acc.doubleClick(ele4).perform();
				    
		             
					///manglik///
					Thread.sleep(5000);

						

					String manglik = BaseTest.getExcelDatasearch("Sheet1", 4, 7);
					if (manglik.contains("Doesn't matter")&&!g.getdoshamfield().isSelected()) {
						 BaseTest.click(g.getdoshamfield());
						 System.out.println("manglik doesntmatter selected");
						 
							
						}else if (manglik.contains("Yes")&&!g.getdoshamyes().isSelected()) {
							 BaseTest.click(g.getdoshamyes());
							 System.out.println("Manglik yes selected");
							 
						}else if (manglik.contains("No")&&!g.getdoshamno().isSelected()) {
							 BaseTest.click(g.getdoshamno());
							 System.out.println("Manglik no  selected");
							 
						}else {
							
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					Thread.sleep(5000);

					 try {
			        	 WebElement button = driver.findElement(By.id("countryTemp"));
			             JavascriptExecutor jse = (JavascriptExecutor)driver;
			             jse.executeScript("arguments[0].scrollintoView(true)", button);
					} catch (Exception e) {
						// TODO: handle exception
					}
					///
						Thread.sleep(5000);

					driver.findElement(By.id("countryTemp")).click();
					Thread.sleep(5000);
					
		            WebElement eles = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 4, 13)+"']"));
		    		
		    		acc.doubleClick(eles).perform();
				    
		             
					//////resident status////
					Thread.sleep(5000);

					
					String RS = BaseTest.getExcelDatasearch("Sheet1", 4, 15);
					if (RS.contains("Any")&&!g.getrsany().isSelected()) {
						 BaseTest.click(g.getrsany());
						 System.out.println("Resident status any selected");
						 
							
						}else if (RS.contains("citizen")&&!g.getrscitizen().isSelected()) {
							 BaseTest.click(g.getrscitizen());
							 System.out.println("Resident status citizen selected");
							 
						}else if (RS.contains("Permanent resident")&&!g.getrspr().isSelected()) {
							 BaseTest.click(g.getrspr());
							 System.out.println("Resident status  Permanent resident selected");
							 
						}else if (RS.contains("Work permit")&&!g.getrswp().isSelected()) {
							 BaseTest.click(g.getrswp());
							 System.out.println("Resident status work permit  selected");
							 
						}else if (RS.contains("student visa")&&!g.getrssv().isSelected()) {
							 BaseTest.click(g.getrssv());
							 System.out.println("Resident status student vise  selected");
							 
						}else if (RS.contains("Temporary visa")&&!g.getrstv().isSelected()) {
							 BaseTest.click(g.getrstv());
							 System.out.println("Resident status temporary vise  selected");
							 
						}else {
							
						}
					
					Thread.sleep(5000);
					
					//
					 try {
			        	 WebElement button = driver.findElement(By.id("educationTemp"));
			             JavascriptExecutor jse = (JavascriptExecutor)driver;
			             jse.executeScript("arguments[0].scrollintoView(true)", button);
					} catch (Exception e) {
						// TODO: handle exception
					}

						Thread.sleep(5000);

					driver.findElement(By.id("educationTemp")).click();
					Thread.sleep(5000);
			       
			        	WebElement eduj = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 4, 8)+"']"));
			    		
			    		acc.doubleClick(eduj).perform();
					
					
					
						Thread.sleep(5000);
						
						
						driver.findElement(By.id("occupationTemp")).click();
						Thread.sleep(5000);
				       
			    	WebElement ocu4 = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 4, 9)+"']"));
				    		
				    		acc.doubleClick(ocu4).perform();
						
							Thread.sleep(5000);

		           
					// anualincome//
							try {
								BaseTest.select_text(g.getanualincome(), BaseTest.getExcelDatasearch("Sheet1", 4, 16));

							} catch (Exception e) {
								// TODO: handle exception
							}
							
							try {
								BaseTest.select_text(g.getanualincome(), BaseTest.getExcelDatasearch("Sheet1", 4, 40));

							} catch (Exception e) {
								// TODO: handle exception
							}
							
							
					Thread.sleep(5000);

					 try {
			        	 WebElement button = driver.findElement(By.xpath("//div[text()='Lifestyle']"));
			             JavascriptExecutor jse = (JavascriptExecutor)driver;
			             jse.executeScript("arguments[0].scrollintoView(true)", button);
					} catch (Exception e) {
						// TODO: handle exception
					}
						Thread.sleep(5000);

				/// food style///
					
					String foodhabit4 = BaseTest.getExcelDatasearch("Sheet1", 4, 32);
					if (foodhabit4.contains("Vegetarian")&&!g.geteatingHabits1().isSelected()) {
						 BaseTest.click(g.geteatingHabits1());
						 System.out.println("veg selected");
						 
							
						}
					
					String foodhabit54= BaseTest.getExcelDatasearch("Sheet1", 4, 33);

					if (foodhabit54.contains("Non vegetarian")&&!g.geteatingHabits2().isSelected()) {
							 BaseTest.click(g.geteatingHabits2());
							 System.out.println("Non veg selected");
							 
						}
					
					if (foodhabit.contains("Any")&&!g.geteatingHabits0().isSelected()) {
							 BaseTest.click(g.geteatingHabits0());
							 System.out.println("foodhabit doesnt matter selected");
							 
						}
					
					if (foodhabit.contains("Eggetarian")&&!g.geteatingHabits3().isSelected()) {
							 BaseTest.click(g.geteatingHabits3());
							 System.out.println("egg selected");
							 
						}
					
					if (foodhabit.contains("Vegan")&&!g.geteatingHabits4().isSelected()) {
							 BaseTest.click(g.geteatingHabits4());
							 System.out.println("vegan selected");
							 
						}else {
							
						}
					
					Thread.sleep(5000);

					
					String drinkinghabit4 = BaseTest.getExcelDatasearch("Sheet1", 4, 18);
					if (drinkinghabit.contains("Non-drinker")&&!g.getdrinking1().isSelected()) {
						 BaseTest.click(g.getdrinking1());
						 System.out.println("non drinker selected");
						 
							
						}
					
					
					
					String drinkinghabit54 = BaseTest.getExcelDatasearch("Sheet1", 4, 37);

					if (drinkinghabit54.contains("Light / Social drinker")&&!g.getdrinking2().isSelected()) {
							 BaseTest.click(g.getdrinking2());
							 System.out.println("light/social drinker selected");
							 
						}if (drinkinghabit54.contains("Any")&&!g.getdrinking0().isSelected()) {
							 BaseTest.click(g.getdrinking0());
							 System.out.println("drinker any selected");
							 
						}if (drinkinghabit54.contains("Regular drinker")&&!g.getdrinking3().isSelected()) {
							 BaseTest.click(g.getdrinking3());
							 System.out.println("Regular drinker selected");
							 
						}else {
							
						}
					//
						Thread.sleep(5000);

						try {
				        	 WebElement button = driver.findElement(By.xpath("//div[text()='Lifestyle']"));
				             JavascriptExecutor jse = (JavascriptExecutor)driver;
				             jse.executeScript("arguments[0].scrollintoView(true)", button);
						} catch (Exception e) {
							// TODO: handle exception
						}
						Thread.sleep(5000);

					
					String smokehabit4 = BaseTest.getExcelDatasearch("Sheet1", 4, 19);
					if (smokehabit4.contains("Non-smoker")&&!g.getsmoking1().isSelected()) {
						 BaseTest.click(g.getsmoking1());
						 System.out.println("non smoker selected");
						 
							
						}
					String smokehabit54 = BaseTest.getExcelDatasearch("Sheet1", 4, 38);

					if (smokehabit54.contains("Light / Social smoker")&&!g.getsmoking2().isSelected()) {
							 BaseTest.click(g.getsmoking2());
							 System.out.println("light/social smoker selected");
							 
						}if (smokehabit.contains("Any")&&!g.getsmoking0().isSelected()) {
							 BaseTest.click(g.getsmoking0());
							 System.out.println("smoker doesnt matter selected");
							 
						}if (smokehabit.contains("Regular smoker")&&!g.getsmoking3().isSelected()) {
							 BaseTest.click(g.getsmoking3());
							 System.out.println("Regular smoker selected");
							 
						}else {
							
						}
					
						Thread.sleep(5000);

					
					String shwoprofileadv4 = BaseTest.getExcelDatasearch("Sheet1", 4, 11);
					if (shwoprofileadv4.contains("photo")&&!g.getphotoOpt().isSelected()) {
						 BaseTest.click(g.getphotoOpt());
						 System.out.println("photo selected");
						 
							
						}
					
					String shwoprofileadvhor4 = BaseTest.getExcelDatasearch("Sheet1", 4, 31);

					if (shwoprofileadvhor4.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
							 BaseTest.click(g.gethoroscopeOpt());
							 System.out.println("horoscope selected");
							 
						}else {
							
						}
					
					///dont show//
					Thread.sleep(5000);

					
					String dnotshows4 = BaseTest.getExcelDatasearch("Sheet1", 4, 12);
					if (dnotshows4.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
						 BaseTest.click(g.getalreadyContOpt());
						 System.out.println("profile already contacted selected");
						 
							
						}
					
					if (dnotshows.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
							 BaseTest.click(g.getalreadyViewedOpt());
							 System.out.println("Profiles already viewed selected");
							 
						}
					
					if (dnotshows.contains("Shortlisted profiles ")&&!g.getshortlistOpt().isSelected()) {
							 BaseTest.click(g.getshortlistOpt());
							 System.out.println("Shortlisted profiles  selected");
							 
						}
					
					if (dnotshows.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
							 BaseTest.click(g.getignoredOpt());
							 System.out.println("Profiles i have blocked selected");
						}
					
					if (dnotshows.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
							 BaseTest.click(g.getigOpt());
							 System.out.println("Profiles i have ignored selected");
						}else {
							
						}		
					Thread.sleep(5000);

					
					
					driver.findElement(By.xpath("//input[@value='Search']")).click();
					Thread.sleep(10000);
					try {
						driver.findElement(By.xpath("//input[@value='Search']")).click();
						Thread.sleep(10000);
						
						
						try {
							Thread.sleep(10000);
							
							WebElement agefrom =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
							String age = agefrom.getText();
							System.out.println("Age  = " + age);
							String[] split3 = age.split(" yrs");
							int ageis = Integer.parseInt(split3[0]);
							System.out.println("ageis:" + ageis);


							int agefro = 22;
							
							int ageto = 29;
							
							if (agefro<=ageis && ageis>=ageto) {
								System.out.println("age matched");
								
								
							}else {
								System.out.println("age not matched");
							}
							
								

							WebElement heigh =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
							String height = heigh.getText();
							System.out.println("height  = " + height);
							String[] split35 = age.split(",");
							String[] split351 = age.split(" ft");

							int heights = Integer.parseInt(split351[0]);
							System.out.println("heights:" + heights);
							
							int heighfrom = 4;
				            int heighto = 5;
				            
				            if (heighfrom<=heights && heights>=heighto) {
								System.out.println("height matched");
								
								
							}else {
								System.out.println("height not matched");
							}
				            
				            
						} catch (Exception e) {
							// TODO: handle exception
						}
							try {
								//religon//
								
								String religion = driver.findElement(By.xpath("(//span[@class='input-data'])[2]")).getText();
								System.out.println("location = " + religion);
								if (religion.equalsIgnoreCase(BaseTest.getExcelDatasearch("Sheet1", 3, 21))) {
									
								}
							
								
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							
							try {
								//clan//
								
								String religion = driver.findElement(By.xpath("(//span[@class='input-data'])[3]")).getText();
								System.out.println("location = " + religion);
								if (religion.equalsIgnoreCase(BaseTest.getExcelDatasearch("Sheet1", 3, 22))) {
									
								}
							
								
							} catch (Exception e) {
								// TODO: handle exception
							}
					} catch (Exception e) {
						// TODO: handle exception
					}
					

			
			//////advance search end///
			
			
			
			
			
			
	}


	}

	
}