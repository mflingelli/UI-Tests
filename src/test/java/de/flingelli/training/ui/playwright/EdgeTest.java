package de.flingelli.training.ui.playwright;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class EdgeTest extends CommonBrowserTest {
    private static final String WIN = "win";
    private static final String MSEDGE = "msedge";
    private final String osName = System.getProperty("os.name").toLowerCase();

    @BeforeMethod
    public void setup() {
        if (osName.contains(WIN)) {
            super.setBrowser(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setChannel(MSEDGE).setHeadless(false)));
        }
    }

    @AfterMethod
    public void tearDown() {
        if (osName.contains(WIN)) {
            super.tearDown();
        }
    }

    @Test
    public void openWebsite() {
        if (osName.contains(WIN)) {
            super.openWebsite();
        }
    }

    @Test
    public void takeScreenshot() {
        if (osName.contains(WIN)) {
            Page page = getBrowser().newPage();
            page.navigate("https://playwright.dev/");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("target/screenshot-edge.png")));
        }
    }

    @Test
    public void shouldSearchWiki() {
        if (osName.contains(WIN)) {
            super.shouldSearchWiki();
        }
    }
}
