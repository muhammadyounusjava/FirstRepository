package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;

public class LoginTest {

	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {

	// Take you to the site
	driver.get("http://techfios.com/test/billing/?ng=admin/");

	// Calling LoginPage Class or Activate
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

	// Validate page show up using the title
	String expectedTitle = "Login - TechFios Test Application - Billing"; // To store the actual title
	String actualTitle = loginPage.getPageTitle(); // To get and store the title
	System.out.println(actualTitle); // To print
	Assert.assertEquals(actualTitle, expectedTitle, "Wrong page!");

	// Call the login method from the LoginPage Class
	loginPage.login("techfiosdemo@gmail.com", "abc123");

	// Validate page show up using the Explicit Wait
	DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class); // Object Reference
	dashboardPage.waitForPage();
	}

	@Test
	public void invalidUserShouldBeAbleToLogin() {

	// Take you to the site
	//driver.get("http://techfios.com/test/billing/?ng=admin/");

	// Calling LoginPage Class or Activate
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

	// Validate page show up using the title
	String expectedTitle = "Login - TechFios Test Application - Billing"; // To store the actual title
	String actualTitle = loginPage.getPageTitle(); // To get and store the title
	System.out.println(actualTitle); // To print
	Assert.assertEquals(actualTitle, expectedTitle, "Wrong page!");

	// Call the login method from the LoginPage Class
	loginPage.login("invalid@gmail.com", "abc123");

	// Validate Dashboard Page did not show up using Expilicit Wait try/catch
	DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class); // Object Reference
	Assert.assertFalse(dashboardPage.isDashboardDisplayed(), "Invalid User was able to login!!");
	}

	//@AfterMethod
	//public void close() {
	// close and quit
	//driver.close();
	//driver.quit();
}
