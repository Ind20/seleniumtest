package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CountryCapital {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://geographyfieldwork.com/WorldCapitalCities.htm");
        List<WebElement> options = driver.findElements(By.xpath("//tr[@class=' odd'] | //tr[@class=' even']"));

        int count = 1;
        for (WebElement option : options) {
            System.out.print(count);
            System.out.print(". ");
            System.out.println(option.getText());
            count++;
        }
        Thread.sleep(10000);
        driver.close();
    }

}
