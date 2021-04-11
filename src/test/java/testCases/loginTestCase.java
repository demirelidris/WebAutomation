package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SearchTestFunction;
import testCaseFunction.clearBasketFunction;
import testCaseFunction.loginTestFunction;
import testCaseFunction.selectAndAddBasketFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class loginTestCase extends BaseTest {

    @Test
    public void loginTest()  {
        loginTestFunction loginTest = new loginTestFunction(driver);
        loginTest.loginTest();

    }
}
