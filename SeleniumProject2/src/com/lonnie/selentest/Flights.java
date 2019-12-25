package com.lonnie.selentest;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flights {
	
		
		public static void main(String[] args) {
			
			int obj1=500;
			 String url="https://www.goindigo.in/?linkNav=home_header";
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe"); 
			  WebDriver driver = new ChromeDriver();
			  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			  driver.navigate().to(url);
			  System.out.println("Lauched Chrome browser with link "+url);
			  driver.manage().window().maximize();
			  
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		      driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		      
		      JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeAsyncScript("windows.setTimeout(arguments[arguments.length - 1],obj1");
				System.out.println("0 was clicked");
				 driver.findElement(By.linkText("Book Flight")).click();
				 System.out.println("Book Flight was clicked");
				 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/div/div/div[4]/div[1]")).click();
				 System.out.println("1 was clicked");
				 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/input")).click();
				 System.out.println("2 was clicked");
				 WebDriverWait wait=new WebDriverWait(driver,20);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/div/div/div[69]/div[2]")));
				 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/div/div/div[69]/div[2]")).click();
				 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/div/div/div[69]/div[1]")).click();
				 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/div/div/div[69]/div[2]")).click();
		         driver.findElement(By.xpath("//*[@id=\"dp1572569249752\"]/div/div[1]/table/tbody/tr[1]/td[2]")).click();
				
			
		//@Test
		//public void browserSleep() {
			//WebDriver driver = new ChromeDriver();
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		js.executeAsyncScript("windows.setTimeout(arguments[arguments.length - 1],500);");
		System.out.println("0 was clicked");
		 driver.findElement(By.linkText("Book Flight")).click();
		 System.out.println("Book Flight was clicked");
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/div/div/div[4]/div[1]")).click();
		 System.out.println("1 was clicked");
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/input")).click();
		 System.out.println("2 was clicked");
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/div/div/div[69]/div[2]")));
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/div/div/div[69]/div[2]")).click();*/
		  //driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/div/div/div[69]/div[1]")).click();
		  //driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/div/div/div[69]/div[2]")).click();
          //driver.findElement(By.xpath("//*[@id=\"dp1572569249752\"]/div/div[1]/table/tbody/tr[1]/td[2]")).click();
		
	}

}
//}







