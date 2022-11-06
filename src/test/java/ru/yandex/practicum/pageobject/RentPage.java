package ru.yandex.practicum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RentPage {
    private final static String ORDERED_TITLE = "Заказ оформлен";

    private final By dateField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/input");
    private final By periodField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div");
    private final By periodFieldDropdown = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div[2]/span");
    private final By periodTwoDays = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]");
    private final By blackCheckBox = By.xpath("//*[@id=\"black\"]");
    private final By commentField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input");

    private final By nextOrderButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    private final By modalWindowYesButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");
    private final By modalWindowOrderedTitle = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]");

    private final RemoteWebDriver driver;

    public RentPage(RemoteWebDriver driver) {
        this.driver = driver;

    }

    public RentPage fillDateField(String text) {

        driver.findElement(dateField).sendKeys(text);
        return this;
    }

    public RentPage fillPeriodField() {
        driver.findElement(periodFieldDropdown).click();
        driver.findElement(periodTwoDays).click();

        return this;
    }

    public RentPage fillColourField() {
        driver.findElement(blackCheckBox).click();
        return this;
    }

    public RentPage fillCommentField(String text) {
        driver.findElement(commentField).sendKeys(text);
        return this;
    }

    public RentPage clickNextOrderButton() {
        driver.findElement(nextOrderButton).click();

        return this;
    }

    public RentPage clickYesButton() {
        driver.findElement(modalWindowYesButton).click();

        return this;
    }

    public boolean isOrdered() {
        String title = driver.findElement(modalWindowOrderedTitle).getText();
        if (title == null) {
            return false;
        }
        return title.contains(ORDERED_TITLE);
    }

}

