import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
