
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest_TC2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://localhost:8080/");

        LoginPageP2 myLoginPage = new LoginPageP2(driver);

        myLoginPage.setEmail("rasa");
        myLoginPage.setPassword("saule");

        myLoginPage.clickLoginButton();


    }
}