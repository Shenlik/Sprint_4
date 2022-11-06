package ru.yandex.practicum.faq;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.practicum.pageobject.MainPage;

import java.util.concurrent.TimeUnit;

public abstract class FaqTest {

    private RemoteWebDriver driver;

    public FaqTest(RemoteWebDriver driver) {
        this.driver = driver;
    }

    @Before
    public void setUp() {
        new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void checkPriceAnswer() {
        MainPage mainPage = new MainPage(driver);

        String answer = mainPage
                .open()
                .scrollUntilFaq()
                .clickPriceQuestion()
                .getPriceAnswer();

        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", answer);
    }

    @Test
    public void checkSeveralScootersAnswer() {
        MainPage mainPage = new MainPage(driver);

        String answer = mainPage
                .open()
                .scrollUntilFaq()
                .clickSeveralScootersQuestion()
                .getSeveralScootersAnswer();

        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", answer);
    }

    @Test
    public void checkRentalTimeAnswer() {
        MainPage mainPage = new MainPage(driver);

        String answer = mainPage
                .open()
                .scrollUntilFaq()
                .clickRentalTimeQuestion()
                .getRentalTimeAnswer();

        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", answer);
    }

    @Test
    public void checkOrderTodayAnswer() {
        MainPage mainPage = new MainPage(driver);

        String answer = mainPage
                .open()
                .scrollUntilFaq()
                .clickOrderTodayQuestion()
                .getOrderTodayAnswer();

        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", answer);
    }

    @Test
    public void checkExtendOrderAnswer() {
        MainPage mainPage = new MainPage(driver);

        String answer = mainPage
                .open()
                .scrollUntilFaq()
                .clickExtendOrderQuestion()
                .getExtendOrderAnswer();

        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", answer);
    }

    @Test
    public void checkChargingWithScooterAnswer() {
        MainPage mainPage = new MainPage(driver);

        String answer = mainPage
                .open()
                .scrollUntilFaq()
                .clickChargingWithScooterQuestion()
                .getChargingWithScooterAnswer();

        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", answer);
    }

    @Test
    public void checkCancelOrderAnswer() {
        MainPage mainPage = new MainPage(driver);

        String answer = mainPage
                .open()
                .scrollUntilFaq()
                .clickCancelOrderQuestion()
                .getCancelOrderAnswer();

        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", answer);
    }

    @Test
    public void checkBeyondMKADAnswer() {
        MainPage mainPage = new MainPage(driver);

        String answer = mainPage
                .open()
                .scrollUntilFaq()
                .clickBeyondMKADQuestion()
                .getBeyondMKADAnswer();

        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", answer);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
