package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("tom");
        driver.findElement(By.linkText("Top Deals")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("tom");
    }
}
