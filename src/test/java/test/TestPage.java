package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class TestPage extends BaseTest {
    PageHome pageHome;
    PageInventory pageInventory;
    PageCard pageCard;
    PageInventoryItem pageInventoryItem;
    PageCheckoutOne pageCheckoutOne;
    PageCheckoutTwo pageCheckoutTwo;
    PageCheckoutComplete pageCheckoutComplete;

    @Before
    public void setUpTest(){
        pageHome = new PageHome();
        pageInventory = new PageInventory();
        pageCard = new PageCard();
        pageInventoryItem = new PageInventoryItem();
        pageCheckoutOne = new PageCheckoutOne();
        pageCheckoutTwo = new PageCheckoutTwo();
        pageCheckoutComplete = new PageCheckoutComplete();
    }
    //Test for login user
    @Test
    public void loginPage(){
        pageHome.typeUserNameField("standard_user")
                .typePasswordField("secret_sauce")
                .clickLoginButton();
        Assert.assertTrue(pageInventory.titleSelectIsDisplay());
        Assert.assertEquals("PRODUCTS", pageInventory.titleSelectIsGet());
        pageInventory.clickMenuButton()
                     .clickLogoutButton();
    }
    //Automation test assignment details
    @Test
    public void itemAndShoping(){
        pageHome.typeUserNameField("standard_user")
                .typePasswordField("secret_sauce")
                .clickLoginButton();
        pageInventory.clickAddToCardButton();
        Assert.assertTrue(pageInventory.titleSelectIsDisplay());
        Assert.assertEquals("1", pageInventory.cartBadgeIsGetText());
        pageInventory.clickCardBadge();
        pageCard.clickButtonContinueShopping();
        pageInventory.clickItemName();
        pageInventoryItem.clickAddToCardItemTwo();
        Assert.assertTrue(pageCard.checkCardBadgeIsDisplay());
        Assert.assertEquals("2", pageCard.checkCardBadgeIsGetText());
        pageCard.clickCheckCardBadge()
                .clickButtonRemoveLabs()
                .clickButtonCheckout();
        pageCheckoutOne.inputFirstNameField("Lidija")
                       .inputLastNameField("Matic")
                       .inputPostalCodeField("26232")
                       .clickContinueButton();
        js.executeScript("window.scrollBy(0,200)");
        pageCheckoutTwo.clickFinishButton();
        js.executeScript("window.scrollBy(0,-200)");
        Assert.assertTrue(pageCheckoutComplete.completeHeaderTextIsDisplay());
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", pageCheckoutComplete.completeHeaderTextIsGet());
    }
    //Test login locked user and close message
    @Test
    public void lockedUser(){
        pageHome.typeUserNameField("locked_out_user")
                .typePasswordField("secret_sauce")
                .clickLoginButton();
        Assert.assertTrue(pageHome.lockedUserIsDisplay());
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", pageHome.lockedUserIsGetText());
        pageHome.clickExitLockedMess();
    }
}
