package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
	    WebDriverManager.chromedriver().setup();
				
		// To Lunch the chrome browser
		WebDriver driver = new ChromeDriver();
				
		//To Launch the URL
		driver.get("http://leafground.com/pages/Button.html");
		
		//To Click button to travel home page
		driver.findElement(By.id("home")).click();
		
		driver.navigate().back();
		
		//To Find position of button (x,y)
		Point location = driver.findElement(By.id("position")).getLocation();
		
		System.out.println(location);
		
		//To Find button color
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		
		System.out.println(color);
		
		//To Find the height and width
		Dimension size = driver.findElement(By.id("size")).getSize();
		
		System.out.println(size);

		

	}

}
