package com.cs.cart.demo.page;

import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage{

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public void setAddress(String address) {
        dsl.getById("litecheckout_s_address").sendKeys(address);
    }

    public void setEmail(String email) {
        dsl.getById("litecheckout_email").sendKeys(email);
    }

    public void clickPhoneOrder() throws InterruptedException {
        dsl.getById("payments_2").click();
        Thread.sleep(1000);
    }

    public void clickCheckboxTermsAndConditions() {
        dsl.getByName("accept_terms").click();
    }

    public void clickPlaceOrder() throws InterruptedException {
        dsl.getByClassName("litecheckout__submit-btn").click();
        Thread.sleep(1000);
    }
}
