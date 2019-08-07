package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.Config;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Aizada_Steps extends BillOfMaterialPage{

    @When("User is on the BriteERP Web Application")
    public void user_is_on_the_BriteERP_Web_Application() {

        Driver.getDriver().get(Config.getProperty("url"));
    }

    @When("User inputs the right credentials for the manager")
    public void user_inputs_the_right_credentials_for_the_manager() throws InterruptedException {

        getUsernameTextField.sendKeys(Config.getProperty("username"));
        getPasswordTextField.sendKeys(Config.getProperty("password"));
        getLoginButton.click();
        Thread.sleep(2000);
        Driver.getDriver().manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);
    }

    @When("User is selecting Manufacturing link in navigation bar")
    public void user_is_selecting_Manufacturing_link_in_navigation_bar() {
        getManufacturingLink.click();
    }

    @Given("User clicks on second ManufacturingOrders link in Manufacturing home page")
    public void user_clicks_on_second_ManufacturingOrders_link_in_Manufacturing_home_page() throws InterruptedException {
        WebElement manufacturingOrderLink = Driver.getDriver().findElement(By.xpath("(//span[@class='oe_menu_text'])[19]"));
        manufacturingOrderLink.click();

        String actualMOLDisplayed = Driver.getDriver().findElement(By.xpath("(//span[@class='oe_menu_text'])[19]")).getText();
        String expectedResult = "Manufacturing Orders";

        Thread.sleep(2000);
        Assert.assertTrue(actualMOLDisplayed.equals(expectedResult));


    }

    @Given("User clicks on plus button")
    public void user_clicks_on_plus_button() throws InterruptedException {
        Thread.sleep(2000);
        WebElement plusButton = Driver.getDriver().findElement(By.xpath("//span[@title='Advanced Search...']"));
        plusButton.click();

        // 4- Checking the plus button is changed to minus
        WebElement advanceSearch = Driver.getDriver().findElement(By.xpath("//span[@title='Advanced Search...']"));
        Assert.assertTrue(advanceSearch.getAttribute("class").contains("minus"));

    }

    @Given("User clicks on Filters button")
    public void user_clicks_on_Filters_button() {
        WebElement filtersButton = Driver.getDriver().findElement(By.xpath("(//button[@aria-expanded='false'])[2]"));
       filtersButton.click();
    }

    @Then("User should be able to see drop-down menu")
    public void user_should_be_able_to_see_drop_down_menu() {
        WebElement filters = Driver.getDriver().findElement(By.xpath("(//button[@aria-expanded='false'])[2]"));
        Assert.assertTrue(filters.getAttribute("class").contains("toggle"));
    }

}
