package ru.yandex.practicum.order;

import org.junit.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.practicum.pageobject.MainPage;
import ru.yandex.practicum.pageobject.OrderPage;
import ru.yandex.practicum.pageobject.RentPage;

import java.util.concurrent.TimeUnit;

public abstract class OrderFormTest {

    private RemoteWebDriver driver;

    public OrderFormTest(RemoteWebDriver driver) {
        this.driver = driver;
    }

    @Before
    public void setUp() {
        new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void shouldFillOrderForm()  {
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        RentPage rentPage = new RentPage(driver);

        mainPage
                .open()
                .clickOrderTopButton();

        orderPage
                .fillNameField("Лика")
                .fillSurnameField("Чайник")
                .fillAddressField("Болото")
                .fillMetroField("Киевская")
                .fillPhoneField("+79870007744")
                .clickNextButton();

        rentPage
                .fillDateField("31.12.2022")
                .fillPeriodField()
                .fillColourField()
                .fillCommentField("112")
                .clickNextOrderButton()
                .clickYesButton();


      Assert.assertTrue(rentPage.isOrdered());
    }

    @Test
    public void shouldFillOrderFormWithBottomButton() {
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        RentPage rentPage = new RentPage(driver);

        mainPage
                .open()
                .clickOrderBottomButton();

        orderPage
                .fillNameField("Петя")
                .fillSurnameField("Вареников")
                .fillAddressField("Дыра 5к1")
                .fillMetroField("Селигерская")
                .fillPhoneField("+79528889922")
                .clickNextButton();

        rentPage
                .fillDateField("14.12.2022")
                .fillPeriodField()
                .fillColourField()
                .fillCommentField("Что тут скажешь?")
                .clickNextOrderButton()
                .clickYesButton();


      Assert.assertTrue(rentPage.isOrdered());
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
