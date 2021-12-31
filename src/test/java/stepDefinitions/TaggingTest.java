package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class TaggingTest {
	@Before(order =0)
	public void setUp1() {
		System.out.println("before global tag");
	}
	
	@After(order=0)
	public void tearDown1() {
		System.out.println("after global tag");
		}
	
	@Before(order =1)
	public void setUp2() {
		System.out.println("before global tag order 1");
	}
	
	@After(order =1 )
	public void tearDown2() {
		System.out.println("after global tag order 1");
		}
	
	@Before("@First")
	public void setUp() {
		System.out.println("before first tag");
	}
	
	@After("@First")
	public void tearDown() {
		System.out.println("after first tag");
	}
	
	@Given("^user login$")
	public void user_login() {
		System.out.println("user login");
	    
	}

	@Given("^user logout$")
	public void user_logout(){
	    
	}

	@Given("^user contact$")
	public void user_contact(){
	  
	}

	@Given("^user deals$")
	public void user_deals()  {
	
	}

	@Given("^user case$")
	public void user_case() {
	    
	}

	@Given("^user test$")
	public void user_test(){
	  
	}

	@Given("^user selenium$")
	public void user_selenium(){
	    
	}

	@Given("^user java$")
	public void user_java() {
	 
	}

	@Given("^user cucumber$")
	public void user_cucumber() {
	  
	}

	@Given("^user krutarth$")
	public void user_krutarth() {
	 
	}

}
