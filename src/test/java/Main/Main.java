package Main;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SearchTestFunction;
import testCaseFunction.loginTestFunction;
import testCaseFunction.selectAndAddBasketFunction;
import testCases.clearBasketTestCase;
import testCases.loginTestCase;
import testCases.searchTestCase;
import testCases.selectAndAddBasketTestCase;
import utils.BaseTest;

@Listeners({Listener.class})
public class Main extends BaseTest {

    @Test
    public void Main() {

        new loginTestCase().loginTest();
        new searchTestCase().searchTest();
        new selectAndAddBasketTestCase().selectAndAddBasket();

        //Delete
        //new clearBasketTestCase().clearBasket();




    }
}
