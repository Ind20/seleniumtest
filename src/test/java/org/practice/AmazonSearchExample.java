package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("laptop");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        Thread.sleep(2000);
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".a-size-medium.a-text-normal"));
        int count = 0;
        for (WebElement result : searchResults) {
            System.out.println(result.getText());
            System.out.println();
            count++;
        }
        System.out.println("found " +count+ " results");
        driver.quit();
    }
}
