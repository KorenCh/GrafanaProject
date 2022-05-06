package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminLinks {
    @FindBy(how = How.XPATH, using = "//ul[@id='react-aria7396964842-23']/li[3]/a")
    public WebElement link_preferences;
}
