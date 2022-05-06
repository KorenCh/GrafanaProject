package pageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class MainPage extends CommonOps {
    @FindBy(how = How.NAME, using = "Three")
    public WebElement btn_three;

    @FindBy(how = How.NAME, using = "Five")
    public WebElement btn_five;

    @FindBy(how = How.NAME, using = "Plus")
    public WebElement btn_plus;

    @FindBy(how = How.NAME, using = "Equals")
    public WebElement btn_equals;

    @FindBy(how = How.NAME, using = "Clear")
    public WebElement btn_clear;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement field_result;

    @FindBy(how = How.NAME, using = "Backspace")
    public WebElement btn_backspace;
}
