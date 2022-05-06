package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

public class ElectronFlows extends CommonOps {

    @Step("Add new task")
    public static void addNewTask(String taskName) {
        UIActions.updateText(todoMain.txt_createTask, taskName);
        UIActions.insertKey(todoMain.txt_createTask, Keys.ENTER);
    }

    @Step("Count Number of Tasks In List")
    public static int getNumberOfTasks() {
        return todoMain.tasks.size();
    }

    @Step("Delete Tasks")
    public static void deleteTasks() {
        for (int i = 0; i <= getNumberOfTasks(); i++) {
            UIActions.mouseHover(todoMain.btn_delete);
        }
    }

    @Step("Select Date From Date Picker")
    public static void datePicker(String date) {
        UIActions.click(todoMain.btn_datePicker);
        for (WebElement dates : tododate.btn_dateCells) {
            if (dates.getText().equals(date)) {
                dates.click();
                break;
            }
        }
        UIActions.click(todoMain.btn_datePicker);
    }

    @Step("Select Date From Picker")
    public static void selectDate_fromPicker(WebElement elem) {
        UIActions.click(todoMain.btn_datePicker);
        UIActions.click(elem);
        UIActions.click(todoMain.btn_datePicker);
    }

}
