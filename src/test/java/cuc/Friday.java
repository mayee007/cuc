package cuc;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Friday {
    private String today;
    private String response;
    
	@Given("today is Sunday")
	public void today_is_Sunday() {
	    today = "Sunday"; 
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
	    response = IsItFriday.isItFriday(today); 
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String expected) {
	    assertEquals(expected, response); 
	}
	
	@Given("today is Friday")
	public void today_is_Friday() {
	    today = "Friday"; 
	}
	
	@Given("today is Thursday")
	public void today_is_Thursday() {
	    today = "Thursday"; 
	}

	@Given("today is {string}")
	public void today_is(String string) {
	    today = ""; 
	}
	
}

class IsItFriday {
    static String isItFriday(String today) {
    	
    	if (today.equals("Friday")) 
    		return "Enjoy, Today is Friday"; 
        return "Nope";
    }
}
