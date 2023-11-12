package Step_Definitions;

import Base.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvalidLogin extends TestBase {
    public WebDriver driver;
    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        System.setProperty("webdriver.edge.driver", "c://msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        driver.findElement(By.linkText("Sign In")).click();
    }

    @When("^I type in my \"([^\"]*)\"$")
    public void iTypeInMy(String username) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(username);

    }

    @And("^I send in my \"([^\"]*)\"$")
    public void iSendInMy(String password) throws Throwable {
        driver.findElement(By.name("login[password]")).sendKeys(password);
    }

    @When("^I select the sign in button$")
    public void iSelectTheSignInButton() throws InterruptedException {
        driver.findElement(By.name("send")).click();
        Thread.sleep(5000);
    }

    @Then("^I should get an \"([^\"]*)\"$")
    public void iShouldGetAn(String errorMessage) throws Throwable {
        String ExpectedErrorMessage = errorMessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//div[@data-ui-id='message-error']")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);

    }


}
