package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
    }
}
