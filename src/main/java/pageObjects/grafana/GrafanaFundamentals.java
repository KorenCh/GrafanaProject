package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GrafanaFundamentals {
    @FindBy(how = How.XPATH, using = "//a[@href='http://localhost:3000']")
    public WebElement btn_localHost;

    @FindBy(how = How.ID, using = "grafana-news")
    public WebElement txt_grafanaNews;

}
