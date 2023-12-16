package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RobotPage {

    public RobotPage() {

             PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//*[.='Select PDF files']")
    public WebElement selectButton;

    @FindBy(xpath="//span[.='kurs_baslangc_bitis_program_gorsel.pdf']")
    public WebElement verify;
}
