package com.automation.tests;

import com.automation.pages.BasePage;
import com.microsoft.playwright.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class TitleTest {
    Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;

    @BeforeClass
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        context = browser.newContext();
        page = context.newPage();
    }

    @Test
    public void validateTitle() {
        BasePage basePage = new BasePage(page);
        basePage.openUrl("https://atroverse.com");
        String title = page.title();
        Assert.assertEquals(title, "Atroverse");
    }

    @AfterClass
    public void tearDown() {
        browser.close();
        playwright.close();
    }
}