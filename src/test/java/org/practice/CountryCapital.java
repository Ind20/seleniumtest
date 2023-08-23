package org.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CountryCapital {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://geographyfieldwork.com/WorldCapitalCities.htm");
		List<WebElement> options = driver.findElements(By.xpath("//tr[@class=' odd']"));
		
		for (WebElement option :options)
		{
			System.out.println(option.getText());
		}
		
		List<WebElement> options1 = driver.findElements(By.xpath("//tr[@class=' even']"));
		
		for (WebElement option :options1)
		{
			System.out.println(option.getText());
		}
		driver.close();
	}

}
