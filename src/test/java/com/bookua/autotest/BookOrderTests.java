package com.bookua.autotest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Gagauz Sergey
 *         Created by user on 24.08.2017.
 */
public class BookOrderTests {
    /*
    * Test Book Order
    * Procedure:
    * 1. Search the book with "The Moonstone" title by Collins Wilkie
    * 2. Choose the found book
    * 3. Add book to the basket
    * 4. Go to the order page
    * 5. Set all user fields
    * */
    WebDriver webDriver;
    MainPage mainPage;
    LoginPage loginPage;
    Catalog catalog;
    SetupDriver setupDriver;

    @Before
    public void installation() {
        webDriver = new SetupDriver().SetupDriver();
        mainPage = new MainPage(webDriver);
        loginPage = new LoginPage(webDriver);
        catalog = new Catalog(webDriver);
    }

    @Test
    public void bookOrderTest() {
        mainPage.searchOnWebSite("The Moonstone");
        mainPage.clickOnSearchField();
        webDriver.findElement(By.cssSelector
                ("#render_body > div > div > div > div > form > input.btn.btn-default.add-to-cart")).click();
        webDriver.findElement(By.cssSelector
                ("body > div > div > div.sidebar-right.col-md-2 > div > p:nth-child(1) > a"));
        webDriver.findElement(By.cssSelector("#do_action > div > div > div > a.btn.btn-default.check_out"));
// in progress...

    }

    @After
    public void shutdown() {
        //webDriver.close();
    }


}
