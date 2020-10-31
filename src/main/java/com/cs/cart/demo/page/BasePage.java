package com.cs.cart.demo.page;

import com.cs.cart.demo.service.DSL;
import org.openqa.selenium.WebDriver;

public class BasePage {

    DSL dsl;

    BasePage(WebDriver driver) {
        dsl = new DSL(driver);
    }
}
