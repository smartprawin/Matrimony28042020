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


public class accountsettingschangepasswordnegative extends BaseTest {
	int i = 1;
	String oldpasswerr;
	String newPasswordSpan;
	String conPasswordSpan;
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
		Robot r = new Robot();
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

			
			//////////one///
	           driver.findElement(By.xpath("//a[text()='Change Password']")).click();
				Thread.sleep(10000);
           
				
			BaseTest.clear(g.getoldpassword());
			Thread.sleep(3000);

			BaseTest.click(g.getchangePass());
			Thread.sleep(3000);

			oldpasswerr = driver.findElement(By.id("oldPasswordSpan")).getText();
		  
			Thread.sleep(3000);

			System.out.println("OldPassword without any character = " + oldpasswerr);
			
			
			//two//
			
			Thread.sleep(3000);

			BaseTest.clear(g.getoldpassword());
			Thread.sleep(3000);

			r.keyPress(KeyEvent.VK_TAB);	
	           Thread.sleep(2000);	
	           r.keyPress(KeyEvent.VK_ENTER);	
	           Thread.sleep(2000);	

	           r.keyRelease(KeyEvent.VK_ENTER);	

				Thread.sleep(3000);

			BaseTest.clear(g.getnewPassword());
			Thread.sleep(3000);

			BaseTest.click(g.getchangePass());
			Thread.sleep(3000);

		  newPasswordSpan = driver.findElement(By.id("newPasswordSpan")).getText();
		  
			Thread.sleep(3000);

			System.out.println("NewPassword without any character = " + newPasswordSpan);
			
			//three//
			
			Thread.sleep(3000);

			BaseTest.clear(g.getnewPassword());
			Thread.sleep(3000);

			r.keyPress(KeyEvent.VK_TAB);	
	           Thread.sleep(2000);	
	           r.keyPress(KeyEvent.VK_ENTER);	
	           Thread.sleep(2000);	

	           r.keyRelease(KeyEvent.VK_ENTER);	

				Thread.sleep(3000);
				

			BaseTest.click(g.getchangePass());
			Thread.sleep(3000);

		  conPasswordSpan = driver.findElement(By.xpath("//div[text()='Please enter the password to confirm']")).getText();
		  
			Thread.sleep(3000);

			System.out.println("ConfirmPassword without any character = " + conPasswordSpan);
			
			///four///
			Thread.sleep(3000);

			BaseTest.clear(g.getoldpassword());
			Thread.sleep(3000);

			BaseTest.typeData(g.getoldpassword(),getExcelDatachangepassword("Sheet1", 2, 0));
			Thread.sleep(3000);

			BaseTest.click(g.getchangePass());
			Thread.sleep(3000);

			String olderr = driver.findElement(By.xpath("//div[text()='Password must be a minimum of 4 characters']")).getText();
			Thread.sleep(3000);

			System.out.println("One letter password = " + olderr);
			
			//five
			Thread.sleep(3000);

           BaseTest.clear(g.getnewPassword());
			Thread.sleep(3000);

			BaseTest.typeData(g.getnewPassword(),getExcelDatachangepassword("Sheet1", 2, 0));
			Thread.sleep(3000);

			BaseTest.click(g.getchangePass());

			Thread.sleep(3000);
			
			String newerr = driver.findElement(By.xpath("//div[text()='Password must be a minimum of 6 characters']")).getText();
			Thread.sleep(3000);

			System.out.println("One letter password = " + newerr);
			
			
			//six
			
             BaseTest.clear(g.getconPassword());
 			Thread.sleep(3000);

			BaseTest.typeData(g.getconPassword(),getExcelDatachangepassword("Sheet1", 2, 0));
			Thread.sleep(3000);

			BaseTest.click(g.getchangePass());

			Thread.sleep(3000);
			
			String connewerr = driver.findElement(By.xpath("//div[text()='Password must be a minimum of 6 characters']")).getText();
			Thread.sleep(3000);

			System.out.println("One letter password = " + connewerr);
			
			//sven//
			
			
			Thread.sleep(3000);

	           BaseTest.clear(g.getnewPassword());
				Thread.sleep(3000);

				BaseTest.typeData(g.getnewPassword(),getExcelDatachangepassword("Sheet1", 2, 1));
				Thread.sleep(3000);
			
				String newpasswod = "abcedfg";
			
			System.out.println("Newpasswrd =  abcdefg"  );
			
			//eig
			
			Thread.sleep(3000);

	           BaseTest.clear(g.getconPassword());
				Thread.sleep(3000);

				BaseTest.typeData(g.getconPassword(),getExcelDatachangepassword("Sheet1", 2, 2));
				Thread.sleep(3000);
			
				String confirmapass = "abcedfg";
			
			System.out.println("confirmpassword =  abcdef"  );
			Thread.sleep(3000);

			String conf = driver.findElement(By.xpath("//div[text()='New password and confirm password must be same']")).getText();
			Thread.sleep(3000);

			System.out.println("Not same password message = " + conf);
			
			//nine
			
			
			BaseTest.clear(g.getoldpassword());
			Thread.sleep(3000);

			BaseTest.typeData(g.getoldpassword(), "cbstest");
			Thread.sleep(3000);

			
			//ten
			
			
			Thread.sleep(3000);

			BaseTest.clear(g.getnewPassword());
			Thread.sleep(3000);

			r.keyPress(KeyEvent.VK_SPACE);	
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_SPACE);	
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_SPACE);	
			r.keyRelease(KeyEvent.VK_SPACE);

			Thread.sleep(3000);

			BaseTest.click(g.getchangePass());
			Thread.sleep(3000);

			String newspace = driver.findElement(By.xpath("//div[text()='Please enter the new password']")).getText();
			Thread.sleep(3000);

			System.out.println("New Spacebar password = " + newspace);
			//elev//
			
			Thread.sleep(3000);

			BaseTest.clear(g.getconPassword());
			Thread.sleep(3000);

			r.keyPress(KeyEvent.VK_SPACE);	
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_SPACE);	
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_SPACE);	
			r.keyRelease(KeyEvent.VK_SPACE);

			Thread.sleep(3000);

			BaseTest.click(g.getchangePass());
			Thread.sleep(3000);

			String confspace = driver.findElement(By.xpath("//div[text()='Please enter the password to confirm']")).getText();
			Thread.sleep(3000);

			System.out.println("Confirm Spacebar password = " + confspace);
			
			
			
	}		
	}