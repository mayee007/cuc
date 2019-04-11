package cuc.google;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class GoogleTest {
	
	WebDriver driver = null;	
	String url = "http://google.com"; 
	String actualTitle; 
	
	@Before
	public void setup() { 
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\mayee\\workspace\\cuc\\chromedriver.exe");
	    driver = new ChromeDriver();  
	}
	
	
	@Given("I open webpage")
	public void i_open_webpage() {		
		driver.navigate().to(url); 
	}

	// going to run actual test 
	@When("I read title")
	public void i_read_title() {
		actualTitle = driver.getTitle();
	}

	// "expectedTitle" information comes from feature file 
	@Then("title should be {string}")
	public void title_should_be(String expectedTitle) {
	    assertEquals(expectedTitle, actualTitle); 
	}
	
	@After
	public void closeConnections() { 
		//driver.close(); 
		driver.quit(); 
	}
}
