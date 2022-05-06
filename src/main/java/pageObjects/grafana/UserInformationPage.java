package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserInformationPage {
    @FindBy(how = How.XPATH, using = "//div[@class='css-kdj7v3']/button")
    public WebElement btn_deleteUser;

    @FindBy(how = How.CSS, using = "button[aria-label='Confirm Modal Danger Button']")
    public WebElement btn_confirmDeleteUser;
}
