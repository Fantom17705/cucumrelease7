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
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class RegistrationForm {
    public static WebDriver driver;
    @Given("^Open home page")
    public void Open_home_page() {
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }
    @When("Navigate to button Sign in")
    public void navigate_to_button_Sign_in() {
        WebElement SignIn = driver.findElement(By.xpath("//a[@class='login']"));
        SignIn.click();
    }

    @Then("Open page authentification")
    public void open_page_authentification() {

    String exp_message = "AUTHENTICATION";
    String actual = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
        assertEquals(exp_message, actual);

    }

    @When("find registration form")
    public void find_registration_form() {
        WebElement RegForm = driver.findElement(By.xpath("//input[@id='email_create']")); // Как написать - подтверждение что данная форма присутствует, понятно что с помощью локатора getClass или что то подобное7
    RegForm.isDisplayed();

    }

    @And("enter email in the input field email")
    public void enter_email_in_the_input_field_email() {
        WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
        email.click();
    }

    @And("press button Create an account")
    public void press_button_Create_an_account() {
      WebElement submit = driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]"));
      submit.click();
    }

    @Then("page will open to create a new account")
    public void page_will_open_to_create_a_new_account() {
        String exp = "CREATE AN ACCOUNT";
        String actual = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
       assertEquals(exp, actual);
    }

    @And("click radio button Mr")
    public void click_radio_button_Mr() {
        WebElement male = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        male.click();
    }

    @And("Enter data in the field First name")
    public void Enter_data_in_the_field_First_name() {
        WebElement name = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        name.sendKeys("Dmitriy");
    }
    @And("Enter value in the field Last name")
    public void Enter_value_in_the_field_Last_name() {
        WebElement Lname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        Lname.sendKeys("Rush");
    }
    @And("Enter data in the field Password")
    public void Enter_data_in_the_field_Password() {
        WebElement passwd = driver.findElement(By.xpath("//input[@id='passwd']"));
        passwd.sendKeys("Dmitriy11705");
    }
    @And("^In form Date of Birth navigate to combo box Days select value$")
    public void In_form_Date_of_Birth_navigate_to_combo_box_Days_select_value() {
        WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
        days.click();
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='days']"))); // Не уверен в правильности
        dropdown.selectByValue("9");
    }
    @And("^In form Date of Birth navigate to combo box Months select value$")
    public void In_form_Date_of_Birth_navigate_to_combo_box_Months_select_value() {
        WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
        month.click();
        Select month = new Select(driver.findElement(By.xpath("//select[@id='months']"))); // Не уверен в правильности
        month.selectByValue("July");
    }
    @And("^In form Date of Birth navigate to combo box Years select value$")
    public void In_form_Date_of_Birth_navigate_to_combo_box_Years_select_value() {
        WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
        years.click();
        Select years = new Select(driver.findElement(By.xpath("//select[@id='years']"))); // Не уверен в правильности
        years.selectByValue("1989");
    }
    @And("^Select check box Sign up for our newsletter$")
    public void Select_check_box_Sign_up_for_our_newsletter() {
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='newsletter']"));
        checkBox.click();
    }
    @And("^Select check box Receive special offers from our partners$")
    public void Select_check_box_Receive_special_offers_from_our_partners() {
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='optin']"));
        checkBox.click();
    }
    @And("In form Company input name company")
    public void In_form_Company_input_name_company() {
        WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys("Rush+");
    }

    @And("In form Address input Address")
    public void in_form_input_Address() {
        WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
        address.sendKeys("New Bentley 1 street");
    }



    @And("In form ZipPostal Code input value")
    public void In_form_ZipPostal_Code_input_value() {
        WebElement code = driver.findElement(By.xpath("//input[@id='postcode']"));
        code.sendKeys("84081");
    }
    @And("In form State in combo box select Utah")
    public void  In_form_State_in_combo_box_select_Utah() {

        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.click();
        Select city = new Select(driver.findElement(By.xpath("//input[@id='city']"))); // Не уверен в правильности
        city.selectByValue("Utah");
    }
    @And("In form Mobile phone input value")
    public void In_form_Mobile_phone_input_value() {
        WebElement mphone = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
        mphone.sendKeys("+610001122171");
    }

    @And("Clear form Assign  alias")
    public void Clear_form_Assign_alias() {
        WebElement alias = driver.findElement(By.xpath("//input[@id='alias']"));
        alias.clear();
    }

    @And("In form Assign an address alias for future reference input name")
    public void In_form_Assign_an_address_alias_for_future_reference_input_name() {
        WebElement inputName = driver.findElement(By.xpath("//input[@id='alias']"));
        inputName.sendKeys("Rush");
    }

    @And("Click button Register")
    public void click_button_Register() {
        WebElement reg = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        reg.click();
    }

    @Then("Open page Mu Account and validation message")
    public void Open_page_Mu_Account_and_validation_message() {
        String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String actual = driver.findElement(By.xpath("//p[@class='info-account']")).getText();
        assertEquals(exp_message, actual);
        driver.quit();
    }

}
