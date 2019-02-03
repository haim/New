package aaa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/kaan/notes/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); //options
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("kaan");
		
		List<WebElement>list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}

	}

}
