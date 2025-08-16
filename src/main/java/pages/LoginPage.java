package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) throws InterruptedException {
        waitForElementVisible(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
        waitForElementVisible(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        waitForElementVisible(loginButton).click();
         
    }
}
