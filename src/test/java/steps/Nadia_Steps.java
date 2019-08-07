package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BillOfMaterialPage;
import utilities.Driver;

import java.util.List;

public class Nadia_Steps extends BillOfMaterialPage {
    @When("User clicks on Bill of Materials button")
    public void user_clicks_on_Bill_of_Materials_button() throws InterruptedException {
        Thread.sleep(2000);
        BillOfMaterials.click();
    }

    @When("User clicks on create button")
    public void user_clicks_on_create_button() throws InterruptedException {
        Thread.sleep(2000);
        CreateButton.click();
    }

    @When("User clicks the save button without making any changes")
    public void user_clicks_the_save_button_without_making_any_changes() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> list1 = Driver.getDriver().findElements(By.xpath("//div[@class='o_cp_left']// button"));
        for (WebElement w: list1) {
            if(w.getText().equals("Save")){
                w.click();
                break;
            }

        }
    }

    @Then("User should see a pop up red square and should't be able to save")
    public void user_should_see_a_pop_up_red_square_and_should_t_be_able_to_save() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td[@class='o_td_label']//label)[1]")).getAttribute("class").contains("invalid"));
    }


}
