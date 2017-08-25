package com.bookua.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 26.08.2017.
 */
public class SetupDriver {

    WebDriver webDriver;

    public WebDriver SetupNewDriver() {
        webDriver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30, 500);
        webDriver.get("http://books.ua");
        return webDriver;
    }
}
