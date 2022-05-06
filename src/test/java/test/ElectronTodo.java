package test;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ElectronFlows;

import java.util.concurrent.TimeUnit;

@Listeners(utilities.Listener.class)
public class ElectronTodo extends CommonOps {

    @Test(description = "Test 1 - Add Tasks")
    @Description("Add New Tasks And Verify Created")
    public void test1_addTasks() {
        ElectronFlows.addNewTask("Learn QA");
        ElectronFlows.addNewTask("Learn QA-Automation");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(), 2);

        Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
    }

    @Test(description = "Test 2 - Add Tasks")
    @Description("Add New Tasks And Verify Created")
    public void test2_addTasks() {
        ElectronFlows.selectDate_fromPicker(tododate.btn_nextWeek);
        UIActions.clickAndHover(todoMain.btn_color, btncolor.btn_redColor);
        ElectronFlows.addNewTask("Gym");
        ElectronFlows.addNewTask("Dentist");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(), 2);

        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @Test(description = "Test 3 - Select date")
    @Description("Select Date And Verify Date Changed")
    public void test3_selectDate() {
        ElectronFlows.datePicker("26");
        Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
        ElectronFlows.addNewTask("Restaurant");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(), 1);

        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

}
