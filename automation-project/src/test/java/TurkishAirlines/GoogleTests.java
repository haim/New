package TurkishAirlines;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/kaan/notes/selenium dependencies/drivers/chromedriver");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = (WebDriver) new ChromeDriver();

		driver.get("https://google.com");
		String expected = "google";
		String actual = driver.getCurrentUrl();
		System.out.println(actual);
		
		if (actual.contains(expected)) {
			System.out.println("pass the test");
		} else {
			System.out.println("failed the test");
			System.out.println("Expected :\t " + expected);
			System.out.println("Actual:\t" + actual);
			driver.close();
		}
		
	}
}