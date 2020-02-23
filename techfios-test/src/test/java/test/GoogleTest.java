package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleTest {

	
	@Test
	public void openGoogleSite() {
		//setting ChromDriver Properties 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
// Create an object of ChromDriver
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
//driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.id("userName")).sendKeys("mercury");

//driver.findElement(By.name("password")).sendKeys("abc123");	
		driver.findElement(By.name("password")).sendKeys("rashmi1807");
		
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.name("Next")).click();
	}
	
}
