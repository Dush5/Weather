import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/features"},
        glue = {"steps"}
)

public class TestSuiteRunner extends AbstractTestNGCucumberTests {
}
