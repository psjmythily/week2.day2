package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		// To Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//To Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//To Maximise the window
		driver.manage().window().maximize();
		
		//To Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//To Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//To Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//To Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//To Click on Find Leads link
		driver.findElement(By.linkText("Find Leads")).click();
		
		//To Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//To Enter Phone number
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("01");
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8056100692");
		
		//To Click "Find Leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//To Capture lead ID of First Resulting lead
		Thread.sleep(8000);
		
		WebElement findElement = driver.findElement(By.linkText("13845"));
		
		String text = findElement.getText();
		
		System.out.println(text);
		
		//To Click First Resulting lead
		driver.findElement(By.linkText("13845")).click();
		
		//To Click Delete
		driver.findElement(By.linkText("Delete")).click();
		
		//To Click on Find Leads 
		driver.findElement(By.linkText("Find Leads")).click();
		
		//To Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		
		//To Click Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//To Verify message "No records to display" in the Lead List
		Thread.sleep(8000);
		
		WebElement message = driver.findElement(By.xpath("//div[text()='No records to display']"));
		
		String text2 = message.getText();
		
        Assert.assertTrue(text2.contains("No records to display"));
		
		System.out.println("Successfully deleted");
		
		//To Close the browser
		driver.close();	

	}

}
