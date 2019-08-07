package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.Driver;

public class David_Steps extends BillOfMaterialPage{

    @When("User goes to the Bill of Materials and clicks on Import button")
    public void user_goes_to_the_Bill_of_Materials_and_clicks_on_Import_button() throws InterruptedException {
        WebElement manufacturingButton = Driver.getDriver().findElement(By.linkText("Manufacturing"));
        manufacturingButton.click();
        Thread.sleep(3000);
        WebElement BillOfMaterials = Driver.getDriver().findElement(By.linkText("Bills of Materials"));
        BillOfMaterials.click();
        Thread.sleep(3000);
        WebElement InportButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-default o_button_import']"));
        InportButton.click();
    }

    @When("User chooses a file from the file explorer and click open")
    public void user_chooses_a_file_from_the_file_explorer_and_click_open() throws InterruptedException {
        Thread.sleep(2000);
        WebElement LoadFile = Driver.getDriver().findElement(By.xpath("//label[@class='btn btn-primary']"));
        LoadFile.click();
    }

    @When("User clicks cancel button located next to import button")
    public void user_clicks_cancel_button_located_next_to_import_button() {

    }

    @Then("User should be taken back to the initial page.")
    public void user_should_be_taken_back_to_the_initial_page() {

    }

}
