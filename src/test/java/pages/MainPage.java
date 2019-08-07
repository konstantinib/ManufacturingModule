package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class MainPage extends ManufacturingHomePage{


    public MainPage()
    {

        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy(linkText = "Manufacturing")
    public WebElement getManufacturingLink;

    @FindBy(css = ".btn.btn-sm.btn-default.o_import_cancel")
    public WebElement cancelButton;

    @FindBy(css = ".breadcrumb .active")
    public WebElement title;

    @FindBy(css = ".btn.btn-sm.btn-default.o_button_import")
    public WebElement importButton;

}
