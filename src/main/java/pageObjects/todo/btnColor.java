package pageObjects.todo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class btnColor {
    @FindBy(how = How.XPATH, using = "//div[@class='wrapper_3Kpfj vertical_di1oV tagList_2NRe0']/span[2]")
    public WebElement btn_redColor;

    @FindBy(how = How.XPATH, using = "//div[@class='wrapper_3Kpfj vertical_di1oV tagList_2NRe0']/span[1]")
    public WebElement btn_noColor;
}


