package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //==> Konsolda senaryolar ile iligli ayrıntılı bilgi verir.
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt" },
        features = "@TestOutput/failed_scenario.txt",
        glue = {"stepDefinitions","hooks"},
        dryRun = false,
        monochrome = false //==> true olunca siyah yazı yazar konsolda.
)
public class FailedRunner {
}

/*
Bu classta sadece fail olan test scenariolarını çalıştıracağız.
Sadece txt dosyasındaki fail olan senaryolar çalıştırılacağı için tag parametresine gerek yoktur.
features yolu da bir dosya olmadığı için başına @ ekledik.

rerun plugini ile fail olan senaryoları belirtmiş olduğumuz (failed_scenario.txt) dosyası içinde tutabiliriz.
 */