package aaa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AMEX {
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","/Users/kaan/notes/selenium dependencies/drivers/chromedriver");// set up chrome driver path
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// invoke selenium webdriver
		// driver.manage().window().fullscreen();//fullscreen
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		//driver.navigate().back();
		driver.navigate().to(driver.getCurrentUrl());
		
		
		String url = "http://www.deal4loans.com/apply-home-loans.php";
		driver.get(url);
		
		System.out.println(driver.getPageSource());
		driver.findElement(By.linkText("privacy policy")).click();
		
		String mainwindow = driver.getWindowHandle();

		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			if (driver.getTitle()
					.equals("Privacy Policy - Deal4loans.com's Services | Online Loan Application And Information")) {
				// do not do anything else and leave the method
				// since we are now in the right window
				driver.close();
			}
			// Set<String> windows = driver.getWindowHandles();
			// for (String handle : windows) {
			// driver.switchTo().window(handle);
			// System.out.println(driver.getTitle());
			// String pagetitle = driver.getTitle();
			// if (pagetitle.equalsIgnoreCase("Privacy Policy - Deal4loans.com's Services |
			// Online Loan Application And Information")) {
			// driver.close();
			// System.out.println("Closed the '" + pagetitle + "' Tab now ...");
		}

		driver.switchTo().window(mainwindow);
		
	}
}
