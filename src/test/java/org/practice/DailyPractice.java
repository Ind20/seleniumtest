package org.practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DailyPractice {
    public static void main(String[] args) throws IOException {

       //  System.setProperty(webdriver.chrome.driver, "/Users/Asus/javaprojects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));

        // go to ur
        driver.get("");
        driver.navigate().to("");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        // find element
        WebElement element = driver.findElement(By.id("if"));
        element.click();

        // find elements
        List<WebElement> elements = driver.findElements(By.xpath(""));

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //explicit wait
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

        // Fluent wait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

        // dropdown
        WebElement staticDropdown = driver.findElement(By.id("#id"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);

        // Actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        // Alert
        driver.switchTo().alert().accept();

        // tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // iframes
        driver.switchTo().frame(0);

        // screenshot
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));


        // upload file
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Asus\\Desktop\\Cover letter.pdf");

        // scroll to element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        //


    }
}
