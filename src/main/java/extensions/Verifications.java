package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    @Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expectedText) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expectedText);
    }

    @Step("Verify number Of Elements")
    public static void numberOfElements(List<WebElement> elements, int number) {
        wait.until(ExpectedConditions.visibilityOf(elements.get(elements.size()-1)));
        assertEquals(elements.size(), number);
    }

    @Step("Verify elements Displayed (SoftAssert)")
    public static void elementsDisplayed(List<WebElement> elements) {
        for(WebElement element : elements) {
            softAssert.assertTrue(element.isDisplayed(), element.getText() + " Is not displayed");
        }
        softAssert.assertAll("Some elements are not displayed");
    }

    @Step("Verify Element Visually sikuli")
    public static void visualElement(String expectedImageName) {
        try
        {
            screen.find(getData("ImageRepo") + expectedImageName + ".png");
        }
        catch (FindFailed e)
        {
            System.out.println("Error Comparing Image File " + e);
            fail("Error Comparing Image File " + e);
        }
    }

    @Step("Verify element exist")
    public static void existance_Of_Element(List<WebElement> elements) {
        assertTrue(elements.size() > 0);
    }

    @Step("Verify element not exist")
    public static void element_Should_Not_exist(List<WebElement> elements) {
        assertFalse(elements.size() > 0);
    }

    @Step("Verify values are equals")
    public static void verifyText(String actual, String expected) {
        assertEquals(actual, expected);
    }

    @Step("Verify values are equals")
    public static void verifyNumber(int actual, int expected) {
        assertEquals(actual, expected);
    }

    @Step("Verify Text In Element")
    public static void verifyTextIn_DesktopElement(WebElement elem, String expectedText) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), "Display is " + expectedText);
    }

}
