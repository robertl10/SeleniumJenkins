package com.lonnie.selentest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EdurekaReg {

	public static void main(String[] args) throws InterruptedException {
		String url="https://www.edureka.co/signin";
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		  driver.navigate().to(url);
		  System.out.println("Lauched Chrome browser with link "+url);
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
	      
	      driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).click();
	      driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).sendKeys("robertl10@live.com");
	      driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).sendKeys(Keys.RETURN);
	      
	      driver.findElement(By.xpath("//*[@id=\"si_popup_passwd\"]")).click();
	      driver.findElement(By.xpath("//*[@id=\"si_popup_passwd\"]")).sendKeys("lonnie10");
	      
	      driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button")).click();
	      
	      Thread.sleep(5000);
	     // WebElement lonnie= driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[2]/a/span"));
	     // WebElement profile=driver.findElements(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[8]/div/button/span"));
	      //Actions action=new Actions(driver);
	      //action.moveToElement(lonnie).moveToElement(driver.findElements(By.linkText("My Profile"))).click().build().perform();
	      //action.moveToElement(lonnie).click();
	      //driver.findElement(By.xpath("//*[@id=\"devops-certification-courses\"]")).click();
	      //Thread.sleep(5000);
	      //driver.findElement(By.xpath("//*[@id=\"big-data-and-analytics\"]")).click();
	      //driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[2]/ul/li[4]/a")).click();
	      //List<WebElement> element= driver.findElements(By.name("My Profile"));
	     
	      System.out.println("pass list");
	      //Select myselect=new Select(element);
	    
	      System.out.println("The list ssize is ");
	     Thread.sleep(5000);
	     driver.quit();
	     driver.close();

	}

}
