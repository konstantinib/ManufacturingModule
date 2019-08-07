package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class ManufacturingHomePage extends ManufacturingReportingPage{


    public ManufacturingHomePage()
    {

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div[@class = 'o_sub_menu_content']/div[6]/ul[3]/li/a")
    public WebElement getReportingManufacturingLink;

    @FindBy(xpath = "//a[@data-menu='437']/span")
    public WebElement productsLink;

    @FindBy(xpath = "//span[.='ManufacturingManager']")
    public WebElement UserText;

    @FindBy(className = "oe_topbar_name")
    public WebElement userTitle;


}
