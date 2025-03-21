import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class pagebase {
    protected WebDriver driver;

    public void sendKeys(By element, String value){
        driver.findElement(element).sendKeys(value);
    }

    public void click(By buttontoclick)
    {
        driver.findElement(buttontoclick).click();
    }

    public void menu(By indicator , String input){
        Select options = new Select(driver.findElement(indicator));
        options.selectByVisibleText(input);
    }
}
