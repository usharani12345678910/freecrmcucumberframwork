package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

//package stepDefinitions;

public class Hooks{
	WebDriver driver;

	@Before
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	System.out.println("setup");
	}

	@After
	public void close() {
	
	System.out.println("close");
	}


	
	
	
	
	
	
	@Given("^user is on mail page$")
	public void user_is_on_mail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("yes");
	}

	@When("^user fills the mail form$")
	public void user_fills_the_mail_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("yes");
	}

	@Then("^mail is created$")
	public void mail_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("yes");
	}



}










