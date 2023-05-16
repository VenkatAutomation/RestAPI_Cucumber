package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile/HttpReq.feature",glue = "stepdefinations",dryRun = false,
	plugin = {"json:target/jsonReports/cucumber-report.json"})
public class API_Req 
{

}
