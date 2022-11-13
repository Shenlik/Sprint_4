package ru.yandex.practicum.faq;

import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxFaqTest extends FaqTest {

    public FirefoxFaqTest() {
        super(new FirefoxDriver());
    }

    @BeforeClass
    public static void setupDriver() {
        System.setProperty("webdriver.gecko.driver", "/Users/user/Desktop/WebDriver/bin/geckodriver");
    }

}
