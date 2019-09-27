package TestNegLog;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.HelloWorld;

public class NegativeLogPass {

    public static WebDriver driver;
    @Given ("^user goes to the login page$")
    public void user_goes_to_the_login_page () {
    System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication");
    }
    @When ("^ Check display login block$")
    public void  Check_display_login_block() {
WebElement FormLog = driver.findElement(By.xpath("//body[@id='authentication']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[@class='row']/div[2]"));
FormLog.submit();
    }
@When ("^User enters invalid  login and password in form$")
    public void User_enters_invalid_login_and_password_in_form () {
    WebElement email = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("passwd"));
    WebElement SubmitLog = driver.findElement(By.name("SubmitLogin"));
    email.sendKeys("cucumber@gmail.com");
    password.sendKeys("Ccumber@blog");
    SubmitLog.click();
    }
    @And ("^Push button Sign in$")
    public void Push_button_Sign_in() {
        WebElement SignIn = driver.findElement(By.id("SubmitLogin"));
                SignIn.click();
    }
    @Then ("^There is 1 error Authentication failed$")
    public void There_is_1_error_Authentication_failed() {
String exp_message = "There_is_1_error_Authentication_failed";
String actual = driver.findElement(By.className("alert alert-danger")).getText();
        Assert.assertEquals(exp_message, actual);

    }
@Given("^Clear both forms$")
    public void Clear_both_form() {
    WebElement email = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("passwd"));
        email.clear();
        password.clear();
}
@And ("^User does not enter anything$")
    public void User_does_not_enter_anything() {
    WebElement email = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("passwd"));
    email.sendKeys("");
    password.sendKeys("");
}
    @And ("^Push button Sign in$")
    public void Push_button_Sign_in() {
        driver.findElement(By.id("SubmitLogin")).click();
    }
    @Then ("^There is 1 error An email address required$")
    public void There_is_1_error_An_email_address_required() {
        String exp_message = "There is 1 error An email address required";
        String actual = driver.findElement(By.className("alert alert-danger")).getText();
        Assert.assertEquals(exp_message,actual);
    }

    @Given("^Clear both forms$")
    public void Clear_both_form() {
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        email.clear();
        password.clear();
    }

@And ("^User enters one letter character in both forms$")
    public void User_enters_one_letter_character_in_both_forms() {
    WebElement email = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("passwd"));
    email.sendKeys("a");
    password.sendKeys("a");
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
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        email.clear();
        password.clear();
    }
    @And ("^user enters eight digits in both forms$")
    public void user_enters_eight_digits_in_both_forms() {
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        email.sendKeys("12345678");
        password.sendKeys("12345678");
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
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        email.clear();
        password.clear();
    }
    @And("^user enters valid uppercase values$")
    public void user_enters_valid_uppercase_values() {
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        email.sendKeys("BLOG.CUCUMBER@GMAIL.COM");
        password.sendKeys("CUCUMBER@BLOG");
    }
    @And ("^Push button Sign in2$")
    public void Push_button_Sign_in2() {
        WebElement submitLog = driver.findElement(By.id("SubmitLogin"));
        submitLog.click();
        submitLog.isDisplayed(HelloWorld);
        driver.quit();
    }
}
