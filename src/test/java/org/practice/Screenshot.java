package org.practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) {
    
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");;
        
        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
        File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
        String screenshotPath = "C:\\Users\\Asus\\javaprojects\\seleniumtest\\screenshots\\screenshot.png";
        try {
            FileUtils.copyFile(screenshotFile, new File(screenshotPath));
            System.out.println("Screenshot saved to: " + screenshotPath);
        } catch (IOException e) {
            System.err.println("Error saving screenshot: " + e.getMessage());
        }

        
        driver.quit();
    }

}
