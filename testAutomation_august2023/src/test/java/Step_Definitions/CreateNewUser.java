package Step_Definitions;

import Base.TestBase;
import Pages.createNewuser_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUser extends TestBase {

    @When("^I click on the create account link$")
    public void iClickOnTheCreateAccountLink() throws InterruptedException {
        createNewuser_Page page = PageFactory.initElements(driver, Pages.createNewuser_Page.class);
        page.clickCreateAccLink();
        Thread.sleep(3000);
    }

    @And("^I enter all required details$")
    public void iEnterAllRequiredDetails() {
        createNewuser_Page page = PageFactory.initElements(driver, Pages.createNewuser_Page.class);
        page.typeUserFirstname();
        page.typeUserLastname();
        page.typeUserEmail();
        page.typeUserpassw();
        page.confirmNewUserPassword();
    }

    @When("^I click on the create account button$")
    public void iClickOnTheCreateAccountButton() throws InterruptedException {
        createNewuser_Page page = PageFactory.initElements(driver, Pages.createNewuser_Page.class);
        page.clickCreateAccBtn();
        Thread.sleep(3000);
    }
    @Then("^My account should be created successfully$")
    public void myAccountShouldBeCreatedSuccessfully() {
        createNewuser_Page page = PageFactory.initElements(driver, Pages.createNewuser_Page.class);
        page.assertAccIsCreatedSuccessfully();

    }

}
