import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    //Paspausti "sukurti nauja paskyra"
         By clickCreateNewAccountLink = By.cssSelector(".form-signin a");

    //Prisijungimo vardas ivedimas
         By usernameInput = By.id("username");

    //Slaptazodzio ivedimas
         By passwordInput = By.id("password");

    //Slaptazodzio patvirtinimas
        By passwordConfirmationInput = By.id("passwordConfirm");

    //  Mygtuko "Sukurti" paspaudimas
         By submitButton = By.cssSelector("[type='submit']");

    //   Error tuo paciu vardu negali registruotis
         By errorMessage = By.id("username.errors");
    public void clickCreateNewAccountLink() {
        driver.findElement(clickCreateNewAccountLink).click();
    }

    public void setUsernameInput(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void setPasswordConfirmation(String passwordConfirm) {
        driver.findElement(passwordConfirmationInput).sendKeys(passwordConfirm);
    }
    public void clickSubmitButton() {
        driver.findElement(submitButton).click();

    }

}


