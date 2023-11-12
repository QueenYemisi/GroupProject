package Step_Definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidLogin {
    public WebDriver driver;
    @When("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        System.setProperty("webdriver.edge.driver", "c://msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        driver.findElement(By.linkText("Sign In")).click();
    }

    @When("^I enter my username$")
    public void iEnterMyUsername() {

        driver.findElement(By.id("email")).sendKeys("olabisibalqees@yahoo.com");
    }

    @And("^I enter my password$")
    public void iEnterMyPassword() {
        driver.findElement(By.name("login[password]")).sendKeys("Testing2023");
    }

    @When("^I click the sign in button$")
    public void iClickTheSignInButton() throws InterruptedException {
        driver.findElement(By.name("send")).click();
        Thread.sleep(5000);
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        String ExpectedLoggedInMessage = "Welcome, balqees salami!";
        String ActualLoggedInMessage = driver.findElement(By.className("logged-in")).getText();
        Assert.assertEquals(ExpectedLoggedInMessage, ActualLoggedInMessage);
        System.out.println(ActualLoggedInMessage);
    }
}
