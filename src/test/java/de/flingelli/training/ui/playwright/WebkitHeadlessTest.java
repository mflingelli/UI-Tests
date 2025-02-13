package de.flingelli.training.ui.playwright;

import com.microsoft.playwright.BrowserType;
import org.apache.commons.lang3.SystemUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebkitHeadlessTest extends CommonBrowserTest {

    @BeforeMethod
    public void setup() {
        super.setBrowser(getPlaywright().webkit().launch(new BrowserType.LaunchOptions().setHeadless(true)));
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
    }

    @Test
    public void openWebsite() {
        if (SystemUtils.IS_OS_WINDOWS) {
            super.openWebsite();
        }
    }
}
