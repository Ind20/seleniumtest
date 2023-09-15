package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("w3schools");


        WebElement element = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));



        Actions actions = new Actions(driver);

        actions.moveToElement(element).perform();
        System.out.println("cursor moved to element");

        actions.contextClick().perform();
        System.out.println("rigth clicked");

        actions.click().perform();
        System.out.println("clicked");
        Thread.sleep(2000);


        driver.quit();
    }
}
