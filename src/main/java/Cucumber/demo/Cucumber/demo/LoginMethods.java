package Cucumber.demo.Cucumber.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginMethods {
	



@Given("^I want to write a step with precondition$")
public void I_want_to_write_a_step_with_precondition() throws Throwable {
    // Express the Regexp above with the code you wish you had
    System.out.println("Login test started");

}

@Given("^open browser$")
public void open_browser() throws Throwable {
    // Express the Regexp above with the code you wish you had
    System.out.println("Browser launched");
}

@When("^enter URL$")
public void enter_URL() throws Throwable {
    // Express the Regexp above with the code you wish you had
    System.out.println("URL entered");

}

@When("^enter username$")
public void enter_username() throws Throwable {
    // Express the Regexp above with the code you wish you had
    System.out.println("userName entered");

}

@When("^enter password$")
public void enter_password() throws Throwable {
    // Express the Regexp above with the code you wish you had
    System.out.println("password entered");

}

@Then("^click login$")
public void click_login() throws Throwable {
    // Express the Regexp above with the code you wish you had
    System.out.println("login button clicked");

}

@Then("^succussfully login$")
public void succussfully_login() throws Throwable {
    // Express the Regexp above with the code you wish you had
	System.out.println("Login Succussful");
}



}
