package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageCard extends BaseTest {
    public PageCard(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "continue-shopping")
    WebElement buttonContinueShopping;
    @FindBy(css = ".shopping_cart_badge")
    WebElement checkCardBadge;
    @FindBy(name = "remove-sauce-labs-backpack")
    WebElement buttonRemoveLabs;
    @FindBy(id = "checkout")
    WebElement buttonCheckout;

    public PageCard clickButtonCheckout(){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonCheckout));
        buttonCheckout.click();
        return this;
    }

    public PageCard clickButtonRemoveLabs(){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonRemoveLabs));
        buttonRemoveLabs.click();
        return this;
    }

    public PageCard clickCheckCardBadge(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkCardBadge));
        checkCardBadge.click();
        return this;
    }

    public boolean checkCardBadgeIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkCardBadge));
        return checkCardBadge.isDisplayed();
    }

    public String checkCardBadgeIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkCardBadge));
        return checkCardBadge.getText();
    }

    public void clickButtonContinueShopping(){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonContinueShopping));
        buttonContinueShopping.click();
    }


}
