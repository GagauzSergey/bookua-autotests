package com.bookua.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 26.08.2017.
 */
public class CartCheckout {
    WebDriver webDriver;
    WebDriverWait webDriverWait;


    public CartCheckout(WebDriver driver) {
        webDriver = driver;
        webDriverWait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(css = "#Name")
    WebElement customerFirstName;

    @FindBy(css = "#FirstName")
    WebElement customerLastName;

    @FindBy(css = "#Phone")
    WebElement customerPhone;

    @FindBy(css = "#Mail")
    WebElement customerMail;

    @FindBy(css = "#Delivery")
    WebElement customerDelivery;

    @FindBy(css = "#Adress")
    WebElement customerAddress;

    @FindBy(css = "#comment")
    WebElement customerComment;

    @FindBy(css = "body > div > div > div.col-md-8 > div > div > div > form > " +
            "fieldset > div:nth-child(2) > div.col-sm-9 > button")
    WebElement orderSubmit;

// in progress 2017.08.26
}
