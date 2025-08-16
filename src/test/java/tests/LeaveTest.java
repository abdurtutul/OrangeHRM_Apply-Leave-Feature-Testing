package tests;

import org.testng.annotations.Test;
import pages.LeavePage;
import pages.LoginPage;

public class LeaveTest extends BaseTest {

    @Test
    public void testApplyLeave() throws InterruptedException {
        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
        // Leave application
        LeavePage leavePage = new LeavePage(driver);
        leavePage.navigateToPage();
        leavePage.applyLeave("CAN - Vacation", "2025-08-20", "2025-08-22", "Apply for Leave");
    }
}
