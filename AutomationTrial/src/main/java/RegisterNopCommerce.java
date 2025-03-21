
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterNopCommerce extends pagebase {


    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By emailconfirm = By.id("ConfirmEmail");
    By userName = By.id("Username");


    By password = By.id("Password");
    By confirmpassword = By.id("ConfirmPassword");


    By My_company_primarily = By.id("Details_CompanyIndustryId");
    By My_main_activity_in_the_company_is = By.id("Details_CompanyRoleId");
    By How_many_people_work_for_your_company = By.id("Details_CompanySizeId");

    public void fillfirstName(String first)
    {
        sendKeys(firstName,first);
    }
    public void filllastName(String lastname)
    {
        sendKeys(lastName,lastname);
    }
    public void fillmail(String mail)
    {
        sendKeys(email,mail);
    }
    public void fillconfirmation(String emailconfirm)
    {
        sendKeys(this.emailconfirm,emailconfirm);
    }
    public void fillUserName(String name)
    {
        sendKeys(userName,name);
    }


    public void fillpass(String password)
    {
        sendKeys(this.password,password);
    }
    public void fillpassconfirmation(String passconfirm)
    {
        sendKeys(this.confirmpassword,passconfirm);
    }



    public void filldropdown1(String input)
    {
        Select options = new Select(driver.findElement(My_company_primarily));
        options.selectByVisibleText(input);
    }
    public void filldropdown2(String input)
    {
        Select options = new Select(driver.findElement(My_main_activity_in_the_company_is));
        options.selectByVisibleText(input);
    }
    public void filldropdown3(String input)
    {
        Select options = new Select(driver.findElement(How_many_people_work_for_your_company));
        options.selectByVisibleText(input);
    }


}
