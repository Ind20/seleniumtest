package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartCheckbox {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Smartphones");
        Thread.sleep(1000);
        List<WebElement> links = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
        links.get(0).click();
        Thread.sleep(1000);
//        WebElement element = driver.findElement(By.xpath("//img[title='Become a Seller']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).perform();
//        System.out.println("cursor moved to element");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='SAMSUNG']")).click();


        //driver.close();
    }
}
