package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        glue ="com.stepdef",
        tags = "@negative",
        monochrome = true ,
//        dryRun = true, // this is like headless browser part
        plugin = {"pretty","html:target/index.html"}
)
public class TestRunner {
}
