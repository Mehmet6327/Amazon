package com.rindus.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/rindus/stepDefinitions",
        dryRun =false,
        tags = "@wip"
)
public class CukesRunner {
    //hi from here
}