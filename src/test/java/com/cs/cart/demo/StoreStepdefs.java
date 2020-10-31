package com.cs.cart.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class StoreStepdefs extends BaseTest {

    @Given("^Access WebPage (.+)$")
    public void openCsCartWebPage(String url) {
        super.openWebSite(url);
    }

    @When("^Search for (.+)$")
    public void searchFor(String searchTerm) {
        homePage.setSearchInput(searchTerm);
        homePage.clickButtonSearch();
    }

    @When("^Access the product code (.+) on the table grid$")
    public void clickProduct(String code) {
        searchResultsPage.clickProduct(code);
    }

    @When("^Add the product code (.+) to the cart$")
    public void addItemOnCart(String code) throws InterruptedException {
        javaScriptHelper.scrollPage250();
        detailProductPage.clickButtonAddToCart(code);
        detailProductPage.clickButtonCloseNotification();
    }

    @When("^Check the item (.+) on the cart and total price (.+)$")
    public void checkItemAndTotalPrice(String item, String totalPrice) throws InterruptedException {
        javaScriptHelper.scrollPage0();
        detailProductPage.clickImageCart();
        detailProductPage.clickButtonViewCartInsideImageCart();

        Assert.assertEquals(item, cartPage.getItem());
        Assert.assertEquals(totalPrice, cartPage.getOrderTotal());
    }

    @When("^Do the Checkout$")
    public void doCheckout() {
        cartPage.clickButtonCheckout();
    }

    @When("^Select the “Phone Order” Payment, address: (.+) and e-mail: (.+)$")
    public void phoneOrdering(String address, String email) throws InterruptedException {
        javaScriptHelper.scrollPage250();
        paymentPage.setAddress(address);
        paymentPage.setEmail(email);

        javaScriptHelper.scrollPage850();
        paymentPage.clickPhoneOrder();
        paymentPage.clickCheckboxTermsAndConditions();
    }

    @Then("^Proceed with the order$")
    public void validateProceedWithTheOrder() throws InterruptedException {
        javaScriptHelper.removeElementCaptcha();
        paymentPage.clickPlaceOrder();

        assertTrue(checkoutCompletePage.getMessage().contains("Congratulations"));
        assertTrue(checkoutCompletePage.getMessage().contains("Your order has been successfully placed"));
    }

    @Then("^Close WebPage$")
    public void closeWebPage() {
        super.closeWebSite();
    }

}
