package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {
    @FindBy(how = How.XPATH, using = "//div[@class='css-1m290ug']/h1")
    public WebElement txt_welcomeGrafana;

    @FindBy(how = How.CLASS_NAME, using = "css-p8muss")
    public List<WebElement> btnList_upRightButtons;

    @FindBy(how = How.CLASS_NAME, using = "css-1rfb2k9")
    public WebElement btn_tutorial;

}
