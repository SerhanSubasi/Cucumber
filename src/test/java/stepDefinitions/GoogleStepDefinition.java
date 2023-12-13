package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepDefinition {
    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }
}
