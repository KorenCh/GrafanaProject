package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminPage {
    @FindBy(how = How.XPATH, using = "//table[@class='filter-table form-inline filter-table--hover']/tbody/tr")
    public List<WebElement> users;

    @FindBy(how = How.CLASS_NAME, using = "css-1e07s1o-button")
    public WebElement btn_newUser;

    @FindBy(how = How.XPATH, using = "//table[@class='filter-table form-inline filter-table--hover']/tbody/tr[2]/td[2]")
    public WebElement secondUser;

    @FindBy(how = How.CLASS_NAME, using = "css-1haxx2a-input-input")
    public WebElement txt_searchUser;
}
