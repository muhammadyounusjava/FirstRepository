package testasn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class begainer {

	@Test
	public void openGoogleSite() throws InterruptedException {
		// setting ChromDriver Properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

// Create an object of ChromDriver

		WebDriver driver = new ChromeDriver();

		driver.get("http://techfios.com/test/billing/?ng=admin/");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techfiosdemo@gmail.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}
}
