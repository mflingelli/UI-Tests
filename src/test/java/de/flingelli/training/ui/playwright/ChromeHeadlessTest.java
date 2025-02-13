package de.flingelli.training.ui.playwright;

import com.microsoft.playwright.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeHeadlessTest extends CommonBrowserTest {

    @BeforeMethod
    public void setup() {
        super.setBrowser(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(true)));
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
    }

    @Test
    public void openWebsite() {
        super.openWebsite();
    }
}
