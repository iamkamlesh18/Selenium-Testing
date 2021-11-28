package com.facebook.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = "com.facebook.stepdef",
        plugin = {"pretty"}
)
public class TestRunner {
}
