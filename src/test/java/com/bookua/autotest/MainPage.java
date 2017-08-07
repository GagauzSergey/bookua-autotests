package com.bookua.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

/**
 * @author Gagauz Sergey
 *         Created by user on 26.07.2017.
 */
public class MainPage {
    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public MainPage(WebDriver driver) {
        webDriver = driver;
        webDriverWait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }

    //Searching on Web-Site
    @FindBy(id = "searchData")
    WebElement searchField;

    @FindBy(css = "#search>form>input.search-submit")
    WebElement searchButton;

    //Main Menu General Links
    @FindBy(css = "#header > div.header-bottom > div > div > div > div.mainmenu > ul > li:nth-child(1) > a")
    WebElement mainLink;

    @FindBy(css = "#header > div.header-bottom > div > div > div > div.mainmenu > ul > li:nth-child(2) > a")
    WebElement aboutAsLink;

    @FindBy(css = "#header > div.header-bottom > div > div > div > div.mainmenu > ul > li:nth-child(3) > a")
    WebElement DeliveryAndPaymentLink;

    @FindBy(css = "#header > div.header-bottom > div > div > div > div.mainmenu > ul > li:nth-child(4) > a")
    WebElement discontLink;

    @FindBy(css = "#header > div.header-bottom > div > div > div > div.mainmenu > ul > li:nth-child(5) > a")
    WebElement stockLink;

    @FindBy(css = "#header > div.header-bottom > div > div > div > div.mainmenu > ul > li:nth-child(6) > a")
    WebElement newsLink;

    @FindBy(css = "#header > div.header-bottom > div > div > div > div.mainmenu > ul > li:nth-child(7) > a")
    WebElement contactsLink;

    @FindBy(id = "#accordian > div:nth-child(1) > div.panel-heading > p > a:nth-child(2)")
    WebElement catalogMenu;


    public void searchOnWebSite(String stringForSearch) {
        searchField.click();
        searchField.sendKeys(stringForSearch);
    }

    public void clickOnSearchField() {
        searchButton.submit();
    }
}
