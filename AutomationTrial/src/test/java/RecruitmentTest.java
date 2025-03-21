import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecruitmentTest extends BaseTest{

        LoginPage loginpage;
        RecruitmentPage req;

        @BeforeMethod
        public void init(){
            loginpage = new LoginPage(driver);
            req = new RecruitmentPage(driver);
        }

        @Test
        public void testSuccessLogin() throws InterruptedException {
            Thread.sleep(7000);
            loginpage.fillUserName("Admin");
            loginpage.fillpassword("admin123");
            loginpage.clickbutton();
            Thread.sleep(15000);
            req.clickRecruitment();
            req.fillfirstName("Mohamed");
            req.fillsecondName("magdy");
            req.filllastName("moustafa");
            req.fillmail("ss@gmail.com");
            req.fillvacanydropdown("LOC");
            req.fillcontactnumber("01118838384");
            req.clickAdd();
            //Thread.sleep(15000);

        }




}
