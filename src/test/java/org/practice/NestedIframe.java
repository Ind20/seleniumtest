package org.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
    public static void main(String[] args) {
 
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

       
        driver.switchTo().frame("frame-top");

        
        driver.switchTo().frame("frame-middle");

        
        WebElement middleFrameText = driver.findElement(By.tagName("body"));
        System.out.println("Text inside the left frame: " + middleFrameText.getText());

       
        driver.switchTo().parentFrame();

        
        driver.switchTo().frame("frame-right");

        
        WebElement rightFrameText = driver.findElement(By.tagName("body"));
        System.out.println("Text inside the right frame: " + rightFrameText.getText());

   
        driver.switchTo().defaultContent();

        
        //driver.quit();
    }
}

