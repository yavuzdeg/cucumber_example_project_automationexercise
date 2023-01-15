package TestingProject.pages;

import TestingProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInformationPage {

    public AccountInformationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='title text-center'])[1]")
    public WebElement enterAccountInformationText;
}
