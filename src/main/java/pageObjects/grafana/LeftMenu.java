package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMenu {
    @FindBy(how = How.XPATH, using = "//li[@class='css-16buu1m'][5]")
    public WebElement btn_serverAdmin;

    @FindBy(how = How.XPATH, using = "//nav[@class='css-1kwy7z0 sidemenu']/ul[3]/li/div")
    public WebElement btn_admin;
}
