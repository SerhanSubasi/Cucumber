package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //==> Konsolda senaryolar ile iligli ayrıntılı bilgi verir.
                "html:target/default-cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml",
                "rerun:TestOutput/failed_scenario.txt" },
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@US001",
        dryRun = false,
        monochrome = false //==> true olunca siyah yazı yazar konsolda.
)
public class ParallelRunner1 {
}

/*
Runner classın bodysi içinde bir şey yazılmaz.
Runner classında önemli olan iki notasyon vardır;
 1) @RunWith ==> Runner classımıza çalışma özelliği getirdi
 2)@CucumberOptions ==> parantezi içinde hangi testleri çalıştıracağımızı,
  hangi raporları alacağımızı, feature ve glue parametreleri ile bu dosyaların pathlerini
  gibi test ayrıntılarını tanımlarız ve bazı pluginler ekleyebiliriz.

   dryRun = true ise feature filedaki test senaryolarını çalıştırmadan
   eksik step definition olup olmadığını kontrol eder, browserı çalıştırmaz.

rerun plugini ile fail olan senaryoları belirtmiş olduğumuz (failed_scenario.txt) dosyası içinde tutabiliriz.
 */