import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage
{

    private WebDriver driver;
    By UserNameLogin = By.cssSelector("input[name='username']");
    By Loginpassword = By.cssSelector("input[name='password']");
    By loginbutton = By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");



    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void fillUserName(String name){
        driver.findElement(UserNameLogin).sendKeys(name);
    }
    public void fillpassword(String password){

        driver.findElement(Loginpassword).sendKeys(password);
    }

    public void clickbutton(){
        driver.findElement(loginbutton).click();
    }



}
