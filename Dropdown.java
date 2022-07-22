package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
	    WebDriverManager.chromedriver().setup();
				
		// To Lunch the chrome browser
		WebDriver driver = new ChromeDriver();
				
		//To Launch the URL
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//To select by index
		WebElement index = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(index);
		
		select.selectByIndex(1);
		
		//To Select by Text
		WebElement text = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		
		Select select1 = new Select(text);
		
        select1.selectByVisibleText("Selenium");
        
        //To Select by Value
        WebElement value = driver.findElement(By.id("dropdown3"));
        
        Select select2 = new Select(value);
        
        select2.selectByValue("1");
        
        //To get the number of dropdown options
        WebElement findElement = driver.findElement(By.xpath("//select[@class='dropdown']"));
        
        Select se = new Select(findElement);

        int size = se.getOptions().size();
        
        System.out.println("The number of dropdown options:" + size);
        
        //To Select by Sendkeys
        driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("Appium");
        
        //To select from non dropdown
        driver.findElement(By.xpath("(//div[@class='example'])[6]/select/option[3]")).click();
        
		

	}

}
