package com.ayantsoft.Selenium.webpage;

import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WebTable {


	@Test
	public void fun(){

		try{
			WebDriver driver = new FirefoxDriver();

			String baseUrl = "http://localhost:8080/seleniumUltimate/second";	
			driver.get(baseUrl);

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			System.out.println("ok"); 
			
					
			System.out.println(driver.findElement(By.xpath("//*[@id='items']/tbody/tr[3]/td[1]")).getText());

			List<WebElement>  columns =  driver.findElements(By.xpath("//*[@id='items']/tbody/tr/th"));
		      int columnCount = columns.size();
		      System.out.println("No of columns in a table : " + columnCount);
			
		      List<WebElement>  rows =  driver.findElements(By.xpath("//*[@id='items']/tbody/tr/td[1]"));
		      int rowCount = rows.size();
		      System.out.println("No of rows in a table : " + rowCount);
		
		      
		      for (int i =1;i<=rows.size();i++)
		        {    
		    	  
		    	 
		    			  String age=driver.findElement(By.xpath("//*[@id='items']/tbody/tr[" + (i+1)+ "]/td[2]")).getText();
		    			  
		        }
		       
			
		        
			//driver.quit();

		}catch(Exception ex){

		}
	}
}



