package de.flingelli.training.ui.playwright;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Paths;


public class ChromeTest extends CommonBrowserTest {

    @BeforeMethod
    public void setup() {
        super.setBrowser(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
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
    public void takeScreenshot() {
        Page page = getBrowser().newPage();
        page.navigate("https://playwright.dev/");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("target/screenshot-chrome.png")));
    }

    @Test
    public void shouldSearchWiki() {
        super.shouldSearchWiki();
    }
}
