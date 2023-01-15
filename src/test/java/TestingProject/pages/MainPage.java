package TestingProject.pages;

import TestingProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='carousel-inner']")
    public WebElement mainPageCarousel;

    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement signupLoginButton;

}
