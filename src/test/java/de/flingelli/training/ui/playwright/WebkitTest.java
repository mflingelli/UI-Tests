package de.flingelli.training.ui.playwright;

import com.microsoft.playwright.BrowserType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebkitTest extends CommonBrowserTest {

    @BeforeMethod
    public void setup() {
        super.setBrowser(getPlaywright().webkit().launch(new BrowserType.LaunchOptions().setHeadless(false)));
    }

    @Test
    public void openWebsite() {
        super.openWebsite();
    }
}
