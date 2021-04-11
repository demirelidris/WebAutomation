package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class clearBasketFunction extends BasePage {
    public clearBasketFunction(WebDriver driver) {
        super(driver);
    }

    public void clearBasket() {


        element(By.linkText("Sepetim")).click();
        element(By.className("btn-delete")).click();

        /*
        try {
            Thread.sleep(1000);

            WebElement element2 = driver.findElement(By.linkText("Sepetim"));
            element2.click();
            WebElement element3 = driver.findElement(By.className("btn-delete"));
            element3.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }
}
