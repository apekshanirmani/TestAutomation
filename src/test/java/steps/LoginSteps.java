package steps;

import io.cucumber.java.en.*;
import utils.BaseClass;
import static pageObject.LoginPage.*;

public class LoginSteps extends BaseClass {

    @Given("^user open the IB url$")
    public void user_open_the_IB_url() {
        navigateToURL();
    }

    @Given("^user type username (.*)$")
    public void user_type_dl_username_username(String username) {
        enterUsername(username);
    }

    @Given("^user type password (.*)$")
    public void user_type_password_password(String password) {
        enterPassword(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        clickLogin();
    }

    @Then("^user navigate to dashboard (.*)$")
    public void user_navigate_to_dashboard(String text) throws Exception {
        getDashboardText(text);
    }

    @Then("^user verify (.*) text is correct in Login page$")
    public void userVerifyRegister_buttonTextIsCorrectInLoginPage(String text) throws Exception {
        getActualText(text);
    }

    @When("I click on the Show PassCode button on PassCode field in Login page")
    public void i_click_on_the_show_pass_code_button_on_pass_code_field_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I can see the entered passcode on PassCode field in Login page")
    public void i_can_see_the_entered_passcode_on_pass_code_field_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I cannot see the entered passcode on PassCode field in Login page")
    public void i_cannot_see_the_entered_passcode_on_pass_code_field_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I click on UserName field in Login page")
    public void i_click_on_user_name_field_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click outside of the form in Login page")
    public void i_click_outside_of_the_form_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The UserName field validation text is displayed in Login page")
    public void the_user_name_field_validation_text_is_displayed_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I click on PassCode field in Login page")
    public void i_click_on_pass_code_field_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the PassCode field validation text is displayed in Login page")
    public void the_pass_code_field_validation_text_is_displayed_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The UserName field validation text is not displayed in Login page")
    public void the_user_name_field_validation_text_is_not_displayed_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The PassCode field validation text is not displayed in Login page")
    public void the_pass_code_field_validation_text_is_not_displayed_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify the Login button is disable in Login page")
    public void i_verify_the_login_button_is_disable_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify the Login button is enable in Login page")
    public void i_verify_the_login_button_is_enable_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The register user popup is displayed in Login page")
    public void the_register_user_popup_is_displayed_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on Not Now button on register user popup in Login page")
    public void i_click_on_not_now_button_on_register_user_popup_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Login page is loaded")
    public void the_login_page_is_loaded() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Login Incorrect popup is displayed in Login page")
    public void the_login_incorrect_popup_is_displayed_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on Ok button on Login Incorrect popup in Login page")
    public void i_click_on_ok_button_on_login_incorrect_popup_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
