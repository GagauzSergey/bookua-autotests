package com.bookua.autotest;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Gagauz Sergey
 * Created by user on 26.07.2017.
 */
public class RegistrationTests {
    WebDriver webDriver;
    MainPage mainPage;
    LoginPage loginPage;
    Catalog catalog;

    @Before
    public void start (){
        webDriver = new SetupDriver().SetupDriver();
        mainPage = new MainPage(webDriver);
        loginPage = new LoginPage(webDriver);
        catalog = new Catalog(webDriver);
    }

 @Test
     public void searchTest(String text) {
         System.out.println("Start testing: Test#1");
         mainPage.searchOnWebSite(text);
         mainPage.clickOnSearchField();
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

