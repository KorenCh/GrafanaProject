package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step("Click on element")
    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Click on element")
    public static void clickList(List<WebElement> elem) {
       wait.until(ExpectedConditions.elementToBeClickable((By) elem));
    }

    @Step("doubleClick on element")
    public static void doubleClick(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        action.doubleClick(elem).build().perform();
    }

    @Step("Update text")
    public static void updateText(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Update dropdown")
    public static void updateDropDown(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }

    @Step("Mouse hover 2 Elements")
    public static void mouseHover(WebElement elem1, WebElement elem2) {
        wait.until(ExpectedConditions.visibilityOf(elem2));
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    @Step("Mouse hover 1 Element")
    public static void mouseHover(WebElement elem) {
        action.moveToElement(elem).click().build().perform();
    }

    @Step("Update text element as human")
    public static void delayedUpdateText(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        for (char ch : text.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(250, TimeUnit.MILLISECONDS);
            elem.sendKeys(ch + "");
        }
    }

    @Step("Switch focus to new window")
    public static void switchToWindow() {
        for (String winHandle: driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    @Step("Scroll to element view")
    public static void scrollToElementView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Step("Scroll to element view")
    public static void scrollByPixel() {
        js.executeScript("scrollTo(0, 1000);");
    }

    @Step("Insert key")
    public static void insertKey(WebElement elem, Keys value) {
        elem.sendKeys(value);
    }

    @Step("Select color in Todo")
    public static void clickAndHover(WebElement elem1, WebElement elem2) {
        wait.until(ExpectedConditions.elementToBeClickable(elem1));
        action.click(elem1).moveToElement(elem2).click().build().perform();
    }


    @Step("Click On element In Desktop")
    public static void desktop_Backspace() {
        wait.until(ExpectedConditions.elementToBeClickable(calculatorMain.btn_backspace));
        calculatorMain.btn_backspace.click();
    }

    @Step("Click On element In Desktop")
    public static void desktop_clear() {
        wait.until(ExpectedConditions.elementToBeClickable(calculatorMain.btn_clear));
        calculatorMain.btn_clear.click();
    }

}
