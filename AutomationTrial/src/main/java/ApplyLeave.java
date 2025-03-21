import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyLeave extends pagebase{
    By Leavebutton = By.xpath("(//*[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[3]");
    By Applybutton = By.xpath("(//a[@class=\"oxd-topbar-body-nav-tab-item\"])[1]");

    public ApplyLeave(WebDriver driver){
        this.driver = driver;
    }

    public void clickLeave(){
        driver.findElement(Leavebutton).click();
    }
    public void clickApply(){
        driver.findElement(Applybutton).click();
    }


}
