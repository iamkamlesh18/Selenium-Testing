package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        glue ="com.stepdef",
//        tags = "@positivelogin",
//monochrome = true ,
//dryRun = true
        plugin = {"pretty","html:target/index.html","json:target/myreport.json","rerun:target/failedcasesreport.txt"}
)

public class TestRunner {
}
