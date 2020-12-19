package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_NetBanking_landing_page() {
        System.out.println("navigated to login url");

    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("logged in success");
    }
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_and_password(String arg1, String arg2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
        System.out.println(arg2);
    }

        @Then("^Homepage is populated$")
    public void homepage_is_populated()  {
        System.out.println("validated homepage");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1){
        System.out.println(strArg1);

    }

}


