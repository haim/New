package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deneme {
	
	//WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		driver.get("http://amazon.com");
		
		List<WebElement>lists=driver.findElements(By.tagName("a"));
		
		for (WebElement ele : lists) {
			System.out.println(ele.getAttribute("href"));
		}
	

	
		
		
	}

}
	