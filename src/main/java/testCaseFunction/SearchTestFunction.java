package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchTestFunction extends BasePage {

    public SearchTestFunction(WebDriver driver) {
        super(driver);
    }

    public void searchTest() {
        element(By.name("k")).sendKeys("Bilgisayar");
        element(By.className("sc-1yew439-1")).click();
    }


}
