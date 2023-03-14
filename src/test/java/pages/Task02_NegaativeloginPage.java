package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task02_NegaativeloginPage {
    private WebDriver driver;

    public Task02_NegaativeloginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(partialLinkText = "Login")
    private WebElement login;

    public void userNameGir(String name){
        username.sendKeys(name);

    }
    public void passWordGir(String passWord){
        password.sendKeys(passWord);
    }
    public void loginOl(){
        login.click();
    }
    @FindBy(className = "oxd-alert-content-text")
    public WebElement error;

}
