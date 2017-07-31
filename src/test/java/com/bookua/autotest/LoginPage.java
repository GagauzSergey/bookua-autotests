package com.bookua.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 29.07.2017.
 */
public class LoginPage {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    GeneralInfo generalInfo;
    WebElement searchTextOnPage;
    String searchTextOnPageVerify;

    public LoginPage(WebDriver driver) {
        webDriver = driver;
        webDriverWait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }

    //Authorization
    @FindBy(css = "#header > div.header_top > div > div > div:nth-child(2) > div > ul > li:nth-child(4) > span > a")
    WebElement enterLogin;

    @FindBy(id = "UserNameLog")
    WebElement emailLogin;

    @FindBy(id = "PasswordLog")
    WebElement passwordLogin;

    @FindBy(css = "#form > div > div > div.col-md-8 > div > div:nth-child(1) > div > form > button")
    WebElement enterAuthorButton;

    //Registration
    @FindBy(id = "UserName")
    WebElement newEmailAccount;

    @FindBy(id = "Password")
    WebElement newPasswordAccount;

    @FindBy(id = "password")
    WebElement newConfirmPasswordAccount;

    @FindBy(css = "#form > div > div > div.col-md-8 > div > div:nth-child(3) > div > div > form > button")
    WebElement registerSignInButton;

    @FindBy (css = "#header > div.header-middle > div > div > div:nth-child(1) > div > a > img")
    WebElement generalEmblem;

    @FindBy (css = "#header > div.header_top > div > div > div:nth-child(2) > div > ul > li:nth-child(1) > span:nth-child(2) > a")
    WebElement personalCabinetLink;

    public void searchText(String string) {
        WebElement s = searchTextOnPage.findElement(By.tagName(string));
        if (s.isEnabled()) {
            System.out.println("Text search is successful for: "+ string);
        } else System.out.println("Text search is failed for: "+ string);
    }
}
