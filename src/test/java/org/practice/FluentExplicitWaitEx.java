package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentExplicitWaitEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

        Wait<WebDriver> wait =  new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        System.out.println("waited fluently");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/50/50/image/36cbb8cb5ab81f59.jpg?q=50']")))
                .click();

        System.out.println("the element was clicked");
        driver.close();
    }
}
