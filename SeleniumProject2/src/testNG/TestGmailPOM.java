package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.gmailpomfact.ComposeGmail;
import com.gmailpomfact.GmailPOMlogin;

public class TestGmailPOM {
	
	WebDriver driver;
	ComposeGmail objcmpgmail;
	GmailPOMlogin objlogin;

  @BeforeTest
  public void setup() {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	
	//WebDriverWait wait=new WebDriverWait(driver, 30);
	driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
  }
  @Test
  public void TestLoginSendGmail() throws InterruptedException {
	  objlogin=new GmailPOMlogin(driver);
	  objlogin.loginGmailPOM();
	  Thread.sleep(10000);
	  objlogin.passwordinput();
	  objlogin.nextbutton();
	  objcmpgmail=new ComposeGmail(driver);
	  objcmpgmail.pcomposebutton();
	  objcmpgmail.precepient();
	  objcmpgmail.psubjectline();
	  objcmpgmail.pmymessage();
	  objcmpgmail.psendmessage();  
  }
  @AfterTest
  public void Logout() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.quit();
	  
  }
  
}
