package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.selectAndAddBasketFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class selectAndAddBasketTestCase extends BaseTest {

    @Test
    public void selectAndAddBasket() {
        selectAndAddBasketFunction selectandAdd = new selectAndAddBasketFunction(driver);
        selectandAdd.selectAndAddBasket();

    }
}
