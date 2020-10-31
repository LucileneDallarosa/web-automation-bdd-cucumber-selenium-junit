package com.cs.cart.demo.page;

import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage{

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    public String getMessage() {
        return dsl.getByClassName("ty-tygh").getText();
    }
}