package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage extends BasePage {
    private By leaveTypeDropdown = By.xpath("//div[@class='oxd-select-text-input']");
    private By fromDate = By.xpath("//label[text()='From Date']/../following-sibling::div//input");
    private By toDate = By.xpath("//label[text()='To Date']/../following-sibling::div//input");
    private By comments = By.xpath("//textarea[contains(@class,'oxd-textarea')]");
    private By applyButton = By.xpath("//button[normalize-space()='Apply']");
    private String pageUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave";

    public LeavePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToPage() {
        driver.get(pageUrl);
        waitForElementVisible(leaveTypeDropdown);
    }

    public void applyLeave(String leaveType, String from, String to, String comment) throws InterruptedException {
        waitForElementVisible(leaveTypeDropdown).click();
        By leaveTypeOption = By.xpath("//div[@role='option']/span[text()='" + leaveType + "']");
        waitForElementVisible(leaveTypeOption).click();
        waitForElementVisible(fromDate).clear();
        driver.findElement(fromDate).sendKeys(from);
        waitForElementVisible(toDate).clear();
        driver.findElement(toDate).sendKeys(to);
        if (comment != null && !comment.isEmpty()) {
            waitForElementVisible(comments).clear();
            driver.findElement(comments).sendKeys(comment);
        }
        waitForElementVisible(applyButton).click();
        
    }
}
