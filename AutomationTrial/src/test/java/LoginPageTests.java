import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    LoginPage loginpage;
    ApplyLeave applyLeave;

    @BeforeMethod
public void init(){
    loginpage = new LoginPage(driver);
    applyLeave = new ApplyLeave(driver);
    }

    @Test
    public void testSuccessLogin() throws InterruptedException {
    Thread.sleep(7000);
    loginpage.fillUserName("Admin");
    loginpage.fillpassword("admin123");
    loginpage.clickbutton();
    Thread.sleep(15000);
    applyLeave.clickLeave();
    Thread.sleep(15000);
    applyLeave.clickApply();
    Thread.sleep(15000);
}




}
