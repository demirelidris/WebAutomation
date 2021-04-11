package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class selectAndAddBasketFunction extends BasePage {
    public selectAndAddBasketFunction(WebDriver driver) {
        super(driver);
    }

    public void selectAndAddBasket() {
        //select product


        try {
            element(By.className("img-cont")).click();


        /*
        //add basket
        WebElement element1 = driver.findElement(By.id("add-to-basket"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", element1);
        element1.click();*/
            WebElement element1 = driver.findElement(By.id("add-to-basket"));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", element1);



            Thread.sleep(1000);

            element1.click();

            //Thread.sleep(1000);
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
}
