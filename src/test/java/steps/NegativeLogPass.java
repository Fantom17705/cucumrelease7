package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeLogPass {

    private static WebDriver driver;
    @Given ("^Open homepage$")
    public void Open_homepage () {
        String s = System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication");
    }
@When ("^User enters navigate login and password in form$")
    public void User_enters_navigate_login_and_password_in_form () {
          driver.findElement(By.id("email")).sendKeys("cucumber@gmail.com");
    driver.findElement(By.id("passwd")).sendKeys("Ccumber@blog");
    }
    @And ("^Push button Sign in$")
    public void Push_button_Sign_in() {
        driver.findElement(By.id("SubmitLogin")).click();
    }
    @Then ("^There is 1 error Authentication failed$")
    public void There_is_1_error_Authentication_failed() {
String exp_message = "There_is_1_error_Authentication_failed";
String actual = driver.findElement(By.className("alert alert-danger")).getText();
        Assert.assertEquals(exp_message, actual);

    }
@Given("^Clear both forms$")
    public void Clear_both_form() {
        driver.findElement(By.id("^email$")).clear();
    driver.findElement(By.id("^passwd$")).clear();

}
@And ("^User does not enter anything$")
    public void User_does_not_enter_anything() {
    driver.findElement(By.id("email")).sendKeys("");
    driver.findElement(By.id("passwd")).sendKeys("");
}

}
