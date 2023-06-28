import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageP2 {

    WebDriver driver;

    public LoginPageP2(WebDriver driver) {
        this.driver = driver;
    }

    By emailInput = By.cssSelector(".form-signin [type=\"text\"]");

    By passwordInput = By.cssSelector(".form-signin [type=\"password\"]");

    By loginButton = By.cssSelector(".form-signin [type='submit']");

    By errorMessage = By.id("username.errors");


    public void setEmail(String text) {
        driver.findElement(emailInput).sendKeys(text);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
