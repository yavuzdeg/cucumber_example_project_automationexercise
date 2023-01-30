package TestingProject.stepdefinitions;

import TestingProject.pages.AllPages;
import TestingProject.utilities.ConfigReader;
import TestingProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class RegisterLoginLogoutStepDefs {

    AllPages elements = new AllPages();

    public String emailLogin;

    @Given("Navigate to url {string}")
    public void navigate_to_url(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        Assert.assertTrue(elements.mainPage().mainPageCarousel.isDisplayed());
    }

    @Then("Click on Signup-Login button")
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
        emailLogin = "fakemail" + randomNumber + "@gmail.com";
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
    public void fill_details_title_name_email_password_date_of_birth() throws InterruptedException {

        Thread.sleep(500);
        if(!elements.accountInformationPage().titleMr.isSelected()){
            elements.accountInformationPage().titleMr.click();
        }

        Assert.assertEquals("Fakename", elements.accountInformationPage().name.getAttribute("value"));
        Assert.assertTrue(elements.accountInformationPage().email.getAttribute("value").contains("@gmail.com"));

        elements.accountInformationPage().password.sendKeys("123456789");

        WebElement dropdownDay= elements.accountInformationPage().day;
        Select selectDay = new Select(dropdownDay);
        selectDay.selectByIndex(7);

        WebElement dropdownMonth= elements.accountInformationPage().month;
        Select selectMonth = new Select(dropdownMonth);
        selectMonth.selectByVisibleText("April");

        WebElement dropdownYear= elements.accountInformationPage().year;
        Select selectYear = new Select(dropdownYear);
        selectYear.selectByValue("1980");
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {

        if(!elements.accountInformationPage().newsletter.isSelected()) {
            elements.accountInformationPage().newsletter.click();
        }
    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {

        if(!elements.accountInformationPage().specialOffers.isSelected()) {
            elements.accountInformationPage().specialOffers.click();
        }
    }

    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() throws InterruptedException {

        elements.accountInformationPage().firstName.sendKeys("Fakename");

        elements.accountInformationPage().lastName.sendKeys("Fakelastname");

        elements.accountInformationPage().company.sendKeys("Fakecompany");

        elements.accountInformationPage().address1.sendKeys("Fake District");

        elements.accountInformationPage().address2.sendKeys("Fake Street 10/22");

        WebElement dropdownCountry= elements.accountInformationPage().country;
        Select selectCountry = new Select(dropdownCountry);
        selectCountry.selectByVisibleText("Canada");

        Thread.sleep(500);
        elements.accountInformationPage().state.sendKeys("Ontario");

        elements.accountInformationPage().city.sendKeys("Toronto");

        elements.accountInformationPage().zipCode.sendKeys("66777");

        elements.accountInformationPage().mobileNumber.sendKeys("0014371234567");
    }

    @Then("Click Create Account button")
    public void click_create_account_button() {

        elements.accountInformationPage().createAccountButton.click();
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {

        Assert.assertTrue(elements.accountInformationPage().accountCreatedText.isDisplayed());
        Assert.assertEquals("ACCOUNT CREATED!", elements.accountInformationPage().accountCreatedText.getText());
    }

    @Then("Click Continue button")
    public void click_continue_button() {

        elements.accountInformationPage().clickContinueButton.click();
    }

    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {

        Assert.assertTrue(elements.mainPage().loggedInAsUsername.isDisplayed());
        Assert.assertEquals("Logged in as Fakename", elements.mainPage().loggedInAsUsername.getText());
    }

    @Then("Click Delete Account button")
    public void click_delete_account_button() {

        elements.mainPage().deleteAccountButton.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {

        Assert.assertTrue(elements.mainPage().accountDeletedText.isDisplayed());
        Assert.assertEquals("ACCOUNT DELETED!", elements.mainPage().accountDeletedText.getText());

        elements.mainPage().continueButton.click();
    }

    @And("Click logout button")
    public void clickLogoutButton() {

        elements.mainPage().signupLoginButton.click();  // logout button has the same xpath with login button
    }

    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {

        Assert.assertTrue(elements.loginSignupPage().loginAccountText.isDisplayed());
        Assert.assertEquals("Login to your account", elements.loginSignupPage().loginAccountText.getText());
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {

        elements.loginSignupPage().loginEmail.sendKeys(emailLogin);
        elements.loginSignupPage().loginPassword.sendKeys("123456789");
    }

    @When("Click login button")
    public void clickLoginButton() {

        elements.loginSignupPage().loginButton.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {

        Assert.assertTrue(elements.mainPage().accountDeletedText.isDisplayed());
        Assert.assertEquals("ACCOUNT DELETED!", elements.mainPage().accountDeletedText.getText());
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {

        elements.loginSignupPage().loginEmail.sendKeys("wrongemail@gmail.com");
        elements.loginSignupPage().loginPassword.sendKeys("123abc789");
    }

    @Then("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {

        Assert.assertTrue(elements.loginSignupPage().incorrectEmailPassword.isDisplayed());
        Assert.assertEquals("Your email or password is incorrect!", elements.loginSignupPage().incorrectEmailPassword.getText());
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {

        Assert.assertTrue(elements.loginSignupPage().loginAccountText.isDisplayed());
        Assert.assertEquals("Login to your account", elements.loginSignupPage().loginAccountText.getText());
    }

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() throws InterruptedException {

        elements.loginSignupPage().signupName.sendKeys("Fakename");
        Thread.sleep(500);
        elements.loginSignupPage().signupEmail.sendKeys(emailLogin);
    }

    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {

        Assert.assertTrue(elements.loginSignupPage().incorrectEmailPassword.isDisplayed()); // email exist text has same xpath with incorrect email message
        Assert.assertEquals("Email Address already exist!", elements.loginSignupPage().incorrectEmailPassword.getText());
    }
}
