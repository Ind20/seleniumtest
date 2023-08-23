package org.practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	public static void main(String[] args)throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// visit site
		driver.get("https://www.myntra.com/");
		// search for shoes
		driver.findElement(By.className("desktop-searchBar")).sendKeys("shoes");
		Thread.sleep(2000);
		// 
		driver.findElement(By.className("desktop-submit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@title='U.S. Polo Assn. Men White Clarkin Sneakers']")).click();
		Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        
        driver.findElement(By.className("desktop-searchBar")).sendKeys("shoes");
        
        driver.findElement(By.xpath("//div[3]//div[1]//button[1]//p[1]")).click();
        
        driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		
        Thread.sleep(2000);
		driver.quit();	
		
	}
}
