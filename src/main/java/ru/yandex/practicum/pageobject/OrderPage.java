package ru.yandex.practicum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OrderPage {

    private final By title = By.className("Order_Header__BZXOb");
    private final By nameField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    private final By surNameField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    private final By addressField = By.xpath(".//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    private final By metroField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    private final By metroListField = By.xpath("//div[@class='select-search__select']/ul/li/button/div[2]");
    private final By phoneField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");

    private final By nextButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");


    private final RemoteWebDriver driver;

    public OrderPage(RemoteWebDriver driver) {
        this.driver = driver;

    }

    public OrderPage fillNameField(String text) {

        driver.findElement(nameField).sendKeys(text);
        return this;
    }

    public OrderPage fillSurnameField(String text) {
        driver.findElement(surNameField).sendKeys(text);
        return this;
    }

    public OrderPage fillAddressField(String text) {
        driver.findElement(addressField).sendKeys(text);
        return this;
    }

    public OrderPage fillMetroField(String text) {
        driver.findElement(metroField).click();
        driver.findElement(metroListField).click();
        return this;
    }

    public OrderPage fillPhoneField(String text) {
        driver.findElement(phoneField).sendKeys(text);
        return this;
    }

   public OrderPage clickNextButton() {
       driver.findElement(nextButton).click();

      return this;
   }

}

