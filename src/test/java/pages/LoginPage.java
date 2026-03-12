package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LogUtility;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="email")
    private WebElement emailElement;

    @FindBy(id="password")
    private WebElement passwordElement;

    @FindBy(className="btnSubmit")
    private WebElement loginButton;

    public void logInProcess(String email, String password){
        emailElement.sendKeys(email);
        LogUtility.infoLog("The user fills email field with " + email + " value");
        passwordElement.sendKeys(password);
        LogUtility.infoLog("The user fills password field with " + password + " value");
        loginButton.click();
        LogUtility.infoLog("The user clicks on login button");
    }
}
