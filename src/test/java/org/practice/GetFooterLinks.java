package org.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFooterLinks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
	//	List<WebElement> options = driver.findElements(By.xpath("//div[7]/ul[1]/li/a[@class='nav_a']"));
		List<WebElement> options = driver.findElements(By.xpath("//a[text()='COVID-19 and Amazon']//ancestor::ul"));
		
		for (WebElement option :options)
		{
			System.out.println(option.getText());
		}
		driver.close();
	}

}
