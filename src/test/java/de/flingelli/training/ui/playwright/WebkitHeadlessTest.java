package de.flingelli.training.ui.playwright;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Paths;

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
        super.openWebsite();
    }

    @Test
    public void shouldSearchWiki() {
        super.shouldSearchWiki();
    }

    @Test
    public void takeScreenshot() {
        Page page = getBrowser().newPage();
        page.navigate("https://playwright.dev/");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("target/screenshot-webkit-headless.png")));
    }
}
