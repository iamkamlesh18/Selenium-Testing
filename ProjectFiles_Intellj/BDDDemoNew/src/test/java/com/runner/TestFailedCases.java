package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/failedcasesreport.txt",
        glue ="com.stepdef",
//      tags = "@positivelogin",
        monochrome = true ,
//        dryRun = true, // this is like headless browser part
        plugin = {"pretty"}
)

public class TestFailedCases {
}
