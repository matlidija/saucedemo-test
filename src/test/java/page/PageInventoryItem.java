package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageInventoryItem extends BaseTest {
    public PageInventoryItem(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCardItemTwo;

    public void clickAddToCardItemTwo(){
        wdwait.until(ExpectedConditions.elementToBeClickable(addToCardItemTwo));
        addToCardItemTwo.click();
    }
}
