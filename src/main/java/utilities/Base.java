package utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.grafana.*;


public class Base {

    // General

    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static JavascriptExecutor js;
    protected static DesiredCapabilities dc;
    protected static String platform;

    // WEB
    protected static WebDriver driver;


    // Page Objects - Web
    protected static LoginPage grafanalogin;
    protected static MainPage grafanamain;
    protected static LeftMenu leftMenu;
    protected static ServerAdmin serverAdmin;
    protected static ServerAdminPage serverAdminPage;
    protected static NewUserPage newUserPage;
    protected static UserInformationPage userInformationPage;
    protected static GrafanaFundamentals grafanaFundamentals;
    protected static AdminLinks adminLinks;

    // REST API
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject params = new JSONObject();
    protected static JsonPath jp;

    // Page Objects - Electron
    protected static pageObjects.todo.MainPage todoMain;
    protected static pageObjects.todo.btnColor btncolor;
    protected static pageObjects.todo.Date tododate;

    // Page Objects - Desktop
    protected static pageObjects.calculator.MainPage calculatorMain;

}
