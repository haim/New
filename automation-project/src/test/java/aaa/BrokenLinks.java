package aaa;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dice.com");
		

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).getAttribute("href") != null) {
				activeLinks.add(links.get(i));
			}
		}
		System.out.println(activeLinks.size());
		
		
		driver.get("http://www.facebook.com");
		
		List<WebElement>links2=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement>activelinks2=new ArrayList<WebElement>();
		for (int i = 0; i < links2.size(); i++) {
			if(links2.get(i).getAttribute("href")!=null) {
				activelinks2.add(links2.get(i));
			}
		}
		System.out.println(activelinks2.size());
		
	}
		
}	
