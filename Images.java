package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
	    WebDriverManager.chromedriver().setup();
				
		// To Lunch the chrome browser
		WebDriver driver = new ChromeDriver();
				
		//To Launch the URL
		driver.get("http://leafground.com/pages/Image.html");
		
		//To click on the image to go home page
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		driver.navigate().back();
		
		//To check broken image
		WebElement brokenImage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		
		if(brokenImage.getAttribute("naturalHeight").equals("0"))
		{
		 
		 System.out.println("It is a broken image");
		}
		
		else
		{
		System.out.println("It is not a broken image");
		}
		
		//To Click me using Keyboard or Mouse
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();

	}

}
