import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pagebase {
    protected WebDriver driver;

    public void sendKeys(By element, String value){
        driver.findElement(element).sendKeys(value);
    }
}
