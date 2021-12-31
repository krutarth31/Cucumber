//package stepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.it.Data;
//
//public class LoginTestMap2 {
//	
//	WebDriver driver; 
//	
//	@Given("^user is on sign in page$")
//	public void user_is_on_sign_in_page()  {
//		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
//		driver = new ChromeDriver();
//		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//	}
//
//	@Then("^user enter username and password$")
//	public void user_enter_and(DataTable credentials) {
//		for(Map<String, String> data : credentials.asMaps(String.class, String.class)){
//		driver.findElement(By.name("email")).sendKeys(data.get("username"));
//		driver.findElement(By.name("passwd")).sendKeys(data.get("password"));
//		driver.findElement(By.name("SubmitLogin")).click();
//		}
//	    
//	}
//
//	@Then("^user clicks on sign In$")
//	public void user_clicks_on_sign_In(){
//		driver.findElement(By.name("SubmitLogin")).click();
//	   
//	}
//	
//	@Then("^verify sign out button$")
//	public void verify_sign_out_button()  {
//		List<WebElement> signOutLink = driver.findElements(By.linkText("Sign out"));
//		Assert.assertTrue(signOutLink.size()>0);
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	    
//	}
//
//}
