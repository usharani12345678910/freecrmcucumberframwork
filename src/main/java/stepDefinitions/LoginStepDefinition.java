package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

 public class LoginStepDefinition{
WebDriver driver;

@Given("^user is  on Login Page$")
public void user_is_already_on_LoginPage() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
}



@When("^title of login page is actiitime$")
public void title_of_login_page_is_free_CRM(){
String title = driver.getTitle();
System.out.println(title);

}


@Then("^user enters \"(.*)\" and \"(.*)\"$")
public void user_enters_username_and_password(String username, String password){
driver.findElement(By.id("username")).sendKeys(username);	 
driver.findElement(By.name("pwd")).sendKeys(password);
}
	 
@Then("^user clicks on login button$")
public void user_clicks_on_login_button() {
WebElement loginBtn =
driver.findElement(By.xpath("//div[text()='Login ']"));
JavascriptExecutor js = (JavascriptExecutor)driver;	 
js.executeScript("arguments[0].click();", loginBtn);
}


@Then("^user is on home page$")
public void user_is_on_hopme_page(){
String title = driver.getTitle();	 
System.out.println("Home Page title ::"+ title);
//Assert.assertEquals("CRMPRO", title);
}



	 	 

@Then("^Close the browser$")
public void close_the_browser(){
	 driver.quit();
}
}



