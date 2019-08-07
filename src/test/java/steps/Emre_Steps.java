package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BillOfMaterialPage;
import utilities.Driver;

import java.util.List;

public class Emre_Steps extends BillOfMaterialPage {
    Actions action = new Actions(Driver.getDriver());
    @When("User scrolls up and down the page")
    public void user_scrolls_up_and_down_the_page() {
        WebElement scrollingDown = Driver.getDriver().findElement(By.xpath("//td[@title='Total Qty']"));

        action.moveToElement(scrollingDown).perform();
    }

    @When("User clicks the Product button")
    public void user_clicks_the_Product_button() throws InterruptedException {
        action.moveToElement(searchButton);
       Thread.sleep(2000);
        productButton.click();
    }

    @When("User enters the product name and the information about the product")
    public void user_enters_the_product_name_and_the_information_about_the_product() throws InterruptedException {
        List<WebElement> allList = Driver.getDriver().findElements(By.xpath("//div[@class='o_kanban_view o_kanban_ungrouped']//strong"));
        for(WebElement w: allList){

            if(w.getText().equals("Book")){
                w.click();
                break;
            }
        }
        Thread.sleep(4000);
        Driver.getDriver().navigate().back();

        Thread.sleep(2000);
        // putting input into searchButton
        searchButton.sendKeys("iphone 8");
        Thread.sleep(2000);
        // deleting input from searchButton
        searchButton.clear();
        Thread.sleep(2000);
        // putting input into searchButton and pressing enter
        searchButton.sendKeys("IPHONE 8" + Keys.ENTER);


    }

    @Then("User should see the result of the product that he she entered")
    public void user_should_see_the_result_of_the_product_that_he_she_entered() throws InterruptedException {
        boolean check = false;
        Thread.sleep(3000);
        List<WebElement> listForInput = Driver.getDriver().findElements(By.xpath("//div[@class='o_kanban_view o_kanban_ungrouped']//strong"));

        for(WebElement w: listForInput){
            if(w.getText().equalsIgnoreCase("iphone 8")){
                check = true;
            }
        }
        Assert.assertTrue(check);
    }

}
