package de.flingelli.training.ui.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeHeadlessTest extends CommonBrowserTest {
    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        setDriver(new ChromeDriver(options));
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
