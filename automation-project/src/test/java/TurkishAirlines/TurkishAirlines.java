package TurkishAirlines;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TurkishAirlines {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","/Users/kaan/notes/selenium dependencies/drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();//fullscreen
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.turkishairlines.com");
		Thread.sleep(2000);
		// how to handle cookies
		try {
			driver.findElement(By.id("cookieWarningCloseId")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		driver.findElement(By.xpath("//button[@data-id ='from_select']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='originSelector']//div/input")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='originSelector']//div/input")).sendKeys("New York"+Keys.DOWN+Keys.ENTER);
//		Thread.sleep(2000);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='destinationSelector']//div/input")));
		driver.findElement(By.xpath("//div[@id='destinationSelector']//div/input")).sendKeys("Ataturk" +Keys.DOWN+Keys.ENTER);
		Thread.sleep(2000);
		// Go next in calendar
		
		
		
		//driver.findElement(By.xpath("//a[@title='Next']")).click();
		Thread.sleep(3000);
		//selecting dates
		driver.findElement(By.xpath("//a[@aria-label = 'November 12']")).click();
		driver.findElement(By.xpath("//a[@aria-label = 'November 18']")).click();
		Thread.sleep(1000);
		// selecting cabin types
		driver.findElement(By.id("cabinTypeSelector")).click();
		driver.findElement(By.linkText("Business Class")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@name ='upperCountSpinner'])[1]")).click();
		Thread.sleep(4000);
		// search
		driver.findElement(By.id("executeSingleCitySubmit")).click();
		Thread.sleep(1000);	
	}
}
