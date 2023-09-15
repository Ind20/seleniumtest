package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

    public static void main(String[] args) throws InterruptedException {

        //  System.setProperty("webdriver.chrome.driver", "/Users/Asus/javaprojects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        //Find the total number of iframes on the page
        int totalIFramesOnPage = driver.findElements(By.tagName("iframe")).size();

        //Print the total iframes on page
        System.out.println("Total iframes on Page:" + totalIFramesOnPage);

        //switch to first frame using index=0
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();

        Thread.sleep(2000);
        driver.close();
    }

}
