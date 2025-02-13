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

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void openWebsite() {
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            Assert.assertTrue(page.title().contains("Playwright"));
    }
}
