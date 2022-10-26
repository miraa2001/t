package hotel.test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="use_cases",
plugin= {"html: target/cucumber.html"},
monochrome=true,
snippets=SnippetType.CAMELCASE,
glue={"hotel.test"})
public class testConnect {

}
