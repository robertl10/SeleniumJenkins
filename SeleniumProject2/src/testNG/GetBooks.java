package testNG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;

@Listeners(testNG.ListenToMe.class)

public class GetBooks {
	
	
	
  @Test
  public void Login1() throws InterruptedException {
	  String url="https://www.edureka.co";
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	  driver.navigate().to(url);
	  System.out.println("Lauched Chrome browser with link "+url);
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
      
	  driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).sendKeys("robertl10@live.com");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"si_popup_passwd\"]")).sendKeys("lonnie10");
	  driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button")).click();
  }
  @Test		
  public void Login2()				
  {		
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://demo.guru99.com/V4/");					
      driver.findElement(By.name("uid")).sendKeys("mngr34926");							
      driver.findElement(By.name("password")).sendKeys("amUpenu");							
      driver.findElement(By.id("")).click();					
  }	
  @Test		
  public void TestToFail()				
  {		
      System.out.println("This method to test fail");					
      Assert.assertTrue(false);			
  }	
}
