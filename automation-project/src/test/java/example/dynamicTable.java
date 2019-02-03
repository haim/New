package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.ParseException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicTable {
	
	public class Noofrowsandcols {
	    public void main(String[] args) throws ParseException {
	    	
	    	WebDriverManager.chromedriver().setup();
			WebDriver wd = new ChromeDriver();
	        wd.get("http://money.rediff.com/gainers/bsc/dailygroupa?");         
	        //No.of Columns
	        List col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        
	    }
	}

}
