package Step_Definitions;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class commonSteps1 extends TestBase {
    //public WebDriver driver;

    @Before
    public void setup() throws IOException {
        initialize();
    }
    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();

    }
}
