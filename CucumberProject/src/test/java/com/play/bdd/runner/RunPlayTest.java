package com.play.bdd.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.play.bdd.steps",
        features = "src\\main\\java\\Features\\DataTable.feature"
        
)
public class RunPlayTest {

}
