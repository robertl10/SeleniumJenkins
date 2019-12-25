package testNG;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	WebDriver driver;
  @BeforeTest
  public void setUp() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe"); 
		 }
  @Test (priority=1)
  public void logIn() throws InterruptedException {
	  String url="https://www.edureka.co";
	  String handle;
	   driver = new ChromeDriver();
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
	  handle=driver.getWindowHandle();
	  System.out.println("Windows Handle1 "+handle);
	  driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header-breadcrumb/section/div/div/div[1]/span[2]/a")).click();
	  handle=driver.getWindowHandle();
	  System.out.println("Windows Handle2 "+handle);
	 // WebDriverWait wait= new WebDriverWait(driver, 10);
	  driver.findElement(By.xpath("//span[contains(text(),'Lonnie')]")).click();
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"header-II\\\"]/section/nav/div/ul[2]/li[2]/a")));
      //driver.findElement(By.xpath("//span[contains(text(),'Lonnie')]")).click();
	  //driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[2]/a")).click();
	  //driver.findElements(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[2]/ul/li[12]/a"));
	 // WebElement linkText= driver.findElement(By.linkText("Log Out"));
	  //System.out.println("Found It");
	  
  }
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }
}
