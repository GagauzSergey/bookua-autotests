package com.bookua.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 01.08.2017.
 */
public class Catalog {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public Catalog(WebDriver driver) {
        webDriver = driver;
        webDriverWait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }

//  Catalog elements

    @FindBy (css = "#accordian > div:nth-child(1) > div.panel-heading > p > a:nth-child(2)")
    WebElement litForKidsLink; //Литература для детей и юношества

    @FindBy (css = "#accordian > div:nth-child(2) > div.panel-heading > p > a:nth-child(2)")
    WebElement litMedicineLink; //Литература для медицины

    @FindBy (css = "#accordian > div:nth-child(3) > div.panel-heading > p > a:nth-child(2)")
    WebElement litArtLink; //Литература для искусства

    @FindBy (css = "#accordian > div:nth-child(4) > div.panel-heading > p > a:nth-child(2)")
    WebElement litEsotericLink; //Литература для эзотерики

    @FindBy (css = "#accordian > div:nth-child(5) > div.panel-heading > p > a:nth-child(2)")
    WebElement litItLink; //Литература для IT

    @FindBy (css = "#accordian > div:nth-child(6) > div.panel-heading > p > a:nth-child(2)")
    WebElement litScienceLink; //Научно-популярная литерату

    @FindBy (css = "#accordian > div:nth-child(7) > div.panel-heading > p > a:nth-child(2)")
    WebElement litEncyclopediaLink; //Энциклопедия

    // In progress...
    // Last update 2017.08.01

}
