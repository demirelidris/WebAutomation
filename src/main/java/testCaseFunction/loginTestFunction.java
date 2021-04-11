package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class loginTestFunction extends BasePage {

    public loginTestFunction(WebDriver driver) {
        super(driver);
    }

    public static WebDriver driver;
    public void loginTest() {


        element(By.id("L-UserNameField")).sendKeys("idrisdemirel1976");
        element(By.id("L-PasswordField")).sendKeys("ido4088");
        element(By.id("gg-login-enter")).click();

    }
}
