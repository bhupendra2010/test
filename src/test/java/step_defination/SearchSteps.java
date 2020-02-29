package step_defination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;
import pages.Resultpage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class SearchSteps {
    private Homepage homePage = new Homepage();
    private Resultpage resultsPage = new Resultpage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage()  {
        // Write code here that turns the phrase above into concrete actions
        String actual = homePage.getCurrentUrl();
        assertThat(actual, endsWith("co.uk/"));
    }

    @When("^I search for product \"([^\"]*)\"$")
    public void iSearchForProduct(){
        // Write code here that turns the phrase above into concrete actions
        homePage.doSearch("nike");


    }

    @Then("^I should be able to see nike product$")
    public void i_should_be_able_to_see_nike_product() {
        String actaulTitle = resultsPage.getSearchTitle();
        List<String> allProductNames = resultsPage.getAllProductNames();

        assertThat(actaulTitle, is(equalToIgnoringWhiteSpace("nike")));
        for (String item : allProductNames) {
            assertThat(item, containsString("nike"));
        }
    }

}