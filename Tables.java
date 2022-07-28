package week2.day2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
	    WebDriverManager.chromedriver().setup();
				
		// To Lunch the chrome browser
		WebDriver driver = new ChromeDriver();
				
		//To Launch the URL
		driver.get("http://www.leafground.com/pages/table.html");
		
		//To Get the count of number of columns
		List<WebElement> column = driver.findElements(By.xpath("//tbody/tr/th"));
		
		System.out.println("No.of Colums : " + column.size());
		
		//To Get the count of number of rows
        List<WebElement> row = driver.findElements(By.xpath("//tbody/tr"));
		
		System.out.println("No.of rows : " + row.size());
		
		//To Get the progress value of 'Learn to interact with Elements'
		for(int i=3; i<=5; i++)
		{
			Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).getText();
		System.out.println("Progress value of 'Learn to interact with Elements' in  Row["+i+"] : " + text);
		}
		
		//To Check the vital task for the least completed progress.
		driver.findElement(By.xpath("//tbody/tr[6]/td[3]")).click();

	}

}
