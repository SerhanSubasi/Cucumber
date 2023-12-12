package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalPage {

    public BlueRentalPage() { // ilk iş default constructor açmak

        /*
        Bu kod bu classtaki öğeleri driver ile ilişkilendirir.
        Bu sayede classtaki webElementlere erişebilmek için @FindBy gibi PageFactory'e yardımcı olan
        notasyonları kullanılabilir hale getiririz.
         */

            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy (xpath = "//li//a[@role='button']")
        public WebElement loginButton;
        @FindBy (id = "formBasicEmail")
        public WebElement email;
        @FindBy (id = "formBasicPassword")
        public WebElement password;
        @FindBy (id = "dropdown-basic-button")
        public WebElement loginVerify;
        @FindBy (xpath = "//*[contains( text(), 'User with email fake@bluerentalcars.com not found'  )]")
        public WebElement negatifloginVerify;


        @FindBy (xpath = "//*[contains( text(), 'Bad credentials' )]")
        public WebElement negatifloginVerify1;
        @FindBy (xpath = "//*[.=\"email must be a valid email\"]")
        public WebElement negatifEmailVerify;
        @FindBy (xpath = "//select[@name=\"car\"]")
        public WebElement dropDownMenu;
        @FindBy (xpath = "//*[contains(text(),'Please first login')]")
        public WebElement errorMessage;

        @FindBy (xpath = "//*[.=\"Profile\"]")
        public WebElement profile;
        @FindBy (xpath = "//em")
        public WebElement profileEmail;
        @FindBy (xpath = "//*[.=\"Logout\"]")
        public WebElement logoutButton;
        @FindBy (xpath = "//*[.=\"OK\"]")
        public WebElement okButton;

        @FindBy (xpath = "//*[contains(text(),'The car is not avaliable in these days. Please select another one.')]")
        public WebElement errorMessage1;

    }