package org.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TV");
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		
			for (WebElement option :options)
			{
				String suggestion = option.getText();
				System.out.println("tv " +suggestion);
			}
		driver.close();
	}

}