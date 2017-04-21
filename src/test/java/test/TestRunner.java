package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(format = { "pretty", "json:target/cucumber.json" },features="src/test/resources/features/",glue="test.steps",tags="@Reg8")


public class TestRunner {

}
