package com.cs.cart.demo.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DSL {

    private final WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToActiveElement() {
        driver.switchTo().activeElement();
    }

    public WebElement getByDescriptionFromTagName(String tagName, String text) {
        List<WebElement> listElement = driver.findElements(By.tagName(tagName));
        for (WebElement webElement : listElement) {
            if (text.equals(webElement.getText())) {
                return webElement;
            }
        }
        return null;
    }

    public WebElement getById(String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement getByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement getByClassName(String className) {
        return driver.findElement(By.className(className));
    }

    public WebElement getByName(String name) {
        return driver.findElement(By.name(name));
    }

    public void setSelect(String id, String value) {
        WebElement element = this.getById(id);
        Select combo = new Select(element);
        combo.selectByVisibleText(value);
    }

    public List<WebElement> getByXpathList(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }
}
