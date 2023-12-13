package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@US004",
        dryRun = false
)
public class Runner {
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

 */