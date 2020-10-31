package com.cs.cart.demo.page;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void setSearchInput(String search) {
        dsl.getById("search_input").sendKeys(search);
    }

    public void clickButtonSearch() {
        dsl.getByXpath("//*[@id=\"tygh_main_container\"]/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/button").click();
    }

}