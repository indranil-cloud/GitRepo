package com.play.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.play.bdd.calculator.Calculator;
import com.play.bdd.calculator.Multiply;

public class PlaySteps {

	private Calculator cal = new Calculator();
	private Multiply mulObj = new Multiply();
	int result;
	@Given("you have a calculator")
	public void you_have_a_calculator() {
	    System.out.println("I have a calculator");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("you add {int} and {int}")
	public void you_add_and(int int1, int int2) {
	    result = mulObj.mul(int1, int2);
	    System.out.println("this line adding to values");
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("result should be {int}") 
	public void result_should_be(int num3) {
		Assert.assertEquals("result validated",num3, result);
	    //throw new io.cucumber.java.PendingException();
		System.out.println("result :" +result);
	}
	
}
