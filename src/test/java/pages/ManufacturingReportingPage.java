package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class ManufacturingReportingPage extends ProductsPage{



    public ManufacturingReportingPage()
    {

        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy(css = ".o_searchview_more.fa.fa-search-plus")
    public WebElement getAdvancedSearchButton;

    @FindBy(xpath = "//div[@class = 'btn-group o_search_options']/div[2]/button")
    public WebElement getGroupByButton;

    @FindBy(linkText = "Routing")
    public WebElement getRoutingLink;

    @FindBy(xpath = "//div[@class='o_graph']")
    public WebElement getGraph;




}
