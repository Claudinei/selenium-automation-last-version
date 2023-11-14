package automacao.selenium.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "pretty", "json:target/json-cucumber-reports/cucumber.json",
                "junit:target/xml-junit/junit.xml"},
        features = "src/test/resources/features",
        glue= {"automacao/selenium/stepDefinition"},
        tags = "@google")

public class TestRunner {}
