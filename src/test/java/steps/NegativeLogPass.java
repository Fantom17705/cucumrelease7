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
    @And ("^Push button Sign in$")
    public void Push_button_Sign_in() {
        driver.findElement(By.id("SubmitLogin")).click();
    }
    @Then ("^There is 1 error An email address required$")
    public void There_is_1_error_An_email_address_required() {
        String exp_message = "There is 1 error An email address required";
        String actual = driver.findElement(By.className("alert alert-danger")).getText();
        Assert.assertEquals(exp_message, actual);
    }

    @Given("^Clear both forms$")
    public void Clear_both_form() {
        driver.findElement(By.id("^email$")).clear();
        driver.findElement(By.id("^passwd$")).clear();
    }

@And ("^User enters one letter character in both forms$")
    public void User_enters_one_letter_character_in_both_forms() {
        driver.findElement(By.id("email")).sendKeys("a");
        driver.findElement(By.id("passwd")).sendKeys("a");
}
    @And ("^Push button Sign in$")
    public void Push_button_Sign_in() {
        driver.findElement(By.id("SubmitLogin")).click();
    }
    @Then ("^There is 1 error Invalid email address$")
    public void There_is_1_error_Invalid_email_address() {
        String exp_message = "There is 1 error Invalid email address";
        String actual = driver.findElement(By.className("alert alert-danger")).getText();
        Assert.assertEquals(exp_message, actual);
    }

    @Given("^Clear both forms$")
    public void Clear_both_form() {
        driver.findElement(By.id("^email$")).clear();
        driver.findElement(By.id("^passwd$")).clear();
    }
    @And ("^user enters eight digits in both forms$")
    public void user_enters_eight_digits_in_both_forms() {
        driver.findElement(By.id("email")).sendKeys("12345678");
        driver.findElement(By.id("passwd")).sendKeys("12345678");
    }
    @And ("^Push button Sign in$")
    public void Push_button_Sign_in() {
        driver.findElement(By.id("SubmitLogin")).click();
    }
    @Then ("^There is 1 error Invalid email address$")
    public void There_is_1_error_Invalid_email_address() {
        String exp_message = "There is 1 error Invalid email address";
        String actual = driver.findElement(By.className("alert alert-danger")).getText();
        Assert.assertEquals(exp_message, actual);
    }
    @Given("^Clear both forms$")
    public void Clear_both_form() {
        driver.findElement(By.id("^email$")).clear();
        driver.findElement(By.id("^passwd$")).clear();
    }
    @And("^user enters valid uppercase values$")
    public void user_enters_valid_uppercase_values() {
        driver.findElement(By.id("email")).sendKeys("BLOG.CUCUMBER@GMAIL.COM");
        driver.findElement(By.id("passwd")).sendKeys("CUCUMBER@BLOG");
    }
    @And ("^Push button Sign in$")
    public void Push_button_Sign_in() {
        driver.findElement(By.id("SubmitLogin")).click();
    }
}
