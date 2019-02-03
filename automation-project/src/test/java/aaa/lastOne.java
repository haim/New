package aaa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class lastOne {
	public static void main(String[] args) {
//FIBONACCI
		int maxNumber = 10;
		int firstNumber = 0;
		int nextNumber = 2;
		for (int i = 1; i <= maxNumber; ++i) {
			System.out.print(firstNumber + " " + "\n");
			 /* On each iteration, we are assigning second number to the first number and
			    assigning the sum of last two numbers to the second number*/
			int sum = firstNumber + nextNumber;
			firstNumber = nextNumber;
			nextNumber = sum;}
//FizzBuzz
		for (int i = 1; i < 100; i++) {
			if (i % 15 == 0)
				System.out.print("FizzBuzz\t\n");
			else if (i % 5 == 0)
				System.out.print("Fizz\t");
			else if (i % 3 == 0)
				System.out.print("Buzz\t");
			else
				System.out.print(i + "\t");}
//ReverseWord
		String word = "abcd";
		String result = " ";
		for (int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);
		}
		System.out.println(result);
//BROKEN LINKS
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
//UniqueLetters
		String str = "aassdfdfwer";
		Map<Character,Integer> uniqueMap = new HashMap();
		for(int i=0; i<str.length(); i++) {
			if(uniqueMap.containsKey(str.charAt(i))) {
				int count = uniqueMap.get(str.charAt(i));
				uniqueMap.put(str.charAt(i), ++count);
			}
			else {
				uniqueMap.put(str.charAt(i),1);
			}
		}
		for(Character i: uniqueMap.keySet()) {
			if (uniqueMap.get(i)<=1) {
				System.out.println(i);
			}
//EVENORODD			
			int num = 6;
	        if(num % 2 == 0)
	            System.out.println(num + " is even");
	        else
	            System.out.println(num + " is odd");
//PRIMENUMBER
//	    	public static boolean prime(int number) {
//	    		for (int i = 2; i < number; i++) {
//	    			if (number % i == 0) {
//	    				System.out.println(number);}}
//	    		return true;}
//	    	public static void main(String[] args) {
//	    		System.out.println(prime(5));}}
		}
	}}
