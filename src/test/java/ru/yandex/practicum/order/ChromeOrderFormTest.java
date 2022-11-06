package ru.yandex.practicum.order;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOrderFormTest extends OrderFormTest{

    public ChromeOrderFormTest() {
        super(new ChromeDriver());
    }


    @BeforeClass
    public static void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/WebDriver/bin/chromedriver");
    }


}
