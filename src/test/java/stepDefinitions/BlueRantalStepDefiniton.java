package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;


public class BlueRantalStepDefiniton {

    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Given("kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

    }

    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
    blueRentalPage.loginButton.click();
    }

    @And("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);
    }

    @And("kullanici {string} ve {string} bilgilerini girer")
    public void kullaniciVeBilgileriniGirer(String email, String password) {
        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password, Keys.ENTER);
    }

    @Then("login oldugunu dogrular")
    public void loginOldugunuDogrular() {
        //1 login olduktan sonra button webElementinde login yazısı görünmemeli.
     //  boolean isLoginTrue = ! blueRentalPage.loginVerify.getText().equals("login");
     //  Assert.assertTrue(isLoginTrue);

        //2. Doğrulama şekli
        Assert.assertFalse(blueRentalPage.loginVerify.getText().equals("login"));

    //  //3. Doğrulama şekli
    //  Assert.assertNotEquals("login",blueRentalPage.loginVerify.getText());
    }
}
