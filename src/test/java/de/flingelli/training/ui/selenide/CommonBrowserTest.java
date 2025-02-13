package de.flingelli.training.ui.selenide;

import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public abstract class CommonBrowserTest {
    public abstract void setup();

    public void searchResults() throws InterruptedException {
        open("https://duckduckgo.com");
        $(By.name("q")).val("selenide java").pressEnter();
        $$("[data-testid=\"result\"]").shouldHave(sizeGreaterThan(1));
    }

    public void firstSearchResult() {
        open("https://duckduckgo.com");
        $(By.name("q")).val("selenide java").pressEnter();
        $("#r1-" + 0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
