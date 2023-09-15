package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/Asus/Desktop/test.html");
        Thread.sleep(1000);
        System.out.println("page opened");


        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Asus\\Desktop\\Cover letter.pdf");
        System.out.println("upload button clicked");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println("submit button clicked");

        driver.close();
    }
}
