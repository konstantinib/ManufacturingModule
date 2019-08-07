package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BillOfMaterialPage;

public class Konstantin_Steps  extends BillOfMaterialPage {

    @When("User clicks on Product link under Master Data")
    public void user_clicks_on_Product_link_under() {
        productsLink.click();
    }

    @When("User locates and click on Filters button")
    public void user_locates_and_click_on_button() throws InterruptedException {
        advancedSearchButton.click();
        Thread.sleep(3000);
        filtersLink.click();
    }

    @Then("User should see the dropdown menu displayed")
    public void user_should_see_the_dropdown_menu_displayed() {
        Assert.assertTrue(filtersDropDownMenu.isDisplayed());
    }
}
