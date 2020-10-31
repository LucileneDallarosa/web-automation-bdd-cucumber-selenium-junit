package com.cs.cart.demo;

import com.cs.cart.demo.page.*;
import com.cs.cart.demo.utils.JavaScriptHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    protected JavaScriptHelper javaScriptHelper;

    protected HomePage homePage;
    protected SearchResultsPage searchResultsPage;
    protected DetailProductPage detailProductPage;
    protected CartPage cartPage;
    protected PaymentPage paymentPage;
    protected CheckoutCompletePage checkoutCompletePage;

    public void openWebSite(String url) {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        javaScriptHelper = new JavaScriptHelper(driver);

        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        detailProductPage = new DetailProductPage(driver);
        cartPage = new CartPage(driver);
        paymentPage = new PaymentPage(driver);
        checkoutCompletePage = new CheckoutCompletePage(driver);
    }

    public void closeWebSite() {
        driver.quit();
    }

}
