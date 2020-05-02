package matimony.matrimony.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class accountsettingsemailnegative extends BaseTest {
	int i = 1;
	String invalid;

	WebDriver driver;
	@BeforeMethod
	public void setup() throws MalformedURLException {
	

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\Desktop\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		driver = new ChromeDriver();

		
		}
	
	
	
	
	@Test
	public void setup6() throws Throwable {
		
		editppPOM g = new editppPOM(driver);
		Actions acc = new Actions(driver);
		//Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;

			
		Thread.sleep(3000);
		driver.get("https://www.pakistanimatrimony.com");

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "Pak755447");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "testpass");
		
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
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
			} catch (Exception e) {
				
			}
			
			Thread.sleep(10000);

			
			try {
				Robot robot = new Robot();
				robot.delay(5000);
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			
			Thread.sleep(5000);
           driver.findElement(By.xpath("//a[text()='Account Settings']")).click();
			Thread.sleep(5000);

			
			driver.findElement(By.xpath("//a[text()='Edit e-mail Address']")).click();
			Thread.sleep(5000);
			
			BaseTest.clear(g.getemailpass());
			Thread.sleep(5000);

			String one = "Srivijayaragavan30@gmail.com";
			BaseTest.typeData(g.getemailpass(),getExcelDatachangepassword("Sheet1", 1, 4));
			Thread.sleep(5000);
			
			BaseTest.click(g.getsavebtn());
			Thread.sleep(5000);

            String alredy = driver.findElement(By.xpath("//div[text()='You have already registered with this email Id']")).getText();
			Thread.sleep(5000);

			System.out.println(one+ " = " + alredy);
			
			///next//
			BaseTest.clear(g.getemailpass());
			Thread.sleep(5000);

			String two = "@gmail.com";
			
			BaseTest.typeData(g.getemailpass(),getExcelDatachangepassword("Sheet1", 2, 4));
			Thread.sleep(5000);
			BaseTest.click(g.getsavebtn());
			Thread.sleep(5000);

			  invalid = g.getemailfail().getText();
				Thread.sleep(5000);
				System.out.println(two+ " = " + invalid);

				///next//
				BaseTest.clear(g.getemailpass());
				Thread.sleep(5000);

				String three = "@gmail.com";
				
				BaseTest.typeData(g.getemailpass(),getExcelDatachangepassword("Sheet1", 3, 4));
				Thread.sleep(5000);
				BaseTest.click(g.getsavebtn());
				Thread.sleep(5000);

				  invalid = g.getemailfail().getText();
					Thread.sleep(5000);
					System.out.println(three+ " = " + invalid);
					
					///next//
					BaseTest.clear(g.getemailpass());
					Thread.sleep(5000);

					String four = "@gmail.com";
					
					BaseTest.typeData(g.getemailpass(),getExcelDatachangepassword("Sheet1", 4, 4));
					Thread.sleep(5000);
					BaseTest.click(g.getsavebtn());
					Thread.sleep(5000);

					  invalid = g.getemailfail().getText();
						Thread.sleep(5000);
						System.out.println(four+ " = " + invalid);
			
						///next//
						BaseTest.clear(g.getemailpass());
						Thread.sleep(5000);

						String five = "@gmail.com";
						
						BaseTest.typeData(g.getemailpass(),getExcelDatachangepassword("Sheet1", 5, 4));
						Thread.sleep(5000);
						BaseTest.click(g.getsavebtn());
						Thread.sleep(5000);

						  invalid = g.getemailfail().getText();
							Thread.sleep(5000);
							System.out.println(five+ " = " + invalid);
							
							///next//
							BaseTest.clear(g.getemailpass());
							Thread.sleep(5000);

							String six = "@gmail.com";
							
							BaseTest.typeData(g.getemailpass(),getExcelDatachangepassword("Sheet1", 6, 4));
							Thread.sleep(5000);
							BaseTest.click(g.getsavebtn());
							Thread.sleep(5000);

							  invalid = g.getemailfail().getText();
								Thread.sleep(5000);
								System.out.println(six+ " = " + invalid);
				
			
			
	}		
	}