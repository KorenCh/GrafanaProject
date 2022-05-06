package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

public class DesktopFlows extends CommonOps {

    @Step("Add Flows Of 2 Numbers")
    public static void plusFlow(WebElement elem1, WebElement elem2) {
        UIActions.click(calculatorMain.btn_clear);
        UIActions.click(elem1);
        UIActions.click(calculatorMain.btn_plus);
        UIActions.click(elem2);
        UIActions.click(calculatorMain.btn_equals);
    }
}
