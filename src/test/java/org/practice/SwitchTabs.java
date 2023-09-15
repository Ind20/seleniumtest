package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class SwitchTabs {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        Thread.sleep(2000);


        ((ChromeDriver) driver).executeScript("window.open('', '_blank');");
        ((ChromeDriver) driver).executeScript("window.open('', '_blank');");
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.get("https://www.bing.com");
        Thread.sleep(2000);


        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).submit();
        driver.close();
        Thread.sleep(2000);


        driver.switchTo().window(tabs.get(0));


        driver.findElement(By.name("q")).sendKeys("Java");
        driver.findElement(By.name("q")).submit();
        Thread.sleep(2000);


        driver.quit();
    }
}
