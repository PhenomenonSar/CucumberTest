package taskCucumber.StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import taskCucumber.Calculator;

public class StepsToCalculate {

    private Calculator calc;
    double a;
    double b;
    double result;

    @Given("^two numbers (\\d+) and (\\d+)$")
    public void two_numbers_and(int arg1, int arg2) throws Throwable {
        this.a=arg1;
        this.b=arg2;
    }

    @When("^we try to find sum of our numbers$")
    public void we_try_to_find_sum_of_our_numbers() throws Throwable {
        this.calc = new Calculator();
        result=calc.sum(a,b);
    }

    @Then("^result should be (\\d+)$")
    public void result_should_be(int arg1) throws Throwable {
        Assert.assertEquals(arg1, result, 0.0001);
    }
}
