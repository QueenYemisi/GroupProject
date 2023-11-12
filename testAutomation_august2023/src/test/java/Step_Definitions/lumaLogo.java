package Step_Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class lumaLogo {
    public WebDriver driver;

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        System.setProperty("webdriver.edge.driver", "c://msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://magento.softwaretestingboard.com/");

    }

    @Then("^I should see the application logo$")
    public void i_should_see_the_application_logo() throws Throwable {
        driver.findElement(By.className("logo")).isDisplayed();

        driver.quit();
    }

}
