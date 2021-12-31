//package stepDefinitions;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class HomePageTest {
//	
//	
//	WebDriver driver;
//	
//	
//	
//	
//	@Given("^user is on home page$")
//	public void user_is_on_home_page() {
//		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
//		driver = new ChromeDriver();
//		driver.get("http://automationpractice.com/index.php");
//		
//	}
//	
//	@Then("^click on Sign In$")
//	public void click_on_Sign_In()  {
//		driver.findElement(By.linkText("Sign in")).click();
//	}
//
//	@Then("^verify title on Sign In page$")
//	public void verify_title_on_Sign_In_page()  {
//		String title = driver.getTitle();
//		String expTitle = "Login - My Store";
//		Assert.assertEquals(title, expTitle);
//	}
//
//	
//	
//	
//	@Given("^user is on home page to check links$")
//	public void user_is_on_home_page_to_check_links() {
//		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
//		driver = new ChromeDriver();
//		driver.get("http://automationpractice.com/index.php");
//	}
//
//	@Then("^user check information links$")
//	public void user_check_information_links() {
//		List<WebElement> links = driver.findElements(By.xpath("(//ul[@class='toggle-footer'])[1]/li"));
//		System.out.println(links.size());
//		for(WebElement a:links) {
//			System.out.println(a.getText());
//		}
//	}
//
//	@Then("^close the browser$")
//	public void close_the_broser(){
//		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
//		driver = new ChromeDriver();
//		driver.quit();
//	}
//
//
//
//}
