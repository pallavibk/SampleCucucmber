package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue={"stepDefinition"}
,features={"src/test/resources/TagsExample2.feature"}
//,dryRun=true
//,monochrome=false
//,format={"junit:target/cucumber.xml"}
//,strict=false
//,tags={"@smokeTest"}
)

public class Runner
{
	
}
