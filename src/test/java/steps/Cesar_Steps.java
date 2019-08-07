package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;

public class Cesar_Steps extends BillOfMaterialPage{
    Actions actions = new Actions(Driver.getDriver());
    @Given("User clicks on the Manufacturing Orders link under Reporting")
    public void user_clicks_on_the_Manufacturing_Orders_link_under_Reporting() throws InterruptedException {

        Thread.sleep(3000);
        actions.moveToElement(getReportingManufacturingLink).click().perform();
        getReportingManufacturingLink.click();
    }

    @Given("User clicks on the Advanced Search link on the search bar")
    public void user_clicks_on_the_Advanced_Search_link_on_the_search_bar() throws InterruptedException {

        Thread.sleep(3000);
        actions.moveToElement(getAdvancedSearchButton).click().perform();
    }

    @Given("User clicks on the Group By button")
    public void user_clicks_on_the_Group_By_button() {
        actions.moveToElement(getGroupByButton).click().perform();
    }

    @Given("User clicks on the Routing link in the drop down menu")
    public void user_clicks_on_the_Routing_link_in_the_drop_down_menu() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(getRoutingLink).click().perform();
    }

    @Then("User should see new graph is displayed")
    public void user_should_see_new_graph_is_displayed() {
        Assert.assertTrue(getGraph.isDisplayed());
    }



}
