package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class RegistrationForm {
    public static WebDriver driver;
    @Given("^Open home page")
    public void Open_home_page() {
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
    }

}
