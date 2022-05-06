package pageObjects.todo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {
    @FindBy(how = How.CSS, using = "input[placeholder='Create a task']")
    public WebElement txt_createTask;

    @FindBy(how = How.XPATH, using = "//div[@class='wrapper_DtvJU']/div[3]/h2")
    public WebElement txt_body;

    @FindBy(how = How.CSS, using = "svg[class='downArrowIcon_3Zu5N']")
    public WebElement btn_color;

    @FindBy(how = How.CSS, using = "div[class='taskWrapper_2u8dN']")
    public List<WebElement> tasks;

    @FindBy(how = How.CSS, using = "svg[class='destroy_19w1q']")
    public WebElement btn_delete;

    @FindBy(how = How.CSS, using = "span[class='dateFormatted_3GjaR']")
    public WebElement btn_datePicker;

}
