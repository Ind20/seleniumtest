package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/Asus/javaprojects/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		int i = 0;
		
		while(i<4)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(1000);
			i++;
		}
	    
		driver.findElement(By.id("btnclosepaxoption")).click();
	    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
