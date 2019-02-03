package aaa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","/Users/kaan/notes/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); //options
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		
//		driver.findElement(By.name("firstname")).sendKeys(new Faker().name().firstName());
//		driver.findElement(By.name("lastname")).sendKeys(new Faker().name().lastName());
//		driver.findElement(By.name("reg_email__")).sendKeys("jg1291taken@gmail.com");
//		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jg1291taken@gmail.com");
//		driver.findElement(By.name("reg_passwd__")).sendKeys("12345Abcd");
//		Select mnt=new Select (driver.findElement(By.id("month")));
//		mnt.selectByIndex(1);
//		Select day=new Select (driver.findElement(By.id("day")));
//		day.selectByIndex(15);
//		Select year=new Select (driver.findElement(By.id("year")));
//		year.selectByIndex(22);
//		WebElement radio = driver.findElement(By.xpath("//input[@value='2']")); 
//		radio.click();
//		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			
		driver.findElement(By.name("email")).sendKeys("jg1290taken@gmail.com");
		System.out.println(driver.findElement(By.name("email")).getCssValue("font-size"));
		driver.findElement(By.name("pass")).sendKeys("12345Abc");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("u_ps_0_8_0")).click();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("yildirdim"+ Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pageLoginAnchor\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"u_2l_3\"]")).click();
		driver.close();
	}

}
