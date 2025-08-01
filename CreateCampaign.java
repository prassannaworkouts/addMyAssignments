package week2.day1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCampaign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("bootcamp@testleaf.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Sales@123");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(6000);
		
		//WebElement campaigns =driver.findElement(By.xpath("(//span[text()='Campaigns'])[1]"));
		
		WebElement campaigns	= driver.findElement(By.xpath("//span[text()='Campaigns']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",campaigns);
		//String pages = driver.getTitle();
		//System.out.println("page name: " + pages);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("(//input[@class=' input'])[1]")).sendKeys("Bootcamp");
		driver.findElement(By.xpath("(//div[@class='form-element']/input)[1]")).sendKeys("7/28/2025");
		driver.findElement(By.xpath("(//div[@class='form-element']/input)[2]")).sendKeys("7/29/2025");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral uiButton--brand uiButton forceActionButton']")).click();
	
	

		
		// gokul.sekar@testleaf.com
		// Leaf@1234
		
		
		
		
		
		
		    
		

	}

}
