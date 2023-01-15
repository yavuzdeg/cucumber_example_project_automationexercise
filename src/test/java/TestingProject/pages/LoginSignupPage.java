package TestingProject.pages;

import TestingProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSignupPage {

    public LoginSignupPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='signup-form']/h2")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement signupName;

    @FindBy(xpath = "(//*[@name='email'])[2]")
    public WebElement signupEmail;

    @FindBy(xpath = "//*[@class='signup-form']//*[@class='btn btn-default']")
    public WebElement signupButton;
}
