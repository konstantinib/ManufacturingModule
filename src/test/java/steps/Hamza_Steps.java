package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BillOfMaterialPage;

public class Hamza_Steps extends BillOfMaterialPage {
    @When("User is hovering  over Import button with mouse pointer and pressing on Import button")
    public void user_is_hovering_over_Import_button_with_mouse_pointer_and_pressing_on_button() throws InterruptedException {
        importButton.click();
        Thread.sleep(3000);
    }

    @When("User is hovering over Cancel button and pressing Cancel button")
    public void user_is_hovering_over_Cancel_button_and_pressing_Cancel_button() {


      if(cancelButton.getText().equalsIgnoreCase("Cancel")){
          cancelButton.click();
      }
    }

    @Then("User should be redirected back to Manufacturing Orders page")
    public void user_should_be_redirected_back_to_Manufacturing_Orders_page() throws InterruptedException {
        Thread.sleep(4000);
        String titleOfManufacturing = title.getText();
        Assert.assertTrue(titleOfManufacturing.contains("Manufacturing Orders"));
    }
    // test 2

    @When("User goes to Bill of Materials and clicks on Import button")
    public void user_goes_to_Bill_of_Materials_and_clicks_on_Import_button() throws InterruptedException {
       billOfMaretialsButton.click();
        Thread.sleep(3000);
        if(importButton.getText().equalsIgnoreCase("import")){
            importButton.click();
        }
        Thread.sleep(3000);
    }

    @Then("User should be taken to a new page")
    public void user_should_be_taken_to_a_new_page() {
        String billOfMaterialsTitle = title.getText();
        Assert.assertTrue(billOfMaterialsTitle.equals(title.getText()));
    }

}


