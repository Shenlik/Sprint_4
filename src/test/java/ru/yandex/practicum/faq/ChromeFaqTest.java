package ru.yandex.practicum.faq;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFaqTest extends FaqTest{

    public ChromeFaqTest() {
        super(new ChromeDriver());
    }


    @BeforeClass
    public static void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/WebDriver/bin/chromedriver");
    }
}
