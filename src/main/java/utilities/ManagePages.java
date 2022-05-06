package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {

    public static void initGrafana() {

        grafanalogin = PageFactory.initElements(driver, pageObjects.grafana.LoginPage.class);
        grafanamain = PageFactory.initElements(driver, pageObjects.grafana.MainPage.class);
        leftMenu = PageFactory.initElements(driver, pageObjects.grafana.LeftMenu.class);
        serverAdmin = PageFactory.initElements(driver, pageObjects.grafana.ServerAdmin.class);
        serverAdminPage = PageFactory.initElements(driver, pageObjects.grafana.ServerAdminPage.class);
        newUserPage = PageFactory.initElements(driver, pageObjects.grafana.NewUserPage.class);
        userInformationPage = PageFactory.initElements(driver, pageObjects.grafana.UserInformationPage.class);
        grafanaFundamentals = PageFactory.initElements(driver, pageObjects.grafana.GrafanaFundamentals.class);
        adminLinks = PageFactory.initElements(driver, pageObjects.grafana.AdminLinks.class);

    }

    /*public static void initMortgage() {
        mortgageMain = new pageObjects.mortgage.MainPage(mobileDriver);
    }*/

    public static void initTodo() {
        todoMain = PageFactory.initElements(driver, pageObjects.todo.MainPage.class);
        btncolor = PageFactory.initElements(driver, pageObjects.todo.btnColor.class);
        tododate = PageFactory.initElements(driver, pageObjects.todo.Date.class);
    }

    public static void initCalc() {
        calculatorMain = PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);
    }

}
