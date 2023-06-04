package Step_Definition;

import Base.TestBase;
import Pages.admin_pages;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class commonsteps1 extends TestBase {

    @Before
    public void setup() throws IOException{
        initialize();
    }

    @Given("^I am  on the application home page$")
    public void iAmOnTheApplicationHomePage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @And("^I login$")
    public void iLogin() throws InterruptedException {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.enterloginUsername();
        page.enterloginPassword();
        page.clickloginBtn();
        Thread.sleep(3000);

    }
}
