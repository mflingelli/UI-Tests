package de.flingelli.training.ui.playwright;

import com.microsoft.playwright.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeTest extends CommonBrowserTest {

    @BeforeMethod
    public void setup() {
        super.setBrowser(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
    }

    @Test
    public void openWebsite() {
        super.openWebsite();
    }
}
