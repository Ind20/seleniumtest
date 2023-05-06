package seleniumtest;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/Users/Asus/javaprojects/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "/Users/Asus/javaprojects/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "/Users/Asus/javaprojects/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
