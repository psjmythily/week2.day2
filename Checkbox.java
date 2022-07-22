package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
	    WebDriverManager.chromedriver().setup();
				
		// To Lunch the chrome browser
		WebDriver driver = new ChromeDriver();
				
		//To Launch the URL
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//To Select the languages that you know?
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		
		//To Confirm Selenium is checked
		boolean selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
		
		if(selected == true)
		{
			System.out.println("Selenium is checked by default");
		}
		
		else
		{
			System.out.println("Selenium is not checked");
		}
		
		//To DeSelect only checked
		
	    boolean selected1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isSelected();
	
	    if(selected1 == true)
	     {
	    	driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
	     }
		
	    boolean selected2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected();
		
	    if(selected2 == true)
	     {
	    	driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
	     }
	    
	    //To Select all below checkboxes
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
	    
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
	    
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
	    
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
	    
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
	    
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();

	}

}
