package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {

    @Step("Flow - login")
    public static void login(String user, String password) {
        UIActions.updateText(grafanalogin.txt_userName, user);
        UIActions.updateText(grafanalogin.txt_password, password);
        UIActions.click(grafanalogin.btn_login);
        UIActions.click(grafanalogin.btn_skip);
    }

    @Step("Flow - create New User")
    public static void createNewUser(String name, String email, String userName, String password) {
        UIActions.click(serverAdminPage.btn_newUser);
        UIActions.updateText(newUserPage.txt_name, name);
        UIActions.updateText(newUserPage.txt_email, email);
        UIActions.updateText(newUserPage.txt_userName, userName);
        UIActions.updateText(newUserPage.txt_password, password);
        UIActions.click(newUserPage.btn_createUser);
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
    }

    @Step("Flow - delete User")
    public static void deleteUser() {
        UIActions.click(serverAdminPage.secondUser);
        UIActions.click(userInformationPage.btn_deleteUser);
        UIActions.click(userInformationPage.btn_confirmDeleteUser);
    }

    @Step("Flow - Search and verify user")
    public static void search_and_verify_user(String user, String existanceOfUser) {
        UIActions.delayedUpdateText(serverAdminPage.txt_searchUser, user);
        if (existanceOfUser.equalsIgnoreCase("exist"))
            Verifications.existance_Of_Element(serverAdminPage.users);
        else if (existanceOfUser.equalsIgnoreCase("not exist"))
            Verifications.element_Should_Not_exist(serverAdminPage.users);
        else
            throw new RuntimeException("Invalid output, should be exist or not");
    }

}
