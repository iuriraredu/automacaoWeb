package br.com.bootcamp.runTest;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import br.com.bootcamp.settings.BaseTest;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, dryRun = false,
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty","json:target/cucumber.json"},
        features = {"./src/test/resources"},glue = {
        "br.com.bootcamp.web.steps","br.com.bootcamp.settings",
        "br.com.bootcamp.commons",},
        tags = {"@web"})

public class RunTest extends BaseTest {
}
