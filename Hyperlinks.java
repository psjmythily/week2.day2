package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
	    WebDriverManager.chromedriver().setup();
				
		// To Lunch the chrome browser
		WebDriver driver = new ChromeDriver();
				
		//To Launch the URL
		driver.get("http://leafground.com/pages/Link.html");
		
		//To Go to Home Page
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.navigate().back();
		
		//To find where am supposed to go without clicking me
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		
		System.out.println(attribute);
		
		//To Verify am I broken?
		driver.findElement(By.linkText("Verify am I broken?")).click();
		
		String title = driver.getTitle();
		
		if(title.equals("404 Not Found"))
		{
			System.out.println("The page is broken");
		}
		
		else
		{
			System.out.println("The page is not broken");
		}
		
		//To get back to Hyperlinks page
		driver.navigate().back();
		
        //To Go to Home Page (Interact with same link name)
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[3]")).click();
		
		//To find How many links are available in this page?
	    int size = driver.findElements(By.tagName("a")).size();
	    
	    System.out.println(size);
	}

}
