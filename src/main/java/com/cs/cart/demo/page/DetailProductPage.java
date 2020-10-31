package com.cs.cart.demo.page;

import org.openqa.selenium.WebDriver;

public class DetailProductPage extends BasePage {

    public DetailProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonAddToCart(String code) throws InterruptedException {
        dsl.getById("button_cart_" + code).click();
        Thread.sleep(1000);
    }

    public void clickButtonCloseNotification() {
        dsl.getByClassName("cm-notification-close").click();
    }

    public void clickImageCart() {
        dsl.getByXpath("//*[@id=\"sw_dropdown_8\"]/a/i").click();
    }

    public void clickButtonViewCartInsideImageCart() {
        dsl.switchToActiveElement();
        dsl.getByXpath("//*[@id=\"dropdown_8\"]/div/div[2]/div[1]/a").click();
    }

}