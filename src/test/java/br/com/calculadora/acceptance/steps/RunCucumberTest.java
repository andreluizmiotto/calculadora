package br.com.calculadora.acceptance.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/somar.feature"},
        glue = {"br.com.calculadora.acceptance.steps"})
public class RunCucumberTest {
}
