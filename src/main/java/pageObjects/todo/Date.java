package pageObjects.todo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Date {
    @FindBy(how = How.XPATH, using = "//div[@class='shortcuts_1cGYO']/button[3]")
    public WebElement btn_nextWeek;

    @FindBy(how = How.CSS, using = "span[class='text_1GSPD']")
    public List<WebElement> btn_dateCells;
}
