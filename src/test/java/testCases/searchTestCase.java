package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SearchTestFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class searchTestCase extends BaseTest {

    @Test
    public void searchTest() {
        SearchTestFunction searchTestFunction = new SearchTestFunction(driver);
        searchTestFunction.searchTest();
    }


}
