package test;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlows;

@Listeners(utilities.Listener.class)
public class DesktopCalc extends CommonOps {

    @Test(description = "Test1 - Add 2 Numbers")
    @Description("Add 2 Numbers And Verify Result Is Correct")
    public void test1_add() {
        DesktopFlows.plusFlow(calculatorMain.btn_five, calculatorMain.btn_three);
        Verifications.verifyTextIn_DesktopElement(calculatorMain.field_result, "8");
    }

    @Test(description = "Test2 - Check Backspace Button")
    @Description("Check Backspace Button Works Properly And Verify Result")
    public void test2_BackspaceButton() {
        UIActions.click(calculatorMain.btn_five);
        UIActions.click(calculatorMain.btn_five);
        UIActions.click(calculatorMain.btn_five);
        UIActions.desktop_Backspace();
        Verifications.verifyTextIn_DesktopElement(calculatorMain.field_result, "55");
    }

    @Test(description = "Test3 - Check Backspace Button")
    @Description("Check Backspace Button Works Properly ")
    public void test1_ClearButton() {
        DesktopFlows.plusFlow(calculatorMain.btn_five, calculatorMain.btn_three);
        UIActions.desktop_clear();
        Verifications.verifyTextIn_DesktopElement(calculatorMain.field_result, "0");
    }


}
