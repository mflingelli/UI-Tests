package de.flingelli.training.ui.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirefoxHeadlessTest extends CommonBrowserTest {
    @BeforeMethod
    public void setup() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.setCapability("webSocketUrl", true);
        setDriver(new FirefoxDriver(options));
    }

    @Test
    public void checkWebElements() {
        super.checkWebElements();
    }

    @AfterMethod
    public void teardown() {
        getDriver().quit();
    }
}
