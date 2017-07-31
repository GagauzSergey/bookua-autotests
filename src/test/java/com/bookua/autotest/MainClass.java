package com.bookua.autotest;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by user on 26.07.2017.
 */
public class MainClass {
    WebDriver webDriver;
    MainPage mainPage;
    LoginPage loginPage;

    @Before
    public void installation() {
        webDriver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30, 500);
        mainPage = new MainPage(webDriver);
        loginPage = new LoginPage(webDriver);
        webDriver.get("http://books.ua");
    }

    @Test
    public void searchTest() {
        System.out.println("Start testing: Test#1");
        mainPage.searchOnWebSite("Хокинг Стивен");
        mainPage.clickOnSearchField();
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
    public void authorizationTestPositive() {
        //      webDriver.findElement(By.cssSelector("#header > div.header_top > " +
        //             "div > div > div:nth-child(2) > div > ul > li:nth-child(4) > span > a")).click();
        loginPage.enterLogin.click();
        loginPage.emailLogin.click();
        loginPage.emailLogin.sendKeys("gagauzgeneral@gmail.com");
        loginPage.passwordLogin.click();
        loginPage.passwordLogin.sendKeys("asd12345");
        loginPage.enterAuthorButton.submit();
        if (loginPage.personalCabinetLink.isEnabled()) {
            System.out.println("Test: Login is successfully passed");
        } else System.out.println("Test: Login is failed");
    }

    @Test
    public void authorizationTestNegative() {
        //      webDriver.findElement(By.cssSelector("#header > div.header_top > " +
        //             "div > div > div:nth-child(2) > div > ul > li:nth-child(4) > span > a")).click();
        loginPage.enterLogin.click();
        loginPage.emailLogin.click();
        loginPage.emailLogin.sendKeys("gagauzgeneral@gmail.com");
        loginPage.passwordLogin.click();
        loginPage.passwordLogin.sendKeys("");
        loginPage.enterAuthorButton.submit();
        if (loginPage.passwordLogin.isEnabled()) {
            System.out.println("Test: Negative Authorization Test is Passed");
        } else System.out.println("Test: Negative Authorization Test is Failed");
    }


    @After
    public void shutdown() {
        webDriver.close();
    }
}

