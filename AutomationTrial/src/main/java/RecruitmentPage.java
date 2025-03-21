import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RecruitmentPage extends pagebase{
    private WebDriver driver;

    public RecruitmentPage(WebDriver driver){
        this.driver = driver;
    }


    By Recruitment = By.xpath("(//*[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[5]");
    By Addbutton = By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
    By firstname = By.xpath("//*[@class=\"oxd-input oxd-input--active orangehrm-firstname\"]");
    By secondname = By.xpath("//*[@class=\"oxd-input oxd-input--active orangehrm-middlename\"]");
    By lastname = By.xpath("//*[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]");
    By vacancy = By.xpath("//*[@class=\"oxd-select-text-input\"]");
    By Email = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[2]");
    By num = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[2]");
    By save = By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");



    public void clickRecruitment(){
        click(Recruitment);
    }
    public void clickAdd(){
        click(Addbutton);
    }
    public void fillfirstName(String first)
    {
        sendKeys(firstname,first);
    }
    public void fillsecondName(String second)
    {
        sendKeys(secondname,second);
    }
    public void filllastName(String last)
    {
        sendKeys(lastname,last);
    }
    public void fillvacanydropdown(String input)
    {
        Select options = new Select(driver.findElement(vacancy));
        options.selectByVisibleText(input);
    }
    public void fillmail(String mail)
    {
        sendKeys(Email,mail);
    }
    public void fillcontactnumber(String cont)
    {
        sendKeys(num,cont);
    }
    public void clicksave()
    {
        click(save);
    }

}
