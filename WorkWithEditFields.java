package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		// To Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//To Launch the URL
		driver.get("http://leafground.com/pages/Edit.html");
		
		//To Enter Email Address
		driver.findElement(By.id("email")).sendKeys("psjmythily@gmail.com");
		
		//To Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Hello" + Keys.TAB);
		
		//To Get default text entered
		String text = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		
		System.out.println(text);
		
		//To Clear the text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		//To Confirm that edit field is disabled
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		
		System.out.println(enabled);
		
		
		
		

	}

}
