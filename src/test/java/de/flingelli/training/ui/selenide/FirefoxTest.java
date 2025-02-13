package de.flingelli.training.ui.selenide;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirefoxTest extends CommonBrowserTest {

    @BeforeMethod
    public void setup() {
        Configuration.browser = Browsers.FIREFOX;
    }

    @Test
    public void searchResults() throws InterruptedException {
        super.searchResults();
    }

    @Test
    public void firstSearchResult() {
        super.firstSearchResult();
    }
}
