package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;

public class Sdet {

    public static void main(String[] args) throws InterruptedException {

        // initialize
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");

        /*

        // get title, url and page source
        System.out.println("title of page is: " +driver.getTitle());
        System.out.println("url of page is :" +driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        // element status
        WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        search.sendKeys("abc");
        System.out.println("Display status: " +search.isDisplayed());
        System.out.println("Enabled status: " +search.isEnabled());
        WebElement male = driver.findElement(By.id("gender-male"));
        WebElement female = driver.findElement(By.id("gender-female"));
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());
        male.click();
        System.out.println(male.isSelected());

        // navigate to, refresh
        driver.navigate().to("https://www.google.com");
        Thread.sleep(1000);
        driver.navigate().back();
        driver.navigate().refresh();

        // get footer links and check how many links are working
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(links.size());
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }

        // Register a user
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Test");
        driver.findElement(By.id("LastName")).sendKeys("User");
        WebElement dayDropdown = driver.findElement(By.name("DateOfBirthDay"));
        Select dropdown1 = new Select(dayDropdown);
        dropdown1.selectByIndex(20);
        WebElement monthDropdown = driver.findElement(By.name("DateOfBirthMonth"));
        Select dropdown2 = new Select(monthDropdown);
        dropdown2.selectByIndex(7);
        WebElement yearDropdown = driver.findElement(By.name("DateOfBirthYear"));
        Select dropdown3 = new Select(yearDropdown);
        dropdown3.selectByValue ("1993");
        driver.findElement(By.id("Email")).sendKeys("testuser123@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Test Company");
        driver.findElement(By.id("Password")).sendKeys("12345678");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
        driver.findElement(By.id("register-button")).click();

        */


        Thread.sleep(2000);
        System.out.println("All test completed!");
        driver.close();
    }

    public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
            httpURLConnection.connect();


            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "is a broken link");
        }
    }
}

