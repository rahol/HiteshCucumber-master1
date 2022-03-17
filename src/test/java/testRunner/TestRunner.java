package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//FG396VN//Downloads//HiteshCucumber-master//HiteshCucumber-master//Features",
        glue = "stepDefinitions",
        dryRun = false,
      //  monochrome = true,
        plugin = {"pretty","html:test-output"}
        )
public class TestRunner {
}
