package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class createNewuser_Page {
    public int random;
    public WebDriver driver;
    //declare your locators
    @FindBy(how = How.LINK_TEXT, using = "Create an Account")
    public static WebElement homePageCreateAccountLink;
    @FindBy(how = How.ID_OR_NAME, using = "firstname")
    public static WebElement newUserFirstName;

    @FindBy(how = How.ID_OR_NAME, using = "lastname")
    public static WebElement newUserLastName;

    @FindBy(how = How.ID_OR_NAME, using = "email_address")
    public static WebElement newUserEmailAdd;

    @FindBy(how = How.ID_OR_NAME, using = "password")
    public static WebElement newUserPassword;

    @FindBy(how = How.ID_OR_NAME, using = "password-confirmation")
    public static WebElement passwordConfirmation;

    @FindBy(how = How.XPATH, using = "//button[@title='Create an Account']")
    public static WebElement createAccButton;

    @FindBy(how = How.CLASS_NAME, using = "logged-in")
    public static WebElement loggedInNewUser;


    //declare your methods
    public void clickCreateAccLink() {
        homePageCreateAccountLink.click();
    }

    public void typeUserFirstname() {
        newUserFirstName.sendKeys("John");
    }

    public void typeUserLastname() {
        newUserLastName.sendKeys("Kings");
    }

    public void typeUserEmail() {
        random = 100 + (int)(Math.random()*((1000 - 1) + 1));
        newUserEmailAdd.sendKeys("summertester" + random + "@gmail.com");
    }

    public void typeUserpassw() {
        newUserPassword.sendKeys("Testing123");
    }

    public void confirmNewUserPassword() {
        passwordConfirmation.sendKeys("Testing123");
    }

    public void clickCreateAccBtn() {
        createAccButton.click();
    }

    public void assertAccIsCreatedSuccessfully() {
        String ExpectedLoggedInMessage = "Welcome, John Kings!";
        String ActualLoggedInMessage = loggedInNewUser.getText();
        Assert.assertEquals(ExpectedLoggedInMessage, ActualLoggedInMessage);
        System.out.println(ActualLoggedInMessage);
    }

    public void navigate2homePage() {
        System.setProperty("webdriver.edge.driver", "c://msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
    }



}
