package com.testinium.methods;

import com.testinium.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Random;

public class Methods {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;
    FluentWait<WebDriver> fluentWait;

    public Methods() {
        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
        fluentWait = setFluentWait(30);
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void scrollWithJavaScript(By by) {
        jsdriver.executeScript("arguments[0].scrollIntoView();", findElement(by));
    }

    public Select getSelect(By by) {
        return new Select(findElement(by));
    }

    public void selectByText(By by, String text) {
        getSelect(by).selectByVisibleText(text);
    }

    public int randomNumber(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public WebElement randomElement(By by) {
        List<WebElement> elementList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return elementList.get(randomNumber(elementList.size()));
    }

    public String getAttribute(By by, String attributeName) {
        return findElement(by).getAttribute(attributeName);
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public String getValue(By by) {
        return jsdriver.executeScript("return arguments[0].value",
                        findElement(by))
                .toString();

    }

    public FluentWait<WebDriver> setFluentWait(long timeout) {
        return new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(NoSuchElementException.class);
    }

    public WebElement findElementWait(By by) {
        return fluentWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void hoverElement(By by) {
        WebElement webElement = findElementWait(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).build().perform();
        //logger.info(by.toString() + "elementine hover islemi yapıldı ");

    }
}

