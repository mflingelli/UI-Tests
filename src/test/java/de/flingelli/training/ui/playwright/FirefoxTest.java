package de.flingelli.training.ui.playwright;

import com.microsoft.playwright.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirefoxTest extends CommonBrowserTest {

    @BeforeMethod
    public void setup() {
        super.setBrowser(getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)));
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
    }

    @Test
    public void openWebsite() {
        super.openWebsite();
    }

    @Test
    public void shouldSearchWiki() {
        super.shouldSearchWiki();
    }
}
