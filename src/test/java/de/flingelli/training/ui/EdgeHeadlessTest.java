package de.flingelli.training.ui;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EdgeHeadlessTest extends CommonBrowserTest {
    @BeforeMethod
    public void setup() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("headless");
        setDriver(new EdgeDriver(options));
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
