package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	@Test
public void newTest (){
	
	
	System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
}	
	
	
}
