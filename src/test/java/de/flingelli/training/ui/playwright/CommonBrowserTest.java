package de.flingelli.training.ui.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.Assert;

public class CommonBrowserTest {
    private Playwright playwright = Playwright.create();
    private Browser browser;

    public Playwright getPlaywright() {
        return playwright;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void tearDown() {
        if (browser != null) {
            browser.close();
        }
    }

    public void openWebsite() {
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            Assert.assertTrue(page.title().contains("Playwright"));
    }

    public void shouldSearchWiki() {
        Page page = getBrowser().newPage();
        page.navigate("https://www.wikipedia.org/");
        page.locator("input[name=\"search\"]").click();
        page.locator("input[name=\"search\"]").fill("playwright");
        page.locator("input[name=\"search\"]").press("Enter");
        Assert.assertTrue(page.url().startsWith("https://de.wikipedia.org"));
    }
}
