package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		// To Launch the chromebrowser
		WebDriver driver = new ChromeDriver();
		
		//To Launch the URL
		driver.get("https://en-gb.facebook.com/");
		
		//To Maximise the window
		driver.manage().window().maximize();
		
		//To Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//To Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		
		//To Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mythily");
		
		//To Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Satheesh");
		
		//To Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("psjmythily@gmail.com");
		
		//To Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("Satheesh@1993");
		
		//To Enter Date Of Birth
		
		//1.To Select Date from dropdown values 
		WebElement date = driver.findElement(By.id("day"));
		
		Select select1 = new Select(date);
		
		select1.selectByValue("25");
		
		//2.To Select Month from dropdown values 
        WebElement month = driver.findElement(By.id("month"));
		
		Select select2 = new Select(month);
		
		select2.selectByValue("6");
		
		//3.To Select Year from dropdown values 
        WebElement year = driver.findElement(By.id("year"));
		
		Select select3 = new Select(year);
		
		select3.selectByValue("1993");
		
		//To Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		            
	}

}
