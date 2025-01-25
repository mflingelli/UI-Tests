package de.flingelli.training.ui;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirefoxTest extends CommonBrowserTest {
    @BeforeMethod
    public void setup() {
        setDriver(new FirefoxDriver());
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
