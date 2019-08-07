package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.BillOfMaterialPage;
import utilities.Driver;

import java.util.List;

public class Gulmira_Steps extends BillOfMaterialPage {
    @When("User clicks on the Product button")
    public void user_clicks_on_the_Product_button() throws InterruptedException {
        Thread.sleep(2000);
        productsButton.click();
    }

    @When("User clicks on the first product")
    public void user_clicks_on_the_first_product() throws InterruptedException {
        Thread.sleep(2000);
        firstProduct.click();
    }

    @When("User clicks on the edit button")
    public void user_clicks_on_the_edit_button() throws InterruptedException {
        Thread.sleep(2000);
        edit.click();
    }

    @When("User clicks on the sales price button and input couple of letters")
    public void user_clicks_on_the_sales_price_button_and_input_couple_of_letters() throws InterruptedException {
        Thread.sleep(3000);
       sales.clear();
       sales.sendKeys("abc" + Keys.ENTER);
    }

    @When("User clicks on save")
    public void user_clicks_on_save() throws InterruptedException {
        Thread.sleep(2000);
        saveButton.click();
    }

    @Then("User should see a red pop-up stating that the input is invalid")
    public void user_should_see_a_red_pop_up_stating_that_the_input_is_invalid() {
        String actualMessage = alertMessageList.getText();
        String expectedMessage = "The following fields are invalid:";
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
   //Second test
   @When("User clicks on the Bill of Material  button")
   public void user_clicks_on_the_Bill_of_Material_button() {
       billOfMaretialsButton.click();
   }

    @When("User clicks on the Import Button")
    public void user_clicks_on_the_Import_Button() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> list = Driver.getDriver().findElements(By.cssSelector(".o_list_buttons button"));
        for (WebElement w: list) {
            if(w.getText().equals("Import")){
                w.click();
                break;
            }
        }
    }

    @When("User clicks on the Load file button")
    public void user_clicks_on_the_Load_file_button() throws InterruptedException {
        Thread.sleep(5000);
         loadFile.click();
    }

    @Then("User should see Bill of Materials displayed and Load file button has to be enabled")
    public void user_should_see_Bill_of_Materials_displayed_and_Load_file_button_has_to_be_enabled() {
        Assert.assertTrue(billsOfMaterials.isDisplayed());
        Assert.assertTrue(loadFileButton.isEnabled());
    }


}
