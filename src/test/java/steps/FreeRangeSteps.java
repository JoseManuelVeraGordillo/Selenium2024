package steps;

import io.cucumber.java.en.*;
//me ahorro imports 
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to www.freerangetester.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to a {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

}
