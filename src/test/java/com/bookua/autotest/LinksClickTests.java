package com.bookua.autotest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Gagauz Sergey
 *         Created by user on 06.08.2017.
 */
public class LinksClickTests {
    WebDriver webDriver;
    MainPage mainPage;
    LoginPage loginPage;
    Catalog catalog;

    @Before
    public void installation() {
        webDriver = new SetupDriver().SetupNewDriver();
        mainPage = new MainPage(webDriver);
        loginPage = new LoginPage(webDriver);
        catalog = new Catalog(webDriver);
    }

    @Test
    public void mainElemensCheckTest() {
        mainPage.mainLink.click();
        mainPage.aboutAsLink.click();
        mainPage.DeliveryAndPaymentLink.click();
        mainPage.discontLink.click();
        mainPage.stockLink.click();
        mainPage.newsLink.click();
        mainPage.contactsLink.click();
    }

    @Test
    public void checkCatalogueElementsTitleTest() {
        catalog.checkCatalogueElementsTitle();
    }

    @Test
    public void checkCatalogLinksEnabled() {
        catalog.checkClickOnCatalogLinksTest();
    }

    @After
    public void shutdown() {
        webDriver.close();
    }
}
