import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyInfoPage extends pagebase {

    public MyInfoPage(WebDriver driver){
        this.driver = driver;
    }

    By Myinfo = By.xpath("(//*[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]");
    By EmployeeFullName1 = By.xpath("//*[@class=\"oxd-input oxd-input--active orangehrm-firstname\"]");
    By EmployeeFullName2 = By.xpath("//*[@class=\"oxd-input oxd-input--active orangehrm-middlename\"]");
    By EmployeeFullName3 = By.xpath("//*[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]");
    By Employeeid = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[2]");
    By OtherId = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[3]");
    By DriversLicenseNumber = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[4]");
    By licenseexpirdate = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[5]");
    By Nationality = By.xpath("(//*[@class=\"oxd-select-text-input\"])[1]");
    By MaritalStatus = By.xpath("(//*[@class=\"oxd-select-text-input\"])[2]");
    By DateofBirth = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[6]");
    By save = By.xpath("(//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"])[1]");

    public void clickMyinfo()
    {
        click(Myinfo);
    }
    public void fillEmployeeFullName1(String first)
    {
        sendKeys(EmployeeFullName1,first);
    }
    public void fillEmployeeFullName2(String second)
    {
        sendKeys(EmployeeFullName2,second);
    }
    public void fillEmployeeFullName3(String third)
    {
        sendKeys(EmployeeFullName3,third);
    }
    public void fillEmployeeid(String id)
    {
        sendKeys(Employeeid,id);
    }
    public void fillOtherId(String id2)
    {
        sendKeys(OtherId,id2);
    }

    public void fillDriversLicenseNumber(String no)
    {
        sendKeys(DriversLicenseNumber,no);
    }
    public void filllicenseexpirdate(String dd)
    {
        sendKeys(licenseexpirdate,dd);

    }
    public void fillMaritalStatusmenu(String stat)
    {
        menu(MaritalStatus,stat);
    }

    public void fillNationalitymenu(String nat)
    {
        menu(Nationality,nat);
    }
    public void fillDateofBirth(String dd2)
    {
        sendKeys(DateofBirth,dd2);

    }
    public void clicksave()
    {
        click(save);
    }

}
