package com.segurosbolivar.automation.stepdefinitions;

import com.segurosbolivar.automation.conf.DriverConfig;
import com.segurosbolivar.automation.pageobjects.login.LoginMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {DriverConfig.class})
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LoginSteps {

    private final LoginMethods methods;

    @Given("Client have an account")
    public void client_have_an_account() {
        methods.go("http://testphp.vulnweb.com/login.php");
    }

    @When("he send required information to login")
    public void he_send_required_information_toLogin() {
        methods.writeUsername("test");
        methods.writePassword("test");
        methods.submit();
    }

    @Then("he should be see the welcome page message")
    public void he_should_be_see_the_welcome_page_message() {
        Assertions.assertEquals("Logout test", methods.getWelcomePageMessage());
    }
}
