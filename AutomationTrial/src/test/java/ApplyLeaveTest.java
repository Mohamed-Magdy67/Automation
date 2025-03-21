import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApplyLeaveTest extends BaseTest {
    LoginPage loginpage;
    ApplyLeave leav;
    @BeforeMethod
    public void init(){
        loginpage = new LoginPage(driver);
        leav = new ApplyLeave(driver);
    }

    @Test
    public void testSuccessLogin() throws InterruptedException {
        Thread.sleep(7000);
        loginpage.fillUserName("Admin");
        loginpage.fillpassword("admin123");
        loginpage.clickbutton();

        leav.clickLeave();
        leav.clickApply();
    }





}
