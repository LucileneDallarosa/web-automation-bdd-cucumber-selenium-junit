package com.cs.cart.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-store.json", "html:target/cucumber-store"})
public class RunStoreTest {
}
