package ru.yandex.practicum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainPage {

    private final String url = "https://qa-scooter.praktikum-services.ru/";

    // Кнопка "Заказать" вверху страницы
    private final By orderTopButton = By.xpath(".//button[@class = 'Button_Button__ra12g']");

    // Кнопка "Заказать" внизу страницы
    private final By orderBottomButton = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");

    // Первый вопрос в списке "Вопросы о важном"
    private final By priceQuestion = By.xpath("//*[@id=\"accordion__heading-0\"]");

    // Первый ответ в списке "Вопросы о важном"
    private final By priceAnswer = By.xpath("//*[@id=\"accordion__panel-0\"]/p");

    // Второй вопрос в списке "Вопросы о важном"
    private final By severalScootersQuestion = By.xpath("//*[@id=\"accordion__heading-1\"]");

    // Второй ответ в списке "Вопросы о важном"
    private final By severalScootersAnswer = By.xpath("//*[@id=\"accordion__panel-1\"]");

    // Третий вопрос в списке "Вопросы о важном"
    private final By rentalTimeQuestion = By.xpath("//*[@id=\"accordion__heading-2\"]");

    // Третий ответ в списке "Вопросы о важном"
    private final By rentalTimeAnswer = By.xpath("//*[@id=\"accordion__panel-2\"]");

    // Четвертый вопрос в списке "Вопросы о важном"
    private final By orderTodayQuestion = By.xpath("//*[@id=\"accordion__heading-3\"]");

    // Четвертый ответ в списке "Вопросы о важном"
    private final By orderTodayAnswer = By.xpath("//*[@id=\"accordion__panel-3\"]");

    // Пятый вопрос в списке "Вопросы о важном"
    private final By extendOrderQuestion = By.xpath("//*[@id=\"accordion__heading-4\"]");

    // Пятый ответ в списке "Вопросы о важном"
    private final By extendOrderAnswer = By.xpath("//*[@id=\"accordion__panel-4\"]");

    // Шестой вопрос в списке "Вопросы о важном"
    private final By chargingWithScooterQuestion = By.xpath("//*[@id=\"accordion__heading-5\"]");

    // Шестой ответ в списке "Вопросы о важном"
    private final By chargingWithScooterAnswer = By.xpath("//*[@id=\"accordion__panel-5\"]");

    // Седьмой вопрос в списке "Вопросы о важном"
    private final By cancelOrderQuestion = By.xpath("//*[@id=\"accordion__heading-6\"]");

    // Седьмой ответ в списке "Вопросы о важном"
    private final By cancelOrderAnswer = By.xpath("//*[@id=\"accordion__panel-6\"]");

    // Восьмой вопрос в списке "Вопросы о важном"
    private final By beyondMKADQuestion = By.xpath("//*[@id=\"accordion__heading-7\"]");

    // Восьмой ответ в списке "Вопросы о важном"
    private final By beyondMKADAnswer = By.xpath("//*[@id=\"accordion__panel-7\"]");

    // Драйвер браузера
    private final RemoteWebDriver driver;

    public MainPage(RemoteWebDriver driver) {
        this.driver = driver;

    }

    public MainPage open() {
        driver.get(url);

        return this;
    }


    public MainPage clickOrderTopButton() {
        driver.findElement(orderTopButton).click();
        return this;
    }


    public MainPage clickOrderBottomButton() {
        // 1800  - примерная позиция кнопки
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1800)");
        driver.findElement(orderBottomButton).click();
        return this;
    }
// Скролл до списка "Вопросы о важном"
    public MainPage scrollUntilFaq() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 2500)");
        return this;
    }

    public MainPage clickPriceQuestion() {
        driver.findElement(priceQuestion).click();
        return this;
    }

    public String getPriceAnswer() {
        return driver.findElement(priceAnswer).getText();
    }

    public MainPage clickSeveralScootersQuestion() {
        driver.findElement(severalScootersQuestion).click();
        return this;
    }

    public String getSeveralScootersAnswer() {
        return driver.findElement(severalScootersAnswer).getText();
    }

    public MainPage clickRentalTimeQuestion() {
        driver.findElement(rentalTimeQuestion).click();
        return this;
    }

    public String getRentalTimeAnswer() {
        return driver.findElement(rentalTimeAnswer).getText();
    }

    public MainPage clickOrderTodayQuestion() {
        driver.findElement(orderTodayQuestion).click();
        return this;
    }

    public String getOrderTodayAnswer() {
        return driver.findElement(orderTodayAnswer).getText();
    }

    public MainPage clickExtendOrderQuestion() {
        driver.findElement(extendOrderQuestion).click();
        return this;
    }

    public String getExtendOrderAnswer() {
        return driver.findElement(extendOrderAnswer).getText();
    }

    public MainPage clickChargingWithScooterQuestion() {
        driver.findElement(chargingWithScooterQuestion).click();
        return this;
    }

    public String getChargingWithScooterAnswer() {
        return driver.findElement(chargingWithScooterAnswer).getText();
    }

    public MainPage clickCancelOrderQuestion() {
        driver.findElement(cancelOrderQuestion).click();
        return this;
    }

    public String getCancelOrderAnswer() {
        return driver.findElement(cancelOrderAnswer).getText();
    }

    public MainPage clickBeyondMKADQuestion() {
        driver.findElement(beyondMKADQuestion).click();
        return this;
    }

    public String getBeyondMKADAnswer() {
        return driver.findElement(beyondMKADAnswer).getText();
    }


}
