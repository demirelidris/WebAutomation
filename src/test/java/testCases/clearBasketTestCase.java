package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.clearBasketFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class clearBasketTestCase extends BaseTest {

    @Test
    public void clearBasket() {

        clearBasketFunction clearbasket = new clearBasketFunction(driver);
        clearbasket.clearBasket();
    }
}
