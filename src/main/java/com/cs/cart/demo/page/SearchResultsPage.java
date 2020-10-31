package com.cs.cart.demo.page;

import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage{

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickProduct(String code) {
        dsl.getById("det_img_" + code).click();
    }

}
