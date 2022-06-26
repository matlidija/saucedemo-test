package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageInventory extends BaseTest {
    public PageInventory(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton;
    @FindBy(css = ".title")
    WebElement titleSelect;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCardButton;
    @FindBy(css = ".shopping_cart_badge")
    WebElement cartBadge;
    @FindBy(css = "#item_0_title_link > .inventory_item_name")
    WebElement itemName;

    public void clickItemName(){
        wdwait.until(ExpectedConditions.elementToBeClickable(itemName));
        itemName.click();
    }

    public void clickCardBadge(){
        wdwait.until(ExpectedConditions.elementToBeClickable(cartBadge));
        cartBadge.click();
    }
    public boolean cartBadgeIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(cartBadge));
        return cartBadge.isDisplayed();
    }
    public String cartBadgeIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(cartBadge));
        return cartBadge.getText();
    }

    public void clickAddToCardButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(addToCardButton));
        addToCardButton.click();
    }
    public boolean titleSelectIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(titleSelect));
        return titleSelect.isDisplayed();
    }
    public String titleSelectIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(titleSelect));
        return titleSelect.getText();
    }
    public PageInventory clickLogoutButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
        return this;
    }
    public PageInventory clickMenuButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(menuButton));
        menuButton.click();
        return this;
    }

}
