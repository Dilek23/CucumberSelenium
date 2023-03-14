package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Homework01Pages {

    public Homework01Pages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div/input")
    private WebElement searchText;

    public void searcWord(String value){
        searchText.sendKeys(value+ Keys.ENTER);

    }
}
