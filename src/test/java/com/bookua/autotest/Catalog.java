package com.bookua.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

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

    @FindBy(css = "#accordian > div:nth-child(1) > div.panel-heading > p > a:nth-child(2)")
    WebElement forKidsBooksLink; //Литература для детей и юношества

    @FindBy(css = "#accordian > div:nth-child(2) > div.panel-heading > p > a:nth-child(2)")
    WebElement medicineBooksLink; //Литература для медицины

    @FindBy(css = "#accordian > div:nth-child(3) > div.panel-heading > p > a:nth-child(2)")
    WebElement artBooksLink; //Литература для искусства

    @FindBy(css = "#accordian > div:nth-child(4) > div.panel-heading > p > a:nth-child(2)")
    WebElement esotericBooksLink; //Литература для эзотерики

    @FindBy(css = "#accordian > div:nth-child(5) > div.panel-heading > p > a:nth-child(2)")
    WebElement itBooksLink; //Литература для IT

    @FindBy(css = "#accordian > div:nth-child(6) > div.panel-heading > p > a:nth-child(2)")
    WebElement scienceBooksLink; //Научно-популярная литерату

    @FindBy(css = "#accordian > div:nth-child(7) > div.panel-heading > p > a:nth-child(2)")
    WebElement eEncyclopediaBooksLink; //Энциклопедия

    @FindBy(css = "#accordian > div:nth-child(8) > div.panel-heading > p > a:nth-child(2)")
    WebElement belletristicBooksLink; //художественная литература

    @FindBy(css = "#accordian > div:nth-child(9) > div.panel-heading > p > a:nth-child(2)")
    WebElement economicBooksLink; //экономика

    @FindBy(css = "#accordian > div:nth-child(10) > div.panel-heading > p > a:nth-child(2)")
    WebElement lowerBookLink; //юридическая литература

    @FindBy(css = "#accordian > div:nth-child(11) > div.panel-heading > p > a:nth-child(2)")
    WebElement scienceAndTechnicBooksLink; //прикладная наука и техника

    @FindBy(css = "#accordian > div:nth-child(12) > div.panel-heading > p > a:nth-child(2)")
    WebElement musicNoteBooksLink; //музыка и ноты

    @FindBy(css = "#accordian > div:nth-child(13) > div.panel-heading > p > a:nth-child(2)")
    WebElement schoolBookLink; //школьная литература

    @FindBy(css = "#accordian > div:nth-child(14) > div.panel-heading > p > a:nth-child(2)")
    WebElement pedagogicBooksLink; //педагогика

    @FindBy(css = "#accordian > div:nth-child(15) > div.panel-heading > p > a:nth-child(2)")
    WebElement belletristicOnEnglishBooksLink; //худ.литература на английском

    @FindBy(css = "#accordian > div:nth-child(16) > div.panel-heading > p > a:nth-child(2)")
    WebElement tourismBooksLink; //туризм

    @FindBy(css = "#accordian > div:nth-child(17) > div.panel-heading > p > a:nth-child(2)")
    WebElement belletristicOnUkrainianBooksLink; //худ.литература на украинском

    @FindBy(css = "#accordian > div:nth-child(18) > div.panel-heading > p > a:nth-child(2)")
    WebElement naturalScienceBooksLink; //естественные науки

    @FindBy(css = "#accordian > div:nth-child(19) > div.panel-heading > p > a:nth-child(2)")
    WebElement futureScienceBooksLink;//футорология

    @FindBy(css = "#accordian > div:nth-child(20) > div.panel-heading > p > a:nth-child(2)")
    WebElement psychologyBooksLink; //психология

    @FindBy(css = "#accordian > div:nth-child(21) > div.panel-heading > p > a:nth-child(2)")
    WebElement socialAndHumanScienceBooksLink; //социальные науки

    @FindBy(css = "#accordian > div:nth-child(22) > div.panel-heading > p > a:nth-child(2)")
    WebElement homeAndEntertainmentBooksLink; // дом.быт.догуг

    @FindBy(css = "#accordian > div:nth-child(23) > div.panel-heading > p > a:nth-child(2)")
    WebElement audioBooksLink; //вудиокниги

    @FindBy(css = "#accordian > div:nth-child(24) > div.panel-heading > p > a:nth-child(2)")
    WebElement cdAndDvdBooksLink; //cd dvd книги


    public ArrayList<WebElement> getCatalogLinks() {
        ArrayList<WebElement> webElements = new ArrayList<>();
        for (int i = 1; i < 25; i++) {
            String cssSelector = "#accordian > div:nth-child(" + i + ") > div.panel-heading > p > a:nth-child(2)";
            WebElement webElementTemp = webDriver.findElement(By.cssSelector(cssSelector));
            webElements.add(webElementTemp);
            System.out.println(webElementTemp.getText());
        }
        System.out.println(webElements.toString());
        return webElements;
    }

    public void checkCatalogueElementsTitle() {
        ArrayList <WebElement> checkedWebElements = getCatalogLinks();
        System.out.println("Start Test...");
        for (WebElement webel : checkedWebElements) {
            System.out.println(webel+"go");
            if (webel.isEnabled()){
                System.out.println(webel.getText()+ " founded");
            }
            else System.out.println("no element");
        }
    }

    // In progress...
    // Last update 2017.08.02

}
