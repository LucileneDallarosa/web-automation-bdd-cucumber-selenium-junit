package com.cs.cart.demo.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptHelper {

    private final WebDriver driver;

    public JavaScriptHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollPage0() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0,0)", "");
        Thread.sleep(1000);
    }

    public void scrollPage250() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0,250)", "");
        Thread.sleep(1000);
    }

    public void scrollPage850() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0,850)", "");
        Thread.sleep(1000);
    }

    public void removeElementCaptcha() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("return document.getElementsByClassName('captcha')[0].remove();");
    }
}
