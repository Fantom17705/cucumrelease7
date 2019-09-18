package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static WebDriver driver;
    @Given("^user open homepage$")
    public void user_open_homepage () {
        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://automationpractice.com/index.php");
    }
@When("^user navigate to login form$")
    public void user_navigate_to_login_form(){
        driver.findElement(By.linkText("Sign in")).click();
}
@And("^user enter username and password$")
    public void user_enter_username_and_password(){
        driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        driver.findElement(By.name("SubmitLogin")).click();
}
@Then("^Open Account page$")
    public void Open_Account_page(){
String exp_message = "Welcome to your account";
String actual = driver.findElement(By.cssSelector(".info-account")).getText();
    Assert.assertArrayEquals(exp_message,actual);
    driver.quit();
}
}

public class testsearch {
    public static WebDriver driver;
    @Given("^user open homepage$")
    public void user_open_homepage (){
        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://automationpractice.com/index.php");
    }
@When("^user navigate to search form$")
    public void user_navigate_to_search_form (){
      WebElement search_query = driver.findElement(By.id("search_query_top")).sendKeys("t-short");
}
@And("^user enter search query$")
    public void user_enter_search_query(){
        WebElement search_query2 = driver.findElement(By.className("search hide-right-column lang_en")).sendKeys("blouses");

}
@Then("^search result is displayed$")
    public void search_result_is_displayed(){
        String exp_message = "result has been found";
        String actual = driver.findElement(By.className("heading-counter")).getText();
        Assert.assertArrayEquals(exp_message,actual);
        driver.quit();
}
}