package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		// To Launch the chromebrowser
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
		
		//To Enter First Name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mythily");
		
		//To Click on "Find Leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//To Click on first resulting lead
		Thread.sleep(8000);
		
		driver.findElement(By.linkText("10937")).click();
		
		//To Verify title of the page
		String title = driver.getTitle();
		
		String verifyPage = "View Lead | opentaps CRM";
		
		if (title.equals(verifyPage))
		{
			System.out.println("View Lead page is dispalyed");
		}
		
		//To Click Edit
		driver.findElement(By.linkText("Edit")).click();
		
		//To Change the company name
		WebElement findElement = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		
		findElement.clear();
		
		findElement.sendKeys("Cognizant");
		
		//To Click "Update" button
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		//To Confirm the changed name appears
		WebElement companyName = driver.findElement(By.xpath("//span[contains(text(),'Cognizant')]"));
		
		String text = companyName.getText();
		
		Assert.assertTrue(text.contains("Cognizant"));
		
		System.out.println("The Changed name appears in the page");
		
		//To Close the browser
		driver.close();
		
	}

}
