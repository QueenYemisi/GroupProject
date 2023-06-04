package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class admin_pages {

    //Declare your locators here
    @FindBy(how = How.NAME, using = "username")
    public static WebElement UserNameLoginField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public static WebElement LoginButton;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement PasswordLoginField;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Admin']")
    public static WebElement AdminMenuButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/button")
    public static WebElement MenuToggleBtn;

    @FindBy(how = How.XPATH, using = "//h5[text() = 'System Users']")
    public static WebElement SystemUserText;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    public static WebElement UserNameSearchField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    public static WebElement SearchBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")
    public static WebElement UserNameCol;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div")
    public static WebElement UserRoleCol;


    //Declare your methods
    public void enterloginUsername() {
        UserNameLoginField.sendKeys("Admin");

   }
    public void enterloginPassword() {
        PasswordLoginField.sendKeys("admin123");

    }

    public void clickloginBtn() {
        LoginButton.click();

    }

    public void clickAdminMenu() {
        AdminMenuButton.click();

    }
    public void closemenu() {
        MenuToggleBtn.click();

    }

    public void AssertSystemUsersPage() {
        SystemUserText.isDisplayed();

    }

    public void SearchbyUsername() {
        UserNameSearchField.sendKeys("Admin");

    }

    public void clickSearchButton() {
        SearchBtn.click();

    }

    public void AssertSearchresult() {
        String ExpectedReturnedUsername = "Admin";
        String ActualReturnedUsername = UserNameCol.getText();
        Assert.assertEquals(ExpectedReturnedUsername, ActualReturnedUsername);
        System.out.println(ActualReturnedUsername);

        String ExpectedReturnedUserRole = "Admin";
        String ActualReturnedUserRole = UserRoleCol.getText();
        Assert.assertEquals(ExpectedReturnedUserRole, ActualReturnedUserRole);
        System.out.println(ActualReturnedUsername);


    }

}
