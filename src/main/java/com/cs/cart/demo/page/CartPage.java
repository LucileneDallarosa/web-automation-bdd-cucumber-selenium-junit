package com.cs.cart.demo.page;

import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getOrderTotal() {
        return dsl.getById("sec_cart_total").getText();
    }

    public String getItem() {
        return dsl.getByXpath("//*[@id=\"cart_items\"]/table/tbody/tr/td[2]/a[1]").getText();
    }

    public void clickButtonCheckout() {
        dsl.getByXpath("//*[@id=\"checkout_form\"]/div[1]/div[2]/a").click();
    }
}