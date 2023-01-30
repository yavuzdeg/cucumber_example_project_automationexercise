package TestingProject.pages;

public class AllPages {


    public AllPages(){}

    private MainPage mainPage;
    private LoginSignupPage loginSignupPage;
    private AccountInformationPage accountInformationPage;


    public MainPage mainPage(){
        if (mainPage == null){
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public LoginSignupPage loginSignupPage(){
        if (loginSignupPage == null){
            loginSignupPage = new LoginSignupPage();
        }
        return loginSignupPage;
    }

    public AccountInformationPage accountInformationPage(){
        if (accountInformationPage == null){
            accountInformationPage = new AccountInformationPage();
        }
        return accountInformationPage;
    }


}
