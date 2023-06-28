//import org.junit.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Negatyvus testas

public class RegistrationTest_NTC1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://localhost:8080/");

        RegistrationPage myRegisterPage = new RegistrationPage(driver);

        myRegisterPage.clickCreateNewAccountLink();

        myRegisterPage.setUsernameInput("rasa");

        myRegisterPage.setPassword("saule");

        myRegisterPage.setPasswordConfirmation("saule");

        myRegisterPage.clickSubmitButton();

    }

    }
