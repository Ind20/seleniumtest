package org.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchExample {
    public static void main(String[] args) {
       
    	//System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

       
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("laptop");

  
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> searchResults = driver.findElements(By.cssSelector(".a-size-medium.a-text-normal"));
        for (WebElement result : searchResults) {
            System.out.println(result.getText());
        }

        driver.quit();
    }
}
