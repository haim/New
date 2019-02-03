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

public class Fibonacci {
	
	public static void main(String[] args) {

		int maxNumber = 10;
		int firstNumber = 0;
		int nextNumber = 2;
		
		for (int i = 1; i <= maxNumber; ++i) {
			
			System.out.print(firstNumber + " " + "\n");
			 /* On each iteration, we are assigning second number to the first number and
			    assigning the sum of last two numbers to the second number*/
			
			int sum = firstNumber + nextNumber;
			
			firstNumber = nextNumber;
			
			nextNumber = sum;
			}
	}
}