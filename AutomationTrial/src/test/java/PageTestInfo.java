import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTestInfo extends BaseTest {


    MyInfoPage infoo;
    LoginPage loginpage;
    @BeforeMethod
    public void init(){
        loginpage = new LoginPage(driver);
        infoo = new MyInfoPage(driver);

    }
    @Test
    public void testSuccessLogin() throws InterruptedException {
        Thread.sleep(7000);
        loginpage.fillUserName("Admin");
        loginpage.fillpassword("admin123");
        loginpage.clickbutton();
        Thread.sleep(15000);

        infoo.fillEmployeeFullName1("Mohamed");
        infoo.fillEmployeeFullName2("Messi");
        infoo.fillEmployeeFullName3("Moustafa");
        infoo.fillEmployeeid("1234");
        infoo.fillOtherId("44444");
        infoo.fillDriversLicenseNumber("20304736674");
        infoo.filllicenseexpirdate("2027-04-11");
        infoo.fillMaritalStatusmenu("Single");
        infoo.fillNationalitymenu("Egyptian");
        infoo.fillDateofBirth("2007-06-12");
        infoo.clicksave();
    }
}
