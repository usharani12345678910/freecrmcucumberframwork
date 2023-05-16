package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tags {
	
	


	WebDriver driver;

	@Given("^user is  on Login Page1$")
	public void user_is_already_on_LoginPage1() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	}



	@When("^title of login page is actiitime1$")
	public void title_of_login_page_is_actiitime1(){
	String title = driver.getTitle();
	System.out.println(title);

	}

}
