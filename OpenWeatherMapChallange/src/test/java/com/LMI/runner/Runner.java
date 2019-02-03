package com.LMI.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		tags = "@Dover", features = { "src/test/resources/features" }, glue = { "com/LMI/step_definition" }
// dryRun = false
)
public class Runner {
}
