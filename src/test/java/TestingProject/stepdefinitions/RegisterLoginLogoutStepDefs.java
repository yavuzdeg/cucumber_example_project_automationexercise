package TestingProject.stepdefinitions;

import TestingProject.pages.AllPages;
import TestingProject.utilities.ConfigReader;
import TestingProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterLoginLogoutStepDefs {

    AllPages elements = new AllPages();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        Assert.assertTrue(elements.mainPage().mainPageCarousel.isDisplayed());
    }

    @Then("Click on Signup \\/ Login button")
    public void click_on_signup_login_button() {

        elements.mainPage().signupLoginButton.click();
    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {

        Assert.assertTrue(elements.loginSignupPage().newUserSignupText.isDisplayed());
        Assert.assertEquals("New User Signup!", elements.loginSignupPage().newUserSignupText.getText());
    }

    @Then("Enter name and email address")
    public void enter_name_and_email_address() throws InterruptedException {

        elements.loginSignupPage().signupName.sendKeys("Fakename");

        Thread.sleep(500);

        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        elements.loginSignupPage().signupEmail.sendKeys("fakemail" + randomNumber + "@gmail.com");
    }

    @When("Click Signup button")
    public void click_signup_button() {

        elements.loginSignupPage().signupButton.click();
    }

    @When("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(elements.accountInformationPage().enterAccountInformationText.isDisplayed());
        Assert.assertEquals("ENTER ACCOUNT INFORMATION", elements.accountInformationPage().enterAccountInformationText.getText());
    }

    @When("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Click Create Account button")
    public void click_create_account_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Click Continue button")
    public void click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
