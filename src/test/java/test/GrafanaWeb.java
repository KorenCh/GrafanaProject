package test;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listener.class)
public class GrafanaWeb extends CommonOps {

    @Test(description = "Test 1 - Verify welcome grafana")
    @Description("Login and verify welcome to grafana")
    public void test1_verify() {
        WebFlows.login(getData("userName"), getData("password"));
        Verifications.verifyTextInElement(grafanamain.txt_welcomeGrafana, "Welcome to Grafana");
    }

    @Test(enabled = true, description = "Test 2 - Verify number of users")
    @Description("verify number of users")
    public void test2_serverAdminPage() {
        UIActions.mouseHover(leftMenu.btn_serverAdmin, serverAdmin.link_users);
        Verifications.numberOfElements(serverAdminPage.users, 1);
    }

    @Test(enabled = true, description = "Test 3 - Adding new user")
    @Description("Adding new user and verify number of users")
    public void test3_verifyNewUserCreated() {
        UIActions.mouseHover(leftMenu.btn_serverAdmin, serverAdmin.link_users);
        WebFlows.createNewUser("David", "david@gmail.com", "David", "1111");
        WebFlows.createNewUser("Yon", "yoni@gmail.com", "Yon", "2222");
        Verifications.numberOfElements(serverAdminPage.users, 3);
    }

    @Test(enabled = true, description = "Test 4 - Delete user")
    @Description("Deleting user and verify")
    public void test4_verifyDeleteUser() {
        UIActions.mouseHover(leftMenu.btn_serverAdmin, serverAdmin.link_users);
        WebFlows.deleteUser();
        Verifications.numberOfElements(serverAdminPage.users, 2);
    }

    @Test(enabled = true, description = "Test 5 - Elements displayed")
    @Description("Verify if elements displayed in main page using SoftAssertion")
    public void test5_verifyElementsDisplayed() {
        Verifications.elementsDisplayed(grafanamain.btnList_upRightButtons);
    }

    @Test(enabled = true, description = "Test 6 - Verify Image ")
    @Description("This test verify the image using Sikuli")
    public void test6_verifyImage() {
        Verifications.visualElement("GrafanaSymbolMain");
    }

    @Test(enabled = true, description = "Test 7 - Search user ", dataProvider = "Data provider users", dataProviderClass = utilities.ManageDDT.class)
    @Description("This test search and  verify the existence of user")
    public void test7_searchUser(String user, String shouldExist) {
        UIActions.mouseHover(leftMenu.btn_serverAdmin, serverAdmin.link_users);
        WebFlows.search_and_verify_user(user, shouldExist);
    }

    @Test(enabled = true, description = "Test 8 - Switch focus to new tab")
    @Description("Switch focus to new tab")
    public void test8_switchFocusToTab() {
        UIActions.click(grafanamain.btn_tutorial);
        UIActions.switchToWindow();
        UIActions.scrollToElementView(grafanaFundamentals.txt_grafanaNews);
        Verifications.verifyTextInElement(grafanaFundamentals.txt_grafanaNews, "Grafana News");
        driver.close();
        UIActions.switchToWindow();
    }

}
