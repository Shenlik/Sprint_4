package ru.yandex.practicum.order;

import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxOrderFormTest extends OrderFormTest{

    public FirefoxOrderFormTest() {
        super(new FirefoxDriver());
    }

    @BeforeClass
    public static void setupDriver() {
        System.setProperty("webdriver.gecko.driver", "/Users/user/Desktop/WebDriver/bin/geckodriver");
    }

}
