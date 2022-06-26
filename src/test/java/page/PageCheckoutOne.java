package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageCheckoutOne extends BaseTest {
    public PageCheckoutOne(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "first-name")
    WebElement firstNameField;
    @FindBy(id = "last-name")
    WebElement lastNameField;
    @FindBy(css = "*[data-test=\"postalCode\"]")
    WebElement postalCodeField;
    @FindBy(css = "*[data-test=\"continue\"]")
    WebElement continueButton;

    public PageCheckoutOne clickContinueButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
        return this;
    }
    public PageCheckoutOne inputPostalCodeField(String postal){
        wdwait.until(ExpectedConditions.elementToBeClickable(postalCodeField));
        postalCodeField.clear();
        postalCodeField.sendKeys(postal);
        return this;
    }

    public PageCheckoutOne inputLastNameField(String lastname){
        wdwait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);
        return this;
    }
    public PageCheckoutOne inputFirstNameField(String name){
        wdwait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.clear();
        firstNameField.sendKeys(name);
        return this;
    }

}
