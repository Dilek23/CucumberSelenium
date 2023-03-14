package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Homework02Page {

    private WebDriver driver;

    public Homework02Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div/input")
    private WebElement searchText;

    public void searcWord(String value) {
        searchText.sendKeys(value + Keys.ENTER);

    }
}