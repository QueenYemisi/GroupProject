package Step_Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SignInPageELement {
    public WebDriver driver;
    @Given("^I am on the Landing page$")
    public void iAmOnTheLandingPage() {
        System.setProperty("webdriver.edge.driver", "c://msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
    }

    @When("^I click on the sign in link$")
    public void iClickOnTheSignInLink() {
        driver.findElement(By.linkText("Sign In")).click();
    }

    @Then("^I should see username password and login button$")
    public void iShouldSeeUsernamePasswordAndLoginButton() {
        driver.findElement(By.id("email")).isDisplayed();
        driver.findElement(By.name("login[password]")).isDisplayed();
        driver.findElement(By.name("send")).isDisplayed();
    }


}
