import org.junit.jupiter.api.Assertions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
// Jeigu ivestas slaptazodis blogas, vartotojas lioeka tame paciame prisijungimo lange
public class LoginTest_NTC2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://localhost:8080/");

        LoginPageP2 myLoginPage = new LoginPageP2(driver);

        String url = driver.getCurrentUrl();

        myLoginPage.setEmail("rasa");
        myLoginPage.setPassword("wrong-password");

        myLoginPage.clickLoginButton();

        assertEquals(url,"http://localhost:8080/" );

    }

    }
