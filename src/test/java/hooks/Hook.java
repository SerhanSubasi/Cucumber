package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hook {

    /*
    hooks classı ile scenariolardan önce veya sonra çalışmasını istediğimiz kodları
    io.cucumber.java.Before; VE io.cucumber.java.After; methodları sayesinde yaparız.

    Eğer bir kodu sadece istediğimiz scenariodan önce çalıştırmak istersek, @Before notasyonu parantezi içerisinde tagı belirtiriz.
    Eğer bir kodu sadece istediğimiz scenariodan sonra çalıştırmak istersek, @After notasyonu parantezi içerisinde tagı belirtiriz.
     */

    @Before
    public void setUp() throws Exception {
        System.out.println("Hook classındaki @Before methodu her test scenariosundan önce çalıştırılır");
    }

    @Before("@honda")
    public void setUp2() throws Exception {
        System.out.println("sadece honda tagı olan scenariolardan önce çalıştırılır");
    }

    @After("@toyota")
    public void tearDown2() throws Exception {
        System.out.println("sadece toyota tagı olan scenariolardan sonra çalıştırılır");
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png","scenario" + scenario.getName());

            Driver.closeDriver();
        }



    }

}
